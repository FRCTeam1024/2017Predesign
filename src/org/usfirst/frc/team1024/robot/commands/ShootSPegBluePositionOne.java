package org.usfirst.frc.team1024.robot.commands;

import org.usfirst.frc.team1024.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *@author Allen, Mark  1/21/2017
 *Change Log
 *1/21/2017
 *	
 */
public class ShootSPegBluePositionOne extends Command {

    public ShootSPegBluePositionOne() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.drive(1.0, 1.0);
    	//after certain distance to position at right distance from boiler
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnRight(1.0, 225);
    	//shoot
    	Robot.drivetrain.drive(-1.0, -1.0);
    	Timer.delay(0.5);
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnRight(1.0, 90);
    	Robot.drivetrain.drive(1.0, 1.0);
    	//after certain distance to land south peg
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnRight(1.0, 0);
    	Robot.drivetrain.drive(1.0, 1.0);
    	//after certain distance to land south peg
    	Robot.drivetrain.stop();
    	Robot.drivetrain.turnLeft(1.0, 60);
    	//put the peg on
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
