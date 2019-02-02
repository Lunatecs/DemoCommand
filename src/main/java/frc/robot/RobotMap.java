/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static int LEFT_TALON_CAN_ID = 3;
  public static int LEFT_VICTOR_CAN_ID = 2;

  public static int RIGHT_TALON_CAN_ID = 4;
  public static int RIGHT_VICTOR_CAN_ID = 1;

  public static int CONTROLLER_USB_ID = 0;
  //buttons for the joystick are below
  public static int GREEN_BUTTON = 1;
  public static int RED_BUTTON = 2;
  public static int BLUE_BUTTON = 3;
  public static int YELLOW_BUTTON = 4;

  public static int ULTRASONIC_PING_ID = 9;
  public static int ULTRASONIC_ECHO_ID = 8;

  public static int POTENTIOMETER_ID = 3;
  public static int POTENTIOMETER_RANGE = 1080;
  public static int POTENTIOMETER_OFFSET = 30;

  public static int INTAKE_TALON_CAN_ID = 5;

  public static int LED_PWM_ID = 3;


}
