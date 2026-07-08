package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class IconStyle extends ColorStyle {

    @Element(required = false)
    private Float heading;

    @Element(required = false)
    private HotSpot hotSpot;

    @Element(name = "Icon", required = false)
    private Icon icon;

    @Element(required = false)
    private Float scale;

    public Float getHeading() {
        return this.heading;
    }

    public HotSpot getHotSpot() {
        return this.hotSpot;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public Float getScale() {
        return this.scale;
    }

    public void setHeading(Float f10) {
        this.heading = f10;
    }

    public void setHotSpot(HotSpot hotSpot) {
        this.hotSpot = hotSpot;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void setScale(Float f10) {
        this.scale = f10;
    }
}
