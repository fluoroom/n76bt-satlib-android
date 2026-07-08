package sf;

import eg.c1;
import eg.r0;
import he.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f27335a = new i();

    private i() {
    }

    private final b c(List list, h0 h0Var, ee.l lVar) {
        List listH0 = ed.q.H0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listH0.iterator();
        while (it.hasNext()) {
            g gVarF = f(this, it.next(), null, 2, null);
            if (gVarF != null) {
                arrayList.add(gVarF);
            }
        }
        if (h0Var == null) {
            return new b(arrayList, new h(lVar));
        }
        c1 c1VarP = h0Var.o().P(lVar);
        rd.m.d(c1VarP, "getPrimitiveArrayKotlinType(...)");
        return new z(arrayList, c1VarP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 d(ee.l lVar, h0 h0Var) {
        rd.m.e(h0Var, "it");
        c1 c1VarP = h0Var.o().P(lVar);
        rd.m.d(c1VarP, "getPrimitiveArrayKotlinType(...)");
        return c1VarP;
    }

    public static /* synthetic */ g f(i iVar, Object obj, h0 h0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            h0Var = null;
        }
        return iVar.e(obj, h0Var);
    }

    public final b b(List list, r0 r0Var) {
        rd.m.e(list, "value");
        rd.m.e(r0Var, "type");
        return new z(list, r0Var);
    }

    public final g e(Object obj, h0 h0Var) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new x((String) obj);
        }
        if (obj instanceof byte[]) {
            return c(ed.j.e0((byte[]) obj), h0Var, ee.l.f11809r);
        }
        if (obj instanceof short[]) {
            return c(ed.j.l0((short[]) obj), h0Var, ee.l.f11810s);
        }
        if (obj instanceof int[]) {
            return c(ed.j.i0((int[]) obj), h0Var, ee.l.f11811t);
        }
        if (obj instanceof long[]) {
            return c(ed.j.j0((long[]) obj), h0Var, ee.l.f11813v);
        }
        if (obj instanceof char[]) {
            return c(ed.j.f0((char[]) obj), h0Var, ee.l.f11808h);
        }
        if (obj instanceof float[]) {
            return c(ed.j.h0((float[]) obj), h0Var, ee.l.f11812u);
        }
        if (obj instanceof double[]) {
            return c(ed.j.g0((double[]) obj), h0Var, ee.l.f11814w);
        }
        if (obj instanceof boolean[]) {
            return c(ed.j.m0((boolean[]) obj), h0Var, ee.l.f11807g);
        }
        if (obj == null) {
            return new u();
        }
        return null;
    }
}
