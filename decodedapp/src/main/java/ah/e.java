package ah;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f621a;

    public e(String str) {
        this.f621a = (String) h.e(str, "clientSecret cannot be null");
    }

    @Override // ah.d
    public final Map a(String str) {
        HashMap map = new HashMap();
        map.put("client_id", str);
        map.put("client_secret", this.f621a);
        return map;
    }

    @Override // ah.d
    public final Map b(String str) {
        return null;
    }
}
