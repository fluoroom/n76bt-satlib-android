package p6;

import com.fasterxml.jackson.databind.JavaType;
import d6.b;
import d6.b0;
import d6.h;
import d6.k;
import d6.p;
import d6.r;
import d6.s;
import d6.w;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import q6.f;
import q6.g;
import x6.e0;
import x6.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Serializable {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC0329a f23927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f23928b;

        /* JADX INFO: renamed from: p6.b$a$a, reason: collision with other inner class name */
        public enum EnumC0329a {
            MANAGED_REFERENCE,
            BACK_REFERENCE
        }

        public a(EnumC0329a enumC0329a, String str) {
            this.f23927a = enumC0329a;
            this.f23928b = str;
        }

        public static a a(String str) {
            return new a(EnumC0329a.BACK_REFERENCE, str);
        }

        public static a e(String str) {
            return new a(EnumC0329a.MANAGED_REFERENCE, str);
        }

        public String b() {
            return this.f23928b;
        }

        public boolean c() {
            return this.f23927a == EnumC0329a.BACK_REFERENCE;
        }

        public boolean d() {
            return this.f23927a == EnumC0329a.MANAGED_REFERENCE;
        }
    }

    public static b G0() {
        return x6.d0.f31681a;
    }

    public Boolean A(x6.b bVar) {
        return null;
    }

    public boolean A0(x6.b bVar) {
        return false;
    }

    public boolean B0(x6.k kVar) {
        return false;
    }

    public y C(x6.b bVar) {
        return null;
    }

    public Boolean C0(x6.k kVar) {
        return null;
    }

    public y D(x6.b bVar) {
        return null;
    }

    public boolean D0(Annotation annotation) {
        return false;
    }

    public Boolean E0(x6.d dVar) {
        return null;
    }

    public Boolean F0(x6.k kVar) {
        return null;
    }

    public Object G(x6.d dVar) {
        return null;
    }

    public Object H(x6.b bVar) {
        return null;
    }

    public x6.l J0(r6.q qVar, x6.l lVar, x6.l lVar2) {
        return null;
    }

    public e0 K(x6.b bVar) {
        return null;
    }

    public Class N(x6.d dVar) {
        return null;
    }

    public f.a O(x6.d dVar) {
        return null;
    }

    public w.a Q(x6.b bVar) {
        return null;
    }

    public List R(x6.b bVar) {
        return null;
    }

    public a7.g S(r6.q qVar, x6.k kVar, JavaType javaType) {
        return null;
    }

    public String T(x6.b bVar) {
        return null;
    }

    public String W(x6.b bVar) {
        return null;
    }

    public p.a X(r6.q qVar, x6.b bVar) {
        return Y(bVar);
    }

    public p.a Y(x6.b bVar) {
        return p.a.f();
    }

    public r.b Z(x6.b bVar) {
        return r.b.c();
    }

    protected Annotation a(x6.b bVar, Class cls) {
        return bVar.c(cls);
    }

    public s.a a0(r6.q qVar, x6.b bVar) {
        return s.a.c();
    }

    protected boolean b(x6.b bVar, Class cls) {
        return bVar.g(cls);
    }

    public Integer b0(x6.b bVar) {
        return null;
    }

    protected boolean c(x6.b bVar, Class[] clsArr) {
        return bVar.h(clsArr);
    }

    public a7.g c0(r6.q qVar, x6.k kVar, JavaType javaType) {
        return null;
    }

    public a d0(x6.k kVar) {
        return null;
    }

    public y e0(r6.q qVar, x6.i iVar, y yVar) {
        return null;
    }

    public Object f(x6.b bVar) {
        return null;
    }

    public y f0(x6.d dVar) {
        return null;
    }

    public Object g(x6.b bVar) {
        return null;
    }

    public Object g0(x6.k kVar) {
        return null;
    }

    public h.a h(r6.q qVar, x6.b bVar) {
        if (!A0(bVar)) {
            return null;
        }
        h.a aVarI = i(bVar);
        return aVarI == null ? h.a.DEFAULT : aVarI;
    }

    public Object h0(x6.b bVar) {
        return null;
    }

    public h.a i(x6.b bVar) {
        return null;
    }

    public String[] i0(x6.d dVar) {
        return null;
    }

    public Enum j(Class cls) {
        return null;
    }

    public Boolean j0(x6.b bVar) {
        return null;
    }

    public Object k(x6.k kVar) {
        return null;
    }

    public g.b k0(x6.b bVar) {
        return null;
    }

    public Object l(x6.b bVar) {
        return null;
    }

    public Object l0(x6.b bVar) {
        return null;
    }

    public b0.a m0(x6.b bVar) {
        return b0.a.c();
    }

    public Object n(x6.b bVar) {
        return null;
    }

    public List n0(x6.b bVar) {
        return null;
    }

    public String o0(x6.d dVar) {
        return null;
    }

    public Object p(r6.q qVar, x6.d dVar) {
        return null;
    }

    public a7.g p0(r6.q qVar, x6.d dVar, JavaType javaType) {
        return null;
    }

    public i7.s q0(x6.k kVar) {
        return null;
    }

    public Object r(x6.b bVar) {
        return null;
    }

    public Object r0(x6.d dVar) {
        return null;
    }

    public k.d s(x6.b bVar) {
        return k.d.b();
    }

    public Class[] s0(x6.b bVar) {
        return null;
    }

    public String t(x6.k kVar) {
        return null;
    }

    public y t0(x6.b bVar) {
        return null;
    }

    public Boolean u0(x6.b bVar) {
        if ((bVar instanceof x6.l) && v0((x6.l) bVar)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public b.a v(x6.k kVar) {
        Object objW = w(kVar);
        if (objW != null) {
            return b.a.c(objW);
        }
        return null;
    }

    public boolean v0(x6.l lVar) {
        return false;
    }

    public Object w(x6.k kVar) {
        return null;
    }

    public Boolean w0(x6.b bVar) {
        return null;
    }

    public Object x(x6.b bVar) {
        return null;
    }

    public Boolean x0(r6.q qVar, x6.b bVar) {
        return null;
    }

    public Boolean y0(x6.b bVar) {
        if ((bVar instanceof x6.l) && z0((x6.l) bVar)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public Object z(x6.b bVar) {
        return null;
    }

    public boolean z0(x6.l lVar) {
        return false;
    }

    public e0 L(x6.b bVar, e0 e0Var) {
        return e0Var;
    }

    public l0 e(x6.d dVar, l0 l0Var) {
        return l0Var;
    }

    public JavaType H0(r6.q qVar, x6.b bVar, JavaType javaType) {
        return javaType;
    }

    public JavaType I0(r6.q qVar, x6.b bVar, JavaType javaType) {
        return javaType;
    }

    public void d(r6.q qVar, x6.d dVar, List list) {
    }

    public void o(Class cls, Enum[] enumArr, String[][] strArr) {
    }

    public String[] q(Class cls, Enum[] enumArr, String[] strArr) {
        return strArr;
    }
}
