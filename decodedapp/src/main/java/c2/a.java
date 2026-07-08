package c2;

import c2.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f4281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f4282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c2.b f4283c = new c2.b(this);

    /* JADX INFO: renamed from: c2.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0064a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4284a;

        static {
            int[] iArr = new int[e2.c.values().length];
            f4284a = iArr;
            try {
                iArr[e2.c.REFUSED_BY_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4284a[e2.c.TIMEOUT_RECEIVE_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b {
        void a(boolean z10);

        void c(int i10);

        void j(int i10, int i11);

        void k(boolean z10, boolean z11);
    }

    public interface c {
        void a(byte[] bArr);
    }

    private void o() {
        b bVar = this.f4282b;
        if (bVar != null) {
            bVar.k(this.f4283c.v(), this.f4283c.u());
        }
    }

    private void r(int i10, int i11) {
        b bVar = this.f4282b;
        if (bVar != null) {
            bVar.j(i10, i11);
        }
    }

    @Override // e2.r.a
    public void a(boolean z10) {
        b bVar = this.f4282b;
        if (bVar != null) {
            bVar.a(z10);
        }
    }

    @Override // e2.r.a
    public void b() {
        r(6, 4100);
    }

    @Override // e2.r.a
    public void c(int i10) {
        b bVar = this.f4282b;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    @Override // e2.r.a
    public void d(e2.c cVar) {
        e2.c cVar2 = e2.c.REPORT_FROM_DEVICE;
        if (cVar == cVar2) {
            r(6, cVar2.d());
        } else {
            int i10 = C0064a.f4284a[cVar.ordinal()];
            r(6, i10 != 1 ? i10 != 2 ? 4352 : 4099 : 4097);
        }
    }

    @Override // e2.r.a
    public void e(int i10) {
        r(2, i10);
    }

    @Override // e2.r.a
    public void f(boolean z10) {
        o();
    }

    @Override // e2.r.a
    public void g() {
        r(0, 0);
    }

    @Override // e2.r.a
    public void h(boolean z10) {
        o();
    }

    @Override // e2.r.a
    public void i() {
        r(1, 0);
    }

    @Override // e2.r.a
    public void j() {
        r(5, 0);
    }

    @Override // e2.r.a
    public void k() {
        r(4, 0);
    }

    @Override // c2.b.a
    public void l(byte[] bArr) {
        c cVar = this.f4281a;
        if (cVar != null) {
            cVar.a(bArr);
        }
    }

    @Override // e2.r.a
    public void m() {
        r(3, 0);
    }

    public void n(byte[] bArr) {
        this.f4283c.L(bArr);
    }

    public boolean p() {
        return this.f4283c.w();
    }

    public void q() {
        this.f4283c.Y();
    }

    public void s() {
        this.f4283c.K();
    }

    public void t(b bVar) {
        this.f4282b = bVar;
    }

    public void u(byte[] bArr) {
        this.f4283c.W(bArr);
    }

    public void v(c cVar) {
        this.f4281a = cVar;
    }

    public void w() {
        this.f4283c.X();
    }
}
