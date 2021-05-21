package com.geiger.toolbox.ui.screens;

import java.io.IOException;

import com.geiger.toolbox.ui.BaseScreen;
import com.geiger.toolbox.util.Colors;

import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.TabbedContainer;
import totalcross.ui.Window;
import totalcross.ui.dialog.MessageBox;
import totalcross.ui.image.Image;
import totalcross.ui.image.ImageException;

public class RecommendationScreen extends BaseScreen{
    TabbedContainer tab;
    Container userRecommendations;
    Container deviceRecommendations;
    Label testLabelUser;
    Label testLabelDevice;

   
    
    @Override
    public void onContent(ScrollContainer content){

        try {
            CreateUserAndDeviceTabs(content);
        } catch (Exception e) {
            MessageBox.showException(e, true);
        } 

        Label lbWorkInProgress = new Label("Work in Progress");
        //Label lbTest = new Label("Test");
        
        content.add(lbWorkInProgress, CENTER, CENTER);
        //content.add(lbTest, CENTER, AFTER + 800);

    }
    
    


    private void CreateUserAndDeviceTabs(ScrollContainer content) throws ImageException, IOException{
        String[] tabCaptions = {"User", "Device"};
        Image[] icons = { new Image("images/user.png"), new Image("images/device.png")};

        userRecommendations = new Container();
        userRecommendations.setInsets(0, 0, 0, 0);

        deviceRecommendations = new Container();
        deviceRecommendations.setInsets(0, 0, 0, 0);
        
        testLabelDevice = new Label("Device Recommendations");
        testLabelUser = new Label("User Recommendations");

        userRecommendations.add(testLabelUser, CENTER, CENTER, PREFERRED, PREFERRED);
        deviceRecommendations.add(testLabelUser, CENTER, CENTER, PREFERRED, PREFERRED);

        final TabbedContainer tabs = new TabbedContainer(tabCaptions);
        tabs.setIcons(icons);
        tabs.pressedColor = Colors.PRIMARY;
        tabs.allSameWidth = true;
        tabs.extraTabHeight = fmH * 2;
        tabs.borderColor = Colors.WHITE;
        add(tabs, LEFT, TOP, FILL, PARENTSIZE);
        /*
        for (int i = 0; i < tabCaptions.length; i++) {
            //tabs.getContainer(i).add(new Label("Content "+(i+1)), CENTER, CENTER);
            
        }
        */
      
        
        tabs.setContainer(0, userRecommendations);
        tabs.setContainer(1, deviceRecommendations);
        
        

    }


}
