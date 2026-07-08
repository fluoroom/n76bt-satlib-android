package p6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k;
import d6.r;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q6.f;
import x6.e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a */
    protected final JavaType f23934a;

    protected c(JavaType javaType) {
        this.f23934a = javaType;
    }

    public abstract boolean A();

    public abstract Object B(boolean z10);

    public boolean C() {
        return s().v();
    }

    public boolean D() {
        return this.f23934a.X();
    }

    public abstract x6.k a();

    public abstract x6.k b();

    public abstract List c();

    public abstract x6.f d();

    public abstract Class[] e();

    public abstract i7.j f();

    public abstract k.d g(k.d dVar);

    public abstract Map h();

    public abstract x6.k i();

    public abstract x6.k j();

    public abstract x6.l k(String str, Class[] clsArr);

    public abstract Class l();

    public abstract f.a m();

    public abstract List n();

    public abstract r.b o(r.b bVar);

    public abstract i7.j p();

    public Class q() {
        return this.f23934a.r();
    }

    public abstract i7.b r();

    public abstract x6.d s();

    public abstract List t();

    public abstract List u();

    public abstract List v();

    public abstract List w();

    public abstract Set x();

    public abstract e0 y();

    public JavaType z() {
        return this.f23934a;
    }
}
