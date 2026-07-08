package f3;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f12774a = new C0176a();

    class b implements d {
        b() {
        }

        @Override // f3.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    class c implements g {
        c() {
        }

        @Override // f3.a.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    public interface d {
        Object create();
    }

    private static final class e implements l0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f12775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f12776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l0.d f12777c;

        e(l0.d dVar, d dVar2, g gVar) {
            this.f12777c = dVar;
            this.f12775a = dVar2;
            this.f12776b = gVar;
        }

        @Override // l0.d
        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).f().b(true);
            }
            this.f12776b.a(obj);
            return this.f12777c.a(obj);
        }

        @Override // l0.d
        public Object b() {
            Object objB = this.f12777c.b();
            if (objB == null) {
                objB = this.f12775a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + objB.getClass());
                }
            }
            if (objB instanceof f) {
                ((f) objB).f().b(false);
            }
            return objB;
        }
    }

    public interface f {
        f3.c f();
    }

    public interface g {
        void a(Object obj);
    }

    private static l0.d a(l0.d dVar, d dVar2) {
        return b(dVar, dVar2, c());
    }

    private static l0.d b(l0.d dVar, d dVar2, g gVar) {
        return new e(dVar, dVar2, gVar);
    }

    private static g c() {
        return f12774a;
    }

    public static l0.d d(int i10, d dVar) {
        return a(new l0.f(i10), dVar);
    }

    public static l0.d e() {
        return f(20);
    }

    public static l0.d f(int i10) {
        return b(new l0.f(i10), new b(), new c());
    }

    /* JADX INFO: renamed from: f3.a$a, reason: collision with other inner class name */
    class C0176a implements g {
        C0176a() {
        }

        @Override // f3.a.g
        public void a(Object obj) {
        }
    }
}
