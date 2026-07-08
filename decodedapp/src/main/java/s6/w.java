package s6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import t6.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public Object A(p6.h hVar) {
        return hVar.m0(Q(), this, null, "no default no-arguments constructor found", new Object[0]);
    }

    public Object C(p6.h hVar) {
        return hVar.m0(Q(), this, null, "neither default (no-arguments) nor with-arguments Creator found", new Object[0]);
    }

    public Object D(p6.h hVar, Object obj) {
        return hVar.m0(Q(), this, null, "no delegate creator specified", new Object[0]);
    }

    public x6.p G() {
        return null;
    }

    public JavaType H(p6.g gVar) {
        return null;
    }

    public x6.p K() {
        return null;
    }

    public x6.p L() {
        return null;
    }

    public JavaType N(p6.g gVar) {
        return null;
    }

    public u[] O(p6.g gVar) {
        return null;
    }

    public abstract Class Q();

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return K() != null;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return j() || k() || i() || g() || h() || e() || f() || d() || c();
    }

    public Object o(p6.h hVar, BigDecimal bigDecimal) {
        return hVar.m0(Q(), this, null, "no BigDecimal/double/Double-argument constructor/factory method to deserialize from Number value (%s)", bigDecimal);
    }

    public Object p(p6.h hVar, BigInteger bigInteger) {
        return hVar.m0(Q(), this, null, "no BigInteger-argument constructor/factory method to deserialize from Number value (%s)", bigInteger);
    }

    public Object q(p6.h hVar, boolean z10) {
        return hVar.m0(Q(), this, null, "no boolean/Boolean-argument constructor/factory method to deserialize from boolean value (%s)", Boolean.valueOf(z10));
    }

    public Object r(p6.h hVar, double d10) {
        return hVar.m0(Q(), this, null, "no double/Double-argument constructor/factory method to deserialize from Number value (%s)", Double.valueOf(d10));
    }

    public Object s(p6.h hVar, int i10) {
        return hVar.m0(Q(), this, null, "no int/Int-argument constructor/factory method to deserialize from Number value (%s)", Integer.valueOf(i10));
    }

    public Object t(p6.h hVar, long j10) {
        return hVar.m0(Q(), this, null, "no long/Long-argument constructor/factory method to deserialize from Number value (%s)", Long.valueOf(j10));
    }

    public Object v(p6.h hVar, Object[] objArr) {
        return hVar.m0(Q(), this, null, "no creator with arguments specified", new Object[0]);
    }

    public Object w(p6.h hVar, u[] uVarArr, y yVar) {
        return v(hVar, yVar.g(uVarArr));
    }

    public Object x(p6.h hVar, String str) {
        return hVar.m0(Q(), this, hVar.i0(), "no String-argument constructor/factory method to deserialize from String value ('%s')", str);
    }

    public Object z(p6.h hVar, Object obj) {
        return hVar.m0(Q(), this, null, "no array delegate creator specified", new Object[0]);
    }

    public static class a extends w implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Class f26976a;

        public a(Class cls) {
            this.f26976a = cls;
        }

        @Override // s6.w
        public Class Q() {
            return this.f26976a;
        }

        public a(JavaType javaType) {
            this.f26976a = javaType.r();
        }
    }

    public w n(p6.h hVar, p6.c cVar) {
        return this;
    }
}
