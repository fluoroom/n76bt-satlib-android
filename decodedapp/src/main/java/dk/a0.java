package dk;

import dk.b;
import dk.e;
import dk.i;
import eh.e;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f11111a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final e.a f11112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final eh.z f11113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final List f11114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f11115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List f11116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f11117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Executor f11118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f11119i;

    class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f11120a = new Object[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f11121b;

        a(Class cls) {
            this.f11121b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f11120a;
            }
            w wVar = v.f11258b;
            return wVar.c(method) ? wVar.b(method, this.f11121b, obj, objArr) : a0.this.c(this.f11121b, method).a(obj, objArr);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e.a f11123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private eh.z f11124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f11125c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f11126d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Executor f11127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f11128f;

        public b a(eh.z zVar) {
            Objects.requireNonNull(zVar, "baseUrl == null");
            if ("".equals(zVar.l().get(r0.size() - 1))) {
                this.f11124b = zVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + zVar);
        }

        public b b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return a(eh.z.g(str));
        }

        public a0 c() {
            if (this.f11124b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            e.a d0Var = this.f11123a;
            if (d0Var == null) {
                d0Var = new eh.d0();
            }
            e.a aVar = d0Var;
            Executor executor = this.f11127e;
            if (executor == null) {
                executor = v.f11257a;
            }
            Executor executor2 = executor;
            c cVar = v.f11259c;
            ArrayList arrayList = new ArrayList(this.f11126d);
            List listA = cVar.a(executor2);
            arrayList.addAll(listA);
            List listB = cVar.b();
            int size = listB.size();
            ArrayList arrayList2 = new ArrayList(this.f11125c.size() + 1 + size);
            arrayList2.add(new dk.b());
            arrayList2.addAll(this.f11125c);
            arrayList2.addAll(listB);
            return new a0(aVar, this.f11124b, DesugarCollections.unmodifiableList(arrayList2), size, DesugarCollections.unmodifiableList(arrayList), listA.size(), executor2, this.f11128f);
        }

        public b d(e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f11123a = aVar;
            return this;
        }

        public b e(eh.d0 d0Var) {
            Objects.requireNonNull(d0Var, "client == null");
            return d(d0Var);
        }
    }

    a0(e.a aVar, eh.z zVar, List list, int i10, List list2, int i11, Executor executor, boolean z10) {
        this.f11112b = aVar;
        this.f11113c = zVar;
        this.f11114d = list;
        this.f11115e = i10;
        this.f11116f = list2;
        this.f11117g = i11;
        this.f11118h = executor;
        this.f11119i = z10;
    }

    private void j(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f11119i) {
            w wVar = v.f11258b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!wVar.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    c(cls, method);
                }
            }
        }
    }

    public e a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public Object b(Class cls) {
        j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    b0 c(Class cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f11111a.get(method);
            if (objPutIfAbsent instanceof b0) {
                return (b0) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f11111a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                b0 b0VarB = b0.b(this, cls, method);
                                this.f11111a.put(method, b0VarB);
                                return b0VarB;
                            } catch (Throwable th2) {
                                this.f11111a.remove(method);
                                throw th2;
                            }
                        }
                    } finally {
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f11111a.get(method);
                    if (obj2 != null) {
                        return (b0) obj2;
                    }
                } finally {
                }
            }
        }
    }

    public e d(e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f11116f.indexOf(aVar) + 1;
        int size = this.f11116f.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            e eVarA = ((e.a) this.f11116f.get(i10)).a(type, annotationArr, this);
            if (eVarA != null) {
                return eVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((e.a) this.f11116f.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f11116f.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((e.a) this.f11116f.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public i e(i.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f11114d.indexOf(aVar) + 1;
        int size = this.f11114d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            i iVarC = ((i.a) this.f11114d.get(i10)).c(type, annotationArr, annotationArr2, this);
            if (iVarC != null) {
                return iVarC;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((i.a) this.f11114d.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f11114d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((i.a) this.f11114d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public i f(i.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f11114d.indexOf(aVar) + 1;
        int size = this.f11114d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            i iVarD = ((i.a) this.f11114d.get(i10)).d(type, annotationArr, this);
            if (iVarD != null) {
                return iVarD;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(((i.a) this.f11114d.get(i11)).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f11114d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((i.a) this.f11114d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public i g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public i h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public i i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f11114d.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVarE = ((i.a) this.f11114d.get(i10)).e(type, annotationArr, this);
            if (iVarE != null) {
                return iVarE;
            }
        }
        return b.d.f11132a;
    }
}
