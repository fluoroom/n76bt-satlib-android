package eh;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jh.m;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: c */
    private Runnable f12590c;

    /* JADX INFO: renamed from: d */
    private ExecutorService f12591d;

    /* JADX INFO: renamed from: a */
    private int f12588a = 64;

    /* JADX INFO: renamed from: b */
    private int f12589b = 5;

    /* JADX INFO: renamed from: e */
    private final ArrayDeque f12592e = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    private final ArrayDeque f12593f = new ArrayDeque();

    /* JADX INFO: renamed from: g */
    private final ArrayDeque f12594g = new ArrayDeque();

    public static final class a {

        /* JADX INFO: renamed from: a */
        private final List f12595a;

        /* JADX INFO: renamed from: b */
        private final Runnable f12596b;

        public a(List list, Runnable runnable) {
            rd.m.e(list, "callsToExecute");
            this.f12595a = list;
            this.f12596b = runnable;
        }

        public final List a() {
            return this.f12595a;
        }

        public final Runnable b() {
            return this.f12596b;
        }
    }

    private final m.a d(String str) {
        Iterator it = this.f12593f.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            m.a aVar = (m.a) it.next();
            if (rd.m.a(aVar.f(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f12592e.iterator();
        rd.m.d(it2, "iterator(...)");
        while (it2.hasNext()) {
            m.a aVar2 = (m.a) it2.next();
            if (rd.m.a(aVar2.f(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    private final void g(m.a aVar, jh.m mVar, m.a aVar2) {
        a aVar3;
        m.a aVarD;
        fh.p.e(this);
        boolean zIsShutdown = c().isShutdown();
        synchronized (this) {
            if (mVar != null) {
                try {
                    if (!this.f12594g.remove(mVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (aVar2 != null) {
                aVar2.e().decrementAndGet();
                if (!this.f12593f.remove(aVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (aVar != null) {
                this.f12592e.add(aVar);
                if (!aVar.d().o() && (aVarD = d(aVar.f())) != null) {
                    aVar.g(aVarD);
                }
            }
            Runnable runnable = (!(mVar == null && aVar2 == null) && (zIsShutdown || this.f12593f.isEmpty()) && this.f12594g.isEmpty()) ? this.f12590c : null;
            if (zIsShutdown) {
                List listH0 = ed.q.H0(this.f12592e);
                this.f12592e.clear();
                aVar3 = new a(listH0, runnable);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f12592e.iterator();
                rd.m.d(it, "iterator(...)");
                while (it.hasNext()) {
                    m.a aVar4 = (m.a) it.next();
                    if (this.f12593f.size() >= this.f12588a) {
                        break;
                    }
                    if (aVar4.e().get() < this.f12589b) {
                        it.remove();
                        aVar4.e().incrementAndGet();
                        rd.m.b(aVar4);
                        arrayList.add(aVar4);
                        this.f12593f.add(aVar4);
                    }
                }
                aVar3 = new a(arrayList, runnable);
            }
        }
        int size = aVar3.a().size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            m.a aVar5 = (m.a) aVar3.a().get(i10);
            if (aVar5 == aVar) {
                z10 = false;
            } else {
                aVar5.d().n().m(aVar5.d(), this);
            }
            if (zIsShutdown) {
                m.a.c(aVar5, null, 1, null);
            } else {
                aVar5.a(c());
            }
        }
        if (z10 && aVar != null) {
            aVar.d().n().n(aVar.d(), this);
        }
        Runnable runnableB = aVar3.b();
        if (runnableB != null) {
            runnableB.run();
        }
    }

    static /* synthetic */ void h(q qVar, m.a aVar, jh.m mVar, m.a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        if ((i10 & 2) != 0) {
            mVar = null;
        }
        if ((i10 & 4) != 0) {
            aVar2 = null;
        }
        qVar.g(aVar, mVar, aVar2);
    }

    public final void a(m.a aVar) {
        rd.m.e(aVar, "call");
        h(this, aVar, null, null, 6, null);
    }

    public final synchronized boolean b(jh.m mVar) {
        rd.m.e(mVar, "call");
        return this.f12594g.add(mVar);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.f12591d == null) {
                this.f12591d = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60L, TimeUnit.SECONDS, new SynchronousQueue(), fh.p.p(fh.p.f13110c + " Dispatcher", false));
            }
            executorService = this.f12591d;
            rd.m.b(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final void e(m.a aVar) {
        rd.m.e(aVar, "call");
        h(this, null, null, aVar, 3, null);
    }

    public final void f(jh.m mVar) {
        rd.m.e(mVar, "call");
        h(this, null, mVar, null, 5, null);
    }
}
