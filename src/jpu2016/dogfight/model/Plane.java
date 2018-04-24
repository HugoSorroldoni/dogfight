package jpu2016.dogfight.model;

public class Plane extends Mobile{

	public Plane(Direction direction, Position position, Dimension dimension, int speed, String Image) {
		super(direction, position, dimension, speed, Image);
		
	}

	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;
	
	public Plane(int player, Direction direction, Position position, String image) {
		/*
		 * 
		 */
	}
	
	public boolean isPlayer(int player) {
		return true;
	}
	
	public boolean hit() {
		return true;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public static int getHEIGHT() {
		return HEIGHT;
	}

	public static void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}

	public static int getWIDTH() {
		return WIDTH;
	}

	public static void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}

	public static int getSPEED() {
		return SPEED;
	}

	public static void setSPEED(int sPEED) {
		SPEED = sPEED;
	}
	
	
	
	
	
}
