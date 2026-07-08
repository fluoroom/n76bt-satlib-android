package g4;

import android.content.Context;
import android.net.Uri;
import g1.c;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends g1.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c.a f13505o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Closeable f13506p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f13507q;

    public a(Context context) {
        super(context);
        this.f13505o = new c.a();
    }

    private static void K(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    private void O() {
        try {
            i().getContentResolver().unregisterContentObserver(this.f13505o);
        } catch (SecurityException unused) {
        }
    }

    @Override // g1.c
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void f(Closeable closeable) {
        if (l()) {
            K(closeable);
            return;
        }
        Closeable closeable2 = this.f13506p;
        this.f13506p = closeable;
        if (m()) {
            super.f(closeable);
        }
        if (closeable2 != closeable) {
            K(closeable2);
        }
    }

    @Override // g1.a
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void I(Closeable closeable) {
        K(closeable);
    }

    protected void N(Uri uri) {
        try {
            i().getContentResolver().registerContentObserver(uri, true, this.f13505o);
        } catch (SecurityException unused) {
        }
    }

    @Override // g1.a, g1.c
    protected void q() {
        if (this.f13507q > 0) {
            return;
        }
        super.q();
    }

    @Override // g1.c
    protected void r() {
        super.r();
        t();
        K(this.f13506p);
        this.f13506p = null;
        O();
    }

    @Override // g1.c
    protected void s() {
        Closeable closeable = this.f13506p;
        if (closeable != null) {
            f(closeable);
        }
        if (z() || this.f13506p == null) {
            h();
        }
    }

    @Override // g1.c
    protected void t() {
        b();
    }
}
