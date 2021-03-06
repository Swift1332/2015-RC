// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1332.Hilgenfeld.subsystems;

import org.usfirst.frc1332.Hilgenfeld.RobotMap;
import org.usfirst.frc1332.Hilgenfeld.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.interfaces.Gyro;


/**
 *
 */
public class DriveBase extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController lF = RobotMap.driveBaseLF;
    SpeedController lR = RobotMap.driveBaseLR;
    SpeedController rF = RobotMap.driveBaseRF;
    SpeedController rR = RobotMap.driveBaseRR;
    RobotDrive robotDrive41 = RobotMap.driveBaseRobotDrive41;
    AnalogGyro analogGyro1 = RobotMap.driveBaseAnalogGyro1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new ArcadeDrive()); 

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void TankDrive(Joystick drivePad){
    	robotDrive41.tankDrive(drivePad, 1,drivePad, 5, true);
    }
    
    public void drivestop (double speed){
    	robotDrive41.stopMotor();
    }
    
    public void ArcadeDrive(Joystick arcadeStick){
    	robotDrive41.arcadeDrive(arcadeStick, true); 
    }
    
    public void driveStraight(){
    	robotDrive41.tankDrive(-.6, -.6); // **Drive over Platform**
    	//robotDrive41.tankDrive(-.73, -.78); // **No Platform **
    	//robotDrive41.tankDrive(.7,.7); //Reverse drive
    }
    
    public void LeftTurn(){
    	robotDrive41.tankDrive(0, -.6);
    	//robotDrive41.tankDrive(0,.6); //For reverse turns
    }
    
    public void RightTurn(){
    	robotDrive41.tankDrive(-.6, 0);
    	//robotDrive41.tankDrive(.3,0); //For reverse turns
    }
    
    public void SlashWrist(){
    	robotDrive41.tankDrive(0,0);
    }
}

