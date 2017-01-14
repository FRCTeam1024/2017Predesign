package org.usfirst.frc.team1024.robot.subsystems;

import org.usfirst.frc.team1024.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	public CANTalon frontLeft = new CANTalon(RobotMap.FRONT_LEFT_PORT);
	public CANTalon frontRight = new CANTalon(RobotMap.FRONT_RIGHT_PORT);
	public CANTalon backLeft = new CANTalon(RobotMap.BACK_LEFT_PORT);
	public CANTalon backRight = new CANTalon(RobotMap.BACK_RIGHT_PORT);
	
	public void drive(double leftPower, double rightPower){
		frontLeft.set(leftPower);
		frontRight.set(rightPower);
		backLeft.set(leftPower);
		backRight.set(rightPower);
	}
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
}
