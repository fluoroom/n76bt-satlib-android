package androidx.collection;

import java.util.ConcurrentModificationException;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(b bVar, int i10) {
        m.e(bVar, "<this>");
        bVar.i(new int[i10]);
        bVar.h(new Object[i10]);
    }

    public static final int b(b bVar, int i10) {
        m.e(bVar, "<this>");
        try {
            return r.a.a(bVar.d(), bVar.f(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(b bVar, Object obj, int i10) {
        m.e(bVar, "<this>");
        int iF = bVar.f();
        if (iF == 0) {
            return -1;
        }
        int iB = b(bVar, i10);
        if (iB < 0 || m.a(obj, bVar.c()[iB])) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < iF && bVar.d()[i11] == i10) {
            if (m.a(obj, bVar.c()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && bVar.d()[i12] == i10; i12--) {
            if (m.a(obj, bVar.c()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final int d(b bVar) {
        m.e(bVar, "<this>");
        return c(bVar, null, 0);
    }
}
