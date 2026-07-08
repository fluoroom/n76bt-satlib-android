package m7;

import android.os.Bundle;
import t7.a;
import v7.o;

/* JADX INFO: loaded from: classes.dex */
public final class g implements a.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f21800d = new g(new f());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f21801a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21803c;

    public g(f fVar) {
        this.f21802b = fVar.f21798a.booleanValue();
        this.f21803c = fVar.f21799b;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f21802b);
        bundle.putString("log_session_id", this.f21803c);
        return bundle;
    }

    final /* synthetic */ boolean b() {
        return this.f21802b;
    }

    final /* synthetic */ String c() {
        return this.f21803c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return o.a(null, null) && this.f21802b == gVar.f21802b && o.a(this.f21803c, gVar.f21803c);
    }

    public final int hashCode() {
        return o.b(null, Boolean.valueOf(this.f21802b), this.f21803c);
    }
}
