package sf;

import he.h0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27338b = new a(null);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final l a(String str) {
            rd.m.e(str, "message");
            return new b(str);
        }

        private a() {
        }
    }

    public static final class b extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f27339c;

        public b(String str) {
            rd.m.e(str, "message");
            this.f27339c = str;
        }

        @Override // sf.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public gg.i a(h0 h0Var) {
            rd.m.e(h0Var, "module");
            return gg.l.d(gg.k.f14482r0, this.f27339c);
        }

        @Override // sf.g
        public String toString() {
            return this.f27339c;
        }
    }

    public l() {
        super(dd.d0.f10897a);
    }

    @Override // sf.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public dd.d0 b() {
        throw new UnsupportedOperationException();
    }
}
