package org.usfirst.frc.team1024.robot.commands;

import org.usfirst.frc.team1024.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *@author Allen 1/21/2017
 *Change Log
 *1/21/2017
 *	
 */
public class SPegShootBluePositionOne extends Command {

    public SPegShootBluePositionOne() {
        requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.drive(1.0, 1.0);
    	//after certain distance
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnLeft(1.0, 60);
    	//do the thing
    	Robot.drivetrain.drive(-1.0, -1.0);
    	Timer.delay(0.5);
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnLeft(1.0, 90);
    	Robot.drivetrain.drive(-1.0, -1.0);
    	//after certain distance
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnLeft(1.0, 180);
    	Robot.drivetrain.drive(1.0, 1.0);
    	//after certain distance
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnLeft(1.0, 225);
    	//shoot
    }

    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    }

    protected void interrupted() {
    }
}
