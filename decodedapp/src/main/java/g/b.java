package g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import g.a;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13341a;

    public b(String str) {
        m.e(str, "mimeType");
        this.f13341a = str;
    }

    @Override // g.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String str) {
        m.e(context, "context");
        m.e(str, "input");
        Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.f13341a).putExtra("android.intent.extra.TITLE", str);
        m.d(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
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
