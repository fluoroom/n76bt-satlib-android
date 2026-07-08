package vh;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
final class d implements l0 {
    @Override // vh.l0
    public void C(e eVar, long j10) throws EOFException {
        rd.m.e(eVar, "source");
        eVar.skip(j10);
    }

    @Override // vh.l0
    public o0 i() {
        return o0.f30840e;
    }

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // vh.l0, java.io.Flushable
    public void flush() {
    }
}
