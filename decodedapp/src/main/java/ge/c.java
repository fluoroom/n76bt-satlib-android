package ge;

import ee.o;
import fe.f;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import mf.b;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a */
    public static final c f13796a;

    /* JADX INFO: renamed from: b */
    private static final String f13797b;

    /* JADX INFO: renamed from: c */
    private static final String f13798c;

    /* JADX INFO: renamed from: d */
    private static final String f13799d;

    /* JADX INFO: renamed from: e */
    private static final String f13800e;

    /* JADX INFO: renamed from: f */
    private static final mf.b f13801f;

    /* JADX INFO: renamed from: g */
    private static final mf.c f13802g;

    /* JADX INFO: renamed from: h */
    private static final mf.b f13803h;

    /* JADX INFO: renamed from: i */
    private static final mf.b f13804i;

    /* JADX INFO: renamed from: j */
    private static final mf.b f13805j;

    /* JADX INFO: renamed from: k */
    private static final HashMap f13806k;

    /* JADX INFO: renamed from: l */
    private static final HashMap f13807l;

    /* JADX INFO: renamed from: m */
    private static final HashMap f13808m;

    /* JADX INFO: renamed from: n */
    private static final HashMap f13809n;

    /* JADX INFO: renamed from: o */
    private static final HashMap f13810o;

    /* JADX INFO: renamed from: p */
    private static final HashMap f13811p;

    /* JADX INFO: renamed from: q */
    private static final List f13812q;

    public static final class a {

        /* JADX INFO: renamed from: a */
        private final mf.b f13813a;

        /* JADX INFO: renamed from: b */
        private final mf.b f13814b;

        /* JADX INFO: renamed from: c */
        private final mf.b f13815c;

        public a(mf.b bVar, mf.b bVar2, mf.b bVar3) {
            rd.m.e(bVar, "javaClass");
            rd.m.e(bVar2, "kotlinReadOnly");
            rd.m.e(bVar3, "kotlinMutable");
            this.f13813a = bVar;
            this.f13814b = bVar2;
            this.f13815c = bVar3;
        }

        public final mf.b a() {
            return this.f13813a;
        }

        public final mf.b b() {
            return this.f13814b;
        }

        public final mf.b c() {
            return this.f13815c;
        }

        public final mf.b d() {
            return this.f13813a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return rd.m.a(this.f13813a, aVar.f13813a) && rd.m.a(this.f13814b, aVar.f13814b) && rd.m.a(this.f13815c, aVar.f13815c);
        }

        public int hashCode() {
            return (((this.f13813a.hashCode() * 31) + this.f13814b.hashCode()) * 31) + this.f13815c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f13813a + ", kotlinReadOnly=" + this.f13814b + ", kotlinMutable=" + this.f13815c + ')';
        }
    }

    static {
        c cVar = new c();
        f13796a = cVar;
        StringBuilder sb2 = new StringBuilder();
        f.a aVar = f.a.f13005f;
        sb2.append(aVar.b());
        sb2.append('.');
        sb2.append(aVar.a());
        f13797b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        f.b bVar = f.b.f13006f;
        sb3.append(bVar.b());
        sb3.append('.');
        sb3.append(bVar.a());
        f13798c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        f.d dVar = f.d.f13008f;
        sb4.append(dVar.b());
        sb4.append('.');
        sb4.append(dVar.a());
        f13799d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        f.c cVar2 = f.c.f13007f;
        sb5.append(cVar2.b());
        sb5.append('.');
        sb5.append(cVar2.a());
        f13800e = sb5.toString();
        b.a aVar2 = mf.b.f21989d;
        mf.b bVarC = aVar2.c(new mf.c("kotlin.jvm.functions.FunctionN"));
        f13801f = bVarC;
        f13802g = bVarC.a();
        mf.i iVar = mf.i.f22029a;
        f13803h = iVar.l();
        f13804i = iVar.k();
        f13805j = cVar.g(Class.class);
        f13806k = new HashMap();
        f13807l = new HashMap();
        f13808m = new HashMap();
        f13809n = new HashMap();
        f13810o = new HashMap();
        f13811p = new HashMap();
        mf.b bVarC2 = aVar2.c(o.a.W);
        a aVar3 = new a(cVar.g(Iterable.class), bVarC2, new mf.b(bVarC2.f(), mf.e.g(o.a.f11870e0, bVarC2.f()), false));
        mf.b bVarC3 = aVar2.c(o.a.V);
        a aVar4 = new a(cVar.g(Iterator.class), bVarC3, new mf.b(bVarC3.f(), mf.e.g(o.a.f11868d0, bVarC3.f()), false));
        mf.b bVarC4 = aVar2.c(o.a.X);
        a aVar5 = new a(cVar.g(Collection.class), bVarC4, new mf.b(bVarC4.f(), mf.e.g(o.a.f11872f0, bVarC4.f()), false));
        mf.b bVarC5 = aVar2.c(o.a.Y);
        a aVar6 = new a(cVar.g(List.class), bVarC5, new mf.b(bVarC5.f(), mf.e.g(o.a.f11874g0, bVarC5.f()), false));
        mf.b bVarC6 = aVar2.c(o.a.f11862a0);
        a aVar7 = new a(cVar.g(Set.class), bVarC6, new mf.b(bVarC6.f(), mf.e.g(o.a.f11878i0, bVarC6.f()), false));
        mf.b bVarC7 = aVar2.c(o.a.Z);
        a aVar8 = new a(cVar.g(ListIterator.class), bVarC7, new mf.b(bVarC7.f(), mf.e.g(o.a.f11876h0, bVarC7.f()), false));
        mf.c cVar3 = o.a.f11864b0;
        mf.b bVarC8 = aVar2.c(cVar3);
        a aVar9 = new a(cVar.g(Map.class), bVarC8, new mf.b(bVarC8.f(), mf.e.g(o.a.f11880j0, bVarC8.f()), false));
        mf.b bVarD = aVar2.c(cVar3).d(o.a.f11866c0.f());
        List listN = ed.q.n(aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(cVar.g(Map.Entry.class), bVarD, new mf.b(bVarD.f(), mf.e.g(o.a.f11882k0, bVarD.f()), false)));
        f13812q = listN;
        cVar.f(Object.class, o.a.f11863b);
        cVar.f(String.class, o.a.f11875h);
        cVar.f(CharSequence.class, o.a.f11873g);
        cVar.e(Throwable.class, o.a.f11901u);
        cVar.f(Cloneable.class, o.a.f11867d);
        cVar.f(Number.class, o.a.f11895r);
        cVar.e(Comparable.class, o.a.f11903v);
        cVar.f(Enum.class, o.a.f11897s);
        cVar.e(Annotation.class, o.a.G);
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            f13796a.d((a) it.next());
        }
        for (vf.e eVar : vf.e.values()) {
            c cVar4 = f13796a;
            b.a aVar10 = mf.b.f21989d;
            mf.c cVarI = eVar.i();
            rd.m.d(cVarI, "getWrapperFqName(...)");
            mf.b bVarC9 = aVar10.c(cVarI);
            ee.l lVarH = eVar.h();
            rd.m.d(lVarH, "getPrimitiveType(...)");
            cVar4.a(bVarC9, aVar10.c(ee.o.c(lVarH)));
        }
        for (mf.b bVar2 : ee.d.f11783a.a()) {
            f13796a.a(mf.b.f21989d.c(new mf.c("kotlin.jvm.internal." + bVar2.h().d() + "CompanionObject")), bVar2.d(mf.h.f22013d));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            c cVar5 = f13796a;
            cVar5.a(mf.b.f21989d.c(new mf.c("kotlin.jvm.functions.Function" + i10)), ee.o.a(i10));
            cVar5.c(new mf.c(f13798c + i10), f13803h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            f.c cVar6 = f.c.f13007f;
            f13796a.c(new mf.c((cVar6.b() + '.' + cVar6.a()) + i11), f13803h);
        }
        c cVar7 = f13796a;
        cVar7.c(new mf.c("kotlin.concurrent.atomics.AtomicInt"), cVar7.g(AtomicInteger.class));
        cVar7.c(new mf.c("kotlin.concurrent.atomics.AtomicLong"), cVar7.g(AtomicLong.class));
        cVar7.c(new mf.c("kotlin.concurrent.atomics.AtomicBoolean"), cVar7.g(AtomicBoolean.class));
        cVar7.c(new mf.c("kotlin.concurrent.atomics.AtomicReference"), cVar7.g(AtomicReference.class));
        cVar7.c(new mf.c("kotlin.concurrent.atomics.AtomicIntArray"), cVar7.g(AtomicIntegerArray.class));
        cVar7.c(new mf.c("kotlin.concurrent.atomics.AtomicLongArray"), cVar7.g(AtomicLongArray.class));
        cVar7.c(new mf.c("kotlin.concurrent.atomics.AtomicArray"), cVar7.g(AtomicReferenceArray.class));
        cVar7.c(o.a.f11865c.m(), cVar7.g(Void.class));
    }

    private c() {
    }

    private final void a(mf.b bVar, mf.b bVar2) {
        b(bVar, bVar2);
        c(bVar2.a(), bVar);
    }

    private final void b(mf.b bVar, mf.b bVar2) {
        f13806k.put(bVar.a().i(), bVar2);
    }

    private final void c(mf.c cVar, mf.b bVar) {
        f13807l.put(cVar.i(), bVar);
    }

    private final void d(a aVar) {
        mf.b bVarA = aVar.a();
        mf.b bVarB = aVar.b();
        mf.b bVarC = aVar.c();
        a(bVarA, bVarB);
        c(bVarC.a(), bVarA);
        f13810o.put(bVarC, bVarB);
        f13811p.put(bVarB, bVarC);
        mf.c cVarA = bVarB.a();
        mf.c cVarA2 = bVarC.a();
        f13808m.put(bVarC.a().i(), cVarA);
        f13809n.put(cVarA.i(), cVarA2);
    }

    private final void e(Class cls, mf.c cVar) {
        a(g(cls), mf.b.f21989d.c(cVar));
    }

    private final void f(Class cls, mf.d dVar) {
        e(cls, dVar.m());
    }

    private final mf.b g(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            b.a aVar = mf.b.f21989d;
            String canonicalName = cls.getCanonicalName();
            rd.m.d(canonicalName, "getCanonicalName(...)");
            return aVar.c(new mf.c(canonicalName));
        }
        mf.b bVarG = g(declaringClass);
        mf.f fVarH = mf.f.h(cls.getSimpleName());
        rd.m.d(fVarH, "identifier(...)");
        return bVarG.d(fVarH);
    }

    private final boolean j(mf.d dVar, String str) {
        Integer numP;
        String strA = dVar.a();
        if (!rg.q.J(strA, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strA.substring(str.length());
        rd.m.d(strSubstring, "substring(...)");
        return (rg.q.F0(strSubstring, '0', false, 2, null) || (numP = rg.q.p(strSubstring)) == null || numP.intValue() < 23) ? false : true;
    }

    public final mf.c h() {
        return f13802g;
    }

    public final List i() {
        return f13812q;
    }

    public final boolean k(mf.d dVar) {
        return f13808m.containsKey(dVar);
    }

    public final boolean l(mf.d dVar) {
        return f13809n.containsKey(dVar);
    }

    public final mf.b m(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return (mf.b) f13806k.get(cVar.i());
    }

    public final mf.b n(mf.d dVar) {
        rd.m.e(dVar, "kotlinFqName");
        return j(dVar, f13797b) ? f13801f : j(dVar, f13799d) ? f13801f : j(dVar, f13798c) ? f13803h : j(dVar, f13800e) ? f13803h : (mf.b) f13807l.get(dVar);
    }

    public final mf.c o(mf.d dVar) {
        return (mf.c) f13808m.get(dVar);
    }

    public final mf.c p(mf.d dVar) {
        return (mf.c) f13809n.get(dVar);
    }
}
