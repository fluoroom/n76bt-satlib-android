package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Region extends Object {

    @Element(name = "LatLonAltBox", required = false)
    private LatLonAltBox latLonAltBox;

    @Element(name = "Lod", required = false)
    private Lod lod;

    public LatLonAltBox getLatLonAltBox() {
        return this.latLonAltBox;
    }

    public Lod getLod() {
        return this.lod;
    }

    public void setLatLonAltBox(LatLonAltBox latLonAltBox) {
        this.latLonAltBox = latLonAltBox;
    }

    public void setLod(Lod lod) {
        this.lod = lod;
    }
}
