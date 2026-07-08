package zj;

import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes3.dex */
public class e1 {

    /* JADX INFO: renamed from: a */
    private b f33367a;

    /* JADX INFO: renamed from: b */
    private b f33368b;

    /* JADX INFO: renamed from: c */
    private b f33369c;

    /* JADX INFO: renamed from: d */
    private yj.b f33370d;

    /* JADX INFO: renamed from: e */
    private yj.b f33371e;

    /* JADX INFO: renamed from: f */
    private int f33372f;

    /* JADX INFO: renamed from: g */
    private int f33373g;

    /* JADX INFO: renamed from: h */
    private double f33374h;

    /* JADX INFO: renamed from: i */
    private h f33375i;

    public static class b {

        /* JADX INFO: renamed from: a */
        private final Object f33376a;

        /* JADX INFO: renamed from: b */
        private c f33377b;

        /* JADX INFO: renamed from: c */
        private c f33378c;

        /* synthetic */ b(Object obj, a aVar) {
            this(obj);
        }

        public Object e() {
            return this.f33376a;
        }

        public yj.b f() {
            c cVar = this.f33378c;
            return cVar == null ? yj.b.R : cVar.getDate();
        }

        public c g() {
            return this.f33378c;
        }

        public yj.b h() {
            c cVar = this.f33377b;
            return cVar == null ? yj.b.Q : cVar.getDate();
        }

        public c i() {
            return this.f33377b;
        }

        public b j() {
            c cVar = this.f33378c;
            if (cVar == null) {
                return null;
            }
            return cVar.a();
        }

        public b k() {
            c cVar = this.f33377b;
            if (cVar == null) {
                return null;
            }
            return cVar.b();
        }

        private b(Object obj) {
            this.f33376a = obj;
        }
    }

    public static class c implements yj.g0 {

        /* JADX INFO: renamed from: a */
        private final e1 f33379a;

        /* JADX INFO: renamed from: b */
        private yj.b f33380b;

        /* JADX INFO: renamed from: c */
        private b f33381c;

        /* JADX INFO: renamed from: d */
        private b f33382d;

        /* synthetic */ c(e1 e1Var, yj.b bVar, a aVar) {
            this(e1Var, bVar);
        }

        public b a() {
            return this.f33382d;
        }

        public b b() {
            return this.f33381c;
        }

        public c c() {
            return this.f33382d.g();
        }

        @Override // yj.g0
        public /* synthetic */ double e(yj.g0 g0Var) {
            return yj.f0.a(this, g0Var);
        }

        @Override // yj.g0
        public yj.b getDate() {
            return this.f33380b;
        }

        public c h() {
            return this.f33381c.i();
        }

        void i(b bVar) {
            this.f33382d = bVar;
            bVar.f33377b = this;
        }

        void j(b bVar) {
            this.f33381c = bVar;
            bVar.f33378c = this;
        }

        private c(e1 e1Var, yj.b bVar) {
            this.f33379a = e1Var;
            this.f33380b = bVar;
        }
    }

    public e1(Object obj) {
        b bVar = new b(obj);
        this.f33367a = bVar;
        this.f33368b = bVar;
        this.f33369c = bVar;
        this.f33372f = 1;
        c(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, Double.POSITIVE_INFINITY, h.f33393c);
    }

    private synchronized void d(yj.b bVar) {
        while (true) {
            if (this.f33372f > this.f33373g || this.f33369c.h().X(this.f33368b.f()) > this.f33374h) {
                if (this.f33375i.a(bVar, this.f33368b.f(), this.f33369c.h())) {
                    if (this.f33368b.f().Z(this.f33370d)) {
                        this.f33370d = this.f33368b.f();
                    }
                    b bVarJ = this.f33368b.j();
                    this.f33368b = bVarJ;
                    bVarJ.f33377b = null;
                    if (this.f33367a.f33377b == null) {
                        this.f33367a = this.f33368b;
                    }
                } else {
                    if (this.f33369c.h().a0(this.f33371e)) {
                        this.f33371e = this.f33369c.h();
                    }
                    b bVarK = this.f33369c.k();
                    this.f33369c = bVarK;
                    bVarK.f33378c = null;
                    if (this.f33367a.f33378c == null) {
                        this.f33367a = this.f33369c;
                    }
                }
                this.f33372f--;
            }
        }
    }

    private void i(yj.b bVar, b bVar2, b bVar3) {
        c cVar = new c(bVar);
        cVar.j(bVar2);
        cVar.i(bVar3);
        k(bVar2);
        l(bVar3);
        this.f33372f++;
    }

    private synchronized void j(yj.b bVar) {
        while (this.f33367a.h().Z(bVar)) {
            try {
                this.f33367a = this.f33367a.k();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        while (this.f33367a.f().b0(bVar)) {
            b bVarJ = this.f33367a.j();
            if (bVarJ == null) {
                return;
            } else {
                this.f33367a = bVarJ;
            }
        }
    }

    private void k(b bVar) {
        if (bVar.i() == null) {
            this.f33368b = bVar;
        }
    }

    private void l(b bVar) {
        if (bVar.g() == null) {
            this.f33369c = bVar;
        }
    }

    public synchronized b a(Object obj, yj.b bVar, boolean z10) {
        b bVar2;
        try {
            j(bVar);
            if (z10) {
                this.f33367a.f33378c = null;
                this.f33372f = 0;
                for (b bVarK = this.f33367a; bVarK != null; bVarK = bVarK.k()) {
                    this.f33372f++;
                }
            }
            bVar2 = new b(obj);
            if (this.f33367a.g() != null) {
                this.f33367a.g().j(bVar2);
            }
            c cVarI = this.f33367a.i();
            if (cVarI == null || !cVarI.getDate().equals(bVar)) {
                i(bVar, this.f33367a, bVar2);
            } else {
                cVarI.i(bVar2);
                l(bVar2);
            }
            this.f33367a = bVar2;
            d(bVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return bVar2;
    }

    public synchronized b b(Object obj, yj.b bVar, boolean z10) {
        b bVar2;
        try {
            j(bVar);
            if (z10) {
                this.f33367a.f33377b = null;
                this.f33372f = 0;
                for (b bVarJ = this.f33367a; bVarJ != null; bVarJ = bVarJ.j()) {
                    this.f33372f++;
                }
            }
            bVar2 = new b(obj);
            c cVarI = this.f33367a.i();
            if (cVarI == null || !cVarI.getDate().equals(bVar)) {
                if (this.f33367a.i() != null) {
                    this.f33367a.i().i(bVar2);
                }
                i(bVar, bVar2, this.f33367a);
            } else {
                if (cVarI.h() != null) {
                    cVarI.h().i(bVar2);
                }
                cVarI.j(bVar2);
                k(bVar2);
            }
            this.f33367a = bVar2;
            d(bVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return bVar2;
    }

    public synchronized void c(int i10, double d10, h hVar) {
        this.f33373g = i10;
        this.f33374h = d10;
        this.f33375i = hVar;
        this.f33370d = yj.b.Q;
        this.f33371e = yj.b.R;
    }

    public synchronized Object e(yj.b bVar) {
        return g(bVar).e();
    }

    public synchronized b f() {
        return this.f33368b;
    }

    public synchronized b g(yj.b bVar) {
        if (bVar.a0(this.f33370d) || bVar.Z(this.f33371e)) {
            throw new hj.a(hj.f.EXPUNGED_SPAN, bVar);
        }
        j(bVar);
        return this.f33367a;
    }

    public synchronized int h() {
        return this.f33372f;
    }
}
