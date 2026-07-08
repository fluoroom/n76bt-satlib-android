package ce;

import ce.i;
import ed.q;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f4750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f4751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f4752c;

    public static final class a extends k implements g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f4753d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method method, Object obj) {
            super(method, q.k(), null);
            rd.m.e(method, "unboxMethod");
            this.f4753d = obj;
        }

        @Override // ce.h
        public Object i(Object[] objArr) {
            rd.m.e(objArr, "args");
            b(objArr);
            return a(this.f4753d, objArr);
        }
    }

    public static final class b extends k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method) {
            super(method, q.e(method.getDeclaringClass()), null);
            rd.m.e(method, "unboxMethod");
        }

        @Override // ce.h
        public Object i(Object[] objArr) {
            rd.m.e(objArr, "args");
            b(objArr);
            Object obj = objArr[0];
            i.d dVar = i.f4735e;
            return a(obj, objArr.length <= 1 ? new Object[0] : ed.j.p(objArr, 1, objArr.length));
        }
    }

    public /* synthetic */ k(Method method, List list, rd.h hVar) {
        this(method, list);
    }

    protected final Object a(Object obj, Object[] objArr) {
        rd.m.e(objArr, "args");
        return this.f4750a.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    public void b(Object[] objArr) {
        c(objArr);
    }

    public void c(Object[] objArr) {
        rd.m.e(objArr, "args");
        if (j.a(this) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + j.a(this) + " arguments, but " + objArr.length + " were provided.");
    }

    public boolean d() {
        return false;
    }

    @Override // ce.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Method h() {
        return null;
    }

    @Override // ce.h
    public final Type g() {
        return this.f4752c;
    }

    @Override // ce.h
    public final List j() {
        return this.f4751b;
    }

    @Override // ce.h
    public boolean k() {
        return d();
    }

    private k(Method method, List list) {
        this.f4750a = method;
        this.f4751b = list;
        Class<?> returnType = method.getReturnType();
        rd.m.d(returnType, "getReturnType(...)");
        this.f4752c = returnType;
    }
}
