package r2;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile byte[] f25341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l2.b f25346f;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public f0(InputStream inputStream, l2.b bVar) {
        this(inputStream, bVar, WXMediaMessage.THUMB_LENGTH_LIMIT);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f25344d;
        if (i10 != -1) {
            int i11 = this.f25345e - i10;
            int i12 = this.f25343c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f25342b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f25346f.d(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f25341a = bArr2;
                    this.f25346f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f25345e - this.f25344d;
                this.f25345e = i13;
                this.f25344d = 0;
                this.f25342b = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f25345e;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f25342b = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f25344d = -1;
            this.f25345e = 0;
            this.f25342b = i16;
        }
        return i16;
    }

    private static IOException k() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f25341a == null || inputStream == null) {
            throw k();
        }
        return (this.f25342b - this.f25345e) + inputStream.available();
    }

    public synchronized void c() {
        this.f25343c = this.f25341a.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f25341a != null) {
            this.f25346f.put(this.f25341a);
            this.f25341a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void e() {
        if (this.f25341a != null) {
            this.f25346f.put(this.f25341a);
            this.f25341a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f25343c = Math.max(this.f25343c, i10);
        this.f25344d = this.f25345e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f25341a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw k();
        }
        if (this.f25345e >= this.f25342b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f25341a && (bArr = this.f25341a) == null) {
            throw k();
        }
        int i10 = this.f25342b;
        int i11 = this.f25345e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f25345e = i11 + 1;
        return bArr[i11] & MessagePack.Code.EXT_TIMESTAMP;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f25341a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f25344d;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f25345e + " markLimit: " + this.f25343c);
        }
        this.f25345e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f25341a;
        if (bArr == null) {
            throw k();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw k();
        }
        int i10 = this.f25342b;
        int i11 = this.f25345e;
        if (i10 - i11 >= j10) {
            this.f25345e = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f25345e = i10;
        if (this.f25344d == -1 || j10 > this.f25343c) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f25344d = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f25342b;
        int i13 = this.f25345e;
        if (i12 - i13 >= j10 - j11) {
            this.f25345e = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f25345e = i12;
        return j12;
    }

    f0(InputStream inputStream, l2.b bVar, int i10) {
        super(inputStream);
        this.f25344d = -1;
        this.f25346f = bVar;
        this.f25341a = (byte[]) bVar.d(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f25341a;
        if (bArr2 == null) {
            throw k();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f25345e;
            int i15 = this.f25342b;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f25345e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f25344d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f25341a && (bArr2 = this.f25341a) == null) {
                        throw k();
                    }
                    int i17 = this.f25342b;
                    int i18 = this.f25345e;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f25345e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw k();
        }
    }
}
