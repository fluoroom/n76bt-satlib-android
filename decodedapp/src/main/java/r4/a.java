package r4;

import android.content.Context;
import org.greenrobot.eventbus.ThreadMode;
import v4.c0;
import v4.k0;
import v4.l1;
import v4.n0;
import v4.o0;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends h implements n0.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0350a f25414f = new C0350a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n0 f25415e;

    /* JADX INFO: renamed from: r4.a$a, reason: collision with other inner class name */
    public static final class C0350a {
        public /* synthetic */ C0350a(rd.h hVar) {
            this();
        }

        private C0350a() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25416a;

        static {
            int[] iArr = new int[u.c.values().length];
            try {
                iArr[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25416a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str) {
        super(context, str);
        rd.m.e(context, "context");
        rd.m.e(str, "tag");
    }

    public final void A(l1 l1Var) {
        z(l1Var);
    }

    @Override // v4.n0.d
    public /* synthetic */ void M(n0 n0Var, g3.d dVar) {
        o0.d(this, n0Var, dVar);
    }

    @Override // v4.n0.d
    public void W0(n0 n0Var) {
        rd.m.e(n0Var, "link");
    }

    @Override // v4.n0.d
    public /* synthetic */ void h0(n0 n0Var) {
        o0.e(this, n0Var);
    }

    @Override // v4.n0.d
    public /* synthetic */ void i0(n0 n0Var) {
        o0.f(this, n0Var);
    }

    @Override // v4.n0.d
    public /* synthetic */ void j0(n0 n0Var, k0 k0Var, k0 k0Var2) {
        o0.b(this, n0Var, k0Var, k0Var2);
    }

    @Override // r4.h
    public void m() {
        super.m();
        n0 n0VarW = w();
        if (n0VarW != null) {
            n0VarW.r(this);
        }
    }

    @Override // r4.h
    public void o() {
        super.o();
        n0 n0Var = this.f25415e;
        if (n0Var != null) {
            rd.m.b(n0Var);
            n0Var.z().t(this);
        }
        mi.c.e().t(this);
    }

    @Override // v4.n0.d
    public /* synthetic */ void o0(n0 n0Var) {
        o0.a(this, n0Var);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(l1.e eVar) {
    }

    @Override // r4.h
    public void p() {
        A(u.w().q());
        super.p();
        n0 n0Var = this.f25415e;
        if (n0Var != null) {
            rd.m.b(n0Var);
            n0Var.z().q(this);
        }
        mi.c.e().q(this);
    }

    public final c0 v() {
        l1 l1VarX = x();
        if (l1VarX instanceof c0) {
            return (c0) l1VarX;
        }
        return null;
    }

    public final n0 w() {
        n0 n0Var = this.f25415e;
        if (n0Var != null) {
            rd.m.b(n0Var);
            if (n0Var.isDestroyed()) {
                A(null);
            }
        }
        return this.f25415e;
    }

    public final l1 x() {
        n0 n0VarW = w();
        if (n0VarW instanceof l1) {
            return (l1) n0VarW;
        }
        return null;
    }

    protected void y(n0 n0Var, n0 n0Var2) {
        String name;
        if (n0Var != null) {
            n0Var.r(this);
            if (k()) {
                n0Var.z().t(this);
            }
        }
        if (n0Var2 != null) {
            if (k()) {
                n0Var2.z().q(this);
            }
            n0Var2.k(this);
            o0(n0Var2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(" Link:");
        String name2 = "null";
        if (n0Var == null) {
            name = "null";
        } else {
            name = n0Var.getName();
            rd.m.d(name, "getName(...)");
        }
        sb2.append(name);
        sb2.append(" -> ");
        if (n0Var2 != null) {
            name2 = n0Var2.getName();
            rd.m.d(name2, "getName(...)");
        }
        sb2.append(name2);
        s3.b.b("DeviceFloatWindows", sb2.toString());
    }

    public final void z(n0 n0Var) {
        n0 n0Var2 = this.f25415e;
        if (n0Var == n0Var2) {
            return;
        }
        u(n0Var2, n0Var);
        n0 n0Var3 = this.f25415e;
        this.f25415e = n0Var;
        y(n0Var3, n0Var);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(u.c cVar) {
        rd.m.e(cVar, "event");
        if (b.f25416a[cVar.ordinal()] == 1) {
            A(u.w().q());
        }
    }

    protected final void u(n0 n0Var, n0 n0Var2) {
    }
}
