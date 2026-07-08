package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class LatLonBox {

    @Element(required = false)
    private String east;

    @Element(required = false)
    private String north;

    @Element(required = false)
    private Float rotation;

    @Element(required = false)
    private String south;

    @Element(required = false)
    private String west;

    public String getEast() {
        return this.east;
    }

    public String getNorth() {
        return this.north;
    }

    public Float getRotation() {
        return this.rotation;
    }

    public String getSouth() {
        return this.south;
    }

    public String getWest() {
        return this.west;
    }

    public void setEast(String str) {
        this.east = str;
    }

    public void setNorth(String str) {
        this.north = str;
    }

    public void setRotation(Float f10) {
        this.rotation = f10;
    }

    public void setSouth(String str) {
        this.south = str;
    }

    public void setWest(String str) {
        this.west = str;
    }
}
