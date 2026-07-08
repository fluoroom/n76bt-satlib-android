package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import m0.a1;
import m0.y0;
import m0.z0;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f1144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    z0 f1145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1146e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1143b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a1 f1147f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList f1142a = new ArrayList();

    class a extends a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1148a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1149b = 0;

        a() {
        }

        void a() {
            this.f1149b = 0;
            this.f1148a = false;
            h.this.b();
        }

        @Override // m0.z0
        public void onAnimationEnd(View view) {
            int i10 = this.f1149b + 1;
            this.f1149b = i10;
            if (i10 == h.this.f1142a.size()) {
                z0 z0Var = h.this.f1145d;
                if (z0Var != null) {
                    z0Var.onAnimationEnd(null);
                }
                a();
            }
        }

        @Override // m0.a1, m0.z0
        public void onAnimationStart(View view) {
            if (this.f1148a) {
                return;
            }
            this.f1148a = true;
            z0 z0Var = h.this.f1145d;
            if (z0Var != null) {
                z0Var.onAnimationStart(null);
            }
        }
    }

    public void a() {
        if (this.f1146e) {
            Iterator it = this.f1142a.iterator();
            while (it.hasNext()) {
                ((y0) it.next()).c();
            }
            this.f1146e = false;
        }
    }

    void b() {
        this.f1146e = false;
    }

    public h c(y0 y0Var) {
        if (!this.f1146e) {
            this.f1142a.add(y0Var);
        }
        return this;
    }

    public h d(y0 y0Var, y0 y0Var2) {
        this.f1142a.add(y0Var);
        y0Var2.i(y0Var.d());
        this.f1142a.add(y0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f1146e) {
            this.f1143b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f1146e) {
            this.f1144c = interpolator;
        }
        return this;
    }

    public h g(z0 z0Var) {
        if (!this.f1146e) {
            this.f1145d = z0Var;
        }
        return this;
    }

    public void h() {
        if (this.f1146e) {
            return;
        }
        for (y0 y0Var : this.f1142a) {
            long j10 = this.f1143b;
            if (j10 >= 0) {
                y0Var.e(j10);
            }
            Interpolator interpolator = this.f1144c;
            if (interpolator != null) {
                y0Var.f(interpolator);
            }
            if (this.f1145d != null) {
                y0Var.g(this.f1147f);
            }
            y0Var.k();
        }
        this.f1146e = true;
    }
}
