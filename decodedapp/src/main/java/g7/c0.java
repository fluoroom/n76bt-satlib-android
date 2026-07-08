package g7;

import com.fasterxml.jackson.databind.JavaType;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final HashMap f13574a;

    public static class a extends g7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final JavaType f13575e = com.fasterxml.jackson.databind.type.c.T().a0(Boolean.class);

        public a() {
            super(boolean[].class);
        }

        @Override // g7.a
        public p6.p C(p6.d dVar, Boolean bool) {
            return new a(this, dVar, bool);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public boolean d(p6.d0 d0Var, boolean[] zArr) {
            return zArr.length == 0;
        }

        @Override // g7.i0, p6.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final void f(boolean[] zArr, e6.g gVar, p6.d0 d0Var) {
            int length = zArr.length;
            if (length == 1 && A(d0Var)) {
                D(zArr, gVar, d0Var);
                return;
            }
            gVar.Y0(zArr, length);
            D(zArr, gVar, d0Var);
            gVar.z0();
        }

        @Override // g7.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void D(boolean[] zArr, e6.g gVar, p6.d0 d0Var) {
            for (boolean z10 : zArr) {
                gVar.y0(z10);
            }
        }

        protected a(a aVar, p6.d dVar, Boolean bool) {
            super(aVar, dVar, bool);
        }

        @Override // e7.h
        public e7.h x(a7.h hVar) {
            return this;
        }
    }

    public static class b extends i0 {
        public b() {
            super(char[].class);
        }

        private final void x(e6.g gVar, char[] cArr) {
            int length = cArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                gVar.e1(cArr, i10, 1);
            }
        }

        @Override // g7.i0, p6.p
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public void f(char[] cArr, e6.g gVar, p6.d0 d0Var) {
            if (!d0Var.y0(p6.c0.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                gVar.e1(cArr, 0, cArr.length);
                return;
            }
            gVar.Y0(cArr, cArr.length);
            x(gVar, cArr);
            gVar.z0();
        }

        @Override // p6.p
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public void g(char[] cArr, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
            n6.c cVarG;
            if (d0Var.y0(p6.c0.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                cVarG = hVar.g(gVar, hVar.d(cArr, e6.m.START_ARRAY));
                x(gVar, cArr);
            } else {
                cVarG = hVar.g(gVar, hVar.d(cArr, e6.m.VALUE_STRING));
                gVar.e1(cArr, 0, cArr.length);
            }
            hVar.h(gVar, cVarG);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public boolean d(p6.d0 d0Var, char[] cArr) {
            return cArr.length == 0;
        }
    }

    public static class c extends g7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final JavaType f13576e = com.fasterxml.jackson.databind.type.c.T().a0(Double.TYPE);

        public c() {
            super(double[].class);
        }

        @Override // g7.a
        public p6.p C(p6.d dVar, Boolean bool) {
            return new c(this, dVar, bool);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public boolean d(p6.d0 d0Var, double[] dArr) {
            return dArr.length == 0;
        }

        @Override // g7.i0, p6.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final void f(double[] dArr, e6.g gVar, p6.d0 d0Var) {
            if (dArr.length == 1 && A(d0Var)) {
                D(dArr, gVar, d0Var);
            } else {
                gVar.X(dArr, 0, dArr.length);
            }
        }

        @Override // g7.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void D(double[] dArr, e6.g gVar, p6.d0 d0Var) {
            for (double d10 : dArr) {
                gVar.F0(d10);
            }
        }

        protected c(c cVar, p6.d dVar, Boolean bool) {
            super(cVar, dVar, bool);
        }

        @Override // e7.h
        public e7.h x(a7.h hVar) {
            return this;
        }
    }

    public static class d extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final JavaType f13577e = com.fasterxml.jackson.databind.type.c.T().a0(Float.TYPE);

        public d() {
            super(float[].class);
        }

        @Override // g7.a
        public p6.p C(p6.d dVar, Boolean bool) {
            return new d(this, dVar, bool);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public boolean d(p6.d0 d0Var, float[] fArr) {
            return fArr.length == 0;
        }

        @Override // g7.i0, p6.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final void f(float[] fArr, e6.g gVar, p6.d0 d0Var) {
            int length = fArr.length;
            if (length == 1 && A(d0Var)) {
                D(fArr, gVar, d0Var);
                return;
            }
            gVar.Y0(fArr, length);
            D(fArr, gVar, d0Var);
            gVar.z0();
        }

        @Override // g7.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void D(float[] fArr, e6.g gVar, p6.d0 d0Var) {
            for (float f10 : fArr) {
                gVar.G0(f10);
            }
        }

        public d(d dVar, p6.d dVar2, Boolean bool) {
            super(dVar, dVar2, bool);
        }
    }

    public static class e extends g7.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final JavaType f13578e = com.fasterxml.jackson.databind.type.c.T().a0(Integer.TYPE);

        public e() {
            super(int[].class);
        }

        @Override // g7.a
        public p6.p C(p6.d dVar, Boolean bool) {
            return new e(this, dVar, bool);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public boolean d(p6.d0 d0Var, int[] iArr) {
            return iArr.length == 0;
        }

        @Override // g7.i0, p6.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final void f(int[] iArr, e6.g gVar, p6.d0 d0Var) {
            if (iArr.length == 1 && A(d0Var)) {
                D(iArr, gVar, d0Var);
            } else {
                gVar.h0(iArr, 0, iArr.length);
            }
        }

        @Override // g7.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void D(int[] iArr, e6.g gVar, p6.d0 d0Var) {
            for (int i10 : iArr) {
                gVar.H0(i10);
            }
        }

        protected e(e eVar, p6.d dVar, Boolean bool) {
            super(eVar, dVar, bool);
        }

        @Override // e7.h
        public e7.h x(a7.h hVar) {
            return this;
        }
    }

    public static class f extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final JavaType f13579e = com.fasterxml.jackson.databind.type.c.T().a0(Long.TYPE);

        public f() {
            super(long[].class);
        }

        @Override // g7.a
        public p6.p C(p6.d dVar, Boolean bool) {
            return new f(this, dVar, bool);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public boolean d(p6.d0 d0Var, long[] jArr) {
            return jArr.length == 0;
        }

        @Override // g7.i0, p6.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final void f(long[] jArr, e6.g gVar, p6.d0 d0Var) {
            if (jArr.length == 1 && A(d0Var)) {
                D(jArr, gVar, d0Var);
            } else {
                gVar.p0(jArr, 0, jArr.length);
            }
        }

        @Override // g7.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void D(long[] jArr, e6.g gVar, p6.d0 d0Var) {
            for (long j10 : jArr) {
                gVar.I0(j10);
            }
        }

        public f(f fVar, p6.d dVar, Boolean bool) {
            super(fVar, dVar, bool);
        }
    }

    public static class g extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final JavaType f13580e = com.fasterxml.jackson.databind.type.c.T().a0(Short.TYPE);

        public g() {
            super(short[].class);
        }

        @Override // g7.a
        public p6.p C(p6.d dVar, Boolean bool) {
            return new g(this, dVar, bool);
        }

        @Override // p6.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public boolean d(p6.d0 d0Var, short[] sArr) {
            return sArr.length == 0;
        }

        @Override // g7.i0, p6.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final void f(short[] sArr, e6.g gVar, p6.d0 d0Var) {
            int length = sArr.length;
            if (length == 1 && A(d0Var)) {
                D(sArr, gVar, d0Var);
                return;
            }
            gVar.Y0(sArr, length);
            D(sArr, gVar, d0Var);
            gVar.z0();
        }

        @Override // g7.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public void D(short[] sArr, e6.g gVar, p6.d0 d0Var) {
            for (short s10 : sArr) {
                gVar.H0(s10);
            }
        }

        public g(g gVar, p6.d dVar, Boolean bool) {
            super(gVar, dVar, bool);
        }
    }

    protected static abstract class h extends g7.a {
        protected h(Class cls) {
            super(cls);
        }

        protected h(h hVar, p6.d dVar, Boolean bool) {
            super(hVar, dVar, bool);
        }

        @Override // e7.h
        public final e7.h x(a7.h hVar) {
            return this;
        }
    }

    static {
        HashMap map = new HashMap();
        f13574a = map;
        map.put(boolean[].class.getName(), new a());
        map.put(byte[].class.getName(), new g7.f());
        map.put(char[].class.getName(), new b());
        map.put(short[].class.getName(), new g());
        map.put(int[].class.getName(), new e());
        map.put(long[].class.getName(), new f());
        map.put(float[].class.getName(), new d());
        map.put(double[].class.getName(), new c());
    }

    public static p6.p a(Class cls) {
        return (p6.p) f13574a.get(cls.getName());
    }
}
