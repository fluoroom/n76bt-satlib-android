package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Lod {

    @Element(required = false)
    private Float maxFadeExtent;

    @Element(required = false)
    private Float maxLodPixels;

    @Element(required = false)
    private Float minFadeExtent;

    @Element(required = false)
    private Float minLodPixels;

    public Float getMaxFadeExtent() {
        return this.maxFadeExtent;
    }

    public Float getMaxLodPixels() {
        return this.maxLodPixels;
    }

    public Float getMinFadeExtent() {
        return this.minFadeExtent;
    }

    public Float getMinLodPixels() {
        return this.minLodPixels;
    }

    public void setMaxFadeExtent(Float f10) {
        this.maxFadeExtent = f10;
    }

    public void setMaxLodPixels(Float f10) {
        this.maxLodPixels = f10;
    }

    public void setMinFadeExtent(Float f10) {
        this.minFadeExtent = f10;
    }

    public void setMinLodPixels(Float f10) {
        this.minLodPixels = f10;
    }
}
