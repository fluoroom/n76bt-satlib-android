package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.ElementList;

/* JADX INFO: loaded from: classes.dex */
public class ResourceMap {

    @ElementList(entry = "Alias", inline = true, required = false)
    private List<Alias> alias;

    public List<Alias> getAlias() {
        return this.alias;
    }

    public void setAlias(List<Alias> list) {
        this.alias = list;
    }
}
