package jpu2016.dogfight.model;

import java.awt.Point;

public class Position {

	private double x;
	private double y;
	private double maxX;
	private double maxY;
	
	
	
	
	public Position(double x, double y, double maxX, double maxY) {
		this.setX(x);
		this.setY(y);
		this.setMaxX(maxX);
		this.setMaxY(maxY);
	}
	
	public Position(Position position) {
		Mobile.setPosition(position);
		
	
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
