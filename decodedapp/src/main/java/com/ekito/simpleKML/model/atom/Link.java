package com.ekito.simpleKML.model.atom;

import org.simpleframework.xml.Attribute;

/* JADX INFO: loaded from: classes.dex */
public class Link {

    @Attribute
    private String href;

    public String getHref() {
        return this.href;
    }

    public void setHref(String str) {
        this.href = str;
    }
}
