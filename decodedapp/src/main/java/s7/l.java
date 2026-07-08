package s7;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class l extends h8.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f27004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f27005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f27005c = dVar;
        this.f27004b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        d dVar = this.f27005c;
        int iF = dVar.f(this.f27004b);
        if (dVar.i(iF)) {
            this.f27005c.n(this.f27004b, iF);
        }
    }
}
