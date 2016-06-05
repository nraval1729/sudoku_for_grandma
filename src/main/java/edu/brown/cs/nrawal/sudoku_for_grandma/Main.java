package edu.brown.cs.nrawal.sudoku_for_grandma;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Spark;
import spark.TemplateViewRoute;
import spark.template.freemarker.FreeMarkerEngine;

public final class Main {

	
	private final int portNum = 1234;
	private String[] args;
	
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

	private void run() {
		runSparkServer();	
	}

	private void runSparkServer() {
//		System.out.println("Spark server is running");
		Spark.setPort(portNum);	
		Spark.externalStaticFileLocation("src/main/resources/static");
		
		Spark.get("/sudoku", new SudokuHandler(), new FreeMarkerEngine());
	}
	
	private static class SudokuHandler implements TemplateViewRoute {

		@Override
		public ModelAndView handle(Request reqest, Response response) {
			Map<String, Object> variables = ImmutableMap.of("title", "Let's play Sudoku!");
			return new ModelAndView(variables, "main.ftl");
		}
		
	}
}
