package me;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static final Class a(ClassLoader classLoader, String str) {
        rd.m.e(classLoader, "<this>");
        rd.m.e(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
