package ag;

import gf.c;
import he.g1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jf.d f546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jf.h f547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g1 f548c;

    public static final class a extends n0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final gf.c f549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final mf.b f551f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c.EnumC0201c f552g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f553h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f554i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gf.c cVar, jf.d dVar, jf.h hVar, g1 g1Var, a aVar) {
            super(dVar, hVar, g1Var, null);
            rd.m.e(cVar, "classProto");
            rd.m.e(dVar, "nameResolver");
            rd.m.e(hVar, "typeTable");
            this.f549d = cVar;
            this.f550e = aVar;
            this.f551f = l0.a(dVar, cVar.U0());
            c.EnumC0201c enumC0201c = (c.EnumC0201c) jf.b.f18665f.d(cVar.T0());
            this.f552g = enumC0201c == null ? c.EnumC0201c.CLASS : enumC0201c;
            Boolean boolD = jf.b.f18666g.d(cVar.T0());
            rd.m.d(boolD, "get(...)");
            this.f553h = boolD.booleanValue();
            Boolean boolD2 = jf.b.f18667h.d(cVar.T0());
            rd.m.d(boolD2, "get(...)");
            this.f554i = boolD2.booleanValue();
        }

        @Override // ag.n0
        public mf.c a() {
            return this.f551f.a();
        }

        public final mf.b e() {
            return this.f551f;
        }

        public final gf.c f() {
            return this.f549d;
        }

        public final c.EnumC0201c g() {
            return this.f552g;
        }

        public final a h() {
            return this.f550e;
        }

        public final boolean i() {
            return this.f553h;
        }
    }

    public static final class b extends n0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final mf.c f555d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mf.c cVar, jf.d dVar, jf.h hVar, g1 g1Var) {
            super(dVar, hVar, g1Var, null);
            rd.m.e(cVar, "fqName");
            rd.m.e(dVar, "nameResolver");
            rd.m.e(hVar, "typeTable");
            this.f555d = cVar;
        }

        @Override // ag.n0
        public mf.c a() {
            return this.f555d;
        }
    }

    public /* synthetic */ n0(jf.d dVar, jf.h hVar, g1 g1Var, rd.h hVar2) {
        this(dVar, hVar, g1Var);
    }

    public abstract mf.c a();

    public final jf.d b() {
        return this.f546a;
    }

    public final g1 c() {
        return this.f548c;
    }

    public final jf.h d() {
        return this.f547b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    private n0(jf.d dVar, jf.h hVar, g1 g1Var) {
        this.f546a = dVar;
        this.f547b = hVar;
        this.f548c = g1Var;
    }
}
