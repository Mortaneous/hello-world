/*
 * RemoteControl.java
 */
 
public class RemoteControl
{
	private PresetButtons[] presetButtons;
	public static final int TOTAL_PRESETS = 7;
	
	public RemoteControl()
	{
		presetButtons = new PresetButtons[TOTAL_PRESETS];
		
		for(int i=0; i<TOTAL_PRESETS; i++) {
			presetButtons[i] = new PresetButtons();
		}
	}
	
	public PresetButtons getPreset(int index)
	{
		PresetButtons preset = null;
		
		if(index >= 0 && index < TOTAL_PRESETS) {
			preset = presetButtons[index];
		}
		
		return preset;
	}
	
	public void printPresets()
	{
		for(int i=0; i<TOTAL_PRESETS; i++) {
			System.out.println("[" + i + "] : " + presetButtons[i]);
		}
	}
	
}