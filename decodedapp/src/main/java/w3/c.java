package w3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected c f31080b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f31079a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected d f31081c = d.PCM_16BIT;

    public c(c cVar) {
        this.f31080b = cVar;
    }

    public int a() {
        c cVar = this.f31080b;
        if (cVar != null) {
            return cVar.a();
        }
        return -1;
    }

    public int b(int i10) {
        c cVar = this.f31080b;
        if (cVar != null) {
            return cVar.b(i10);
        }
        return 0;
    }

    public int c(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    public int d(float[] fArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    public int e(short[] sArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    public int f(int i10) {
        c cVar = this.f31080b;
        if (cVar != null) {
            return cVar.f(i10);
        }
        return -1;
    }
}
