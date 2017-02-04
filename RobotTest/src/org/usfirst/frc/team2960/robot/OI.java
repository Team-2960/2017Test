package org.usfirst.frc.team2960.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team2960.robot.commands.ExampleCommand;
import org.usfirst.frc.team2960.robot.subsystems.Arm;
import org.usfirst.frc.team2960.robot.subsystems.Drivetrain;
import org.usfirst.frc.team2960.robot.subsystems.Lights;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public void driveRobot(Joystick stick, Drivetrain drivetrain, Arm arm, Lights light){
    	drivetrain.setSpeed(stick.getRawAxis(1), stick.getRawAxis(-5));
    	if(stick.getRawButton(1)){
    		arm.armup(true);
    	}
    	else if(stick.getRawButton(2)){
    		arm.armup(false);
    	}
    	if(stick.getRawButton(3)){
    		light.setLights(2);
    	}
    	else light.setLights(0);
    }
}

