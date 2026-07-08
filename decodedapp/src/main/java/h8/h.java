package h8;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class h extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Looper f15177a;

    public h(Looper looper) {
        super(looper);
        this.f15177a = Looper.getMainLooper();
    }

    public h(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f15177a = Looper.getMainLooper();
    }
}
