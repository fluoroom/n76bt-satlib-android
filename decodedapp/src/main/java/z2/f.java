package z2;

import i2.k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32882a = new ArrayList();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f32883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final k f32884b;

        a(Class cls, k kVar) {
            this.f32883a = cls;
            this.f32884b = kVar;
        }

        boolean a(Class cls) {
            return this.f32883a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, k kVar) {
        this.f32882a.add(new a(cls, kVar));
    }

    public synchronized k b(Class cls) {
        int size = this.f32882a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f32882a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f32884b;
            }
        }
        return null;
    }
}
