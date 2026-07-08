package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import m0.b0;
import m0.i1;
import m0.m1;
import m0.o0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f8036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f8037b;

        a(c cVar, d dVar) {
            this.f8036a = cVar;
            this.f8037b = dVar;
        }

        @Override // m0.b0
        public i1 a(View view, i1 i1Var) {
            return this.f8036a.a(view, i1Var, new d(this.f8037b));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        i1 a(View view, i1 i1Var, d dVar);
    }

    public static void b(View view, c cVar) {
        o0.y0(view, new a(cVar, new d(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        i(view);
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList colorStateListF = com.google.android.material.drawable.c.f(view.getBackground());
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) b0.b.g(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        return elevation;
    }

    public static boolean g(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode h(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void i(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void j(final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.o
            @Override // java.lang.Runnable
            public final void run() {
                p.k(view, z10);
            }
        });
    }

    public static void k(View view, boolean z10) {
        m1 m1VarM;
        if (!z10 || (m1VarM = o0.M(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            m1VarM.c(i1.q.a());
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8040c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8041d;

        public d(int i10, int i11, int i12, int i13) {
            this.f8038a = i10;
            this.f8039b = i11;
            this.f8040c = i12;
            this.f8041d = i13;
        }

        public void a(View view) {
            view.setPaddingRelative(this.f8038a, this.f8039b, this.f8040c, this.f8041d);
        }

        public d(d dVar) {
            this.f8038a = dVar.f8038a;
            this.f8039b = dVar.f8039b;
            this.f8040c = dVar.f8040c;
            this.f8041d = dVar.f8041d;
        }
    }
}
