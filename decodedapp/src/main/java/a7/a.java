package a7;

import a7.c;
import com.fasterxml.jackson.databind.JavaType;
import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import r6.q;

/* JADX INFO: loaded from: classes.dex */
public class a extends c implements Serializable {

    /* JADX INFO: renamed from: a7.a$a, reason: collision with other inner class name */
    private static final class C0009a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0009a f354b = new C0009a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f355a;

        private C0009a() {
            HashSet hashSet = new HashSet();
            this.f355a = hashSet;
            hashSet.add(Object.class.getName());
            hashSet.add(Closeable.class.getName());
            hashSet.add(Serializable.class.getName());
            hashSet.add(AutoCloseable.class.getName());
            hashSet.add(Cloneable.class.getName());
            hashSet.add("java.util.logging.Handler");
            hashSet.add("javax.naming.Referenceable");
            hashSet.add("javax.sql.DataSource");
        }

        public boolean a(Class cls) {
            return this.f355a.contains(cls.getName());
        }
    }

    @Override // a7.c
    public c.b a(q qVar, JavaType javaType) {
        return e(qVar, javaType) ? c.b.DENIED : c.b.INDETERMINATE;
    }

    @Override // a7.c
    public c.b b(q qVar, JavaType javaType, String str) {
        return c.b.INDETERMINATE;
    }

    @Override // a7.c
    public c.b c(q qVar, JavaType javaType, JavaType javaType2) {
        return d(qVar, javaType, javaType2) ? c.b.ALLOWED : c.b.DENIED;
    }

    protected boolean d(q qVar, JavaType javaType, JavaType javaType2) {
        return true;
    }

    protected boolean e(q qVar, JavaType javaType) {
        return C0009a.f354b.a(javaType.r());
    }
}
