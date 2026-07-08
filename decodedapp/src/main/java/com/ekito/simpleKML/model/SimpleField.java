package com.ekito.simpleKML.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class SimpleField {

    @Element(required = false)
    private String displayName;

    @Attribute(required = false)
    private String name;

    @Attribute(required = false)
    private String type;

    public String getDisplayName() {
        return this.displayName;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
