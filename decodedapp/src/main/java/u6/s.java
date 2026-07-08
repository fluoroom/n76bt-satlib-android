package u6;

import u6.g;

/* JADX INFO: loaded from: classes.dex */
public class s extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final s f28320h = new s();

    static final class a extends g {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected static final a f28321h = new a();

        protected a() {
            super(d7.a.class, Boolean.TRUE);
        }

        public static a t1() {
            return f28321h;
        }

        @Override // u6.g
        protected p6.l e1(boolean z10, boolean z11) {
            return new a(this, z10, z11);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
        public d7.a e(e6.j jVar, p6.h hVar) throws v6.f {
            if (!jVar.S0()) {
                return (d7.a) hVar.s0(d7.a.class, jVar);
            }
            d7.l lVarH0 = hVar.h0();
            d7.a aVarA = lVarH0.a();
            g1(jVar, hVar, lVarH0, new g.a(), aVarA);
            return aVarA;
        }

        @Override // p6.l
        /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
        public d7.a f(e6.j jVar, p6.h hVar, d7.a aVar) throws v6.f {
            if (!jVar.S0()) {
                return (d7.a) hVar.s0(d7.a.class, jVar);
            }
            g1(jVar, hVar, hVar.h0(), new g.a(), aVar);
            return aVar;
        }

        protected a(a aVar, boolean z10, boolean z11) {
            super(aVar, z10, z11);
        }
    }

    static final class b extends g {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected static final b f28322h = new b();

        protected b() {
            super(d7.r.class, Boolean.TRUE);
        }

        public static b t1() {
            return f28322h;
        }

        @Override // u6.g
        protected p6.l e1(boolean z10, boolean z11) {
            return new b(this, z10, z11);
        }

        @Override // p6.l
        /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
        public d7.r e(e6.j jVar, p6.h hVar) throws v6.f {
            d7.l lVarH0 = hVar.h0();
            if (!jVar.T0()) {
                return jVar.N0(e6.m.FIELD_NAME) ? h1(jVar, hVar, lVarH0, new g.a()) : jVar.N0(e6.m.END_OBJECT) ? lVarH0.k() : (d7.r) hVar.s0(d7.r.class, jVar);
            }
            d7.r rVarK = lVarH0.k();
            g1(jVar, hVar, lVarH0, new g.a(), rVarK);
            return rVarK;
        }

        @Override // p6.l
        /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
        public d7.r f(e6.j jVar, p6.h hVar, d7.r rVar) {
            return (jVar.T0() || jVar.N0(e6.m.FIELD_NAME)) ? (d7.r) q1(jVar, hVar, rVar, new g.a()) : (d7.r) hVar.s0(d7.r.class, jVar);
        }

        protected b(b bVar, boolean z10, boolean z11) {
            super(bVar, z10, z11);
        }
    }

    protected s() {
        super(p6.n.class, null);
    }

    public static p6.l s1(Class cls) {
        return cls == d7.r.class ? b.t1() : cls == d7.a.class ? a.t1() : f28320h;
    }

    @Override // p6.l, s6.r
    public Object b(p6.h hVar) {
        return null;
    }

    @Override // u6.g, s6.i
    public /* bridge */ /* synthetic */ p6.l d(p6.h hVar, p6.d dVar) {
        return super.d(hVar, dVar);
    }

    @Override // u6.g
    protected p6.l e1(boolean z10, boolean z11) {
        return new s(this, z10, z11);
    }

    @Override // u6.g, u6.c0, p6.l
    public /* bridge */ /* synthetic */ Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return super.g(jVar, hVar, eVar);
    }

    @Override // u6.g, p6.l
    public /* bridge */ /* synthetic */ boolean q() {
        return super.q();
    }

    @Override // u6.g, p6.l
    public /* bridge */ /* synthetic */ h7.c r() {
        return super.r();
    }

    @Override // p6.l
    /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
    public p6.n e(e6.j jVar, p6.h hVar) {
        g.a aVar = new g.a();
        d7.l lVarH0 = hVar.h0();
        int iQ = jVar.q();
        return iQ != 1 ? iQ != 2 ? iQ != 3 ? iQ != 5 ? f1(jVar, hVar) : h1(jVar, hVar, lVarH0, aVar) : g1(jVar, hVar, lVarH0, aVar, lVarH0.a()) : lVarH0.k() : g1(jVar, hVar, lVarH0, aVar, lVarH0.k());
    }

    @Override // u6.g, p6.l
    public Boolean s(p6.g gVar) {
        return this.f28218e;
    }

    @Override // p6.l, s6.r
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public p6.n a(p6.h hVar) {
        return hVar.h0().d();
    }

    protected s(s sVar, boolean z10, boolean z11) {
        super(sVar, z10, z11);
    }
}
