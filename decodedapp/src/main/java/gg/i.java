package gg;

import ed.q;
import eg.c1;
import eg.q1;
import eg.u1;
import java.util.Arrays;
import java.util.List;
import rd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u1 f14448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xf.k f14449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f14450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f14451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f14452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f14453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f14454h;

    public /* synthetic */ i(u1 u1Var, xf.k kVar, k kVar2, List list, boolean z10, String[] strArr, int i10, rd.h hVar) {
        this(u1Var, kVar, kVar2, (i10 & 8) != 0 ? q.k() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    @Override // eg.r0
    public List L0() {
        return this.f14451e;
    }

    @Override // eg.r0
    public q1 M0() {
        return q1.f12167b.k();
    }

    @Override // eg.r0
    public u1 N0() {
        return this.f14448b;
    }

    @Override // eg.r0
    public boolean O0() {
        return this.f14452f;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: U0 */
    public c1 R0(boolean z10) {
        u1 u1VarN0 = N0();
        xf.k kVarP = p();
        k kVar = this.f14450d;
        List listL0 = L0();
        String[] strArr = this.f14453g;
        return new i(u1VarN0, kVarP, kVar, listL0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: V0 */
    public c1 T0(q1 q1Var) {
        rd.m.e(q1Var, "newAttributes");
        return this;
    }

    public final String W0() {
        return this.f14454h;
    }

    public final k X0() {
        return this.f14450d;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public i X0(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    public final i Z0(List list) {
        rd.m.e(list, "newArguments");
        u1 u1VarN0 = N0();
        xf.k kVarP = p();
        k kVar = this.f14450d;
        boolean zO0 = O0();
        String[] strArr = this.f14453g;
        return new i(u1VarN0, kVarP, kVar, list, zO0, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // eg.r0
    public xf.k p() {
        return this.f14449c;
    }

    public i(u1 u1Var, xf.k kVar, k kVar2, List list, boolean z10, String... strArr) {
        rd.m.e(u1Var, "constructor");
        rd.m.e(kVar, "memberScope");
        rd.m.e(kVar2, "kind");
        rd.m.e(list, "arguments");
        rd.m.e(strArr, "formatParams");
        this.f14448b = u1Var;
        this.f14449c = kVar;
        this.f14450d = kVar2;
        this.f14451e = list;
        this.f14452f = z10;
        this.f14453g = strArr;
        g0 g0Var = g0.f25951a;
        String strD = kVar2.d();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strD, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        rd.m.d(str, "format(...)");
        this.f14454h = str;
    }
}
