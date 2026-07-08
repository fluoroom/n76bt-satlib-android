package hh;

import java.io.EOFException;
import java.io.IOException;
import qd.l;
import vh.l0;
import vh.m;

/* JADX INFO: loaded from: classes3.dex */
public class h extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f15422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15423c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l0 l0Var, l lVar) {
        super(l0Var);
        rd.m.e(l0Var, "delegate");
        rd.m.e(lVar, "onException");
        this.f15422b = lVar;
    }

    @Override // vh.m, vh.l0
    public void C(vh.e eVar, long j10) throws EOFException {
        rd.m.e(eVar, "source");
        if (this.f15423c) {
            eVar.skip(j10);
            return;
        }
        try {
            super.C(eVar, j10);
        } catch (IOException e10) {
            this.f15423c = true;
            this.f15422b.l(e10);
        }
    }

    @Override // vh.m, vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f15423c = true;
            this.f15422b.l(e10);
        }
    }

    @Override // vh.m, vh.l0, java.io.Flushable
    public void flush() {
        if (this.f15423c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f15423c = true;
            this.f15422b.l(e10);
        }
    }
}
