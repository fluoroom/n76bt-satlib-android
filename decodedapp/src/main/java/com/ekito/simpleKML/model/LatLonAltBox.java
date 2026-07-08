package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class LatLonAltBox {

    @Element(required = false)
    private String altitudeMode;

    @Element(required = false)
    private String east;

    @Element(required = false)
    private Double maxAltitude;

    @Element(required = false)
    private Double minAltitude;

    @Element(required = false)
    private String north;

    @Element(required = false)
    private String south;

    @Element(required = false)
    private String west;

    public String getAltitudeMode() {
        return this.altitudeMode;
    }

    public String getEast() {
        return this.east;
    }

    public Double getMaxAltitude() {
        return this.maxAltitude;
    }

    public Double getMinAltitude() {
        return this.minAltitude;
    }

    public String getNorth() {
        return this.north;
    }

    public String getSouth() {
        return this.south;
    }

    public String getWest() {
        return this.west;
    }

    public void setAltitudeMode(String str) {
        this.altitudeMode = str;
    }

    public void setEast(String str) {
        this.east = str;
    }

    public void setMaxAltitude(Double d10) {
        this.maxAltitude = d10;
    }

    public void setMinAltitude(Double d10) {
        this.minAltitude = d10;
    }

    public void setNorth(String str) {
        this.north = str;
    }

    public void setSouth(String str) {
        this.south = str;
    }

    public void setWest(String str) {
        this.west = str;
    }
}
