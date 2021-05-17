package com.geiger.toolbox.ui.screens;

import com.geiger.toolbox.ui.BaseScreen;
import com.geiger.toolbox.ui.components.CardThreat;
import com.geiger.toolbox.ui.components.TopContainer;
import com.geiger.toolbox.util.Images;

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
        content.add(new TopContainer(),LEFT +gap, AFTER, FILL - space, PREFERRED);  
        content.add(new CardThreat("Phishing", new Images("images/phishing.png"), new Images("images/indicator.png"), "High"), LEFT + gap, AFTER + space, FILL - gap, PREFERRED);
        content.add(new CardThreat("Malware", new Images("images/malware.png"), new Images("images/indicator.png"), "Low"), LEFT + gap, AFTER + space, FILL - gap, PREFERRED);
        content.add(new CardThreat("Spam", new Images("images/spam.png"), new Images("images/indicator.png"), "High"), LEFT + gap, AFTER + space, FILL - gap, PREFERRED);
        content.add(new CardThreat("Web Attack", new Images("images/web_attack.png"), new Images("images/indicator.png"), "Very High"), LEFT + gap, AFTER + space, FILL - gap, PREFERRED + UnitsConverter.toPixels(DP + 30));


        
    }
    
    
}
