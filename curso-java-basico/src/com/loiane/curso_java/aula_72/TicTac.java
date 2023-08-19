package com.loiane.curso_java.aula_72;

public class TicTac {
	boolean tic;
	
	synchronized void tic(boolean isExecuting) {
		if (!isExecuting) {
			tic = true;
			notify();
			return;
		}
		
		System.out.println ("Tic");
		
		tic = true;
		notify();
		
		try {
			while (tic) {
				wait();
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void tac(boolean isExecuting) {
		if (!isExecuting) {
			tic = false;
			notify();
			return;
		}
		
		System.out.println ("Tac");
		
		tic = false;
		notify();
		
		try {
			while (!tic) {
				wait();
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
