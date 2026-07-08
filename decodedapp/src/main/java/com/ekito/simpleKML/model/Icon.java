package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Icon extends Object {

    @Element(required = false)
    private String href;

    @Element(required = false)
    private String state;

    public String getHref() {
        return this.href;
    }

    public String getState() {
        return this.state;
    }

    public void setHref(String str) {
        this.href = str;
    }

    public void setState(String str) {
        this.state = str;
    }
}
