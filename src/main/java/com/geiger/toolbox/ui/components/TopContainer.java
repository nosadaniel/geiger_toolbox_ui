package com.geiger.toolbox.ui.components;

import com.geiger.toolbox.util.Colors;
import com.geiger.toolbox.util.Fonts;
import com.geiger.toolbox.util.Images;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.FloatingActionButton;
import totalcross.ui.Label;


public class TopContainer extends Container{
  
    public void initUI(){

        Label text = new Label("Your Risk Score:");
        add(text,CENTER, TOP+4);

        Images path = new Images("images/scan_btn2.png");

        Label score = new Label("73.5");
        score.setForeColor(Colors.SCORE_COLOR);
        score.setFont(Fonts.nunitoBoldScoreSize);
        add(score, CENTER, AFTER+2);

        FloatingActionButton scanBtn = new FloatingActionButton(path.getImage());
        scanBtn.setIcon(path.getImage());
        scanBtn.setIconSize(33);
        add(scanBtn, CENTER, AFTER+2);

        Button btnEmployee = new Button("Device Risks", Button.BORDER_OUTLINED);
        btnEmployee.setBackForeColors(Colors.PRIMARY, Colors.TEXT_ON_P_LIGHT);
        add(btnEmployee, LEFT, AFTER+10);

        Button btnDevice= new Button("Employee Risks", Button.BORDER_OUTLINED);
        btnDevice.setBackForeColors(Colors.PRIMARY, Colors.TEXT_ON_P_LIGHT);
        add(btnDevice, RIGHT, CENTER_OF);

        Label currentThreatText= new Label("Current Threats:");
        currentThreatText.setFont(Fonts.nunitoBoldFont);
        add(currentThreatText,LEFT, AFTER+8);

        Label threatRiskText = new Label("Threat Risk");
        add(threatRiskText, RIGHT, CENTER_OF);
        resizeHeight();

    }

}
