package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.v;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final i7.b f31682i = q.d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Class f31683j = Object.class;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Class f31684k = Enum.class;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Class f31685l = List.class;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Class f31686m = Map.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r6.q f31687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p6.b f31688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v.a f31689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.fasterxml.jackson.databind.type.b f31690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JavaType f31691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class f31692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f31693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f31694h;

    e(r6.q qVar, JavaType javaType, v.a aVar) {
        this.f31687a = qVar;
        this.f31691e = javaType;
        Class clsR = javaType.r();
        this.f31692f = clsR;
        this.f31689c = aVar;
        this.f31690d = javaType.j();
        p6.b bVarG = qVar.K() ? qVar.g() : null;
        this.f31688b = bVarG;
        this.f31693g = aVar != null ? aVar.a(clsR) : null;
        this.f31694h = (bVarG == null || (i7.h.N(clsR) && javaType.L())) ? false : true;
    }

    private q a(q qVar, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!qVar.f(annotation)) {
                    qVar = qVar.a(annotation);
                    if (this.f31688b.D0(annotation)) {
                        qVar = c(qVar, annotation);
                    }
                }
            }
        }
        return qVar;
    }

    private q b(q qVar, Class cls, Class cls2) {
        if (cls2 != null) {
            qVar = a(qVar, i7.h.p(cls2));
            Iterator it = i7.h.x(cls2, cls, false).iterator();
            while (it.hasNext()) {
                qVar = a(qVar, i7.h.p((Class) it.next()));
            }
        }
        return qVar;
    }

    private q c(q qVar, Annotation annotation) {
        for (Annotation annotation2 : i7.h.p(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !qVar.f(annotation2)) {
                qVar = qVar.a(annotation2);
                if (this.f31688b.D0(annotation2)) {
                    qVar = c(qVar, annotation2);
                }
            }
        }
        return qVar;
    }

    private static void d(JavaType javaType, List list, boolean z10) {
        Class clsR = javaType.r();
        if (z10) {
            if (f(list, clsR)) {
                return;
            }
            list.add(javaType);
            if (clsR == f31685l || clsR == f31686m) {
                return;
            }
        }
        Iterator it = javaType.p().iterator();
        while (it.hasNext()) {
            d((JavaType) it.next(), list, true);
        }
    }

    private static void e(JavaType javaType, List list, boolean z10) {
        Class clsR = javaType.r();
        if (clsR == f31683j || clsR == f31684k) {
            return;
        }
        if (z10) {
            if (f(list, clsR)) {
                return;
            } else {
                list.add(javaType);
            }
        }
        Iterator it = javaType.p().iterator();
        while (it.hasNext()) {
            d((JavaType) it.next(), list, true);
        }
        JavaType javaTypeT = javaType.t();
        if (javaTypeT != null) {
            e(javaTypeT, list, true);
        }
    }

    private static boolean f(List list, Class cls) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((JavaType) list.get(i10)).r() == cls) {
                return true;
            }
        }
        return false;
    }

    static d g(r6.q qVar, Class cls) {
        return new d(cls);
    }

    static d h(Class cls) {
        return new d(cls);
    }

    public static d i(r6.q qVar, JavaType javaType, v.a aVar) {
        return (javaType.G() && o(qVar, javaType.r())) ? g(qVar, javaType.r()) : new e(qVar, javaType, aVar).k();
    }

    private i7.b j(List list) {
        if (this.f31688b == null) {
            return f31682i;
        }
        v.a aVar = this.f31689c;
        boolean z10 = aVar != null && (!(aVar instanceof i0) || ((i0) aVar).c());
        if (!z10 && !this.f31694h) {
            return f31682i;
        }
        q qVarE = q.e();
        Class cls = this.f31693g;
        if (cls != null) {
            qVarE = b(qVarE, this.f31692f, cls);
        }
        if (this.f31694h) {
            qVarE = a(qVarE, i7.h.p(this.f31692f));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JavaType javaType = (JavaType) it.next();
            if (z10) {
                Class clsR = javaType.r();
                qVarE = b(qVarE, clsR, this.f31689c.a(clsR));
            }
            if (this.f31694h) {
                qVarE = a(qVarE, i7.h.p(javaType.r()));
            }
        }
        if (z10) {
            qVarE = b(qVarE, Object.class, this.f31689c.a(Object.class));
        }
        return qVarE.c();
    }

    public static d m(r6.q qVar, Class cls) {
        return n(qVar, cls, qVar);
    }

    public static d n(r6.q qVar, Class cls, v.a aVar) {
        return (cls.isArray() && o(qVar, cls)) ? g(qVar, cls) : new e(qVar, cls, aVar).l();
    }

    private static boolean o(r6.q qVar, Class cls) {
        return qVar == null || qVar.a(cls) == null;
    }

    d k() {
        ArrayList arrayList = new ArrayList(8);
        if (!this.f31691e.C(Object.class)) {
            if (this.f31691e.R()) {
                d(this.f31691e, arrayList, false);
            } else {
                e(this.f31691e, arrayList, false);
            }
        }
        return new d(this.f31691e, this.f31692f, arrayList, this.f31693g, j(arrayList), this.f31690d, this.f31688b, this.f31689c, this.f31687a.D(), this.f31694h);
    }

    d l() {
        List list = Collections.EMPTY_LIST;
        return new d(null, this.f31692f, list, this.f31693g, j(list), this.f31690d, this.f31688b, this.f31689c, this.f31687a.D(), this.f31694h);
    }

    e(r6.q qVar, Class cls, v.a aVar) {
        this.f31687a = qVar;
        this.f31691e = null;
        this.f31692f = cls;
        this.f31689c = aVar;
        this.f31690d = com.fasterxml.jackson.databind.type.b.i();
        if (qVar == null) {
            this.f31688b = null;
            this.f31693g = null;
        } else {
            this.f31688b = qVar.K() ? qVar.g() : null;
            this.f31693g = aVar != null ? aVar.a(cls) : null;
        }
        this.f31694h = this.f31688b != null;
    }
}
