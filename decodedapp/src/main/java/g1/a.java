package g1;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import i0.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Executor f13344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile RunnableC0191a f13345j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile RunnableC0191a f13346k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f13347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f13348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Handler f13349n;

    /* JADX INFO: renamed from: g1.a$a, reason: collision with other inner class name */
    final class RunnableC0191a extends d implements Runnable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f13350f;

        RunnableC0191a() {
        }

        @Override // g1.d
        protected Object b() {
            try {
                return a.this.J();
            } catch (k e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // g1.d
        protected void g(Object obj) {
            a.this.C(this, obj);
        }

        @Override // g1.d
        protected void h(Object obj) {
            a.this.D(this, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13350f = false;
            a.this.E();
        }
    }

    public a(Context context) {
        super(context);
        this.f13348m = -10000L;
    }

    void C(RunnableC0191a runnableC0191a, Object obj) {
        I(obj);
        if (this.f13346k == runnableC0191a) {
            w();
            this.f13348m = SystemClock.uptimeMillis();
            this.f13346k = null;
            e();
            E();
        }
    }

    void D(RunnableC0191a runnableC0191a, Object obj) {
        if (this.f13345j != runnableC0191a) {
            C(runnableC0191a, obj);
            return;
        }
        if (k()) {
            I(obj);
            return;
        }
        c();
        this.f13348m = SystemClock.uptimeMillis();
        this.f13345j = null;
        f(obj);
    }

    void E() {
        if (this.f13346k != null || this.f13345j == null) {
            return;
        }
        if (this.f13345j.f13350f) {
            this.f13345j.f13350f = false;
            this.f13349n.removeCallbacks(this.f13345j);
        }
        if (this.f13347l > 0 && SystemClock.uptimeMillis() < this.f13348m + this.f13347l) {
            this.f13345j.f13350f = true;
            this.f13349n.postAtTime(this.f13345j, this.f13348m + this.f13347l);
        } else {
            if (this.f13344i == null) {
                this.f13344i = F();
            }
            this.f13345j.c(this.f13344i);
        }
    }

    protected Executor F() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public boolean G() {
        return this.f13346k != null;
    }

    public abstract Object H();

    protected Object J() {
        return H();
    }

    @Override // g1.c
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f13345j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f13345j);
            printWriter.print(" waiting=");
            printWriter.println(this.f13345j.f13350f);
        }
        if (this.f13346k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f13346k);
            printWriter.print(" waiting=");
            printWriter.println(this.f13346k.f13350f);
        }
        if (this.f13347l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f13347l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f13348m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f13348m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // g1.c
    protected boolean o() {
        if (this.f13345j == null) {
            return false;
        }
        if (!m()) {
            p();
        }
        if (this.f13346k != null) {
            if (this.f13345j.f13350f) {
                this.f13345j.f13350f = false;
                this.f13349n.removeCallbacks(this.f13345j);
            }
            this.f13345j = null;
            return false;
        }
        if (this.f13345j.f13350f) {
            this.f13345j.f13350f = false;
            this.f13349n.removeCallbacks(this.f13345j);
            this.f13345j = null;
            return false;
        }
        boolean zA = this.f13345j.a(false);
        if (zA) {
            this.f13346k = this.f13345j;
            B();
        }
        this.f13345j = null;
        return zA;
    }

    @Override // g1.c
    protected void q() {
        super.q();
        b();
        this.f13345j = new RunnableC0191a();
        E();
    }

    public void B() {
    }

    public void I(Object obj) {
    }
}
