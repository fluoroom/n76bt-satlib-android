package com.google.protobuf;

import com.facebook.stetho.common.Utf8Charset;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f9244a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f9245b = Charset.forName(Utf8Charset.NAME);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f9246c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f9247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f9248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f9249f;

    public interface a extends j {
    }

    public interface b extends j {
    }

    public interface c {
        int getNumber();
    }

    public interface d {
    }

    public interface e {
        boolean a(int i10);
    }

    public interface f extends j {
    }

    public interface g extends j {
        int getInt(int i10);

        void x(int i10);
    }

    public static class h extends AbstractList {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f9250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f9251b;

        public interface a {
            Object convert(Object obj);
        }

        public h(List list, a aVar) {
            this.f9250a = list;
            this.f9251b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            return this.f9251b.convert(this.f9250a.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9250a.size();
        }
    }

    public interface i extends j {
        void G(long j10);

        long W(int i10, long j10);

        long getLong(int i10);
    }

    public interface j extends List, RandomAccess {
        boolean p0();

        void r();

        j v(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f9247d = bArr;
        f9248e = ByteBuffer.wrap(bArr);
        f9249f = m.l(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static l1 c(Class cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", null);
            return (l1) method.invoke(method, null);
        } catch (Exception e10) {
            throw new RuntimeException("Failed to get default instance for " + cls, e10);
        }
    }

    public static int d(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    static int f(byte[] bArr, int i10, int i11) {
        int iK = k(i11, bArr, i10, i11);
        if (iK == 0) {
            return 1;
        }
        return iK;
    }

    public static int g(c cVar) {
        return cVar.getNumber();
    }

    public static int h(List list) {
        Iterator it = list.iterator();
        int iG = 1;
        while (it.hasNext()) {
            iG = (iG * 31) + g((c) it.next());
        }
        return iG;
    }

    public static int i(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean j(byte[] bArr) {
        return z2.s(bArr);
    }

    static int k(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String l(byte[] bArr) {
        return new String(bArr, f9245b);
    }
}
