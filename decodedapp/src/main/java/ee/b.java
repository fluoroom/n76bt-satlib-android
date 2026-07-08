package ee;

import he.h0;
import he.o0;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11780a = a.f11781a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f11781a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final dd.j f11782b = dd.k.a(dd.n.f10910b, ee.a.f11779a);

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(b.class, b.class.getClassLoader());
            rd.m.b(serviceLoaderLoad);
            b bVar = (b) ed.q.a0(serviceLoaderLoad);
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final b c() {
            return (b) f11782b.getValue();
        }
    }

    o0 a(dg.n nVar, h0 h0Var, Iterable iterable, je.c cVar, je.a aVar, boolean z10);
}
