package b7;

import com.fasterxml.jackson.databind.JavaType;
import d6.e0;
import i7.b0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class j extends r implements Serializable {
    public j(JavaType javaType, a7.f fVar, String str, boolean z10, JavaType javaType2) {
        super(javaType, fVar, str, z10, javaType2);
    }

    @Override // a7.e
    public Object c(e6.j jVar, p6.h hVar) {
        return v(jVar, hVar);
    }

    @Override // a7.e
    public Object d(e6.j jVar, p6.h hVar) {
        return v(jVar, hVar);
    }

    @Override // a7.e
    public Object e(e6.j jVar, p6.h hVar) {
        return v(jVar, hVar);
    }

    @Override // a7.e
    public Object f(e6.j jVar, p6.h hVar) {
        return v(jVar, hVar);
    }

    @Override // a7.e
    public a7.e g(p6.d dVar) {
        return dVar == this.f3721c ? this : new j(this, dVar);
    }

    @Override // a7.e
    public e0.a k() {
        return e0.a.WRAPPER_OBJECT;
    }

    protected Object v(e6.j jVar, p6.h hVar) throws p6.m, e6.f {
        Object objH0;
        if (jVar.e() && (objH0 = jVar.H0()) != null) {
            return n(jVar, hVar, objH0);
        }
        e6.m mVarN = jVar.n();
        e6.m mVar = e6.m.START_OBJECT;
        if (mVarN == mVar) {
            e6.m mVarX0 = jVar.X0();
            e6.m mVar2 = e6.m.FIELD_NAME;
            if (mVarX0 != mVar2) {
                hVar.X0(s(), mVar2, "need JSON String that contains type id (for subtype of " + t() + ")", new Object[0]);
            }
        } else if (mVarN != e6.m.FIELD_NAME) {
            hVar.X0(s(), mVar, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + t(), new Object[0]);
        }
        String strC0 = jVar.C0();
        p6.l lVarP = p(hVar, strC0);
        jVar.X0();
        if (this.f3724f && jVar.N0(mVar)) {
            b0 b0VarZ = hVar.z(jVar);
            b0VarZ.Z0();
            b0VarZ.D0(this.f3723e);
            b0VarZ.d1(strC0);
            jVar.k();
            jVar = o6.k.i1(false, b0VarZ.v1(jVar), jVar);
            jVar.X0();
        }
        Object objE = lVarP.e(jVar, hVar);
        e6.m mVarX02 = jVar.X0();
        e6.m mVar3 = e6.m.END_OBJECT;
        if (mVarX02 != mVar3) {
            hVar.X0(s(), mVar3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return objE;
    }

    protected j(j jVar, p6.d dVar) {
        super(jVar, dVar);
    }
}
