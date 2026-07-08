package v2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.l;
import com.bumptech.glide.m;
import e3.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a */
    private final h2.a f29507a;

    /* JADX INFO: renamed from: b */
    private final Handler f29508b;

    /* JADX INFO: renamed from: c */
    private final List f29509c;

    /* JADX INFO: renamed from: d */
    final m f29510d;

    /* JADX INFO: renamed from: e */
    private final l2.d f29511e;

    /* JADX INFO: renamed from: f */
    private boolean f29512f;

    /* JADX INFO: renamed from: g */
    private boolean f29513g;

    /* JADX INFO: renamed from: h */
    private boolean f29514h;

    /* JADX INFO: renamed from: i */
    private l f29515i;

    /* JADX INFO: renamed from: j */
    private a f29516j;

    /* JADX INFO: renamed from: k */
    private boolean f29517k;

    /* JADX INFO: renamed from: l */
    private a f29518l;

    /* JADX INFO: renamed from: m */
    private Bitmap f29519m;

    /* JADX INFO: renamed from: n */
    private i2.l f29520n;

    /* JADX INFO: renamed from: o */
    private a f29521o;

    /* JADX INFO: renamed from: p */
    private int f29522p;

    /* JADX INFO: renamed from: q */
    private int f29523q;

    /* JADX INFO: renamed from: r */
    private int f29524r;

    static class a extends b3.c {

        /* JADX INFO: renamed from: d */
        private final Handler f29525d;

        /* JADX INFO: renamed from: e */
        final int f29526e;

        /* JADX INFO: renamed from: f */
        private final long f29527f;

        /* JADX INFO: renamed from: g */
        private Bitmap f29528g;

        a(Handler handler, int i10, long j10) {
            this.f29525d = handler;
            this.f29526e = i10;
            this.f29527f = j10;
        }

        @Override // b3.h
        public void k(Drawable drawable) {
            this.f29528g = null;
        }

        Bitmap l() {
            return this.f29528g;
        }

        @Override // b3.h
        /* JADX INFO: renamed from: m */
        public void a(Bitmap bitmap, c3.b bVar) {
            this.f29528g = bitmap;
            this.f29525d.sendMessageAtTime(this.f29525d.obtainMessage(1, this), this.f29527f);
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f29510d.o((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.c cVar, h2.a aVar, int i10, int i11, i2.l lVar, Bitmap bitmap) {
        this(cVar.f(), com.bumptech.glide.c.t(cVar.h()), aVar, null, i(com.bumptech.glide.c.t(cVar.h()), i10, i11), lVar, bitmap);
    }

    private static i2.f g() {
        return new d3.b(Double.valueOf(Math.random()));
    }

    private static l i(m mVar, int i10, int i11) {
        return mVar.m().a(((a3.f) ((a3.f) a3.f.m0(k2.j.f19026b).k0(true)).f0(true)).X(i10, i11));
    }

    private void l() {
        if (!this.f29512f || this.f29513g) {
            return;
        }
        if (this.f29514h) {
            k.b(this.f29521o == null, "Pending target must be null when starting from the first frame");
            this.f29507a.f();
            this.f29514h = false;
        }
        a aVar = this.f29521o;
        if (aVar != null) {
            this.f29521o = null;
            m(aVar);
            return;
        }
        this.f29513g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f29507a.d());
        this.f29507a.b();
        this.f29518l = new a(this.f29508b, this.f29507a.g(), jUptimeMillis);
        this.f29515i.a(a3.f.n0(g())).z0(this.f29507a).t0(this.f29518l);
    }

    private void n() {
        Bitmap bitmap = this.f29519m;
        if (bitmap != null) {
            this.f29511e.c(bitmap);
            this.f29519m = null;
        }
    }

    private void p() {
        if (this.f29512f) {
            return;
        }
        this.f29512f = true;
        this.f29517k = false;
        l();
    }

    private void q() {
        this.f29512f = false;
    }

    void a() {
        this.f29509c.clear();
        n();
        q();
        a aVar = this.f29516j;
        if (aVar != null) {
            this.f29510d.o(aVar);
            this.f29516j = null;
        }
        a aVar2 = this.f29518l;
        if (aVar2 != null) {
            this.f29510d.o(aVar2);
            this.f29518l = null;
        }
        a aVar3 = this.f29521o;
        if (aVar3 != null) {
            this.f29510d.o(aVar3);
            this.f29521o = null;
        }
        this.f29507a.clear();
        this.f29517k = true;
    }

    ByteBuffer b() {
        return this.f29507a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f29516j;
        return aVar != null ? aVar.l() : this.f29519m;
    }

    int d() {
        a aVar = this.f29516j;
        if (aVar != null) {
            return aVar.f29526e;
        }
        return -1;
    }

    Bitmap e() {
        return this.f29519m;
    }

    int f() {
        return this.f29507a.c();
    }

    int h() {
        return this.f29524r;
    }

    int j() {
        return this.f29507a.h() + this.f29522p;
    }

    int k() {
        return this.f29523q;
    }

    void m(a aVar) {
        this.f29513g = false;
        if (this.f29517k) {
            this.f29508b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f29512f) {
            if (this.f29514h) {
                this.f29508b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f29521o = aVar;
                return;
            }
        }
        if (aVar.l() != null) {
            n();
            a aVar2 = this.f29516j;
            this.f29516j = aVar;
            for (int size = this.f29509c.size() - 1; size >= 0; size--) {
                ((b) this.f29509c.get(size)).a();
            }
            if (aVar2 != null) {
                this.f29508b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(i2.l lVar, Bitmap bitmap) {
        this.f29520n = (i2.l) k.e(lVar);
        this.f29519m = (Bitmap) k.e(bitmap);
        this.f29515i = this.f29515i.a(new a3.f().g0(lVar));
        this.f29522p = e3.l.h(bitmap);
        this.f29523q = bitmap.getWidth();
        this.f29524r = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f29517k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f29509c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f29509c.isEmpty();
        this.f29509c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f29509c.remove(bVar);
        if (this.f29509c.isEmpty()) {
            q();
        }
    }

    g(l2.d dVar, m mVar, h2.a aVar, Handler handler, l lVar, i2.l lVar2, Bitmap bitmap) {
        this.f29509c = new ArrayList();
        this.f29510d = mVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f29511e = dVar;
        this.f29508b = handler;
        this.f29515i = lVar;
        this.f29507a = aVar;
        o(lVar2, bitmap);
    }
}
