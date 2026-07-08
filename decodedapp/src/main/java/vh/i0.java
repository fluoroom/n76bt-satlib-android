package vh;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f30808h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f30809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f30814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i0 f30815g;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public i0() {
        this.f30809a = new byte[8192];
        this.f30813e = true;
        this.f30812d = false;
    }

    public final void a() {
        int i10;
        i0 i0Var = this.f30815g;
        if (i0Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        rd.m.b(i0Var);
        if (i0Var.f30813e) {
            int i11 = this.f30811c - this.f30810b;
            i0 i0Var2 = this.f30815g;
            rd.m.b(i0Var2);
            int i12 = 8192 - i0Var2.f30811c;
            i0 i0Var3 = this.f30815g;
            rd.m.b(i0Var3);
            if (i0Var3.f30812d) {
                i10 = 0;
            } else {
                i0 i0Var4 = this.f30815g;
                rd.m.b(i0Var4);
                i10 = i0Var4.f30810b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            i0 i0Var5 = this.f30815g;
            rd.m.b(i0Var5);
            f(i0Var5, i11);
            b();
            j0.b(this);
        }
    }

    public final i0 b() {
        i0 i0Var = this.f30814f;
        if (i0Var == this) {
            i0Var = null;
        }
        i0 i0Var2 = this.f30815g;
        rd.m.b(i0Var2);
        i0Var2.f30814f = this.f30814f;
        i0 i0Var3 = this.f30814f;
        rd.m.b(i0Var3);
        i0Var3.f30815g = this.f30815g;
        this.f30814f = null;
        this.f30815g = null;
        return i0Var;
    }

    public final i0 c(i0 i0Var) {
        rd.m.e(i0Var, "segment");
        i0Var.f30815g = this;
        i0Var.f30814f = this.f30814f;
        i0 i0Var2 = this.f30814f;
        rd.m.b(i0Var2);
        i0Var2.f30815g = i0Var;
        this.f30814f = i0Var;
        return i0Var;
    }

    public final i0 d() {
        this.f30812d = true;
        return new i0(this.f30809a, this.f30810b, this.f30811c, true, false);
    }

    public final i0 e(int i10) {
        i0 i0VarC;
        if (i10 <= 0 || i10 > this.f30811c - this.f30810b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            i0VarC = d();
        } else {
            i0VarC = j0.c();
            byte[] bArr = this.f30809a;
            byte[] bArr2 = i0VarC.f30809a;
            int i11 = this.f30810b;
            ed.j.k(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        i0VarC.f30811c = i0VarC.f30810b + i10;
        this.f30810b += i10;
        i0 i0Var = this.f30815g;
        rd.m.b(i0Var);
        i0Var.c(i0VarC);
        return i0VarC;
    }

    public final void f(i0 i0Var, int i10) {
        rd.m.e(i0Var, "sink");
        if (!i0Var.f30813e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = i0Var.f30811c;
        if (i11 + i10 > 8192) {
            if (i0Var.f30812d) {
                throw new IllegalArgumentException();
            }
            int i12 = i0Var.f30810b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = i0Var.f30809a;
            ed.j.k(bArr, bArr, 0, i12, i11, 2, null);
            i0Var.f30811c -= i0Var.f30810b;
            i0Var.f30810b = 0;
        }
        byte[] bArr2 = this.f30809a;
        byte[] bArr3 = i0Var.f30809a;
        int i13 = i0Var.f30811c;
        int i14 = this.f30810b;
        ed.j.g(bArr2, bArr3, i13, i14, i14 + i10);
        i0Var.f30811c += i10;
        this.f30810b += i10;
    }

    public i0(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        rd.m.e(bArr, "data");
        this.f30809a = bArr;
        this.f30810b = i10;
        this.f30811c = i11;
        this.f30812d = z10;
        this.f30813e = z11;
    }
}
