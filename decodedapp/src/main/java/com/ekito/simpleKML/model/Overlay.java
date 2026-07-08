package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Overlay extends Feature {

    @Element(required = false)
    private String color;

    @Element(required = false)
    private Integer drawOrder;

    @Element(name = "Icon", required = false)
    private Icon icon;

    public String getColor() {
        return this.color;
    }

    public Integer getDrawOrder() {
        return this.drawOrder;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setDrawOrder(Integer num) {
        this.drawOrder = num;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }
}
