package df;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ie.h f11041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final f f11042b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11043a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f10998b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f10999c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11043a = iArr;
        }
    }

    static {
        mf.c cVar = ve.j0.f30620v;
        rd.m.d(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        f11041a = new f(cVar);
        mf.c cVar2 = ve.j0.f30621w;
        rd.m.d(cVar2, "ENHANCED_MUTABILITY_ANNOTATION");
        f11042b = new f(cVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ie.h e(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new ie.o(ed.q.H0(list)) : (ie.h) ed.q.w0(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.h f(he.h hVar, h hVar2, o1 o1Var) {
        ge.d dVar = ge.d.f13816a;
        if (!p1.a(o1Var) || !(hVar instanceof he.e)) {
            return null;
        }
        if (hVar2.e() == i.f10988a && o1Var == o1.f11029a) {
            he.e eVar = (he.e) hVar;
            if (dVar.c(eVar)) {
                return dVar.a(eVar);
            }
        }
        if (hVar2.e() == i.f10989b && o1Var == o1.f11030b) {
            he.e eVar2 = (he.e) hVar;
            if (dVar.d(eVar2)) {
                return dVar.b(eVar2);
            }
        }
        return null;
    }

    public static final ie.h g() {
        return f11041a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(h hVar, o1 o1Var) {
        if (!p1.a(o1Var)) {
            return null;
        }
        k kVarF = hVar.f();
        int i10 = kVarF == null ? -1 : a.f11043a[kVarF.ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(eg.r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        return s1.c(fg.s.f13084a, r0Var);
    }
}
