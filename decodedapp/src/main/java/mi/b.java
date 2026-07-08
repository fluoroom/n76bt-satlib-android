package mi;

import com.facebook.stetho.websocket.CloseCodes;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
final class b implements Runnable, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f22278a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f22279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f22280c;

    b(c cVar) {
        this.f22279b = cVar;
    }

    @Override // mi.l
    public void a(q qVar, Object obj) {
        j jVarA = j.a(qVar, obj);
        synchronized (this) {
            try {
                this.f22278a.a(jVarA);
                if (!this.f22280c) {
                    this.f22280c = true;
                    this.f22279b.f().execute(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVarC;
        while (true) {
            try {
                try {
                    jVarC = this.f22278a.c(CloseCodes.NORMAL_CLOSURE);
                } catch (InterruptedException e10) {
                    this.f22279b.g().b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e10);
                    this.f22280c = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f22280c = false;
                throw th2;
            }
            if (jVarC == null) {
                synchronized (this) {
                    jVarC = this.f22278a.b();
                    if (jVarC == null) {
                        this.f22280c = false;
                        this.f22280c = false;
                        return;
                    }
                    this.f22280c = false;
                    throw th2;
                }
            }
            this.f22279b.i(jVarC);
        }
    }
}
