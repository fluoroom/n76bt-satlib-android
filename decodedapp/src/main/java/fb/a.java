package fb;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f12914a = new LinkedHashMap();

    public void a(int i10) {
        if (i10 < 0 || i10 > 6) {
            return;
        }
        this.f12914a.put(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i10));
    }

    public boolean b(int i10) {
        return this.f12914a.containsValue(Integer.valueOf(i10));
    }
}
