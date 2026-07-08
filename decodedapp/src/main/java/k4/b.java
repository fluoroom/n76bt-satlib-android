package k4;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import com.dw.ht.provider.a;
import d5.g;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f19379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f19380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Uri f19381f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Uri f19383b = RingtoneManager.getDefaultUri(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19384c;

    static {
        Uri uri = Uri.EMPTY;
        f19379d = uri;
        f19380e = uri.toString();
        f19381f = a.d.f6668a;
    }

    public b(g gVar) {
        this.f19384c = gVar.f10611m;
    }

    public static Intent a(Context context, Class cls, long j10) {
        return new Intent(context, (Class<?>) cls).setData(d(j10));
    }

    public static long b(Uri uri) {
        return ContentUris.parseId(uri);
    }

    public static b c(ContentResolver contentResolver, long j10) {
        g gVarJ = g.j(contentResolver, j10);
        if (gVarJ == null) {
            return null;
        }
        return new b(gVarJ);
    }

    public static Uri d(long j10) {
        return ContentUris.withAppendedId(f19381f, j10);
    }
}
