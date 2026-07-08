package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class GroundOverlay extends Overlay {

    @Element(required = false)
    private Double altitude;

    @Element(required = false)
    private String altitudeMode;

    @Element(name = "LatLonBox", required = false)
    private LatLonBox latLonBox;

    @Element(name = "LatLonQuad", required = false)
    private LatLonQuad latLonQuad;

    public Double getAltitude() {
        return this.altitude;
    }

    public String getAltitudeMode() {
        return this.altitudeMode;
    }

    public LatLonBox getLatLonBox() {
        return this.latLonBox;
    }

    public LatLonQuad getLatLonQuad() {
        return this.latLonQuad;
    }

    public void setAltitude(Double d10) {
        this.altitude = d10;
    }

    public void setAltitudeMode(String str) {
        this.altitudeMode = str;
    }

    public void setLatLonBox(LatLonBox latLonBox) {
        this.latLonBox = latLonBox;
    }

    public void setLatLonQuad(LatLonQuad latLonQuad) {
        this.latLonQuad = latLonQuad;
    }
}
