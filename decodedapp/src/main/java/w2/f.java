package w2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31071a = new ArrayList();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class f31072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f31073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final e f31074c;

        a(Class cls, Class cls2, e eVar) {
            this.f31072a = cls;
            this.f31073b = cls2;
            this.f31074c = eVar;
        }

        public boolean a(Class cls, Class cls2) {
            return this.f31072a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f31073b);
        }
    }

    public synchronized e a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a aVar : this.f31071a) {
            if (aVar.a(cls, cls2)) {
                return aVar.f31074c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a aVar : this.f31071a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f31073b)) {
                arrayList.add(aVar.f31073b);
            }
        }
        return arrayList;
    }

    public synchronized void c(Class cls, Class cls2, e eVar) {
        this.f31071a.add(new a(cls, cls2, eVar));
    }
}
