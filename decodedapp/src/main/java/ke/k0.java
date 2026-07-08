package ke;

import eg.d2;
import eg.f2;
import eg.m2;
import he.a;
import he.a1;
import he.b;
import he.b1;
import he.g1;
import he.s1;
import he.y0;
import he.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k0 extends x0 implements y0 {
    private final boolean A;
    private final boolean B;
    private List C;
    private b1 D;
    private b1 E;
    private List F;
    private l0 G;
    private a1 H;
    private boolean I;
    private he.w J;
    private he.w K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final he.e0 f19703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private he.u f19704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Collection f19705t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final y0 f19706u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final b.a f19707v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f19708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f19709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final boolean f19710y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final boolean f19711z;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private he.m f19712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private he.e0 f19713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private he.u f19714c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b.a f19717f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private b1 f19720i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private mf.f f19722k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private eg.r0 f19723l;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private y0 f19715d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f19716e = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d2 f19718g = d2.f12074b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f19719h = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List f19721j = null;

        public a() {
            this.f19712a = k0.this.b();
            this.f19713b = k0.this.l();
            this.f19714c = k0.this.getVisibility();
            this.f19717f = k0.this.j();
            this.f19720i = k0.this.D;
            this.f19722k = k0.this.getName();
            this.f19723l = k0.this.getType();
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public y0 n() {
            return k0.this.Q0(this);
        }

        z0 o() {
            y0 y0Var = this.f19715d;
            if (y0Var == null) {
                return null;
            }
            return y0Var.f();
        }

        a1 p() {
            y0 y0Var = this.f19715d;
            if (y0Var == null) {
                return null;
            }
            return y0Var.h();
        }

        public a q(boolean z10) {
            this.f19719h = z10;
            return this;
        }

        public a r(b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f19717f = aVar;
            return this;
        }

        public a s(he.e0 e0Var) {
            if (e0Var == null) {
                a(6);
            }
            this.f19713b = e0Var;
            return this;
        }

        public a t(he.b bVar) {
            this.f19715d = (y0) bVar;
            return this;
        }

        public a u(he.m mVar) {
            if (mVar == null) {
                a(0);
            }
            this.f19712a = mVar;
            return this;
        }

        public a v(d2 d2Var) {
            if (d2Var == null) {
                a(15);
            }
            this.f19718g = d2Var;
            return this;
        }

        public a w(he.u uVar) {
            if (uVar == null) {
                a(8);
            }
            this.f19714c = uVar;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected k0(he.m mVar, y0 y0Var, ie.h hVar, he.e0 e0Var, he.u uVar, boolean z10, mf.f fVar, b.a aVar, g1 g1Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(mVar, hVar, fVar, null, z10, g1Var);
        if (mVar == null) {
            K(0);
        }
        if (hVar == null) {
            K(1);
        }
        if (e0Var == null) {
            K(2);
        }
        if (uVar == null) {
            K(3);
        }
        if (fVar == null) {
            K(4);
        }
        if (aVar == null) {
            K(5);
        }
        if (g1Var == null) {
            K(6);
        }
        this.f19705t = null;
        this.C = Collections.EMPTY_LIST;
        this.f19703r = e0Var;
        this.f19704s = uVar;
        this.f19706u = y0Var == null ? this : y0Var;
        this.f19707v = aVar;
        this.f19708w = z11;
        this.f19709x = z12;
        this.f19710y = z13;
        this.f19711z = z14;
        this.A = z15;
        this.B = z16;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void K(int r11) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.k0.K(int):void");
    }

    public static k0 O0(he.m mVar, ie.h hVar, he.e0 e0Var, he.u uVar, boolean z10, mf.f fVar, b.a aVar, g1 g1Var, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (mVar == null) {
            K(7);
        }
        if (hVar == null) {
            K(8);
        }
        if (e0Var == null) {
            K(9);
        }
        if (uVar == null) {
            K(10);
        }
        if (fVar == null) {
            K(11);
        }
        if (aVar == null) {
            K(12);
        }
        if (g1Var == null) {
            K(13);
        }
        return new k0(mVar, null, hVar, e0Var, uVar, z10, fVar, aVar, g1Var, z11, z12, z13, z14, z15, z16);
    }

    private g1 S0(boolean z10, y0 y0Var) {
        g1 source;
        if (z10) {
            if (y0Var == null) {
                y0Var = a();
            }
            source = y0Var.getSource();
        } else {
            source = g1.f15281a;
        }
        if (source == null) {
            K(28);
        }
        return source;
    }

    private static he.z T0(f2 f2Var, he.x0 x0Var) {
        if (f2Var == null) {
            K(30);
        }
        if (x0Var == null) {
            K(31);
        }
        if (x0Var.e0() != null) {
            return x0Var.e0().c(f2Var);
        }
        return null;
    }

    private static he.u Y0(he.u uVar, b.a aVar) {
        return (aVar == b.a.FAKE_OVERRIDE && he.t.g(uVar.f())) ? he.t.f15312h : uVar;
    }

    private static b1 d1(f2 f2Var, y0 y0Var, b1 b1Var) {
        eg.r0 r0VarP = f2Var.p(b1Var.getType(), m2.f12141f);
        if (r0VarP == null) {
            return null;
        }
        return new n0(y0Var, new yf.c(y0Var, r0VarP, ((yf.f) b1Var.getValue()).a(), b1Var.getValue()), b1Var.getAnnotations());
    }

    private static b1 e1(f2 f2Var, y0 y0Var, b1 b1Var) {
        eg.r0 r0VarP = f2Var.p(b1Var.getType(), m2.f12141f);
        if (r0VarP == null) {
            return null;
        }
        return new n0(y0Var, new yf.d(y0Var, r0VarP, b1Var.getValue()), b1Var.getAnnotations());
    }

    public boolean A() {
        return this.A;
    }

    @Override // he.t1
    public boolean C() {
        return this.f19709x;
    }

    @Override // he.d0
    public boolean F0() {
        return this.f19711z;
    }

    @Override // he.d0
    public boolean M() {
        return this.f19710y;
    }

    @Override // he.b
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public y0 Q(he.m mVar, he.e0 e0Var, he.u uVar, b.a aVar, boolean z10) {
        y0 y0VarN = X0().u(mVar).t(null).s(e0Var).w(uVar).r(aVar).q(z10).n();
        if (y0VarN == null) {
            K(42);
        }
        return y0VarN;
    }

    @Override // he.u1
    public boolean P() {
        return this.B;
    }

    protected k0 P0(he.m mVar, he.e0 e0Var, he.u uVar, y0 y0Var, b.a aVar, mf.f fVar, g1 g1Var) {
        if (mVar == null) {
            K(32);
        }
        if (e0Var == null) {
            K(33);
        }
        if (uVar == null) {
            K(34);
        }
        if (aVar == null) {
            K(35);
        }
        if (fVar == null) {
            K(36);
        }
        if (g1Var == null) {
            K(37);
        }
        return new k0(mVar, y0Var, getAnnotations(), e0Var, uVar, j0(), fVar, aVar, g1Var, r0(), C(), M(), F0(), A(), P());
    }

    protected y0 Q0(a aVar) {
        b1 b1Var;
        qd.a aVar2;
        if (aVar == null) {
            K(29);
        }
        k0 k0VarP0 = P0(aVar.f19712a, aVar.f19713b, aVar.f19714c, aVar.f19715d, aVar.f19717f, aVar.f19722k, S0(aVar.f19716e, aVar.f19715d));
        List typeParameters = aVar.f19721j == null ? getTypeParameters() : aVar.f19721j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        f2 f2VarB = eg.c0.b(typeParameters, aVar.f19718g, k0VarP0, arrayList);
        eg.r0 r0Var = aVar.f19723l;
        eg.r0 r0VarP = f2VarB.p(r0Var, m2.f12142g);
        if (r0VarP == null) {
            return null;
        }
        eg.r0 r0VarP2 = f2VarB.p(r0Var, m2.f12141f);
        if (r0VarP2 != null) {
            k0VarP0.Z0(r0VarP2);
        }
        b1 b1Var2 = aVar.f19720i;
        if (b1Var2 != null) {
            b1 b1VarC = b1Var2.c(f2VarB);
            if (b1VarC == null) {
                return null;
            }
            b1Var = b1VarC;
        } else {
            b1Var = null;
        }
        b1 b1Var3 = this.E;
        b1 b1VarE1 = b1Var3 != null ? e1(f2VarB, k0VarP0, b1Var3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            b1 b1VarD1 = d1(f2VarB, k0VarP0, (b1) it.next());
            if (b1VarD1 != null) {
                arrayList2.add(b1VarD1);
            }
        }
        k0VarP0.b1(r0VarP, arrayList, b1Var, b1VarE1, arrayList2);
        l0 l0Var = this.G == null ? null : new l0(k0VarP0, this.G.getAnnotations(), aVar.f19713b, Y0(this.G.getVisibility(), aVar.f19717f), this.G.isDefault(), this.G.A(), this.G.isInline(), aVar.f19717f, aVar.o(), g1.f15281a);
        if (l0Var != null) {
            eg.r0 r0VarG = this.G.g();
            l0Var.M0(T0(f2VarB, this.G));
            l0Var.P0(r0VarG != null ? f2VarB.p(r0VarG, m2.f12142g) : null);
        }
        m0 m0Var = this.H == null ? null : new m0(k0VarP0, this.H.getAnnotations(), aVar.f19713b, Y0(this.H.getVisibility(), aVar.f19717f), this.H.isDefault(), this.H.A(), this.H.isInline(), aVar.f19717f, aVar.p(), g1.f15281a);
        if (m0Var != null) {
            List listP0 = s.P0(m0Var, this.H.i(), f2VarB, false, false, null);
            if (listP0 == null) {
                k0VarP0.a1(true);
                listP0 = Collections.singletonList(m0.O0(m0Var, uf.e.m(aVar.f19712a).I(), ((s1) this.H.i().get(0)).getAnnotations()));
            }
            if (listP0.size() != 1) {
                throw new IllegalStateException();
            }
            m0Var.M0(T0(f2VarB, this.H));
            m0Var.Q0((s1) listP0.get(0));
        }
        he.w wVar = this.J;
        r rVar = wVar == null ? null : new r(wVar.getAnnotations(), k0VarP0);
        he.w wVar2 = this.K;
        k0VarP0.V0(l0Var, m0Var, rVar, wVar2 == null ? null : new r(wVar2.getAnnotations(), k0VarP0));
        if (aVar.f19719h) {
            og.k kVarC = og.k.c();
            Iterator it2 = e().iterator();
            while (it2.hasNext()) {
                kVarC.add(((y0) it2.next()).c(f2VarB));
            }
            k0VarP0.x0(kVarC);
        }
        if (C() && (aVar2 = this.f19823h) != null) {
            k0VarP0.K0(this.f19822g, aVar2);
        }
        return k0VarP0;
    }

    @Override // he.y0
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public l0 f() {
        return this.G;
    }

    public void U0(l0 l0Var, a1 a1Var) {
        V0(l0Var, a1Var, null, null);
    }

    public void V0(l0 l0Var, a1 a1Var, he.w wVar, he.w wVar2) {
        this.G = l0Var;
        this.H = a1Var;
        this.J = wVar;
        this.K = wVar2;
    }

    public boolean W0() {
        return this.I;
    }

    public a X0() {
        return new a();
    }

    public void Z0(eg.r0 r0Var) {
        if (r0Var == null) {
            K(14);
        }
    }

    public void a1(boolean z10) {
        this.I = z10;
    }

    public void b1(eg.r0 r0Var, List list, b1 b1Var, b1 b1Var2, List list2) {
        if (r0Var == null) {
            K(17);
        }
        if (list == null) {
            K(18);
        }
        if (list2 == null) {
            K(19);
        }
        G0(r0Var);
        this.F = new ArrayList(list);
        this.E = b1Var2;
        this.D = b1Var;
        this.C = list2;
    }

    public void c1(he.u uVar) {
        if (uVar == null) {
            K(20);
        }
        this.f19704s = uVar;
    }

    @Override // he.a
    public Object d0(a.InterfaceC0214a interfaceC0214a) {
        return null;
    }

    @Override // he.a
    public Collection e() {
        Collection collection = this.f19705t;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            K(41);
        }
        return collection;
    }

    @Override // ke.w0, he.a
    public eg.r0 g() {
        eg.r0 type = getType();
        if (type == null) {
            K(23);
        }
        return type;
    }

    @Override // ke.w0, he.a
    public b1 g0() {
        return this.D;
    }

    @Override // ke.w0, he.a
    public List getTypeParameters() {
        List list = this.F;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // he.q
    public he.u getVisibility() {
        he.u uVar = this.f19704s;
        if (uVar == null) {
            K(25);
        }
        return uVar;
    }

    @Override // he.y0
    public a1 h() {
        return this.H;
    }

    @Override // he.b
    public b.a j() {
        b.a aVar = this.f19707v;
        if (aVar == null) {
            K(39);
        }
        return aVar;
    }

    @Override // he.d0
    public he.e0 l() {
        he.e0 e0Var = this.f19703r;
        if (e0Var == null) {
            K(24);
        }
        return e0Var;
    }

    @Override // ke.w0, he.a
    public b1 l0() {
        return this.E;
    }

    @Override // he.y0
    public he.w m0() {
        return this.K;
    }

    @Override // he.y0
    public he.w p0() {
        return this.J;
    }

    @Override // he.a
    public List q0() {
        List list = this.C;
        if (list == null) {
            K(22);
        }
        return list;
    }

    @Override // he.t1
    public boolean r0() {
        return this.f19708w;
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        return oVar.l(this, obj);
    }

    @Override // he.y0
    public List w() {
        ArrayList arrayList = new ArrayList(2);
        l0 l0Var = this.G;
        if (l0Var != null) {
            arrayList.add(l0Var);
        }
        a1 a1Var = this.H;
        if (a1Var != null) {
            arrayList.add(a1Var);
        }
        return arrayList;
    }

    @Override // he.b
    public void x0(Collection collection) {
        if (collection == null) {
            K(40);
        }
        this.f19705t = collection;
    }

    @Override // he.i1
    public y0 c(f2 f2Var) {
        if (f2Var == null) {
            K(27);
        }
        return f2Var.k() ? this : X0().v(f2Var.j()).t(a()).n();
    }

    @Override // ke.n, ke.m, he.m
    public y0 a() {
        y0 y0Var = this.f19706u;
        y0 y0VarA = y0Var == this ? this : y0Var.a();
        if (y0VarA == null) {
            K(38);
        }
        return y0VarA;
    }
}
