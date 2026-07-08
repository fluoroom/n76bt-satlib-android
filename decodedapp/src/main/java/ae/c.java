package ae;

import be.l2;
import be.l3;
import be.v2;
import be.z;
import ce.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import rd.m;
import yd.f;
import yd.g;
import yd.j;
import yd.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final Constructor a(f fVar) {
        h hVarH;
        m.e(fVar, "<this>");
        z zVarB = l3.b(fVar);
        Member memberH = (zVarB == null || (hVarH = zVarB.H()) == null) ? null : hVarH.h();
        if (memberH instanceof Constructor) {
            return (Constructor) memberH;
        }
        return null;
    }

    public static final Field b(j jVar) {
        m.e(jVar, "<this>");
        l2 l2VarD = l3.d(jVar);
        if (l2VarD != null) {
            return l2VarD.Z();
        }
        return null;
    }

    public static final Method c(j jVar) {
        m.e(jVar, "<this>");
        return d(jVar.f());
    }

    public static final Method d(f fVar) {
        h hVarH;
        m.e(fVar, "<this>");
        z zVarB = l3.b(fVar);
        Member memberH = (zVarB == null || (hVarH = zVarB.H()) == null) ? null : hVarH.h();
        if (memberH instanceof Method) {
            return (Method) memberH;
        }
        return null;
    }

    public static final Method e(g gVar) {
        m.e(gVar, "<this>");
        return d(gVar.h());
    }

    public static final Type f(yd.m mVar) {
        m.e(mVar, "<this>");
        Type typeA = ((v2) mVar).a();
        return typeA == null ? s.f(mVar) : typeA;
    }
}
