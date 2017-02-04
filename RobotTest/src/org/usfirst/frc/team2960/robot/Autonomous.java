package org.usfirst.frc.team2960.robot;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import org.usfirst.frc.team2960.robot.subsystems.Drivetrain;

public class Autonomous {
	public static Timer timer = new Timer ();
	public static AutonomousCommand currentCommand = new AutonomousCommand ();
	public static int timerValue = 0;
	public static Drivetrain drivetrain;
	public static AutonomousCommand getAutonCommandAtIndex(int index){
		ArrayList<AutonomousCommand> cmds = new ArrayList<AutonomousCommand>();
		return cmds.get(index);
	}
	public static class UpdateLoopTask extends TimerTask{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				timerValue ++;
				currentCommand.updateLoop();
				
			}
			
		}
		public static void startCommand(AutonomousCommand cmd){
			currentCommand = cmd;
			timer.scheduleAtFixedRate(new UpdateLoopTask(), 0, 10);

				
			}
		public static void stopAuton(){
			timerValue = 0;
			timer.cancel();
			
		}
	public static void resetCounter(){
		timerValue = 0 ;
		
	}
}

	
