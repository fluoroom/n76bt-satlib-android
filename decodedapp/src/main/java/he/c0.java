package he;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g0 f15254a = new g0("InvalidModuleNotifier");

    public static final void a(h0 h0Var) {
        rd.m.e(h0Var, "<this>");
        android.support.v4.media.session.b.a(h0Var.A0(f15254a));
        throw new b0("Accessing invalid module descriptor " + h0Var);
    }
}
