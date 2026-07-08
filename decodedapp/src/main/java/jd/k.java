package jd;

import rd.c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends j implements rd.j {

    /* JADX INFO: renamed from: b */
    private final int f18648b;

    public k(int i10, hd.e eVar) {
        super(eVar);
        this.f18648b = i10;
    }

    @Override // rd.j
    public int c() {
        return this.f18648b;
    }

    @Override // jd.a
    public String toString() {
        if (i() != null) {
            return super.toString();
        }
        String strG = c0.g(this);
        rd.m.d(strG, "renderLambdaToString(...)");
        return strG;
    }
}
