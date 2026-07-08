package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

/* JADX INFO: loaded from: classes.dex */
public class LinearRing extends Geometry {

    @Element(required = false)
    private String altitudeMode;

    @Element(required = false)
    @Namespace(prefix = "gx")
    private Integer altitudeOffset;

    @Element(required = false)
    private Coordinates coordinates;

    @Element(required = false)
    private String extrude;

    @Element(required = false)
    private String tessellate;

    public String getAltitudeMode() {
        return this.altitudeMode;
    }

    public Integer getAltitudeOffset() {
        return this.altitudeOffset;
    }

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    public Boolean getExtrude() {
        String str = this.extrude;
        return str != null ? BooleanUtil.valueOf(str) : Boolean.FALSE;
    }

    public Boolean getTessellate() {
        String str = this.tessellate;
        return str != null ? BooleanUtil.valueOf(str) : Boolean.FALSE;
    }

    public void setAltitudeMode(String str) {
        this.altitudeMode = str;
    }

    public void setAltitudeOffset(Integer num) {
        this.altitudeOffset = num;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setExtrude(Boolean bool) {
        if (bool != null) {
            this.extrude = bool.toString();
        } else {
            this.extrude = null;
        }
    }

    public void setTessellate(Boolean bool) {
        if (bool != null) {
            this.tessellate = bool.toString();
        } else {
            this.tessellate = null;
        }
    }

    public void setExtrude(Integer num) {
        if (num != null) {
            this.extrude = Boolean.toString(num.intValue() == 1);
        } else {
            this.extrude = null;
        }
    }

    public void setTessellate(Integer num) {
        if (num != null) {
            this.tessellate = Boolean.toString(num.intValue() == 1);
        } else {
            this.tessellate = null;
        }
    }
}
