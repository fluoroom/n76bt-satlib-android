package gj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t extends Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f14689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14690b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f14691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f14692d;

    public t(String str, Reader reader) {
        this.f14689a = new BufferedReader(reader);
    }

    protected abstract CharSequence a(int i10, String str);

    protected BufferedReader c() {
        return this.f14689a;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14689a.close();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        if (this.f14691c == null) {
            this.f14692d = 0;
            String line = this.f14689a.readLine();
            int i12 = this.f14690b + 1;
            this.f14690b = i12;
            if (line == null) {
                return -1;
            }
            this.f14691c = a(i12, line);
        }
        int iE = aj.d.E(i11, this.f14691c.length() - this.f14692d);
        for (int i13 = 0; i13 < iE; i13++) {
            cArr[i10 + i13] = this.f14691c.charAt(this.f14692d + i13);
        }
        if (iE >= i11) {
            this.f14692d += iE;
            return iE;
        }
        cArr[i10 + iE] = '\n';
        this.f14691c = null;
        return iE + 1;
    }
}
