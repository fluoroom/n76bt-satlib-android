package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Pair extends Object {

    @Element(required = false)
    private String key;

    @Element(name = "Style", required = false)
    private Style style;

    @Element(required = false)
    private String styleUrl;

    public String getKey() {
        return this.key;
    }

    public Style getStyle() {
        return this.style;
    }

    public String getStyleUrl() {
        return this.styleUrl;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public void setStyleUrl(String str) {
        this.styleUrl = str;
    }
}
