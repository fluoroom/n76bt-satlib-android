package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Location {

    @Element
    private Double altitude;

    @Element
    private Double latitude;

    @Element
    private Double longitude;

    public Double getAltitude() {
        return this.altitude;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setAltitude(Double d10) {
        this.altitude = d10;
    }

    public void setLatitude(Double d10) {
        this.latitude = d10;
    }

    public void setLongitude(Double d10) {
        this.longitude = d10;
    }
}
