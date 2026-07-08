package com.google.gson;

import com.google.gson.reflect.TypeToken;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import z9.d0;
import z9.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    static final com.google.gson.e A = com.google.gson.e.f8627d;
    static final String B = null;
    static final com.google.gson.d C = com.google.gson.b.f8619a;
    static final w D = v.f8834a;
    static final w E = v.f8835b;

    /* JADX INFO: renamed from: z */
    static final u f8632z = null;

    /* JADX INFO: renamed from: a */
    private final ThreadLocal f8633a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentMap f8634b;

    /* JADX INFO: renamed from: c */
    private final z9.t f8635c;

    /* JADX INFO: renamed from: d */
    private final com.google.gson.internal.bind.e f8636d;

    /* JADX INFO: renamed from: e */
    final List f8637e;

    /* JADX INFO: renamed from: f */
    final z9.u f8638f;

    /* JADX INFO: renamed from: g */
    final com.google.gson.d f8639g;

    /* JADX INFO: renamed from: h */
    final Map f8640h;

    /* JADX INFO: renamed from: i */
    final boolean f8641i;

    /* JADX INFO: renamed from: j */
    final boolean f8642j;

    /* JADX INFO: renamed from: k */
    final boolean f8643k;

    /* JADX INFO: renamed from: l */
    final boolean f8644l;

    /* JADX INFO: renamed from: m */
    final com.google.gson.e f8645m;

    /* JADX INFO: renamed from: n */
    final u f8646n;

    /* JADX INFO: renamed from: o */
    final boolean f8647o;

    /* JADX INFO: renamed from: p */
    final boolean f8648p;

    /* JADX INFO: renamed from: q */
    final String f8649q;

    /* JADX INFO: renamed from: r */
    final int f8650r;

    /* JADX INFO: renamed from: s */
    final int f8651s;

    /* JADX INFO: renamed from: t */
    final s f8652t;

    /* JADX INFO: renamed from: u */
    final List f8653u;

    /* JADX INFO: renamed from: v */
    final List f8654v;

    /* JADX INFO: renamed from: w */
    final w f8655w;

    /* JADX INFO: renamed from: x */
    final w f8656x;

    /* JADX INFO: renamed from: y */
    final List f8657y;

    class a extends x {
        a() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e */
        public Double b(ca.a aVar) throws IOException {
            if (aVar.A0() != ca.b.NULL) {
                return Double.valueOf(aVar.h0());
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f */
        public void d(ca.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
                return;
            }
            double dDoubleValue = number.doubleValue();
            f.d(dDoubleValue);
            cVar.x0(dDoubleValue);
        }
    }

    class b extends x {
        b() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e */
        public Float b(ca.a aVar) throws IOException {
            if (aVar.A0() != ca.b.NULL) {
                return Float.valueOf((float) aVar.h0());
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f */
        public void d(ca.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
                return;
            }
            float fFloatValue = number.floatValue();
            f.d(fFloatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(fFloatValue);
            }
            cVar.A0(number);
        }
    }

    class c extends x {
        c() {
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e */
        public Number b(ca.a aVar) throws IOException {
            if (aVar.A0() != ca.b.NULL) {
                return Long.valueOf(aVar.t0());
            }
            aVar.w0();
            return null;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f */
        public void d(ca.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.B0(number.toString());
            }
        }
    }

    class d extends x {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ x f8660a;

        d(x xVar) {
            this.f8660a = xVar;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e */
        public AtomicLong b(ca.a aVar) {
            return new AtomicLong(((Number) this.f8660a.b(aVar)).longValue());
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f */
        public void d(ca.c cVar, AtomicLong atomicLong) {
            this.f8660a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    class e extends x {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ x f8661a;

        e(x xVar) {
            this.f8661a = xVar;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: e */
        public AtomicLongArray b(ca.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.c();
            while (aVar.H()) {
                arrayList.add(Long.valueOf(((Number) this.f8661a.b(aVar)).longValue()));
            }
            aVar.q();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.x
        /* JADX INFO: renamed from: f */
        public void d(ca.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.k();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f8661a.d(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.q();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.f$f */
    static class C0127f extends com.google.gson.internal.bind.l {

        /* JADX INFO: renamed from: a */
        private x f8662a = null;

        C0127f() {
        }

        private x f() {
            x xVar = this.f8662a;
            if (xVar != null) {
                return xVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.x
        public Object b(ca.a aVar) {
            return f().b(aVar);
        }

        @Override // com.google.gson.x
        public void d(ca.c cVar, Object obj) {
            f().d(cVar, obj);
        }

        @Override // com.google.gson.internal.bind.l
        public x e() {
            return f();
        }

        public void g(x xVar) {
            if (this.f8662a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f8662a = xVar;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f() {
        z9.u uVar = z9.u.f33049g;
        com.google.gson.d dVar = C;
        Map map = Collections.EMPTY_MAP;
        com.google.gson.e eVar = A;
        u uVar2 = f8632z;
        s sVar = s.f8822a;
        String str = B;
        List list = Collections.EMPTY_LIST;
        this(uVar, dVar, map, false, false, false, true, eVar, uVar2, false, true, sVar, str, 2, 2, list, list, list, D, E, list);
    }

    private static void a(Object obj, ca.a aVar) {
        if (obj != null) {
            try {
                if (aVar.A0() == ca.b.END_DOCUMENT) {
                } else {
                    throw new r("JSON document was not fully consumed.");
                }
            } catch (ca.d e10) {
                throw new r(e10);
            } catch (IOException e11) {
                throw new l(e11);
            }
        }
    }

    private static x b(x xVar) {
        return new d(xVar).a();
    }

    private static x c(x xVar) {
        return new e(xVar).a();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private x e(boolean z10) {
        return z10 ? com.google.gson.internal.bind.o.f8784v : new a();
    }

    private x f(boolean z10) {
        return z10 ? com.google.gson.internal.bind.o.f8783u : new b();
    }

    private static x o(s sVar) {
        return sVar == s.f8822a ? com.google.gson.internal.bind.o.f8782t : new c();
    }

    public Object g(ca.a aVar, TypeToken typeToken) {
        boolean z10;
        u uVarG = aVar.G();
        u uVar = this.f8646n;
        if (uVar != null) {
            aVar.F0(uVar);
        } else if (aVar.G() == u.LEGACY_STRICT) {
            aVar.F0(u.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        aVar.A0();
                        z10 = false;
                    } catch (AssertionError e10) {
                        throw new AssertionError("AssertionError (GSON 2.13.2): " + e10.getMessage(), e10);
                    } catch (IllegalStateException e11) {
                        throw new r(e11);
                    }
                } catch (IOException e12) {
                    throw new r(e12);
                }
            } finally {
                aVar.F0(uVarG);
            }
        } catch (EOFException e13) {
            e = e13;
            z10 = true;
        }
        try {
            x xVarL = l(typeToken);
            Object objB = xVarL.b(aVar);
            Class clsB = d0.b(typeToken.c());
            if (objB != null && !clsB.isInstance(objB)) {
                throw new ClassCastException("Type adapter '" + xVarL + "' returned wrong type; requested " + typeToken.c() + " but got instance of " + objB.getClass() + "\nVerify that the adapter was registered for the correct type.");
            }
            return objB;
        } catch (EOFException e14) {
            e = e14;
            if (!z10) {
                throw new r(e);
            }
            aVar.F0(uVarG);
            return null;
        }
    }

    public Object h(Reader reader, TypeToken typeToken) {
        ca.a aVarP = p(reader);
        Object objG = g(aVarP, typeToken);
        a(objG, aVarP);
        return objG;
    }

    public Object i(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        return h(new StringReader(str), typeToken);
    }

    public Object j(String str, Class cls) {
        return i(str, TypeToken.a(cls));
    }

    public Object k(String str, Type type) {
        return i(str, TypeToken.b(type));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0051, code lost:
    
        r2.g(r4);
        r0.put(r7, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.gson.x l(com.google.gson.reflect.TypeToken r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            j$.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = r6.f8634b
            java.lang.Object r0 = r0.get(r7)
            com.google.gson.x r0 = (com.google.gson.x) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal r0 = r6.f8633a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal r1 = r6.f8633a
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            com.google.gson.x r1 = (com.google.gson.x) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            com.google.gson.f$f r2 = new com.google.gson.f$f     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List r3 = r6.f8637e     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            com.google.gson.y r4 = (com.google.gson.y) r4     // Catch: java.lang.Throwable -> L58
            com.google.gson.x r4 = r4.a(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.g(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L82
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal r2 = r6.f8633a
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap r7 = r6.f8634b
            r7.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.13.2) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L82:
            if (r1 == 0) goto L89
            java.lang.ThreadLocal r0 = r6.f8633a
            r0.remove()
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.f.l(com.google.gson.reflect.TypeToken):com.google.gson.x");
    }

    public x m(Class cls) {
        return l(TypeToken.a(cls));
    }

    public x n(y yVar, TypeToken typeToken) {
        Objects.requireNonNull(yVar, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        if (this.f8636d.e(typeToken, yVar)) {
            yVar = this.f8636d;
        }
        boolean z10 = false;
        for (y yVar2 : this.f8637e) {
            if (z10) {
                x xVarA = yVar2.a(this, typeToken);
                if (xVarA != null) {
                    return xVarA;
                }
            } else if (yVar2 == yVar) {
                z10 = true;
            }
        }
        if (!z10) {
            return l(typeToken);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
    }

    public ca.a p(Reader reader) {
        ca.a aVar = new ca.a(reader);
        u uVar = this.f8646n;
        if (uVar == null) {
            uVar = u.LEGACY_STRICT;
        }
        aVar.F0(uVar);
        return aVar;
    }

    public ca.c q(Writer writer) throws IOException {
        if (this.f8643k) {
            writer.write(")]}'\n");
        }
        ca.c cVar = new ca.c(writer);
        cVar.p0(this.f8645m);
        cVar.t0(this.f8644l);
        u uVar = this.f8646n;
        if (uVar == null) {
            uVar = u.LEGACY_STRICT;
        }
        cVar.v0(uVar);
        cVar.u0(this.f8641i);
        return cVar;
    }

    public String r(k kVar) {
        StringBuilder sb2 = new StringBuilder();
        v(kVar, sb2);
        return sb2.toString();
    }

    public String s(Object obj) {
        return obj == null ? r(m.f8816a) : t(obj, obj.getClass());
    }

    public String t(Object obj, Type type) {
        StringBuilder sb2 = new StringBuilder();
        x(obj, type, sb2);
        return sb2.toString();
    }

    public String toString() {
        return "{serializeNulls:" + this.f8641i + ",factories:" + this.f8637e + ",instanceCreators:" + this.f8635c + "}";
    }

    public void u(k kVar, ca.c cVar) {
        u uVarV = cVar.v();
        boolean zW = cVar.w();
        boolean zS = cVar.s();
        cVar.t0(this.f8644l);
        cVar.u0(this.f8641i);
        u uVar = this.f8646n;
        if (uVar != null) {
            cVar.v0(uVar);
        } else if (cVar.v() == u.LEGACY_STRICT) {
            cVar.v0(u.LENIENT);
        }
        try {
            try {
                f0.b(kVar, cVar);
            } catch (IOException e10) {
                throw new l(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.v0(uVarV);
            cVar.t0(zW);
            cVar.u0(zS);
        }
    }

    public void v(k kVar, Appendable appendable) {
        try {
            u(kVar, q(f0.c(appendable)));
        } catch (IOException e10) {
            throw new l(e10);
        }
    }

    public void w(Object obj, Type type, ca.c cVar) {
        x xVarL = l(TypeToken.b(type));
        u uVarV = cVar.v();
        u uVar = this.f8646n;
        if (uVar != null) {
            cVar.v0(uVar);
        } else if (cVar.v() == u.LEGACY_STRICT) {
            cVar.v0(u.LENIENT);
        }
        boolean zW = cVar.w();
        boolean zS = cVar.s();
        cVar.t0(this.f8644l);
        cVar.u0(this.f8641i);
        try {
            try {
                try {
                    xVarL.d(cVar, obj);
                } catch (IOException e10) {
                    throw new l(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.v0(uVarV);
            cVar.t0(zW);
            cVar.u0(zS);
        }
    }

    public void x(Object obj, Type type, Appendable appendable) {
        try {
            w(obj, type, q(f0.c(appendable)));
        } catch (IOException e10) {
            throw new l(e10);
        }
    }

    f(z9.u uVar, com.google.gson.d dVar, Map map, boolean z10, boolean z11, boolean z12, boolean z13, com.google.gson.e eVar, u uVar2, boolean z14, boolean z15, s sVar, String str, int i10, int i11, List list, List list2, List list3, w wVar, w wVar2, List list4) {
        this.f8633a = new ThreadLocal();
        this.f8634b = new ConcurrentHashMap();
        this.f8638f = uVar;
        this.f8639g = dVar;
        this.f8640h = map;
        z9.t tVar = new z9.t(map, z15, list4);
        this.f8635c = tVar;
        this.f8641i = z10;
        this.f8642j = z11;
        this.f8643k = z12;
        this.f8644l = z13;
        this.f8645m = eVar;
        this.f8646n = uVar2;
        this.f8647o = z14;
        this.f8648p = z15;
        this.f8652t = sVar;
        this.f8649q = str;
        this.f8650r = i10;
        this.f8651s = i11;
        this.f8653u = list;
        this.f8654v = list2;
        this.f8655w = wVar;
        this.f8656x = wVar2;
        this.f8657y = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.o.W);
        arrayList.add(com.google.gson.internal.bind.j.e(wVar));
        arrayList.add(uVar);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.o.C);
        arrayList.add(com.google.gson.internal.bind.o.f8775m);
        arrayList.add(com.google.gson.internal.bind.o.f8769g);
        arrayList.add(com.google.gson.internal.bind.o.f8771i);
        arrayList.add(com.google.gson.internal.bind.o.f8773k);
        x xVarO = o(sVar);
        arrayList.add(com.google.gson.internal.bind.o.c(Long.TYPE, Long.class, xVarO));
        arrayList.add(com.google.gson.internal.bind.o.c(Double.TYPE, Double.class, e(z14)));
        arrayList.add(com.google.gson.internal.bind.o.c(Float.TYPE, Float.class, f(z14)));
        arrayList.add(com.google.gson.internal.bind.i.e(wVar2));
        arrayList.add(com.google.gson.internal.bind.o.f8777o);
        arrayList.add(com.google.gson.internal.bind.o.f8779q);
        arrayList.add(com.google.gson.internal.bind.o.b(AtomicLong.class, b(xVarO)));
        arrayList.add(com.google.gson.internal.bind.o.b(AtomicLongArray.class, c(xVarO)));
        arrayList.add(com.google.gson.internal.bind.o.f8781s);
        arrayList.add(com.google.gson.internal.bind.o.f8786x);
        arrayList.add(com.google.gson.internal.bind.o.E);
        arrayList.add(com.google.gson.internal.bind.o.G);
        arrayList.add(com.google.gson.internal.bind.o.b(BigDecimal.class, com.google.gson.internal.bind.o.f8788z));
        arrayList.add(com.google.gson.internal.bind.o.b(BigInteger.class, com.google.gson.internal.bind.o.A));
        arrayList.add(com.google.gson.internal.bind.o.b(z9.y.class, com.google.gson.internal.bind.o.B));
        arrayList.add(com.google.gson.internal.bind.o.I);
        arrayList.add(com.google.gson.internal.bind.o.K);
        arrayList.add(com.google.gson.internal.bind.o.O);
        arrayList.add(com.google.gson.internal.bind.o.Q);
        arrayList.add(com.google.gson.internal.bind.o.U);
        arrayList.add(com.google.gson.internal.bind.o.M);
        arrayList.add(com.google.gson.internal.bind.o.f8766d);
        arrayList.add(com.google.gson.internal.bind.c.f8690c);
        arrayList.add(com.google.gson.internal.bind.o.S);
        if (com.google.gson.internal.sql.d.f8810a) {
            arrayList.add(com.google.gson.internal.sql.d.f8814e);
            arrayList.add(com.google.gson.internal.sql.d.f8813d);
            arrayList.add(com.google.gson.internal.sql.d.f8815f);
        }
        arrayList.add(com.google.gson.internal.bind.a.f8684c);
        arrayList.add(com.google.gson.internal.bind.o.f8764b);
        arrayList.add(new com.google.gson.internal.bind.b(tVar));
        arrayList.add(new com.google.gson.internal.bind.h(tVar, z11));
        com.google.gson.internal.bind.e eVar2 = new com.google.gson.internal.bind.e(tVar);
        this.f8636d = eVar2;
        arrayList.add(eVar2);
        arrayList.add(com.google.gson.internal.bind.o.X);
        arrayList.add(new com.google.gson.internal.bind.k(tVar, dVar, uVar, eVar2, list4));
        this.f8637e = DesugarCollections.unmodifiableList(arrayList);
    }
}
