package bh;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class l implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f4067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f4068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f4069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f4070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f4071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f4072j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f4074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f4075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4076d;

    static {
        Set set = f.f4052a;
        f4067e = new l("com.android.chrome", set, true, k.a(f.f4053b));
        k kVar = k.f4064c;
        f4068f = new l("com.android.chrome", set, false, kVar);
        Set set2 = g.f4054a;
        f4069g = new l("org.mozilla.firefox", set2, true, k.a(g.f4055b));
        f4070h = new l("org.mozilla.firefox", set2, false, kVar);
        Set set3 = h.f4056a;
        f4071i = new l("com.sec.android.app.sbrowser", set3, false, kVar);
        f4072j = new l("com.sec.android.app.sbrowser", set3, true, k.a(h.f4057b));
    }

    public l(String str, Set set, boolean z10, k kVar) {
        this.f4073a = str;
        this.f4074b = set;
        this.f4076d = z10;
        this.f4075c = kVar;
    }

    @Override // bh.d
    public boolean a(c cVar) {
        return this.f4073a.equals(cVar.f4047a) && this.f4076d == cVar.f4050d.booleanValue() && this.f4075c.c(cVar.f4049c) && this.f4074b.equals(cVar.f4048b);
    }
}
