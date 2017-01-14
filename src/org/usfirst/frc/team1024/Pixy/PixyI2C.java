package org.usfirst.frc.team1024.Pixy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;
/**
 * 
 * @author 2B || !2B from https://www.chiefdelphi.com/forums/showpost.php?p=1443536&postcount=7
 * This class stores values into the PixyPacket class through the Serial port on the RoboRIO
 */
//Warning: if the pixy is plugged in through mini usb, this code WILL NOT WORK b/c the pixy is smart and detects where it should send data
public class PixyI2C{
	
	final int BYTES_TO_READ = 128;
	final int SYNCWORD = 0xaa55;
	
	I2C pixy;
	Port port = Port.kOnboard; //
	public PixyI2C() {
		pixy = new I2C(port, 0x54); //this initializes the I2C interface to accept data
	}
	
	//This method parses raw data from the pixy into readable integers
	public int doubleByteToInt(byte upper, byte lower) {
		return (((int)upper & 0xff) << 8) | ((int)lower & 0xff);
	}

	//This method gathers data, then parses that data, and assigns the ints to global variables
	public List<PixyObject> readFrame(int signature) throws PixyException { //The signature should be which number object in 

		ArrayList<PixyObject> pixyObjectList = new ArrayList<PixyObject>();
		byte[] rawData = new byte[BYTES_TO_READ];
		try{
			pixy.readOnly(rawData, BYTES_TO_READ);
			DriverStation.reportError("Got some Data", false);
		} catch (RuntimeException e){
			throw new PixyException("pixy read failure");
		}
		if(rawData.length < BYTES_TO_READ){
			DriverStation.reportError("pixy stream to small", false);
			throw new PixyException("pixy stream to small ???");
		}
		for (int i = 0; i <= BYTES_TO_READ - 2; i++) {
			DriverStation.reportError("inside the loop", false);
			int syncWord = doubleByteToInt(rawData[i+1], rawData[i+0]); //Parse first 2 bytes
			DriverStation.reportError(String.format("syncword? %1$d %2$d", syncWord, i), false);
			if (syncWord != SYNCWORD) {
				continue;
			}
			
			DriverStation.reportError("Got the sync word and pixyObject created", false);
			PixyObject pixyObject = new PixyObject(Arrays.copyOfRange(rawData,i+2, i+15));

			if(pixyObject.isValid() && pixyObject.signature == signature)
				pixyObjectList.add(pixyObject);
			i += 16;
		}
		return pixyObjectList;
	}
}