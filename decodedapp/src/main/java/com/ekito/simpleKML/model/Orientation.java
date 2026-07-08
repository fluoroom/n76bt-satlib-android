package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Orientation {

    @Element
    private Float heading;

    @Element
    private Float roll;

    @Element
    private Float tilt;

    public Float getHeading() {
        return this.heading;
    }

    public Float getRoll() {
        return this.roll;
    }

    public Float getTilt() {
        return this.tilt;
    }

    public void setHeading(Float f10) {
        this.heading = f10;
    }

    public void setRoll(Float f10) {
        this.roll = f10;
    }

    public void setTilt(Float f10) {
        this.tilt = f10;
    }
}
