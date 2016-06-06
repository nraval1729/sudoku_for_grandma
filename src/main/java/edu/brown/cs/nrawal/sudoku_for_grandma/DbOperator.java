package edu.brown.cs.nrawal.sudoku_for_grandma;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperator {
	private static File db;
	private static Connection conn;
	
	public DbOperator(File Db) {
		this.db = Db;
	}
	
	public void establishConnectionWithDb() throws ClassNotFoundException,
	      SQLException {
	    Class.forName("org.sqlite.JDBC");
	    conn = DriverManager.getConnection("jdbc:sqlite:" + db);
	    Statement stat = conn.createStatement();
	    stat.executeUpdate("PRAGMA foreign_keys = ON;");
	}
	
//	public static String getEasyRandomPuzzle() {
//		String query = "SELECT * FROM easy ORDER BY RANDOM() LIMIT 1;";
//		String easyRandomPuzzle = null;
//		try(PreparedStatement prep = conn.prepareStatement(query)) {
//			try(ResultSet rs = prep.executeQuery()) {
//				easyRandomPuzzle = rs.getString(1);
//			}
//		} catch (SQLException e) {
//			System.out.println("Shit: " +e.getMessage());
//			e.printStackTrace();
//			System.exit(0);
//		}
//		
//		return easyRandomPuzzle;
//	}

	public String getPuzzleString(String level) {
		String query = "SELECT * FROM " +level +"_puzzles" +" ORDER BY RANDOM() LIMIT 1;";
		String puzzleString = null;
		try(PreparedStatement prep = conn.prepareStatement(query)) {
			try(ResultSet rs = prep.executeQuery()) {
				puzzleString = rs.getString(1);
			}
		} catch (SQLException e) {
			System.out.println("Shit: " +e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
		
		return puzzleString;
	}
}
