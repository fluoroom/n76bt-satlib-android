package x6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final transient Field f31753c;

    public i(j0 j0Var, Field field, r rVar) {
        super(j0Var, rVar);
        this.f31753c = field;
    }

    @Override // x6.b
    public String d() {
        return this.f31753c.getName();
    }

    @Override // x6.b
    public Class e() {
        return this.f31753c.getType();
    }

    @Override // x6.b
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!i7.h.H(obj, i.class)) {
            return false;
        }
        Field field = ((i) obj).f31753c;
        return field == null ? this.f31753c == null : field.equals(this.f31753c);
    }

    @Override // x6.b
    public JavaType f() {
        return this.f31764a.a(this.f31753c.getGenericType());
    }

    @Override // x6.b
    public int hashCode() {
        return this.f31753c.getName().hashCode();
    }

    @Override // x6.k
    public Class k() {
        return this.f31753c.getDeclaringClass();
    }

    @Override // x6.k
    public Member n() {
        return this.f31753c;
    }

    @Override // x6.k
    public Object o(Object obj) {
        try {
            return this.f31753c.get(obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Failed to getValue() for field " + l() + ": " + e10.getMessage(), e10);
        }
    }

    @Override // x6.k
    public void p(Object obj, Object obj2) {
        try {
            this.f31753c.set(obj, obj2);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Failed to setValue() for field " + l() + ": " + e10.getMessage(), e10);
        }
    }

    @Override // x6.b
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Field b() {
        return this.f31753c;
    }

    public int s() {
        return this.f31753c.getModifiers();
    }

    public boolean t() {
        return Modifier.isTransient(s());
    }

    @Override // x6.b
    public String toString() {
        return "[field " + l() + "]";
    }

    @Override // x6.k
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public i q(r rVar) {
        return new i(this.f31764a, this.f31753c, rVar);
    }
}
