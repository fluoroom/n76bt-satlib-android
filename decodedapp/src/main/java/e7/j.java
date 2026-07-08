package e7;

import com.fasterxml.jackson.databind.JavaType;
import d6.k0;
import f7.u;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import p6.b0;
import p6.c0;
import p6.d0;
import p6.p;
import p6.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends d0 implements Serializable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected transient Map f11647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected transient ArrayList f11648y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected transient e6.g f11649z;

    public static final class a extends j {
        public a() {
        }

        @Override // e7.j
        /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
        public a N0(b0 b0Var, q qVar) {
            return new a(this, b0Var, qVar);
        }

        protected a(d0 d0Var, b0 b0Var, q qVar) {
            super(d0Var, b0Var, qVar);
        }
    }

    protected j() {
    }

    private final void J0(e6.g gVar, Object obj, p6.p pVar) throws IOException {
        try {
            pVar.f(obj, gVar, this);
        } catch (Exception e10) {
            throw M0(gVar, e10);
        }
    }

    private final void K0(e6.g gVar, Object obj, p6.p pVar, y yVar) throws IOException {
        try {
            gVar.Z0();
            gVar.C0(yVar.i(this.f23961a));
            pVar.f(obj, gVar, this);
            gVar.A0();
        } catch (Exception e10) {
            throw M0(gVar, e10);
        }
    }

    private IOException M0(e6.g gVar, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strO = i7.h.o(exc);
        if (strO == null) {
            strO = "[no message for " + exc.getClass().getName() + "]";
        }
        return new p6.m(gVar, strO, exc);
    }

    @Override // p6.d0
    public p6.p G0(x6.b bVar, Object obj) throws v6.b {
        p6.p pVar;
        if (obj == null) {
            return null;
        }
        if (obj instanceof p6.p) {
            pVar = (p6.p) obj;
        } else {
            if (!(obj instanceof Class)) {
                q(bVar.f(), "AnnotationIntrospector returned serializer definition of type " + obj.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
            }
            Class cls = (Class) obj;
            if (cls == p.a.class || i7.h.J(cls)) {
                return null;
            }
            if (!p6.p.class.isAssignableFrom(cls)) {
                q(bVar.f(), "AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
            }
            this.f23961a.w();
            pVar = (p6.p) i7.h.l(cls, this.f23961a.b());
        }
        return A(pVar);
    }

    protected Map I0() {
        return y0(c0.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
    }

    protected void L0(e6.g gVar) throws IOException {
        try {
            l0().f(null, gVar, this);
        } catch (Exception e10) {
            throw M0(gVar, e10);
        }
    }

    public abstract j N0(b0 b0Var, q qVar);

    public void O0(e6.g gVar, Object obj, JavaType javaType, p6.p pVar, a7.h hVar) throws IOException {
        boolean zQ0;
        this.f11649z = gVar;
        if (obj == null) {
            L0(gVar);
            return;
        }
        if (javaType != null && !javaType.r().isAssignableFrom(obj.getClass())) {
            C(obj, javaType);
        }
        if (pVar == null) {
            pVar = (javaType == null || !javaType.L()) ? g0(obj.getClass(), null) : e0(javaType, null);
        }
        y yVarG0 = this.f23961a.g0();
        if (yVarG0 == null) {
            zQ0 = this.f23961a.q0(c0.WRAP_ROOT_VALUE);
            if (zQ0) {
                gVar.Z0();
                gVar.C0(this.f23961a.W(obj.getClass()).i(this.f23961a));
            }
        } else if (yVarG0.h()) {
            zQ0 = false;
        } else {
            gVar.Z0();
            gVar.D0(yVarG0.c());
            zQ0 = true;
        }
        try {
            pVar.g(obj, gVar, this, hVar);
            if (zQ0) {
                gVar.A0();
            }
        } catch (Exception e10) {
            throw M0(gVar, e10);
        }
    }

    public void P0(e6.g gVar, Object obj) throws IOException {
        this.f11649z = gVar;
        if (obj == null) {
            L0(gVar);
            return;
        }
        Class<?> cls = obj.getClass();
        p6.p pVarC0 = c0(cls, true, null);
        y yVarG0 = this.f23961a.g0();
        if (yVarG0 == null) {
            if (this.f23961a.q0(c0.WRAP_ROOT_VALUE)) {
                K0(gVar, obj, pVarC0, this.f23961a.W(cls));
                return;
            }
        } else if (!yVarG0.h()) {
            K0(gVar, obj, pVarC0, yVarG0);
            return;
        }
        J0(gVar, obj, pVarC0);
    }

    public void Q0(e6.g gVar, Object obj, JavaType javaType) throws IOException {
        this.f11649z = gVar;
        if (obj == null) {
            L0(gVar);
            return;
        }
        if (!javaType.r().isAssignableFrom(obj.getClass())) {
            C(obj, javaType);
        }
        p6.p pVarB0 = b0(javaType, true, null);
        y yVarG0 = this.f23961a.g0();
        if (yVarG0 == null) {
            if (this.f23961a.q0(c0.WRAP_ROOT_VALUE)) {
                K0(gVar, obj, pVarB0, this.f23961a.T(javaType));
                return;
            }
        } else if (!yVarG0.h()) {
            K0(gVar, obj, pVarB0, yVarG0);
            return;
        }
        J0(gVar, obj, pVarB0);
    }

    public void R0(e6.g gVar, Object obj, JavaType javaType, p6.p pVar) throws IOException {
        this.f11649z = gVar;
        if (obj == null) {
            L0(gVar);
            return;
        }
        if (javaType != null && !javaType.r().isAssignableFrom(obj.getClass())) {
            C(obj, javaType);
        }
        if (pVar == null) {
            pVar = b0(javaType, true, null);
        }
        y yVarG0 = this.f23961a.g0();
        if (yVarG0 == null) {
            if (this.f23961a.q0(c0.WRAP_ROOT_VALUE)) {
                K0(gVar, obj, pVar, javaType == null ? this.f23961a.W(obj.getClass()) : this.f23961a.T(javaType));
                return;
            }
        } else if (!yVarG0.h()) {
            K0(gVar, obj, pVar, yVarG0);
            return;
        }
        J0(gVar, obj, pVar);
    }

    @Override // p6.d0
    public u Y(Object obj, k0 k0Var) {
        k0 k0VarH;
        Map map = this.f11647x;
        if (map == null) {
            this.f11647x = I0();
        } else {
            u uVar = (u) map.get(obj);
            if (uVar != null) {
                return uVar;
            }
        }
        ArrayList arrayList = this.f11648y;
        if (arrayList == null) {
            this.f11648y = new ArrayList(8);
        } else {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                k0VarH = (k0) this.f11648y.get(i10);
                if (k0VarH.a(k0Var)) {
                    break;
                }
            }
        }
        k0VarH = null;
        if (k0VarH == null) {
            k0VarH = k0Var.h(this);
            this.f11648y.add(k0VarH);
        }
        u uVar2 = new u(k0VarH);
        this.f11647x.put(obj, uVar2);
        return uVar2;
    }

    @Override // p6.d0
    public e6.g p0() {
        return this.f11649z;
    }

    @Override // p6.d0
    public Object v0(x6.u uVar, Class cls) {
        if (cls == null) {
            return null;
        }
        this.f23961a.w();
        return i7.h.l(cls, this.f23961a.b());
    }

    @Override // p6.d0
    public boolean w0(Object obj) throws p6.m {
        if (obj == null) {
            return true;
        }
        try {
            return obj.equals(null);
        } catch (Exception e10) {
            B0(obj.getClass(), String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", obj.getClass().getName(), e10.getClass().getName(), i7.h.o(e10)), e10);
            return false;
        }
    }

    protected j(d0 d0Var, b0 b0Var, q qVar) {
        super(d0Var, b0Var, qVar);
    }
}
