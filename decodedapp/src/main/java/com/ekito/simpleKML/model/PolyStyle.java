package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class PolyStyle extends ColorStyle {

    @Element(required = false)
    private String fill;

    @Element(required = false)
    private String outline;

    public String getFill() {
        return this.fill;
    }

    public String getOutline() {
        return this.outline;
    }

    public void setFill(Boolean bool) {
        if (bool != null) {
            this.fill = bool.toString();
        } else {
            this.fill = null;
        }
    }

    public void setOutline(Boolean bool) {
        if (bool != null) {
            this.outline = bool.toString();
        } else {
            this.outline = null;
        }
    }

    public void setFill(String str) {
        this.fill = str;
    }

    public void setOutline(String str) {
        this.outline = str;
    }
}
