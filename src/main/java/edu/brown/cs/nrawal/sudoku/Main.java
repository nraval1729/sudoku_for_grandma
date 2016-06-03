package edu.brown.cs.nrawal.sudoku;

public final class Main {
	public Main(String[] args) {
		// TODO Auto-generated constructor stub
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
		System.out.println("Hello World!");
		
	}
}
