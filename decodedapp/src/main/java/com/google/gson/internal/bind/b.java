package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import z9.b0;
import z9.t;
import z9.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f8687a;

    private static final class a extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f8688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0 f8689b;

        a(x xVar, b0 b0Var) {
            this.f8688a = xVar;
            this.f8689b = b0Var;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection b(ca.a aVar) throws IOException {
            if (aVar.A0() == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            Collection collection = (Collection) this.f8689b.a();
            aVar.c();
            while (aVar.H()) {
                collection.add(this.f8688a.b(aVar));
            }
            aVar.q();
            return collection;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Collection collection) throws IOException {
            if (collection == null) {
                cVar.S();
                return;
            }
            cVar.k();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.f8688a.d(cVar, it.next());
            }
            cVar.q();
        }
    }

    public b(t tVar) {
        this.f8687a = tVar;
    }

    @Override // com.google.gson.y
    public x a(com.google.gson.f fVar, TypeToken typeToken) {
        Type typeD = typeToken.d();
        Class clsC = typeToken.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = v.h(typeD, clsC);
        return new a(new n(fVar, fVar.l(TypeToken.b(typeH)), typeH), this.f8687a.u(typeToken, false));
    }
}
