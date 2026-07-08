package com.ekito.simpleKML.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Data {

    @Element(required = false)
    private String displayName;

    @Attribute(required = false)
    private String name;

    @Element(required = false)
    private String value;

    public String getDisplayName() {
        return this.displayName;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
