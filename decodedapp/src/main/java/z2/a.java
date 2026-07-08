package z2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32868a = new ArrayList();

    /* JADX INFO: renamed from: z2.a$a, reason: collision with other inner class name */
    private static final class C0444a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f32869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final i2.d f32870b;

        C0444a(Class cls, i2.d dVar) {
            this.f32869a = cls;
            this.f32870b = dVar;
        }

        boolean a(Class cls) {
            return this.f32869a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, i2.d dVar) {
        this.f32868a.add(new C0444a(cls, dVar));
    }

    public synchronized i2.d b(Class cls) {
        for (C0444a c0444a : this.f32868a) {
            if (c0444a.a(cls)) {
                return c0444a.f32870b;
            }
        }
        return null;
    }
}
