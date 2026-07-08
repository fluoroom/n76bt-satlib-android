package be;

import be.m;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kf.a;
import lf.d;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    public static final class a extends o {

        /* JADX INFO: renamed from: a */
        private final Field f3946a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            rd.m.e(field, "field");
            this.f3946a = field;
        }

        @Override // be.o
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f3946a.getName();
            rd.m.d(name, "getName(...)");
            sb2.append(ve.i0.b(name));
            sb2.append("()");
            Class<?> type = this.f3946a.getType();
            rd.m.d(type, "getType(...)");
            sb2.append(ne.f.f(type));
            return sb2.toString();
        }

        public final Field b() {
            return this.f3946a;
        }
    }

    public static final class b extends o {

        /* JADX INFO: renamed from: a */
        private final Method f3947a;

        /* JADX INFO: renamed from: b */
        private final Method f3948b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super(null);
            rd.m.e(method, "getterMethod");
            this.f3947a = method;
            this.f3948b = method2;
        }

        @Override // be.o
        public String a() {
            return j3.d(this.f3947a);
        }

        public final Method b() {
            return this.f3947a;
        }

        public final Method c() {
            return this.f3948b;
        }
    }

    public static final class c extends o {

        /* JADX INFO: renamed from: a */
        private final he.y0 f3949a;

        /* JADX INFO: renamed from: b */
        private final gf.o f3950b;

        /* JADX INFO: renamed from: c */
        private final a.d f3951c;

        /* JADX INFO: renamed from: d */
        private final jf.d f3952d;

        /* JADX INFO: renamed from: e */
        private final jf.h f3953e;

        /* JADX INFO: renamed from: f */
        private final String f3954f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(he.y0 y0Var, gf.o oVar, a.d dVar, jf.d dVar2, jf.h hVar) {
            String str;
            super(null);
            rd.m.e(y0Var, "descriptor");
            rd.m.e(oVar, "proto");
            rd.m.e(dVar, "signature");
            rd.m.e(dVar2, "nameResolver");
            rd.m.e(hVar, "typeTable");
            this.f3949a = y0Var;
            this.f3950b = oVar;
            this.f3951c = dVar;
            this.f3952d = dVar2;
            this.f3953e = hVar;
            if (dVar.G()) {
                str = dVar2.getString(dVar.x().s()) + dVar2.getString(dVar.x().r());
            } else {
                d.a aVarD = lf.h.d(lf.h.f20571a, oVar, dVar2, hVar, false, 8, null);
                if (aVarD == null) {
                    throw new z2("No field signature for property: " + y0Var);
                }
                String strB = aVarD.b();
                str = ve.i0.b(strB) + c() + "()" + aVarD.c();
            }
            this.f3954f = str;
        }

        private final String c() {
            String string;
            he.m mVarB = this.f3949a.b();
            rd.m.d(mVarB, "getContainingDeclaration(...)");
            if (rd.m.a(this.f3949a.getVisibility(), he.t.f15308d) && (mVarB instanceof cg.m)) {
                gf.c cVarE1 = ((cg.m) mVarB).e1();
                i.f fVar = kf.a.f19841i;
                rd.m.d(fVar, "classModuleName");
                Integer num = (Integer) jf.f.a(cVarE1, fVar);
                if (num == null || (string = this.f3952d.getString(num.intValue())) == null) {
                    string = "main";
                }
                return '$' + mf.g.b(string);
            }
            if (!rd.m.a(this.f3949a.getVisibility(), he.t.f15305a) || !(mVarB instanceof he.n0)) {
                return "";
            }
            he.y0 y0Var = this.f3949a;
            rd.m.c(y0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            cg.s sVarC0 = ((cg.n0) y0Var).c0();
            if (!(sVarC0 instanceof ef.r)) {
                return "";
            }
            ef.r rVar = (ef.r) sVarC0;
            if (rVar.f() == null) {
                return "";
            }
            return '$' + rVar.h().d();
        }

        @Override // be.o
        public String a() {
            return this.f3954f;
        }

        public final he.y0 b() {
            return this.f3949a;
        }

        public final jf.d d() {
            return this.f3952d;
        }

        public final gf.o e() {
            return this.f3950b;
        }

        public final a.d f() {
            return this.f3951c;
        }

        public final jf.h g() {
            return this.f3953e;
        }
    }

    public static final class d extends o {

        /* JADX INFO: renamed from: a */
        private final m.e f3955a;

        /* JADX INFO: renamed from: b */
        private final m.e f3956b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m.e eVar, m.e eVar2) {
            super(null);
            rd.m.e(eVar, "getterSignature");
            this.f3955a = eVar;
            this.f3956b = eVar2;
        }

        @Override // be.o
        public String a() {
            return this.f3955a.a();
        }

        public final m.e b() {
            return this.f3955a;
        }

        public final m.e c() {
            return this.f3956b;
        }
    }

    public /* synthetic */ o(rd.h hVar) {
        this();
    }

    public abstract String a();

    private o() {
    }
}
