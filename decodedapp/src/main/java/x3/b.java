package x3;

import hi.d;
import hi.h;
import ii.c;
import ii.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f31602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f31603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f31605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f31608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f f31609h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ii.a f31610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f31611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f31612t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f31613u;

    public b(OutputStream outputStream, int i10, int i11) {
        this(outputStream, new c(), new f());
        this.f31608g.f(i10);
        this.f31608g.g(i11);
        this.f31609h.k("");
    }

    public void a(ii.a aVar) {
        boolean z10;
        if (!this.f31607f) {
            c();
        }
        int i10 = this.f31611s + 1;
        this.f31611s = i10;
        int i11 = this.f31606e;
        if (i11 == -1) {
            if (aVar.d() >= 0 && this.f31605d != aVar.d()) {
                this.f31603b.flush();
                long jD = aVar.d();
                this.f31605d = jD;
                this.f31603b.q(jD);
                this.f31613u = true;
            }
            z10 = false;
        } else {
            z10 = i10 >= i11;
            int iG = this.f31612t + aVar.g();
            this.f31612t = iG;
            aVar.e(this.f31605d + ((long) iG));
            this.f31610r = aVar;
        }
        this.f31603b.a(aVar.c());
        if (z10 || this.f31603b.n() > 16384) {
            long jD2 = aVar.d();
            this.f31605d = jD2;
            this.f31603b.q(jD2);
            this.f31603b.flush();
            this.f31613u = true;
        }
        if (this.f31613u) {
            this.f31613u = false;
            this.f31611s = 0;
            this.f31612t = 0;
        }
    }

    public void c() {
        if (this.f31607f) {
            throw new IllegalStateException("文件头只能写一次");
        }
        this.f31603b.e(this.f31608g.c(), true);
        this.f31603b.e(this.f31609h.c(), false);
        this.f31607f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f31603b != null) {
            ii.a aVar = this.f31610r;
            if (aVar != null) {
                long jD = aVar.d();
                this.f31605d = jD;
                this.f31610r = null;
                this.f31603b.q(jD);
            }
            this.f31603b.close();
            this.f31603b = null;
            this.f31602a.close();
            this.f31602a = null;
        }
    }

    public b(OutputStream outputStream, c cVar, f fVar) {
        this(outputStream, -1, cVar, fVar);
    }

    public b(OutputStream outputStream, int i10, c cVar, f fVar) {
        this.f31604c = -1;
        this.f31605d = 0L;
        this.f31606e = 50;
        this.f31611s = 0;
        this.f31612t = 0;
        this.f31613u = false;
        d dVar = new d(outputStream);
        this.f31602a = dVar;
        if (i10 > 0) {
            this.f31603b = dVar.e(i10);
            this.f31604c = i10;
        } else {
            h hVarC = dVar.c();
            this.f31603b = hVarC;
            this.f31604c = hVarC.l();
        }
        this.f31608g = cVar;
        this.f31609h = fVar;
    }
}
