package com.loiane.curso_java.aula_46_exercises;

public class Square extends Figure2D implements SurfaceDimension {
	private double side;
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return this.side;
	}
	
	public double calculateArea() {
		return Math.pow(this.side, 2);
	}
}
