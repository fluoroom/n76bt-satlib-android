package x6;

import com.fasterxml.jackson.databind.JavaType;
import i7.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import x6.d;

/* JADX INFO: loaded from: classes.dex */
final class h extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j0 f31725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f f31727f;

    h(p6.b bVar, j0 j0Var, boolean z10) {
        super(bVar);
        this.f31725d = j0Var;
        this.f31726e = z10;
    }

    private List i(JavaType javaType, Class cls) {
        h.a aVar;
        ArrayList arrayList;
        int i10;
        List list;
        if (javaType.O()) {
            aVar = null;
            arrayList = null;
        } else {
            aVar = null;
            arrayList = null;
            for (h.a aVar2 : i7.h.A(javaType.r())) {
                if (t(aVar2.a())) {
                    if (aVar2.d() == 0) {
                        aVar = aVar2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(aVar2);
                    }
                }
            }
        }
        if (arrayList == null) {
            list = Collections.EMPTY_LIST;
            if (aVar == null) {
                return list;
            }
            i10 = 0;
        } else {
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList2.add(null);
            }
            i10 = size;
            list = arrayList2;
        }
        if (cls != null) {
            b0[] b0VarArr = null;
            for (h.a aVar3 : i7.h.A(cls)) {
                if (aVar3.d() == 0) {
                    if (aVar != null) {
                        this.f31727f = q(aVar, aVar3);
                        aVar = null;
                    }
                } else if (arrayList != null) {
                    if (b0VarArr == null) {
                        b0VarArr = new b0[i10];
                        for (int i12 = 0; i12 < i10; i12++) {
                            b0VarArr[i12] = new b0(((h.a) arrayList.get(i12)).a());
                        }
                    }
                    b0 b0Var = new b0(aVar3.a());
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i10) {
                            break;
                        }
                        if (b0Var.equals(b0VarArr[i13])) {
                            list.set(i13, s((h.a) arrayList.get(i13), aVar3));
                            break;
                        }
                        i13++;
                    }
                }
            }
        }
        if (aVar != null) {
            this.f31727f = q(aVar, null);
        }
        for (int i14 = 0; i14 < i10; i14++) {
            if (((f) list.get(i14)) == null) {
                list.set(i14, s((h.a) arrayList.get(i14), null));
            }
        }
        return list;
    }

    private List j(com.fasterxml.jackson.databind.type.c cVar, JavaType javaType, Class cls) {
        ArrayList arrayList = null;
        for (Method method : i7.h.z(javaType.r())) {
            if (k(method)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        j0 j0Var = this.f31725d;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        if (cls != null) {
            b0[] b0VarArr = null;
            for (Method method2 : cls.getDeclaredMethods()) {
                if (k(method2)) {
                    if (b0VarArr == null) {
                        b0VarArr = new b0[size];
                        for (int i11 = 0; i11 < size; i11++) {
                            b0VarArr[i11] = new b0((Method) arrayList.get(i11));
                        }
                    }
                    b0 b0Var = new b0(method2);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            break;
                        }
                        if (b0Var.equals(b0VarArr[i12])) {
                            arrayList2.set(i12, r((Method) arrayList.get(i12), j0Var, method2));
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        for (int i13 = 0; i13 < size; i13++) {
            if (((l) arrayList2.get(i13)) == null) {
                Method method3 = (Method) arrayList.get(i13);
                arrayList2.set(i13, r(method3, c0.e(method3, javaType, cVar, j0Var), null));
            }
        }
        return arrayList2;
    }

    private static boolean k(Method method) {
        return Modifier.isStatic(method.getModifiers()) && !method.isSynthetic();
    }

    private r m(h.a aVar, h.a aVar2) {
        if (!this.f31726e) {
            return w.a();
        }
        q qVarE = e(aVar.b());
        if (aVar2 != null) {
            qVarE = d(qVarE, aVar2.b());
        }
        return qVarE.b();
    }

    private final r n(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        q qVarE = e(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            qVarE = d(qVarE, annotatedElement2.getDeclaredAnnotations());
        }
        return qVarE.b();
    }

    private r[] o(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.f31726e) {
            return w.f31819b;
        }
        int length = annotationArr.length;
        r[] rVarArr = new r[length];
        for (int i10 = 0; i10 < length; i10++) {
            q qVarD = d(q.e(), annotationArr[i10]);
            if (annotationArr2 != null) {
                qVarD = d(qVarD, annotationArr2[i10]);
            }
            rVarArr[i10] = qVarD.b();
        }
        return rVarArr;
    }

    public static d.a p(p6.b bVar, com.fasterxml.jackson.databind.type.c cVar, j0 j0Var, JavaType javaType, Class cls, boolean z10) {
        return new h(bVar, j0Var, z10 | (cls != null)).l(cVar, javaType, cls);
    }

    private static boolean t(Constructor constructor) {
        return !constructor.isSynthetic();
    }

    d.a l(com.fasterxml.jackson.databind.type.c cVar, JavaType javaType, Class cls) {
        List listI = i(javaType, cls);
        List listJ = j(cVar, javaType, cls);
        if (this.f31726e) {
            f fVar = this.f31727f;
            if (fVar != null && this.f31821a.B0(fVar)) {
                this.f31727f = null;
            }
            int size = listI.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                if (this.f31821a.B0((k) listI.get(size))) {
                    listI.remove(size);
                }
            }
            int size2 = listJ.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                if (this.f31821a.B0((k) listJ.get(size2))) {
                    listJ.remove(size2);
                }
            }
        }
        return new d.a(this.f31727f, listI, listJ);
    }

    protected f q(h.a aVar, h.a aVar2) {
        return new f(this.f31725d, aVar.a(), m(aVar, aVar2), w.f31819b);
    }

    protected l r(Method method, j0 j0Var, Method method2) {
        int iA = g.a(method);
        if (this.f31821a == null) {
            return new l(j0Var, method, w.a(), w.b(iA));
        }
        if (iA == 0) {
            return new l(j0Var, method, n(method, method2), w.f31819b);
        }
        return new l(j0Var, method, n(method, method2), o(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected x6.f s(i7.h.a r9, i7.h.a r10) {
        /*
            r8 = this;
            int r0 = r9.d()
            p6.b r1 = r8.f31821a
            if (r1 != 0) goto L1c
            x6.f r10 = new x6.f
            x6.j0 r1 = r8.f31725d
            java.lang.reflect.Constructor r9 = r9.a()
            x6.r r2 = x6.w.a()
            x6.r[] r0 = x6.w.b(r0)
            r10.<init>(r1, r9, r2, r0)
            return r10
        L1c:
            if (r0 != 0) goto L30
            x6.f r0 = new x6.f
            x6.j0 r1 = r8.f31725d
            java.lang.reflect.Constructor r2 = r9.a()
            x6.r r9 = r8.m(r9, r10)
            x6.r[] r10 = x6.w.f31819b
            r0.<init>(r1, r2, r9, r10)
            return r0
        L30:
            java.lang.annotation.Annotation[][] r1 = r9.e()
            int r2 = r1.length
            r3 = 0
            if (r0 == r2) goto L9b
            java.lang.Class r2 = r9.c()
            boolean r4 = i7.h.M(r2)
            r5 = 1
            r6 = 0
            r7 = 2
            if (r4 == 0) goto L57
            int r4 = r1.length
            int r4 = r4 + r7
            if (r0 != r4) goto L57
            int r2 = r1.length
            int r2 = r2 + r7
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r6, r2, r7, r4)
            x6.r[] r3 = r8.o(r2, r3)
        L55:
            r1 = r2
            goto L72
        L57:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L72
            int r2 = r1.length
            int r2 = r2 + r5
            if (r0 != r2) goto L72
            int r2 = r1.length
            int r2 = r2 + r5
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r6, r2, r5, r4)
            java.lang.annotation.Annotation[] r1 = x6.w.f31820c
            r2[r6] = r1
            x6.r[] r3 = r8.o(r2, r3)
            goto L55
        L72:
            if (r3 == 0) goto L75
            goto La6
        L75:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.Class r9 = r9.c()
            java.lang.String r9 = r9.getName()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r6] = r9
            r2[r5] = r0
            r2[r7] = r1
            java.lang.String r9 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r9 = java.lang.String.format(r9, r2)
            r10.<init>(r9)
            throw r10
        L9b:
            if (r10 != 0) goto L9e
            goto La2
        L9e:
            java.lang.annotation.Annotation[][] r3 = r10.e()
        La2:
            x6.r[] r3 = r8.o(r1, r3)
        La6:
            x6.f r0 = new x6.f
            x6.j0 r1 = r8.f31725d
            java.lang.reflect.Constructor r2 = r9.a()
            x6.r r9 = r8.m(r9, r10)
            r0.<init>(r1, r2, r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.h.s(i7.h$a, i7.h$a):x6.f");
    }
}
