package ib;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static int a() {
        int iA = kb.h.c(kb.f.a(), null).a("Common_HttpRetryCount");
        if (iA == 0) {
            return 2;
        }
        return iA;
    }

    public static int b(String str) {
        int iA;
        if (kb.f.a() == null || (iA = kb.h.c(kb.f.a(), str).a("Common_BusinessReportFrequency")) == 0) {
            return 100;
        }
        return iA;
    }
}
