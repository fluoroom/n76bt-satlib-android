package t6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k0;
import d6.o0;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final k0.a f27565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected LinkedList f27566b;

    public z(k0.a aVar) {
        this.f27565a = aVar;
    }

    public void a(a aVar) {
        if (this.f27566b == null) {
            this.f27566b = new LinkedList();
        }
        this.f27566b.add(aVar);
    }

    public void b(Object obj) {
        throw null;
    }

    public Object c() {
        throw null;
    }

    public String toString() {
        return String.valueOf(this.f27565a);
    }

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s6.v f27567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f27568b;

        public a(s6.v vVar, Class cls) {
            this.f27567a = vVar;
            this.f27568b = cls;
        }

        public a(s6.v vVar, JavaType javaType) {
            this.f27567a = vVar;
            this.f27568b = javaType.r();
        }
    }

    public void d(o0 o0Var) {
    }
}
