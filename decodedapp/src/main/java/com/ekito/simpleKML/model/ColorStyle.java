package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public abstract class ColorStyle extends Object {

    @Element(required = false)
    private String color;

    @Element(required = false)
    private String colorMode;

    public String getColor() {
        return this.color;
    }

    public String getColorMode() {
        return this.colorMode;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setColorMode(String str) {
        this.colorMode = str;
    }
}
