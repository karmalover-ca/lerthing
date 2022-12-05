package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShooterSystem;

/**
 * .
 */
public class ShooterCommand extends CommandBase  {

	/** Robot's shooter system */
	ShooterSystem shooter;

	/** Controller shooter output percent */
	DoubleSupplier supplier;


	/**
	 * Create a new shooter
	 * 
	 * @param shooter
	 * @param supplier
	 */
	public ShooterCommand(ShooterSystem shooter, DoubleSupplier supplier) {
		addRequirements(shooter);
		
		this.shooter = shooter;
		this.supplier = supplier;
	}

	/**
	 * Called when the command is initially scheduled.<br/>.
	 * May be triggered by a button/command group or as a default command
	 */
	@Override
	public void initialize() {
		shooter.stop();
		
	}

	/**
	 * Called once every 20ms (nominally).
	 */
	@Override
	public void execute() {
		shooter.setOutput(supplier.getAsDouble());
	}

	/**
	 * Called when the command ends.
	 * @param interrupted Flag indicating if the command was interrupted
	 */
	@Override
	public void end(boolean interrupted) {
		shooter.stop();
		
	}

	/**
	 * Called to check command status, command will end if this returns true.
	 */
	@Override
	public boolean isFinished() {
		return false;
	}

}