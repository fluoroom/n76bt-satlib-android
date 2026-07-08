package dk;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
final class d0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c0 f11135a = new d0();

    d0() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (e0.l(annotationArr, c0.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f11135a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return c0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof c0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + c0.class.getName() + "()";
    }
}
