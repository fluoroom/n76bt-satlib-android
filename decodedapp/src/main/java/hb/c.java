package hb;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f15213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f15214f = new HashMap();

    public c(HttpURLConnection httpURLConnection, String str, int i10, int i11, int i12, String str2) {
        Map<String, List<String>> headerFields;
        this.f15209a = str;
        this.f15210b = i10;
        this.f15211c = i11;
        this.f15212d = i12;
        this.f15213e = str2;
        if (httpURLConnection == null || (headerFields = httpURLConnection.getHeaderFields()) == null) {
            return;
        }
        this.f15214f.putAll(headerFields);
    }

    @Override // hb.g
    public String a() {
        return this.f15209a;
    }

    @Override // hb.g
    public int b() {
        return this.f15210b;
    }

    @Override // hb.g
    public int c() {
        return this.f15211c;
    }

    @Override // hb.g
    public int d() {
        return this.f15212d;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + "\ncontent = [" + this.f15209a + "]\nresponseSize = " + this.f15210b + "\nrequestSize = " + this.f15211c + "\nresultCode = " + this.f15212d + "\nerrorMsg = " + this.f15213e;
    }
}
