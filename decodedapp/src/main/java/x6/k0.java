package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends k implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Class f31766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JavaType f31767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final String f31768e;

    public k0(j0 j0Var, Class cls, String str, JavaType javaType) {
        super(j0Var, null);
        this.f31766c = cls;
        this.f31767d = javaType;
        this.f31768e = str;
    }

    @Override // x6.b
    public String d() {
        return this.f31768e;
    }

    @Override // x6.b
    public Class e() {
        return this.f31767d.r();
    }

    @Override // x6.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!i7.h.H(obj, getClass())) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k0Var.f31766c == this.f31766c && k0Var.f31768e.equals(this.f31768e);
    }

    @Override // x6.b
    public JavaType f() {
        return this.f31767d;
    }

    @Override // x6.b
    public int hashCode() {
        return this.f31768e.hashCode();
    }

    @Override // x6.k
    public Class k() {
        return this.f31766c;
    }

    @Override // x6.k
    public Member n() {
        return null;
    }

    @Override // x6.k
    public Object o(Object obj) {
        throw new IllegalArgumentException("Cannot get virtual property '" + this.f31768e + "'");
    }

    @Override // x6.k
    public void p(Object obj, Object obj2) {
        throw new IllegalArgumentException("Cannot set virtual property '" + this.f31768e + "'");
    }

    @Override // x6.b
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Field b() {
        return null;
    }

    @Override // x6.b
    public String toString() {
        return "[virtual " + l() + "]";
    }

    @Override // x6.k
    public b q(r rVar) {
        return this;
    }
}
