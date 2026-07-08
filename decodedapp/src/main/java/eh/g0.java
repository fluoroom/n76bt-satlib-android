package eh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a */
    public static final a f12413a;

    /* JADX INFO: renamed from: b */
    public static final g0 f12414b;

    public static final class a {

        /* JADX INFO: renamed from: eh.g0$a$a */
        public static final class C0171a extends g0 {

            /* JADX INFO: renamed from: c */
            final /* synthetic */ b0 f12415c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ vh.h f12416d;

            C0171a(b0 b0Var, vh.h hVar) {
                this.f12415c = b0Var;
                this.f12416d = hVar;
            }

            @Override // eh.g0
            public long a() {
                return this.f12416d.Q();
            }

            @Override // eh.g0
            public b0 b() {
                return this.f12415c;
            }

            @Override // eh.g0
            public void f(vh.f fVar) {
                rd.m.e(fVar, "sink");
                fVar.Z(this.f12416d);
            }
        }

        public static final class b extends g0 {

            /* JADX INFO: renamed from: c */
            final /* synthetic */ b0 f12417c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ int f12418d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ byte[] f12419e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ int f12420f;

            b(b0 b0Var, int i10, byte[] bArr, int i11) {
                this.f12417c = b0Var;
                this.f12418d = i10;
                this.f12419e = bArr;
                this.f12420f = i11;
            }

            @Override // eh.g0
            public long a() {
                return this.f12418d;
            }

            @Override // eh.g0
            public b0 b() {
                return this.f12417c;
            }

            @Override // eh.g0
            public void f(vh.f fVar) {
                rd.m.e(fVar, "sink");
                fVar.write(this.f12419e, this.f12420f, this.f12418d);
            }
        }

        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public static /* synthetic */ g0 e(a aVar, b0 b0Var, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.b(b0Var, bArr, i10, i11);
        }

        public static /* synthetic */ g0 f(a aVar, vh.h hVar, b0 b0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                b0Var = null;
            }
            return aVar.c(hVar, b0Var);
        }

        public final g0 a(b0 b0Var, byte[] bArr) {
            rd.m.e(bArr, "content");
            return e(this, b0Var, bArr, 0, 0, 12, null);
        }

        public final g0 b(b0 b0Var, byte[] bArr, int i10, int i11) {
            rd.m.e(bArr, "content");
            return d(bArr, b0Var, i10, i11);
        }

        public final g0 c(vh.h hVar, b0 b0Var) {
            rd.m.e(hVar, "<this>");
            return new C0171a(b0Var, hVar);
        }

        public final g0 d(byte[] bArr, b0 b0Var, int i10, int i11) {
            rd.m.e(bArr, "<this>");
            fh.m.e(bArr.length, i10, i11);
            return new b(b0Var, i11, bArr, i10);
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f12413a = aVar;
        f12414b = a.f(aVar, vh.h.f30793e, null, 1, null);
    }

    public static final g0 c(b0 b0Var, byte[] bArr) {
        return f12413a.a(b0Var, bArr);
    }

    public abstract long a();

    public abstract b0 b();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public abstract void f(vh.f fVar);
}
