package o6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class l implements e6.o, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f23249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected o f23250b;

    public l() {
        this(e6.o.f11579j.toString());
    }

    @Override // e6.o
    public void b(e6.g gVar) {
        String str = this.f23249a;
        if (str != null) {
            gVar.S0(str);
        }
    }

    @Override // e6.o
    public void c(e6.g gVar) {
        gVar.Q0(this.f23250b.c());
    }

    @Override // e6.o
    public void d(e6.g gVar) {
        gVar.Q0('{');
    }

    @Override // e6.o
    public void f(e6.g gVar, int i10) {
        gVar.Q0(']');
    }

    @Override // e6.o
    public void g(e6.g gVar) {
        gVar.Q0(this.f23250b.d());
    }

    @Override // e6.o
    public void h(e6.g gVar, int i10) {
        gVar.Q0('}');
    }

    @Override // e6.o
    public void i(e6.g gVar) {
        gVar.Q0(this.f23250b.b());
    }

    @Override // e6.o
    public void k(e6.g gVar) {
        gVar.Q0('[');
    }

    public l(String str) {
        this.f23249a = str;
        this.f23250b = e6.o.f11578i;
    }

    @Override // e6.o
    public void a(e6.g gVar) {
    }

    @Override // e6.o
    public void j(e6.g gVar) {
    }
}
