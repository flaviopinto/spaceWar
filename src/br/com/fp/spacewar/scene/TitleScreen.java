package br.com.fp.spacewar.scene;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;

import br.com.fp.spacewar.config.Assets;
import br.com.fp.spacewar.control.MenuButtons;

import static br.com.fp.spacewar.config.DeviceSettings.screenResolution;
import static br.com.fp.spacewar.config.DeviceSettings.screenHeight;
import static br.com.fp.spacewar.config.DeviceSettings.screenWidth;

public class TitleScreen extends CCLayer{
	
	private ScreenBackground background;
	
	/**
	 * prepare positioning of the elements(backround, logo, buttons)
	 * @return
	 */
	public CCScene scene(){
		CCScene scene = CCScene.node();
		scene.addChild(this);
		return scene;
	}
	
	public TitleScreen(){
		addBackground();
		addTitle();
		addMenuButtons();
	}

	private void addBackground() {
		background = new ScreenBackground(Assets.BACKGROUND);
		background.setPosition(screenResolution(CGPoint.ccp(
								screenWidth() / 2.0f, 
								screenHeight() / 2.0f)));
		
		this.addChild(background);
	}

	private void addTitle() {
		CCSprite title = CCSprite.sprite(Assets.LOGO);
		title.setPosition(
				screenWidth() / 2,
				screenHeight() - 130);
		this.addChild(title);
	}
	
	private void addMenuButtons(){
		MenuButtons menuLayer = new MenuButtons();
		this.addChild(menuLayer);
	}
	
	
	
	
}
