package df;

import df.m1;

/* JADX INFO: loaded from: classes3.dex */
class m0 implements qd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11011b;

    public m0(String str, String str2) {
        this.f11010a = str;
        this.f11011b = str2;
    }

    @Override // qd.l
    public Object l(Object obj) {
        return e1.E(this.f11010a, this.f11011b, (m1.a.C0147a) obj);
    }
}
