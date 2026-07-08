package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class TimeStamp extends TimePrimitive {

    @Element(required = false)
    private String when;

    public String getWhen() {
        return this.when;
    }

    public void setWhen(String str) {
        this.when = str;
    }
}
