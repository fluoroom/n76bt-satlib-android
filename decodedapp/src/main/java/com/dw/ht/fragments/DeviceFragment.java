package com.dw.ht.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import g3.a;
import mi.m;
import org.greenrobot.eventbus.ThreadMode;
import v4.a0;
import v4.c0;
import v4.k0;
import v4.l1;
import v4.m0;
import v4.n;
import v4.n0;
import v4.o0;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
public class DeviceFragment extends v3.c implements n0.d {
    private n0 J0;
    private Snackbar K0;
    private Snackbar L0;
    private boolean M0;
    private int N0 = 2;
    private Runnable O0 = new Runnable() { // from class: s4.u1
        @Override // java.lang.Runnable
        public final void run() {
            this.f26784a.l5(0);
        }
    };

    class a extends BaseTransientBottomBar.q {
        a() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.q
        /* JADX INFO: renamed from: c */
        public void a(Snackbar snackbar, int i10) {
            if (DeviceFragment.this.a2()) {
                DeviceFragment.this.l5(0);
                DeviceFragment.this.J0.v(true);
            }
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6160a;

        static {
            int[] iArr = new int[n0.c.values().length];
            f6160a = iArr;
            try {
                iArr[n0.c.Connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6160a[n0.c.ConnectionFailed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6160a[n0.c.Interrupted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void S4() {
        int i10;
        n0 n0Var = this.J0;
        if (n0Var != null && a2()) {
            int i11 = b.f6160a[n0Var.l().ordinal()];
            if (i11 == 1) {
                this.M0 = true;
                Snackbar snackbar = this.K0;
                if (snackbar != null) {
                    snackbar.x();
                }
                Snackbar snackbar2 = this.L0;
                if (snackbar2 != null) {
                    snackbar2.x();
                    return;
                }
                return;
            }
            if (i11 == 2) {
                i10 = 5000;
            } else if (i11 != 3) {
                return;
            } else {
                i10 = 3000;
            }
            int i12 = this.N0;
            if ((i12 & 2) != 0) {
                if (this.M0) {
                    m5();
                } else if ((i12 & 1) == 1) {
                    l5(i10);
                }
            } else if ((1 & i12) != 0) {
                l5(i10);
            }
            this.M0 = false;
        }
    }

    public static boolean a5(g3.d dVar) {
        return dVar.n() && dVar.l() == a.b.SUCCESS;
    }

    public static Bundle b5(long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong("com.dw.ht.intent.extras.DEV_ID", j10);
        return bundle;
    }

    public static void j5(Context context, String str, Class cls, long j10) {
        FragmentShowActivity.i2(context, str, cls, b5(j10));
    }

    public void l5(int i10) {
        View viewT1;
        n0 n0Var = this.J0;
        if (n0Var == null || n0Var.n() || this.J0.l() == n0.c.Idle || !a2() || (viewT1 = T1()) == null) {
            return;
        }
        if (i10 > 0) {
            viewT1.postDelayed(this.O0, i10);
            return;
        }
        viewT1.removeCallbacks(this.O0);
        this.J0.v(false);
        if ((this.N0 & 2) == 2) {
            if (this.K0 == null) {
                Snackbar snackbarK0 = Snackbar.k0(viewT1, R.string.connecting, -2);
                this.K0 = snackbarK0;
                snackbarK0.n0(android.R.string.cancel, new View.OnClickListener() { // from class: s4.t1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f26773a.c5();
                    }
                });
            }
            this.K0.W();
        }
    }

    private void m5() {
        View viewT1;
        n0 n0Var;
        if (!a2() || (viewT1 = T1()) == null || (n0Var = this.J0) == null || n0Var.n()) {
            return;
        }
        if (this.L0 == null) {
            this.L0 = Snackbar.k0(viewT1, R.string.alert_attempt_connection_title, -1);
            if (this.J0.l() != n0.c.Idle && (this.N0 & 1) == 1) {
                this.L0.r(new a());
            }
        }
        this.L0.W();
    }

    @Override // v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        n0 n0Var = this.J0;
        if (n0Var != null) {
            n0Var.z().t(this);
        }
        mi.c.e().t(this);
    }

    public /* synthetic */ void M(n0 n0Var, g3.d dVar) {
        o0.d(this, n0Var, dVar);
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        S4();
        n0 n0Var = this.J0;
        if (n0Var != null) {
            n0Var.z().q(this);
        }
        mi.c.e().q(this);
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void N2(Bundle bundle) {
        super.N2(bundle);
        n0 n0Var = this.J0;
        if (n0Var != null) {
            bundle.putLong("DeviceFragment.dev_id", n0Var.q());
        }
    }

    protected boolean T4() {
        n0 n0Var = this.J0;
        if (n0Var == null) {
            return false;
        }
        if (n0Var.n()) {
            return true;
        }
        l5(0);
        this.J0.v(true);
        return false;
    }

    public String U4() {
        n0 n0Var = this.J0;
        if (n0Var == null) {
            return null;
        }
        return m0.j(n0Var.q());
    }

    protected long V4() {
        n0 n0Var = this.J0;
        if (n0Var != null) {
            return n0Var.q();
        }
        return 0L;
    }

    public void W0(n0 n0Var) {
        S4();
    }

    public c0 W4() {
        l1 l1VarY4 = Y4();
        if (l1VarY4 instanceof c0) {
            return (c0) l1VarY4;
        }
        return null;
    }

    public n0 X4() {
        n0 n0Var = this.J0;
        if (n0Var != null && n0Var.isDestroyed()) {
            h5(null);
        }
        return this.J0;
    }

    public l1 Y4() {
        n0 n0VarX4 = X4();
        if (n0VarX4 instanceof l1) {
            return (l1) n0VarX4;
        }
        return null;
    }

    public Boolean Z4() {
        n0 n0Var = this.J0;
        if (n0Var == null) {
            return null;
        }
        a0 a0VarD = n0Var.d();
        return a0VarD instanceof n ? Boolean.valueOf(((n) a0VarD).P()) : Boolean.FALSE;
    }

    public void c5() {
        e1().finish();
    }

    protected void d5(n0 n0Var, n0 n0Var2) {
        if (n0Var != null) {
            n0Var.r(this);
            if (h2()) {
                n0Var.z().t(this);
            }
        }
        if (n0Var2 != null) {
            if (h2()) {
                n0Var2.z().q(this);
            }
            n0Var2.k(this);
            o0(n0Var2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(" Link:");
        sb2.append(n0Var == null ? "null" : n0Var.getName());
        sb2.append(" -> ");
        sb2.append(n0Var2 != null ? n0Var2.getName() : "null");
        s3.b.b("DeviceFragment", sb2.toString());
    }

    public void e5(long j10) {
        if (j10 == 0) {
            h5(null);
            return;
        }
        if (281474976710657L == j10) {
            h5(v4.g.y1());
            return;
        }
        n0 n0Var = this.J0;
        if (n0Var == null || n0Var.q() != j10) {
            g5(u.w().v(j10));
        }
    }

    public void f5(long j10) {
        if (j10 == 0) {
            h5(null);
            return;
        }
        long j11 = j10 + 28147497671065500L;
        n0 n0Var = this.J0;
        if (n0Var == null || n0Var.q() != j11) {
            h5(u.w().y(j11));
        }
    }

    public final void g5(n0 n0Var) {
        n0 n0Var2 = this.J0;
        if (n0Var == n0Var2) {
            return;
        }
        R4(n0Var2, n0Var);
        n0 n0Var3 = this.J0;
        this.J0 = n0Var;
        d5(n0Var3, n0Var);
    }

    @Override // v4.n0.d
    public /* synthetic */ void h0(n0 n0Var) {
        o0.e(this, n0Var);
    }

    public final void h5(l1 l1Var) {
        g5(l1Var);
    }

    @Override // v4.n0.d
    public /* synthetic */ void i0(n0 n0Var) {
        o0.f(this, n0Var);
    }

    protected final void i5(int i10) {
        this.N0 = i10;
    }

    @Override // v4.n0.d
    public /* synthetic */ void j0(n0 n0Var, k0 k0Var, k0 k0Var2) {
        o0.b(this, n0Var, k0Var, k0Var2);
    }

    public void k5(Class cls) {
        if (V4() == 0) {
            return;
        }
        FragmentShowActivity.i2(k1(), null, cls, b5(V4()));
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        if (this.J0 == null && bundle != null) {
            long j10 = bundle.getLong("DeviceFragment.dev_id", 0L);
            if (j10 != 0) {
                e5(j10);
            }
        }
        Bundle bundleI1 = i1();
        if (this.J0 != null || bundleI1 == null) {
            return;
        }
        e5(bundleI1.getLong("com.dw.ht.intent.extras.DEV_ID"));
    }

    @Override // v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        n0 n0VarX4 = X4();
        if (n0VarX4 != null) {
            n0VarX4.r(this);
        }
        g5(null);
    }

    public void o0(n0 n0Var) {
    }

    @m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(l1.e eVar) {
    }

    protected void R4(n0 n0Var, n0 n0Var2) {
    }
}
