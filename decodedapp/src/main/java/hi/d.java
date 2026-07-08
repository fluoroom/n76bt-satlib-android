package hi;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class d implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f15428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OutputStream f15429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f15431d = new HashSet();

    public d(OutputStream outputStream) {
        this.f15430c = true;
        this.f15429b = outputStream;
        this.f15430c = true;
    }

    public g a() {
        InputStream inputStream;
        if (this.f15430c || (inputStream = this.f15428a) == null) {
            throw new IllegalStateException("Can only read from a file opened with an InputStream");
        }
        return new g(inputStream);
    }

    public h c() {
        return e(k());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f15428a;
        if (inputStream != null) {
            inputStream.close();
        }
        OutputStream outputStream = this.f15429b;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    public h e(int i10) {
        if (!this.f15430c) {
            throw new IllegalStateException("Can only write to a file opened with an OutputStream");
        }
        this.f15431d.add(Integer.valueOf(i10));
        return new h(this, i10);
    }

    protected int k() {
        int iRandom;
        do {
            iRandom = (int) (Math.random() * 32767.0d);
        } while (this.f15431d.contains(Integer.valueOf(iRandom)));
        return iRandom;
    }

    protected synchronized void l(i[] iVarArr) {
        try {
            for (i iVar : iVarArr) {
                iVar.r(this.f15429b);
                this.f15429b.write(iVar.g());
            }
            this.f15429b.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public d(InputStream inputStream) {
        this.f15430c = true;
        this.f15428a = inputStream;
        this.f15430c = false;
    }
}
