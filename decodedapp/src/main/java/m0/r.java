package m0;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f20886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f20887b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f20888c = new HashMap();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.lifecycle.m f20889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.q f20890b;

        a(androidx.lifecycle.m mVar, androidx.lifecycle.q qVar) {
            this.f20889a = mVar;
            this.f20890b = qVar;
            mVar.a(qVar);
        }

        void a() {
            this.f20889a.d(this.f20890b);
            this.f20890b = null;
        }
    }

    public r(Runnable runnable) {
        this.f20886a = runnable;
    }

    public static /* synthetic */ void a(r rVar, m.b bVar, u uVar, androidx.lifecycle.t tVar, m.a aVar) {
        rVar.getClass();
        if (aVar == m.a.f(bVar)) {
            rVar.c(uVar);
            return;
        }
        if (aVar == m.a.ON_DESTROY) {
            rVar.j(uVar);
        } else if (aVar == m.a.d(bVar)) {
            rVar.f20887b.remove(uVar);
            rVar.f20886a.run();
        }
    }

    public static /* synthetic */ void b(r rVar, u uVar, androidx.lifecycle.t tVar, m.a aVar) {
        rVar.getClass();
        if (aVar == m.a.ON_DESTROY) {
            rVar.j(uVar);
        }
    }

    public void c(u uVar) {
        this.f20887b.add(uVar);
        this.f20886a.run();
    }

    public void d(final u uVar, androidx.lifecycle.t tVar) {
        c(uVar);
        androidx.lifecycle.m mVarS0 = tVar.S0();
        a aVar = (a) this.f20888c.remove(uVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f20888c.put(uVar, new a(mVarS0, new androidx.lifecycle.q() { // from class: m0.q
            @Override // androidx.lifecycle.q
            public final void k(androidx.lifecycle.t tVar2, m.a aVar2) {
                r.b(this.f20883a, uVar, tVar2, aVar2);
            }
        }));
    }

    public void e(final u uVar, androidx.lifecycle.t tVar, final m.b bVar) {
        androidx.lifecycle.m mVarS0 = tVar.S0();
        a aVar = (a) this.f20888c.remove(uVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f20888c.put(uVar, new a(mVarS0, new androidx.lifecycle.q() { // from class: m0.p
            @Override // androidx.lifecycle.q
            public final void k(androidx.lifecycle.t tVar2, m.a aVar2) {
                r.a(this.f20879a, bVar, uVar, tVar2, aVar2);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f20887b.iterator();
        while (it.hasNext()) {
            ((u) it.next()).E0(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator it = this.f20887b.iterator();
        while (it.hasNext()) {
            ((u) it.next()).z0(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator it = this.f20887b.iterator();
        while (it.hasNext()) {
            if (((u) it.next()).v(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator it = this.f20887b.iterator();
        while (it.hasNext()) {
            ((u) it.next()).K0(menu);
        }
    }

    public void j(u uVar) {
        this.f20887b.remove(uVar);
        a aVar = (a) this.f20888c.remove(uVar);
        if (aVar != null) {
            aVar.a();
        }
        this.f20886a.run();
    }
}
