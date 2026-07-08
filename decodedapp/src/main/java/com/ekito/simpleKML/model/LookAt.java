package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class LookAt extends AbstractView {

    @Element(required = false)
    private Double altitude;

    @Element(required = false)
    private String altitudeMode;

    @Element(required = false)
    private Double heading;

    @Element(required = false)
    private Double latitude;

    @Element(required = false)
    private Double longitude;

    @Element(required = false)
    private Double range;

    @Element(required = false)
    private Double tilt;

    public Double getAltitude() {
        return this.altitude;
    }

    public String getAltitudeMode() {
        return this.altitudeMode;
    }

    public Double getHeading() {
        return this.heading;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Double getRange() {
        return this.range;
    }

    public Double getTilt() {
        return this.tilt;
    }

    public void setAltitude(Double d10) {
        this.altitude = d10;
    }

    public void setAltitudeMode(String str) {
        this.altitudeMode = str;
    }

    public void setHeading(Double d10) {
        this.heading = d10;
    }

    public void setLatitude(Double d10) {
        this.latitude = d10;
    }

    public void setLongitude(Double d10) {
        this.longitude = d10;
    }

    public void setRange(Double d10) {
        this.range = d10;
    }

    public void setTilt(Double d10) {
        this.tilt = d10;
    }
}
