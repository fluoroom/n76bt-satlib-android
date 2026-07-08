package com.google.android.material.carousel;

import android.content.Context;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.google.android.material.carousel.e;

/* JADX INFO: loaded from: classes3.dex */
abstract class d {
    static float a(float f10, float f11, int i10) {
        return f10 + (Math.max(0, i10 - 1) * f11);
    }

    static float b(float f10, float f11, int i10) {
        return i10 > 0 ? f10 + (f11 / 2.0f) : f10;
    }

    static e c(Context context, float f10, int i10, a aVar) {
        float f11;
        float f12;
        float fMin = Math.min(f(context) + f10, aVar.f7621f);
        float f13 = fMin / 2.0f;
        float f14 = 0.0f - f13;
        float fB = b(0.0f, aVar.f7617b, aVar.f7618c);
        float fJ = j(0.0f, a(fB, aVar.f7617b, (int) Math.floor(aVar.f7618c / 2.0f)), aVar.f7617b, aVar.f7618c);
        float fB2 = b(fJ, aVar.f7620e, aVar.f7619d);
        float fJ2 = j(fJ, a(fB2, aVar.f7620e, (int) Math.floor(aVar.f7619d / 2.0f)), aVar.f7620e, aVar.f7619d);
        float fB3 = b(fJ2, aVar.f7621f, aVar.f7622g);
        float fJ3 = j(fJ2, a(fB3, aVar.f7621f, aVar.f7622g), aVar.f7621f, aVar.f7622g);
        float fB4 = b(fJ3, aVar.f7620e, aVar.f7619d);
        float fB5 = b(j(fJ3, a(fB4, aVar.f7620e, (int) Math.ceil(aVar.f7619d / 2.0f)), aVar.f7620e, aVar.f7619d), aVar.f7617b, aVar.f7618c);
        float f15 = i10 + f13;
        float fB6 = c.b(fMin, aVar.f7621f, f10);
        float fB7 = c.b(aVar.f7617b, aVar.f7621f, f10);
        float fB8 = c.b(aVar.f7620e, aVar.f7621f, f10);
        e.b bVarA = new e.b(aVar.f7621f, i10).a(f14, fB6, fMin);
        if (aVar.f7618c > 0) {
            f11 = fB6;
            f12 = 2.0f;
            bVarA.g(fB, fB7, aVar.f7617b, (int) Math.floor(r7 / 2.0f));
        } else {
            f11 = fB6;
            f12 = 2.0f;
        }
        if (aVar.f7619d > 0) {
            bVarA.g(fB2, fB8, aVar.f7620e, (int) Math.floor(r4 / f12));
        }
        bVarA.h(fB3, 0.0f, aVar.f7621f, aVar.f7622g, true);
        if (aVar.f7619d > 0) {
            bVarA.g(fB4, fB8, aVar.f7620e, (int) Math.ceil(r4 / f12));
        }
        if (aVar.f7618c > 0) {
            bVarA.g(fB5, fB7, aVar.f7617b, (int) Math.ceil(r0 / f12));
        }
        bVarA.a(f15, f11, fMin);
        return bVarA.i();
    }

    static e d(Context context, float f10, int i10, a aVar, int i11) {
        return i11 == 1 ? c(context, f10, i10, aVar) : e(context, f10, i10, aVar);
    }

    static e e(Context context, float f10, int i10, a aVar) {
        float fMin = Math.min(f(context) + f10, aVar.f7621f);
        float f11 = fMin / 2.0f;
        float f12 = 0.0f - f11;
        float fB = b(0.0f, aVar.f7621f, aVar.f7622g);
        float fJ = j(0.0f, a(fB, aVar.f7621f, aVar.f7622g), aVar.f7621f, aVar.f7622g);
        float fB2 = b(fJ, aVar.f7620e, aVar.f7619d);
        float fB3 = b(j(fJ, fB2, aVar.f7620e, aVar.f7619d), aVar.f7617b, aVar.f7618c);
        float f13 = i10 + f11;
        float fB4 = c.b(fMin, aVar.f7621f, f10);
        float fB5 = c.b(aVar.f7617b, aVar.f7621f, f10);
        float fB6 = c.b(aVar.f7620e, aVar.f7621f, f10);
        e.b bVarH = new e.b(aVar.f7621f, i10).a(f12, fB4, fMin).h(fB, 0.0f, aVar.f7621f, aVar.f7622g, true);
        if (aVar.f7619d > 0) {
            bVarH.b(fB2, fB6, aVar.f7620e);
        }
        int i11 = aVar.f7618c;
        if (i11 > 0) {
            bVarH.g(fB3, fB5, aVar.f7617b, i11);
        }
        bVarH.a(f13, fB4, fMin);
        return bVarH.i();
    }

    static float f(Context context) {
        return context.getResources().getDimension(u8.d.A);
    }

    static float g(Context context) {
        return context.getResources().getDimension(u8.d.B);
    }

    static float h(Context context) {
        return context.getResources().getDimension(u8.d.C);
    }

    static int i(int[] iArr) {
        int i10 = RtlSpacingHelper.UNDEFINED;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    static float j(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? f11 + (f12 / 2.0f) : f10;
    }
}
