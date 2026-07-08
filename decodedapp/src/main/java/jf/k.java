package jf;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public static final boolean a(a aVar) {
        m.e(aVar, "version");
        return (aVar.a() == 1 && aVar.b() >= 4) || aVar.a() > 1;
    }

    public static final boolean b(a aVar) {
        m.e(aVar, "version");
        return a(aVar);
    }
}
