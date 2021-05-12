package com.geiger.toolbox;

import java.io.IOException;

import com.geiger.toolbox.ui.HomeScreen;
import com.geiger.toolbox.ui.SplashWindow;


import totalcross.sys.Settings;

import totalcross.ui.MainWindow;
import totalcross.ui.Window;
import totalcross.ui.image.ImageException;
public class ToolboxUi extends MainWindow {
    
    public ToolboxUi() {
        setUIStyle(Settings.MATERIAL_UI);
        
    }
    static {
		Settings.applicationId = "GTB";
		Settings.appVersion = "1.0.0";
		Settings.iosCFBundleIdentifier = "com.geiger.toolbox";
	}
    @Override
    public void initUI() {
        SplashWindow sp;
        HomeScreen homeScreen = new HomeScreen();
        try{
            sp = new SplashWindow();
            sp.popupNonBlocking();
            swap(homeScreen);
        }

        catch(IOException | ImageException e){
            e.printStackTrace();
        }
        
    }
}
