package q7;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g extends g1.a implements u7.q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Semaphore f24385o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set f24386p;

    public g(Context context, Set set) {
        super(context);
        this.f24385o = new Semaphore(0);
        this.f24386p = set;
    }

    @Override // g1.a
    public final /* bridge */ /* synthetic */ Object H() {
        Iterator it = this.f24386p.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((t7.g) it.next()).d(this)) {
                i10++;
            }
        }
        try {
            this.f24385o.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // g1.c
    protected final void s() {
        this.f24385o.drainPermits();
        h();
    }
}
