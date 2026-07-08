package ae;

import be.l3;
import be.z;
import ce.h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import rd.m;
import yd.f;
import yd.g;
import yd.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final boolean a(yd.b bVar) {
        h hVarJ;
        m.e(bVar, "<this>");
        if (bVar instanceof g) {
            j jVar = (j) bVar;
            Field fieldB = c.b(jVar);
            if (fieldB != null ? fieldB.isAccessible() : true) {
                Method methodC = c.c(jVar);
                if (methodC != null ? methodC.isAccessible() : true) {
                    Method methodE = c.e((g) bVar);
                    if (methodE != null ? methodE.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (bVar instanceof j) {
            j jVar2 = (j) bVar;
            Field fieldB2 = c.b(jVar2);
            if (fieldB2 != null ? fieldB2.isAccessible() : true) {
                Method methodC2 = c.c(jVar2);
                if (methodC2 != null ? methodC2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (bVar instanceof j.b) {
            Field fieldB3 = c.b(((j.b) bVar).b());
            if (fieldB3 != null ? fieldB3.isAccessible() : true) {
                Method methodD = c.d((f) bVar);
                if (methodD != null ? methodD.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (bVar instanceof g.a) {
            Field fieldB4 = c.b(((g.a) bVar).b());
            if (fieldB4 != null ? fieldB4.isAccessible() : true) {
                Method methodD2 = c.d((f) bVar);
                if (methodD2 != null ? methodD2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        }
        if (!(bVar instanceof f)) {
            throw new UnsupportedOperationException("Unknown callable: " + bVar + " (" + bVar.getClass() + ')');
        }
        f fVar = (f) bVar;
        Method methodD3 = c.d(fVar);
        if (methodD3 != null ? methodD3.isAccessible() : true) {
            z zVarB = l3.b(bVar);
            Member memberH = (zVarB == null || (hVarJ = zVarB.J()) == null) ? null : hVarJ.h();
            AccessibleObject accessibleObject = memberH instanceof AccessibleObject ? (AccessibleObject) memberH : null;
            if (accessibleObject != null ? accessibleObject.isAccessible() : true) {
                Constructor constructorA = c.a(fVar);
                if (constructorA != null ? constructorA.isAccessible() : true) {
                    return true;
                }
            }
        }
        return false;
    }
}
