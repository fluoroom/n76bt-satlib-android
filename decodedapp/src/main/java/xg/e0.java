package xg;

import hd.i;
import tg.x1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f32103a = new x("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final qd.p f32104b = new qd.p() { // from class: xg.b0
        @Override // qd.p
        public final Object s(Object obj, Object obj2) {
            return e0.d(obj, (i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final qd.p f32105c = new qd.p() { // from class: xg.c0
        @Override // qd.p
        public final Object s(Object obj, Object obj2) {
            return e0.e((x1) obj, (i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final qd.p f32106d = new qd.p() { // from class: xg.d0
        @Override // qd.p
        public final Object s(Object obj, Object obj2) {
            return e0.h((i0) obj, (i.b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, i.b bVar) {
        if (!(bVar instanceof x1)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1 e(x1 x1Var, i.b bVar) {
        if (x1Var != null) {
            return x1Var;
        }
        if (bVar instanceof x1) {
            return (x1) bVar;
        }
        return null;
    }

    public static final void f(hd.i iVar, Object obj) {
        if (obj == f32103a) {
            return;
        }
        if (obj instanceof i0) {
            ((i0) obj).b(iVar);
            return;
        }
        Object objR = iVar.r(null, f32105c);
        rd.m.c(objR, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((x1) objR).v(iVar, obj);
    }

    public static final Object g(hd.i iVar) {
        Object objR = iVar.r(0, f32104b);
        rd.m.b(objR);
        return objR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(i0 i0Var, i.b bVar) {
        if (bVar instanceof x1) {
            x1 x1Var = (x1) bVar;
            i0Var.a(x1Var, x1Var.n(i0Var.f32123a));
        }
        return i0Var;
    }

    public static final Object i(hd.i iVar, Object obj) {
        if (obj == null) {
            obj = g(iVar);
        }
        if (obj == 0) {
            return f32103a;
        }
        if (obj instanceof Integer) {
            return iVar.r(new i0(iVar, ((Number) obj).intValue()), f32106d);
        }
        rd.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((x1) obj).n(iVar);
    }
}
