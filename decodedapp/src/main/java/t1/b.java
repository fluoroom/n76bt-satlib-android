package t1;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Runnable f27450a = new Runnable() { // from class: t1.a
        @Override // java.lang.Runnable
        public final void run() {
            b.f27452c = true;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Handler f27451b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static boolean f27452c = true;

    public abstract void b(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (f27452c) {
            f27452c = false;
            f27451b.post(f27450a);
            b(view);
        }
    }
}
