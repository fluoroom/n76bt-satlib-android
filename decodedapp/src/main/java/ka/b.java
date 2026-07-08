package ka;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f19546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f19547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f19548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f19549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f19550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap f19551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f19552g;

    b(HashMap map, HashMap map2, HashMap map3, HashMap map4, ArrayList arrayList, HashMap map5, String str) {
        this.f19546a = map;
        this.f19547b = map3;
        this.f19551f = map2;
        this.f19550e = map4;
        this.f19548c = arrayList;
        this.f19549d = map5;
        this.f19552g = str;
    }

    public Iterable a() {
        return this.f19548c;
    }

    HashMap b() {
        return this.f19549d;
    }

    public Iterable c() {
        return this.f19547b.keySet();
    }

    HashMap d() {
        return this.f19547b;
    }

    public String e(String str) {
        return (String) this.f19546a.get(str);
    }

    HashMap f() {
        return this.f19550e;
    }

    HashMap g() {
        return this.f19551f;
    }

    public boolean h() {
        return this.f19548c.size() > 0;
    }

    public boolean i(String str) {
        return this.f19546a.containsKey(str);
    }

    void j(k kVar, Object obj) {
        this.f19547b.put(kVar, obj);
    }

    public String toString() {
        return "Container{\n properties=" + this.f19546a + ",\n placemarks=" + this.f19547b + ",\n containers=" + this.f19548c + ",\n ground overlays=" + this.f19549d + ",\n style maps=" + this.f19550e + ",\n styles=" + this.f19551f + "\n}\n";
    }
}
