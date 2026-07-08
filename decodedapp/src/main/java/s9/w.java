package s9;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import org.msgpack.core.MessagePack;
import s9.l;

/* JADX INFO: loaded from: classes3.dex */
final class w extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final l f27082h = new w(null, new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Object f27083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f27084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f27085g;

    static class a extends m {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient l f27086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient Object[] f27087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f27088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final transient int f27089f;

        /* JADX INFO: renamed from: s9.w$a$a, reason: collision with other inner class name */
        class C0374a extends k {
            C0374a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i10) {
                r9.l.l(i10, a.this.f27089f);
                int i11 = i10 * 2;
                Object obj = a.this.f27087d[a.this.f27088e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f27087d[i11 + (a.this.f27088e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // s9.j
            public boolean g() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f27089f;
            }
        }

        a(l lVar, Object[] objArr, int i10, int i11) {
            this.f27086c = lVar;
            this.f27087d = objArr;
            this.f27088e = i10;
            this.f27089f = i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public b0 iterator() {
            return b().iterator();
        }

        @Override // s9.j
        int c(Object[] objArr, int i10) {
            return b().c(objArr, i10);
        }

        @Override // s9.j, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f27086c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // s9.j
        boolean g() {
            return true;
        }

        @Override // s9.m
        k l() {
            return new C0374a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f27089f;
        }
    }

    static final class b extends m {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient l f27091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient k f27092d;

        b(l lVar, k kVar) {
            this.f27091c = lVar;
            this.f27092d = kVar;
        }

        @Override // s9.m, s9.j
        public k b() {
            return this.f27092d;
        }

        @Override // s9.j
        int c(Object[] objArr, int i10) {
            return b().c(objArr, i10);
        }

        @Override // s9.j, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f27091c.get(obj) != null;
        }

        @Override // s9.j
        boolean g() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f27091c.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b0 iterator() {
            return b().iterator();
        }
    }

    static final class c extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient Object[] f27093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient int f27094d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final transient int f27095e;

        c(Object[] objArr, int i10, int i11) {
            this.f27093c = objArr;
            this.f27094d = i10;
            this.f27095e = i11;
        }

        @Override // s9.j
        boolean g() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            r9.l.l(i10, this.f27095e);
            Object obj = this.f27093c[(i10 * 2) + this.f27094d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f27095e;
        }
    }

    private w(Object obj, Object[] objArr, int i10) {
        this.f27083e = obj;
        this.f27084f = objArr;
        this.f27085g = i10;
    }

    static w k(int i10, Object[] objArr, l.a aVar) {
        if (i10 == 0) {
            return (w) f27082h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            s9.c.a(obj, obj2);
            return new w(null, objArr, 1);
        }
        r9.l.q(i10, objArr.length >> 1);
        Object objL = l(objArr, i10, m.h(i10), 0);
        if (objL instanceof Object[]) {
            Object[] objArr2 = (Object[]) objL;
            l.a.C0371a c0371a = (l.a.C0371a) objArr2[2];
            if (aVar == null) {
                throw c0371a.a();
            }
            aVar.f27053e = c0371a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objL = obj3;
            i10 = iIntValue;
        }
        return new w(objL, objArr, i10);
    }

    private static Object l(Object[] objArr, int i10, int i11, int i12) {
        l.a.C0371a c0371a = null;
        int i13 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            s9.c.a(obj, obj2);
            return null;
        }
        int i14 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                s9.c.a(obj3, obj4);
                int iA = i.a(obj3.hashCode());
                while (true) {
                    int i19 = iA & i14;
                    int i20 = bArr[i19] & MessagePack.Code.EXT_TIMESTAMP;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                    } else {
                        if (obj3.equals(objArr[i20])) {
                            int i21 = i20 ^ 1;
                            Object obj5 = objArr[i21];
                            Objects.requireNonNull(obj5);
                            c0371a = new l.a.C0371a(obj3, obj4, obj5);
                            objArr[i21] = obj4;
                            break;
                        }
                        iA = i19 + 1;
                    }
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), c0371a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                s9.c.a(obj6, obj7);
                int iA2 = i.a(obj6.hashCode());
                while (true) {
                    int i26 = iA2 & i14;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                    } else {
                        if (obj6.equals(objArr[i27])) {
                            int i28 = i27 ^ 1;
                            Object obj8 = objArr[i28];
                            Objects.requireNonNull(obj8);
                            c0371a = new l.a.C0371a(obj6, obj7, obj8);
                            objArr[i28] = obj7;
                            break;
                        }
                        iA2 = i26 + 1;
                    }
                }
            }
            return i22 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i22), c0371a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i29 = 0;
        int i30 = 0;
        while (i29 < i10) {
            int i31 = (i29 * 2) + i12;
            int i32 = (i30 * 2) + i12;
            Object obj9 = objArr[i31];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i31 ^ i13];
            Objects.requireNonNull(obj10);
            s9.c.a(obj9, obj10);
            int iA3 = i.a(obj9.hashCode());
            while (true) {
                int i33 = iA3 & i14;
                int i34 = iArr[i33];
                if (i34 == -1) {
                    iArr[i33] = i32;
                    if (i30 < i29) {
                        objArr[i32] = obj9;
                        objArr[i32 ^ 1] = obj10;
                    }
                    i30++;
                } else {
                    if (obj9.equals(objArr[i34])) {
                        int i35 = i34 ^ 1;
                        Object obj11 = objArr[i35];
                        Objects.requireNonNull(obj11);
                        c0371a = new l.a.C0371a(obj9, obj10, obj11);
                        objArr[i35] = obj10;
                        break;
                    }
                    iA3 = i33 + 1;
                }
            }
            i29++;
            i13 = 1;
        }
        return i30 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i30), c0371a};
    }

    static Object n(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iA = i.a(obj2.hashCode());
            while (true) {
                int i12 = iA & length;
                int i13 = bArr[i12] & MessagePack.Code.EXT_TIMESTAMP;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iA = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iA2 = i.a(obj2.hashCode());
            while (true) {
                int i14 = iA2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iA2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iA3 = i.a(obj2.hashCode());
            while (true) {
                int i16 = iA3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iA3 = i16 + 1;
            }
        }
    }

    @Override // s9.l
    m c() {
        return new a(this, this.f27084f, 0, this.f27085g);
    }

    @Override // s9.l
    m d() {
        return new b(this, new c(this.f27084f, 0, this.f27085g));
    }

    @Override // s9.l
    j e() {
        return new c(this.f27084f, 1, this.f27085g);
    }

    @Override // s9.l
    boolean g() {
        return false;
    }

    @Override // s9.l, java.util.Map
    public Object get(Object obj) {
        Object objN = n(this.f27083e, this.f27084f, this.f27085g, 0, obj);
        if (objN == null) {
            return null;
        }
        return objN;
    }

    @Override // java.util.Map
    public int size() {
        return this.f27085g;
    }
}
