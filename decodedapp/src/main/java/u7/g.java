package u7;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a */
    private final Object f28426a;

    public g(Activity activity) {
        v7.q.j(activity, "Activity must not be null");
        this.f28426a = activity;
    }

    public final Activity a() {
        return (Activity) this.f28426a;
    }

    public final androidx.fragment.app.p b() {
        return (androidx.fragment.app.p) this.f28426a;
    }

    public final boolean c() {
        return this.f28426a instanceof Activity;
    }

    public final boolean d() {
        return this.f28426a instanceof androidx.fragment.app.p;
    }
}
