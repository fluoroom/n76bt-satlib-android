package ia;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f15953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f15954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f15955c;

    public b(c cVar, String str, Map map) {
        this.f15955c = cVar;
        this.f15953a = str;
        if (map == null) {
            this.f15954b = new HashMap();
        } else {
            this.f15954b = map;
        }
    }

    public c a() {
        return this.f15955c;
    }

    public String b() {
        return this.f15953a;
    }

    public String c(String str) {
        return (String) this.f15954b.get(str);
    }

    public boolean d() {
        return this.f15955c != null;
    }

    public boolean e(String str) {
        return this.f15954b.containsKey(str);
    }
}
