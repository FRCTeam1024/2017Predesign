package org.usfirst.frc.team1024.robot.subsystems;

import org.usfirst.frc.team1024.robot.Robot;
import org.usfirst.frc.team1024.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	public CANTalon frontLeft = new CANTalon(RobotMap.FRONT_LEFT_PORT);
	public CANTalon frontRight = new CANTalon(RobotMap.FRONT_RIGHT_PORT);
	public CANTalon backLeft = new CANTalon(RobotMap.BACK_LEFT_PORT);
	public CANTalon backRight = new CANTalon(RobotMap.BACK_RIGHT_PORT);
	//public Encoder encoder = new Encoder(2,3);
	public AnalogGyro gyro = new AnalogGyro(RobotMap.GYRO_PORT);
	
	public void drive(double leftPower, double rightPower){
		frontLeft.set(leftPower);
		frontRight.set(rightPower);
		backLeft.set(leftPower);
		backRight.set(rightPower);
	}
	public void stop() {
		frontLeft.set(0.0);
		frontRight.set(0.0);
		backLeft.set(0.0);
		backRight.set(0.0);
	}
	public void turnRight(double power, double desiredAngle) {
		while(this.gyro.getAngle() >= desiredAngle) {
			this.drive(power, -power);
		}
		this.stop();
	}
	public void turnLeft(double power, double desiredAngle) {
		while(this.gyro.getAngle() <= desiredAngle) {
			this.drive(-power, power);
		}
		this.stop();
	}
	
	public void driveForwardfullSpeed () {
		this.drive(1.0, 1.0);
	}
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
}
