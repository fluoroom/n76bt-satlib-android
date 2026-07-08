package ha;

import android.view.View;
import ha.b;
import java.util.Collection;
import o8.c;
import q8.i;
import q8.j;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b implements c.f, c.h, c.i, c.a, c.g {

    public class a extends b.C0213b {

        /* JADX INFO: renamed from: c */
        private c.f f15196c;

        /* JADX INFO: renamed from: d */
        private c.g f15197d;

        /* JADX INFO: renamed from: e */
        private c.h f15198e;

        /* JADX INFO: renamed from: f */
        private c.i f15199f;

        /* JADX INFO: renamed from: g */
        private c.a f15200g;

        public a() {
            super();
        }

        public i j(j jVar) {
            i iVarB = c.this.f15190a.b(jVar);
            super.a(iVarB);
            return iVarB;
        }

        public Collection k() {
            return c();
        }

        public boolean l(i iVar) {
            return super.d(iVar);
        }

        public void m(c.a aVar) {
            this.f15200g = aVar;
        }

        public void n(c.f fVar) {
            this.f15196c = fVar;
        }

        public void o(c.g gVar) {
            this.f15197d = gVar;
        }

        public void p(c.h hVar) {
            this.f15198e = hVar;
        }
    }

    public c(o8.c cVar) {
        super(cVar);
    }

    @Override // o8.c.g
    public void a(i iVar) {
        a aVar = (a) this.f15192c.get(iVar);
        if (aVar == null || aVar.f15197d == null) {
            return;
        }
        aVar.f15197d.a(iVar);
    }

    @Override // o8.c.a
    public View c(i iVar) {
        a aVar = (a) this.f15192c.get(iVar);
        if (aVar == null || aVar.f15200g == null) {
            return null;
        }
        return aVar.f15200g.c(iVar);
    }

    @Override // o8.c.h
    public boolean d(i iVar) {
        a aVar = (a) this.f15192c.get(iVar);
        if (aVar == null || aVar.f15198e == null) {
            return false;
        }
        return aVar.f15198e.d(iVar);
    }

    @Override // o8.c.i
    public void e(i iVar) {
        a aVar = (a) this.f15192c.get(iVar);
        if (aVar == null || aVar.f15199f == null) {
            return;
        }
        aVar.f15199f.e(iVar);
    }

    @Override // o8.c.i
    public void g(i iVar) {
        a aVar = (a) this.f15192c.get(iVar);
        if (aVar == null || aVar.f15199f == null) {
            return;
        }
        aVar.f15199f.g(iVar);
    }

    @Override // o8.c.f
    public void h(i iVar) {
        a aVar = (a) this.f15192c.get(iVar);
        if (aVar == null || aVar.f15196c == null) {
            return;
        }
        aVar.f15196c.h(iVar);
    }

    @Override // o8.c.i
    public void i(i iVar) {
        a aVar = (a) this.f15192c.get(iVar);
        if (aVar == null || aVar.f15199f == null) {
            return;
        }
        aVar.f15199f.i(iVar);
    }

    @Override // o8.c.a
    public View j(i iVar) {
        a aVar = (a) this.f15192c.get(iVar);
        if (aVar == null || aVar.f15200g == null) {
            return null;
        }
        return aVar.f15200g.j(iVar);
    }

    @Override // ha.b
    public /* bridge */ /* synthetic */ boolean l(Object obj) {
        return super.l(obj);
    }

    @Override // ha.b
    void n() {
        o8.c cVar = this.f15190a;
        if (cVar != null) {
            cVar.w(this);
            this.f15190a.x(this);
            this.f15190a.y(this);
            this.f15190a.z(this);
            this.f15190a.o(this);
        }
    }

    public a o() {
        return new a();
    }

    @Override // ha.b
    /* JADX INFO: renamed from: p */
    public void m(i iVar) {
        iVar.g();
    }
}
