package g;

import android.content.Context;
import android.content.Intent;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13343a = new a(null);

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    @Override // g.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent intent) {
        m.e(context, "context");
        m.e(intent, "input");
        return intent;
    }

    @Override // g.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f.a c(int i10, Intent intent) {
        return new f.a(i10, intent);
    }
}
