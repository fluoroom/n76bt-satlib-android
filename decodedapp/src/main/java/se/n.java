package se;

import ed.q;
import gf.o;
import gf.r;
import gf.v;
import java.util.List;
import java.util.ServiceLoader;
import qe.s;
import qe.t;
import qe.w;
import qe.x;
import qe.z;

/* JADX INFO: loaded from: classes3.dex */
public interface n {

    /* JADX INFO: renamed from: a */
    public static final a f27327a = a.f27328a;

    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f27328a = new a();

        /* JADX INFO: renamed from: b */
        private static final dd.j f27329b = dd.k.b(m.f27326a);

        private a() {
        }

        public static final List a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(n.class, n.class.getClassLoader());
            rd.m.d(serviceLoaderLoad, "load(...)");
            List listH0 = q.H0(serviceLoaderLoad);
            if (listH0.isEmpty()) {
                throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
            return listH0;
        }

        public final List c() {
            return (List) f27329b.getValue();
        }
    }

    i a();

    h b();

    void c(qe.q qVar, gf.h hVar, re.e eVar);

    d d();

    j e();

    void f(t tVar, o oVar, re.e eVar);

    void g(s sVar, gf.j jVar, re.e eVar);

    b h();

    g i();

    void j(z zVar, v vVar, re.e eVar);

    void k(w wVar, gf.s sVar, re.e eVar);

    k l();

    void m(x xVar, gf.t tVar, re.e eVar);

    void n(qe.v vVar, r rVar, re.e eVar);

    l o();

    c p();

    void q(qe.j jVar, gf.e eVar, re.e eVar2);

    void r(qe.g gVar, gf.c cVar, re.e eVar);
}
