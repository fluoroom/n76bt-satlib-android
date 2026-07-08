package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.m;
import com.google.android.material.internal.p;
import e9.a;
import u8.b;
import u8.d;
import u8.k;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public class SwitchMaterial extends SwitchCompat {

    /* JADX INFO: renamed from: e */
    private static final int f8247e = k.f28744t;

    /* JADX INFO: renamed from: f */
    private static final int[][] f8248f = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: a */
    private final a f8249a;

    /* JADX INFO: renamed from: b */
    private ColorStateList f8250b;

    /* JADX INFO: renamed from: c */
    private ColorStateList f8251c;

    /* JADX INFO: renamed from: d */
    private boolean f8252d;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.C0);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f8250b == null) {
            int iD = c9.a.d(this, b.f28552h);
            int iD2 = c9.a.d(this, h.a.I);
            float dimension = getResources().getDimension(d.f28622u0);
            if (this.f8249a.d()) {
                dimension += p.f(this);
            }
            int iC = this.f8249a.c(iD, dimension);
            int[][] iArr = f8248f;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = c9.a.k(iD, iD2, 1.0f);
            iArr2[1] = iC;
            iArr2[2] = c9.a.k(iD, iD2, 0.38f);
            iArr2[3] = iC;
            this.f8250b = new ColorStateList(iArr, iArr2);
        }
        return this.f8250b;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f8251c == null) {
            int[][] iArr = f8248f;
            int[] iArr2 = new int[iArr.length];
            int iD = c9.a.d(this, b.f28552h);
            int iD2 = c9.a.d(this, h.a.I);
            int iD3 = c9.a.d(this, b.f28550f);
            iArr2[0] = c9.a.k(iD, iD2, 0.54f);
            iArr2[1] = c9.a.k(iD, iD3, 0.32f);
            iArr2[2] = c9.a.k(iD, iD2, 0.12f);
            iArr2[3] = c9.a.k(iD, iD3, 0.12f);
            this.f8251c = new ColorStateList(iArr, iArr2);
        }
        return this.f8251c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f8252d && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f8252d && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f8252d = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f8247e;
        super(q9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f8249a = new a(context2);
        TypedArray typedArrayI = m.i(context2, attributeSet, l.Q5, i10, i11, new int[0]);
        this.f8252d = typedArrayI.getBoolean(l.R5, false);
        typedArrayI.recycle();
    }
}
