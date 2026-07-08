package dk;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f11177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f11179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f11180d;

    q(Class cls, Object obj, Method method, List list) {
        this.f11177a = cls;
        this.f11178b = obj;
        this.f11179c = method;
        this.f11180d = DesugarCollections.unmodifiableList(list);
    }

    public Method a() {
        return this.f11179c;
    }

    public Class b() {
        return this.f11177a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f11177a.getName(), this.f11179c.getName(), this.f11180d);
    }
}
