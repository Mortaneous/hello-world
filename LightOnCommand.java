/*
 * LightOnCommand.java
 */
 
import Command;
import Light;

public class LightOnCommand implements Command
{
	private Light light;
	
	public LightOnCommand(Light light)
	{
		this.light = light;
	}
	
	public void execute()
	{
		light.on();
	}
	
	public String toString()
	{
		return light + " ON";
	}
}
