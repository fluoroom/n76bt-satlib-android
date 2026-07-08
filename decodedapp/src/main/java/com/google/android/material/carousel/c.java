package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f7627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f7628b;

    enum a {
        CONTAINED,
        UNCONTAINED
    }

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    public static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.f7628b;
    }

    public float d() {
        return this.f7627a;
    }

    a e() {
        return a.CONTAINED;
    }

    void f(Context context) {
        float fH = this.f7627a;
        if (fH <= 0.0f) {
            fH = d.h(context);
        }
        this.f7627a = fH;
        float fG = this.f7628b;
        if (fG <= 0.0f) {
            fG = d.g(context);
        }
        this.f7628b = fG;
    }

    public abstract e g(z8.a aVar, View view);

    public abstract boolean h(z8.a aVar, int i10);
}
