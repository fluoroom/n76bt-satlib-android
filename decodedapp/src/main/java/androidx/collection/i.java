package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f1377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f1378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1379c;

    public i() {
        this(0, 1, null);
    }

    private final int c(Object obj, int i10) {
        int i11 = this.f1379c;
        if (i11 == 0) {
            return -1;
        }
        int iA = r.a.a(this.f1377a, i11, i10);
        if (iA < 0 || m.a(obj, this.f1378b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f1377a[i12] == i10) {
            if (m.a(obj, this.f1378b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f1377a[i13] == i10; i13--) {
            if (m.a(obj, this.f1378b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    private final int e() {
        int i10 = this.f1379c;
        if (i10 == 0) {
            return -1;
        }
        int iA = r.a.a(this.f1377a, i10, 0);
        if (iA < 0 || this.f1378b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f1377a[i11] == 0) {
            if (this.f1378b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f1377a[i12] == 0; i12--) {
            if (this.f1378b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final int a(Object obj) {
        int i10 = this.f1379c * 2;
        Object[] objArr = this.f1378b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (m.a(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f1379c;
        int[] iArr = this.f1377a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            m.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f1377a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1378b, i10 * 2);
            m.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1378b = objArrCopyOf;
        }
        if (this.f1379c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f1379c > 0) {
            this.f1377a = r.a.f25263a;
            this.f1378b = r.a.f25265c;
            this.f1379c = 0;
        }
        if (this.f1379c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof i) {
                if (size() != ((i) obj).size()) {
                    return false;
                }
                i iVar = (i) obj;
                int i10 = this.f1379c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objF = f(i11);
                    Object objJ = j(i11);
                    Object obj2 = iVar.get(objF);
                    if (objJ == null) {
                        if (obj2 != null || !iVar.containsKey(objF)) {
                            return false;
                        }
                    } else if (!m.a(objJ, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f1379c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objF2 = f(i13);
                Object objJ2 = j(i13);
                Object obj3 = ((Map) obj).get(objF2);
                if (objJ2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!m.a(objJ2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object f(int i10) {
        if (i10 >= 0 && i10 < this.f1379c) {
            return this.f1378b[i10 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public void g(i iVar) {
        m.e(iVar, "map");
        int i10 = iVar.f1379c;
        b(this.f1379c + i10);
        if (this.f1379c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(iVar.f(i11), iVar.j(i11));
            }
        } else if (i10 > 0) {
            ed.j.h(iVar.f1377a, this.f1377a, 0, 0, i10);
            ed.j.j(iVar.f1378b, this.f1378b, 0, 0, i10 << 1);
            this.f1379c = i10;
        }
    }

    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f1378b[(iD << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f1378b[(iD << 1) + 1] : obj2;
    }

    public Object h(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f1379c)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        Object[] objArr = this.f1378b;
        int i12 = i10 << 1;
        Object obj = objArr[i12 + 1];
        if (i11 <= 1) {
            clear();
            return obj;
        }
        int i13 = i11 - 1;
        int[] iArr = this.f1377a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                ed.j.h(iArr, iArr, i10, i14, i11);
                Object[] objArr2 = this.f1378b;
                ed.j.j(objArr2, objArr2, i12, i14 << 1, i11 << 1);
            }
            Object[] objArr3 = this.f1378b;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i16);
            m.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f1377a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1378b, i16 << 1);
            m.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1378b = objArrCopyOf;
            if (i11 != this.f1379c) {
                throw new ConcurrentModificationException();
            }
            if (i10 > 0) {
                ed.j.h(iArr, this.f1377a, 0, 0, i10);
                ed.j.j(objArr, this.f1378b, 0, 0, i12);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                ed.j.h(iArr, this.f1377a, i10, i17, i11);
                ed.j.j(objArr, this.f1378b, i12, i17 << 1, i11 << 1);
            }
        }
        if (i11 != this.f1379c) {
            throw new ConcurrentModificationException();
        }
        this.f1379c = i13;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f1377a;
        Object[] objArr = this.f1378b;
        int i10 = this.f1379c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public Object i(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f1379c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f1378b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f1379c <= 0;
    }

    public Object j(int i10) {
        if (i10 >= 0 && i10 < this.f1379c) {
            return this.f1378b[(i10 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i10).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f1379c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(obj, iHashCode) : e();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f1378b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f1377a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            m.d(iArrCopyOf, "copyOf(this, newSize)");
            this.f1377a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f1378b, i13 << 1);
            m.d(objArrCopyOf, "copyOf(this, newSize)");
            this.f1378b = objArrCopyOf;
            if (i10 != this.f1379c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f1377a;
            int i14 = i12 + 1;
            ed.j.h(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f1378b;
            ed.j.j(objArr2, objArr2, i14 << 1, i12 << 1, this.f1379c << 1);
        }
        int i15 = this.f1379c;
        if (i10 == i15) {
            int[] iArr3 = this.f1377a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f1378b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f1379c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return i(iD, obj2);
        }
        return null;
    }

    public int size() {
        return this.f1379c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1379c * 28);
        sb2.append('{');
        int i10 = this.f1379c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objF = f(i11);
            if (objF != sb2) {
                sb2.append(objF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objJ = j(i11);
            if (objJ != sb2) {
                sb2.append(objJ);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        m.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public i(int i10) {
        this.f1377a = i10 == 0 ? r.a.f25263a : new int[i10];
        this.f1378b = i10 == 0 ? r.a.f25265c : new Object[i10 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !m.a(obj2, j(iD))) {
            return false;
        }
        h(iD);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !m.a(obj2, j(iD))) {
            return false;
        }
        i(iD, obj3);
        return true;
    }

    public /* synthetic */ i(int i10, int i11, rd.h hVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public i(i iVar) {
        this(0, 1, null);
        if (iVar != null) {
            g(iVar);
        }
    }
}
