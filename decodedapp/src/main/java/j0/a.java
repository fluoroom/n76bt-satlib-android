package j0;

import android.graphics.Typeface;
import j0.i;
import j0.j;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j.c f18326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f18327b;

    /* JADX INFO: renamed from: j0.a$a, reason: collision with other inner class name */
    class RunnableC0233a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j.c f18328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f18329b;

        RunnableC0233a(j.c cVar, Typeface typeface) {
            this.f18328a = cVar;
            this.f18329b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18328a.b(this.f18329b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j.c f18331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18332b;

        b(j.c cVar, int i10) {
            this.f18331a = cVar;
            this.f18332b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18331a.a(this.f18332b);
        }
    }

    a(j.c cVar, Executor executor) {
        this.f18326a = cVar;
        this.f18327b = executor;
    }

    private void a(int i10) {
        this.f18327b.execute(new b(this.f18326a, i10));
    }

    private void c(Typeface typeface) {
        this.f18327b.execute(new RunnableC0233a(this.f18326a, typeface));
    }

    void b(i.e eVar) {
        if (eVar.a()) {
            c(eVar.f18363a);
        } else {
            a(eVar.f18364b);
        }
    }
}
