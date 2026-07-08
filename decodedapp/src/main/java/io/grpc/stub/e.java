package io.grpc.stub;

import io.grpc.stub.h;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import qb.g;
import qb.u1;
import qb.z0;
import r9.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: e */
    private static final Logger f17275e = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: b */
    private final qb.g f17277b;

    /* JADX INFO: renamed from: c */
    private final h.g f17278c;

    /* JADX INFO: renamed from: d */
    private AtomicReference f17279d = new AtomicReference();

    /* JADX INFO: renamed from: a */
    private final BlockingQueue f17276a = new ArrayBlockingQueue(1);

    private static final class b {

        /* JADX INFO: renamed from: a */
        final u1 f17280a;

        /* JADX INFO: renamed from: b */
        final z0 f17281b;

        b(u1 u1Var, z0 z0Var) {
            this.f17280a = (u1) l.o(u1Var, "status");
            this.f17281b = z0Var;
        }
    }

    private final class c extends g.a {
        private c() {
        }

        @Override // qb.g.a
        public void a(u1 u1Var, z0 z0Var) {
            l.u(androidx.lifecycle.b.a(e.this.f17279d, null, new b(u1Var, z0Var)), "ClientCall already closed");
        }

        @Override // qb.g.a
        public void c(Object obj) {
            l.u(e.this.f17279d.get() == null, "ClientCall already closed");
            e.this.f17276a.add(obj);
        }

        /* synthetic */ c(e eVar, a aVar) {
            this();
        }
    }

    e(qb.g gVar, h.g gVar2) {
        this.f17277b = gVar;
        this.f17278c = gVar2;
    }

    g.a c() {
        return new c();
    }
}
