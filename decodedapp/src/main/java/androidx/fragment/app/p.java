package androidx.fragment.app;

import a0.b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.m;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l1.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends d.q implements b.e, b.f {
    boolean H;
    boolean I;
    final r F = r.b(new a());
    final androidx.lifecycle.v G = new androidx.lifecycle.v(this);
    boolean J = true;

    class a extends t implements b0.e, b0.f, a0.o, a0.p, y0, d.k0, f.g, l1.i, y0.n, m0.o {
        public a() {
            super(p.this);
        }

        @Override // a0.o
        public void E(l0.a aVar) {
            p.this.E(aVar);
        }

        @Override // b0.e
        public void H(l0.a aVar) {
            p.this.H(aVar);
        }

        @Override // a0.o
        public void I(l0.a aVar) {
            p.this.I(aVar);
        }

        @Override // b0.f
        public void J(l0.a aVar) {
            p.this.J(aVar);
        }

        @Override // a0.p
        public void L(l0.a aVar) {
            p.this.L(aVar);
        }

        @Override // b0.f
        public void Q(l0.a aVar) {
            p.this.Q(aVar);
        }

        @Override // androidx.lifecycle.t
        public androidx.lifecycle.m S0() {
            return p.this.G;
        }

        @Override // androidx.lifecycle.y0
        public x0 U() {
            return p.this.U();
        }

        @Override // y0.n
        public void a(w wVar, o oVar) {
            p.this.T0(oVar);
        }

        @Override // m0.o
        public void addMenuProvider(m0.u uVar) {
            p.this.addMenuProvider(uVar);
        }

        @Override // y0.g
        public View c(int i10) {
            return p.this.findViewById(i10);
        }

        @Override // d.k0
        public d.j0 d() {
            return p.this.d();
        }

        @Override // y0.g
        public boolean e() {
            Window window = p.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // l1.i
        public l1.f e0() {
            return p.this.e0();
        }

        @Override // b0.e
        public void i(l0.a aVar) {
            p.this.i(aVar);
        }

        @Override // androidx.fragment.app.t
        public void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            p.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // f.g
        public f.f l() {
            return p.this.l();
        }

        @Override // androidx.fragment.app.t
        public LayoutInflater n() {
            return p.this.getLayoutInflater().cloneInContext(p.this);
        }

        @Override // androidx.fragment.app.t
        public boolean p(String str) {
            return a0.b.r(p.this, str);
        }

        @Override // androidx.fragment.app.t
        public void r() {
            s();
        }

        @Override // m0.o
        public void removeMenuProvider(m0.u uVar) {
            p.this.removeMenuProvider(uVar);
        }

        public void s() {
            p.this.C0();
        }

        @Override // a0.p
        public void t(l0.a aVar) {
            p.this.t(aVar);
        }

        @Override // androidx.fragment.app.t
        /* JADX INFO: renamed from: u */
        public p m() {
            return p.this;
        }

        @Override // m0.o
        public void addMenuProvider(m0.u uVar, androidx.lifecycle.t tVar, m.b bVar) {
            p.this.addMenuProvider(uVar, tVar, bVar);
        }
    }

    public p() {
        P0();
    }

    public static /* synthetic */ Bundle K0(p pVar) {
        pVar.Q0();
        pVar.G.i(m.a.ON_STOP);
        return new Bundle();
    }

    private void P0() {
        e0().c("android:support:lifecycle", new f.b() { // from class: y0.c
            @Override // l1.f.b
            public final Bundle a() {
                return androidx.fragment.app.p.K0(this.f32269a);
            }
        });
        H(new l0.a() { // from class: y0.d
            @Override // l0.a
            public final void accept(Object obj) {
                this.f32270a.F.m();
            }
        });
        u0(new l0.a() { // from class: y0.e
            @Override // l0.a
            public final void accept(Object obj) {
                this.f32271a.F.m();
            }
        });
        t0(new e.b() { // from class: y0.f
            @Override // e.b
            public final void a(Context context) {
                this.f32272a.F.a(null);
            }
        });
    }

    private static boolean R0(w wVar, m.b bVar) {
        boolean zR0 = false;
        for (o oVar : wVar.v0()) {
            if (oVar != null) {
                if (oVar.t1() != null) {
                    zR0 |= R0(oVar.j1(), bVar);
                }
                h0 h0Var = oVar.f2385f0;
                if (h0Var != null && h0Var.S0().b().d(m.b.f2654d)) {
                    oVar.f2385f0.g(bVar);
                    zR0 = true;
                }
                if (oVar.f2383e0.b().d(m.b.f2654d)) {
                    oVar.f2383e0.n(bVar);
                    zR0 = true;
                }
            }
        }
        return zR0;
    }

    final View M0(View view, String str, Context context, AttributeSet attributeSet) {
        return this.F.n(view, str, context, attributeSet);
    }

    public w N0() {
        return this.F.l();
    }

    public androidx.loader.app.a O0() {
        return androidx.loader.app.a.b(this);
    }

    void Q0() {
        while (R0(N0(), m.b.f2653c)) {
        }
    }

    public void T0(o oVar) {
    }

    protected void U0() {
        this.G.i(m.a.ON_RESUME);
        this.F.h();
    }

    public void V0() {
        C0();
    }

    @Override // a0.b.f
    public final void b(int i10) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (R(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.H);
            printWriter.print(" mResumed=");
            printWriter.print(this.I);
            printWriter.print(" mStopped=");
            printWriter.print(this.J);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.F.l().X(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // d.q, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.F.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.G.i(m.a.ON_CREATE);
        this.F.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewM0 = M0(view, str, context, attributeSet);
        return viewM0 == null ? super.onCreateView(view, str, context, attributeSet) : viewM0;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.F.f();
        this.G.i(m.a.ON_DESTROY);
    }

    @Override // d.q, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.F.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.I = false;
        this.F.g();
        this.G.i(m.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        U0();
    }

    @Override // d.q, android.app.Activity, a0.b.e
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.F.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.F.m();
        super.onResume();
        this.I = true;
        this.F.k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.F.m();
        super.onStart();
        this.J = false;
        if (!this.H) {
            this.H = true;
            this.F.c();
        }
        this.F.k();
        this.G.i(m.a.ON_START);
        this.F.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.F.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.J = true;
        Q0();
        this.F.j();
        this.G.i(m.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewM0 = M0(null, str, context, attributeSet);
        return viewM0 == null ? super.onCreateView(str, context, attributeSet) : viewM0;
    }
}
