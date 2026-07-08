package com.ekito.simpleKML.model;

import org.simpleframework.xml.Element;

/* JADX INFO: loaded from: classes.dex */
public class Alias {

    @Element(required = false)
    private String sourceHref;

    @Element(required = false)
    private String targetHref;

    public String getSourceHref() {
        return this.sourceHref;
    }

    public String getTargetHref() {
        return this.targetHref;
    }

    public void setSourceHref(String str) {
        this.sourceHref = str;
    }

    public void setTargetHref(String str) {
        this.targetHref = str;
    }
}
