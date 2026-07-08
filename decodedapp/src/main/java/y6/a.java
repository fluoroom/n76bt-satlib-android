package y6;

import d6.h;
import i7.h;
import i7.u;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import r6.q;
import x6.d;
import x6.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: y6.a$a, reason: collision with other inner class name */
    static class C0438a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final d f32440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final q f32441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final p6.b f32442c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final List f32443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final f f32444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected final b[] f32445f;

        C0438a(d dVar, p6.b bVar, q qVar) {
            this.f32440a = dVar;
            this.f32442c = bVar;
            this.f32441b = qVar;
            b[] bVarArrB = c.c().b(dVar.e());
            this.f32445f = bVarArrB;
            f fVarR = null;
            if (bVarArrB == null) {
                this.f32443d = dVar.q();
                this.f32444e = null;
                return;
            }
            int length = bVarArrB.length;
            if (length != 0) {
                List listQ = dVar.q();
                this.f32443d = listQ;
                Iterator it = listQ.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f fVar = (f) it.next();
                    if (fVar.x() == length) {
                        for (int i10 = 0; i10 < length; i10++) {
                            if (!fVar.A(i10).equals(this.f32445f[i10].f32446a)) {
                                break;
                            }
                        }
                        fVarR = fVar;
                        break loop0;
                    }
                }
            } else {
                fVarR = dVar.r();
                this.f32443d = Collections.singletonList(fVarR);
            }
            if (fVarR != null) {
                this.f32444e = fVarR;
                return;
            }
            throw new IllegalArgumentException("Failed to find the canonical Record constructor of type " + h.G(this.f32440a.f()));
        }

        public f a(List list) {
            for (f fVar : this.f32443d) {
                h.a aVarH = this.f32442c.h(this.f32441b, fVar);
                if (aVarH != null && h.a.DISABLED != aVarH && (h.a.DELEGATING == aVarH || fVar != this.f32444e)) {
                    return null;
                }
            }
            b[] bVarArr = this.f32445f;
            if (bVarArr == null) {
                return null;
            }
            for (b bVar : bVarArr) {
                list.add(bVar.f32447b);
            }
            return this.f32444e;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f32446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f32447b;

        public b(Class cls, String str) {
            this.f32446a = cls;
            this.f32447b = str;
        }
    }

    static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final c f32448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final RuntimeException f32449e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f32450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f32451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f32452c;

        static {
            c cVar = null;
            try {
                e = null;
                cVar = new c();
            } catch (RuntimeException e10) {
                e = e10;
            }
            f32448d = cVar;
            f32449e = e;
        }

        private c() {
            try {
                this.f32450a = Class.class.getMethod("getRecordComponents", null);
                Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
                this.f32451b = cls.getMethod("getName", null);
                this.f32452c = cls.getMethod("getType", null);
            } catch (Exception e10) {
                throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", e10.getClass().getName(), e10.getMessage()), e10);
            }
        }

        public static c c() {
            RuntimeException runtimeException = f32449e;
            if (runtimeException == null) {
                return f32448d;
            }
            throw runtimeException;
        }

        public String[] a(Class cls) {
            Object[] objArrD = d(cls);
            if (objArrD == null) {
                return null;
            }
            String[] strArr = new String[objArrD.length];
            for (int i10 = 0; i10 < objArrD.length; i10++) {
                try {
                    strArr[i10] = (String) this.f32451b.invoke(objArrD[i10], null);
                } catch (Exception e10) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i10), Integer.valueOf(objArrD.length), i7.h.Y(cls)), e10);
                }
            }
            return strArr;
        }

        public b[] b(Class cls) {
            Object[] objArrD = d(cls);
            if (objArrD == null) {
                return null;
            }
            b[] bVarArr = new b[objArrD.length];
            for (int i10 = 0; i10 < objArrD.length; i10++) {
                try {
                    try {
                        bVarArr[i10] = new b((Class) this.f32452c.invoke(objArrD[i10], null), (String) this.f32451b.invoke(objArrD[i10], null));
                    } catch (Exception e10) {
                        throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", Integer.valueOf(i10), Integer.valueOf(objArrD.length), i7.h.Y(cls)), e10);
                    }
                } catch (Exception e11) {
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", Integer.valueOf(i10), Integer.valueOf(objArrD.length), i7.h.Y(cls)), e11);
                }
            }
            return bVarArr;
        }

        protected Object[] d(Class cls) {
            try {
                return (Object[]) this.f32450a.invoke(cls, null);
            } catch (Exception e10) {
                if (u.b(e10)) {
                    return null;
                }
                throw new IllegalArgumentException("Failed to access RecordComponents of type " + i7.h.Y(cls));
            }
        }
    }

    public static f a(d dVar, p6.b bVar, q qVar, List list) {
        return new C0438a(dVar, bVar, qVar).a(list);
    }

    public static String[] b(Class cls) {
        return c.c().a(cls);
    }
}
