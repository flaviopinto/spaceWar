package br.com.fp.spacewar.control;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCSprite;

public class Button extends CCLayer{
	private CCSprite buttonImage;
	
	public Button(String image){
		this.setIsTouchEnabled(true);
		buttonImage = CCSprite.sprite(image);
		addChild(buttonImage);
	}
}
