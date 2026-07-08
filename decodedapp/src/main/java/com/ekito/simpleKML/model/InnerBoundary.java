package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.ElementList;

/* JADX INFO: loaded from: classes.dex */
public class InnerBoundary {

    @ElementList(entry = "LinearRing", inline = true, required = false, type = LinearRing.class)
    private List<LinearRing> linearRingList;

    public List<LinearRing> getLinearRingList() {
        return this.linearRingList;
    }

    public void setLinearRingList(List<LinearRing> list) {
        this.linearRingList = list;
    }
}
