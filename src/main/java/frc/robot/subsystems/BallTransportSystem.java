package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * Transports the balls from intake to shooter.
 */
public class BallTransportSystem extends SubsystemBase  {

	/**
	 * talon that controls the conveyor belt.
	 */
	TalonSRX topTalon2;


	/**
	 * Create a new BallTransportSystem.
	 * 
	 * @param topTalon2 talon that controls the conveyor belt
	 */
	public BallTransportSystem(TalonSRX topTalon2) {
		this.topTalon2 = topTalon2;
	}

	/**
	 * Set belt moter spinn speed
	 * 
	 * @param speed intake output percent, [-1, 1]
	 */
	public void setOutput(double speed) {
		topTalon2.set(ControlMode.PercentOutput, speed);
	}

	/**
	 * Stops the belt moter
	 */
	public void stop() {
		topTalon2.set(ControlMode.PercentOutput, 0);
	}

}