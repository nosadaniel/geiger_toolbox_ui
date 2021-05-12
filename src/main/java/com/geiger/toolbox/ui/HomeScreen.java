package com.geiger.toolbox.ui;



import com.geiger.toolbox.util.Colors;
import com.geiger.toolbox.util.Fonts;
import com.geiger.toolbox.util.Images;
import com.geiger.toolbox.util.MaterialConstants;

import totalcross.ui.Bar;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.FloatingActionButton;
import totalcross.ui.Label;
import totalcross.ui.TopMenu;






public class HomeScreen extends Container{
    private Bar bar;
    private Container top_container;
    
    public void initUI(){

        Images.loadImage();
        bar = new Bar("Geiger Toolbox");

        bar.addButton(Images.nav_icon, false);
        bar.setFont(Fonts.nunitoBoldFont);
        bar.setForeColor(Colors.TEXT_BLACK);

        //place bar at the top of the screen
        add(bar, LEFT, TOP, FILL, PREFERRED);

    
        top_container = new Container();
        add(top_container, LEFT +  MaterialConstants.BORDER_SPACING, AFTER, FILL -  MaterialConstants.BORDER_SPACING, PARENTSIZE + 40);

        Label text = new Label("Your Risk Score:");
        top_container.add(text,CENTER, TOP+2);

        Label score = new Label("73.5");
        score.setForeColor(Colors.SCORE_COLOR);
        score.setFont(Fonts.nunitoBoldScoreSize);
        top_container.add(score, CENTER, AFTER+2);


        FloatingActionButton scan_btn = new FloatingActionButton(Images.scan_icon);
        scan_btn.setIcon(Images.scan_icon);
        scan_btn.setIconSize(33);
        top_container.add(scan_btn, CENTER, AFTER+2);

        Button btnEmployee = new Button("Employee", Button.BORDER_OUTLINED);
        btnEmployee.setBackForeColors(Colors.PRIMARY, Colors.TEXT_ON_P_LIGHT);
        top_container.add(btnEmployee, LEFT, AFTER+10);

        Button btnDevice= new Button("Device", Button.BORDER_OUTLINED);
        btnDevice.setBackForeColors(Colors.S_DARK, Colors.TEXT_BLACK);
        top_container.add(btnDevice, RIGHT, CENTER_OF);
        
    
        
    
       
        
        
        
        
              
    }
}
