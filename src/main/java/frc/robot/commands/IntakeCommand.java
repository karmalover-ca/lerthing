package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSystem;

/**
 * command to spin the intake at a speed.
 */
public class IntakeCommand extends CommandBase  {

	/** Robot's intake system */
	IntakeSystem intakeSystem;
	/** controller for intake output percent */
	DoubleSupplier supplier;


	/**
	 * Create a new intake
	 * 
	 * @param intakeSystem robot's intake system
	 * @param supplier controller for intake output percent
	 */
	public IntakeCommand(IntakeSystem intakeSystem, DoubleSupplier supplier) {
		addRequirements(intakeSystem);

		this.intakeSystem = intakeSystem;
		this.supplier = supplier;
	}

	/**
	 * Called when the command is initially scheduled.<br/>.
	 * May be triggered by a button/command group or as a default command
	 */
	@Override
	public void initialize() {
		intakeSystem.stop();
		
	}

	/**
	 * Called once every 20ms (nominally).
	 */
	@Override
	public void execute() {
		intakeSystem.setOutput(supplier.getAsDouble());
	}

	/**
	 * Called when the command ends.
	 * @param interrupted Flag indicating if the command was interrupted
	 */
	@Override
	public void end(boolean interrupted) {
		intakeSystem.stop();
		
	}

	/**
	 * Called to check command status, command will end if this returns true.
	 */
	@Override
	public boolean isFinished() {
		return false;
	}

}