package com.geiger.toolbox.ui.components;

import com.geiger.toolbox.util.Colors;
import com.geiger.toolbox.util.Fonts;
import com.geiger.toolbox.util.Images;


import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Control;
import totalcross.ui.ImageControl;
import totalcross.ui.Label;
import totalcross.ui.MainWindow;
import totalcross.ui.MaterialWindow;
import totalcross.ui.Presenter;
import totalcross.ui.image.ImageException;
import totalcross.util.UnitsConverter;

public class CardThreat extends Container{;

    private Label threatText;
    private ImageControl threatIcon;
    private IndicatorGauge threatIndicator;
    private Label riskText;
    private Button btnImprove;
   

    String threatTitle;
    Images riskIcon;
    int indicatorValue;
    String riskLevel;
    Container recommendationScreen;
   
    public CardThreat(String threatTitle, Images riskIcon, int indicatorValue, String riskLevel, Container recommendationScreen){
            this.threatTitle = threatTitle;
            this.riskIcon = riskIcon;
            this.indicatorValue = indicatorValue;
            this.riskLevel = riskLevel;
            this.recommendationScreen =  recommendationScreen;
            
    }

    public void initUI(){

        try{
            
            int textGap = UnitsConverter.toPixels(DP + 4);
            int gap = UnitsConverter.toPixels(DP + 32);
            int imageSize = UnitsConverter.toPixels(DP + 110);
            final int margin = UnitsConverter.toPixels(DP + 6);

            threatIcon = new ImageControl( riskIcon.getImage()
                        .hwScaledFixedAspectRatio(imageSize, true));
            
            threatIcon.centerImage = true;
            
            threatText = new Label(threatTitle);
            threatText.autoSplit = true;
            threatText.setFont(Fonts.nunitoBoldFont);
            threatText.setForeColor(Colors.TEXT_BLACK);
           

            threatIndicator = new IndicatorGauge(indicatorValue);
            
            riskText = new Label(riskLevel);
            riskText.setFont(Fonts.nunitoRiskLevel);
            riskText.setForeColor(Colors.S_LIGHT);

            btnImprove = new Button("Improve", Button.BORDER_ROUND);
            btnImprove.setBackColor(Colors.PRIMARY);
            btnImprove.setForeColor(Colors.TEXT_ON_P);
            btnImprove.addPressListener(
                (e) -> {
                    MaterialWindow materialWindow = new MaterialWindow(threatTitle, false, new Presenter<Container>() {  
                        @Override
                        public Container getView(){
                            return recommendationScreen;
                        }
                    });
                    materialWindow.popup();
                });
            
            

            add(threatText, LEFT + textGap, TOP + margin, PREFERRED, PREFERRED);
            add(threatIcon, CENTER, CENTER, PREFERRED, PREFERRED);
            add(threatIndicator, RIGHT - 2, TOP + 5, PARENTSIZE + 25 , PARENTSIZE + 45);
            add(riskText, RIGHT - gap, AFTER + 2);
            add(btnImprove, RIGHT - margin, AFTER - UnitsConverter.toPixels(DP + 2));
            
            
            
            
            setBorderStyle(BORDER_LOWERED);
            // setBorderRadius(28);
        }
        catch(ImageException e){
            e.printStackTrace();
        }
    }



    
    
}
