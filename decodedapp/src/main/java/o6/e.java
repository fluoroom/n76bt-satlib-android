package o6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class e implements e6.o, f, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i6.l f23231h = new i6.l(" ");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f23232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected b f23233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final e6.p f23234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f23235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected transient int f23236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected o f23237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f23238g;

    public static class a extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f23239b = new a();

        @Override // o6.e.c, o6.e.b
        public void a(e6.g gVar, int i10) {
            gVar.Q0(' ');
        }

        @Override // o6.e.c, o6.e.b
        public boolean isInline() {
            return true;
        }
    }

    public interface b {
        void a(e6.g gVar, int i10);

        boolean isInline();
    }

    public e() {
        this(f23231h);
    }

    @Override // e6.o
    public void a(e6.g gVar) {
        this.f23232a.a(gVar, this.f23236e);
    }

    @Override // e6.o
    public void b(e6.g gVar) {
        e6.p pVar = this.f23234c;
        if (pVar != null) {
            gVar.R0(pVar);
        }
    }

    @Override // e6.o
    public void c(e6.g gVar) {
        gVar.Q0(this.f23237f.c());
        this.f23233b.a(gVar, this.f23236e);
    }

    @Override // e6.o
    public void d(e6.g gVar) {
        gVar.Q0('{');
        if (this.f23233b.isInline()) {
            return;
        }
        this.f23236e++;
    }

    @Override // e6.o
    public void f(e6.g gVar, int i10) {
        if (!this.f23232a.isInline()) {
            this.f23236e--;
        }
        if (i10 > 0) {
            this.f23232a.a(gVar, this.f23236e);
        } else {
            gVar.Q0(' ');
        }
        gVar.Q0(']');
    }

    @Override // e6.o
    public void g(e6.g gVar) {
        if (this.f23235d) {
            gVar.S0(this.f23238g);
        } else {
            gVar.Q0(this.f23237f.d());
        }
    }

    @Override // e6.o
    public void h(e6.g gVar, int i10) {
        if (!this.f23233b.isInline()) {
            this.f23236e--;
        }
        if (i10 > 0) {
            this.f23233b.a(gVar, this.f23236e);
        } else {
            gVar.Q0(' ');
        }
        gVar.Q0('}');
    }

    @Override // e6.o
    public void i(e6.g gVar) {
        gVar.Q0(this.f23237f.b());
        this.f23232a.a(gVar, this.f23236e);
    }

    @Override // e6.o
    public void j(e6.g gVar) {
        this.f23233b.a(gVar, this.f23236e);
    }

    @Override // e6.o
    public void k(e6.g gVar) {
        if (!this.f23232a.isInline()) {
            this.f23236e++;
        }
        gVar.Q0('[');
    }

    @Override // o6.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e e() {
        if (getClass() == e.class) {
            return new e(this);
        }
        throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
    }

    public e n(o oVar) {
        this.f23237f = oVar;
        this.f23238g = " " + oVar.d() + " ";
        return this;
    }

    public e(e6.p pVar) {
        this.f23232a = a.f23239b;
        this.f23233b = d.f23227f;
        this.f23235d = true;
        this.f23234c = pVar;
        n(e6.o.f11578i);
    }

    public e(e eVar) {
        this(eVar, eVar.f23234c);
    }

    public e(e eVar, e6.p pVar) {
        this.f23232a = a.f23239b;
        this.f23233b = d.f23227f;
        this.f23235d = true;
        this.f23232a = eVar.f23232a;
        this.f23233b = eVar.f23233b;
        this.f23235d = eVar.f23235d;
        this.f23236e = eVar.f23236e;
        this.f23237f = eVar.f23237f;
        this.f23238g = eVar.f23238g;
        this.f23234c = pVar;
    }

    public static class c implements b, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f23240a = new c();

        @Override // o6.e.b
        public boolean isInline() {
            return true;
        }

        @Override // o6.e.b
        public void a(e6.g gVar, int i10) {
        }
    }
}
