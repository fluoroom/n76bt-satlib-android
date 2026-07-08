package xd;

import rd.m;
import xd.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends e {
    public static int b(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static int c(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long d(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static int e(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long f(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static a g(int i10, int i11) {
        return a.f31971d.a(i10, i11, -1);
    }

    public static a h(a aVar, int i10) {
        m.e(aVar, "<this>");
        e.a(i10 > 0, Integer.valueOf(i10));
        a.C0433a c0433a = a.f31971d;
        int iB = aVar.b();
        int iC = aVar.c();
        if (aVar.d() <= 0) {
            i10 = -i10;
        }
        return c0433a.a(iB, iC, i10);
    }

    public static c i(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? c.f31979e.a() : new c(i10, i11 - 1);
    }
}
