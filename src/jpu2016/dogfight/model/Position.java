package jpu2016.dogfight.model;

public class Position {

	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	
	public Position(double x, double y, double maxX, double maxY) {
		/*
		 * 
		 */
	}
	
	public Position(Position position) {
		/*
		 * 
		 */
	}
	
	public double getX() {
		return this.x;
	}
	
	public void setX(double x) {
		x = this.x % maxX;
	}
	
	public double getY() {
		return this.y;
		
	}
	
	public void setY(double y) {
		y = this.y % maxY;
	}
	
	protected void setMaxX(double maxX) {
		maxX = this.maxX;
	}
	
	protected void setMaxY(double maxY) {
		
		maxY = this.maxY;
	}
	
	
	
}
