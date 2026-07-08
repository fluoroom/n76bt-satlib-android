package qe;

import ed.k0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f24949b;

    public e(String str, Map map) {
        rd.m.e(str, "className");
        rd.m.e(map, "arguments");
        this.f24948a = str;
        this.f24949b = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b(dd.q qVar) {
        rd.m.e(qVar, "<destruct>");
        return ((String) qVar.a()) + " = " + ((f) qVar.b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return rd.m.a(this.f24948a, eVar.f24948a) && rd.m.a(this.f24949b, eVar.f24949b);
    }

    public int hashCode() {
        return (this.f24948a.hashCode() * 31) + this.f24949b.hashCode();
    }

    public String toString() {
        return '@' + this.f24948a + '(' + ed.q.i0(k0.w(this.f24949b), null, null, null, 0, null, d.f24942a, 31, null) + ')';
    }
}
