package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f17258a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile qb.q f17259b = qb.q.IDLE;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f17260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f17261b;

        a(Runnable runnable, Executor executor) {
            this.f17260a = runnable;
            this.f17261b = executor;
        }

        void a() {
            this.f17261b.execute(this.f17260a);
        }
    }

    y() {
    }

    qb.q a() {
        qb.q qVar = this.f17259b;
        if (qVar != null) {
            return qVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    void b(qb.q qVar) {
        r9.l.o(qVar, "newState");
        if (this.f17259b == qVar || this.f17259b == qb.q.SHUTDOWN) {
            return;
        }
        this.f17259b = qVar;
        if (this.f17258a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f17258a;
        this.f17258a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    void c(Runnable runnable, Executor executor, qb.q qVar) {
        r9.l.o(runnable, "callback");
        r9.l.o(executor, "executor");
        r9.l.o(qVar, "source");
        a aVar = new a(runnable, executor);
        if (this.f17259b != qVar) {
            aVar.a();
        } else {
            this.f17258a.add(aVar);
        }
    }
}
