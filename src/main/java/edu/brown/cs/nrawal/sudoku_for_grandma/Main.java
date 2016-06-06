package edu.brown.cs.nrawal.sudoku_for_grandma;

import java.io.File;
import java.sql.SQLException;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;

import spark.ModelAndView;
import spark.QueryParamsMap;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import spark.TemplateViewRoute;
import spark.template.freemarker.FreeMarkerEngine;

public final class Main {

	
	private final int portNum = 8080;
	private String[] args;
	private static final Gson GSON = new Gson();
	private static DbOperator dbo = new DbOperator(new File("puzzles.sqlite3"));
	
	private Main(String[] args) {
		this.args = args;
	}

	public static void main(String[] args) {
		try {
			new Main(args).run();
		}
		catch(Exception e) {
			System.out.println("Exception occured!");
			e.printStackTrace();
			System.exit(0);
		}
	}

	private void run() throws ClassNotFoundException, SQLException {
		dbo.establishConnectionWithDb();
		runSparkServer();	
	}

	private void runSparkServer() {
//		System.out.println("Spark server is running");
		Spark.setPort(portNum);	
		Spark.externalStaticFileLocation("src/main/resources/static");
		
		Spark.get("/sudoku", new SudokuHandler(), new FreeMarkerEngine());
		Spark.post("/puzzle", new PuzzleHandler());
//		Spark.get("/easy", new EasyHandler(), new FreeMarkerEngine());
//		Spark.get("/medium", new MediumHandler(), new FreeMarkerEngine());
//		Spark.get("/hard", new HardHandler(), new FreeMarkerEngine());
//		Spark.get("/insane", new InsaneHandler(), new FreeMarkerEngine());
//		Spark.get("/random", new RandomHandler(), new FreeMarkerEngine());
	}
	
	private static class SudokuHandler implements TemplateViewRoute {

		@Override
		public ModelAndView handle(Request reqest, Response response) {
			Map<String, Object> variables = ImmutableMap.of("title", "Let's play Sudoku!");
			return new ModelAndView(variables, "main.ftl");
		}
		
	}
	
	private static class PuzzleHandler implements Route {

		@Override
		public Object handle(Request request, Response response) {
			
			String level, puzzleString = null;
			QueryParamsMap qpm = request.queryMap();
			
			level = GSON.fromJson(qpm.value("level"), String.class);
			System.out.println("This is the fucking level!" +level);
			
			puzzleString = dbo.getPuzzleString(level);
			
			System.out.println("Puzzle String: " +puzzleString);
			Map<String, Object> variables = ImmutableMap.of("puzzleString", puzzleString);
			return GSON.toJson(variables);		
		}
	}
}
