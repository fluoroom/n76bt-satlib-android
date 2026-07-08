package x6;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
abstract class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final r[] f31819b = new r[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Annotation[] f31820c = new Annotation[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p6.b f31821a;

    protected w(p6.b bVar) {
        this.f31821a = bVar;
    }

    static r a() {
        return new r();
    }

    static r[] b(int i10) {
        if (i10 == 0) {
            return f31819b;
        }
        r[] rVarArr = new r[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            rVarArr[i11] = a();
        }
        return rVarArr;
    }

    protected static final boolean c(Annotation annotation) {
        return (annotation instanceof Target) || (annotation instanceof Retention);
    }

    protected final q d(q qVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            qVar = qVar.a(annotation);
            if (this.f31821a.D0(annotation)) {
                qVar = h(qVar, annotation);
            }
        }
        return qVar;
    }

    protected final q e(Annotation[] annotationArr) {
        q qVarE = q.e();
        for (Annotation annotation : annotationArr) {
            qVarE = qVarE.a(annotation);
            if (this.f31821a.D0(annotation)) {
                qVarE = h(qVarE, annotation);
            }
        }
        return qVarE;
    }

    protected final q f(q qVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!qVar.f(annotation)) {
                qVar = qVar.a(annotation);
                if (this.f31821a.D0(annotation)) {
                    qVar = g(qVar, annotation);
                }
            }
        }
        return qVar;
    }

    protected final q g(q qVar, Annotation annotation) {
        for (Annotation annotation2 : i7.h.p(annotation.annotationType())) {
            if (!c(annotation2) && !qVar.f(annotation2)) {
                qVar = qVar.a(annotation2);
                if (this.f31821a.D0(annotation2)) {
                    qVar = h(qVar, annotation2);
                }
            }
        }
        return qVar;
    }

    protected final q h(q qVar, Annotation annotation) {
        for (Annotation annotation2 : i7.h.p(annotation.annotationType())) {
            if (!c(annotation2)) {
                if (!this.f31821a.D0(annotation2)) {
                    qVar = qVar.a(annotation2);
                } else if (!qVar.f(annotation2)) {
                    qVar = h(qVar.a(annotation2), annotation2);
                }
            }
        }
        return qVar;
    }
}
