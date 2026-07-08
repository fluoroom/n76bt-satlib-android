package eh;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f12459b;

    public i(String str, Map map) {
        String lowerCase;
        rd.m.e(str, "scheme");
        rd.m.e(map, "authParams");
        this.f12458a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale locale = Locale.US;
                rd.m.d(locale, "US");
                lowerCase = str2.toLowerCase(locale);
                rd.m.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str3);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        rd.m.d(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f12459b = mapUnmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f12459b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                rd.m.d(charsetForName, "forName(...)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        return rg.d.f26012g;
    }

    public final String b() {
        return (String) this.f12459b.get("realm");
    }

    public final String c() {
        return this.f12458a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return rd.m.a(iVar.f12458a, this.f12458a) && rd.m.a(iVar.f12459b, this.f12459b);
    }

    public int hashCode() {
        return ((899 + this.f12458a.hashCode()) * 31) + this.f12459b.hashCode();
    }

    public String toString() {
        return this.f12458a + " authParams=" + this.f12459b;
    }
}
