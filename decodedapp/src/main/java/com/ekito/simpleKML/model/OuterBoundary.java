package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class OuterBoundary {

    @Element(name = "LinearRing", required = false)
    private LinearRing linearRing;

    public LinearRing getLinearRing() {
        return this.linearRing;
    }

    public void setLinearRing(LinearRing linearRing) {
        this.linearRing = linearRing;
    }
}
