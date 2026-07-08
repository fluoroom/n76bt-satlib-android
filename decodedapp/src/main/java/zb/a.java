package zb;

import android.os.Handler;
import android.os.Looper;
import fc.i;
import fc.j;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Handler implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f33102b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque f33103a;

    /* JADX INFO: renamed from: zb.a$a, reason: collision with other inner class name */
    class RunnableC0447a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f33104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f33105b;

        RunnableC0447a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f33104a.a(this.f33105b);
            this.f33104a = null;
            this.f33105b = null;
            synchronized (a.this.f33103a) {
                try {
                    if (a.this.f33103a.size() < 20) {
                        a.this.f33103a.add(this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public a(Looper looper) {
        super(looper);
        this.f33103a = new ArrayDeque();
    }

    public static synchronized j c() {
        try {
            if (f33102b == null) {
                f33102b = new a(Looper.getMainLooper());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33102b;
    }

    @Override // fc.j
    public void a(i iVar, Object obj) {
        RunnableC0447a runnableC0447a;
        synchronized (this.f33103a) {
            runnableC0447a = (RunnableC0447a) this.f33103a.poll();
        }
        if (runnableC0447a == null) {
            runnableC0447a = new RunnableC0447a();
        }
        runnableC0447a.f33104a = iVar;
        runnableC0447a.f33105b = obj;
        post(runnableC0447a);
    }
}
