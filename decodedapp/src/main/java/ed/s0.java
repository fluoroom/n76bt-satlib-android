package ed;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s0 {
    public static Set a(Set set) {
        rd.m.e(set, "builder");
        return ((fd.h) set).c();
    }

    public static Set b() {
        return new fd.h();
    }

    public static Set c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        rd.m.d(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
