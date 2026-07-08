package com.ekito.simpleKML.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

/* JADX INFO: loaded from: classes.dex */
public class SimpleData {

    @Attribute(required = false)
    private String name;

    @Text(required = false)
    private String value;

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
