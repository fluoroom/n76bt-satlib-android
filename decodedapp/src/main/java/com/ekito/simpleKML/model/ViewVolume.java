package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class ViewVolume {

    @Element(required = false)
    private Double bottomFov;

    @Element(required = false)
    private Double leftFov;

    @Element(required = false)
    private Double near;

    @Element(required = false)
    private Double rightFov;

    @Element(required = false)
    private Double topFov;

    public Double getBottomFov() {
        return this.bottomFov;
    }

    public Double getLeftFov() {
        return this.leftFov;
    }

    public Double getNear() {
        return this.near;
    }

    public Double getRightFov() {
        return this.rightFov;
    }

    public Double getTopFov() {
        return this.topFov;
    }

    public void setBottomFov(Double d10) {
        this.bottomFov = d10;
    }

    public void setLeftFov(Double d10) {
        this.leftFov = d10;
    }

    public void setNear(Double d10) {
        this.near = d10;
    }

    public void setRightFov(Double d10) {
        this.rightFov = d10;
    }

    public void setTopFov(Double d10) {
        this.topFov = d10;
    }
}
