package com.geiger.toolbox.util;

import totalcross.io.IOException;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class Images {
    public static Image geiger_logo;
    public static Image nav_icon, scan_icon, phishing_icon, risk_indicator;

    public static void loadImage(){
        try{
            geiger_logo = new Image("images/logo.png");
            nav_icon= new Image("images/menu_icon.png");
            scan_icon = new Image("images/scan_btn2.png");
            phishing_icon = new Image("images/phishing.png");
            risk_indicator = new Image("images/indicator.png");




        }
        catch( IOException | ImageException e){
            e.printStackTrace();

        }
    }
}
