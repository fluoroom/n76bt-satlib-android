package v7;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class z0 extends i8.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f30491b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c cVar, Looper looper) {
        super(looper);
        this.f30491b = cVar;
    }

    private static final void a(Message message) {
        a1 a1Var = (a1) message.obj;
        a1Var.b();
        a1Var.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f30491b.L.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f30491b.s()) || message.what == 5)) && !this.f30491b.h()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f30491b.I = new s7.a(message.arg2);
            if (c.f0(this.f30491b)) {
                c cVar = this.f30491b;
                if (!cVar.J) {
                    cVar.g0(3, null);
                    return;
                }
            }
            c cVar2 = this.f30491b;
            s7.a aVar = cVar2.I != null ? cVar2.I : new s7.a(8);
            this.f30491b.f30348y.a(aVar);
            this.f30491b.K(aVar);
            return;
        }
        if (i11 == 5) {
            c cVar3 = this.f30491b;
            s7.a aVar2 = cVar3.I != null ? cVar3.I : new s7.a(8);
            this.f30491b.f30348y.a(aVar2);
            this.f30491b.K(aVar2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            s7.a aVar3 = new s7.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f30491b.f30348y.a(aVar3);
            this.f30491b.K(aVar3);
            return;
        }
        if (i11 == 6) {
            this.f30491b.g0(5, null);
            c cVar4 = this.f30491b;
            if (cVar4.D != null) {
                cVar4.D.q(message.arg2);
            }
            this.f30491b.L(message.arg2);
            c.e0(this.f30491b, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f30491b.b()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((a1) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
