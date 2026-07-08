package be;

import be.c3;
import be.o;
import ie.h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kf.a;
import lf.d;
import yd.g;
import yd.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l2 extends z implements yd.j {

    /* JADX INFO: renamed from: v */
    public static final b f3909v = new b(null);

    /* JADX INFO: renamed from: w */
    private static final Object f3910w = new Object();

    /* JADX INFO: renamed from: g */
    private final d1 f3911g;

    /* JADX INFO: renamed from: h */
    private final String f3912h;

    /* JADX INFO: renamed from: r */
    private final String f3913r;

    /* JADX INFO: renamed from: s */
    private final Object f3914s;

    /* JADX INFO: renamed from: t */
    private final dd.j f3915t;

    /* JADX INFO: renamed from: u */
    private final c3.a f3916u;

    public static abstract class a extends z implements yd.f, j.a {
        @Override // be.z
        public d1 I() {
            return b().I();
        }

        @Override // be.z
        public ce.h J() {
            return null;
        }

        @Override // be.z
        public boolean O() {
            return b().O();
        }

        public abstract he.x0 Q();

        /* JADX INFO: renamed from: R */
        public abstract l2 b();

        @Override // yd.b
        public boolean t() {
            return Q().t();
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        private b() {
        }
    }

    public static abstract class c extends a implements j.b {

        /* JADX INFO: renamed from: r */
        static final /* synthetic */ yd.j[] f3917r = {rd.c0.f(new rd.w(c.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

        /* JADX INFO: renamed from: g */
        private final c3.a f3918g = c3.c(new m2(this));

        /* JADX INFO: renamed from: h */
        private final dd.j f3919h = dd.k.a(dd.n.f10910b, new n2(this));

        public static final ce.h U(c cVar) {
            return q2.b(cVar, true);
        }

        public static final he.z0 V(c cVar) {
            he.z0 z0VarF = cVar.b().Q().f();
            if (z0VarF != null) {
                return z0VarF;
            }
            ke.l0 l0VarD = qf.h.d(cVar.b().Q(), ie.h.f16054l.b());
            rd.m.d(l0VarD, "createDefaultGetter(...)");
            return l0VarD;
        }

        @Override // be.z
        public ce.h H() {
            return (ce.h) this.f3919h.getValue();
        }

        @Override // be.l2.a
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public he.z0 Q() {
            Object objD = this.f3918g.d(this, f3917r[0]);
            rd.m.d(objD, "getValue(...)");
            return (he.z0) objD;
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && rd.m.a(b(), ((c) obj).b());
        }

        @Override // yd.b
        public String getName() {
            return "<get-" + b().getName() + '>';
        }

        public int hashCode() {
            return b().hashCode();
        }

        public String toString() {
            return "getter of " + b();
        }
    }

    public static abstract class d extends a implements g.a {

        /* JADX INFO: renamed from: r */
        static final /* synthetic */ yd.j[] f3920r = {rd.c0.f(new rd.w(d.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};

        /* JADX INFO: renamed from: g */
        private final c3.a f3921g = c3.c(new o2(this));

        /* JADX INFO: renamed from: h */
        private final dd.j f3922h = dd.k.a(dd.n.f10910b, new p2(this));

        public static final ce.h U(d dVar) {
            return q2.b(dVar, false);
        }

        public static final he.a1 V(d dVar) {
            he.a1 a1VarH = dVar.b().Q().h();
            if (a1VarH != null) {
                return a1VarH;
            }
            he.y0 y0VarQ = dVar.b().Q();
            h.a aVar = ie.h.f16054l;
            ke.m0 m0VarE = qf.h.e(y0VarQ, aVar.b(), aVar.b());
            rd.m.d(m0VarE, "createDefaultSetter(...)");
            return m0VarE;
        }

        @Override // be.z
        public ce.h H() {
            return (ce.h) this.f3922h.getValue();
        }

        @Override // be.l2.a
        /* JADX INFO: renamed from: W */
        public he.a1 Q() {
            Object objD = this.f3921g.d(this, f3920r[0]);
            rd.m.d(objD, "getValue(...)");
            return (he.a1) objD;
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && rd.m.a(b(), ((d) obj).b());
        }

        @Override // yd.b
        public String getName() {
            return "<set-" + b().getName() + '>';
        }

        public int hashCode() {
            return b().hashCode();
        }

        public String toString() {
            return "setter of " + b();
        }
    }

    private l2(d1 d1Var, String str, String str2, he.y0 y0Var, Object obj) {
        this.f3911g = d1Var;
        this.f3912h = str;
        this.f3913r = str2;
        this.f3914s = obj;
        this.f3915t = dd.k.a(dd.n.f10910b, new j2(this));
        c3.a aVarB = c3.b(y0Var, new k2(this));
        rd.m.d(aVarB, "lazySoft(...)");
        this.f3916u = aVarB;
    }

    public static final he.y0 Q(l2 l2Var) {
        return l2Var.I().t(l2Var.getName(), l2Var.f3913r);
    }

    public static final Field R(l2 l2Var) {
        Class<?> enclosingClass;
        o oVarF = h3.f3881a.f(l2Var.Q());
        if (!(oVarF instanceof o.c)) {
            if (oVarF instanceof o.a) {
                return ((o.a) oVarF).b();
            }
            if ((oVarF instanceof o.b) || (oVarF instanceof o.d)) {
                return null;
            }
            throw new dd.o();
        }
        o.c cVar = (o.c) oVarF;
        he.y0 y0VarB = cVar.b();
        d.a aVarD = lf.h.d(lf.h.f20571a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
        if (aVarD == null) {
            return null;
        }
        if (ve.o.e(y0VarB) || lf.h.f(cVar.e())) {
            enclosingClass = l2Var.I().d().getEnclosingClass();
        } else {
            he.m mVarB = y0VarB.b();
            enclosingClass = mVarB instanceof he.e ? l3.q((he.e) mVarB) : l2Var.I().d();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(aVarD.e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // be.z
    public ce.h H() {
        return f().H();
    }

    @Override // be.z
    public d1 I() {
        return this.f3911g;
    }

    @Override // be.z
    public ce.h J() {
        return f().J();
    }

    @Override // be.z
    public boolean O() {
        return this.f3914s != rd.d.f25938g;
    }

    protected final Member U() {
        if (!Q().P()) {
            return null;
        }
        o oVarF = h3.f3881a.f(Q());
        if (oVarF instanceof o.c) {
            o.c cVar = (o.c) oVarF;
            if (cVar.f().C()) {
                a.c cVarV = cVar.f().v();
                if (!cVarV.v() || !cVarV.t()) {
                    return null;
                }
                return I().s(cVar.d().getString(cVarV.s()), cVar.d().getString(cVarV.r()));
            }
        }
        return Z();
    }

    public final Object V() {
        return ce.o.h(this.f3914s, Q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object W(Member member, Object obj, Object obj2) throws zd.b {
        try {
            Object obj3 = f3910w;
            if ((obj == obj3 || obj2 == obj3) && Q().l0() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objV = O() ? V() : obj;
            if (objV == obj3) {
                objV = null;
            }
            if (!O()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(ae.a.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objV);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objV == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    rd.m.d(cls, "get(...)");
                    objV = l3.g(cls);
                }
                return method.invoke(null, objV);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                rd.m.d(cls2, "get(...)");
                obj = l3.g(cls2);
            }
            return method2.invoke(null, objV, obj);
        } catch (IllegalAccessException e10) {
            throw new zd.b(e10);
        }
    }

    @Override // be.z
    /* JADX INFO: renamed from: X */
    public he.y0 Q() {
        Object objA = this.f3916u.a();
        rd.m.d(objA, "invoke(...)");
        return (he.y0) objA;
    }

    /* JADX INFO: renamed from: Y */
    public abstract c f();

    public final Field Z() {
        return (Field) this.f3915t.getValue();
    }

    public final String a0() {
        return this.f3913r;
    }

    public boolean equals(Object obj) {
        l2 l2VarD = l3.d(obj);
        return l2VarD != null && rd.m.a(I(), l2VarD.I()) && rd.m.a(getName(), l2VarD.getName()) && rd.m.a(this.f3913r, l2VarD.f3913r) && rd.m.a(this.f3914s, l2VarD.f3914s);
    }

    @Override // yd.b
    public String getName() {
        return this.f3912h;
    }

    public int hashCode() {
        return (((I().hashCode() * 31) + getName().hashCode()) * 31) + this.f3913r.hashCode();
    }

    @Override // yd.b
    public boolean t() {
        return false;
    }

    public String toString() {
        return g3.f3870a.k(Q());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l2(d1 d1Var, String str, String str2, Object obj) {
        this(d1Var, str, str2, null, obj);
        rd.m.e(d1Var, "container");
        rd.m.e(str, "name");
        rd.m.e(str2, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l2(d1 d1Var, he.y0 y0Var) {
        rd.m.e(d1Var, "container");
        rd.m.e(y0Var, "descriptor");
        String strD = y0Var.getName().d();
        rd.m.d(strD, "asString(...)");
        this(d1Var, strD, h3.f3881a.f(y0Var).a(), y0Var, rd.d.f25938g);
    }
}
