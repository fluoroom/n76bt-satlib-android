package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f7663d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f7664e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7665c = 0;

    @Override // com.google.android.material.carousel.c
    public e g(z8.a aVar, View view) {
        boolean z10;
        int iB = aVar.b();
        if (aVar.f()) {
            iB = aVar.a();
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        float f10 = ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (aVar.f()) {
            f10 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float fD = d() + f10;
        float fMax = Math.max(c() + f10, fD);
        float f11 = iB;
        float fMin = Math.min(measuredHeight + f10, f11);
        float fA = h0.a.a((measuredHeight / 3.0f) + f10, fD + f10, fMax + f10);
        float f12 = (fMin + fA) / 2.0f;
        int[] iArrA = f7663d;
        float f13 = 2.0f * fD;
        if (f11 <= f13) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f7664e;
        if (aVar.d() == 1) {
            iArrA = c.a(iArrA);
            iArrA2 = c.a(iArrA2);
        }
        int iMax = (int) Math.max(1.0d, Math.floor(((f11 - (d.i(iArrA2) * f12)) - (d.i(iArrA) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f11 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = iCeil - i11;
        }
        a aVarC = a.c(f11, fA, fD, fMax, iArrA, f12, iArrA2, fMin, iArr);
        this.f7665c = aVarC.e();
        boolean zI = i(aVarC, aVar.e());
        int i12 = aVarC.f7619d;
        if (i12 == 0 && aVarC.f7618c == 0 && f11 > f13) {
            aVarC.f7618c = 1;
            z10 = true;
        } else {
            z10 = zI;
        }
        if (z10) {
            aVarC = a.c(f11, fA, fD, fMax, new int[]{aVarC.f7618c}, f12, new int[]{i12}, fMin, new int[]{aVarC.f7622g});
        }
        return d.d(view.getContext(), f10, iB, aVarC, aVar.d());
    }

    @Override // com.google.android.material.carousel.c
    public boolean h(z8.a aVar, int i10) {
        if (i10 >= this.f7665c || aVar.e() < this.f7665c) {
            return i10 >= this.f7665c && aVar.e() < this.f7665c;
        }
        return true;
    }

    boolean i(a aVar, int i10) {
        int iE = aVar.e() - i10;
        boolean z10 = iE > 0 && (aVar.f7618c > 0 || aVar.f7619d > 1);
        while (iE > 0) {
            int i11 = aVar.f7618c;
            if (i11 > 0) {
                aVar.f7618c = i11 - 1;
            } else {
                int i12 = aVar.f7619d;
                if (i12 > 1) {
                    aVar.f7619d = i12 - 1;
                }
            }
            iE--;
        }
        return z10;
    }
}
