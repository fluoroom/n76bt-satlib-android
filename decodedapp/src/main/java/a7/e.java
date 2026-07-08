package a7;

import com.fasterxml.jackson.databind.JavaType;
import d6.e0;
import e6.j;
import e6.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f363a;

        static {
            int[] iArr = new int[m.values().length];
            f363a = iArr;
            try {
                iArr[m.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f363a[m.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f363a[m.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f363a[m.VALUE_TRUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f363a[m.VALUE_FALSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static Object a(j jVar, p6.h hVar, JavaType javaType) {
        return b(jVar, hVar, javaType.r());
    }

    public static Object b(j jVar, p6.h hVar, Class cls) {
        m mVarN = jVar.n();
        if (mVarN == null) {
            return null;
        }
        int i10 = a.f363a[mVarN.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5 && cls.isAssignableFrom(Boolean.class)) {
                            return Boolean.FALSE;
                        }
                    } else if (cls.isAssignableFrom(Boolean.class)) {
                        return Boolean.TRUE;
                    }
                } else if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(jVar.X());
                }
            } else if (cls.isAssignableFrom(Integer.class)) {
                return Integer.valueOf(jVar.t0());
            }
        } else if (cls.isAssignableFrom(String.class)) {
            return jVar.C0();
        }
        return null;
    }

    public abstract Object c(j jVar, p6.h hVar);

    public abstract Object d(j jVar, p6.h hVar);

    public abstract Object e(j jVar, p6.h hVar);

    public abstract Object f(j jVar, p6.h hVar);

    public abstract e g(p6.d dVar);

    public abstract Class h();

    public abstract String i();

    public abstract f j();

    public abstract e0.a k();

    public abstract boolean l();
}
