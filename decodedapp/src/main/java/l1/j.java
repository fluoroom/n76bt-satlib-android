package l1;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static Bundle a(Bundle bundle) {
        rd.m.e(bundle, "source");
        return bundle;
    }

    public static final void b(Bundle bundle, Bundle bundle2) {
        rd.m.e(bundle2, "from");
        bundle.putAll(bundle2);
    }

    public static final void c(Bundle bundle, String str, Bundle bundle2) {
        rd.m.e(str, "key");
        rd.m.e(bundle2, "value");
        bundle.putBundle(str, bundle2);
    }

    public static final void d(Bundle bundle, String str, List list) {
        rd.m.e(str, "key");
        rd.m.e(list, "value");
        bundle.putStringArrayList(str, k.a(list));
    }

    public static final void e(Bundle bundle, String str) {
        rd.m.e(str, "key");
        bundle.remove(str);
    }
}
