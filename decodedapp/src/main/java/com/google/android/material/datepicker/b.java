package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f7733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f7734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f7735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f7736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m9.l f7738f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, m9.l lVar, Rect rect) {
        l0.g.d(rect.left);
        l0.g.d(rect.top);
        l0.g.d(rect.right);
        l0.g.d(rect.bottom);
        this.f7733a = rect;
        this.f7734b = colorStateList2;
        this.f7735c = colorStateList;
        this.f7736d = colorStateList3;
        this.f7737e = i10;
        this.f7738f = lVar;
    }

    static b a(Context context, int i10) {
        l0.g.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, u8.l.f28837j3);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(u8.l.f28846k3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(u8.l.f28864m3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(u8.l.f28855l3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(u8.l.f28873n3, 0));
        ColorStateList colorStateListA = j9.c.a(context, typedArrayObtainStyledAttributes, u8.l.f28882o3);
        ColorStateList colorStateListA2 = j9.c.a(context, typedArrayObtainStyledAttributes, u8.l.f28927t3);
        ColorStateList colorStateListA3 = j9.c.a(context, typedArrayObtainStyledAttributes, u8.l.f28909r3);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(u8.l.f28918s3, 0);
        m9.l lVarM = m9.l.b(context, typedArrayObtainStyledAttributes.getResourceId(u8.l.f28891p3, 0), typedArrayObtainStyledAttributes.getResourceId(u8.l.f28900q3, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, lVarM, rect);
    }

    void b(TextView textView) {
        c(textView, null, null);
    }

    void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        m9.h hVar = new m9.h();
        m9.h hVar2 = new m9.h();
        hVar.setShapeAppearanceModel(this.f7738f);
        hVar2.setShapeAppearanceModel(this.f7738f);
        if (colorStateList == null) {
            colorStateList = this.f7735c;
        }
        hVar.c0(colorStateList);
        hVar.j0(this.f7737e, this.f7736d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f7734b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f7734b.withAlpha(30), hVar, hVar2);
        Rect rect = this.f7733a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
