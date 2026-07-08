package eg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.l1[] f12132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2[] f12133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12134e;

    public /* synthetic */ m0(he.l1[] l1VarArr, a2[] a2VarArr, boolean z10, int i10, rd.h hVar) {
        this(l1VarArr, a2VarArr, (i10 & 4) != 0 ? false : z10);
    }

    @Override // eg.d2
    public boolean b() {
        return this.f12134e;
    }

    @Override // eg.d2
    public a2 e(r0 r0Var) {
        rd.m.e(r0Var, "key");
        he.h hVarQ = r0Var.N0().q();
        he.l1 l1Var = hVarQ instanceof he.l1 ? (he.l1) hVarQ : null;
        if (l1Var == null) {
            return null;
        }
        int index = l1Var.getIndex();
        he.l1[] l1VarArr = this.f12132c;
        if (index >= l1VarArr.length || !rd.m.a(l1VarArr[index].k(), l1Var.k())) {
            return null;
        }
        return this.f12133d[index];
    }

    @Override // eg.d2
    public boolean f() {
        return this.f12133d.length == 0;
    }

    public final a2[] i() {
        return this.f12133d;
    }

    public final he.l1[] j() {
        return this.f12132c;
    }

    public m0(he.l1[] l1VarArr, a2[] a2VarArr, boolean z10) {
        rd.m.e(l1VarArr, "parameters");
        rd.m.e(a2VarArr, "arguments");
        this.f12132c = l1VarArr;
        this.f12133d = a2VarArr;
        this.f12134e = z10;
        int length = l1VarArr.length;
        int length2 = a2VarArr.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(List list, List list2) {
        this((he.l1[]) list.toArray(new he.l1[0]), (a2[]) list2.toArray(new a2[0]), false, 4, null);
        rd.m.e(list, "parameters");
        rd.m.e(list2, "argumentsList");
    }
}
