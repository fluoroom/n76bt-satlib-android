package ke;

import eg.c1;
import eg.d2;
import eg.f2;
import eg.i2;
import he.b1;
import he.k1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mf.f f19624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final dg.i f19625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg.i f19626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dg.i f19627e;

    /* JADX INFO: renamed from: ke.a$a, reason: collision with other inner class name */
    class C0257a implements qd.a {

        /* JADX INFO: renamed from: ke.a$a$a, reason: collision with other inner class name */
        class C0258a implements qd.l {
            C0258a() {
            }

            @Override // qd.l
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c1 l(fg.g gVar) {
                he.h hVarF = gVar.f(a.this);
                return hVarF == null ? (c1) a.this.f19625c.a() : hVarF instanceof k1 ? eg.u0.c((k1) hVarF, i2.g(hVarF.k().getParameters())) : hVarF instanceof z ? i2.u(hVarF.k().p(gVar), ((z) hVarF).f0(gVar), this) : hVarF.s();
            }
        }

        C0257a() {
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c1 a() {
            a aVar = a.this;
            return i2.v(aVar, aVar.E0(), new C0258a());
        }
    }

    class b implements qd.a {
        b() {
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public xf.k a() {
            return new xf.g(a.this.E0());
        }
    }

    class c implements qd.a {
        c() {
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b1 a() {
            return new t(a.this);
        }
    }

    public a(dg.n nVar, mf.f fVar) {
        if (nVar == null) {
            B0(0);
        }
        if (fVar == null) {
            B0(1);
        }
        this.f19624b = fVar;
        this.f19625c = nVar.d(new C0257a());
        this.f19626d = nVar.d(new b());
        this.f19627e = nVar.d(new c());
    }

    private static /* synthetic */ void B0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // he.e
    public xf.k E0() {
        xf.k kVarF0 = f0(uf.e.r(qf.i.g(this)));
        if (kVarF0 == null) {
            B0(17);
        }
        return kVarF0;
    }

    @Override // he.i1
    /* JADX INFO: renamed from: G0 */
    public he.e c(f2 f2Var) {
        if (f2Var == null) {
            B0(18);
        }
        return f2Var.k() ? this : new y(this, f2Var);
    }

    @Override // he.e
    public List H0() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            B0(6);
        }
        return list;
    }

    @Override // he.e
    public b1 J0() {
        b1 b1Var = (b1) this.f19627e.a();
        if (b1Var == null) {
            B0(5);
        }
        return b1Var;
    }

    @Override // ke.z
    public xf.k K(d2 d2Var, fg.g gVar) {
        if (d2Var == null) {
            B0(10);
        }
        if (gVar == null) {
            B0(11);
        }
        if (!d2Var.f()) {
            return new xf.t(f0(gVar), f2.g(d2Var));
        }
        xf.k kVarF0 = f0(gVar);
        if (kVarF0 == null) {
            B0(12);
        }
        return kVarF0;
    }

    @Override // he.e
    public xf.k O(d2 d2Var) {
        if (d2Var == null) {
            B0(15);
        }
        xf.k kVarK = K(d2Var, uf.e.r(qf.i.g(this)));
        if (kVarK == null) {
            B0(16);
        }
        return kVarK;
    }

    @Override // he.j0
    public mf.f getName() {
        mf.f fVar = this.f19624b;
        if (fVar == null) {
            B0(2);
        }
        return fVar;
    }

    @Override // he.e, he.h
    public c1 s() {
        c1 c1Var = (c1) this.f19625c.a();
        if (c1Var == null) {
            B0(20);
        }
        return c1Var;
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        return oVar.h(this, obj);
    }

    @Override // he.e
    public xf.k y0() {
        xf.k kVar = (xf.k) this.f19626d.a();
        if (kVar == null) {
            B0(4);
        }
        return kVar;
    }

    @Override // he.m
    public he.e a() {
        return this;
    }
}
