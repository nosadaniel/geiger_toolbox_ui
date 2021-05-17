package com.geiger.toolbox.ui.components;

import com.geiger.toolbox.util.Colors;
import com.geiger.toolbox.util.Fonts;
import com.geiger.toolbox.util.Images;


import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;

import totalcross.ui.image.ImageException;
import totalcross.util.UnitsConverter;

public class CardThreat extends Container{;

    private Label threatText;
    private ImageControl threatIcon;
    private ImageControl threatIndicator;
    private Label riskText;
    private Button btnImprove;
   

    String threatTitle;
    Images riskIcon;
    Images riskIndicator; 
    String riskLevel;
    
    public CardThreat(String threatTitle, Images riskIcon, Images riskIndicator, String riskLevel){
            this.threatTitle = threatTitle;
            this.riskIcon = riskIcon;
            this.riskIndicator = riskIndicator;
            this.riskLevel = riskLevel;
    }

    public void initUI(){

        try{
            
            int textGap = UnitsConverter.toPixels(DP + 10);
            int gap = UnitsConverter.toPixels(DP + 32);
            int imageSize = UnitsConverter.toPixels(DP + 64);
            final int margin = UnitsConverter.toPixels(DP + 6);

            threatIcon = new ImageControl( riskIcon.getImage()
                        .hwScaledFixedAspectRatio(imageSize, true));
            
            threatIcon.centerImage = true;
            
            threatText = new Label(threatTitle);
            threatText.setFont(Fonts.nunitoBoldFont);
            threatText.setForeColor(Colors.TEXT_BLACK);
           

            threatIndicator = new ImageControl( riskIndicator.getImage()
            .hwScaledFixedAspectRatio(imageSize, true));

            riskText = new Label(riskLevel);
            riskText.setFont(Fonts.nunitoRiskLevel);
            riskText.setForeColor(Colors.S_LIGHT);

            btnImprove = new Button("Improve", Button.BORDER_ROUND);
            btnImprove.setBackColor(Colors.PRIMARY);
            btnImprove.setForeColor(Colors.TEXT_ON_P);
            
            

            add(threatText, LEFT + textGap, TOP + margin);
            add(threatIcon, CENTER, CENTER + gap, PREFERRED, PREFERRED);
            add(threatIndicator, RIGHT + margin, TOP + margin, PREFERRED + gap, PREFERRED - gap);
            add(riskText, RIGHT, AFTER, PREFERRED + gap, PREFERRED);
            add(btnImprove, RIGHT, AFTER, PREFERRED, PREFERRED);
            
            
            resizeHeight();
            
            setBorderStyle(BORDER_LOWERED);
            setBorderRadius(8);
        }
        catch(ImageException e){
            e.printStackTrace();
        }
    }



    
    
}
