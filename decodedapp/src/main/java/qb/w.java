package qb;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import qb.l;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final r9.f f24812c = r9.f.e(',');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final w f24813d = a().f(new l.a(), true).f(l.b.f24679a, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f24814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f24815b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v f24816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f24817b;

        a(v vVar, boolean z10) {
            this.f24816a = (v) r9.l.o(vVar, "decompressor");
            this.f24817b = z10;
        }
    }

    private w(v vVar, boolean z10, w wVar) {
        String strA = vVar.a();
        r9.l.e(!strA.contains(","), "Comma is currently not allowed in message encoding");
        int size = wVar.f24814a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(wVar.f24814a.containsKey(vVar.a()) ? size : size + 1);
        for (a aVar : wVar.f24814a.values()) {
            String strA2 = aVar.f24816a.a();
            if (!strA2.equals(strA)) {
                linkedHashMap.put(strA2, new a(aVar.f24816a, aVar.f24817b));
            }
        }
        linkedHashMap.put(strA, new a(vVar, z10));
        this.f24814a = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.f24815b = f24812c.c(b()).getBytes(Charset.forName("US-ASCII"));
    }

    public static w a() {
        return new w();
    }

    public static w c() {
        return f24813d;
    }

    public Set b() {
        HashSet hashSet = new HashSet(this.f24814a.size());
        for (Map.Entry entry : this.f24814a.entrySet()) {
            if (((a) entry.getValue()).f24817b) {
                hashSet.add((String) entry.getKey());
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    byte[] d() {
        return this.f24815b;
    }

    public v e(String str) {
        a aVar = (a) this.f24814a.get(str);
        if (aVar != null) {
            return aVar.f24816a;
        }
        return null;
    }

    public w f(v vVar, boolean z10) {
        return new w(vVar, z10, this);
    }

    private w() {
        this.f24814a = new LinkedHashMap(0);
        this.f24815b = new byte[0];
    }
}
