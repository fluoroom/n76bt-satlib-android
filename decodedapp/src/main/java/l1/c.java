package l1;

import android.os.Bundle;
import ed.k0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static Bundle a(Bundle bundle) {
        rd.m.e(bundle, "source");
        return bundle;
    }

    public static final boolean b(Bundle bundle, String str) {
        rd.m.e(str, "key");
        return bundle.containsKey(str);
    }

    public static final Bundle c(Bundle bundle, String str) {
        rd.m.e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        d.a(str);
        throw new dd.f();
    }

    public static final Bundle d(Bundle bundle, String str) {
        rd.m.e(str, "key");
        return bundle.getBundle(str);
    }

    public static final List e(Bundle bundle, String str) {
        rd.m.e(str, "key");
        return bundle.getStringArrayList(str);
    }

    public static final boolean f(Bundle bundle) {
        return bundle.isEmpty();
    }

    public static final Map g(Bundle bundle) {
        Map mapD = k0.d(bundle.size());
        for (String str : bundle.keySet()) {
            rd.m.b(str);
            mapD.put(str, bundle.get(str));
        }
        return k0.b(mapD);
    }
}
