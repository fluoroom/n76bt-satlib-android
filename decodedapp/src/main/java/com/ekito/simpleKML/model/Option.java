package com.ekito.simpleKML.model;

import org.simpleframework.xml.Attribute;

/* JADX INFO: loaded from: classes.dex */
public class Option {

    @Attribute(required = false)
    private Integer enabled;

    @Attribute
    private String name;

    public Integer getEnabled() {
        return this.enabled;
    }

    public String getName() {
        return this.name;
    }

    public void setEnabled(Integer num) {
        this.enabled = num;
    }

    public void setName(String str) {
        this.name = str;
    }
}
