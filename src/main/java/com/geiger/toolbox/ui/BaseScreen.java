package com.geiger.toolbox.ui;

import com.geiger.toolbox.util.Colors;
import com.geiger.toolbox.util.Fonts;
import com.geiger.toolbox.util.Images;

import totalcross.ui.Bar;
import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.ScrollContainer;
import totalcross.ui.font.Font;
import totalcross.ui.gfx.Color;
import totalcross.ui.gfx.Graphics;
import totalcross.ui.icon.IconType;
import totalcross.util.UnitsConverter;
import totalcross.util.concurrent.Lock;




public abstract class BaseScreen extends Container {
    public Bar bar;
    protected ScrollContainer content;
    protected boolean allowVerticalScroll = true;
    protected boolean allowHorizontalScroll = false;



    @Override
    public void initUI(){
        
        Images.loadImage();
        /*
        bar = new Bar("Geiger Toolbox");
        bar.addButton(Images.nav_icon, false);
        bar.setFont(Fonts.nunitoBoldFont);
        bar.setForeColor(Colors.TEXT_BLACK);
        */

        System.out.println("TOP BAR SHOWING" );

        //place bar at the top of the screen
        //add(bar, LEFT, TOP, FILL, PREFERRED);

        

        content = new ScrollContainer() {
            @Override
            public void initUI() {
                setScrollBars(allowHorizontalScroll, allowVerticalScroll);
                super.initUI();
            }
        };
        

        // Content
        add(content, CENTER, AFTER, PARENTSIZE, FILL);
        onContent(content);

    }
    public abstract void onContent(ScrollContainer content);
    
    // public class ExtraButton extends Button {
    //     IconType iconType;
    //     final int UNDEFINED = -999999;
    //     int textX, iconX, iconY; // centralized text
    //     String originalText;
    //     final Lock lock = new Lock();
    //     public ExtraButton(IconType iconType, String text) {
    //         super(text);
    //         originalText = text;
    //         backColor = Colors.PRIMARY;
    //         transparentBackground = true;
    //         setNinePatch(null);
    //         this.iconType = iconType;
    //         textX = iconX = iconY = UNDEFINED;
    //     }

    //     @Override
    //     protected void onBoundsChanged(boolean screenChanged) {
    //         super.onBoundsChanged(screenChanged);
    //         if(screenChanged)
    //             textX = iconX = iconY = UNDEFINED;
    //     }

    //     @Override
    //     public void onPaint(Graphics g) {
    //         if(!isEnabled()) {
    //             foreColor = Color.getCursorColor(Color.WHITE);
    //         }
    //         else {
    //             foreColor = Color.WHITE;
    //         }
    //         g.foreColor = this.foreColor;

    //         Font bkpFont = this.font;
    //         Font iconFont = Font.getFont(iconType.fontName(), false, 18);

    //         if(textX == UNDEFINED) {
    //             int totalTextAndIconWidth = iconFont.fm.stringWidth(iconType.toString())
    //                     + UnitsConverter.toPixels(DP + 8) + bkpFont.fm.stringWidth(originalText);
    //             int desiredIconX = (getWidth() - totalTextAndIconWidth) / 2;
    //             setText(originalText);
    //             textX = (getWidth() - fm.stringWidth(text)) / 2;
    //             iconX = textX
    //                     - UnitsConverter.toPixels(DP + 8)
    //                     - iconFont.fm.stringWidth(iconType.toString());
    //             iconY = (getHeight() - iconFont.fm.height) / 2;
    //             int spaceSize = fm.stringWidth(" ");
    //             while (iconX < desiredIconX && textX > 0) { //shift until icon and text get on the middle
    //                 setText(" " + getText());
    //                 iconX += spaceSize;
    //             }
    //         }

    //         super.onPaint(g);

    //         g.setFont(iconFont);
    //         g.foreColor = foreColor;
    //         g.drawText(iconType.toString(), iconX, iconY);
    //         g.setFont(bkpFont); // restore font
    //     }
    // }
}
