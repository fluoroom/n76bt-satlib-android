package om.sstvencoder;

import android.graphics.Bitmap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a */
    private final d f23796a;

    /* JADX INFO: renamed from: b */
    private final Thread f23797b;

    /* JADX INFO: renamed from: c */
    private Thread f23798c;

    /* JADX INFO: renamed from: e */
    private final e f23800e;

    /* JADX INFO: renamed from: f */
    private final e f23801f;

    /* JADX INFO: renamed from: d */
    private final List f23799d = new LinkedList();

    /* JADX INFO: renamed from: g */
    private boolean f23802g = false;

    /* JADX INFO: renamed from: h */
    private boolean f23803h = false;

    /* JADX INFO: renamed from: i */
    private Class f23804i = om.sstvencoder.Modes.b.b();

    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            yh.a aVar;
            while (true) {
                synchronized (this) {
                    while (b.this.f23799d.isEmpty() && !b.this.f23802g) {
                        try {
                            wait();
                        } catch (Exception unused) {
                        }
                    }
                    if (b.this.f23802g) {
                        return;
                    }
                    b.this.f23803h = false;
                    aVar = (yh.a) b.this.f23799d.remove(0);
                }
                aVar.b();
                b.this.f23800e.c(aVar.c(), b.this.f23796a.c(xh.e.f32199s, new Object[0]));
                while (aVar.a()) {
                    b.this.f23800e.g();
                    synchronized (this) {
                        try {
                            if (!b.this.f23802g && !b.this.f23803h) {
                            }
                        } finally {
                        }
                    }
                }
                aVar.k(b.this.f23803h);
                b.this.f23800e.d();
            }
        }
    }

    /* JADX INFO: renamed from: om.sstvencoder.b$b */
    class C0326b extends Thread {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ yh.a f23806a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ai.d f23807b;

        C0326b(yh.a aVar, ai.d dVar) {
            this.f23806a = aVar;
            this.f23807b = dVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f23806a.b();
            b.this.f23801f.c(this.f23806a.c(), b.this.f23796a.c(xh.e.f32198r, this.f23807b.c()));
            while (true) {
                if (!this.f23806a.a()) {
                    break;
                }
                b.this.f23801f.g();
                synchronized (this) {
                    try {
                        if (b.this.f23802g) {
                            break;
                        }
                    } finally {
                    }
                }
            }
            this.f23806a.k(b.this.f23802g);
            b.this.f23801f.d();
            if (b.this.f23802g) {
                return;
            }
            b.this.f23796a.b(this.f23807b);
        }
    }

    b(d dVar, e eVar, e eVar2) {
        this.f23796a = dVar;
        this.f23800e = eVar;
        this.f23801f = eVar2;
        a aVar = new a();
        this.f23797b = aVar;
        aVar.start();
    }

    private void i(yh.a aVar) {
        synchronized (this.f23797b) {
            this.f23799d.add(aVar);
            this.f23797b.notify();
        }
    }

    private void n(yh.a aVar, ai.d dVar) {
        C0326b c0326b = new C0326b(aVar, dVar);
        this.f23798c = c0326b;
        c0326b.start();
    }

    void h() {
        synchronized (this.f23797b) {
            this.f23802g = true;
            this.f23797b.notify();
        }
    }

    yh.b j() {
        return om.sstvencoder.Modes.b.d(this.f23804i);
    }

    public yh.b[] k() {
        return om.sstvencoder.Modes.b.e();
    }

    public void l(Bitmap bitmap, ai.a aVar) {
        yh.a aVarA = om.sstvencoder.Modes.b.a(this.f23804i, bitmap, aVar);
        if (aVarA != null) {
            i(aVarA);
        }
    }

    void m(Bitmap bitmap, ai.d dVar) {
        Thread thread = this.f23798c;
        if (thread == null || !thread.isAlive()) {
            yh.a aVarA = om.sstvencoder.Modes.b.a(this.f23804i, bitmap, ai.b.a(dVar));
            if (aVarA != null) {
                n(aVarA, dVar);
            }
        }
    }

    boolean o(String str) {
        try {
            this.f23804i = Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    void p() {
        synchronized (this.f23797b) {
            try {
                this.f23803h = true;
                int size = this.f23799d.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((yh.a) this.f23799d.remove(0)).k(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
