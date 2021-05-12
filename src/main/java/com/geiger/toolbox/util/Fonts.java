package com.geiger.toolbox.util;

import totalcross.ui.font.Font;

public class Fonts {
    public static final int FONT_DEFAULT_SIZE = 16;

    public static Font nunitoRegularDefaultSize;
    public static Font nunitoLightDefaultSize;
    public static Font nunitoBoldFont;
    public static Font nunitoItalic;
    static{

        //Nunito Regular
        nunitoRegularDefaultSize = Font.getFont("fonts/Nunito-Regular.ttf", false, FONT_DEFAULT_SIZE);

        //Nunito Light
        nunitoLightDefaultSize = Font.getFont("fonts/Nunito-Light.ttf", false, FONT_DEFAULT_SIZE);

        //Nunito bold
        nunitoBoldFont = Font.getFont("fonts/Nunito-Bold.ttf", true, FONT_DEFAULT_SIZE);

        //Nunito italic
        nunitoItalic = Font.getFont("fonts/Nunito-Italic.ttf", false, FONT_DEFAULT_SIZE);
    }
}
