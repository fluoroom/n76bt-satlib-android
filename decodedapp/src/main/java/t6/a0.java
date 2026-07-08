package t6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends s6.u {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final x6.l f27465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected final Method f27466y;

    public a0(x6.u uVar, JavaType javaType, a7.e eVar, i7.b bVar, x6.l lVar) {
        super(uVar, javaType, eVar, bVar);
        this.f27465x = lVar;
        this.f27466y = lVar.b();
    }

    @Override // s6.u
    public final void L(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should never call `set()` on setterless property ('" + getName() + "')");
    }

    @Override // s6.u
    public Object N(Object obj, Object obj2) {
        L(obj, obj2);
        return obj;
    }

    @Override // s6.u
    public s6.u T(p6.y yVar) {
        return new a0(this, yVar);
    }

    @Override // s6.u
    public s6.u W(s6.r rVar) {
        return new a0(this, this.f26966g, rVar);
    }

    @Override // s6.u
    public s6.u Y(p6.l lVar) {
        p6.l lVar2 = this.f26966g;
        if (lVar2 == lVar) {
            return this;
        }
        s6.r rVar = this.f26968r;
        if (lVar2 == rVar) {
            rVar = lVar;
        }
        return new a0(this, lVar, rVar);
    }

    @Override // s6.u, p6.d
    public x6.k h() {
        return this.f27465x;
    }

    @Override // s6.u
    public final void n(e6.j jVar, p6.h hVar, Object obj) throws IOException {
        if (jVar.N0(e6.m.VALUE_NULL)) {
            return;
        }
        if (this.f26967h != null) {
            hVar.q(getType(), String.format("Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet", getName()));
        }
        try {
            Object objInvoke = this.f27466y.invoke(obj, null);
            if (objInvoke == null) {
                hVar.q(getType(), String.format("Problem deserializing 'setterless' property '%s': get method returned null", getName()));
            }
            this.f26966g.f(jVar, hVar, objInvoke);
        } catch (Exception e10) {
            g(jVar, e10);
        }
    }

    @Override // s6.u
    public Object o(e6.j jVar, p6.h hVar, Object obj) throws IOException {
        n(jVar, hVar, obj);
        return obj;
    }

    @Override // s6.u
    public void q(p6.g gVar) {
        this.f27465x.i(gVar.L(p6.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    protected a0(a0 a0Var, p6.l lVar, s6.r rVar) {
        super(a0Var, lVar, rVar);
        this.f27465x = a0Var.f27465x;
        this.f27466y = a0Var.f27466y;
    }

    protected a0(a0 a0Var, p6.y yVar) {
        super(a0Var, yVar);
        this.f27465x = a0Var.f27465x;
        this.f27466y = a0Var.f27466y;
    }
}
