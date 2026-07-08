package pf;

import java.util.ArrayList;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v {
    private static final /* synthetic */ v[] B;
    private static final /* synthetic */ kd.a C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f24200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f24201d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24215a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f24202e = new v("VISIBILITY", 0, true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f24203f = new v("MODALITY", 1, true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f24204g = new v("OVERRIDE", 2, true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v f24205h = new v("ANNOTATIONS", 3, false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v f24206r = new v("INNER", 4, true);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v f24207s = new v("MEMBER_KIND", 5, true);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final v f24208t = new v("DATA", 6, true);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v f24209u = new v("INLINE", 7, true);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final v f24210v = new v("EXPECT", 8, true);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final v f24211w = new v("ACTUAL", 9, true);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final v f24212x = new v("CONST", 10, true);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final v f24213y = new v("LATEINIT", 11, true);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final v f24214z = new v("FUN", 12, true);
    public static final v A = new v("VALUE", 13, true);

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    static {
        v[] vVarArrA = a();
        B = vVarArrA;
        C = kd.b.a(vVarArrA);
        f24199b = new a(null);
        v[] vVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (v vVar : vVarArrValues) {
            if (vVar.f24215a) {
                arrayList.add(vVar);
            }
        }
        f24200c = ed.q.M0(arrayList);
        f24201d = ed.j.w0(values());
    }

    private v(String str, int i10, boolean z10) {
        this.f24215a = z10;
    }

    private static final /* synthetic */ v[] a() {
        return new v[]{f24202e, f24203f, f24204g, f24205h, f24206r, f24207s, f24208t, f24209u, f24210v, f24211w, f24212x, f24213y, f24214z, A};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) B.clone();
    }
}
