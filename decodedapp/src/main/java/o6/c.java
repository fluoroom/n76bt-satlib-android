package o6;

import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f23220f = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f23221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedList f23222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f23224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23225e;

    public c() {
        this((a) null);
    }

    private void a() {
        int length = this.f23223c + this.f23224d.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.f23223c = length;
        int iMax = Math.max(length >> 1, CloseCodes.NORMAL_CLOSURE);
        if (iMax > 131072) {
            iMax = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        }
        this.f23222b.add(this.f23224d);
        this.f23224d = new byte[iMax];
        this.f23225e = 0;
    }

    public void c(int i10) {
        if (this.f23225e >= this.f23224d.length) {
            a();
        }
        byte[] bArr = this.f23224d;
        int i11 = this.f23225e;
        this.f23225e = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public void e(int i10) {
        int i11 = this.f23225e;
        int i12 = i11 + 2;
        byte[] bArr = this.f23224d;
        if (i12 >= bArr.length) {
            c(i10 >> 16);
            c(i10 >> 8);
            c(i10);
            return;
        }
        int i13 = i11 + 1;
        this.f23225e = i13;
        bArr[i11] = (byte) (i10 >> 16);
        int i14 = i11 + 2;
        this.f23225e = i14;
        bArr[i13] = (byte) (i10 >> 8);
        this.f23225e = i11 + 3;
        bArr[i14] = (byte) i10;
    }

    public void k(int i10) {
        int i11 = this.f23225e;
        int i12 = i11 + 1;
        byte[] bArr = this.f23224d;
        if (i12 >= bArr.length) {
            c(i10 >> 8);
            c(i10);
            return;
        }
        int i13 = i11 + 1;
        this.f23225e = i13;
        bArr[i11] = (byte) (i10 >> 8);
        this.f23225e = i11 + 2;
        bArr[i13] = (byte) i10;
    }

    public byte[] l() {
        int i10 = this.f23223c + this.f23225e;
        if (i10 == 0) {
            return f23220f;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (byte[] bArr2 : this.f23222b) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        System.arraycopy(this.f23224d, 0, bArr, i11, this.f23225e);
        int i12 = i11 + this.f23225e;
        if (i12 == i10) {
            if (!this.f23222b.isEmpty()) {
                reset();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i10 + ", copied " + i12 + " bytes");
    }

    public void reset() {
        this.f23223c = 0;
        this.f23225e = 0;
        if (this.f23222b.isEmpty()) {
            return;
        }
        this.f23222b.clear();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public c(a aVar) {
        this(aVar, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int iMin = Math.min(this.f23224d.length - this.f23225e, i11);
            if (iMin > 0) {
                System.arraycopy(bArr, i10, this.f23224d, this.f23225e, iMin);
                i10 += iMin;
                this.f23225e += iMin;
                i11 -= iMin;
            }
            if (i11 <= 0) {
                return;
            } else {
                a();
            }
        }
    }

    public c(int i10) {
        this(null, i10);
    }

    public c(a aVar, int i10) {
        this.f23222b = new LinkedList();
        this.f23221a = aVar;
        this.f23224d = aVar == null ? new byte[i10 > 131072 ? WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT : i10] : aVar.a(2);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        c(i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}
