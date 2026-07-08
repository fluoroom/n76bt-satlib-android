package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import x2.b;
import x2.p;
import x2.q;
import x2.s;

/* JADX INFO: loaded from: classes.dex */
public class m implements ComponentCallbacks2, x2.l {

    /* JADX INFO: renamed from: v */
    private static final a3.f f5206v = (a3.f) a3.f.l0(Bitmap.class).Q();

    /* JADX INFO: renamed from: w */
    private static final a3.f f5207w = (a3.f) a3.f.l0(v2.c.class).Q();

    /* JADX INFO: renamed from: x */
    private static final a3.f f5208x = (a3.f) ((a3.f) a3.f.m0(k2.j.f19027c).Y(h.LOW)).f0(true);

    /* JADX INFO: renamed from: a */
    protected final c f5209a;

    /* JADX INFO: renamed from: b */
    protected final Context f5210b;

    /* JADX INFO: renamed from: c */
    final x2.j f5211c;

    /* JADX INFO: renamed from: d */
    private final q f5212d;

    /* JADX INFO: renamed from: e */
    private final p f5213e;

    /* JADX INFO: renamed from: f */
    private final s f5214f;

    /* JADX INFO: renamed from: g */
    private final Runnable f5215g;

    /* JADX INFO: renamed from: h */
    private final x2.b f5216h;

    /* JADX INFO: renamed from: r */
    private final CopyOnWriteArrayList f5217r;

    /* JADX INFO: renamed from: s */
    private a3.f f5218s;

    /* JADX INFO: renamed from: t */
    private boolean f5219t;

    /* JADX INFO: renamed from: u */
    private boolean f5220u;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = m.this;
            mVar.f5211c.b(mVar);
        }
    }

    private class b implements b.a {

        /* JADX INFO: renamed from: a */
        private final q f5222a;

        b(q qVar) {
            this.f5222a = qVar;
        }

        @Override // x2.b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (m.this) {
                    this.f5222a.e();
                }
            }
        }
    }

    public m(c cVar, x2.j jVar, p pVar, Context context) {
        this(cVar, jVar, pVar, new q(), cVar.g(), context);
    }

    private void B(b3.h hVar) {
        boolean zA = A(hVar);
        a3.c cVarJ = hVar.j();
        if (zA || this.f5209a.p(hVar) || cVarJ == null) {
            return;
        }
        hVar.c(null);
        cVarJ.clear();
    }

    private synchronized void p() {
        try {
            Iterator it = this.f5214f.m().iterator();
            while (it.hasNext()) {
                o((b3.h) it.next());
            }
            this.f5214f.l();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized boolean A(b3.h hVar) {
        a3.c cVarJ = hVar.j();
        if (cVarJ == null) {
            return true;
        }
        if (!this.f5212d.a(cVarJ)) {
            return false;
        }
        this.f5214f.o(hVar);
        hVar.c(null);
        return true;
    }

    @Override // x2.l
    public synchronized void b() {
        x();
        this.f5214f.b();
    }

    @Override // x2.l
    public synchronized void f() {
        this.f5214f.f();
        p();
        this.f5212d.b();
        this.f5211c.a(this);
        this.f5211c.a(this.f5216h);
        e3.l.w(this.f5215g);
        this.f5209a.s(this);
    }

    @Override // x2.l
    public synchronized void g() {
        try {
            this.f5214f.g();
            if (this.f5220u) {
                p();
            } else {
                w();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public l l(Class cls) {
        return new l(this.f5209a, this, cls, this.f5210b);
    }

    public l m() {
        return l(Bitmap.class).a(f5206v);
    }

    public l n() {
        return l(Drawable.class);
    }

    public void o(b3.h hVar) {
        if (hVar == null) {
            return;
        }
        B(hVar);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f5219t) {
            v();
        }
    }

    List q() {
        return this.f5217r;
    }

    synchronized a3.f r() {
        return this.f5218s;
    }

    n s(Class cls) {
        return this.f5209a.i().e(cls);
    }

    public l t(File file) {
        return n().y0(file);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f5212d + ", treeNode=" + this.f5213e + "}";
    }

    public synchronized void u() {
        this.f5212d.c();
    }

    public synchronized void v() {
        u();
        Iterator it = this.f5213e.a().iterator();
        while (it.hasNext()) {
            ((m) it.next()).u();
        }
    }

    public synchronized void w() {
        this.f5212d.d();
    }

    public synchronized void x() {
        this.f5212d.f();
    }

    protected synchronized void y(a3.f fVar) {
        this.f5218s = (a3.f) ((a3.f) fVar.clone()).b();
    }

    synchronized void z(b3.h hVar, a3.c cVar) {
        this.f5214f.n(hVar);
        this.f5212d.g(cVar);
    }

    m(c cVar, x2.j jVar, p pVar, q qVar, x2.c cVar2, Context context) {
        this.f5214f = new s();
        a aVar = new a();
        this.f5215g = aVar;
        this.f5209a = cVar;
        this.f5211c = jVar;
        this.f5213e = pVar;
        this.f5212d = qVar;
        this.f5210b = context;
        x2.b bVarA = cVar2.a(context.getApplicationContext(), new b(qVar));
        this.f5216h = bVarA;
        cVar.o(this);
        if (e3.l.q()) {
            e3.l.v(aVar);
        } else {
            jVar.b(this);
        }
        jVar.b(bVarA);
        this.f5217r = new CopyOnWriteArrayList(cVar.i().c());
        y(cVar.i().d());
    }
}
