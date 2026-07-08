package jf;

import ed.q;
import java.util.ArrayList;
import java.util.List;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0242a f18654f = new C0242a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f18655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f18659e;

    /* JADX INFO: renamed from: jf.a$a, reason: collision with other inner class name */
    public static final class C0242a {
        public /* synthetic */ C0242a(rd.h hVar) {
            this();
        }

        private C0242a() {
        }
    }

    public a(int... iArr) {
        List listK;
        m.e(iArr, "numbers");
        this.f18655a = iArr;
        Integer numI = ed.j.I(iArr, 0);
        this.f18656b = numI != null ? numI.intValue() : -1;
        Integer numI2 = ed.j.I(iArr, 1);
        this.f18657c = numI2 != null ? numI2.intValue() : -1;
        Integer numI3 = ed.j.I(iArr, 2);
        this.f18658d = numI3 != null ? numI3.intValue() : -1;
        if (iArr.length <= 3) {
            listK = q.k();
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            listK = q.H0(ed.j.c(iArr).subList(3, iArr.length));
        }
        this.f18659e = listK;
    }

    public final int a() {
        return this.f18656b;
    }

    public final int b() {
        return this.f18657c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f18656b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f18657c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f18658d >= i12;
    }

    public final boolean d(a aVar) {
        m.e(aVar, "version");
        return c(aVar.f18656b, aVar.f18657c, aVar.f18658d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f18656b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f18657c;
        if (i14 < i11) {
            return true;
        }
        return i14 <= i11 && this.f18658d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj == null || !m.a(getClass(), obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18656b == aVar.f18656b && this.f18657c == aVar.f18657c && this.f18658d == aVar.f18658d && m.a(this.f18659e, aVar.f18659e);
    }

    protected final boolean f(a aVar) {
        m.e(aVar, "ourVersion");
        int i10 = this.f18656b;
        return i10 == 0 ? aVar.f18656b == 0 && this.f18657c == aVar.f18657c : i10 == aVar.f18656b && this.f18657c <= aVar.f18657c;
    }

    public final int[] g() {
        return this.f18655a;
    }

    public int hashCode() {
        int i10 = this.f18656b;
        int i11 = i10 + (i10 * 31) + this.f18657c;
        int i12 = i11 + (i11 * 31) + this.f18658d;
        return i12 + (i12 * 31) + this.f18659e.hashCode();
    }

    public String toString() {
        int[] iArrG = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArrG) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : q.i0(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
