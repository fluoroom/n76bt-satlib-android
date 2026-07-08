package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f1.f f2679a = new f1.f();

    public static final tg.d0 a(s0 s0Var) {
        f1.b bVarA;
        rd.m.e(s0Var, "<this>");
        synchronized (f2679a) {
            bVarA = (f1.b) s0Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (bVarA == null) {
                bVarA = f1.c.a();
                s0Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", bVarA);
            }
        }
        return bVarA;
    }
}
