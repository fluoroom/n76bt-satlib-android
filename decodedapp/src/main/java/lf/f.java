package lf;

import ed.g0;
import ed.k0;
import ed.q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kf.a;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements jf.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20563d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f20564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f20565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map f20566g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f20567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f20568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f20569c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20570a;

        static {
            int[] iArr = new int[a.e.c.EnumC0267c.values().length];
            try {
                iArr[a.e.c.EnumC0267c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.e.c.EnumC0267c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.e.c.EnumC0267c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20570a = iArr;
        }
    }

    static {
        String strI0 = q.i0(q.n('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f20564e = strI0;
        List listN = q.n(strI0 + "/Any", strI0 + "/Nothing", strI0 + "/Unit", strI0 + "/Throwable", strI0 + "/Number", strI0 + "/Byte", strI0 + "/Double", strI0 + "/Float", strI0 + "/Int", strI0 + "/Long", strI0 + "/Short", strI0 + "/Boolean", strI0 + "/Char", strI0 + "/CharSequence", strI0 + "/String", strI0 + "/Comparable", strI0 + "/Enum", strI0 + "/Array", strI0 + "/ByteArray", strI0 + "/DoubleArray", strI0 + "/FloatArray", strI0 + "/IntArray", strI0 + "/LongArray", strI0 + "/ShortArray", strI0 + "/BooleanArray", strI0 + "/CharArray", strI0 + "/Cloneable", strI0 + "/Annotation", strI0 + "/collections/Iterable", strI0 + "/collections/MutableIterable", strI0 + "/collections/Collection", strI0 + "/collections/MutableCollection", strI0 + "/collections/List", strI0 + "/collections/MutableList", strI0 + "/collections/Set", strI0 + "/collections/MutableSet", strI0 + "/collections/Map", strI0 + "/collections/MutableMap", strI0 + "/collections/Map.Entry", strI0 + "/collections/MutableMap.MutableEntry", strI0 + "/collections/Iterator", strI0 + "/collections/MutableIterator", strI0 + "/collections/ListIterator", strI0 + "/collections/MutableListIterator");
        f20565f = listN;
        Iterable<g0> iterableO0 = q.O0(listN);
        LinkedHashMap linkedHashMap = new LinkedHashMap(xd.d.b(k0.e(q.v(iterableO0, 10)), 16));
        for (g0 g0Var : iterableO0) {
            linkedHashMap.put((String) g0Var.d(), Integer.valueOf(g0Var.c()));
        }
        f20566g = linkedHashMap;
    }

    public f(String[] strArr, Set set, List list) {
        m.e(strArr, "strings");
        m.e(set, "localNameIndices");
        m.e(list, "records");
        this.f20567a = strArr;
        this.f20568b = set;
        this.f20569c = list;
    }

    @Override // jf.d
    public String a(int i10) {
        return getString(i10);
    }

    @Override // jf.d
    public boolean b(int i10) {
        return this.f20568b.contains(Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // jf.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getString(int r15) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.f.getString(int):java.lang.String");
    }
}
