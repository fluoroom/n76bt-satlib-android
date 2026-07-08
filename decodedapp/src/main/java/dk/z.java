package dk;

import eh.h0;
import eh.i0;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class z<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f11313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0 f11315c;

    private z(h0 h0Var, Object obj, i0 i0Var) {
        this.f11313a = h0Var;
        this.f11314b = obj;
        this.f11315c = i0Var;
    }

    public static z c(i0 i0Var, h0 h0Var) {
        Objects.requireNonNull(i0Var, "body == null");
        Objects.requireNonNull(h0Var, "rawResponse == null");
        if (h0Var.G()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new z(h0Var, null, i0Var);
    }

    public static z g(Object obj, h0 h0Var) {
        Objects.requireNonNull(h0Var, "rawResponse == null");
        if (h0Var.G()) {
            return new z(h0Var, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public Object a() {
        return this.f11314b;
    }

    public int b() {
        return this.f11313a.n();
    }

    public eh.y d() {
        return this.f11313a.x();
    }

    public boolean e() {
        return this.f11313a.G();
    }

    public String f() {
        return this.f11313a.H();
    }

    public String toString() {
        return this.f11313a.toString();
    }
}
