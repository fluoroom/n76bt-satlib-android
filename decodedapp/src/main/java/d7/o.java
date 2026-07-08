package d7;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class o extends e6.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final o f10848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f10849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Object f10850f;

    protected static final class a extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected Iterator f10851g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected p6.n f10852h;

        public a(p6.n nVar, o oVar) {
            super(1, oVar);
            this.f10851g = nVar.t();
        }

        @Override // e6.l
        public /* bridge */ /* synthetic */ e6.l f() {
            return super.n();
        }

        @Override // d7.o
        public p6.n m() {
            return this.f10852h;
        }

        @Override // d7.o
        public e6.m o() {
            if (!this.f10851g.hasNext()) {
                this.f10852h = null;
                return e6.m.END_ARRAY;
            }
            this.f11559b++;
            p6.n nVar = (p6.n) this.f10851g.next();
            this.f10852h = nVar;
            return nVar.c();
        }

        @Override // d7.o
        public o p() {
            return new a(this.f10852h, this);
        }

        @Override // d7.o
        public o q() {
            return new b(this.f10852h, this);
        }
    }

    protected static final class b extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected Iterator f10853g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected Map.Entry f10854h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected boolean f10855i;

        public b(p6.n nVar, o oVar) {
            super(2, oVar);
            this.f10853g = nVar.z();
            this.f10855i = true;
        }

        @Override // e6.l
        public /* bridge */ /* synthetic */ e6.l f() {
            return super.n();
        }

        @Override // d7.o
        public p6.n m() {
            Map.Entry entry = this.f10854h;
            if (entry == null) {
                return null;
            }
            return (p6.n) entry.getValue();
        }

        @Override // d7.o
        public e6.m o() {
            if (!this.f10855i) {
                this.f10855i = true;
                return ((p6.n) this.f10854h.getValue()).c();
            }
            if (!this.f10853g.hasNext()) {
                this.f10849e = null;
                this.f10854h = null;
                return e6.m.END_OBJECT;
            }
            this.f11559b++;
            this.f10855i = false;
            Map.Entry entry = (Map.Entry) this.f10853g.next();
            this.f10854h = entry;
            this.f10849e = entry != null ? (String) entry.getKey() : null;
            return e6.m.FIELD_NAME;
        }

        @Override // d7.o
        public o p() {
            return new a(m(), this);
        }

        @Override // d7.o
        public o q() {
            return new b(m(), this);
        }
    }

    protected static final class c extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected p6.n f10856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected boolean f10857h;

        public c(p6.n nVar, o oVar) {
            super(0, oVar);
            this.f10857h = false;
            this.f10856g = nVar;
        }

        @Override // e6.l
        public /* bridge */ /* synthetic */ e6.l f() {
            return super.n();
        }

        @Override // d7.o
        public p6.n m() {
            if (this.f10857h) {
                return this.f10856g;
            }
            return null;
        }

        @Override // d7.o
        public e6.m o() {
            if (this.f10857h) {
                this.f10856g = null;
                return null;
            }
            this.f11559b++;
            this.f10857h = true;
            return this.f10856g.c();
        }

        @Override // d7.o
        public o p() {
            return new a(this.f10856g, this);
        }

        @Override // d7.o
        public o q() {
            return new b(this.f10856g, this);
        }
    }

    public o(int i10, o oVar) {
        this.f11558a = i10;
        this.f11559b = -1;
        this.f10848d = oVar;
    }

    @Override // e6.l
    public final String b() {
        return this.f10849e;
    }

    @Override // e6.l
    public Object c() {
        return this.f10850f;
    }

    @Override // e6.l
    public void k(Object obj) {
        this.f10850f = obj;
    }

    public abstract p6.n m();

    public final o n() {
        return this.f10848d;
    }

    public abstract e6.m o();

    public abstract o p();

    public abstract o q();
}
