package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Point extends Geometry {

    @Element(required = false)
    private String altitudeMode;

    @Element(required = false)
    private Coordinate coordinates;

    @Element(required = false)
    private String extrude;

    public String getAltitudeMode() {
        return this.altitudeMode;
    }

    public Coordinate getCoordinates() {
        return this.coordinates;
    }

    public Boolean getExtrude() {
        String str = this.extrude;
        return str != null ? BooleanUtil.valueOf(str) : Boolean.FALSE;
    }

    public void setAltitudeMode(String str) {
        this.altitudeMode = str;
    }

    public void setCoordinates(Coordinate coordinate) {
        this.coordinates = coordinate;
    }

    public void setExtrude(Boolean bool) {
        if (bool != null) {
            this.extrude = bool.toString();
        } else {
            this.extrude = null;
        }
    }

    public void setExtrude(Integer num) {
        if (num != null) {
            this.extrude = Boolean.toString(num.intValue() == 1);
        } else {
            this.extrude = null;
        }
    }
}
