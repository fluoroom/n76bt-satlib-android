package j$.sun.misc;

import j$.util.concurrent.l;
import j$.util.concurrent.q;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17434b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f17435a;

    static {
        Field fieldG = g();
        fieldG.setAccessible(true);
        try {
            f17434b = new a((Unsafe) fieldG.get(null));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("Couldn't get the Unsafe", e10);
        }
    }

    public a(Unsafe unsafe) {
        this.f17435a = unsafe;
    }

    public static Field g() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e10) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e10);
        }
    }

    public final int e(q qVar, long j10) {
        while (true) {
            int intVolatile = this.f17435a.getIntVolatile(qVar, j10);
            q qVar2 = qVar;
            long j11 = j10;
            if (this.f17435a.compareAndSwapInt(qVar2, j11, intVolatile, intVolatile - 4)) {
                return intVolatile;
            }
            qVar = qVar2;
            j10 = j11;
        }
    }

    public final long i(Field field) {
        return this.f17435a.objectFieldOffset(field);
    }

    public final long h(Class cls, String str) {
        try {
            return i(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Cannot find field:", e10);
        }
    }

    public final int a(Class cls) {
        return this.f17435a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f17435a.arrayIndexScale(cls);
    }

    public final Object f(Object obj, long j10) {
        return this.f17435a.getObjectVolatile(obj, j10);
    }

    public final void j(Object obj, long j10, l lVar) {
        this.f17435a.putObjectVolatile(obj, j10, lVar);
    }

    public final boolean c(Object obj, long j10, int i10, int i11) {
        return this.f17435a.compareAndSwapInt(obj, j10, i10, i11);
    }

    public final boolean d(Object obj, long j10, long j11, long j12) {
        return this.f17435a.compareAndSwapLong(obj, j10, j11, j12);
    }
}
