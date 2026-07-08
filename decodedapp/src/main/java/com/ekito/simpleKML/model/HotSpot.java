package com.ekito.simpleKML.model;

import org.simpleframework.xml.Attribute;

/* JADX INFO: loaded from: classes.dex */
public class HotSpot {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Attribute(required = false)
    private Double f7062x;

    @Attribute(required = false)
    private String xunits;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Attribute(required = false)
    private Double f7063y;

    @Attribute(required = false)
    private String yunits;

    public Double getX() {
        return this.f7062x;
    }

    public String getXunits() {
        return this.xunits;
    }

    public Double getY() {
        return this.f7063y;
    }

    public String getYunits() {
        return this.yunits;
    }

    public void setX(Double d10) {
        this.f7062x = d10;
    }

    public void setXunits(String str) {
        this.xunits = str;
    }

    public void setY(Double d10) {
        this.f7063y = d10;
    }

    public void setYunits(String str) {
        this.yunits = str;
    }
}
