
/**
* File Name: Television.java
* Purpose: Models the functions of a Television
* Date: 2020-03-01
* Last modified: 2020-03-01
* Author: Josen Pottackal
* Copy right no copyright
* Version: 1.0
*/

public class Television {
	
	/**
	 *  The power state of the TV.
	 */
	private static String toggleState;
	
	/**
	 *  Dummy serial number.
	 */
	private static int serialNumberGeneral = 999;
	
	/**
	 *  The serial number of the TV.
	 */
	private int serialNumber;
	
	/**
	 *  The channel number of the TV.
	 */
	private int channelNumber;
	
	/**
	 *  The volume of the TV.
	 */
	private int volume;
	
	/**
	 *  The upper channel limit of the TV.
	 */
	private int channelLimit;
	
	/**
	 * Creates a basic TV.
	 */
	public Television() { 
			this.channelNumber = 1;
			this.volume = 0;
			this.toggleState = "Off";
			this.serialNumberGeneral++;
			this.serialNumber = serialNumberGeneral;
			this.channelLimit = 10;
	}
	
	/**
	 * Creates an expensive TV.
	 * @param channelLimit The upper channel limit of the TV.
	 */
	public Television(int channelLimit) { 
		if( channelLimit < 0 || channelLimit > 1000)
            throw new IllegalArgumentException("Channel not found");
		else {
			this.channelNumber = 1;
			this.volume = 0;
			this.toggleState = "Off";
			this.serialNumberGeneral++;
			this.serialNumber = serialNumberGeneral;
			this.channelLimit = channelLimit;
		}
	}
	
	/**
	 * Method to set the channel number
	 * @param channelNumber The TV's channel number
	 */
	public void setChannelNumber(int channelNumber) {
		if (toggleState == "On") {
			if( channelLimit < 0 || channelLimit > 11)
	            throw new IllegalArgumentException("Channel not found");
			else {
				this.channelNumber = channelNumber;
			}
		} 
		else {
			System.out.println("Television is Off");
		}
	}
	
	/**
	 * Method to increase channel number by 1
	 */
	public void setNextChannel() {
		if (toggleState == "On") {
			channelNumber++;
		} 
		else {
			System.out.println("Television is Off");
		}
	}
	
	/**
	 * Method to decrease channel number by 1
	 */
	public void setPreviousChannel() {
		if (toggleState == "On") {
			channelNumber--;
		} 
		else {
			System.out.println("Television is Off");
		}
	}
	
	/**
	 * Method to increase volume by 2
	 */
	public void increaseVolume() {
		if (toggleState == "On") {
			if (volume > 100) {
				volume = (volume + 2);
			} 
			else {
				System.out.println("Invalid");
			}
		} 
		else {
			System.out.println("Television is Off");
		}
	}
	
	/**
	 * Method to decrease volume by 2
	 */
	public void decreaseVolume() {
		if (toggleState == "On") {
			if (volume < 0) {
				volume = (volume - 2);
			} 
			else {
				System.out.println("Invalid");
			}
		} 
		else {
			System.out.println("Television is Off");
		}
	}
	
	/**
	 * Method to switch TV on and off
	 */
	public void toggleState() {
		if (toggleState == "On") {
			toggleState = "Off";
		} 
		else {
			toggleState = "On";
		}
	}
	
	/**
	 * Method to get the toggleState.
	 */
	public String getToggleState() {
        if (toggleState == "On") {
        	return toggleState;
		} 
		else {
			return "Television is Off";
		}
    }
	
	/**
	 * Method to get the serialNumber.
	 */
	public int getSerialNumber() {
		if (toggleState == "On") {
			return serialNumber;
		} 
		else {
			return -1;
		}
    }
	
	/**
	 * Method to get the channelNumber.
	 */
	public int getChannelNumber() {
		if (toggleState == "On") {
			return channelNumber;
		} 
		else {
			return -1;
		}
    }
	
	/**
	 * Method to get the volume.
	 */
	public int getVolume() {
		if (toggleState == "On") {
			return volume;
		} 
		else {
			return -1;
		}
    }
}
