package x3;

import a6.n;
import com.dw.audio.codec.OpusDecoder;
import hi.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ii.b f31600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OpusDecoder f31601b;

    public a(File file) {
        this(new FileInputStream(file));
    }

    public int P(short[] sArr, int i10, int i11) throws IOException {
        ii.a aVarC = this.f31600a.c();
        if (aVarC == null) {
            return -1;
        }
        return this.f31601b.e(aVarC.a(), aVarC.a().length, sArr, i10, i11);
    }

    public ii.a a() {
        return this.f31600a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        n.a(this.f31600a);
        n.a(this.f31601b);
    }

    protected void finalize() {
        try {
            super.finalize();
        } finally {
            close();
        }
    }

    public int j() {
        return this.f31600a.a().d();
    }

    public a(InputStream inputStream) {
        try {
            ii.b bVar = new ii.b(new d(inputStream));
            this.f31600a = bVar;
            this.f31601b = new OpusDecoder(bVar.a().d(), 0);
        } catch (Throwable th2) {
            n.a(inputStream);
            throw th2;
        }
    }
}
