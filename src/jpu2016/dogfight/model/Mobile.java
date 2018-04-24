package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import jpu2016.dogfight.model.*;

public class Mobile {

	private int speed;
	private Point position;
	private Position position1;
	
	
	public Mobile() {
		
	}
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.setDirection(direction);
		this.setSpeed(speed);
		this.position = new Point();
		
	}
	
	
	
	
	
	public Direction getDirection() {
		return null;
	}
	
	public void setDirection(Direction direction) {
		/*
		 * 
		 */
	}
	
	public Point getPosition() {
		return this.position;
	}
	
	public Position getPosition1() {
		return this.position1;
	}
	
	
	
	
	public Dimension getDimension() {
		return null;
		
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
		Position.Position(position);
	}
	
	public boolean isPlayer(int player) {
		return true;
	}
	
	private void moveUp() {
		this.setPosition(this.getPosition() - 1)
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
