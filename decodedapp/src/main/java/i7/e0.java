package i7;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class e0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final e0 f15881a = new e0();

    private static final class a extends e0 implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class[] f15882b;

        public a(Class[] clsArr) {
            this.f15882b = clsArr;
        }

        @Override // i7.e0
        public boolean b(Class cls) {
            int length = this.f15882b.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class cls2 = this.f15882b[i10];
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class b extends e0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f15883b;

        public b(Class cls) {
            this.f15883b = cls;
        }

        @Override // i7.e0
        public boolean b(Class cls) {
            Class cls2 = this.f15883b;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    public static e0 a(Class[] clsArr) {
        if (clsArr == null) {
            return f15881a;
        }
        int length = clsArr.length;
        return length != 0 ? length != 1 ? new a(clsArr) : new b(clsArr[0]) : f15881a;
    }

    public boolean b(Class cls) {
        return false;
    }
}
