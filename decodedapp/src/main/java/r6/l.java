package r6;

import e6.e;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25546d;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final l f25547a = new l(a(n.values()), 0, a(p.values()), 0);

        /* JADX WARN: Multi-variable type inference failed */
        private static int a(Enum[] enumArr) {
            int iD = 0;
            for (e.a aVar : enumArr) {
                if (aVar.a()) {
                    iD |= aVar.d();
                }
            }
            return iD;
        }

        public static l b() {
            return f25547a;
        }
    }

    protected l(int i10, int i11, int i12, int i13) {
        this.f25543a = i10;
        this.f25545c = i11;
        this.f25544b = i12;
        this.f25546d = i13;
    }

    public static l a() {
        return a.b();
    }

    public boolean b(k kVar) {
        int iF = kVar.f();
        if (iF == 0) {
            return kVar.e(this.f25543a);
        }
        if (iF == 1) {
            return kVar.e(this.f25544b);
        }
        o6.r.a();
        return false;
    }

    public boolean c(k kVar) {
        int iF = kVar.f();
        if (iF == 0) {
            return kVar.e(this.f25545c);
        }
        if (iF == 1) {
            return kVar.e(this.f25546d);
        }
        o6.r.a();
        return false;
    }
}
