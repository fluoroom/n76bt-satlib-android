package z0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.fragment.app.w;
import ed.k0;
import ed.q;
import ed.r0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f32837a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0442c f32838b = C0442c.f32850d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* JADX INFO: renamed from: z0.c$c, reason: collision with other inner class name */
    public static final class C0442c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f32849c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0442c f32850d = new C0442c(r0.d(), null, k0.i());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f32851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f32852b;

        /* JADX INFO: renamed from: z0.c$c$a */
        public static final class a {
            public /* synthetic */ a(rd.h hVar) {
                this();
            }

            private a() {
            }
        }

        public C0442c(Set set, b bVar, Map map) {
            m.e(set, "flags");
            m.e(map, "allowedViolations");
            this.f32851a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f32852b = linkedHashMap;
        }

        public final Set a() {
            return this.f32851a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f32852b;
        }
    }

    private c() {
    }

    private final C0442c b(o oVar) {
        while (oVar != null) {
            if (oVar.a2()) {
                w wVarB1 = oVar.B1();
                m.d(wVarB1, "declaringFragment.parentFragmentManager");
                if (wVarB1.C0() != null) {
                    C0442c c0442cC0 = wVarB1.C0();
                    m.b(c0442cC0);
                    return c0442cC0;
                }
            }
            oVar = oVar.A1();
        }
        return f32838b;
    }

    private final void c(C0442c c0442c, final h hVar) {
        o oVarA = hVar.a();
        final String name = oVarA.getClass().getName();
        if (c0442c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, hVar);
        }
        c0442c.b();
        if (c0442c.a().contains(a.PENALTY_DEATH)) {
            l(oVarA, new Runnable() { // from class: z0.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, hVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, h hVar) {
        m.e(hVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, hVar);
        throw hVar;
    }

    private final void e(h hVar) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + hVar.a().getClass().getName(), hVar);
        }
    }

    public static final void f(o oVar, String str) {
        m.e(oVar, "fragment");
        m.e(str, "previousFragmentId");
        z0.a aVar = new z0.a(oVar, str);
        c cVar = f32837a;
        cVar.e(aVar);
        C0442c c0442cB = cVar.b(oVar);
        if (c0442cB.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.m(c0442cB, oVar.getClass(), aVar.getClass())) {
            cVar.c(c0442cB, aVar);
        }
    }

    public static final void g(o oVar, ViewGroup viewGroup) {
        m.e(oVar, "fragment");
        d dVar = new d(oVar, viewGroup);
        c cVar = f32837a;
        cVar.e(dVar);
        C0442c c0442cB = cVar.b(oVar);
        if (c0442cB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.m(c0442cB, oVar.getClass(), dVar.getClass())) {
            cVar.c(c0442cB, dVar);
        }
    }

    public static final void h(o oVar) {
        m.e(oVar, "fragment");
        e eVar = new e(oVar);
        c cVar = f32837a;
        cVar.e(eVar);
        C0442c c0442cB = cVar.b(oVar);
        if (c0442cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.m(c0442cB, oVar.getClass(), eVar.getClass())) {
            cVar.c(c0442cB, eVar);
        }
    }

    public static final void i(o oVar, boolean z10) {
        m.e(oVar, "fragment");
        f fVar = new f(oVar, z10);
        c cVar = f32837a;
        cVar.e(fVar);
        C0442c c0442cB = cVar.b(oVar);
        if (c0442cB.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.m(c0442cB, oVar.getClass(), fVar.getClass())) {
            cVar.c(c0442cB, fVar);
        }
    }

    public static final void j(o oVar, ViewGroup viewGroup) {
        m.e(oVar, "fragment");
        m.e(viewGroup, "container");
        i iVar = new i(oVar, viewGroup);
        c cVar = f32837a;
        cVar.e(iVar);
        C0442c c0442cB = cVar.b(oVar);
        if (c0442cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.m(c0442cB, oVar.getClass(), iVar.getClass())) {
            cVar.c(c0442cB, iVar);
        }
    }

    public static final void k(o oVar, o oVar2, int i10) {
        m.e(oVar, "fragment");
        m.e(oVar2, "expectedParentFragment");
        j jVar = new j(oVar, oVar2, i10);
        c cVar = f32837a;
        cVar.e(jVar);
        C0442c c0442cB = cVar.b(oVar);
        if (c0442cB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.m(c0442cB, oVar.getClass(), jVar.getClass())) {
            cVar.c(c0442cB, jVar);
        }
    }

    private final void l(o oVar, Runnable runnable) {
        if (!oVar.a2()) {
            runnable.run();
            return;
        }
        Handler handlerJ = oVar.B1().w0().j();
        if (m.a(handlerJ.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerJ.post(runnable);
        }
    }

    private final boolean m(C0442c c0442c, Class cls, Class cls2) {
        Set set = (Set) c0442c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (m.a(cls2.getSuperclass(), h.class) || !q.T(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
