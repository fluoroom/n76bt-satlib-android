package com.google.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Field f10160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Field f10161c;

    public y1(int i10, Field field, Field field2) {
        this.f10159a = i10;
        this.f10160b = field;
        this.f10161c = field2;
    }

    public Field a() {
        return this.f10160b;
    }

    public Field b() {
        return this.f10161c;
    }
}
