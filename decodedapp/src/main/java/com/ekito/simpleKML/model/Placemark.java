package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;

/* JADX INFO: loaded from: classes.dex */
public class Placemark extends Feature {

    @ElementUnion({@Element(name = "Point", required = false, type = Point.class), @Element(name = "LineString", required = false, type = LineString.class), @Element(name = "LinearRing", required = false, type = LinearRing.class), @Element(name = "Polygon", required = false, type = Polygon.class), @Element(name = "MultiGeometry", required = false, type = MultiGeometry.class), @Element(name = "MultiTrack", required = false, type = MultiTrack.class), @Element(name = "Model", required = false, type = Model.class), @Element(name = "Track", required = false, type = Track.class)})
    private Geometry geometry;

    public Geometry getGeometry() {
        return this.geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
