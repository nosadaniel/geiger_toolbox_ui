package com.geiger.toolbox.ui;



import com.geiger.toolbox.ui.components.CardThreat;
import com.geiger.toolbox.ui.components.TopContainer;
import com.geiger.toolbox.util.Colors;
import com.geiger.toolbox.util.Fonts;
import com.geiger.toolbox.util.Images;
import com.geiger.toolbox.util.MaterialConstants;

import totalcross.sys.Settings;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.FloatingActionButton;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.util.UnitsConverter;


public class HomeScreen extends BaseScreen{
    
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
