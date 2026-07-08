package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class BalloonStyle extends ColorStyle {

    @Element(required = false)
    private String bgColor;

    @Element(required = false)
    private String displayMode;

    @Element(required = false)
    private String text;

    @Element(required = false)
    private String textColor;

    public String getBgColor() {
        return this.bgColor;
    }

    public String getDisplayMode() {
        return this.displayMode;
    }

    public String getText() {
        return this.text;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setDisplayMode(String str) {
        this.displayMode = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }
}
