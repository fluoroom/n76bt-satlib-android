package y0;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d0;
import androidx.fragment.app.w;
import androidx.lifecycle.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f32279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d0 f32281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.fragment.app.o f32282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f32283g;

    public o(w wVar) {
        this(wVar, 0);
    }

    private static String r(int i10, long j10) {
        return "android:switcher:" + i10 + ":" + j10;
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i10, Object obj) {
        androidx.fragment.app.o oVar = (androidx.fragment.app.o) obj;
        if (this.f32281e == null) {
            this.f32281e = this.f32279c.o();
        }
        this.f32281e.l(oVar);
        if (oVar.equals(this.f32282f)) {
            this.f32282f = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void b(ViewGroup viewGroup) {
        d0 d0Var = this.f32281e;
        if (d0Var != null) {
            if (!this.f32283g) {
                try {
                    this.f32283g = true;
                    d0Var.k();
                } finally {
                    this.f32283g = false;
                }
            }
            this.f32281e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object g(ViewGroup viewGroup, int i10) {
        if (this.f32281e == null) {
            this.f32281e = this.f32279c.o();
        }
        long jQ = q(i10);
        androidx.fragment.app.o oVarJ0 = this.f32279c.j0(r(viewGroup.getId(), jQ));
        if (oVarJ0 != null) {
            this.f32281e.g(oVarJ0);
        } else {
            oVarJ0 = p(i10);
            this.f32281e.c(viewGroup.getId(), oVarJ0, r(viewGroup.getId(), jQ));
        }
        if (oVarJ0 != this.f32282f) {
            oVarJ0.H3(false);
            if (this.f32280d == 1) {
                this.f32281e.s(oVarJ0, m.b.f2654d);
                return oVarJ0;
            }
            oVarJ0.M3(false);
        }
        return oVarJ0;
    }

    @Override // androidx.viewpager.widget.a
    public boolean h(View view, Object obj) {
        return ((androidx.fragment.app.o) obj).T1() == view;
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable k() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void l(ViewGroup viewGroup, int i10, Object obj) {
        androidx.fragment.app.o oVar = (androidx.fragment.app.o) obj;
        androidx.fragment.app.o oVar2 = this.f32282f;
        if (oVar != oVar2) {
            if (oVar2 != null) {
                oVar2.H3(false);
                if (this.f32280d == 1) {
                    if (this.f32281e == null) {
                        this.f32281e = this.f32279c.o();
                    }
                    this.f32281e.s(this.f32282f, m.b.f2654d);
                } else {
                    this.f32282f.M3(false);
                }
            }
            oVar.H3(true);
            if (this.f32280d == 1) {
                if (this.f32281e == null) {
                    this.f32281e = this.f32279c.o();
                }
                this.f32281e.s(oVar, m.b.f2655e);
            } else {
                oVar.M3(true);
            }
            this.f32282f = oVar;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void n(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract androidx.fragment.app.o p(int i10);

    public long q(int i10) {
        return i10;
    }

    public o(w wVar, int i10) {
        this.f32281e = null;
        this.f32282f = null;
        this.f32279c = wVar;
        this.f32280d = i10;
    }

    @Override // androidx.viewpager.widget.a
    public void j(Parcelable parcelable, ClassLoader classLoader) {
    }
}
