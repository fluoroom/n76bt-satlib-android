package ze;

import ff.a;
import he.g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mf.b;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends ke.h0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f33130x = {rd.c0.f(new rd.w(d0.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0)), rd.c0.f(new rd.w(d0.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final cf.u f33131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ye.k f33132h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final jf.c f33133r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final dg.i f33134s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f f33135t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final dg.i f33136u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ie.h f33137v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final dg.i f33138w;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33139a;

        static {
            int[] iArr = new int[a.EnumC0182a.values().length];
            try {
                iArr[a.EnumC0182a.f13031r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0182a.f13028f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f33139a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ye.k kVar, cf.u uVar) {
        super(kVar.d(), uVar.d());
        rd.m.e(kVar, "outerContext");
        rd.m.e(uVar, "jPackage");
        this.f33131g = uVar;
        ye.k kVarF = ye.c.f(kVar, this, null, 0, 6, null);
        this.f33132h = kVarF;
        this.f33133r = kVar.a().b().f().g().g();
        this.f33134s = kVarF.e().d(new a0(this));
        this.f33135t = new f(kVarF, uVar, this);
        this.f33136u = kVarF.e().e(new b0(this), ed.q.k());
        this.f33137v = kVarF.a().i().a() ? ie.h.f16054l.b() : ye.h.a(kVarF, uVar);
        this.f33138w = kVarF.e().d(new c0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map M0(d0 d0Var) {
        List<String> listA = d0Var.f33132h.a().o().a(d0Var.d().a());
        ArrayList arrayList = new ArrayList();
        for (String str : listA) {
            b.a aVar = mf.b.f21989d;
            mf.c cVarE = vf.d.d(str).e();
            rd.m.d(cVarE, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            ef.x xVarB = ef.w.b(d0Var.f33132h.a().j(), aVar.c(cVarE), d0Var.f33133r);
            dd.q qVarA = xVarB != null ? dd.w.a(str, xVarB) : null;
            if (qVarA != null) {
                arrayList.add(qVarA);
            }
        }
        return ed.k0.r(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap R0(d0 d0Var) {
        HashMap map = new HashMap();
        for (Map.Entry entry : d0Var.O0().entrySet()) {
            String str = (String) entry.getKey();
            ef.x xVar = (ef.x) entry.getValue();
            vf.d dVarD = vf.d.d(str);
            rd.m.d(dVarD, "byInternalName(...)");
            ff.a aVarA = xVar.a();
            int i10 = a.f33139a[aVarA.c().ordinal()];
            if (i10 == 1) {
                String strE = aVarA.e();
                if (strE != null) {
                    map.put(dVarD, vf.d.d(strE));
                }
            } else if (i10 == 2) {
                map.put(dVarD, dVarD);
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List S0(d0 d0Var) {
        Collection collectionA = d0Var.f33131g.A();
        ArrayList arrayList = new ArrayList(ed.q.v(collectionA, 10));
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            arrayList.add(((cf.u) it.next()).d());
        }
        return arrayList;
    }

    public final he.e N0(cf.g gVar) {
        rd.m.e(gVar, "jClass");
        return this.f33135t.i().k0(gVar);
    }

    public final Map O0() {
        return (Map) dg.m.a(this.f33134s, this, f33130x[0]);
    }

    @Override // he.n0
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public f p() {
        return this.f33135t;
    }

    public final List Q0() {
        return (List) this.f33136u.a();
    }

    @Override // ie.b, ie.a
    public ie.h getAnnotations() {
        return this.f33137v;
    }

    @Override // ke.h0, ke.n, he.p
    public g1 getSource() {
        return new ef.y(this);
    }

    @Override // ke.h0, ke.m
    public String toString() {
        return "Lazy Java package fragment: " + d() + " of module " + this.f33132h.a().m();
    }
}
