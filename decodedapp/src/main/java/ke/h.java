package ke;

import eg.c1;
import eg.m2;
import eg.q1;
import eg.u1;
import he.g1;
import he.j1;
import he.l1;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends n implements l1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m2 f19666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f19667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f19668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final dg.i f19669h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final dg.i f19670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final dg.n f19671s;

    class a implements qd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ dg.n f19672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j1 f19673b;

        a(dg.n nVar, j1 j1Var) {
            this.f19672a = nVar;
            this.f19673b = j1Var;
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u1 a() {
            return new c(h.this, this.f19672a, this.f19673b);
        }
    }

    class b implements qd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mf.f f19675a;

        class a implements qd.a {
            a() {
            }

            @Override // qd.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public xf.k a() {
                return xf.x.m("Scope for type parameter " + b.this.f19675a.d(), h.this.getUpperBounds());
            }
        }

        b(mf.f fVar) {
            this.f19675a = fVar;
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c1 a() {
            return eg.u0.m(q1.f12167b.k(), h.this.k(), Collections.EMPTY_LIST, false, new xf.i(new a()));
        }
    }

    private class c extends eg.p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j1 f19678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f19679e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, dg.n nVar, j1 j1Var) {
            super(nVar);
            if (nVar == null) {
                H(0);
            }
            this.f19679e = hVar;
            this.f19678d = j1Var;
        }

        private static /* synthetic */ void H(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // eg.v
        protected boolean c(he.h hVar) {
            if (hVar == null) {
                H(9);
            }
            return (hVar instanceof l1) && qf.g.f25128a.m(this.f19679e, (l1) hVar, true);
        }

        @Override // eg.u1
        public List getParameters() {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                H(2);
            }
            return list;
        }

        @Override // eg.p
        protected Collection m() {
            List listL0 = this.f19679e.L0();
            if (listL0 == null) {
                H(1);
            }
            return listL0;
        }

        @Override // eg.p
        protected eg.r0 n() {
            return gg.l.d(gg.k.D, new String[0]);
        }

        @Override // eg.u1
        public ee.i o() {
            ee.i iVarM = uf.e.m(this.f19679e);
            if (iVarM == null) {
                H(4);
            }
            return iVarM;
        }

        @Override // eg.v, eg.u1
        public he.h q() {
            h hVar = this.f19679e;
            if (hVar == null) {
                H(3);
            }
            return hVar;
        }

        @Override // eg.u1
        public boolean r() {
            return true;
        }

        public String toString() {
            return this.f19679e.getName().toString();
        }

        @Override // eg.p
        protected j1 v() {
            j1 j1Var = this.f19678d;
            if (j1Var == null) {
                H(5);
            }
            return j1Var;
        }

        @Override // eg.p
        protected List x(List list) {
            if (list == null) {
                H(7);
            }
            List listG0 = this.f19679e.G0(list);
            if (listG0 == null) {
                H(8);
            }
            return listG0;
        }

        @Override // eg.p
        protected void z(eg.r0 r0Var) {
            if (r0Var == null) {
                H(6);
            }
            this.f19679e.K0(r0Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected h(dg.n nVar, he.m mVar, ie.h hVar, mf.f fVar, m2 m2Var, boolean z10, int i10, g1 g1Var, j1 j1Var) {
        super(mVar, hVar, fVar, g1Var);
        if (nVar == null) {
            K(0);
        }
        if (mVar == null) {
            K(1);
        }
        if (hVar == null) {
            K(2);
        }
        if (fVar == null) {
            K(3);
        }
        if (m2Var == null) {
            K(4);
        }
        if (g1Var == null) {
            K(5);
        }
        if (j1Var == null) {
            K(6);
        }
        this.f19666e = m2Var;
        this.f19667f = z10;
        this.f19668g = i10;
        this.f19669h = nVar.d(new a(nVar, j1Var));
        this.f19670r = nVar.d(new b(fVar));
        this.f19671s = nVar;
    }

    private static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    protected List G0(List list) {
        if (list == null) {
            K(12);
        }
        if (list == null) {
            K(13);
        }
        return list;
    }

    @Override // he.l1
    public boolean I() {
        return this.f19667f;
    }

    protected abstract void K0(eg.r0 r0Var);

    protected abstract List L0();

    @Override // he.l1
    public int getIndex() {
        return this.f19668g;
    }

    @Override // he.l1
    public List getUpperBounds() {
        List listE = ((c) k()).e();
        if (listE == null) {
            K(8);
        }
        return listE;
    }

    @Override // he.l1
    public dg.n i0() {
        dg.n nVar = this.f19671s;
        if (nVar == null) {
            K(14);
        }
        return nVar;
    }

    @Override // he.l1, he.h
    public final u1 k() {
        u1 u1Var = (u1) this.f19669h.a();
        if (u1Var == null) {
            K(9);
        }
        return u1Var;
    }

    @Override // he.l1
    public m2 n() {
        m2 m2Var = this.f19666e;
        if (m2Var == null) {
            K(7);
        }
        return m2Var;
    }

    @Override // he.l1
    public boolean n0() {
        return false;
    }

    @Override // he.h
    public c1 s() {
        c1 c1Var = (c1) this.f19670r.a();
        if (c1Var == null) {
            K(10);
        }
        return c1Var;
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        return oVar.b(this, obj);
    }

    @Override // ke.n, ke.m, he.m
    public l1 a() {
        l1 l1Var = (l1) super.a();
        if (l1Var == null) {
            K(11);
        }
        return l1Var;
    }
}
