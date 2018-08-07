/*
 * TestRemoteControl.java
 */
 
import Light;
import LightImpl;

import Command;
import LightOnCommand;
import LightOffCommand;

//import PresetButtons;
import RemoteControl;

public class TestRemoteControl
{
	
	public static void main(String[] args)
	{
		//
		// Create a remote
		//
		public RemoteControl remote = new RemoteControl();
		
		// Show initial assignments
		System.out.println("***** INITIAL PRESETS");
		remote.printPresets();
		
		//
		// Create light models
		//
		Light livingRoomLight = new LightImpl("Living Room");
		Light kitchenLight = new LightImpl("Kitchen");
		
		//
		// Create light model commands
		//
		Command turnLivingRoomOn = new LightOnCommand(livingRoomLight);
		Command turnLivingRoomOff = new LightOffCommand(livingRoomLight);
		Command turnKitchenOn = new LightOnCommand(kitchenLight);
		Command turnKitchenOff = new LightOffCommand(kitchenLight);
		
		//
		// Assign commands to preset buttons
		//
		
		// preset 0 - living room lights
		remote.getPreset(0).setButtons(turnLivingRoomOn, turnLivingRoomOff);
		
		// preset 1 - kitchen lights
		remote.getPreset(1).setButtons(turnKitchenOn, turnKitchenOff);
		
		// Show new presets
		System.out.println("***** CURRENT PRESETS");
		remote.printPresets();
		
		
		//
		// Push some buttons...
		//
		
		// Turn Kitchen lights on
		remote.getPreset(1).pressFirstButton();
		
		// Turn Living Room lights on and off
		remote.getPreset(0).pressFirstButton();
		remote.getPreset(0).pressSecondButton();
		
		// Turn Living Room lights on, Kitchen lights off
		remote.getPreset(1).pressSecondButton();
		remote.getPreset(0).pressFirstButton();
	}
}