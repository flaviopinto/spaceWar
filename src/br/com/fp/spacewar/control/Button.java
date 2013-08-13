package br.com.fp.spacewar.control;

import org.cocos2d.events.CCTouchDispatcher;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;
import org.cocos2d.types.CGRect;

import android.view.MotionEvent;
import br.com.fp.spacewar.interfaces.ButtonDelegate;

public class Button extends CCLayer{
	private CCSprite buttonImage;
	private ButtonDelegate delegate;
	
	public Button(String image){
		this.setIsTouchEnabled(true);
		buttonImage = CCSprite.sprite(image);
		addChild(buttonImage);
	}
	
	public void setDelegate(ButtonDelegate sender) {
		delegate = sender;
	}
	
	protected void registerWithTouchDispatcher() {
		CCTouchDispatcher.sharedDispatcher()
				.addTargetedDelegate(this, 0, false);
	}
	
	public boolean ccTouchesBegan(MotionEvent event) {

		CGPoint touchLocation = CGPoint.make(event.getX(), event.getY());
		touchLocation = CCDirector.sharedDirector().convertToGL(touchLocation);
		touchLocation = this.convertToNodeSpace(touchLocation);

		// Check Button touched
		if (CGRect.containsPoint(
				this.buttonImage.getBoundingBox(), touchLocation)) {
			delegate.buttonClicked(this);
		}

		return true;
	}
}
