package ug;

import android.os.Handler;
import android.os.Looper;
import hd.i;
import java.util.concurrent.CancellationException;
import rd.h;
import rd.m;
import tg.i1;
import tg.k0;
import tg.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d implements k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f29148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f29151f;

    private c(Handler handler, String str, boolean z10) {
        super(null);
        this.f29148c = handler;
        this.f29149d = str;
        this.f29150e = z10;
        this.f29151f = z10 ? this : new c(handler, str, true);
    }

    private final void x0(i iVar, Runnable runnable) {
        i1.c(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        p0.b().G(iVar, runnable);
    }

    @Override // tg.a0
    public void G(i iVar, Runnable runnable) {
        if (this.f29148c.post(runnable)) {
            return;
        }
        x0(iVar, runnable);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f29148c == this.f29148c && cVar.f29150e == this.f29150e;
    }

    public int hashCode() {
        return System.identityHashCode(this.f29148c) ^ (this.f29150e ? 1231 : 1237);
    }

    @Override // tg.a0
    public boolean p0(i iVar) {
        return (this.f29150e && m.a(Looper.myLooper(), this.f29148c.getLooper())) ? false : true;
    }

    @Override // tg.a0
    public String toString() {
        String strW0 = w0();
        if (strW0 != null) {
            return strW0;
        }
        String string = this.f29149d;
        if (string == null) {
            string = this.f29148c.toString();
        }
        if (!this.f29150e) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // tg.o1
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public c v0() {
        return this.f29151f;
    }

    public /* synthetic */ c(Handler handler, String str, int i10, h hVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public c(Handler handler, String str) {
        this(handler, str, false);
    }
}
