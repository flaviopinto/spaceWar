package br.com.fp.spacewar;

import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;

import br.com.fp.spacewar.scene.TitleScreen;

import android.os.Bundle;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		defineOrientation();
		configScreen();
		configCCDirector();
		openMainScreen();
	}
	
	private void defineOrientation(){
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(
				WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
	}
	
	private void configScreen(){
		CCGLSurfaceView glSurfaceView = new CCGLSurfaceView(this);
		setContentView(glSurfaceView);
		CCDirector.sharedDirector().attachInView(glSurfaceView);
	}
	
	private void configCCDirector(){
		CCDirector.sharedDirector().setScreenSize(480, 800);
	}
	
	private void openMainScreen(){
		CCScene scene = new TitleScreen().scene();
		CCDirector.sharedDirector().runWithScene(scene);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
