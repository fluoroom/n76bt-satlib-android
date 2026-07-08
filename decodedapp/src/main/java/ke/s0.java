package ke;

import eg.c1;
import eg.f2;
import eg.m2;
import he.b;
import he.b1;
import he.g1;
import he.k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends s implements q0 {
    private final dg.n N;
    private final k1 O;
    private final dg.j P;
    private he.d Q;
    static final /* synthetic */ yd.j[] S = {rd.c0.f(new rd.w(s0.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0))};
    public static final a R = new a(null);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f2 c(k1 k1Var) {
            if (k1Var.r() == null) {
                return null;
            }
            return f2.f(k1Var.X());
        }

        public final q0 b(dg.n nVar, k1 k1Var, he.d dVar) {
            he.d dVarC;
            List listK;
            rd.m.e(nVar, "storageManager");
            rd.m.e(k1Var, "typeAliasDescriptor");
            rd.m.e(dVar, "constructor");
            f2 f2VarC = c(k1Var);
            if (f2VarC == null || (dVarC = dVar.c(f2VarC)) == null) {
                return null;
            }
            ie.h annotations = dVar.getAnnotations();
            b.a aVarJ = dVar.j();
            rd.m.d(aVarJ, "getKind(...)");
            g1 source = k1Var.getSource();
            rd.m.d(source, "getSource(...)");
            s0 s0Var = new s0(nVar, k1Var, dVarC, null, annotations, aVarJ, source, null);
            List listO0 = s.O0(s0Var, dVar.i(), f2VarC);
            if (listO0 == null) {
                return null;
            }
            c1 c1VarC = eg.l0.c(dVarC.g().Q0());
            c1 c1VarS = k1Var.s();
            rd.m.d(c1VarS, "getDefaultType(...)");
            c1 c1VarJ = eg.g1.j(c1VarC, c1VarS);
            b1 b1VarG0 = dVar.g0();
            b1 b1VarI = b1VarG0 != null ? qf.h.i(s0Var, f2VarC.n(b1VarG0.getType(), m2.f12140e), ie.h.f16054l.b()) : null;
            he.e eVarR = k1Var.r();
            if (eVarR != null) {
                List listQ0 = dVar.q0();
                rd.m.d(listQ0, "getContextReceiverParameters(...)");
                listK = new ArrayList(ed.q.v(listQ0, 10));
                int i10 = 0;
                for (Object obj : listQ0) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        ed.q.u();
                    }
                    b1 b1Var = (b1) obj;
                    eg.r0 r0VarN = f2VarC.n(b1Var.getType(), m2.f12140e);
                    yf.g value = b1Var.getValue();
                    rd.m.c(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    listK.add(qf.h.c(eVarR, r0VarN, ((yf.f) value).a(), ie.h.f16054l.b(), i10));
                    i10 = i11;
                }
            } else {
                listK = ed.q.k();
            }
            s0Var.R0(b1VarI, null, listK, k1Var.v(), listO0, c1VarJ, he.e0.f15259b, k1Var.getVisibility());
            return s0Var;
        }

        private a() {
        }
    }

    public /* synthetic */ s0(dg.n nVar, k1 k1Var, he.d dVar, q0 q0Var, ie.h hVar, b.a aVar, g1 g1Var, rd.h hVar2) {
        this(nVar, k1Var, dVar, q0Var, hVar, aVar, g1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s0 r1(s0 s0Var, he.d dVar) {
        dg.n nVar = s0Var.N;
        k1 k1VarP1 = s0Var.p1();
        ie.h annotations = dVar.getAnnotations();
        b.a aVarJ = dVar.j();
        rd.m.d(aVarJ, "getKind(...)");
        g1 source = s0Var.p1().getSource();
        rd.m.d(source, "getSource(...)");
        s0 s0Var2 = new s0(nVar, k1VarP1, dVar, s0Var, annotations, aVarJ, source);
        f2 f2VarC = R.c(s0Var.p1());
        if (f2VarC == null) {
            return null;
        }
        b1 b1VarG0 = dVar.g0();
        b1 b1VarC = b1VarG0 != null ? b1VarG0.c(f2VarC) : null;
        List listQ0 = dVar.q0();
        rd.m.d(listQ0, "getContextReceiverParameters(...)");
        ArrayList arrayList = new ArrayList(ed.q.v(listQ0, 10));
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            arrayList.add(((b1) it.next()).c(f2VarC));
        }
        s0Var2.R0(null, b1VarC, arrayList, s0Var.p1().v(), s0Var.i(), s0Var.g(), he.e0.f15259b, s0Var.p1().getVisibility());
        return s0Var2;
    }

    @Override // he.l
    public boolean D() {
        return o0().D();
    }

    @Override // he.l
    public he.e E() {
        he.e eVarE = o0().E();
        rd.m.d(eVarE, "getConstructedClass(...)");
        return eVarE;
    }

    @Override // ke.s, he.a
    public eg.r0 g() {
        eg.r0 r0VarG = super.g();
        rd.m.b(r0VarG);
        return r0VarG;
    }

    @Override // he.b
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public q0 Q(he.m mVar, he.e0 e0Var, he.u uVar, b.a aVar, boolean z10) {
        rd.m.e(mVar, "newOwner");
        rd.m.e(e0Var, "modality");
        rd.m.e(uVar, "visibility");
        rd.m.e(aVar, "kind");
        he.z zVarBuild = u().j(mVar).e(e0Var).h(uVar).s(aVar).l(z10).build();
        rd.m.c(zVarBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (q0) zVarBuild;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.s
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public s0 L0(he.m mVar, he.z zVar, b.a aVar, mf.f fVar, ie.h hVar, g1 g1Var) {
        rd.m.e(mVar, "newOwner");
        rd.m.e(aVar, "kind");
        rd.m.e(hVar, "annotations");
        rd.m.e(g1Var, "source");
        b.a aVar2 = b.a.DECLARATION;
        if (aVar != aVar2) {
            b.a aVar3 = b.a.SYNTHESIZED;
        }
        return new s0(this.N, p1(), o0(), this, hVar, aVar2, g1Var);
    }

    @Override // ke.n, he.m
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public k1 b() {
        return p1();
    }

    @Override // ke.q0
    public he.d o0() {
        return this.Q;
    }

    @Override // ke.s, ke.n, ke.m, he.m
    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public q0 a() {
        he.z zVarA = super.a();
        rd.m.c(zVarA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (q0) zVarA;
    }

    public k1 p1() {
        return this.O;
    }

    @Override // ke.s, he.z, he.i1
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public q0 c(f2 f2Var) {
        rd.m.e(f2Var, "substitutor");
        he.z zVarC = super.c(f2Var);
        rd.m.c(zVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        s0 s0Var = (s0) zVarC;
        f2 f2VarF = f2.f(s0Var.g());
        rd.m.d(f2VarF, "create(...)");
        he.d dVarC = o0().a().c(f2VarF);
        if (dVarC == null) {
            return null;
        }
        s0Var.Q = dVarC;
        return s0Var;
    }

    private s0(dg.n nVar, k1 k1Var, he.d dVar, q0 q0Var, ie.h hVar, b.a aVar, g1 g1Var) {
        super(k1Var, q0Var, hVar, mf.h.f22019j, aVar, g1Var);
        this.N = nVar;
        this.O = k1Var;
        V0(p1().F0());
        this.P = nVar.a(new r0(this, dVar));
        this.Q = dVar;
    }
}
