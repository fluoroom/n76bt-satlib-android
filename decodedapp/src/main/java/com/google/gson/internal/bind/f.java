package com.google.gson.internal.bind;

import com.google.gson.p;
import com.google.gson.x;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import z9.y;

/* JADX INFO: loaded from: classes3.dex */
class f extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final f f8703a = new f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8704a;

        static {
            int[] iArr = new int[ca.b.values().length];
            f8704a = iArr;
            try {
                iArr[ca.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8704a[ca.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8704a[ca.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8704a[ca.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8704a[ca.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8704a[ca.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private f() {
    }

    private com.google.gson.k f(ca.a aVar, ca.b bVar) throws IOException {
        int i10 = a.f8704a[bVar.ordinal()];
        if (i10 == 3) {
            return new p(aVar.y0());
        }
        if (i10 == 4) {
            return new p(new y(aVar.y0()));
        }
        if (i10 == 5) {
            return new p(Boolean.valueOf(aVar.X()));
        }
        if (i10 == 6) {
            aVar.w0();
            return com.google.gson.m.f8816a;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private com.google.gson.k g(ca.a aVar, ca.b bVar) throws IOException {
        int i10 = a.f8704a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.c();
            return new com.google.gson.h();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.e();
        return new com.google.gson.n();
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.google.gson.k b(ca.a aVar) throws IOException {
        ca.b bVarA0 = aVar.A0();
        com.google.gson.k kVarG = g(aVar, bVarA0);
        if (kVarG == null) {
            return f(aVar, bVarA0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.H()) {
                String strU0 = kVarG instanceof com.google.gson.n ? aVar.u0() : null;
                ca.b bVarA02 = aVar.A0();
                com.google.gson.k kVarG2 = g(aVar, bVarA02);
                boolean z10 = kVarG2 != null;
                if (kVarG2 == null) {
                    kVarG2 = f(aVar, bVarA02);
                }
                if (kVarG instanceof com.google.gson.h) {
                    ((com.google.gson.h) kVarG).l(kVarG2);
                } else {
                    ((com.google.gson.n) kVarG).l(strU0, kVarG2);
                }
                if (z10) {
                    arrayDeque.addLast(kVarG);
                    kVarG = kVarG2;
                }
            } else {
                if (kVarG instanceof com.google.gson.h) {
                    aVar.q();
                } else {
                    aVar.r();
                }
                if (arrayDeque.isEmpty()) {
                    return kVarG;
                }
                kVarG = (com.google.gson.k) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(ca.c cVar, com.google.gson.k kVar) throws IOException {
        if (kVar == null || kVar.h()) {
            cVar.S();
            return;
        }
        if (kVar.j()) {
            p pVarD = kVar.d();
            if (pVarD.u()) {
                cVar.A0(pVarD.q());
                return;
            } else if (pVarD.s()) {
                cVar.C0(pVarD.o());
                return;
            } else {
                cVar.B0(pVarD.f());
                return;
            }
        }
        if (kVar.g()) {
            cVar.k();
            Iterator it = kVar.b().iterator();
            while (it.hasNext()) {
                d(cVar, (com.google.gson.k) it.next());
            }
            cVar.q();
            return;
        }
        if (!kVar.i()) {
            throw new IllegalArgumentException("Couldn't write " + kVar.getClass());
        }
        cVar.l();
        for (Map.Entry entry : kVar.c().m()) {
            cVar.G((String) entry.getKey());
            d(cVar, (com.google.gson.k) entry.getValue());
        }
        cVar.r();
    }
}
