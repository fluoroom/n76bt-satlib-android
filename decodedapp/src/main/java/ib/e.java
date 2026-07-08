package ib;

import kb.k;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static e f16004a;

    protected e() {
    }

    public static synchronized e a() {
        try {
            if (f16004a == null) {
                f16004a = new e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f16004a;
    }

    public void b(String str, String str2, String str3, String str4, String str5, String str6) {
        h.b().c(k.c(str, str3, str4, str5, str2, str6), str2, true);
    }

    public void c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        h.b().c(k.e(str, str4, str5, str3, str2, str6, str7, "", "", str8, str9, str10), str2, false);
    }
}
