package ge;

import ed.r0;
import ee.o;
import he.e0;
import he.g1;
import he.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import rd.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements je.b {

    /* JADX INFO: renamed from: g */
    private static final mf.f f13823g;

    /* JADX INFO: renamed from: h */
    private static final mf.b f13824h;

    /* JADX INFO: renamed from: a */
    private final h0 f13825a;

    /* JADX INFO: renamed from: b */
    private final qd.l f13826b;

    /* JADX INFO: renamed from: c */
    private final dg.i f13827c;

    /* JADX INFO: renamed from: e */
    static final /* synthetic */ yd.j[] f13821e = {c0.f(new rd.w(g.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};

    /* JADX INFO: renamed from: d */
    public static final a f13820d = new a(null);

    /* JADX INFO: renamed from: f */
    private static final mf.c f13822f = ee.o.B;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final mf.b a() {
            return g.f13824h;
        }

        private a() {
        }
    }

    static {
        mf.d dVar = o.a.f11867d;
        f13823g = dVar.j();
        f13824h = mf.b.f21989d.c(dVar.m());
    }

    public g(dg.n nVar, h0 h0Var, qd.l lVar) {
        rd.m.e(nVar, "storageManager");
        rd.m.e(h0Var, "moduleDescriptor");
        rd.m.e(lVar, "computeContainingDeclaration");
        this.f13825a = h0Var;
        this.f13826b = lVar;
        this.f13827c = nVar.d(new e(this, nVar));
    }

    public static final ee.c d(h0 h0Var) {
        rd.m.e(h0Var, "module");
        List listL = h0Var.y(f13822f).L();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (obj instanceof ee.c) {
                arrayList.add(obj);
            }
        }
        return (ee.c) ed.q.Z(arrayList);
    }

    public static final ke.k h(g gVar, dg.n nVar) {
        ke.k kVar = new ke.k((he.m) gVar.f13826b.l(gVar.f13825a), f13823g, e0.f15262e, he.f.f15272c, ed.q.e(gVar.f13825a.o().i()), g1.f15281a, false, nVar);
        kVar.K0(new ge.a(nVar, kVar), r0.d(), null);
        return kVar;
    }

    private final ke.k i() {
        return (ke.k) dg.m.a(this.f13827c, this, f13821e[0]);
    }

    @Override // je.b
    public he.e a(mf.b bVar) {
        rd.m.e(bVar, "classId");
        if (rd.m.a(bVar, f13824h)) {
            return i();
        }
        return null;
    }

    @Override // je.b
    public Collection b(mf.c cVar) {
        rd.m.e(cVar, "packageFqName");
        return rd.m.a(cVar, f13822f) ? r0.c(i()) : r0.d();
    }

    @Override // je.b
    public boolean c(mf.c cVar, mf.f fVar) {
        rd.m.e(cVar, "packageFqName");
        rd.m.e(fVar, "name");
        return rd.m.a(fVar, f13823g) && rd.m.a(cVar, f13822f);
    }

    public /* synthetic */ g(dg.n nVar, h0 h0Var, qd.l lVar, int i10, rd.h hVar) {
        this(nVar, h0Var, (i10 & 4) != 0 ? f.f13819a : lVar);
    }
}
