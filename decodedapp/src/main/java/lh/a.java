package lh;

import eh.y;
import rd.h;
import rd.m;
import vh.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0275a f20660c = new C0275a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f20661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f20662b;

    /* JADX INFO: renamed from: lh.a$a, reason: collision with other inner class name */
    public static final class C0275a {
        public /* synthetic */ C0275a(h hVar) {
            this();
        }

        private C0275a() {
        }
    }

    public a(g gVar) {
        m.e(gVar, "source");
        this.f20661a = gVar;
        this.f20662b = 262144L;
    }

    public final y a() {
        y.a aVar = new y.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.f();
            }
            aVar.c(strB);
        }
    }

    public final String b() {
        String strF = this.f20661a.F(this.f20662b);
        this.f20662b -= (long) strF.length();
        return strF;
    }
}
