package j8;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f18533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f18534c;

    /* synthetic */ f(String str, e eVar) {
        d dVar = new d(null);
        this.f18533b = dVar;
        this.f18534c = dVar;
        str.getClass();
        this.f18532a = str;
    }

    public final f a(String str, int i10) {
        String strValueOf = String.valueOf(i10);
        b bVar = new b(null);
        this.f18534c.f18531c = bVar;
        this.f18534c = bVar;
        bVar.f18530b = strValueOf;
        bVar.f18529a = "errorCode";
        return this;
    }

    public final f b(String str, Object obj) {
        d dVar = new d(null);
        this.f18534c.f18531c = dVar;
        this.f18534c = dVar;
        dVar.f18530b = obj;
        dVar.f18529a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f18532a);
        sb2.append('{');
        d dVar = this.f18533b.f18531c;
        String str = "";
        while (dVar != null) {
            Object obj = dVar.f18530b;
            sb2.append(str);
            String str2 = dVar.f18529a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            dVar = dVar.f18531c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
