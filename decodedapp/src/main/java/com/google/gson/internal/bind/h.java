package com.google.gson.internal.bind;

import com.google.gson.p;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import z9.b0;
import z9.f0;
import z9.t;
import z9.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f8708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f8709b;

    private final class a extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f8710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x f8711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b0 f8712c;

        a(x xVar, x xVar2, b0 b0Var) {
            this.f8710a = xVar;
            this.f8711b = xVar2;
            this.f8712c = b0Var;
        }

        private String e(com.google.gson.k kVar) {
            if (!kVar.j()) {
                if (kVar.h()) {
                    return "null";
                }
                throw new AssertionError();
            }
            p pVarD = kVar.d();
            if (pVarD.u()) {
                return String.valueOf(pVarD.q());
            }
            if (pVarD.s()) {
                return Boolean.toString(pVarD.o());
            }
            if (pVarD.y()) {
                return pVarD.f();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map b(ca.a aVar) throws IOException {
            ca.b bVarA0 = aVar.A0();
            if (bVarA0 == ca.b.NULL) {
                aVar.w0();
                return null;
            }
            Map map = (Map) this.f8712c.a();
            if (bVarA0 != ca.b.BEGIN_ARRAY) {
                aVar.e();
                while (aVar.H()) {
                    z9.x.f33070a.a(aVar);
                    Object objB = this.f8710a.b(aVar);
                    if (map.put(objB, this.f8711b.b(aVar)) != null) {
                        throw new r("duplicate key: " + objB);
                    }
                }
                aVar.r();
                return map;
            }
            aVar.c();
            while (aVar.H()) {
                aVar.c();
                Object objB2 = this.f8710a.b(aVar);
                if (map.put(objB2, this.f8711b.b(aVar)) != null) {
                    throw new r("duplicate key: " + objB2);
                }
                aVar.q();
            }
            aVar.q();
            return map;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(ca.c cVar, Map map) throws IOException {
            if (map == null) {
                cVar.S();
                return;
            }
            if (!h.this.f8709b) {
                cVar.l();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.G(String.valueOf(entry.getKey()));
                    this.f8711b.d(cVar, entry.getValue());
                }
                cVar.r();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry entry2 : map.entrySet()) {
                com.google.gson.k kVarC = this.f8710a.c(entry2.getKey());
                arrayList.add(kVarC);
                arrayList2.add(entry2.getValue());
                z10 |= kVarC.g() || kVarC.i();
            }
            if (!z10) {
                cVar.l();
                int size = arrayList.size();
                while (i10 < size) {
                    cVar.G(e((com.google.gson.k) arrayList.get(i10)));
                    this.f8711b.d(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.r();
                return;
            }
            cVar.k();
            int size2 = arrayList.size();
            while (i10 < size2) {
                cVar.k();
                f0.b((com.google.gson.k) arrayList.get(i10), cVar);
                this.f8711b.d(cVar, arrayList2.get(i10));
                cVar.q();
                i10++;
            }
            cVar.q();
        }
    }

    public h(t tVar, boolean z10) {
        this.f8708a = tVar;
        this.f8709b = z10;
    }

    private x b(com.google.gson.f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? o.f8768f : fVar.l(TypeToken.b(type));
    }

    @Override // com.google.gson.y
    public x a(com.google.gson.f fVar, TypeToken typeToken) {
        Type typeD = typeToken.d();
        Class clsC = typeToken.c();
        if (!Map.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type[] typeArrJ = v.j(typeD, clsC);
        Type type = typeArrJ[0];
        Type type2 = typeArrJ[1];
        return new a(new n(fVar, b(fVar, type), type), new n(fVar, fVar.l(TypeToken.b(type2)), type2), this.f8708a.u(typeToken, false));
    }
}
