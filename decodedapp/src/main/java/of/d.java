package of;

import com.facebook.stetho.common.Utf8Charset;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23423a = new o(new byte[0]);

    public interface a extends Iterator {
        byte b();
    }

    d() {
    }

    private static d b(Iterator it, int i10) {
        if (i10 == 1) {
            return (d) it.next();
        }
        int i11 = i10 >>> 1;
        return b(it, i11).c(b(it, i10 - i11));
    }

    public static d d(Iterable iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add((d) it.next());
            }
        }
        return arrayList.isEmpty() ? f23423a : b(arrayList.iterator(), arrayList.size());
    }

    public static d e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static d f(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new o(bArr2);
    }

    public static d g(String str) {
        try {
            return new o(str.getBytes(Utf8Charset.NAME));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static b o() {
        return new b(128);
    }

    abstract void A(OutputStream outputStream, int i10, int i11);

    public d c(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return t.E(this, dVar);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void h(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i12 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i13);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i14 = i11 + i12;
        if (i14 <= bArr.length) {
            if (i12 > 0) {
                i(bArr, i10, i11, i12);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i14);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    protected abstract void i(byte[] bArr, int i10, int i11, int i12);

    public boolean isEmpty() {
        return size() == 0;
    }

    protected abstract int j();

    protected abstract boolean l();

    public abstract boolean m();

    protected abstract int p(int i10, int i11, int i12);

    protected abstract int q(int i10, int i11, int i12);

    protected abstract int s();

    public abstract int size();

    public byte[] t() {
        int size = size();
        if (size == 0) {
            return j.f23478a;
        }
        byte[] bArr = new byte[size];
        i(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String u(String str);

    public String y() {
        try {
            return u(Utf8Charset.NAME);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    void z(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i12 = i10 + i11;
        if (i12 <= size()) {
            if (i11 > 0) {
                A(outputStream, i10, i11);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i12);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public static final class b extends OutputStream {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f23424f = new byte[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList f23426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f23428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23429e;

        b(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f23425a = i10;
            this.f23426b = new ArrayList();
            this.f23428d = new byte[i10];
        }

        private byte[] a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void c(int i10) {
            this.f23426b.add(new o(this.f23428d));
            int length = this.f23427c + this.f23428d.length;
            this.f23427c = length;
            this.f23428d = new byte[Math.max(this.f23425a, Math.max(i10, length >>> 1))];
            this.f23429e = 0;
        }

        private void e() {
            int i10 = this.f23429e;
            byte[] bArr = this.f23428d;
            if (i10 >= bArr.length) {
                this.f23426b.add(new o(this.f23428d));
                this.f23428d = f23424f;
            } else if (i10 > 0) {
                this.f23426b.add(new o(a(bArr, i10)));
            }
            this.f23427c += this.f23429e;
            this.f23429e = 0;
        }

        public synchronized int k() {
            return this.f23427c + this.f23429e;
        }

        public synchronized d l() {
            e();
            return d.d(this.f23426b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(k()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            try {
                if (this.f23429e == this.f23428d.length) {
                    c(1);
                }
                byte[] bArr = this.f23428d;
                int i11 = this.f23429e;
                this.f23429e = i11 + 1;
                bArr[i11] = (byte) i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            try {
                byte[] bArr2 = this.f23428d;
                int length = bArr2.length;
                int i12 = this.f23429e;
                if (i11 <= length - i12) {
                    System.arraycopy(bArr, i10, bArr2, i12, i11);
                    this.f23429e += i11;
                } else {
                    int length2 = bArr2.length - i12;
                    System.arraycopy(bArr, i10, bArr2, i12, length2);
                    int i13 = i11 - length2;
                    c(i13);
                    System.arraycopy(bArr, i10 + length2, this.f23428d, 0, i13);
                    this.f23429e = i13;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
