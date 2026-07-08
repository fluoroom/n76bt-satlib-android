package ef;

/* JADX INFO: loaded from: classes3.dex */
public interface v extends ag.a0 {

    public static abstract class a {

        /* JADX INFO: renamed from: ef.v$a$a, reason: collision with other inner class name */
        public static final class C0164a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final x f12051a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final byte[] f12052b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0164a(x xVar, byte[] bArr) {
                super(null);
                rd.m.e(xVar, "kotlinJvmBinaryClass");
                this.f12051a = xVar;
                this.f12052b = bArr;
            }

            public final x b() {
                return this.f12051a;
            }

            public /* synthetic */ C0164a(x xVar, byte[] bArr, int i10, rd.h hVar) {
                this(xVar, (i10 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final x a() {
            C0164a c0164a = this instanceof C0164a ? (C0164a) this : null;
            if (c0164a != null) {
                return c0164a.b();
            }
            return null;
        }

        private a() {
        }
    }

    a a(cf.g gVar, jf.c cVar);

    a b(mf.b bVar, jf.c cVar);
}
