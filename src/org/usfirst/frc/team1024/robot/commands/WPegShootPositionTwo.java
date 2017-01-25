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
public class WPegShootPositionTwo extends Command {

    public WPegShootPositionTwo() {
        requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.drive(1.0, 1.0);
    	//after certain distance
    	Robot.drivetrain.stop();
    	//do the thing
    	Robot.drivetrain.drive(-1.0, -1.0);
    	//after certain distance
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnRight(1.0, 270);
    	Robot.drivetrain.drive(1.0, 1.0);
    	//after certain distance
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnRight(1.0, 225);
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
