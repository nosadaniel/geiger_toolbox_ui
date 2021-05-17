package com.geiger.toolbox.ui;

import totalcross.ui.Bar;

import totalcross.ui.Container;

import totalcross.ui.ScrollContainer;





public abstract class BaseScreen extends Container {
    public Bar bar;
    protected ScrollContainer content;
    protected boolean allowVerticalScroll = true;
    protected boolean allowHorizontalScroll = false;



    @Override
    public void initUI(){
        
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
    
   
}
