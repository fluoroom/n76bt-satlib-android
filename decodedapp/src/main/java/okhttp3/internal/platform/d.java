package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23687a = new d();

    private d() {
    }

    public final c a() {
        qh.c.f25224a.b();
        c cVarA = a.f23673f.a();
        if (cVarA == null) {
            cVarA = b.f23677f.a();
        }
        if (cVarA != null) {
            return cVarA;
        }
        throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
    }

    public final Context b() {
        Object objE = c.f23684a.e();
        ph.c cVar = objE instanceof ph.c ? (ph.c) objE : null;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public final boolean c() {
        return true;
    }

    public final void d(Context context) {
        Object objE = c.f23684a.e();
        ph.c cVar = objE instanceof ph.c ? (ph.c) objE : null;
        if (cVar != null) {
            cVar.a(context);
        }
    }
}
