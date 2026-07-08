package i7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i f15899d = new i(1, 0, new Object[4]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f15902c;

    private i(int i10, int i11, Object[] objArr) {
        this.f15900a = i10;
        this.f15901b = i11;
        this.f15902c = objArr;
    }

    private final Object a(String str, int i10, Object obj) {
        if (obj == null) {
            return null;
        }
        int i11 = this.f15900a + 1;
        int i12 = ((i10 >> 1) + i11) << 1;
        Object obj2 = this.f15902c[i12];
        if (str.equals(obj2)) {
            return this.f15902c[i12 + 1];
        }
        if (obj2 != null) {
            int i13 = (i11 + (i11 >> 1)) << 1;
            int i14 = this.f15901b + i13;
            while (i13 < i14) {
                Object obj3 = this.f15902c[i13];
                if (obj3 == str || str.equals(obj3)) {
                    return this.f15902c[i13 + 1];
                }
                i13 += 2;
            }
        }
        return null;
    }

    public static i b(Map map) {
        if (map.isEmpty()) {
            return f15899d;
        }
        int iE = e(map.size());
        int i10 = iE - 1;
        int i11 = (iE >> 1) + iE;
        Object[] objArrCopyOf = new Object[i11 * 2];
        int i12 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                int iHashCode = str.hashCode() & i10;
                int i13 = iHashCode + iHashCode;
                if (objArrCopyOf[i13] != null) {
                    i13 = ((iHashCode >> 1) + iE) << 1;
                    if (objArrCopyOf[i13] != null) {
                        i13 = (i11 << 1) + i12;
                        i12 += 2;
                        if (i13 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i13] = str;
                objArrCopyOf[i13 + 1] = entry.getValue();
            }
        }
        return new i(i10, i12, objArrCopyOf);
    }

    private static final int e(int i10) {
        if (i10 <= 5) {
            return 8;
        }
        if (i10 <= 12) {
            return 16;
        }
        int i11 = 32;
        while (i11 < i10 + (i10 >> 2)) {
            i11 += i11;
        }
        return i11;
    }

    public Object c(String str) {
        int iHashCode = str.hashCode() & this.f15900a;
        int i10 = iHashCode << 1;
        Object obj = this.f15902c[i10];
        return (obj == str || str.equals(obj)) ? this.f15902c[i10 + 1] : a(str, iHashCode, obj);
    }

    public Object d(String str) {
        int length = this.f15902c.length;
        for (int i10 = 0; i10 < length; i10 += 2) {
            Object obj = this.f15902c[i10];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return this.f15902c[i10 + 1];
            }
        }
        return null;
    }

    public List f() {
        int length = this.f15902c.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i10 = 0; i10 < length; i10 += 2) {
            Object obj = this.f15902c[i10];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
