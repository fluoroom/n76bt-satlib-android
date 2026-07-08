package ce;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f4729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dd.j f4731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dd.j f4732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f4733e;

    public d(Class cls, Map map, dd.j jVar, dd.j jVar2, List list) {
        this.f4729a = cls;
        this.f4730b = map;
        this.f4731c = jVar;
        this.f4732d = jVar2;
        this.f4733e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return f.o(this.f4729a, this.f4730b, this.f4731c, this.f4732d, this.f4733e, obj, method, objArr);
    }
}
