package org.usfirst.frc.team2960.robot.subsystems;

import org.usfirst.frc.team2960.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lights extends Subsystem {
   boolean inputA;
   boolean inputB;
   boolean inputC;
   DigitalOutput I1;
   DigitalOutput I2;
   DigitalOutput I3;
	public Lights(){
		I1 = new DigitalOutput(RobotMap.lightOutput1);
		I2 = new DigitalOutput(RobotMap.lightOutput2);
		I3 = new DigitalOutput(RobotMap.lightOutput3);
		
	}
	public void setLights(int select){
		if(select==0){
			inputA = false;
			inputB = false;
			inputC = false;
		}
		if(select==1){
			 inputA = false;
			 inputB = false;
			 inputC = true;
		}
		if(select==2){
			 inputA = false;
			 inputB = true;
			 inputC = false;
		}
		if(select==3){
			 inputA = false;
			 inputB = true;
			 inputC = true;
		}
		if(select==4){
			inputA = true;
			inputB = false;
			inputC = false;
		}
		if(select==5){
			 inputA = true;
			 inputB = false;
			 inputC = true;
		}
		if(select==6){
			 inputA = true;
			 inputB = true;
			 inputC = false;
		}
		 if(select==7){
			 inputA = true;
			 inputB = true;
			 inputC = true;
		}
	}
	

	
	public void update() {
		I1.set(inputA);
		I2.set(inputB);
		I3.set(inputC);
		// TODO Auto-generated method stub
		
	}
	
	
	public void start() {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}

