package org.usfirst.frc.team2960.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem{
	public DoubleSolenoid armey;
	public Arm (){
		armey = new DoubleSolenoid(1,2);
	
	}
	
	@Override
	protected void initDefaultCommand() {
	}
		public void armup(boolean armDirection){
			if(armDirection){
				armey.set(DoubleSolenoid.Value.kForward);
				
			}
			else{
				armey.set(DoubleSolenoid.Value.kReverse);
				
			}
				
		
		
	}

}
