package t8;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class v extends u7.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f27633b;

    private v(u7.i iVar) {
        super(iVar);
        this.f27633b = new ArrayList();
        this.f28429a.u0("TaskOnStopCallback", this);
    }

    public static v l(Activity activity) {
        v vVar;
        u7.i iVarC = u7.h.c(activity);
        synchronized (iVarC) {
            try {
                vVar = (v) iVarC.V("TaskOnStopCallback", v.class);
                if (vVar == null) {
                    vVar = new v(iVarC);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    @Override // u7.h
    public final void k() {
        synchronized (this.f27633b) {
            try {
                Iterator it = this.f27633b.iterator();
                while (it.hasNext()) {
                    r rVar = (r) ((WeakReference) it.next()).get();
                    if (rVar != null) {
                        rVar.i();
                    }
                }
                this.f27633b.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(r rVar) {
        synchronized (this.f27633b) {
            this.f27633b.add(new WeakReference(rVar));
        }
    }
}
