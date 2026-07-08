package v7;

import android.os.Bundle;
import t7.a;

/* JADX INFO: loaded from: classes.dex */
public class w implements a.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w f30487b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30488a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f30489a;

        /* synthetic */ a(z zVar) {
        }

        public w a() {
            return new w(this.f30489a, null);
        }
    }

    /* synthetic */ w(String str, a0 a0Var) {
        this.f30488a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f30488a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return o.a(this.f30488a, ((w) obj).f30488a);
        }
        return false;
    }

    public final int hashCode() {
        return o.b(this.f30488a);
    }
}
