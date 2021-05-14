package com.geiger.toolbox.ui.components;

import com.geiger.toolbox.util.Colors;
import com.geiger.toolbox.util.Fonts;
import com.geiger.toolbox.util.Images;

import org.bouncycastle.crypto.engines.CAST5Engine;

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
    private Container cont1;
    private Container cont2;

    public void initUI(){
        int imageSize = UnitsConverter.toPixels(DP + 64);
        try{
            Images.loadImage();

            int gap = UnitsConverter.toPixels(DP + 4);
            final int margin = UnitsConverter.toPixels(DP + 6);

            

            threatIcon = new ImageControl( Images.phishing_icon
                        .hwScaledFixedAspectRatio((int) (fmH * 7), true));
            

            threatText = new Label("Phishing");
            threatText.setFont(Fonts.nunitoBoldFont);
            threatText.setForeColor(Colors.TEXT_BLACK);
           

            threatIndicator = new ImageControl( Images.risk_indicator
            .hwScaledFixedAspectRatio(imageSize, true));

            riskText = new Label("High");
            riskText.setFont(Fonts.nunitoRegularDefaultSize);
            riskText.setForeColor(Colors.S_LIGHT);

            btnImprove = new Button("Improve", Button.BORDER_ROUND);
            btnImprove.setBackColor(Colors.PRIMARY);
            btnImprove.setForeColor(Colors.TEXT_ON_P);

            add(threatText, LEFT, AFTER);
            add(threatIcon, CENTER, CENTER_OF, PREFERRED, PREFERRED);
            add(threatIndicator, RIGHT, TOP, PREFERRED, PREFERRED);
            add(riskText, RIGHT, CENTER_OF, PREFERRED, PREFERRED);
            add(btnImprove, RIGHT, AFTER + margin);
            
            resizeHeight();


            // cont2.add(threatIcon, LEFT, TOP);
            // cont2.add(riskText, LEFT, AFTER + gap);
            // cont2.add(btnImprove, LEFT, AFTER + gap);
            

            // add(threatText, LEFT, TOP, PARENTSIZE, PARENTSIZE);
            // add(cont1, CENTER, TOP, PARENTSIZE, PARENTSIZE );
            // add(cont2, RIGHT, TOP, PARENTSIZE, PARENTSIZE );


        }
        catch(ImageException e){
            e.printStackTrace();
        }
    }



    
    
}
