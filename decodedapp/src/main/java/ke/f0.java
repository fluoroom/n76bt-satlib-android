package ke;

import he.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ke.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends m implements he.h0 {

    /* JADX INFO: renamed from: c */
    private final dg.n f19641c;

    /* JADX INFO: renamed from: d */
    private final ee.i f19642d;

    /* JADX INFO: renamed from: e */
    private final mf.f f19643e;

    /* JADX INFO: renamed from: f */
    private final Map f19644f;

    /* JADX INFO: renamed from: g */
    private final i0 f19645g;

    /* JADX INFO: renamed from: h */
    private b0 f19646h;

    /* JADX INFO: renamed from: r */
    private he.o0 f19647r;

    /* JADX INFO: renamed from: s */
    private boolean f19648s;

    /* JADX INFO: renamed from: t */
    private final dg.g f19649t;

    /* JADX INFO: renamed from: u */
    private final dd.j f19650u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(mf.f fVar, dg.n nVar, ee.i iVar, nf.a aVar) {
        this(fVar, nVar, iVar, aVar, null, null, 48, null);
        rd.m.e(fVar, "moduleName");
        rd.m.e(nVar, "storageManager");
        rd.m.e(iVar, "builtIns");
    }

    private final String L0() {
        String string = getName().toString();
        rd.m.d(string, "toString(...)");
        return string;
    }

    private final l N0() {
        return (l) this.f19650u.getValue();
    }

    private final boolean P0() {
        return this.f19647r != null;
    }

    public static final l R0(f0 f0Var) {
        b0 b0Var = f0Var.f19646h;
        if (b0Var == null) {
            throw new AssertionError("Dependencies of module " + f0Var.L0() + " were not set before querying module content");
        }
        List listA = b0Var.a();
        f0Var.K0();
        listA.contains(f0Var);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).P0();
        }
        ArrayList arrayList = new ArrayList(ed.q.v(listA, 10));
        Iterator it2 = listA.iterator();
        while (it2.hasNext()) {
            he.o0 o0Var = ((f0) it2.next()).f19647r;
            rd.m.b(o0Var);
            arrayList.add(o0Var);
        }
        return new l(arrayList, "CompositeProvider@ModuleDescriptor for " + f0Var.getName());
    }

    public static final he.u0 S0(f0 f0Var, mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return f0Var.f19645g.a(f0Var, cVar, f0Var.f19641c);
    }

    @Override // he.h0
    public Object A0(he.g0 g0Var) {
        rd.m.e(g0Var, "capability");
        Object obj = this.f19644f.get(g0Var);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public void K0() {
        if (Q0()) {
            return;
        }
        he.c0.a(this);
    }

    public final he.o0 M0() {
        K0();
        return N0();
    }

    public final void O0(he.o0 o0Var) {
        rd.m.e(o0Var, "providerForModuleContent");
        P0();
        this.f19647r = o0Var;
    }

    public boolean Q0() {
        return this.f19648s;
    }

    public final void T0(List list) {
        rd.m.e(list, "descriptors");
        U0(list, ed.r0.d());
    }

    public final void U0(List list, Set set) {
        rd.m.e(list, "descriptors");
        rd.m.e(set, "friends");
        V0(new c0(list, set, ed.q.k(), ed.r0.d()));
    }

    public final void V0(b0 b0Var) {
        rd.m.e(b0Var, "dependencies");
        this.f19646h = b0Var;
    }

    public final void W0(f0... f0VarArr) {
        rd.m.e(f0VarArr, "descriptors");
        T0(ed.j.k0(f0VarArr));
    }

    @Override // he.m
    public he.m b() {
        return h0.a.b(this);
    }

    @Override // he.h0
    public ee.i o() {
        return this.f19642d;
    }

    @Override // he.h0
    public Collection q(mf.c cVar, qd.l lVar) {
        rd.m.e(cVar, "fqName");
        rd.m.e(lVar, "nameFilter");
        K0();
        return M0().q(cVar, lVar);
    }

    @Override // he.h0
    public List s0() {
        b0 b0Var = this.f19646h;
        if (b0Var != null) {
            return b0Var.c();
        }
        throw new AssertionError("Dependencies of module " + L0() + " were not set");
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        return h0.a.a(this, oVar, obj);
    }

    @Override // ke.m
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!Q0()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        he.o0 o0Var = this.f19647r;
        sb2.append(o0Var != null ? o0Var.getClass().getSimpleName() : null);
        return sb2.toString();
    }

    @Override // he.h0
    public he.u0 y(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        K0();
        return (he.u0) this.f19649t.l(cVar);
    }

    @Override // he.h0
    public boolean z(he.h0 h0Var) {
        rd.m.e(h0Var, "targetModule");
        if (rd.m.a(this, h0Var)) {
            return true;
        }
        b0 b0Var = this.f19646h;
        rd.m.b(b0Var);
        return ed.q.T(b0Var.b(), h0Var) || s0().contains(h0Var) || h0Var.s0().contains(this);
    }

    public /* synthetic */ f0(mf.f fVar, dg.n nVar, ee.i iVar, nf.a aVar, Map map, mf.f fVar2, int i10, rd.h hVar) {
        this(fVar, nVar, iVar, (i10 & 8) != 0 ? null : aVar, (i10 & 16) != 0 ? ed.k0.i() : map, (i10 & 32) != 0 ? null : fVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(mf.f fVar, dg.n nVar, ee.i iVar, nf.a aVar, Map map, mf.f fVar2) {
        super(ie.h.f16054l.b(), fVar);
        rd.m.e(fVar, "moduleName");
        rd.m.e(nVar, "storageManager");
        rd.m.e(iVar, "builtIns");
        rd.m.e(map, "capabilities");
        this.f19641c = nVar;
        this.f19642d = iVar;
        this.f19643e = fVar2;
        if (fVar.i()) {
            this.f19644f = map;
            i0 i0Var = (i0) A0(i0.f19682a.a());
            this.f19645g = i0Var == null ? i0.b.f19685b : i0Var;
            this.f19648s = true;
            this.f19649t = nVar.f(new d0(this));
            this.f19650u = dd.k.b(new e0(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + fVar);
    }
}
