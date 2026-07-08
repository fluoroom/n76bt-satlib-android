package z9;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 {

    private static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f33026a;

        class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Method f33027b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.f33027b = method;
            }

            @Override // z9.e0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.f33027b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* JADX INFO: renamed from: z9.e0$b$b, reason: collision with other inner class name */
        class C0446b extends b {
            C0446b() {
                super();
            }

            @Override // z9.e0.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (w.c()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
                } catch (NoSuchMethodException unused) {
                    aVar = null;
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new C0446b();
            }
            f33026a = aVar;
        }

        private b() {
        }

        abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.f33026a.a(accessibleObject, obj);
    }

    public static com.google.gson.t b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return com.google.gson.t.ALLOW;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }
}
