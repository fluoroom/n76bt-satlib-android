package fh;

import androidx.appcompat.widget.ActivityChooserView;
import eh.d;
import rg.q;
import sg.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final eh.d a(d.a aVar) {
        rd.m.e(aVar, "<this>");
        return new eh.d(aVar.f(), aVar.g(), aVar.c(), -1, false, false, false, aVar.d(), aVar.e(), aVar.i(), aVar.h(), aVar.b(), null);
    }

    public static final int b(long j10) {
        return j10 > 2147483647L ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) j10;
    }

    public static final eh.d c(d.b bVar) {
        rd.m.e(bVar, "<this>");
        d.a aVarL = new d.a().l();
        a.C0379a c0379a = sg.a.f27358a;
        return aVarL.j(sg.c.d(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, sg.d.f27367e)).a();
    }

    public static final eh.d d(d.b bVar) {
        rd.m.e(bVar, "<this>");
        return new d.a().k().a();
    }

    public static final d.a e(d.a aVar) {
        rd.m.e(aVar, "<this>");
        aVar.m(true);
        return aVar;
    }

    public static final d.a f(d.a aVar) {
        rd.m.e(aVar, "<this>");
        aVar.n(true);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final eh.d g(eh.d.b r30, eh.y r31) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.i.g(eh.d$b, eh.y):eh.d");
    }

    public static final String h(eh.d dVar) {
        rd.m.e(dVar, "<this>");
        String strA = dVar.a();
        if (strA != null) {
            return strA;
        }
        StringBuilder sb2 = new StringBuilder();
        if (dVar.i()) {
            sb2.append("no-cache, ");
        }
        if (dVar.j()) {
            sb2.append("no-store, ");
        }
        if (dVar.e() != -1) {
            sb2.append("max-age=");
            sb2.append(dVar.e());
            sb2.append(", ");
        }
        if (dVar.m() != -1) {
            sb2.append("s-maxage=");
            sb2.append(dVar.m());
            sb2.append(", ");
        }
        if (dVar.c()) {
            sb2.append("private, ");
        }
        if (dVar.d()) {
            sb2.append("public, ");
        }
        if (dVar.h()) {
            sb2.append("must-revalidate, ");
        }
        if (dVar.f() != -1) {
            sb2.append("max-stale=");
            sb2.append(dVar.f());
            sb2.append(", ");
        }
        if (dVar.g() != -1) {
            sb2.append("min-fresh=");
            sb2.append(dVar.g());
            sb2.append(", ");
        }
        if (dVar.l()) {
            sb2.append("only-if-cached, ");
        }
        if (dVar.k()) {
            sb2.append("no-transform, ");
        }
        if (dVar.b()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        rd.m.d(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String string = sb2.toString();
        dVar.n(string);
        return string;
    }

    private static final int i(String str, String str2, int i10) {
        int length = str.length();
        while (i10 < length) {
            if (q.O(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }
}
