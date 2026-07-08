package g1;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f13361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f13362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f13363d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13364e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f13365f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f13366g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f13367h = false;

    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            c.this.p();
        }
    }

    public interface b {
        void a(c cVar, Object obj);
    }

    public c(Context context) {
        this.f13362c = context.getApplicationContext();
    }

    public void A(b bVar) {
        b bVar2 = this.f13361b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (bVar2 != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f13361b = null;
    }

    public void a() {
        this.f13364e = true;
        n();
    }

    public boolean b() {
        return o();
    }

    public void c() {
        this.f13367h = false;
    }

    public String d(Object obj) {
        StringBuilder sb2 = new StringBuilder(64);
        if (obj == null) {
            sb2.append("null");
        } else {
            Class<?> cls = obj.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}");
        }
        return sb2.toString();
    }

    public void f(Object obj) {
        b bVar = this.f13361b;
        if (bVar != null) {
            bVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f13360a);
        printWriter.print(" mListener=");
        printWriter.println(this.f13361b);
        if (this.f13363d || this.f13366g || this.f13367h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f13363d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f13366g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f13367h);
        }
        if (this.f13364e || this.f13365f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f13364e);
            printWriter.print(" mReset=");
            printWriter.println(this.f13365f);
        }
    }

    public void h() {
        q();
    }

    public Context i() {
        return this.f13362c;
    }

    public int j() {
        return this.f13360a;
    }

    public boolean k() {
        return this.f13364e;
    }

    public boolean l() {
        return this.f13365f;
    }

    public boolean m() {
        return this.f13363d;
    }

    protected abstract boolean o();

    public void p() {
        if (this.f13363d) {
            h();
        } else {
            this.f13366g = true;
        }
    }

    protected abstract void s();

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=");
        sb2.append(this.f13360a);
        sb2.append("}");
        return sb2.toString();
    }

    public void u(int i10, b bVar) {
        if (this.f13361b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f13361b = bVar;
        this.f13360a = i10;
    }

    public void v() {
        r();
        this.f13365f = true;
        this.f13363d = false;
        this.f13364e = false;
        this.f13366g = false;
        this.f13367h = false;
    }

    public void w() {
        if (this.f13367h) {
            p();
        }
    }

    public final void x() {
        this.f13363d = true;
        this.f13365f = false;
        this.f13364e = false;
        s();
    }

    public void y() {
        this.f13363d = false;
        t();
    }

    public boolean z() {
        boolean z10 = this.f13366g;
        this.f13366g = false;
        this.f13367h |= z10;
        return z10;
    }

    public void e() {
    }

    protected void n() {
    }

    protected void q() {
    }

    protected void r() {
    }

    protected void t() {
    }
}
