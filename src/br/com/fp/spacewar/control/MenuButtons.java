package br.com.fp.spacewar.control;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.types.CGPoint;

import br.com.fp.spacewar.config.Assets;

import static br.com.fp.spacewar.config.DeviceSettings.screenResolution;
import static br.com.fp.spacewar.config.DeviceSettings.screenHeight;
import static br.com.fp.spacewar.config.DeviceSettings.screenWidth;

public class MenuButtons extends CCLayer{
	private Button playButton;
	private Button highScoreButton;
	private Button helpButton;
	private Button soundButton;
	
	public MenuButtons(){
		playButton = new Button(Assets.PLAY);
		setButtonsPositions();
		addButtons();
	}
	
	private void setButtonsPositions(){
		setPlayPosition();
		
	}
	
	private void setPlayPosition(){
		playButton.setPosition(CGPoint.ccp(
				screenWidth() / 2, 
				screenHeight() - 250));
	}
	
	private void addButtons(){
		addChild(playButton);
	}
}
