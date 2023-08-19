package com.loiane.curso_java.aula_72;

public class Test {

	public static void main(String[] args) {
		TicTac tt = new TicTac();
		TicTacThread tic = new TicTacThread("Tic", tt);
		TicTacThread tac = new TicTacThread("Tac", tt);
		
		try {
			tic.t.join();
			tac.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
