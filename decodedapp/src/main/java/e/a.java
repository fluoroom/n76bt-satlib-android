package e;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f11316a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f11317b;

    public final void a(b bVar) {
        m.e(bVar, "listener");
        Context context = this.f11317b;
        if (context != null) {
            bVar.a(context);
        }
        this.f11316a.add(bVar);
    }

    public final void b() {
        this.f11317b = null;
    }

    public final void c(Context context) {
        m.e(context, "context");
        this.f11317b = context;
        Iterator it = this.f11316a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(context);
        }
    }
}
