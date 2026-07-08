package com.google.gson;

import j$.util.Objects;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f8618a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f8618a = field;
    }

    public String toString() {
        return this.f8618a.toString();
    }
}
