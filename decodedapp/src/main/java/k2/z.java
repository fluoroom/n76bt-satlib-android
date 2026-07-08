package k2;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import k2.f;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
class z implements f, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f19137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.a f19138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f19139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f19140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f19141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile n.a f19142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile d f19143g;

    class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f19144a;

        a(n.a aVar) {
            this.f19144a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (z.this.g(this.f19144a)) {
                z.this.i(this.f19144a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (z.this.g(this.f19144a)) {
                z.this.h(this.f19144a, obj);
            }
        }
    }

    z(g gVar, f.a aVar) {
        this.f19137a = gVar;
        this.f19138b = aVar;
    }

    private boolean c(Object obj) throws Throwable {
        Throwable th2;
        long jB = e3.g.b();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e eVarO = this.f19137a.o(obj);
            Object objA = eVarO.a();
            i2.d dVarQ = this.f19137a.q(objA);
            e eVar = new e(dVarQ, objA, this.f19137a.k());
            d dVar = new d(this.f19142f.f23122a, this.f19137a.p());
            m2.a aVarD = this.f19137a.d();
            aVarD.b(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + dVarQ + ", duration: " + e3.g.a(jB));
            }
            if (aVarD.a(dVar) != null) {
                this.f19143g = dVar;
                this.f19140d = new c(Collections.singletonList(this.f19142f.f23122a), this.f19137a, this);
                this.f19142f.f23124c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f19143g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f19138b.a(this.f19142f.f23122a, eVarO.a(), this.f19142f.f23124c, this.f19142f.f23124c.d(), this.f19142f.f23122a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z10 = true;
                if (z10) {
                    throw th2;
                }
                this.f19142f.f23124c.b();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private boolean f() {
        return this.f19139c < this.f19137a.g().size();
    }

    private void j(n.a aVar) {
        this.f19142f.f23124c.e(this.f19137a.l(), new a(aVar));
    }

    @Override // k2.f.a
    public void a(i2.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, i2.a aVar, i2.f fVar2) {
        this.f19138b.a(fVar, obj, dVar, this.f19142f.f23124c.d(), fVar);
    }

    @Override // k2.f
    public boolean b() {
        if (this.f19141e != null) {
            Object obj = this.f19141e;
            this.f19141e = null;
            try {
                if (!c(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f19140d != null && this.f19140d.b()) {
            return true;
        }
        this.f19140d = null;
        this.f19142f = null;
        boolean z10 = false;
        while (!z10 && f()) {
            List listG = this.f19137a.g();
            int i10 = this.f19139c;
            this.f19139c = i10 + 1;
            this.f19142f = (n.a) listG.get(i10);
            if (this.f19142f != null && (this.f19137a.e().c(this.f19142f.f23124c.d()) || this.f19137a.u(this.f19142f.f23124c.a()))) {
                j(this.f19142f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // k2.f
    public void cancel() {
        n.a aVar = this.f19142f;
        if (aVar != null) {
            aVar.f23124c.cancel();
        }
    }

    @Override // k2.f.a
    public void d(i2.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, i2.a aVar) {
        this.f19138b.d(fVar, exc, dVar, this.f19142f.f23124c.d());
    }

    @Override // k2.f.a
    public void e() {
        throw new UnsupportedOperationException();
    }

    boolean g(n.a aVar) {
        n.a aVar2 = this.f19142f;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(n.a aVar, Object obj) {
        j jVarE = this.f19137a.e();
        if (obj != null && jVarE.c(aVar.f23124c.d())) {
            this.f19141e = obj;
            this.f19138b.e();
        } else {
            f.a aVar2 = this.f19138b;
            i2.f fVar = aVar.f23122a;
            com.bumptech.glide.load.data.d dVar = aVar.f23124c;
            aVar2.a(fVar, obj, dVar, dVar.d(), this.f19143g);
        }
    }

    void i(n.a aVar, Exception exc) {
        f.a aVar2 = this.f19138b;
        d dVar = this.f19143g;
        com.bumptech.glide.load.data.d dVar2 = aVar.f23124c;
        aVar2.d(dVar, exc, dVar2, dVar2.d());
    }
}
