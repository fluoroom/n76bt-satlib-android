package fh;

import eh.b0;
import eh.i0;
import vh.n0;
import vh.o0;
import vh.z;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f13100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13101b;

    public g(b0 b0Var, long j10) {
        this.f13100a = b0Var;
        this.f13101b = j10;
    }

    @Override // vh.n0
    public long N(vh.e eVar, long j10) {
        rd.m.e(eVar, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // eh.i0
    public long contentLength() {
        return this.f13101b;
    }

    @Override // eh.i0
    public b0 contentType() {
        return this.f13100a;
    }

    @Override // vh.n0
    public o0 i() {
        return o0.f30840e;
    }

    @Override // eh.i0
    public vh.g source() {
        return z.c(this);
    }

    @Override // eh.i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
