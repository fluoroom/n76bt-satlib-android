package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class ScreenOverlay extends Overlay {

    @Element(required = false)
    private HotSpot overlayXY;

    @Element(required = false)
    private Float rotation;

    @Element(required = false)
    private HotSpot rotationXY;

    @Element(required = false)
    private HotSpot screenXY;

    @Element(required = false)
    private HotSpot size;

    public HotSpot getOverlayXY() {
        return this.overlayXY;
    }

    public Float getRotation() {
        return this.rotation;
    }

    public HotSpot getRotationXY() {
        return this.rotationXY;
    }

    public HotSpot getScreenXY() {
        return this.screenXY;
    }

    public HotSpot getSize() {
        return this.size;
    }

    public void setOverlayXY(HotSpot hotSpot) {
        this.overlayXY = hotSpot;
    }

    public void setRotation(Float f10) {
        this.rotation = f10;
    }

    public void setRotationXY(HotSpot hotSpot) {
        this.rotationXY = hotSpot;
    }

    public void setScreenXY(HotSpot hotSpot) {
        this.screenXY = hotSpot;
    }

    public void setSize(HotSpot hotSpot) {
        this.size = hotSpot;
    }
}
