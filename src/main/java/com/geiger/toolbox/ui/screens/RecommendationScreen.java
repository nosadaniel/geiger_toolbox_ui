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
    Container userRecommendationsContainer;
    Container deviceRecommendationsContainer;
    Label testLabelUser;
    Label testLabelDevice;

   
    
    @Override
    public void onContent(ScrollContainer content){

        try {
            CreateUserAndDeviceTabs(content);
        } catch (Exception e) {
            MessageBox.showException(e, true);
        } 

    }
    
    


    private void CreateUserAndDeviceTabs(ScrollContainer content) throws ImageException, IOException{
        String[] tabCaptions = {"User", "Device"};
        Image[] icons = { new Image("images/user.png"), new Image("images/device.png")};

        userRecommendationsContainer = new Container();
        deviceRecommendationsContainer = new Container();

        content.add(userRecommendationsContainer, LEFT,CENTER, FILL, PARENTSIZE);
        content.add(deviceRecommendationsContainer, LEFT,CENTER, FILL, PARENTSIZE);
       
        
        testLabelDevice = new Label("Device Recommendations");
        testLabelUser = new Label("User Recommendations");

        userRecommendationsContainer.add(testLabelUser, CENTER, CENTER);
        deviceRecommendationsContainer.add(testLabelDevice, CENTER, CENTER);

        final TabbedContainer tabs = new TabbedContainer(tabCaptions);
        tabs.setIcons(icons);
        tabs.pressedColor = Colors.PRIMARY;
        tabs.allSameWidth = true;
        tabs.extraTabHeight = fmH * 2;
        tabs.borderColor = Colors.WHITE;
        content.add(tabs, LEFT, TOP, FILL, PARENTSIZE);
        
        tabs.getContainer(0).add(userRecommendationsContainer, CENTER, CENTER);
        tabs.getContainer(1).add(deviceRecommendationsContainer, CENTER, CENTER);

    }


}
