package mf;

import rd.m;
import rg.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f22007a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o f22008b = new o("[^\\p{L}\\p{Digit}]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22009c = "$context_receiver";

    private g() {
    }

    public static final f a(int i10) {
        f fVarH = f.h(f22009c + '_' + i10);
        m.d(fVarH, "identifier(...)");
        return fVarH;
    }

    public static final String b(String str) {
        m.e(str, "name");
        return f22008b.d(str, "_");
    }
}
