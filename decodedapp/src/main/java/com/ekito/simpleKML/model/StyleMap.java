package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.ElementList;

/* JADX INFO: loaded from: classes.dex */
public class StyleMap extends StyleSelector {

    @ElementList(entry = "Pair", inline = true, required = false, type = Pair.class)
    private List<Pair> pairList;

    public List<Pair> getPairList() {
        return this.pairList;
    }

    public void setPairList(List<Pair> list) {
        this.pairList = list;
    }
}
