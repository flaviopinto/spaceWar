package br.com.fp.spacewar.config;

import org.cocos2d.nodes.CCDirector;
import org.cocos2d.types.CGPoint;
import org.cocos2d.types.CGSize;

import android.hardware.SensorManager;

public class DeviceSettings {
	
	private static SensorManager sensormanager;
	
	public static void setSensorManager(SensorManager sensorManagerRef) {
		sensormanager = sensorManagerRef;
	}
	
	/**
	 * Get object position
	 * @param gcPoint
	 * @return
	 */
	public static CGPoint screenResolution(CGPoint gcPoint) {
		return gcPoint;
	}
	
	/**
	 * return width
	 * @return
	 */
	public static float screenWidth() {
		return winSize().width; 
	}

	/**
	 * return heigth
	 * @return
	 */
	public static float screenHeight() {
		return winSize().height; 
	}
	
	public static CGSize winSize() {
		return CCDirector.sharedDirector().winSize();
	}
	
	public static SensorManager getSensormanager() {
		return sensormanager;
	}


}
