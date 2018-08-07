/*
 * LightOffCommand.java
 */
 
import Command;
import Light;

public class LightOffCommand implements Command
{
	private Light light;
	
	public LightOffCommand(Light light)
	{
		this.light = light;
	}
	
	public void execute()
	{
		light.off();
	}
	
	public String toString()
	{
		return light + " OFF";
	}
}
