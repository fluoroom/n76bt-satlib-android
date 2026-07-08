package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Model extends Geometry {

    @Element(required = false)
    private String altitudeMode;

    @Element(name = "Link", required = false)
    private Location link;

    @Element(name = "Location", required = false)
    private Location location;

    @Element(name = "Orientation", required = false)
    private Location orientation;

    @Element(name = "ResourceMap", required = false)
    private ResourceMap resourceMap;

    @Element(name = "Scale", required = false)
    private Location scale;

    public String getAltitudeMode() {
        return this.altitudeMode;
    }

    public Location getLink() {
        return this.link;
    }

    public Location getLocation() {
        return this.location;
    }

    public Location getOrientation() {
        return this.orientation;
    }

    public ResourceMap getResourceMap() {
        return this.resourceMap;
    }

    public Location getScale() {
        return this.scale;
    }

    public void setAltitudeMode(String str) {
        this.altitudeMode = str;
    }

    public void setLink(Location location) {
        this.link = location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setOrientation(Location location) {
        this.orientation = location;
    }

    public void setResourceMap(ResourceMap resourceMap) {
        this.resourceMap = resourceMap;
    }

    public void setScale(Location location) {
        this.scale = location;
    }
}
