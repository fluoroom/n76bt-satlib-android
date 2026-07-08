package be;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f3937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ClassLoader f3939c;

    public m3(ClassLoader classLoader) {
        rd.m.e(classLoader, "classLoader");
        this.f3937a = new WeakReference(classLoader);
        this.f3938b = System.identityHashCode(classLoader);
        this.f3939c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.f3939c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m3) && this.f3937a.get() == ((m3) obj).f3937a.get();
    }

    public int hashCode() {
        return this.f3938b;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f3937a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
