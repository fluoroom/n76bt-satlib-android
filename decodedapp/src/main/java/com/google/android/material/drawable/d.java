package com.google.android.material.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class d extends androidx.appcompat.graphics.drawable.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f7833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7834b;

    public d(Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f7833a = new a(a(drawable), i10, i11);
    }

    private Drawable.ConstantState a(Drawable drawable) {
        if (drawable != null) {
            return drawable.getConstantState();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f7833a.d()) {
            return this.f7833a;
        }
        return null;
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f7833a.f7837c;
    }

    @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f7833a.f7836b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f7834b && super.mutate() == this) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.mutate();
            }
            this.f7833a = new a(a(drawable), this.f7833a.f7836b, this.f7833a.f7837c);
            this.f7834b = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.c
    public void setDrawable(Drawable drawable) {
        super.setDrawable(drawable);
        a aVar = this.f7833a;
        if (aVar != null) {
            aVar.f7835a = a(drawable);
            this.f7834b = false;
        }
    }

    private static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable.ConstantState f7835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7837c;

        a(Drawable.ConstantState constantState, int i10, int i11) {
            this.f7835a = constantState;
            this.f7836b = i10;
            this.f7837c = i11;
        }

        boolean d() {
            return this.f7835a != null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.f7835a;
            if (constantState != null) {
                return constantState.getChangingConfigurations();
            }
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new d(this.f7835a.newDrawable(), this.f7836b, this.f7837c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new d(this.f7835a.newDrawable(resources), this.f7836b, this.f7837c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return new d(this.f7835a.newDrawable(resources, theme), this.f7836b, this.f7837c);
        }
    }
}
