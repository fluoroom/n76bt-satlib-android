package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class LabelStyle extends ColorStyle {

    @Element(required = false)
    private Float scale;

    public Float getScale() {
        return this.scale;
    }

    public void setScale(Float f10) {
        this.scale = f10;
    }
}
