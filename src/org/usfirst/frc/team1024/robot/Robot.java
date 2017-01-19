
package org.usfirst.frc.team1024.robot;
import java.util.List;

import org.usfirst.frc.team1024.Pixy.*;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.I2C.Port;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team1024.robot.commands.ExampleCommand;
import org.usfirst.frc.team1024.robot.subsystems.Drivetrain;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static Drivetrain drivetrain;
	public static OI oi;
	public PixyI2C pixy;
	public PixyPacket test;
	public DigitalOutput pixyPower;
	public static int[] pixyValues;
	public static int addedAverage;
	public static int averageX = 200;

	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		drivetrain = new Drivetrain();
		chooser.addDefault("Default Auto", new ExampleCommand());
		// chooser.addObject("My Auto", new MyAutoCommand());
		SmartDashboard.putData("Auto mode", chooser);
		pixyPower = new DigitalOutput(4);
		pixyPower.set(true);
		pixy = new PixyI2C();
		pixyValues = new int[10];
		drivetrain.frontRight.setInverted(true);
		drivetrain.backRight.setInverted(true);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
//		autonomousCommand = chooser.getSelected();
//		String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
//		switch(autoSelected) {
//		case "My Auto": 
//			autonomousCommand = new MyAutoCommand(); 
//			break;
//		case "Default Auto": 
//		default:
//			autonomousCommand = new ExampleCommand();
//			break; 
//		}
		 

		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}
	int i = 0;
	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		List<PixyObject> pixyObjectList = updatePixy();
		if (pixyObjectList != null) {
			printPixyStuff(pixyObjectList);
			System.out.println("Got " + pixyObjectList.size() + " objects from the pixy");
			//for (int i = 0; i < pixyObjectList.size(); i++) {
			//	DriverStation.reportError(pixyObjectList.get(i).toString(), false);
			//}
		}
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
	/**
	 * Please move these methods later
	 * The way it is now, one would need to first call update pixy, and then call the print method
	 */
	public  List<PixyObject> updatePixy() {
		//pixy values are saved and read like PixyPacket.(x,y,width,height)
		try {
			return pixy.readFrame(1);
		} catch ( Exception e) {
			DriverStation.reportError(e.getMessage(), true);
			// e.printStackTrace();
			return null;
		}
	}
	
	public static void printPixyStuff(List<PixyObject> pol){
		for(int i = 0; i < pol.size(); i++) {
		PixyObject po1 = pol.get(i);
		SmartDashboard.putNumber(String.format("Pixy %1$d X", i), po1.getX());
		SmartDashboard.putNumber(String.format("Pixy %1$d Y", i), po1.getY());
		SmartDashboard.putNumber(String.format("Pixy %1$d Width", i), po1.getWidth());
		SmartDashboard.putNumber(String.format("Pixy %1$d Height", i), po1.getHeight());
		}
	}
}
