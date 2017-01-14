package org.usfirst.frc.team1024.Pixy;

public class PixyObject {
	int x;
	int y;
	int height;
	int width;
	int checksum;
	int signature;
	byte[] rawData = null;
	
	public PixyObject(byte[] rawData){
		this.rawData = rawData;
		parse();
	}
	
	public boolean isValid() {
		return checksum == (x + y + height + width + signature); 
	}
	
	public String toString() {
	  return String.format("x:%1$d y:%2$d height:%3$d width:%4$d signature:%5$d", x, y, height, width, signature);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	private void parse() {
		this.checksum = doubleByteToInt(rawData[3], rawData[2]);
		this.signature = doubleByteToInt(rawData[5], rawData[4]);
		this.x = doubleByteToInt(rawData[7], rawData[6]);
		this.y = doubleByteToInt(rawData[9], rawData[8]);
		this.width = doubleByteToInt(rawData[11], rawData[10]);
		this.height = doubleByteToInt(rawData[13], rawData[12]);
	}
	
	private int doubleByteToInt(byte upper, byte lower) {
		return (((int)upper & 0xff) << 8) | ((int)lower & 0xff);
	}
}
