package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;

/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "gx")
public class LatLonQuad {

    @Element(required = false)
    private Coordinates coordinates;

    public Coordinates getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
