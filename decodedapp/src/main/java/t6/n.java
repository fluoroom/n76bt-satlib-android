package t6;

import s6.u;

/* JADX INFO: loaded from: classes.dex */
public class n extends u.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final x6.k f27525y;

    protected n(s6.u uVar, x6.k kVar) {
        super(uVar);
        this.f27525y = kVar;
    }

    public static n b0(s6.u uVar, x6.k kVar) {
        return new n(uVar, kVar);
    }

    @Override // s6.u.a, s6.u
    public void L(Object obj, Object obj2) {
        if (obj2 != null) {
            this.f26973x.L(obj, obj2);
        }
    }

    @Override // s6.u.a, s6.u
    public Object N(Object obj, Object obj2) {
        return obj2 != null ? this.f26973x.N(obj, obj2) : obj;
    }

    @Override // s6.u.a
    protected s6.u a0(s6.u uVar) {
        return new n(uVar, this.f27525y);
    }

    @Override // s6.u
    public void n(e6.j jVar, p6.h hVar, Object obj) {
        Object objO = this.f27525y.o(obj);
        Object objL = objO == null ? this.f26973x.l(jVar, hVar) : this.f26973x.p(jVar, hVar, objO);
        if (objL != objO) {
            this.f26973x.L(obj, objL);
        }
    }

    @Override // s6.u
    public Object o(e6.j jVar, p6.h hVar, Object obj) {
        Object objO = this.f27525y.o(obj);
        Object objL = objO == null ? this.f26973x.l(jVar, hVar) : this.f26973x.p(jVar, hVar, objO);
        return (objL == objO || objL == null) ? obj : this.f26973x.N(obj, objL);
    }
}
