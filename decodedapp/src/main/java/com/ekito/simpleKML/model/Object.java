package com.ekito.simpleKML.model;

import org.simpleframework.xml.Attribute;

/* JADX INFO: loaded from: classes.dex */
public abstract class Object {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Attribute(required = false)
    private String f7064id;

    public String getId() {
        return this.f7064id;
    }

    public void setId(String str) {
        this.f7064id = str;
    }
}
