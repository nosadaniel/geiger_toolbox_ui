package com.geiger.toolbox.ui.screens;

import com.geiger.toolbox.ui.BaseScreen;
import com.geiger.toolbox.ui.components.CardThreat;
import com.geiger.toolbox.ui.components.TopContainer;
import totalcross.sys.Settings;
import totalcross.ui.ScrollContainer;
import totalcross.util.UnitsConverter;

public class ScanRiskScreen extends BaseScreen{
    
    private int gap = (int) (Settings.screenDensity * 10);
   

    
   
    @Override
    public void onContent(ScrollContainer content){
        
        final int DP_10 = (int) (Settings.screenDensity * 2);
        content.setInsets(0, 0, DP_10, DP_10);
        int space = UnitsConverter.toPixels(DP + 10);
        content.add(new TopContainer(),LEFT +gap, AFTER, FILL - gap, PREFERRED);  
        content.add(new CardThreat(), LEFT + gap, AFTER + space, FILL - gap, PREFERRED);
        content.add(new CardThreat(), LEFT + gap, AFTER + space, FILL - gap, PREFERRED);
        content.add(new CardThreat(), LEFT + gap, AFTER + space, FILL - gap, PREFERRED);
        content.add(new CardThreat(), LEFT + gap, AFTER + space, FILL - gap, PREFERRED);


        
    }
    // listContainers = new Container();
    //     listContainers.setBackColor(Colors.PRIMARY);
    //     final int DP_10 = (int) (Settings.screenDensity * 10);
    //     listContainers.setInsets(0, 0, DP_10, DP_10);
    //     add(listContainers, LEFT + MaterialConstants.BORDER_SPACING, AFTER, 
    //     FILL - MaterialConstants.BORDER_SPACING, PARENTSIZE);

    
}
