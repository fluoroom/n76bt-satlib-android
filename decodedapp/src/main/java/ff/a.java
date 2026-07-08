package ff;

import ed.j;
import ed.k0;
import ed.q;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.c;
import rd.h;
import rd.m;
import xd.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0182a f13015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f13016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f13017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f13018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f13019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f13020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f13021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f13022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f13023i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ff.a$a, reason: collision with other inner class name */
    public static final class EnumC0182a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0183a f13024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Map f13025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EnumC0182a f13026d = new EnumC0182a("UNKNOWN", 0, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final EnumC0182a f13027e = new EnumC0182a("CLASS", 1, 1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final EnumC0182a f13028f = new EnumC0182a("FILE_FACADE", 2, 2);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final EnumC0182a f13029g = new EnumC0182a("SYNTHETIC_CLASS", 3, 3);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final EnumC0182a f13030h = new EnumC0182a("MULTIFILE_CLASS", 4, 4);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final EnumC0182a f13031r = new EnumC0182a("MULTIFILE_CLASS_PART", 5, 5);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ EnumC0182a[] f13032s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ kd.a f13033t;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f13034a;

        /* JADX INFO: renamed from: ff.a$a$a, reason: collision with other inner class name */
        public static final class C0183a {
            public /* synthetic */ C0183a(h hVar) {
                this();
            }

            public final EnumC0182a a(int i10) {
                EnumC0182a enumC0182a = (EnumC0182a) EnumC0182a.f13025c.get(Integer.valueOf(i10));
                return enumC0182a == null ? EnumC0182a.f13026d : enumC0182a;
            }

            private C0183a() {
            }
        }

        static {
            EnumC0182a[] enumC0182aArrA = a();
            f13032s = enumC0182aArrA;
            f13033t = kd.b.a(enumC0182aArrA);
            f13024b = new C0183a(null);
            EnumC0182a[] enumC0182aArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(d.b(k0.e(enumC0182aArrValues.length), 16));
            for (EnumC0182a enumC0182a : enumC0182aArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC0182a.f13034a), enumC0182a);
            }
            f13025c = linkedHashMap;
        }

        private EnumC0182a(String str, int i10, int i11) {
            this.f13034a = i11;
        }

        private static final /* synthetic */ EnumC0182a[] a() {
            return new EnumC0182a[]{f13026d, f13027e, f13028f, f13029g, f13030h, f13031r};
        }

        public static final EnumC0182a e(int i10) {
            return f13024b.a(i10);
        }

        public static EnumC0182a valueOf(String str) {
            return (EnumC0182a) Enum.valueOf(EnumC0182a.class, str);
        }

        public static EnumC0182a[] values() {
            return (EnumC0182a[]) f13032s.clone();
        }
    }

    public a(EnumC0182a enumC0182a, c cVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        m.e(enumC0182a, "kind");
        m.e(cVar, "metadataVersion");
        this.f13015a = enumC0182a;
        this.f13016b = cVar;
        this.f13017c = strArr;
        this.f13018d = strArr2;
        this.f13019e = strArr3;
        this.f13020f = str;
        this.f13021g = i10;
        this.f13022h = str2;
        this.f13023i = bArr;
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final String[] a() {
        return this.f13017c;
    }

    public final String[] b() {
        return this.f13018d;
    }

    public final EnumC0182a c() {
        return this.f13015a;
    }

    public final c d() {
        return this.f13016b;
    }

    public final String e() {
        String str = this.f13020f;
        if (this.f13015a == EnumC0182a.f13031r) {
            return str;
        }
        return null;
    }

    public final List f() {
        String[] strArr = this.f13017c;
        if (this.f13015a != EnumC0182a.f13030h) {
            strArr = null;
        }
        List listD = strArr != null ? j.d(strArr) : null;
        return listD == null ? q.k() : listD;
    }

    public final String[] g() {
        return this.f13019e;
    }

    public final boolean i() {
        return h(this.f13021g, 2);
    }

    public final boolean j() {
        return h(this.f13021g, 16) && !h(this.f13021g, 32);
    }

    public String toString() {
        return this.f13015a + " version=" + this.f13016b;
    }
}
