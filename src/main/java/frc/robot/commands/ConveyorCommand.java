package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.BallTransportSystem;

/**
 * .
 */
public class ConveyorCommand extends CommandBase  {

	BallTransportSystem ballTransportSystem;


	/**
	 * Create new Conveyor Command
	 * 
	 * @param ballTransportSystem robot's ballTransportSystem
	 */
	public ConveyorCommand(BallTransportSystem ballTransportSystem) {
		addRequirements(ballTransportSystem);
		
		this.ballTransportSystem = ballTransportSystem;
	}

	/**
	 * Called when the command is initially scheduled.<br/>.
	 * May be triggered by a button/command group or as a default command
	 */
	@Override
	public void initialize() {
		ballTransportSystem.stop();
	}

	/**
	 * Called once every 20ms (nominally).
	 */
	@Override
	public void execute() {
		ballTransportSystem.setOutput(1);
	}

	/**
	 * Called when the command ends.
	 * @param interrupted Flag indicating if the command was interrupted
	 */
	@Override
	public void end(boolean interrupted) {
		ballTransportSystem.stop();
	}

	/**
	 * Called to check command status, command will end if this returns true.
	 */
	@Override
	public boolean isFinished() {
		return false;
	}

}