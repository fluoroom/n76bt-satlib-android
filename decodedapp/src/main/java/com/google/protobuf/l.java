package com.google.protobuf;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f9119b = new j(o0.f9247d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f9120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator f9121d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9122a = 0;

    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9123a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9124b;

        a() {
            this.f9124b = l.this.size();
        }

        @Override // com.google.protobuf.l.g
        public byte b() {
            int i10 = this.f9123a;
            if (i10 >= this.f9124b) {
                throw new NoSuchElementException();
            }
            this.f9123a = i10 + 1;
            return l.this.l(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9123a < this.f9124b;
        }
    }

    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(l lVar, l lVar2) {
            g gVarP = lVar.p();
            g gVarP2 = lVar2.p();
            while (gVarP.hasNext() && gVarP2.hasNext()) {
                int iCompareTo = Integer.valueOf(l.D(gVarP.b())).compareTo(Integer.valueOf(l.D(gVarP2.b())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(lVar.size()).compareTo(Integer.valueOf(lVar2.size()));
        }
    }

    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(b());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements f {
        private d() {
        }

        @Override // com.google.protobuf.l.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f9126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f9127g;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            l.f(i10, i10 + i11, bArr.length);
            this.f9126f = i10;
            this.f9127g = i11;
        }

        @Override // com.google.protobuf.l.j
        protected int a0() {
            return this.f9126f;
        }

        @Override // com.google.protobuf.l.j, com.google.protobuf.l
        public byte d(int i10) {
            l.e(i10, size());
            return this.f9130e[this.f9126f + i10];
        }

        @Override // com.google.protobuf.l.j, com.google.protobuf.l
        protected void j(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f9130e, a0() + i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.l.j, com.google.protobuf.l
        byte l(int i10) {
            return this.f9130e[this.f9126f + i10];
        }

        @Override // com.google.protobuf.l.j, com.google.protobuf.l
        public int size() {
            return this.f9127g;
        }
    }

    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    public interface g extends Iterator {
        byte b();
    }

    static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f9128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f9129b;

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public l a() {
            this.f9128a.d();
            return new j(this.f9129b);
        }

        public o b() {
            return this.f9128a;
        }

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f9129b = bArr;
            this.f9128a = o.i0(bArr);
        }
    }

    static abstract class i extends l {
        i() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.p();
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f9130e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f9130e = bArr;
        }

        @Override // com.google.protobuf.l
        public final l A(int i10, int i11) {
            int iF = l.f(i10, i11, size());
            return iF == 0 ? l.f9119b : new e(this.f9130e, a0() + i10, iF);
        }

        @Override // com.google.protobuf.l
        protected final String L(Charset charset) {
            return new String(this.f9130e, a0(), size(), charset);
        }

        @Override // com.google.protobuf.l
        final void Y(com.google.protobuf.k kVar) {
            kVar.b(this.f9130e, a0(), size());
        }

        final boolean Z(l lVar, int i10, int i11) {
            if (i11 > lVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
            int i12 = i10 + i11;
            if (i12 > lVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + lVar.size());
            }
            if (!(lVar instanceof j)) {
                return lVar.A(i10, i12).equals(A(0, i11));
            }
            j jVar = (j) lVar;
            byte[] bArr = this.f9130e;
            byte[] bArr2 = jVar.f9130e;
            int iA0 = a0() + i11;
            int iA02 = a0();
            int iA03 = jVar.a0() + i10;
            while (iA02 < iA0) {
                if (bArr[iA02] != bArr2[iA03]) {
                    return false;
                }
                iA02++;
                iA03++;
            }
            return true;
        }

        protected int a0() {
            return 0;
        }

        @Override // com.google.protobuf.l
        public final ByteBuffer c() {
            return ByteBuffer.wrap(this.f9130e, a0(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.l
        public byte d(int i10) {
            return this.f9130e[i10];
        }

        @Override // com.google.protobuf.l
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof l) || size() != ((l) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iZ = z();
            int iZ2 = jVar.z();
            if (iZ == 0 || iZ2 == 0 || iZ == iZ2) {
                return Z(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.l
        protected void j(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f9130e, i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.l
        byte l(int i10) {
            return this.f9130e[i10];
        }

        @Override // com.google.protobuf.l
        public final boolean o() {
            int iA0 = a0();
            return z2.t(this.f9130e, iA0, size() + iA0);
        }

        @Override // com.google.protobuf.l
        public final m s() {
            return m.n(this.f9130e, a0(), size(), true);
        }

        @Override // com.google.protobuf.l
        public int size() {
            return this.f9130e.length;
        }

        @Override // com.google.protobuf.l
        protected final int t(int i10, int i11, int i12) {
            return o0.k(i10, this.f9130e, a0() + i11, i12);
        }
    }

    private static final class k implements f {
        private k() {
        }

        @Override // com.google.protobuf.l.f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f9120c = com.google.protobuf.e.c() ? new k(aVar) : new d(aVar);
        f9121d = new b();
    }

    l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int D(byte b10) {
        return b10 & MessagePack.Code.EXT_TIMESTAMP;
    }

    private String O() {
        if (size() <= 50) {
            return o2.a(this);
        }
        return o2.a(A(0, 47)) + "...";
    }

    static l Q(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new x1(byteBuffer);
        }
        return S(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    static l R(byte[] bArr) {
        return new j(bArr);
    }

    static l S(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    static void e(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    static int f(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static l g(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static l h(byte[] bArr, int i10, int i11) {
        f(i10, i10 + i11, bArr.length);
        return new j(f9120c.a(bArr, i10, i11));
    }

    public static l i(String str) {
        return new j(str.getBytes(o0.f9245b));
    }

    static h q(int i10) {
        return new h(i10, null);
    }

    public abstract l A(int i10, int i11);

    public final byte[] C() {
        int size = size();
        if (size == 0) {
            return o0.f9247d;
        }
        byte[] bArr = new byte[size];
        j(bArr, 0, 0, size);
        return bArr;
    }

    public final String K(Charset charset) {
        return size() == 0 ? "" : L(charset);
    }

    protected abstract String L(Charset charset);

    public final String N() {
        return K(o0.f9245b);
    }

    abstract void Y(com.google.protobuf.k kVar);

    public abstract ByteBuffer c();

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iT = this.f9122a;
        if (iT == 0) {
            int size = size();
            iT = t(size, 0, size);
            if (iT == 0) {
                iT = 1;
            }
            this.f9122a = iT;
        }
        return iT;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    protected abstract void j(byte[] bArr, int i10, int i11, int i12);

    abstract byte l(int i10);

    public abstract boolean o();

    public g p() {
        return new a();
    }

    public abstract m s();

    public abstract int size();

    protected abstract int t(int i10, int i11, int i12);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), O());
    }

    protected final int z() {
        return this.f9122a;
    }
}
