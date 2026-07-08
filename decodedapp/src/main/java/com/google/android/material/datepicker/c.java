package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f7739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f7740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f7741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f7742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b f7743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f7744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b f7745g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Paint f7746h;

    c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(j9.b.f(context, u8.b.f28562r, i.class.getCanonicalName()), u8.l.Z2);
        this.f7739a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(u8.l.f28783d3, 0));
        this.f7745g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(u8.l.f28765b3, 0));
        this.f7740b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(u8.l.f28774c3, 0));
        this.f7741c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(u8.l.f28792e3, 0));
        ColorStateList colorStateListA = j9.c.a(context, typedArrayObtainStyledAttributes, u8.l.f28801f3);
        this.f7742d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(u8.l.f28819h3, 0));
        this.f7743e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(u8.l.f28810g3, 0));
        this.f7744f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(u8.l.f28828i3, 0));
        Paint paint = new Paint();
        this.f7746h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
