package ed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends m {

    public static final class a implements Iterable, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f11774a;

        public a(Object[] objArr) {
            this.f11774a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return rd.c.a(this.f11774a);
        }
    }

    public static final class b implements qg.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f11775a;

        public b(Object[] objArr) {
            this.f11775a = objArr;
        }

        @Override // qg.h
        public Iterator iterator() {
            return rd.c.a(this.f11775a);
        }
    }

    public static List A(Object[] objArr, int i10) {
        rd.m.e(objArr, "<this>");
        if (i10 >= 0) {
            return c0(objArr, xd.d.b(objArr.length - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List A0(Object[] objArr, Object[] objArr2) {
        rd.m.e(objArr, "<this>");
        rd.m.e(objArr2, "other");
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(dd.w.a(objArr[i10], objArr2[i10]));
        }
        return arrayList;
    }

    public static List B(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        return (List) C(objArr, new ArrayList());
    }

    public static final Collection C(Object[] objArr, Collection collection) {
        rd.m.e(objArr, "<this>");
        rd.m.e(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static Object D(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object E(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static xd.c F(int[] iArr) {
        rd.m.e(iArr, "<this>");
        return new xd.c(0, G(iArr));
    }

    public static final int G(int[] iArr) {
        rd.m.e(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int H(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Integer I(int[] iArr, int i10) {
        rd.m.e(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    public static Object J(Object[] objArr, int i10) {
        rd.m.e(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static int K(int[] iArr, int i10) {
        rd.m.e(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static int L(Object[] objArr, Object obj) {
        rd.m.e(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (rd.m.a(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable M(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar) throws IOException {
        rd.m.e(bArr, "<this>");
        rd.m.e(appendable, "buffer");
        rd.m.e(charSequence, "separator");
        rd.m.e(charSequence2, "prefix");
        rd.m.e(charSequence3, "postfix");
        rd.m.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.l(Byte.valueOf(b10)));
            } else {
                appendable.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final Appendable N(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar) throws IOException {
        rd.m.e(objArr, "<this>");
        rd.m.e(appendable, "buffer");
        rd.m.e(charSequence, "separator");
        rd.m.e(charSequence2, "prefix");
        rd.m.e(charSequence3, "postfix");
        rd.m.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            rg.q.a(appendable, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String P(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar) {
        rd.m.e(bArr, "<this>");
        rd.m.e(charSequence, "separator");
        rd.m.e(charSequence2, "prefix");
        rd.m.e(charSequence3, "postfix");
        rd.m.e(charSequence4, "truncated");
        return ((StringBuilder) M(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static final String Q(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar) {
        rd.m.e(objArr, "<this>");
        rd.m.e(charSequence, "separator");
        rd.m.e(charSequence2, "prefix");
        rd.m.e(charSequence3, "postfix");
        rd.m.e(charSequence4, "truncated");
        return ((StringBuilder) N(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String R(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        qd.l lVar2 = lVar;
        return P(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static /* synthetic */ String S(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, qd.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        qd.l lVar2 = lVar;
        return Q(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static Object T(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[H(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int U(int[] iArr, int i10) {
        rd.m.e(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    public static Object[] V(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        for (Object obj : objArr) {
            if (obj == null) {
                throw new IllegalArgumentException("null element found in " + objArr + '.');
            }
        }
        return objArr;
    }

    public static char W(char[] cArr) {
        rd.m.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object X(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object Y(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static byte[] Z(byte[] bArr, xd.c cVar) {
        rd.m.e(bArr, "<this>");
        rd.m.e(cVar, "indices");
        return cVar.isEmpty() ? new byte[0] : m.n(bArr, cVar.h().intValue(), cVar.g().intValue() + 1);
    }

    public static final Object[] a0(Object[] objArr, Comparator comparator) {
        rd.m.e(objArr, "<this>");
        rd.m.e(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        rd.m.d(objArrCopyOf, "copyOf(...)");
        m.u(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    public static List b0(Object[] objArr, Comparator comparator) {
        rd.m.e(objArr, "<this>");
        rd.m.e(comparator, "comparator");
        return m.d(a0(objArr, comparator));
    }

    public static final List c0(Object[] objArr, int i10) {
        rd.m.e(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return s.k();
        }
        int length = objArr.length;
        if (i10 >= length) {
            return k0(objArr);
        }
        if (i10 == 1) {
            return r.e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = length - i10; i11 < length; i11++) {
            arrayList.add(objArr[i11]);
        }
        return arrayList;
    }

    public static final Collection d0(Object[] objArr, Collection collection) {
        rd.m.e(objArr, "<this>");
        rd.m.e(collection, "destination");
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    public static List e0(byte[] bArr) {
        rd.m.e(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? n0(bArr) : r.e(Byte.valueOf(bArr[0])) : s.k();
    }

    public static List f0(char[] cArr) {
        rd.m.e(cArr, "<this>");
        int length = cArr.length;
        return length != 0 ? length != 1 ? o0(cArr) : r.e(Character.valueOf(cArr[0])) : s.k();
    }

    public static List g0(double[] dArr) {
        rd.m.e(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? p0(dArr) : r.e(Double.valueOf(dArr[0])) : s.k();
    }

    public static List h0(float[] fArr) {
        rd.m.e(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? q0(fArr) : r.e(Float.valueOf(fArr[0])) : s.k();
    }

    public static List i0(int[] iArr) {
        rd.m.e(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? r0(iArr) : r.e(Integer.valueOf(iArr[0])) : s.k();
    }

    public static List j0(long[] jArr) {
        rd.m.e(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? s0(jArr) : r.e(Long.valueOf(jArr[0])) : s.k();
    }

    public static List k0(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? t0(objArr) : r.e(objArr[0]) : s.k();
    }

    public static List l0(short[] sArr) {
        rd.m.e(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? u0(sArr) : r.e(Short.valueOf(sArr[0])) : s.k();
    }

    public static List m0(boolean[] zArr) {
        rd.m.e(zArr, "<this>");
        int length = zArr.length;
        return length != 0 ? length != 1 ? v0(zArr) : r.e(Boolean.valueOf(zArr[0])) : s.k();
    }

    public static final List n0(byte[] bArr) {
        rd.m.e(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    public static final List o0(char[] cArr) {
        rd.m.e(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    public static final List p0(double[] dArr) {
        rd.m.e(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    public static final List q0(float[] fArr) {
        rd.m.e(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    public static final List r0(int[] iArr) {
        rd.m.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static final List s0(long[] jArr) {
        rd.m.e(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static List t0(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        return new ArrayList(s.h(objArr, false, 1, null));
    }

    public static final List u0(short[] sArr) {
        rd.m.e(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    public static final List v0(boolean[] zArr) {
        rd.m.e(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    public static Iterable w(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        return objArr.length == 0 ? s.k() : new a(objArr);
    }

    public static Set w0(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) d0(objArr, new LinkedHashSet(m0.e(objArr.length))) : s0.c(objArr[0]) : t0.d();
    }

    public static qg.h x(Object[] objArr) {
        rd.m.e(objArr, "<this>");
        return objArr.length == 0 ? qg.k.i() : new b(objArr);
    }

    public static Iterable x0(final Object[] objArr) {
        rd.m.e(objArr, "<this>");
        return new h0(new qd.a() { // from class: ed.n
            @Override // qd.a
            public final Object a() {
                return o.y0(objArr);
            }
        });
    }

    public static final boolean y(int[] iArr, int i10) {
        rd.m.e(iArr, "<this>");
        return K(iArr, i10) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator y0(Object[] objArr) {
        return rd.c.a(objArr);
    }

    public static boolean z(Object[] objArr, Object obj) {
        rd.m.e(objArr, "<this>");
        return L(objArr, obj) >= 0;
    }

    public static List z0(Object[] objArr, Iterable iterable) {
        rd.m.e(objArr, "<this>");
        rd.m.e(iterable, "other");
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(t.v(iterable, 10), length));
        int i10 = 0;
        for (Object obj : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(dd.w.a(objArr[i10], obj));
            i10++;
        }
        return arrayList;
    }
}
