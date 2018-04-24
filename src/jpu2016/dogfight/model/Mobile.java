package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile {

	private int speed;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String Image) {
		/*
		 * 
		 */	
	}
	
	public Direction getDirection() {
		/* a modif */
		return null;
	}
	
	public void setDirection(Direction direction) {
		/*
		 * 
		 */
	}
	
	public Point getPosition() {
		return null;
		/* a modif */
	}
	
	public Dimension getDimension() {
		return null;
		/* a modif */
	}
	
	public int getSpeed() {
		return 1;
	}
	
	public int getWidth() {
		return 1;
	}
	
	public int Height() {
		return 1;
	}
	
	public void move() {
		/*
		 * 
		 */
	}
	
	public void placeInArea(IArea area) {
		/*
		 * 
		 */
	}
	
	public boolean isPlayer(int player) {
		return true;
	}
	
	private void moveUp() {
		/*
		 * 
		 */
	}
	
	private void moveRight() {
		/*
		 * 
		 */
	}
	
	private void moveDown() {
		/*
		 * 
		 */
	}
	
	private void moveLeft() {
		/*
		 * 
		 */
	}
	
	public Color getColor() {
		return null;
		/* a modif */
	}
	
	public IDogfightModel getDogfightModel() {
		return null;
		/* a modif */
	}
	
	public void setDogfightModel(IDogfightModel dogfightModel) {
		/*
		 * 
		 */
	}
	
	public boolean hit() {
		return true;
	}
	
	public boolean isWeapon() {
		return true;
	}
	
	public Image getImage() {
		return null;
		/* a modif */
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpedd() {
		return 1;
	}
	
	
}
