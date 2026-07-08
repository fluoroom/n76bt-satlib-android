package com.bumptech.glide.load.data;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f5180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f5181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l2.b f5182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5183d;

    public c(OutputStream outputStream, l2.b bVar) {
        this(outputStream, bVar, WXMediaMessage.THUMB_LENGTH_LIMIT);
    }

    private void a() throws IOException {
        int i10 = this.f5183d;
        if (i10 > 0) {
            this.f5180a.write(this.f5181b, 0, i10);
            this.f5183d = 0;
        }
    }

    private void c() throws IOException {
        if (this.f5183d == this.f5181b.length) {
            a();
        }
    }

    private void e() {
        byte[] bArr = this.f5181b;
        if (bArr != null) {
            this.f5182c.put(bArr);
            this.f5181b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f5180a.close();
            e();
        } catch (Throwable th2) {
            this.f5180a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f5180a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f5181b;
        int i11 = this.f5183d;
        this.f5183d = i11 + 1;
        bArr[i11] = (byte) i10;
        c();
    }

    c(OutputStream outputStream, l2.b bVar, int i10) {
        this.f5180a = outputStream;
        this.f5182c = bVar;
        this.f5181b = (byte[]) bVar.d(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f5183d;
            if (i15 == 0 && i13 >= this.f5181b.length) {
                this.f5180a.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f5181b.length - i15);
            System.arraycopy(bArr, i14, this.f5181b, this.f5183d, iMin);
            this.f5183d += iMin;
            i12 += iMin;
            c();
        } while (i12 < i11);
    }
}
