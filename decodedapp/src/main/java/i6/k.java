package i6;

import java.io.Writer;
import o6.p;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f15816a;

    public k(o6.a aVar) {
        this.f15816a = new p(aVar);
    }

    public String a() {
        String strK = this.f15816a.k();
        this.f15816a.t();
        return strK;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f15816a.d(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        this.f15816a.d(cArr, i10, i11);
    }

    @Override // java.io.Writer
    public void write(int i10) {
        this.f15816a.b((char) i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        write(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.f15816a.c(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String string = charSequence.toString();
        this.f15816a.c(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) {
        this.f15816a.c(str, i10, i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        String string = charSequence.subSequence(i10, i11).toString();
        this.f15816a.c(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}
