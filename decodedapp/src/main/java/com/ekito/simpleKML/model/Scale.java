package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Scale {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Element
    private Float f7065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Element
    private Float f7066y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Element
    private Float f7067z;

    public Float getX() {
        return this.f7065x;
    }

    public Float getY() {
        return this.f7066y;
    }

    public Float getZ() {
        return this.f7067z;
    }

    public void setX(Float f10) {
        this.f7065x = f10;
    }

    public void setY(Float f10) {
        this.f7066y = f10;
    }

    public void setZ(Float f10) {
        this.f7067z = f10;
    }
}
