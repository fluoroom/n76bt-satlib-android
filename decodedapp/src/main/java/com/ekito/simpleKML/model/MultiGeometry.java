package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;

/* JADX INFO: loaded from: classes.dex */
public class MultiGeometry extends Geometry {

    @ElementListUnion({@ElementList(entry = "Point", inline = true, required = false, type = Point.class), @ElementList(entry = "LineString", inline = true, required = false, type = LineString.class), @ElementList(entry = "LinearRing", inline = true, required = false, type = LinearRing.class), @ElementList(entry = "Polygon", inline = true, required = false, type = Polygon.class), @ElementList(entry = "MultiGeometry", inline = true, required = false, type = MultiGeometry.class), @ElementList(entry = "MultiTrack", inline = true, required = false, type = MultiTrack.class), @ElementList(entry = "Model", inline = true, required = false, type = Model.class), @ElementList(entry = "Track", inline = true, required = false, type = Track.class)})
    private List<Geometry> geometryList;

    public List<Geometry> getGeometryList() {
        return this.geometryList;
    }

    public void setGeometryList(List<Geometry> list) {
        this.geometryList = list;
    }
}
