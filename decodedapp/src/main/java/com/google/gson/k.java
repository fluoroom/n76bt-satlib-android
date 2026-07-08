package com.google.gson;

import java.io.IOException;
import z9.f0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public h b() {
        if (g()) {
            return (h) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public n c() {
        if (i()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public p d() {
        if (j()) {
            return (p) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean g() {
        return this instanceof h;
    }

    public boolean h() {
        return this instanceof m;
    }

    public boolean i() {
        return this instanceof n;
    }

    public boolean j() {
        return this instanceof p;
    }

    public String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            ca.c cVar = new ca.c(f0.c(sb2));
            cVar.v0(u.LENIENT);
            f0.b(this, cVar);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
