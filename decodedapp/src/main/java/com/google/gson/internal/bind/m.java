package com.google.gson.internal.bind;

import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import j$.util.Objects;
import z9.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.j f8748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.gson.f f8749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TypeToken f8750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f8751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f8752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f8753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile x f8754g;

    private final class b implements com.google.gson.i {
        private b() {
        }
    }

    private static final class c implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TypeToken f8756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f8757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class f8758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.google.gson.j f8759d;

        c(Object obj, TypeToken typeToken, boolean z10, Class cls) {
            com.google.gson.j jVar = obj instanceof com.google.gson.j ? (com.google.gson.j) obj : null;
            this.f8759d = jVar;
            if (jVar != null) {
                this.f8756a = typeToken;
                this.f8757b = z10;
                this.f8758c = cls;
            } else {
                Objects.requireNonNull(obj);
                throw new IllegalArgumentException("Type adapter " + obj.getClass().getName() + " must implement JsonSerializer or JsonDeserializer");
            }
        }

        @Override // com.google.gson.y
        public x a(com.google.gson.f fVar, TypeToken typeToken) {
            TypeToken typeToken2 = this.f8756a;
            if (typeToken2 != null ? typeToken2.equals(typeToken) || (this.f8757b && this.f8756a.d() == typeToken.c()) : this.f8758c.isAssignableFrom(typeToken.c())) {
                return new m(null, this.f8759d, fVar, typeToken, this);
            }
            return null;
        }
    }

    public m(q qVar, com.google.gson.j jVar, com.google.gson.f fVar, TypeToken typeToken, y yVar, boolean z10) {
        this.f8752e = new b();
        this.f8748a = jVar;
        this.f8749b = fVar;
        this.f8750c = typeToken;
        this.f8751d = yVar;
        this.f8753f = z10;
    }

    private x f() {
        x xVar = this.f8754g;
        if (xVar != null) {
            return xVar;
        }
        x xVarN = this.f8749b.n(this.f8751d, this.f8750c);
        this.f8754g = xVarN;
        return xVarN;
    }

    public static y g(TypeToken typeToken, Object obj) {
        return new c(obj, typeToken, typeToken.d() == typeToken.c(), null);
    }

    @Override // com.google.gson.x
    public Object b(ca.a aVar) {
        if (this.f8748a == null) {
            return f().b(aVar);
        }
        com.google.gson.k kVarA = f0.a(aVar);
        if (this.f8753f && kVarA.h()) {
            return null;
        }
        return this.f8748a.a(kVarA, this.f8750c.d(), this.f8752e);
    }

    @Override // com.google.gson.x
    public void d(ca.c cVar, Object obj) {
        f().d(cVar, obj);
    }

    @Override // com.google.gson.internal.bind.l
    public x e() {
        return f();
    }

    public m(q qVar, com.google.gson.j jVar, com.google.gson.f fVar, TypeToken typeToken, y yVar) {
        this(qVar, jVar, fVar, typeToken, yVar, true);
    }
}
