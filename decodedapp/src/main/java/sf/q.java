package sf;

import eg.c1;
import eg.c2;
import eg.e2;
import eg.m2;
import eg.q1;
import eg.r0;
import eg.u0;
import eg.u1;
import he.h0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements u1 {

    /* JADX INFO: renamed from: f */
    public static final a f27342f = new a(null);

    /* JADX INFO: renamed from: a */
    private final long f27343a;

    /* JADX INFO: renamed from: b */
    private final h0 f27344b;

    /* JADX INFO: renamed from: c */
    private final Set f27345c;

    /* JADX INFO: renamed from: d */
    private final c1 f27346d;

    /* JADX INFO: renamed from: e */
    private final dd.j f27347e;

    public static final class a {

        /* JADX INFO: renamed from: sf.q$a$a */
        private static final class EnumC0377a extends Enum {

            /* JADX INFO: renamed from: a */
            public static final EnumC0377a f27348a = new EnumC0377a("COMMON_SUPER_TYPE", 0);

            /* JADX INFO: renamed from: b */
            public static final EnumC0377a f27349b = new EnumC0377a("INTERSECTION_TYPE", 1);

            /* JADX INFO: renamed from: c */
            private static final /* synthetic */ EnumC0377a[] f27350c;

            /* JADX INFO: renamed from: d */
            private static final /* synthetic */ kd.a f27351d;

            static {
                EnumC0377a[] enumC0377aArrA = a();
                f27350c = enumC0377aArrA;
                f27351d = kd.b.a(enumC0377aArrA);
            }

            private EnumC0377a(String str, int i10) {
                super(str, i10);
            }

            private static final /* synthetic */ EnumC0377a[] a() {
                return new EnumC0377a[]{f27348a, f27349b};
            }

            public static EnumC0377a valueOf(String str) {
                return (EnumC0377a) Enum.valueOf(EnumC0377a.class, str);
            }

            public static EnumC0377a[] values() {
                return (EnumC0377a[]) f27350c.clone();
            }
        }

        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f27352a;

            static {
                int[] iArr = new int[EnumC0377a.values().length];
                try {
                    iArr[EnumC0377a.f27348a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0377a.f27349b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f27352a = iArr;
            }
        }

        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private final c1 a(Collection collection, EnumC0377a enumC0377a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                c1 c1Var = (c1) it.next();
                next = q.f27342f.c((c1) next, c1Var, enumC0377a);
            }
            return (c1) next;
        }

        private final c1 c(c1 c1Var, c1 c1Var2, EnumC0377a enumC0377a) {
            if (c1Var != null && c1Var2 != null) {
                u1 u1VarN0 = c1Var.N0();
                u1 u1VarN02 = c1Var2.N0();
                boolean z10 = u1VarN0 instanceof q;
                if (z10 && (u1VarN02 instanceof q)) {
                    return e((q) u1VarN0, (q) u1VarN02, enumC0377a);
                }
                if (z10) {
                    return d((q) u1VarN0, c1Var2);
                }
                if (u1VarN02 instanceof q) {
                    return d((q) u1VarN02, c1Var);
                }
            }
            return null;
        }

        private final c1 d(q qVar, c1 c1Var) {
            if (qVar.f().contains(c1Var)) {
                return c1Var;
            }
            return null;
        }

        private final c1 e(q qVar, q qVar2, EnumC0377a enumC0377a) {
            Set setE0;
            int i10 = b.f27352a[enumC0377a.ordinal()];
            if (i10 == 1) {
                setE0 = ed.q.e0(qVar.f(), qVar2.f());
            } else {
                if (i10 != 2) {
                    throw new dd.o();
                }
                setE0 = ed.q.N0(qVar.f(), qVar2.f());
            }
            return u0.f(q1.f12167b.k(), new q(qVar.f27343a, qVar.f27344b, setE0, null), false);
        }

        public final c1 b(Collection collection) {
            rd.m.e(collection, "types");
            return a(collection, EnumC0377a.f27349b);
        }

        private a() {
        }
    }

    public /* synthetic */ q(long j10, h0 h0Var, Set set, rd.h hVar) {
        this(j10, h0Var, set);
    }

    private final List g() {
        return (List) this.f27347e.getValue();
    }

    private final boolean h() {
        Collection collectionA = v.a(this.f27344b);
        if (d.h0.a(collectionA) && collectionA.isEmpty()) {
            return true;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (this.f27345c.contains((r0) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final List i(q qVar) {
        c1 c1VarS = qVar.o().y().s();
        rd.m.d(c1VarS, "getDefaultType(...)");
        List listQ = ed.q.q(e2.f(c1VarS, ed.q.e(new c2(m2.f12141f, qVar.f27346d)), null, 2, null));
        if (!qVar.h()) {
            listQ.add(qVar.o().M());
        }
        return listQ;
    }

    private final String j() {
        return '[' + ed.q.i0(this.f27345c, ",", null, null, 0, null, p.f27341a, 30, null) + ']';
    }

    public static final CharSequence k(r0 r0Var) {
        rd.m.e(r0Var, "it");
        return r0Var.toString();
    }

    @Override // eg.u1
    public Collection e() {
        return g();
    }

    public final Set f() {
        return this.f27345c;
    }

    @Override // eg.u1
    public List getParameters() {
        return ed.q.k();
    }

    @Override // eg.u1
    public ee.i o() {
        return this.f27344b.o();
    }

    @Override // eg.u1
    public u1 p(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // eg.u1
    public he.h q() {
        return null;
    }

    @Override // eg.u1
    public boolean r() {
        return false;
    }

    public String toString() {
        return "IntegerLiteralType" + j();
    }

    private q(long j10, h0 h0Var, Set set) {
        this.f27346d = u0.f(q1.f12167b.k(), this, false);
        this.f27347e = dd.k.b(new o(this));
        this.f27343a = j10;
        this.f27344b = h0Var;
        this.f27345c = set;
    }
}
