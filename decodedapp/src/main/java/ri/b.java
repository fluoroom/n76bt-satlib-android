package ri;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient ri.a f26093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient a f26094b = new a(e(0.0d), e(1.0d), e(3.141592653589793d));

    public static class a implements pi.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f26095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f26096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final g f26097c;

        a(g gVar, g gVar2, g gVar3) {
            this.f26095a = gVar;
            this.f26096b = gVar2;
            this.f26097c = gVar3;
        }

        @Override // pi.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g b() {
            return this.f26096b;
        }

        public g d() {
            return this.f26097c;
        }

        @Override // pi.c
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public g a() {
            return this.f26095a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                if (this.f26095a.X().f26093a == ((a) obj).f26095a.X().f26093a) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            ri.a aVarF = this.f26095a.X().f();
            return (aVarF.q() & (aVarF.p() << 16)) ^ (-1723615098);
        }
    }

    public b(int i10, int i11) {
        this.f26093a = ri.a.o(i10, i11);
    }

    g b() {
        return new g(this);
    }

    public final g c(double... dArr) {
        if (dArr.length == this.f26093a.s()) {
            return new g(this, dArr);
        }
        throw new ui.e(ui.d.DIMENSIONS_MISMATCH, Integer.valueOf(dArr.length), Integer.valueOf(this.f26093a.s()));
    }

    void d(b bVar) {
        this.f26093a.d(bVar.f26093a);
    }

    public g e(double d10) {
        g gVar = new g(this);
        gVar.k0(0, d10);
        return gVar;
    }

    public ri.a f() {
        return this.f26093a;
    }

    public a g() {
        return this.f26094b;
    }
}
