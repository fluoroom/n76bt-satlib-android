package v7;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f30463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f30464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f30465c = 0;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        f30463a = uri;
        f30464b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
