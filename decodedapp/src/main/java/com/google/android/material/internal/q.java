package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8042a;

    public q(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8042a = getVisibility();
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f8042a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f8042a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
