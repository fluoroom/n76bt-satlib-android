package g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import g.a;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    @Override // g.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String str) {
        m.e(context, "context");
        m.e(str, "input");
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
        m.d(type, "setType(...)");
        return type;
    }

    @Override // g.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final a.C0189a b(Context context, String str) {
        m.e(context, "context");
        m.e(str, "input");
        return null;
    }

    @Override // g.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri c(int i10, Intent intent) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
