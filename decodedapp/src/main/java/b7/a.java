package b7;

import com.fasterxml.jackson.databind.JavaType;
import d6.e0;
import i7.b0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class a extends r implements Serializable {
    public a(JavaType javaType, a7.f fVar, String str, boolean z10, JavaType javaType2) {
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
        return dVar == this.f3721c ? this : new a(this, dVar);
    }

    @Override // a7.e
    public e0.a k() {
        return e0.a.WRAPPER_ARRAY;
    }

    protected Object v(e6.j jVar, p6.h hVar) throws p6.m, e6.f {
        Object objH0;
        if (jVar.e() && (objH0 = jVar.H0()) != null) {
            return n(jVar, hVar, objH0);
        }
        boolean zS0 = jVar.S0();
        String strW = w(jVar, hVar);
        p6.l lVarP = p(hVar, strW);
        if (this.f3724f && !x() && jVar.N0(e6.m.START_OBJECT)) {
            b0 b0VarZ = hVar.z(jVar);
            b0VarZ.Z0();
            b0VarZ.D0(this.f3723e);
            b0VarZ.d1(strW);
            jVar.k();
            jVar = o6.k.i1(false, b0VarZ.v1(jVar), jVar);
            jVar.X0();
        }
        if (zS0 && jVar.n() == e6.m.END_ARRAY) {
            return lVarP.a(hVar);
        }
        Object objE = lVarP.e(jVar, hVar);
        if (zS0) {
            e6.m mVarX0 = jVar.X0();
            e6.m mVar = e6.m.END_ARRAY;
            if (mVarX0 != mVar) {
                hVar.X0(s(), mVar, "expected closing `JsonToken.END_ARRAY` after type information and deserialized value", new Object[0]);
            }
        }
        return objE;
    }

    protected String w(e6.j jVar, p6.h hVar) throws p6.m {
        if (!jVar.S0()) {
            if (this.f3722d != null) {
                return this.f3719a.f();
            }
            hVar.X0(s(), e6.m.START_ARRAY, "need Array value to contain `As.WRAPPER_ARRAY` type information for class " + t(), new Object[0]);
            return null;
        }
        e6.m mVarX0 = jVar.X0();
        e6.m mVar = e6.m.VALUE_STRING;
        if (mVarX0 != mVar && (mVarX0 == null || !mVarX0.g())) {
            hVar.X0(s(), mVar, "need String, Number of Boolean value that contains type id (for subtype of %s)", t());
            return null;
        }
        String strC0 = jVar.C0();
        jVar.X0();
        return strC0;
    }

    protected boolean x() {
        return false;
    }

    public a(a aVar, p6.d dVar) {
        super(aVar, dVar);
    }
}
