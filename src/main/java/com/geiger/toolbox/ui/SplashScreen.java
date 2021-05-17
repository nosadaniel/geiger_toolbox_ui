package com.geiger.toolbox.ui;

import java.io.IOException;

import com.geiger.toolbox.util.Images;

import totalcross.ui.ImageControl;
import totalcross.ui.Window;
import totalcross.ui.anim.ControlAnimation;
import totalcross.ui.anim.FadeAnimation;
import totalcross.ui.image.ImageException;
import totalcross.util.UnitsConverter;

public class SplashScreen extends Window {
    public SplashScreen() throws IOException, ImageException{
        
    }
    protected void onPopup(){
    
            Images path = new Images("images/logo.png");
            ImageControl logo;
            logo = new ImageControl( path.getImage());
           
            logo.scaleToFit = true;
            logo.centerImage = true;
            logo.transparentBackground = true;
            add(logo, CENTER, CENTER, PARENTSIZE, PARENTSIZE);

            FadeAnimation.create(logo, true, null, 2000)
                .then(FadeAnimation.create(logo, false, this::onAnimationFinished, 4000)).start();
    
          
        }
    public void onAnimationFinished(ControlAnimation anim){
        this.unpop();
    }
}
