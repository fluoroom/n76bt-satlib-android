package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import z9.t;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y f8699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y f8700d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f8701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f8702b = new ConcurrentHashMap();

    private static class b implements y {
        private b() {
        }

        @Override // com.google.gson.y
        public x a(com.google.gson.f fVar, TypeToken typeToken) {
            throw new AssertionError("Factory should not be used");
        }
    }

    static {
        f8699c = new b();
        f8700d = new b();
    }

    public e(t tVar) {
        this.f8701a = tVar;
    }

    private static Object b(t tVar, Class cls) {
        return tVar.u(TypeToken.a(cls), true).a();
    }

    private static y9.b c(Class cls) {
        return (y9.b) cls.getAnnotation(y9.b.class);
    }

    private y f(Class cls, y yVar) {
        y yVar2 = (y) this.f8702b.putIfAbsent(cls, yVar);
        return yVar2 != null ? yVar2 : yVar;
    }

    @Override // com.google.gson.y
    public x a(com.google.gson.f fVar, TypeToken typeToken) {
        y9.b bVarC = c(typeToken.c());
        if (bVarC == null) {
            return null;
        }
        return d(this.f8701a, fVar, typeToken, bVarC, true);
    }

    x d(t tVar, com.google.gson.f fVar, TypeToken typeToken, y9.b bVar, boolean z10) {
        x xVarA;
        Object objB = b(tVar, bVar.value());
        boolean zNullSafe = bVar.nullSafe();
        if (objB instanceof x) {
            xVarA = (x) objB;
        } else if (objB instanceof y) {
            y yVarF = (y) objB;
            if (z10) {
                yVarF = f(typeToken.c(), yVarF);
            }
            xVarA = yVarF.a(fVar, typeToken);
        } else {
            if (!(objB instanceof com.google.gson.j)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objB.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            m mVar = new m(null, objB instanceof com.google.gson.j ? (com.google.gson.j) objB : null, fVar, typeToken, z10 ? f8699c : f8700d, zNullSafe);
            zNullSafe = false;
            xVarA = mVar;
        }
        return (xVarA == null || !zNullSafe) ? xVarA : xVarA.a();
    }

    public boolean e(TypeToken typeToken, y yVar) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(yVar);
        if (yVar == f8699c) {
            return true;
        }
        Class clsC = typeToken.c();
        y yVar2 = (y) this.f8702b.get(clsC);
        if (yVar2 != null) {
            return yVar2 == yVar;
        }
        y9.b bVarC = c(clsC);
        if (bVarC == null) {
            return false;
        }
        Class clsValue = bVarC.value();
        return y.class.isAssignableFrom(clsValue) && f(clsC, (y) b(this.f8701a, clsValue)) == yVar;
    }
}
