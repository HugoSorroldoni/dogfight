package jpu2016.dogfight.model;

public class Missile extends Mobile {

	public Missile(Direction direction, Position position, Dimension dimension, int speed, String Image) {
		super(direction, position, dimension, speed, Image);
	
	}

	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	
	
	
	
	public Missile(Direction direction, Dimension dimension) {
		/*
		 * 
		 */
	
	}
	
	public static int getWidthWithADirection(Direction direction) {
		return 1;
	}
	
	public static int getHeightWithADirection(Direction direction) {
		return 1;
	}
	
	public void move() {
		/*
		 * 
		 */
	}
	
	public boolean isWeapon() {
		return true;
	}

	public static int getSPEED() {
		return SPEED;
	}

	public static void setSPEED(int sPEED) {
		SPEED = sPEED;
	}

	public static int getWIDTH() {
		return WIDTH;
	}

	public static void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}

	public static int getHEIGHT() {
		return HEIGHT;
	}

	public static void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}

	public static int getMAX_DISTANCE_TRAVELED() {
		return MAX_DISTANCE_TRAVELED;
	}

	public static void setMAX_DISTANCE_TRAVELED(int mAX_DISTANCE_TRAVELED) {
		MAX_DISTANCE_TRAVELED = mAX_DISTANCE_TRAVELED;
	}

	public static String getIMAGE() {
		return IMAGE;
	}

	public static void setIMAGE(String iMAGE) {
		IMAGE = iMAGE;
	}

	public int getDistanceTraveled() {
		return distanceTraveled;
	}

	public void setDistanceTraveled(int distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}
	
	
	
}
