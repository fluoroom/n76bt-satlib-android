package com.ekito.simpleKML.model;

import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

/* JADX INFO: loaded from: classes.dex */
public class Schema extends Object {

    @Attribute(required = false)
    private String name;

    @ElementList(entry = "SimpleField", inline = true, required = false)
    private List<SimpleField> simpleFieldList;

    public String getName() {
        return this.name;
    }

    public List<SimpleField> getSimpleFieldList() {
        return this.simpleFieldList;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSimpleFieldList(List<SimpleField> list) {
        this.simpleFieldList = list;
    }
}
