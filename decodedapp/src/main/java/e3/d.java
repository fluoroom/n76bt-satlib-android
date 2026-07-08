package e3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Queue f11413c = l.f(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f11414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f11415b;

    d() {
    }

    public static d c(InputStream inputStream) {
        d dVar;
        Queue queue = f11413c;
        synchronized (queue) {
            dVar = (d) queue.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.k(inputStream);
        return dVar;
    }

    public IOException a() {
        return this.f11415b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f11414a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11414a.close();
    }

    public void e() {
        this.f11415b = null;
        this.f11414a = null;
        Queue queue = f11413c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    void k(InputStream inputStream) {
        this.f11414a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f11414a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f11414a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f11414a.read();
        } catch (IOException e10) {
            this.f11415b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f11414a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        try {
            return this.f11414a.skip(j10);
        } catch (IOException e10) {
            this.f11415b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f11414a.read(bArr);
        } catch (IOException e10) {
            this.f11415b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        try {
            return this.f11414a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f11415b = e10;
            throw e10;
        }
    }
}
