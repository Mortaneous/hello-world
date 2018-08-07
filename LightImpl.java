/*
 * LightImpl.java
 */
 
import Light;

public class LightImpl implements Light
{
	private String location;
	private boolean on;
	
	public LightImpl(String location)
	{
		this.location = location;
		on = false;
	}
	
	public void on()
	{
		on = true;
		System.out.println(getLocation() + " light switched ON");
	}
	
	public void off()
	{
		on = false;
		System.out.println(getLocation() + " light switched OFF");
	}
	
	public boolean isOn()
	{
		return on;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public String toString()
	{
		return getLocation() + "Lights";
	}
}