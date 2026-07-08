package x6;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final i7.b f31788b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f31789a;

    static class a extends q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f31790c = new a(null);

        a(Object obj) {
            super(obj);
        }

        @Override // x6.q
        public q a(Annotation annotation) {
            return new e(this.f31789a, annotation.annotationType(), annotation);
        }

        @Override // x6.q
        public r b() {
            return new r();
        }

        @Override // x6.q
        public i7.b c() {
            return q.f31788b;
        }

        @Override // x6.q
        public boolean f(Annotation annotation) {
            return false;
        }
    }

    static class b extends q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final HashMap f31791c;

        public b(Object obj, Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
            super(obj);
            HashMap map = new HashMap();
            this.f31791c = map;
            map.put(cls, annotation);
            map.put(cls2, annotation2);
        }

        @Override // x6.q
        public q a(Annotation annotation) {
            this.f31791c.put(annotation.annotationType(), annotation);
            return this;
        }

        @Override // x6.q
        public r b() {
            r rVar = new r();
            Iterator it = this.f31791c.values().iterator();
            while (it.hasNext()) {
                rVar.e((Annotation) it.next());
            }
            return rVar;
        }

        @Override // x6.q
        public i7.b c() {
            if (this.f31791c.size() != 2) {
                return new r(this.f31791c);
            }
            Iterator it = this.f31791c.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it.next();
            return new f((Class) entry.getKey(), (Annotation) entry.getValue(), (Class) entry2.getKey(), (Annotation) entry2.getValue());
        }

        @Override // x6.q
        public boolean f(Annotation annotation) {
            return this.f31791c.containsKey(annotation.annotationType());
        }
    }

    public static class c implements i7.b, Serializable {
        c() {
        }

        @Override // i7.b
        public Annotation a(Class cls) {
            return null;
        }

        @Override // i7.b
        public boolean b(Class cls) {
            return false;
        }

        @Override // i7.b
        public boolean c(Class[] clsArr) {
            return false;
        }

        @Override // i7.b
        public int size() {
            return 0;
        }
    }

    public static class d implements i7.b, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f31792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Annotation f31793b;

        public d(Class cls, Annotation annotation) {
            this.f31792a = cls;
            this.f31793b = annotation;
        }

        @Override // i7.b
        public Annotation a(Class cls) {
            if (this.f31792a == cls) {
                return this.f31793b;
            }
            return null;
        }

        @Override // i7.b
        public boolean b(Class cls) {
            return this.f31792a == cls;
        }

        @Override // i7.b
        public boolean c(Class[] clsArr) {
            for (Class cls : clsArr) {
                if (cls == this.f31792a) {
                    return true;
                }
            }
            return false;
        }

        @Override // i7.b
        public int size() {
            return 1;
        }
    }

    static class e extends q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class f31794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Annotation f31795d;

        public e(Object obj, Class cls, Annotation annotation) {
            super(obj);
            this.f31794c = cls;
            this.f31795d = annotation;
        }

        @Override // x6.q
        public q a(Annotation annotation) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Class<? extends Annotation> cls = this.f31794c;
            if (cls != clsAnnotationType) {
                return new b(this.f31789a, cls, this.f31795d, clsAnnotationType, annotation);
            }
            this.f31795d = annotation;
            return this;
        }

        @Override // x6.q
        public r b() {
            return r.g(this.f31794c, this.f31795d);
        }

        @Override // x6.q
        public i7.b c() {
            return new d(this.f31794c, this.f31795d);
        }

        @Override // x6.q
        public boolean f(Annotation annotation) {
            return annotation.annotationType() == this.f31794c;
        }
    }

    public static class f implements i7.b, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f31796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f31797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Annotation f31798c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Annotation f31799d;

        public f(Class cls, Annotation annotation, Class cls2, Annotation annotation2) {
            this.f31796a = cls;
            this.f31798c = annotation;
            this.f31797b = cls2;
            this.f31799d = annotation2;
        }

        @Override // i7.b
        public Annotation a(Class cls) {
            if (this.f31796a == cls) {
                return this.f31798c;
            }
            if (this.f31797b == cls) {
                return this.f31799d;
            }
            return null;
        }

        @Override // i7.b
        public boolean b(Class cls) {
            return this.f31796a == cls || this.f31797b == cls;
        }

        @Override // i7.b
        public boolean c(Class[] clsArr) {
            for (Class cls : clsArr) {
                if (cls == this.f31796a || cls == this.f31797b) {
                    return true;
                }
            }
            return false;
        }

        @Override // i7.b
        public int size() {
            return 2;
        }
    }

    protected q(Object obj) {
        this.f31789a = obj;
    }

    public static i7.b d() {
        return f31788b;
    }

    public static q e() {
        return a.f31790c;
    }

    public abstract q a(Annotation annotation);

    public abstract r b();

    public abstract i7.b c();

    public abstract boolean f(Annotation annotation);
}
