package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import m9.h;

/* JADX INFO: loaded from: classes3.dex */
abstract class h extends m9.h {
    b S;

    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override // m9.h
        protected void w(Canvas canvas) {
            if (this.S.f8393x.isEmpty()) {
                super.w(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.S.f8393x);
            } else {
                canvas.clipRect(this.S.f8393x, Region.Op.DIFFERENCE);
            }
            super.w(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h t0(b bVar) {
        return new c(bVar);
    }

    static h u0(m9.l lVar) {
        if (lVar == null) {
            lVar = new m9.l();
        }
        return t0(new b(lVar, new RectF()));
    }

    @Override // m9.h, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.S = new b(this.S);
        return this;
    }

    boolean v0() {
        return !this.S.f8393x.isEmpty();
    }

    void w0() {
        x0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void x0(float f10, float f11, float f12, float f13) {
        if (f10 == this.S.f8393x.left && f11 == this.S.f8393x.top && f12 == this.S.f8393x.right && f13 == this.S.f8393x.bottom) {
            return;
        }
        this.S.f8393x.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    void y0(RectF rectF) {
        x0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    private static final class b extends h.c {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final RectF f8393x;

        @Override // m9.h.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVarT0 = h.t0(this);
            hVarT0.invalidateSelf();
            return hVarT0;
        }

        private b(m9.l lVar, RectF rectF) {
            super(lVar, null);
            this.f8393x = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f8393x = bVar.f8393x;
        }
    }

    private h(b bVar) {
        super(bVar);
        this.S = bVar;
    }
}
