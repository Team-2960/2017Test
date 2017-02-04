package org.usfirst.frc.team2960.robot;

import org.usfirst.frc.team2960.robot.subsystems.Drivetrain;

public class AutonomousCommand {
	public int stage = 1;
	protected int finalStage = 0;
	public Drivetrain drivetrain;
	public void updateLoop(){
		if (isFinished()){
			Autonomous.stopAuton();
			return;
			
		}
		
	}
	public double getSecondsDone(){
		return Autonomous.timerValue/100;
		
	}
	public void finish(){
		stage = finalStage +1;
		
	}
	public void finishStage(){
		stage = stage +1;
		
	}
	public boolean isFinished(){
		return stage > finalStage;
	}
	
}
