package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import u8.b;
import u8.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f7459a = k.f28739o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f7460b = b.f28568x;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f7461c = b.G;

    static /* synthetic */ void a(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View b(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ boolean d(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ void e(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        throw null;
    }

    static /* synthetic */ int f(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.f) view.getLayoutParams()).f1875d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final Rect f7462p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private WeakReference f7463q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f7464r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final View.OnLayoutChangeListener f7465s;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                android.support.v4.media.session.b.a(Behavior.this.f7463q.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f7465s = new a();
            this.f7462p = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            android.support.v4.media.session.b.a(view);
            return U(coordinatorLayout, null, view2, view3, i10, i11);
        }

        public boolean T(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f7463q = new WeakReference(bottomAppBar);
            View viewB = BottomAppBar.b(bottomAppBar);
            if (viewB != null && !viewB.isLaidOut()) {
                BottomAppBar.g(bottomAppBar, viewB);
                this.f7464r = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewB.getLayoutParams())).bottomMargin;
                if (viewB instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewB;
                    if (BottomAppBar.f(bottomAppBar) == 0 && BottomAppBar.d(bottomAppBar)) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(u8.a.f28539b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(u8.a.f28538a);
                    }
                    BottomAppBar.e(bottomAppBar, floatingActionButton);
                }
                viewB.addOnLayoutChangeListener(this.f7465s);
                BottomAppBar.a(bottomAppBar);
            }
            coordinatorLayout.C(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        public boolean U(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            android.support.v4.media.session.b.a(view);
            return T(coordinatorLayout, null, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7465s = new a();
            this.f7462p = new Rect();
        }
    }
}
