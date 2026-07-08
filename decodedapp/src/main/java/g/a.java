package g;

import android.content.Context;
import android.content.Intent;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: g.a$a, reason: collision with other inner class name */
    public static final class C0189a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f13340a;

        public C0189a(Object obj) {
            this.f13340a = obj;
        }

        public final Object a() {
            return this.f13340a;
        }
    }

    public abstract Intent a(Context context, Object obj);

    public C0189a b(Context context, Object obj) {
        m.e(context, "context");
        return null;
    }

    public abstract Object c(int i10, Intent intent);
}
