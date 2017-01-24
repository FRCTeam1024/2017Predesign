
package org.usfirst.frc.team1024.robot.commands;

import java.util.Scanner;

import org.usfirst.frc.team1024.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *@author Allen, Cameron, Mark, Lalit  1/21/2017
 *Change Log
 *1/21/2017
 *	
 */
*/*
public class Auto extends Command {
	public int jobOne;
	public int jobTwoA;
	public int jobTwoB;
	public int jobTwoC;
	public int jobTwoD;
	public int jobTwoE;
	public int jobThreeA;
	public int jobThreeB;
	public int jobThreeC;
	public int jobThreeD;
	public int jobThreeE;
	public int jobThreeF;
	public int jobThreeG;
	public int jobThreeH;
	public int jobThreeI;
	public int jobThreeJ;
	public int jobThreeK;
	public int jobThreeL;
	public int jobThreeM;
	public int jobThreeN;
	public String type;
	public String alliance;
	public int startingPosition;

	public static void main(String[] arguments) {
		Scanner position = new Scanner(System.in);
		int startPosition;

		do {
			System.out.println("GREETINGS, CARBON-BASED LIFEFORM. WHERE AM I AT THIS MOMENT IN TIME AND SPACE?");
			startPosition = position.nextInt();
			Auto autoCommand = new Auto();
			autoCommand.startingPosition = startPosition;
			autoCommand.execute();
		} while (startPosition == 1 || startPosition == 2 || startPosition == 3);

	}

	public Auto() {
		requires(Robot.drivetrain);
		// startingPosition = blah;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		switch (alliance.toLowerCase()) {
		case "blue":
			switch (startingPosition) {
			case 1: // Starting position 1
				switch (type) { // only go to peg W or S
				case "ShootWPegPositionOne": // Shoot, then go to West Peg
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with west peg, stop
					//rotate east
					//drive to west peg
					//stop
					//rotate and line up with west peg
					//place gear on west peg
					//back up
					//stop
					break;
				case "ShootSPegBluePositionOne": // Shoot, then go to South Peg
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with south peg, stop
					//rotate east
					//drive to south peg
					//stop
					//rotate and line up with south peg
					//place gear on south peg
					//back up
					//stop
					break;
				case "SPegShootBluePositionOne": // Go to South Peg, then Shoot
					//start facing south peg
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to south peg
					//stop
					//rotate and line up with south peg
					//place gear on south peg
					//back up
					//stop
					//rotate west
					//drive west
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "WPegShootPositionOne": // Go to West Peg, then Shoot
					//start facing north
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive north
					//when lined up with west peg, stop
					//rotate east
					//drive to west peg
					//stop
					//rotate and line up with west peg
					//place gear on west peg
					//back up
					//stop
					//rotate south
					//drive south
					//when lined up with boiler, stop
					//rotate west
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "DoNothing": // No auto programmed, or choosing not to use
				default:		  // other options
					break;
				}
				break;
			case 2: // Starting position 2
				switch (type) {
				case "ShootNPegBluePositionTwo":
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with north peg, stop
					//rotate east
					//drive to north peg
					//stop
					//rotate and line up with north peg
					//place gear on north peg
					//back up
					//stop
					break;
				case "ShootSPegBluePositionTwo":
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with south peg, stop
					//rotate east
					//drive to south peg
					//stop
					//rotate and line up with south peg
					//place gear on south peg
					//back up
					//stop
					break;
				case "ShootWPegPositionTwo":
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with west peg, stop
					//rotate east
					//drive to west peg
					//stop
					//rotate and line up with west peg
					//place gear on west peg
					//back up
					//stop
					break;
				case "NPegShoot":
					//start facing north
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive north
					//when lined up with north peg, stop
					//rotate east
					//drive to north peg
					//stop
					//rotate and line up with north peg
					//place gear on north peg
					//back up
					//stop
					//rotate west
					//drive west
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "WPegShoot":
					//start facing west peg
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to west peg
					//stop
					//rotate and line up with west peg
					//place gear on west peg
					//back up
					//stop
					//rotate west
					//drive west
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "SPegShoot":
					//start facing south
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive south
					//when lined up with south peg, stop
					//rotate east
					//drive to south peg
					//stop
					//rotate and line up with south peg
					//place gear on south peg
					//back up
					//stop
					//rotate west
					//drive west
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "DoNothing":
				default:
					break;
				}
				break;
			case 3: // Starting position 3
				switch (type) {
				case "ShootNPeg":
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with north peg, stop
					//rotate east
					//drive to north peg
					//stop
					//rotate and line up with north peg
					//place gear on north peg
					//back up
					//stop
					break;
				case "ShootWPeg":
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with west peg, stop
					//rotate east
					//drive to west peg
					//stop
					//rotate and line up with west peg
					//place gear on west peg
					//back up
					//stop
					break;
				case "NPegShoot":
					//start facing north peg
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to north peg
					//stop
					//rotate and line up with north peg
					//place gear on north peg
					//back up
					//stop
					//rotate west
					//drive west
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "WPegShoot":
					//start facing south
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive south
					//when lined up with west peg, stop
					//rotate east
					//drive to west peg
					//stop
					//rotate and line up with west peg
					//place gear on west peg
					//back up
					//stop
					//rotate west
					//drive west
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "DoNothing":
				default:
					break;
				}
				break;
			default:
				break;
			}
		case "red":
			switch (startingPosition) {
			case 1: // Starting position 1
				switch (type) { // only go to peg E or S
				case "ShootEPeg": // Shoot, then go to East Peg
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with east peg, stop
					//rotate west
					//drive to east peg
					//stop
					//rotate and line up with east peg
					//place gear on east peg
					//back up
					//stop
					break;
				case "ShootSPeg": // Shoot, then go to South Peg
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with south peg, stop
					//rotate west
					//drive to south peg
					//stop
					//rotate and line up with south peg
					//place gear on south peg
					//back up
					//stop
					break;
				case "SPegShoot": // Go to South Peg, then Shoot
					//start facing south peg
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to south peg
					//stop
					//rotate and line up with south peg
					//place gear on south peg
					//back up
					//stop
					//rotate east
					//drive east
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "EPegShoot": // Go to East Peg, then Shoot
					//start facing north
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive north
					//when lined up with east peg, stop
					//rotate to east peg
					//drive to east peg
					//stop
					//rotate and line up with east peg
					//place gear on east peg
					//back up
					//stop
					//rotate east
					//drive east
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "DoNothing":
				default:
					break;
				}
				break;
			case 2: // Starting position 2
				switch (type) {
				case "ShootNPeg":
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with north peg, stop
					//turn west
					//drive to north peg
					//stop
					//rotate and line up with north peg
					//place gear on north peg
					//back up
					//stop
					break;
				case "ShootSPeg":
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with south peg, stop
					//turn west
					//drive to south peg
					//stop
					//rotate and line up with south peg
					//place gear on south peg
					//back up
					//stop
					break;
				case "ShootEPeg":
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with east peg, stop
					//turn west
					//drive to east peg
					//stop
					//rotate and line up with east peg
					//place gear on east peg
					//back up
					//stop
					break;
				case "NPegShoot":
					//start facing north
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive north
					//when lined up with north peg, stop
					//rotate west
					//drive to north peg
					//stop
					//rotate and line up with north peg
					//place gear on north peg
					//back up
					//stop
					//rotate east
					//drive east
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "EPegShoot":
					//start facing east peg
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to east peg
					//stop
					//rotate and line up with east peg
					//place gear on east peg
					//back up
					//stop
					//rotate east
					//drive east
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "SPegShoot":
					//start facing south
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive south
					//when lined up with south peg, stop
					//rotate west
					//drive to south peg
					//stop
					//rotate and line up with south peg
					//place gear on south peg
					//back up
					//stop
					//rotate east
					//drive east
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "DoNothing":
				default:
					break;
				}
				break;
			case 3: // Starting position 3
				switch (type) {
				case "ShootNPeg":
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with north peg, stop
					//turn west
					//drive to north peg
					//stop
					//rotate and line up with north peg
					//place gear on north peg
					//back up
					//stop
					break;
				case "ShootEPeg":
					//start facing boiler
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//rotate north
					//drive north
					//when lined up with east peg, stop
					//turn west
					//drive to east peg
					//stop
					//rotate and line up with east peg
					//place gear on east peg
					//back up
					//stop
					break;
				case "NPegShoot":
					//start facing north peg
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive to north peg
					//stop
					//rotate and line up with north peg
					//place gear on north peg
					//back up
					//stop
					//rotate east
					//drive east
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "EPegShoot":
					//start facing south
					//if behind another robot at any point in time,
						//wait for the other robot to move OR go around them
					//drive south
					//when lined up with east peg, stop
					//rotate west
					//drive to east peg
					//stop
					//rotate and line up with east peg
					//place gear on east peg
					//back up
					//stop
					//rotate east
					//drive east
					//when lined up with boiler, stop
					//rotate south
					//drive to boiler
					//stop
					//rotate to face the inside of the boiler, if necessary
					//shoot
					//back up
					//stop
					break;
				case "DoNothing":
				default:
					break;
				}
			default:
				break;
			}
				break;
		default:
			break;
		}
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			switch (jobOne) {
			case 1: // stay still --------- No auto programmed
				break;
			case 2: // shoot
				switch (jobTwoA) {
				case 1: // stay still
					break;
				case 2: // place gear in north
					switch (jobThreeA) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 3: // place gear in east/west
					switch (jobThreeB) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 4: // place gear in south
					switch (jobThreeC) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 5: // use hopper
					switch (jobThreeD) {
					case 1: // stay still
						break;
					case 2: // place gear in north
						break;
					case 3: // place gear in east/west
						break;
					case 4: // place gear in south
						break;
					}
					break;
				}
				break;
			case 3: // place gear in north
				switch (jobTwoB) {
				case 1: // stay still
					break;
				case 2: // shoot
					switch (jobThreeE) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 3: // use hopper
					switch (jobThreeF) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					}
					break;
				}
				break;
			case 4: // place gear in east/west
				switch (jobTwoC) {
				case 1: // stay still
					break;
				case 2: // shoot
					switch (jobThreeG) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 3: // use hopper
					switch (jobThreeH) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					}
					break;
				}
				break;
			case 5: // place gear in south
				switch (jobTwoD) {
				case 1: // stay still
					break;
				case 2: // shoot
					switch (jobThreeI) {
					case 1: // stay still
						break;
					case 2: // use hopper
						break;
					}
					break;
				case 3: // use hopper
					switch (jobThreeJ) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					}
					break;
				}
				break;
			case 6: // use hopper ----- Not Priority ------
				switch (jobTwoE) {
				case 1: // stay still
					break;
				case 2: // shoot
					switch (jobThreeK) {
					case 1: // stay still
						break;
					case 2: // place gear on north
						break;
					case 3: // place gear on east/west
						break;
					case 4: // place gear on south
						break;
					}
					break;
				case 3: // place gear in north
					switch (jobThreeL) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					}
					break;
				case 4: // place gear in east/west
					switch (jobThreeM) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					}
					break;
				case 5: // place gear in south
					switch (jobThreeN) {
					case 1: // stay still
						break;
					case 2: // shoot
						break;
					default:
						break;
					}
					break;
				}
				break;
			}
			break;
		}
		


	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}
}
/*
//Eight-hundred ninety-nine
//nine-hundred lines of worthless, dispensable, expendable psuedocode