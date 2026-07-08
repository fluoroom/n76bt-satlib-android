package i7;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f15861a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0219c f15862b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f15863c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f15864d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f15865e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f15866f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f15867g = null;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f15868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f15869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f15870c;

        a(Class cls, int i10, Object obj) {
            this.f15868a = cls;
            this.f15869b = i10;
            this.f15870c = obj;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!i7.h.H(obj, this.f15868a) || Array.getLength(obj) != this.f15869b) {
                return false;
            }
            for (int i10 = 0; i10 < this.f15869b; i10++) {
                Object obj2 = Array.get(this.f15870c, i10);
                Object obj3 = Array.get(obj, i10);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class b extends w {
        @Override // i7.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final boolean[] a(int i10) {
            return new boolean[i10];
        }
    }

    /* JADX INFO: renamed from: i7.c$c, reason: collision with other inner class name */
    public static final class C0219c extends w {
        @Override // i7.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final byte[] a(int i10) {
            return new byte[i10];
        }
    }

    public static final class d extends w {
        @Override // i7.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final double[] a(int i10) {
            return new double[i10];
        }
    }

    public static final class e extends w {
        @Override // i7.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final float[] a(int i10) {
            return new float[i10];
        }
    }

    public static final class f extends w {
        @Override // i7.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final int[] a(int i10) {
            return new int[i10];
        }
    }

    public static final class g extends w {
        @Override // i7.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final long[] a(int i10) {
            return new long[i10];
        }
    }

    public static final class h extends w {
        @Override // i7.w
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final short[] a(int i10) {
            return new short[i10];
        }
    }

    public static Object a(Object obj) {
        return new a(obj.getClass(), Array.getLength(obj), obj);
    }

    public static Object[] i(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (objArr[i10] == obj) {
                if (i10 == 0) {
                    return objArr;
                }
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
                System.arraycopy(objArr, 0, objArr2, 1, i10);
                objArr2[0] = obj;
                int i11 = i10 + 1;
                int i12 = length - i11;
                if (i12 > 0) {
                    System.arraycopy(objArr, i11, objArr2, i11, i12);
                }
                return objArr2;
            }
        }
        Object[] objArr3 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length + 1);
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr3, 1, length);
        }
        objArr3[0] = obj;
        return objArr3;
    }

    public b b() {
        if (this.f15861a == null) {
            this.f15861a = new b();
        }
        return this.f15861a;
    }

    public C0219c c() {
        if (this.f15862b == null) {
            this.f15862b = new C0219c();
        }
        return this.f15862b;
    }

    public d d() {
        if (this.f15867g == null) {
            this.f15867g = new d();
        }
        return this.f15867g;
    }

    public e e() {
        if (this.f15866f == null) {
            this.f15866f = new e();
        }
        return this.f15866f;
    }

    public f f() {
        if (this.f15864d == null) {
            this.f15864d = new f();
        }
        return this.f15864d;
    }

    public g g() {
        if (this.f15865e == null) {
            this.f15865e = new g();
        }
        return this.f15865e;
    }

    public h h() {
        if (this.f15863c == null) {
            this.f15863c = new h();
        }
        return this.f15863c;
    }
}
