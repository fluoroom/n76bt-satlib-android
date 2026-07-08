package g7;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends i0 {
    protected l0(Class cls) {
        super(cls, false);
    }

    @Override // p6.p
    public boolean d(p6.d0 d0Var, Object obj) {
        return true;
    }

    @Override // g7.i0, p6.p
    public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
        gVar.b1(obj, 0);
        gVar.A0();
    }

    @Override // p6.p
    public void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        hVar.h(gVar, hVar.g(gVar, hVar.d(obj, e6.m.START_OBJECT)));
    }

    public l0(JavaType javaType) {
        super(javaType);
    }
}
