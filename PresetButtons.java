/*
 * PresetButtons.java
 */
 
import Command;
import NoCommand;

public class PresetButtons
{
	Command[] buttons;
	Command unassigned;
	
	//
	// Construction
	//
	public PresetButtons()
	{
		initialize();
		clearCommands();
	}

	public PresetButtons(Command firstCommand, Command secondCommand)
	{
		initialize();
		assignCommands(firstCommand, secondCommand);
	}

	private void initialize()
	{
		unassigned = new NoCommand();
		buttons = new Command[2];
	}
	
	//
	// Button press
	//
	private void pressButton(int index)
	{
		buttons[index].execute();
	}
	
	public void pressFirstButton()
	{
		pressButton(0);
	}
	
	public void pressSecondButton()
	{
		pressButton(1);
	}
	
	//
	// Button assignment
	//
	private void setButton(int i, Command command)
	{
		buttons[i] = command;
	}
	
	public void setFirstButton(Command command)
	{
		setButton(0, command);
	}
	
	public void setSecondButton(Command command)
	{
		setButton(1, command);
	}
	
	public void setButtons(Command firstCommand, Command secondCommand)
	{
		setButton(0, firstCommand);
		setButton(1, secondCommand);
	}
	
	//
	// Button remove assignment
	//
	public void clearFirstButton()
	{
		setButton(0, unassigned);
	}
	
	public void clearSecondButton()
	{
		setButton(1, unassigned);
	}
	
	public void clearButtons()
	{
		setButton(0, unassigned);
		setButton(1, unassigned);
	}
	
	//
	// toString override
	//
	@Override
	public String toString()
	{
		return "First: " + buttons[0] + "\tSecond: " + buttons[1];
	}
	
}
	
	