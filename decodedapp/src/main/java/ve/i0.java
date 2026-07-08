package ve;

import mf.b;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f30588a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mf.c f30589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mf.b f30590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final mf.b f30591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final mf.b f30592e;

    static {
        mf.c cVar = new mf.c("kotlin.jvm.JvmField");
        f30589b = cVar;
        b.a aVar = mf.b.f21989d;
        f30590c = aVar.c(cVar);
        f30591d = aVar.c(new mf.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f30592e = b.a.b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    private i0() {
    }

    public static final String b(String str) {
        rd.m.e(str, "propertyName");
        if (f(str)) {
            return str;
        }
        return "get" + mg.a.a(str);
    }

    public static final boolean c(String str) {
        rd.m.e(str, "name");
        return rg.q.J(str, "get", false, 2, null) || rg.q.J(str, "is", false, 2, null);
    }

    public static final boolean d(String str) {
        rd.m.e(str, "name");
        return rg.q.J(str, "set", false, 2, null);
    }

    public static final String e(String str) {
        String strA;
        rd.m.e(str, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(str)) {
            strA = str.substring(2);
            rd.m.d(strA, "substring(...)");
        } else {
            strA = mg.a.a(str);
        }
        sb2.append(strA);
        return sb2.toString();
    }

    public static final boolean f(String str) {
        rd.m.e(str, "name");
        if (!rg.q.J(str, "is", false, 2, null) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return rd.m.f(97, cCharAt) > 0 || rd.m.f(cCharAt, 122) > 0;
    }

    public final mf.b a() {
        return f30592e;
    }
}
