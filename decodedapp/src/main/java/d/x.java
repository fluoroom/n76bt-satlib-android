package d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f10500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qd.a f10501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f10506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f10507h;

    public x(Executor executor, qd.a aVar) {
        rd.m.e(executor, "executor");
        rd.m.e(aVar, "reportFullyDrawn");
        this.f10500a = executor;
        this.f10501b = aVar;
        this.f10502c = new Object();
        this.f10506g = new ArrayList();
        this.f10507h = new Runnable() { // from class: d.w
            @Override // java.lang.Runnable
            public final void run() {
                x.d(this.f10499a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(x xVar) {
        synchronized (xVar.f10502c) {
            try {
                xVar.f10504e = false;
                if (xVar.f10503d == 0 && !xVar.f10505f) {
                    xVar.f10501b.a();
                    xVar.b();
                }
                dd.d0 d0Var = dd.d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f10502c) {
            try {
                this.f10505f = true;
                Iterator it = this.f10506g.iterator();
                while (it.hasNext()) {
                    ((qd.a) it.next()).a();
                }
                this.f10506g.clear();
                dd.d0 d0Var = dd.d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f10502c) {
            z10 = this.f10505f;
        }
        return z10;
    }
}
