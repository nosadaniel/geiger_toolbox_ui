package com.geiger.toolbox.ui;



import com.geiger.toolbox.util.Colors;
import com.geiger.toolbox.util.Fonts;
import com.geiger.toolbox.util.Images;

import totalcross.ui.Bar;
import totalcross.ui.Container;

import totalcross.ui.Label;






public class HomeScreen extends Container{
    private Bar bar;

    public void initUI(){
        Images.loadImage();
        bar = new Bar("Geiger Toolbox");

        bar.addButton(Images.nav_icon, false);
        bar.setFont(Fonts.nunitoBoldFont);
      
        bar.setForeColor(Colors.TEXT_BLACK);
        add(bar, LEFT, TOP, FILL, PREFERRED);

        Label helloWord = new Label("Hello World!");
        setFont(Fonts.nunitoBoldFont);
        add(helloWord, CENTER, CENTER);
              
    }
}
