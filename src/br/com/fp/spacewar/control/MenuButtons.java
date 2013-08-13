package br.com.fp.spacewar.control;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.types.CGPoint;

import br.com.fp.spacewar.config.Assets;
import br.com.fp.spacewar.interfaces.ButtonDelegate;


import static br.com.fp.spacewar.config.DeviceSettings.screenHeight;
import static br.com.fp.spacewar.config.DeviceSettings.screenWidth;

public class MenuButtons extends CCLayer implements ButtonDelegate{
	private Button playButton;
	private Button highScoreButton;
	private Button helpButton;
	private Button soundButton;
	
	public MenuButtons(){
		instanceButtons();
		setDelegateButtons();
		setButtonsPositions();
		addButtons();
	}

	private void setDelegateButtons() {
		this.playButton.setDelegate(this);
		this.highScoreButton.setDelegate(this);
		this.helpButton.setDelegate(this);
		this.soundButton.setDelegate(this);
	}

	private void instanceButtons() {
		playButton = new Button(Assets.PLAY);
		highScoreButton = new Button(Assets.HIGHSCORE);
		helpButton = new Button(Assets.HELP);
		soundButton = new Button(Assets.SOUND);
	}
	
	private void setButtonsPositions(){
		setPlayPosition();
		setHighScorePosition();
		setHelpPosition();
		setSoundPosition();
	}
	
	private void setSoundPosition(){
		soundButton.setPosition(CGPoint.ccp(
				screenWidth() / 2 - 100, 
				screenHeight() - 420));
	}
	
	private void setHelpPosition(){
		helpButton.setPosition(CGPoint.ccp(
				screenWidth() / 2, 
				screenHeight() - 350));
	}
	
	private void setHighScorePosition(){
		highScoreButton.setPosition(CGPoint.ccp(
				screenWidth() / 2, 
				screenHeight() - 300));
	}
	
	private void setPlayPosition(){
		playButton.setPosition(CGPoint.ccp(
				screenWidth() / 2, 
				screenHeight() - 250));
	}
	
	private void addButtons(){
		addChild(playButton);
		addChild(highScoreButton);
		addChild(helpButton);
		addChild(soundButton);
	}

	@Override
	public void buttonClicked(Button sender) {
		if(playButton.equals(sender)){
			System.out.println("play");
		}else if(highScoreButton.equals(sender)){
			System.out.println("highscore");
		}else if(helpButton.equals(sender)){
			System.out.println("help");
		}else{
			System.out.println("sound");
		}
	}
}
