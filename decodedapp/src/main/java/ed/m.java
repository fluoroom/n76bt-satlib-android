package ed;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends l {

    public static final class a extends d implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f11772b;

        a(int[] iArr) {
            this.f11772b = iArr;
        }

        @Override // ed.b
        public int c() {
            return this.f11772b.length;
        }

        @Override // ed.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return e(((Number) obj).intValue());
            }
            return false;
        }

        public boolean e(int i10) {
            return o.y(this.f11772b, i10);
        }

        @Override // ed.d, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            return Integer.valueOf(this.f11772b[i10]);
        }

        public int g(int i10) {
            return o.K(this.f11772b, i10);
        }

        public int h(int i10) {
            return o.U(this.f11772b, i10);
        }

        @Override // ed.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return g(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // ed.b, java.util.Collection
        public boolean isEmpty() {
            return this.f11772b.length == 0;
        }

        @Override // ed.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return h(((Number) obj).intValue());
            }
            return -1;
        }
    }

    public static List c(int[] iArr) {
        rd.m.e(iArr, "<this>");
        return new a(iArr);
    }

    public static List d(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        List listA = p.a(objArr);
        rd.m.d(listA, "asList(...)");
        return listA;
    }

    public static final int e(Object[] objArr, Object obj, int i10, int i11) {
        rd.m.e(objArr, "<this>");
        return Arrays.binarySearch(objArr, i10, i11, obj);
    }

    public static /* synthetic */ int f(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        return e(objArr, obj, i10, i11);
    }

    public static byte[] g(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        rd.m.e(bArr, "<this>");
        rd.m.e(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static int[] h(int[] iArr, int[] iArr2, int i10, int i11, int i12) {
        rd.m.e(iArr, "<this>");
        rd.m.e(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
        return iArr2;
    }

    public static long[] i(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        rd.m.e(jArr, "<this>");
        rd.m.e(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
        return jArr2;
    }

    public static Object[] j(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        rd.m.e(objArr, "<this>");
        rd.m.e(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
        return objArr2;
    }

    public static /* synthetic */ byte[] k(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return g(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] l(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return h(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] m(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return j(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] n(byte[] bArr, int i10, int i11) {
        rd.m.e(bArr, "<this>");
        k.b(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        rd.m.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static float[] o(float[] fArr, int i10, int i11) {
        rd.m.e(fArr, "<this>");
        k.b(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        rd.m.d(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static Object[] p(Object[] objArr, int i10, int i11) {
        rd.m.e(objArr, "<this>");
        k.b(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        rd.m.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void q(byte[] bArr, byte b10, int i10, int i11) {
        rd.m.e(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    public static void r(Object[] objArr, Object obj, int i10, int i11) {
        rd.m.e(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static /* synthetic */ void s(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        r(objArr, obj, i10, i11);
    }

    public static void t(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void u(Object[] objArr, Comparator comparator) {
        rd.m.e(objArr, "<this>");
        rd.m.e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
