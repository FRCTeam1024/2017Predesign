package org.usfirst.frc.team1024.robot.commands;

import org.usfirst.frc.team1024.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *@author Allen  1/21/2017
 *Change Log
 *1/21/2017
 *	
 */
public class ShootWPegPositionOne extends Command {

    public ShootWPegPositionOne() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }
    protected void execute() {
    	Robot.drivetrain.drive(1.0, 1.0); //drive to boiler
    	//after certain distance
    	Robot.drivetrain.stop(); //stop motors
    	Robot.drivetrain.turnRight(1.0, 225);
    	//shoot
    	Robot.drivetrain.drive(-1.0, -1.0); //back up
    	Timer.delay(0.5); //after certain time
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnRight(1.0, 90);
    	Robot.drivetrain.drive(1.0, 1.0);
    	//after certain distance
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnRight(1.0, 0);
    	Robot.drivetrain.drive(1.0, 1.0);
    	//do the thing
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    }
    protected void interrupted() {
    }
}
