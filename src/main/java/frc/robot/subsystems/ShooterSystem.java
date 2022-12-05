package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * Subsystem to handle the shooting moter.
 */
public class ShooterSystem extends SubsystemBase  {

	/**
	 * talon that controls shooting moter.
	 */
	TalonSRX topTalon3;


	/**
	 * Create a new ShooterSystem.
	 * 
	 * @param topTalon3 talon that controls shooting moter
	 */
	public ShooterSystem(TalonSRX topTalon3) {
		this.topTalon3 = topTalon3;
	}

	/**
	 * Set intake moter spinn speed
	 * 
	 * @param speed intake output percent, [-1, 1]
	 */
	public void setOutput(double output) {
		topTalon3.set(ControlMode.PercentOutput, output);
	}

	/**
	 * Stops the intake moter
	 */
	public void stop() {
		topTalon3.set(ControlMode.PercentOutput, 0);
	}

}