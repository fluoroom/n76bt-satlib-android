package io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public interface u extends Closeable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f17151a = "unknown-authority";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private qb.a f17152b = qb.a.f24506c;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f17153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qb.c0 f17154d;

        public String a() {
            return this.f17151a;
        }

        public qb.a b() {
            return this.f17152b;
        }

        public qb.c0 c() {
            return this.f17154d;
        }

        public String d() {
            return this.f17153c;
        }

        public a e(String str) {
            this.f17151a = (String) r9.l.o(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17151a.equals(aVar.f17151a) && this.f17152b.equals(aVar.f17152b) && r9.h.a(this.f17153c, aVar.f17153c) && r9.h.a(this.f17154d, aVar.f17154d);
        }

        public a f(qb.a aVar) {
            r9.l.o(aVar, "eagAttributes");
            this.f17152b = aVar;
            return this;
        }

        public a g(qb.c0 c0Var) {
            this.f17154d = c0Var;
            return this;
        }

        public a h(String str) {
            this.f17153c = str;
            return this;
        }

        public int hashCode() {
            return r9.h.b(this.f17151a, this.f17152b, this.f17153c, this.f17154d);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ScheduledExecutorService e0();

    x g0(SocketAddress socketAddress, a aVar, qb.f fVar);

    Collection r0();
}
