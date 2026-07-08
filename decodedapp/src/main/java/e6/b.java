package e6;

import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11482d;

    static {
        a aVar = new a("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f11479a = aVar;
        f11480b = new a(aVar, "MIME-NO-LINEFEEDS", ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        f11481c = new a(aVar, "PEM", true, '=', 64);
        StringBuilder sb2 = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb2.setCharAt(sb2.indexOf("+"), '-');
        sb2.setCharAt(sb2.indexOf("/"), '_');
        f11482d = new a("MODIFIED-FOR-URL", sb2.toString(), false, (char) 0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public static a a() {
        return f11480b;
    }
}
