package fg;

import eg.a2;
import eg.l2;
import eg.r0;
import he.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a2 f13072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private qd.a f13073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f13074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l1 f13075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dd.j f13076e;

    public n(a2 a2Var, qd.a aVar, n nVar, l1 l1Var) {
        rd.m.e(a2Var, "projection");
        this.f13072a = a2Var;
        this.f13073b = aVar;
        this.f13074c = nVar;
        this.f13075d = l1Var;
        this.f13076e = dd.k.a(dd.n.f10910b, new j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List b(n nVar) {
        qd.a aVar = nVar.f13073b;
        if (aVar != null) {
            return (List) aVar.a();
        }
        return null;
    }

    private final List i() {
        return (List) this.f13076e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(n nVar, g gVar) {
        List listE = nVar.e();
        ArrayList arrayList = new ArrayList(ed.q.v(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(((l2) it.next()).X0(gVar));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rd.m.a(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        rd.m.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        n nVar = (n) obj;
        n nVar2 = this.f13074c;
        if (nVar2 == null) {
            nVar2 = this;
        }
        n nVar3 = nVar.f13074c;
        if (nVar3 != null) {
            obj = nVar3;
        }
        return nVar2 == obj;
    }

    @Override // eg.u1
    public List getParameters() {
        return ed.q.k();
    }

    @Override // eg.u1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List e() {
        List listI = i();
        return listI == null ? ed.q.k() : listI;
    }

    public int hashCode() {
        n nVar = this.f13074c;
        return nVar != null ? nVar.hashCode() : super.hashCode();
    }

    public final void j(List list) {
        rd.m.e(list, "supertypes");
        this.f13073b = new l(list);
    }

    @Override // eg.u1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public n p(g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        a2 a2VarP = s().p(gVar);
        rd.m.d(a2VarP, "refine(...)");
        m mVar = this.f13073b != null ? new m(this, gVar) : null;
        n nVar = this.f13074c;
        if (nVar == null) {
            nVar = this;
        }
        return new n(a2VarP, mVar, nVar, this.f13075d);
    }

    @Override // eg.u1
    public ee.i o() {
        r0 type = s().getType();
        rd.m.d(type, "getType(...)");
        return jg.d.n(type);
    }

    @Override // eg.u1
    public he.h q() {
        return null;
    }

    @Override // eg.u1
    public boolean r() {
        return false;
    }

    @Override // rf.b
    public a2 s() {
        return this.f13072a;
    }

    public String toString() {
        return "CapturedType(" + s() + ')';
    }

    public /* synthetic */ n(a2 a2Var, qd.a aVar, n nVar, l1 l1Var, int i10, rd.h hVar) {
        this(a2Var, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : l1Var);
    }

    public /* synthetic */ n(a2 a2Var, List list, n nVar, int i10, rd.h hVar) {
        this(a2Var, list, (i10 & 4) != 0 ? null : nVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(a2 a2Var, List list, n nVar) {
        this(a2Var, new k(list), nVar, null, 8, null);
        rd.m.e(a2Var, "projection");
        rd.m.e(list, "supertypes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(List list) {
        return list;
    }
}
