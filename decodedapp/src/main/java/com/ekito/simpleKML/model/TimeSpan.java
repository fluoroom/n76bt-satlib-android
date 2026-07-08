package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class TimeSpan extends TimePrimitive {

    @Element(required = false)
    private String begin;

    @Element(required = false)
    private String end;

    public String getBegin() {
        return this.begin;
    }

    public String getEnd() {
        return this.end;
    }

    public void setBegin(String str) {
        this.begin = str;
    }

    public void setEnd(String str) {
        this.end = str;
    }
}
