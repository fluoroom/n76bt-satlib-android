package fe;

import ed.q;
import fe.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13009c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f13010d = new g(q.n(f.a.f13005f, f.d.f13008f, f.b.f13006f, f.c.f13007f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f13011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f13012b;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final g a() {
            return g.f13010d;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f13013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13014b;

        public b(f fVar, int i10) {
            m.e(fVar, "kind");
            this.f13013a = fVar;
            this.f13014b = i10;
        }

        public final f a() {
            return this.f13013a;
        }

        public final int b() {
            return this.f13014b;
        }

        public final f c() {
            return this.f13013a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return m.a(this.f13013a, bVar.f13013a) && this.f13014b == bVar.f13014b;
        }

        public int hashCode() {
            return (this.f13013a.hashCode() * 31) + this.f13014b;
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f13013a + ", arity=" + this.f13014b + ')';
        }
    }

    public g(List list) {
        m.e(list, "kinds");
        this.f13011a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            mf.c cVarB = ((f) obj).b();
            Object arrayList = linkedHashMap.get(cVarB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVarB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f13012b = linkedHashMap;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int iCharAt = str.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i10 = (i10 * 10) + iCharAt;
        }
        return Integer.valueOf(i10);
    }

    public final f b(mf.c cVar, String str) {
        m.e(cVar, "packageFqName");
        m.e(str, "className");
        b bVarC = c(cVar, str);
        if (bVarC != null) {
            return bVarC.c();
        }
        return null;
    }

    public final b c(mf.c cVar, String str) {
        m.e(cVar, "packageFqName");
        m.e(str, "className");
        List<f> list = (List) this.f13012b.get(cVar);
        if (list == null) {
            return null;
        }
        for (f fVar : list) {
            if (rg.q.J(str, fVar.a(), false, 2, null)) {
                String strSubstring = str.substring(fVar.a().length());
                m.d(strSubstring, "substring(...)");
                Integer numD = d(strSubstring);
                if (numD != null) {
                    return new b(fVar, numD.intValue());
                }
            }
        }
        return null;
    }
}
