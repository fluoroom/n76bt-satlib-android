package f7;

import g7.l0;
import p6.c0;
import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public class q extends l0 {
    public q() {
        super(Object.class);
    }

    @Override // g7.l0, g7.i0, p6.p
    public void f(Object obj, e6.g gVar, d0 d0Var) {
        if (d0Var.y0(c0.FAIL_ON_EMPTY_BEANS)) {
            x(d0Var, obj);
        }
        super.f(obj, gVar, d0Var);
    }

    @Override // g7.l0, p6.p
    public void g(Object obj, e6.g gVar, d0 d0Var, a7.h hVar) {
        if (d0Var.y0(c0.FAIL_ON_EMPTY_BEANS)) {
            x(d0Var, obj);
        }
        super.g(obj, gVar, d0Var, hVar);
    }

    protected void x(d0 d0Var, Object obj) {
        Class<?> cls = obj.getClass();
        if (i7.u.c(cls)) {
            d0Var.r(c(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS). This appears to be a native image, in which case you may need to configure reflection for the class that is to be serialized", cls.getName()));
        } else {
            d0Var.r(c(), String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", cls.getName()));
        }
    }

    public q(Class cls) {
        super(cls);
    }
}
