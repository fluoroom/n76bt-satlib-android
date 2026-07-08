package q5;

import b6.c;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class b extends OutputStream {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f24354h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f24355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f24356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f24357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Thread f24358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f24359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f24360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f24361g;

    public b(OutputStream outputStream, int i10) {
        this(outputStream, i10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            try {
                Runnable runnable = this.f24361g;
                if (runnable != null) {
                    runnable.run();
                    this.f24361g = null;
                }
                while (this.f24359e) {
                    this.f24356b.i(1, 0L);
                    byte[] bArr = (byte[]) this.f24356b.m();
                    if (bArr != null) {
                        this.f24355a.write(bArr);
                        this.f24355a.flush();
                    }
                }
            } catch (IOException e10) {
                e = e10;
                this.f24360f = e;
            } catch (InterruptedException e11) {
                e = e11;
                this.f24360f = e;
            }
            this.f24356b.e();
            this.f24359e = false;
        } catch (Throwable th2) {
            this.f24356b.e();
            this.f24359e = false;
            throw th2;
        }
    }

    public int c() {
        return this.f24356b.c();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f24355a.close();
        this.f24359e = false;
        this.f24358d.interrupt();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            c cVar = this.f24356b;
            cVar.h(cVar.d(), 0L);
            this.f24355a.flush();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    public b(OutputStream outputStream, int i10, Runnable runnable) {
        this.f24359e = true;
        this.f24355a = outputStream;
        this.f24356b = new c(new byte[i10][]);
        this.f24357c = null;
        this.f24361g = runnable;
        Runnable runnable2 = new Runnable() { // from class: q5.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f24353a.e();
            }
        };
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AOS-");
        int i11 = f24354h;
        f24354h = i11 + 1;
        sb2.append(i11);
        Thread thread = new Thread(runnable2, sb2.toString());
        this.f24358d = thread;
        thread.start();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        if (this.f24360f != null) {
            IOException iOException = new IOException("e", this.f24360f);
            this.f24360f = null;
            throw iOException;
        }
        if (!this.f24359e) {
            throw new IOException("写线程已经退出");
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f24356b.n(bArr2);
    }
}
