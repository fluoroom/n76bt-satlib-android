package i6;

import e6.r;
import o6.m;
import o6.p;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final e f15791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Object f15792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f15793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final o6.a f15794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final r f15795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected byte[] f15796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected char[] f15797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected char[] f15798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected char[] f15799i;

    public f(r rVar, o6.a aVar, e eVar, boolean z10) {
        this.f15795e = rVar == null ? r.a() : rVar;
        this.f15794d = aVar;
        this.f15791a = eVar;
        this.f15792b = eVar.l();
        this.f15793c = z10;
    }

    private IllegalArgumentException q() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }

    protected final void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    protected final void b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw q();
        }
    }

    protected final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw q();
        }
    }

    public byte[] d() {
        a(this.f15796f);
        byte[] bArrA = this.f15794d.a(3);
        this.f15796f = bArrA;
        return bArrA;
    }

    public char[] e() {
        a(this.f15798h);
        char[] cArrC = this.f15794d.c(1);
        this.f15798h = cArrC;
        return cArrC;
    }

    public char[] f(int i10) {
        a(this.f15799i);
        char[] cArrD = this.f15794d.d(3, i10);
        this.f15799i = cArrD;
        return cArrD;
    }

    public char[] g() {
        a(this.f15797g);
        char[] cArrC = this.f15794d.c(0);
        this.f15797g = cArrC;
        return cArrC;
    }

    public char[] h(int i10) {
        a(this.f15797g);
        char[] cArrD = this.f15794d.d(0, i10);
        this.f15797g = cArrD;
        return cArrD;
    }

    public p i() {
        return new m(this.f15795e, this.f15794d);
    }

    public e j() {
        return this.f15791a;
    }

    public boolean k() {
        return this.f15793c;
    }

    public void l(byte[] bArr) {
        if (bArr != null) {
            b(bArr, this.f15796f);
            this.f15796f = null;
            this.f15794d.i(3, bArr);
        }
    }

    public void m(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f15798h);
            this.f15798h = null;
            this.f15794d.j(1, cArr);
        }
    }

    public void n(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f15799i);
            this.f15799i = null;
            this.f15794d.j(3, cArr);
        }
    }

    public void o(char[] cArr) {
        if (cArr != null) {
            c(cArr, this.f15797g);
            this.f15797g = null;
            this.f15794d.j(0, cArr);
        }
    }

    public r p() {
        return this.f15795e;
    }
}
