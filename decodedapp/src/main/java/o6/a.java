package o6;

import com.facebook.stetho.server.http.HttpStatus;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f23214c = {8000, 8000, 2000, 2000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f23215d = {4000, 4000, HttpStatus.HTTP_OK, HttpStatus.HTTP_OK};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final AtomicReferenceArray f23216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AtomicReferenceArray f23217b;

    public a() {
        this(4, 4);
    }

    public final byte[] a(int i10) {
        return b(i10, 0);
    }

    public byte[] b(int i10, int i11) {
        int iF = f(i10);
        if (i11 < iF) {
            i11 = iF;
        }
        byte[] bArr = (byte[]) this.f23216a.getAndSet(i10, null);
        return (bArr == null || bArr.length < i11) ? e(i11) : bArr;
    }

    public final char[] c(int i10) {
        return d(i10, 0);
    }

    public char[] d(int i10, int i11) {
        int iH = h(i10);
        if (i11 < iH) {
            i11 = iH;
        }
        char[] cArr = (char[]) this.f23217b.getAndSet(i10, null);
        return (cArr == null || cArr.length < i11) ? g(i11) : cArr;
    }

    protected byte[] e(int i10) {
        return new byte[i10];
    }

    protected int f(int i10) {
        return f23214c[i10];
    }

    protected char[] g(int i10) {
        return new char[i10];
    }

    protected int h(int i10) {
        return f23215d[i10];
    }

    public void i(int i10, byte[] bArr) {
        this.f23216a.set(i10, bArr);
    }

    public void j(int i10, char[] cArr) {
        this.f23217b.set(i10, cArr);
    }

    protected a(int i10, int i11) {
        this.f23216a = new AtomicReferenceArray(i10);
        this.f23217b = new AtomicReferenceArray(i11);
    }
}
