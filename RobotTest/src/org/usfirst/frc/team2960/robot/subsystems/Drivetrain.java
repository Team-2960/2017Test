package org.usfirst.frc.team2960.robot.subsystems;

/* Imports */
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/* Public Class for Drivetrain */
public class Drivetrain extends Subsystem {
	Victor RtDrive1;
	Victor RtDrive2;
	Victor LtDrive1;
	Victor LtDrive2;

	public Drivetrain() {
		RtDrive1 = new Victor(0);
		RtDrive2 = new Victor(1);
		LtDrive1 = new Victor(2);
		LtDrive2 = new Victor(3);
	}

	@Override
	protected void initDefaultCommand() {
		RtDrive1.set(0);
		RtDrive2.set(0);
		LtDrive1.set(0);
		LtDrive2.set(0);
	}
	
	public void setSpeed(double left,double right){
		RtDrive1.set(right);
		RtDrive2.set(right);
		LtDrive1.set(left);
		LtDrive2.set(left);
		
	}

}
