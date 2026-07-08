package gg;

import ed.q;
import eg.u1;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f14455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f14456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14457c;

    public j(k kVar, String... strArr) {
        rd.m.e(kVar, "kind");
        rd.m.e(strArr, "formatParams");
        this.f14455a = kVar;
        this.f14456b = strArr;
        String strD = b.f14419g.d();
        String strD2 = kVar.d();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strD2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        rd.m.d(str, "format(...)");
        String str2 = String.format(strD, Arrays.copyOf(new Object[]{str}, 1));
        rd.m.d(str2, "format(...)");
        this.f14457c = str2;
    }

    public final k a() {
        return this.f14455a;
    }

    public final String b(int i10) {
        return this.f14456b[i10];
    }

    @Override // eg.u1
    public Collection e() {
        return q.k();
    }

    @Override // eg.u1
    public List getParameters() {
        return q.k();
    }

    @Override // eg.u1
    public ee.i o() {
        return ee.g.f11786h.a();
    }

    @Override // eg.u1
    public u1 p(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // eg.u1
    public he.h q() {
        return l.f14501a.h();
    }

    @Override // eg.u1
    public boolean r() {
        return false;
    }

    public String toString() {
        return this.f14457c;
    }
}
