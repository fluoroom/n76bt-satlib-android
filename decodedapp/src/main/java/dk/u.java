package dk;

import eh.c0;
import eh.g0;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class u {

    class a extends u {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // dk.u
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                u.this.a(xVar, it.next());
            }
        }
    }

    class b extends u {
        b() {
        }

        @Override // dk.u
        void a(x xVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i10 = 0; i10 < length; i10++) {
                u.this.a(xVar, Array.get(obj, i10));
            }
        }
    }

    static final class c extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f11212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final dk.i f11214c;

        c(Method method, int i10, dk.i iVar) {
            this.f11212a = method;
            this.f11213b = i10;
            this.f11214c = iVar;
        }

        @Override // dk.u
        void a(x xVar, Object obj) {
            if (obj == null) {
                throw e0.p(this.f11212a, this.f11213b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                xVar.l((g0) this.f11214c.convert(obj));
            } catch (IOException e10) {
                throw e0.q(this.f11212a, e10, this.f11213b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class d extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dk.i f11216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f11217c;

        d(String str, dk.i iVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f11215a = str;
            this.f11216b = iVar;
            this.f11217c = z10;
        }

        @Override // dk.u
        void a(x xVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f11216b.convert(obj)) == null) {
                return;
            }
            xVar.a(this.f11215a, str, this.f11217c);
        }
    }

    static final class e extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f11218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final dk.i f11220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f11221d;

        e(Method method, int i10, dk.i iVar, boolean z10) {
            this.f11218a = method;
            this.f11219b = i10;
            this.f11220c = iVar;
            this.f11221d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // dk.u
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Map map) {
            if (map == null) {
                throw e0.p(this.f11218a, this.f11219b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw e0.p(this.f11218a, this.f11219b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw e0.p(this.f11218a, this.f11219b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f11220c.convert(value);
                if (str2 == null) {
                    throw e0.p(this.f11218a, this.f11219b, "Field map value '" + value + "' converted to null by " + this.f11220c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                xVar.a(str, str2, this.f11221d);
            }
        }
    }

    static final class f extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dk.i f11223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f11224c;

        f(String str, dk.i iVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f11222a = str;
            this.f11223b = iVar;
            this.f11224c = z10;
        }

        @Override // dk.u
        void a(x xVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f11223b.convert(obj)) == null) {
                return;
            }
            xVar.b(this.f11222a, str, this.f11224c);
        }
    }

    static final class g extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f11225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final dk.i f11227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f11228d;

        g(Method method, int i10, dk.i iVar, boolean z10) {
            this.f11225a = method;
            this.f11226b = i10;
            this.f11227c = iVar;
            this.f11228d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // dk.u
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Map map) {
            if (map == null) {
                throw e0.p(this.f11225a, this.f11226b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw e0.p(this.f11225a, this.f11226b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw e0.p(this.f11225a, this.f11226b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                xVar.b(str, (String) this.f11227c.convert(value), this.f11228d);
            }
        }
    }

    static final class h extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f11229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11230b;

        h(Method method, int i10) {
            this.f11229a = method;
            this.f11230b = i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // dk.u
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, eh.y yVar) {
            if (yVar == null) {
                throw e0.p(this.f11229a, this.f11230b, "Headers parameter must not be null.", new Object[0]);
            }
            xVar.c(yVar);
        }
    }

    static final class i extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f11231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final eh.y f11233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final dk.i f11234d;

        i(Method method, int i10, eh.y yVar, dk.i iVar) {
            this.f11231a = method;
            this.f11232b = i10;
            this.f11233c = yVar;
            this.f11234d = iVar;
        }

        @Override // dk.u
        void a(x xVar, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                xVar.d(this.f11233c, (g0) this.f11234d.convert(obj));
            } catch (IOException e10) {
                throw e0.p(this.f11231a, this.f11232b, "Unable to convert " + obj + " to RequestBody", e10);
            }
        }
    }

    static final class j extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f11235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final dk.i f11237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f11238d;

        j(Method method, int i10, dk.i iVar, String str) {
            this.f11235a = method;
            this.f11236b = i10;
            this.f11237c = iVar;
            this.f11238d = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // dk.u
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Map map) {
            if (map == null) {
                throw e0.p(this.f11235a, this.f11236b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw e0.p(this.f11235a, this.f11236b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw e0.p(this.f11235a, this.f11236b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                xVar.d(eh.y.f("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f11238d), (g0) this.f11237c.convert(value));
            }
        }
    }

    static final class k extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f11239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f11241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final dk.i f11242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f11243e;

        k(Method method, int i10, String str, dk.i iVar, boolean z10) {
            this.f11239a = method;
            this.f11240b = i10;
            Objects.requireNonNull(str, "name == null");
            this.f11241c = str;
            this.f11242d = iVar;
            this.f11243e = z10;
        }

        @Override // dk.u
        void a(x xVar, Object obj) throws EOFException {
            if (obj != null) {
                xVar.f(this.f11241c, (String) this.f11242d.convert(obj), this.f11243e);
                return;
            }
            throw e0.p(this.f11239a, this.f11240b, "Path parameter \"" + this.f11241c + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dk.i f11245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f11246c;

        l(String str, dk.i iVar, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.f11244a = str;
            this.f11245b = iVar;
            this.f11246c = z10;
        }

        @Override // dk.u
        void a(x xVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f11245b.convert(obj)) == null) {
                return;
            }
            xVar.g(this.f11244a, str, this.f11246c);
        }
    }

    static final class m extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f11247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final dk.i f11249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f11250d;

        m(Method method, int i10, dk.i iVar, boolean z10) {
            this.f11247a = method;
            this.f11248b = i10;
            this.f11249c = iVar;
            this.f11250d = z10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // dk.u
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Map map) {
            if (map == null) {
                throw e0.p(this.f11247a, this.f11248b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw e0.p(this.f11247a, this.f11248b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw e0.p(this.f11247a, this.f11248b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f11249c.convert(value);
                if (str2 == null) {
                    throw e0.p(this.f11247a, this.f11248b, "Query map value '" + value + "' converted to null by " + this.f11249c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                xVar.g(str, str2, this.f11250d);
            }
        }
    }

    static final class n extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dk.i f11251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f11252b;

        n(dk.i iVar, boolean z10) {
            this.f11251a = iVar;
            this.f11252b = z10;
        }

        @Override // dk.u
        void a(x xVar, Object obj) {
            if (obj == null) {
                return;
            }
            xVar.g((String) this.f11251a.convert(obj), null, this.f11252b);
        }
    }

    static final class o extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final o f11253a = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // dk.u
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, c0.c cVar) {
            if (cVar != null) {
                xVar.e(cVar);
            }
        }
    }

    static final class p extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f11254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11255b;

        p(Method method, int i10) {
            this.f11254a = method;
            this.f11255b = i10;
        }

        @Override // dk.u
        void a(x xVar, Object obj) {
            if (obj == null) {
                throw e0.p(this.f11254a, this.f11255b, "@Url parameter is null.", new Object[0]);
            }
            xVar.m(obj);
        }
    }

    static final class q extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class f11256a;

        q(Class cls) {
            this.f11256a = cls;
        }

        @Override // dk.u
        void a(x xVar, Object obj) {
            xVar.h(this.f11256a, obj);
        }
    }

    u() {
    }

    abstract void a(x xVar, Object obj);

    final u b() {
        return new b();
    }

    final u c() {
        return new a();
    }
}
