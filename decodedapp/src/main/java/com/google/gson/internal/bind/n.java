package com.google.gson.internal.bind;

import com.google.gson.internal.bind.k;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes3.dex */
final class n extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.f f8760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f8761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f8762c;

    n(com.google.gson.f fVar, x xVar, Type type) {
        this.f8760a = fVar;
        this.f8761b = xVar;
        this.f8762c = type;
    }

    private static Type e(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    private static boolean f(x xVar) {
        x xVarE;
        while ((xVar instanceof l) && (xVarE = ((l) xVar).e()) != xVar) {
            xVar = xVarE;
        }
        return xVar instanceof k.c;
    }

    @Override // com.google.gson.x
    public Object b(ca.a aVar) {
        return this.f8761b.b(aVar);
    }

    @Override // com.google.gson.x
    public void d(ca.c cVar, Object obj) {
        x xVarL = this.f8761b;
        Type typeE = e(this.f8762c, obj);
        if (typeE != this.f8762c) {
            xVarL = this.f8760a.l(TypeToken.b(typeE));
            if ((xVarL instanceof k.c) && !f(this.f8761b)) {
                xVarL = this.f8761b;
            }
        }
        xVarL.d(cVar, obj);
    }
}
