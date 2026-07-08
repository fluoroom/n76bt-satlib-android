package yj;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class b extends y implements g0, e0, Comparable, Serializable {
    public static final b D = gj.c.a().d().v();
    public static final b E = gj.c.a().d().w();
    public static final b F = gj.c.a().d().q();
    public static final b G = gj.c.a().d().o();
    public static final b H = gj.c.a().d().r();
    public static final b I = gj.c.a().d().t();
    public static final b J = gj.c.a().d().y();
    public static final b K = gj.c.a().d().x();
    public static final b L = gj.c.a().d().n();
    public static final b M = gj.c.a().d().s();
    public static final b N = gj.c.a().d().c();
    public static final b O = gj.c.a().d().u();
    public static final b P;
    public static final b Q;
    public static final b R;

    static {
        b bVar = new b(y.f32756c);
        P = bVar;
        Q = bVar.a(Double.NEGATIVE_INFINITY);
        R = bVar.a(Double.POSITIVE_INFINITY);
    }

    public b(i iVar, w wVar, b0 b0Var) {
        super(new y(((((((((long) iVar.f()) * 24) + ((long) wVar.e())) * 60) + ((long) wVar.f())) - ((long) wVar.g())) - 720) * 60, 0L), wVar.i(), b0Var.c(iVar, wVar));
    }

    public static b T(int i10, double d10, b0 b0Var) {
        return W(i10, new y(d10), b0Var);
    }

    public static b W(int i10, y yVar, b0 b0Var) {
        w wVar;
        i iVar = new i(i.f32661e, i10);
        if (yVar.compareTo(y.f32766v) >= 0) {
            y yVar2 = new y(86399.0d);
            y yVarO = yVar.O(yVar2);
            b bVar = new b(iVar, new w(yVar2), b0Var);
            if (b0Var.e(bVar) > yVarO.Q() + 59.0d) {
                return bVar.f0(yVarO);
            }
            wVar = new w(yVar2.j(yVarO));
        } else {
            wVar = new w(yVar);
        }
        return new b(iVar, wVar, b0Var);
    }

    public y R(b bVar) {
        return O(bVar);
    }

    public y S(b bVar, b0 b0Var) {
        return new y(this, b0Var.a(this), bVar.L(), b0Var.a(bVar).L());
    }

    public double X(b bVar) {
        return R(bVar).Q();
    }

    public j Y(b0 b0Var) {
        if (!A()) {
            return D() ? new j(i.f32670w, w.f32745g) : G() ? new j(i.f32673z, w.f32743e) : new j(i.f32672y, new w(23, 59, new y(59L, y.f32763s, 999L, y.f32762r)));
        }
        y yVarJ = j(b0Var.a(this));
        long jX = yVarJ.x() + 43200;
        long j10 = jX % 86400;
        if (j10 < 0) {
            j10 += 86400;
        }
        return new j(new i(i.f32670w, (int) ((jX - j10) / 86400)), new w(new y(j10, yVarJ.v()), b0Var.b(this) ? b0Var.d(this) : y.f32756c, b0Var.e(this)));
    }

    public boolean Z(g0 g0Var) {
        return compareTo(g0Var.getDate()) > 0;
    }

    public boolean a0(g0 g0Var) {
        return compareTo(g0Var.getDate()) < 0;
    }

    public boolean b0(g0 g0Var) {
        return c0(g0Var) || a0(g0Var);
    }

    public boolean c0(g0 g0Var) {
        return equals(g0Var.getDate());
    }

    public double d0(b bVar, b0 b0Var) {
        return S(bVar, b0Var).Q();
    }

    @Override // yj.g0
    public /* synthetic */ double e(g0 g0Var) {
        return f0.a(this, g0Var);
    }

    @Override // yj.e0
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b a(double d10) {
        return new b(this, d10);
    }

    public b f0(y yVar) {
        return new b(this, yVar);
    }

    public Date g0(b0 b0Var) {
        return new Date(aj.d.N((j(b0Var.a(this)).Q() + 9.46728E8d) * 1000.0d));
    }

    public String h0(b0 b0Var) {
        return Y(b0Var).g();
    }

    @Override // yj.y
    public String toString() {
        try {
            try {
                return h0(gj.c.a().d().e()) + "Z";
            } catch (RuntimeException unused) {
                return "(" + x() + "s + " + v() + "as) seconds past epoch";
            }
        } catch (RuntimeException unused2) {
            return h0(new r()) + " TAI";
        }
    }

    public b(int i10, int i11, int i12, int i13, int i14, double d10, b0 b0Var) {
        this(i10, i11, i12, i13, i14, new y(d10), b0Var);
    }

    public b(int i10, int i11, int i12, int i13, int i14, y yVar, b0 b0Var) {
        this(new i(i10, i11, i12), new w(i13, i14, yVar), b0Var);
    }

    public b(i iVar, b0 b0Var) {
        this(iVar, w.f32743e, b0Var);
    }

    public b(int i10, int i11, int i12, b0 b0Var) {
        this(new i(i10, i11, i12), w.f32743e, b0Var);
    }

    public b(Date date, b0 b0Var) {
        this(new i(i.f32671x, (int) (date.getTime() / 86400000)), new w(new y(date.getTime() % 86400000, y.f32762r)), b0Var);
    }

    public b(b bVar, double d10) {
        this(bVar, new y(d10));
    }

    public b(b bVar, y yVar) {
        super(bVar, yVar);
    }

    public b(y yVar) {
        super(yVar);
    }

    @Override // yj.g0
    public b getDate() {
        return this;
    }
}
