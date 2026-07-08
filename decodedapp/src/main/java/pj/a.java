package pj;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kj.r0;
import zj.e;
import zj.e1;
import zj.k1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yj.b f24247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dj.c f24248c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f24251f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xj.c f24246a = new xj.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f24249d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f24250e = new HashMap();

    protected a() {
    }

    public List a() {
        return DesugarCollections.unmodifiableList(this.f24249d);
    }

    @Override // pj.c
    public d b(yj.b bVar) {
        if (this.f24247b == null) {
            this.f24247b = e().getDate();
        }
        return k(this.f24247b, bVar);
    }

    public dj.c d() {
        return this.f24248c;
    }

    public d e() {
        return this.f24251f;
    }

    public xj.c f() {
        return this.f24246a;
    }

    public /* synthetic */ k1 g(yj.b bVar, r0 r0Var) {
        return b.a(this, bVar, r0Var);
    }

    protected yj.b n() {
        return this.f24247b;
    }

    protected void o(yj.b bVar) {
        Iterator it = this.f24249d.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    protected void p() {
        this.f24250e.clear();
        d dVar = this.f24251f;
        if (dVar != null) {
            for (e.a aVar : dVar.i().a()) {
                if (!q(aVar.a())) {
                    this.f24250e.put(aVar.a(), new e1(aVar.b()));
                }
            }
        }
    }

    public boolean q(String str) {
        Iterator it = this.f24249d.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public void r(d dVar) {
        this.f24251f = dVar;
        t(dVar.getDate());
    }

    public void s(dj.c cVar) {
        this.f24248c = cVar;
    }

    protected void t(yj.b bVar) {
        this.f24247b = bVar;
    }

    protected void u(d dVar) {
        yj.b date = dVar.getDate();
        boolean z10 = date.X(n()) >= 0.0d;
        for (e.a aVar : dVar.i().a()) {
            e1 e1Var = (e1) this.f24250e.get(aVar.a());
            if (e1Var != null) {
                if (z10) {
                    e1Var.a(aVar.b(), date, false);
                } else {
                    e1Var.b(aVar.b(), date, false);
                }
            }
        }
    }

    public d v(d dVar) {
        d dVarW = w(dVar);
        LinkedList linkedList = new LinkedList(a());
        if (linkedList.isEmpty()) {
            return dVarW;
        }
        android.support.v4.media.session.b.a(linkedList.remove());
        throw null;
    }

    protected d w(d dVar) {
        d dVarB = dVar;
        for (Map.Entry entry : this.f24250e.entrySet()) {
            dVarB = dVarB.b((String) entry.getKey(), ((e1) entry.getValue()).e(dVar.getDate()));
        }
        return dVarB;
    }
}
