package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

/**
 * Subsystem handling intake.
 */
public class IntakeSystem extends SubsystemBase {

	/**
	 * talon doing stuff.
	 */
	TalonSRX topTalon1;


	/**
	 * Create a new IntakeSystem.
	 * 
	 * @param topTalon1 talon doing stuff
	 */
	public IntakeSystem(TalonSRX topTalon1) {
		this.topTalon1 = topTalon1;
	}

	/**
	 * Set shooter moter spin speed
	 * 
	 * @param speed intake output percent, [-1, 1]
	 */
	public void setSpeed(double speed) {
		topTalon1.set(ControlMode.PercentOutput, speed);
	}

	/**
	 * Stops the shooter moter
	 */
	public void stop() {
		topTalon1.set(ControlMode.PercentOutput, 0);
	}

}