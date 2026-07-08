package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import t7.g;
import t7.h;
import t7.k;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public abstract class BasePendingResult<R extends k> extends h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final ThreadLocal f7203m = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final a f7205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final WeakReference f7206c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k f7210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Status f7211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f7212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7214k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f7204a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CountDownLatch f7207d = new CountDownLatch(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f7208e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f7209f = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7215l = false;

    public static class a extends h8.h {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                android.support.v4.media.session.b.a(pair.first);
                k kVar = (k) pair.second;
                try {
                    throw null;
                } catch (RuntimeException e10) {
                    BasePendingResult.j(kVar);
                    throw e10;
                }
            }
            if (i10 == 2) {
                ((BasePendingResult) message.obj).d(Status.f7195r);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
        }
    }

    protected BasePendingResult(g gVar) {
        this.f7205b = new a(gVar != null ? gVar.c() : Looper.getMainLooper());
        this.f7206c = new WeakReference(gVar);
    }

    private final k g() {
        k kVar;
        synchronized (this.f7204a) {
            q.l(!this.f7212i, "Result has already been consumed.");
            q.l(e(), "Result is not ready.");
            kVar = this.f7210g;
            this.f7210g = null;
            this.f7212i = true;
        }
        android.support.v4.media.session.b.a(this.f7209f.getAndSet(null));
        return (k) q.i(kVar);
    }

    private final void h(k kVar) {
        this.f7210g = kVar;
        this.f7211h = kVar.getStatus();
        this.f7207d.countDown();
        ArrayList arrayList = this.f7208e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h.a) arrayList.get(i10)).a(this.f7211h);
        }
        this.f7208e.clear();
    }

    @Override // t7.h
    public final void a(h.a aVar) {
        q.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f7204a) {
            try {
                if (e()) {
                    aVar.a(this.f7211h);
                } else {
                    this.f7208e.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // t7.h
    public final k b(long j10, TimeUnit timeUnit) {
        if (j10 > 0) {
            q.h("await must not be called on the UI thread when time is greater than zero.");
        }
        q.l(!this.f7212i, "Result has already been consumed.");
        q.l(true, "Cannot await if then() has been called.");
        try {
            if (!this.f7207d.await(j10, timeUnit)) {
                d(Status.f7195r);
            }
        } catch (InterruptedException unused) {
            d(Status.f7193g);
        }
        q.l(e(), "Result is not ready.");
        return g();
    }

    protected abstract k c(Status status);

    public final void d(Status status) {
        synchronized (this.f7204a) {
            try {
                if (!e()) {
                    f(c(status));
                    this.f7214k = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        return this.f7207d.getCount() == 0;
    }

    public final void f(k kVar) {
        synchronized (this.f7204a) {
            try {
                if (this.f7214k || this.f7213j) {
                    j(kVar);
                    return;
                }
                e();
                q.l(!e(), "Results have already been set");
                q.l(!this.f7212i, "Result has already been consumed");
                h(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        boolean z10 = true;
        if (!this.f7215l && !((Boolean) f7203m.get()).booleanValue()) {
            z10 = false;
        }
        this.f7215l = z10;
    }

    public static void j(k kVar) {
    }
}
