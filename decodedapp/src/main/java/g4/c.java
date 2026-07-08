package g4;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ContentResolver f13509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Uri f13510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f13511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String[] f13512d;

    public c(Context context, g1.b bVar) {
        this.f13509a = context.getContentResolver();
        this.f13510b = bVar.N();
        this.f13511c = bVar.L();
        this.f13512d = bVar.M();
    }

    protected Void a(Void... voidArr) {
        this.f13509a.delete(this.f13510b, this.f13511c, this.f13512d);
        return null;
    }
}
