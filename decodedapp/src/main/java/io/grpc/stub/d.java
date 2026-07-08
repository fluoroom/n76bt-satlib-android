package io.grpc.stub;

import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import qb.c;
import qb.n0;
import qb.u;
import r9.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    private final qb.c callOptions;
    private final qb.d channel;

    public interface a {
        d newStub(qb.d dVar, qb.c cVar);
    }

    protected d(qb.d dVar, qb.c cVar) {
        this.channel = (qb.d) l.o(dVar, "channel");
        this.callOptions = (qb.c) l.o(cVar, "callOptions");
    }

    protected abstract d build(qb.d dVar, qb.c cVar);

    public final qb.c getCallOptions() {
        return this.callOptions;
    }

    public final qb.d getChannel() {
        return this.channel;
    }

    public final d withCallCredentials(qb.b bVar) {
        return build(this.channel, this.callOptions.n(bVar));
    }

    @Deprecated
    public final d withChannel(qb.d dVar) {
        return build(dVar, this.callOptions);
    }

    public final d withCompression(String str) {
        return build(this.channel, this.callOptions.o(str));
    }

    public final d withDeadline(u uVar) {
        return build(this.channel, this.callOptions.p(uVar));
    }

    public final d withDeadlineAfter(long j10, TimeUnit timeUnit) {
        return build(this.channel, this.callOptions.q(j10, timeUnit));
    }

    public final d withExecutor(Executor executor) {
        return build(this.channel, this.callOptions.r(executor));
    }

    public final d withInterceptors(qb.h... hVarArr) {
        return build(qb.j.b(this.channel, hVarArr), this.callOptions);
    }

    public final d withMaxInboundMessageSize(int i10) {
        return build(this.channel, this.callOptions.s(i10));
    }

    public final d withMaxOutboundMessageSize(int i10) {
        return build(this.channel, this.callOptions.t(i10));
    }

    public final d withOnReadyThreshold(int i10) {
        return build(this.channel, this.callOptions.u(i10));
    }

    public final <T> d withOption(c.C0338c c0338c, T t10) {
        return build(this.channel, this.callOptions.v(c0338c, t10));
    }

    public final d withWaitForReady() {
        return build(this.channel, this.callOptions.x());
    }

    public final d withDeadlineAfter(Duration duration) {
        return withDeadlineAfter(n0.a(duration), TimeUnit.NANOSECONDS);
    }
}
