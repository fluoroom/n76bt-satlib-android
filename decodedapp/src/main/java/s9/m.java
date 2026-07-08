package s9;

import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends j implements Set, j$.util.Set {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient k f27057b;

    m() {
    }

    static int h(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            r9.l.e(iMax < 1073741824, "collection too large");
            return WXVideoFileObject.FILE_SIZE_LIMIT;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    private static m i(int i10, Object... objArr) {
        if (i10 == 0) {
            return p();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return q(obj);
        }
        int iH = h(i10);
        Object[] objArr2 = new Object[iH];
        int i11 = iH - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = s.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iA = i.a(iHashCode);
            while (true) {
                int i15 = iA & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new z(obj3);
        }
        if (h(i13) < iH / 2) {
            return i(i13, objArr);
        }
        if (s(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new x(objArr, i12, objArr2, i11, i13);
    }

    public static m j(Collection collection) {
        if ((collection instanceof m) && !(collection instanceof SortedSet)) {
            m mVar = (m) collection;
            if (!mVar.g()) {
                return mVar;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    public static m p() {
        return x.f27097r;
    }

    public static m q(Object obj) {
        return new z(obj);
    }

    private static boolean s(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @Override // s9.j
    public k b() {
        k kVar = this.f27057b;
        if (kVar != null) {
            return kVar;
        }
        k kVarL = l();
        this.f27057b = kVarL;
        return kVarL;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m) && o() && ((m) obj).o() && hashCode() != obj.hashCode()) {
            return false;
        }
        return y.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return y.b(this);
    }

    k l() {
        return k.h(toArray());
    }

    boolean o() {
        return false;
    }
}
