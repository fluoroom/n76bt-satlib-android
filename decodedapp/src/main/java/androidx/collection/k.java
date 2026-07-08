package androidx.collection;

import rd.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1384a = new Object();

    public static final Object c(j jVar, int i10) {
        Object obj;
        m.e(jVar, "<this>");
        int iA = r.a.a(jVar.f1381b, jVar.f1383d, i10);
        if (iA < 0 || (obj = jVar.f1382c[iA]) == f1384a) {
            return null;
        }
        return obj;
    }

    public static final Object d(j jVar, int i10, Object obj) {
        Object obj2;
        m.e(jVar, "<this>");
        int iA = r.a.a(jVar.f1381b, jVar.f1383d, i10);
        return (iA < 0 || (obj2 = jVar.f1382c[iA]) == f1384a) ? obj : obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(j jVar) {
        int i10 = jVar.f1383d;
        int[] iArr = jVar.f1381b;
        Object[] objArr = jVar.f1382c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1384a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        jVar.f1380a = false;
        jVar.f1383d = i11;
    }
}
