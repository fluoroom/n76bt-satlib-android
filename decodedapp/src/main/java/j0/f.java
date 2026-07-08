package j0;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f18344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f18346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f18347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f18348h;

    public f(String str, String str2, String str3, List list) {
        this(str, str2, str3, list, null, null);
    }

    private String a(String str, String str2, String str3, String str4, String str5) {
        return str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public List b() {
        return this.f18344d;
    }

    public int c() {
        return this.f18345e;
    }

    String d() {
        return this.f18348h;
    }

    public String e() {
        return this.f18341a;
    }

    public String f() {
        return this.f18342b;
    }

    public String g() {
        return this.f18343c;
    }

    public String h() {
        return this.f18346f;
    }

    public String i() {
        return this.f18347g;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f18341a + ", mProviderPackage: " + this.f18342b + ", mQuery: " + this.f18343c + ", mSystemFont: " + this.f18346f + ", mVariationSettings: " + this.f18347g + ", mCertificates:");
        for (int i10 = 0; i10 < this.f18344d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f18344d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f18345e);
        return sb2.toString();
    }

    public f(String str, String str2, String str3, List list, String str4, String str5) {
        this.f18341a = (String) l0.g.g(str);
        this.f18342b = (String) l0.g.g(str2);
        this.f18343c = (String) l0.g.g(str3);
        this.f18344d = (List) l0.g.g(list);
        this.f18345e = 0;
        this.f18346f = str4;
        this.f18347g = str5;
        this.f18348h = a(str, str2, str3, str4, str5);
    }
}
