package t8;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f27629a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f27630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27631c;

    s() {
    }

    public final void a(r rVar) {
        synchronized (this.f27629a) {
            try {
                if (this.f27630b == null) {
                    this.f27630b = new ArrayDeque();
                }
                this.f27630b.add(rVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(g gVar) {
        r rVar;
        synchronized (this.f27629a) {
            if (this.f27630b != null && !this.f27631c) {
                this.f27631c = true;
                while (true) {
                    synchronized (this.f27629a) {
                        try {
                            rVar = (r) this.f27630b.poll();
                            if (rVar == null) {
                                this.f27631c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    rVar.a(gVar);
                }
            }
        }
    }
}
