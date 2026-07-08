package dk;

import dk.e0;
import eh.e;
import eh.h0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
abstract class p extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f11169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f11170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f11171c;

    static final class a extends p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f11172d;

        a(y yVar, e.a aVar, i iVar, e eVar) {
            super(yVar, aVar, iVar);
            this.f11172d = eVar;
        }

        @Override // dk.p
        protected Object c(d dVar, Object[] objArr) {
            return this.f11172d.b(dVar);
        }
    }

    static final class b extends p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f11173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f11174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f11175f;

        b(y yVar, e.a aVar, i iVar, e eVar, boolean z10, boolean z11) {
            super(yVar, aVar, iVar);
            this.f11173d = eVar;
            this.f11174e = z10;
            this.f11175f = z11;
        }

        @Override // dk.p
        protected Object c(d dVar, Object[] objArr) {
            d dVar2 = (d) this.f11173d.b(dVar);
            hd.e eVar = (hd.e) objArr[objArr.length - 1];
            try {
                return this.f11175f ? r.d(dVar2, eVar) : this.f11174e ? r.b(dVar2, eVar) : r.a(dVar2, eVar);
            } catch (LinkageError e10) {
                throw e10;
            } catch (ThreadDeath e11) {
                throw e11;
            } catch (VirtualMachineError e12) {
                throw e12;
            } catch (Throwable th2) {
                return r.e(th2, eVar);
            }
        }
    }

    static final class c extends p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f11176d;

        c(y yVar, e.a aVar, i iVar, e eVar) {
            super(yVar, aVar, iVar);
            this.f11176d = eVar;
        }

        @Override // dk.p
        protected Object c(d dVar, Object[] objArr) {
            d dVar2 = (d) this.f11176d.b(dVar);
            hd.e eVar = (hd.e) objArr[objArr.length - 1];
            try {
                return r.c(dVar2, eVar);
            } catch (Exception e10) {
                return r.e(e10, eVar);
            }
        }
    }

    p(y yVar, e.a aVar, i iVar) {
        this.f11169a = yVar;
        this.f11170b = aVar;
        this.f11171c = iVar;
    }

    private static e d(a0 a0Var, Method method, Type type, Annotation[] annotationArr) {
        try {
            return a0Var.a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw e0.o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    private static i e(a0 a0Var, Method method, Type type) {
        try {
            return a0Var.h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw e0.o(method, e10, "Unable to create converter for %s", type);
        }
    }

    static p f(a0 a0Var, Method method, y yVar) {
        Type genericReturnType;
        boolean z10;
        boolean z11;
        boolean zM;
        boolean z12 = yVar.f11286l;
        Annotation[] annotations = method.getAnnotations();
        if (z12) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeF = e0.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (e0.h(typeF) == z.class && (typeF instanceof ParameterizedType)) {
                typeF = e0.g(0, (ParameterizedType) typeF);
                zM = false;
                z10 = true;
            } else {
                if (e0.h(typeF) == d.class) {
                    throw e0.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", e0.g(0, (ParameterizedType) typeF));
                }
                zM = e0.m(typeF);
                z10 = false;
            }
            genericReturnType = new e0.b(null, d.class, typeF);
            annotations = d0.a(annotations);
            z11 = zM;
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
            z11 = false;
        }
        e eVarD = d(a0Var, method, genericReturnType, annotations);
        Type typeA = eVarD.a();
        if (typeA == h0.class) {
            throw e0.n(method, "'" + e0.h(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeA == z.class) {
            throw e0.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (yVar.f11278d.equals("HEAD") && !Void.class.equals(typeA) && !e0.m(typeA)) {
            throw e0.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        i iVarE = e(a0Var, method, typeA);
        e.a aVar = a0Var.f11112b;
        return !z12 ? new a(yVar, aVar, iVarE, eVarD) : z10 ? new c(yVar, aVar, iVarE, eVarD) : new b(yVar, aVar, iVarE, eVarD, false, z11);
    }

    @Override // dk.b0
    final Object a(Object obj, Object[] objArr) {
        return c(new s(this.f11169a, obj, objArr, this.f11170b, this.f11171c), objArr);
    }

    protected abstract Object c(d dVar, Object[] objArr);
}
