package s9;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class a implements r9.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27076a = new C0373a("KEY", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f27077b = new b("VALUE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f27078c = a();

        /* JADX INFO: renamed from: s9.r$a$a, reason: collision with other inner class name */
        enum C0373a extends a {
            C0373a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // r9.e
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        enum b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // r9.e
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i10) {
        }

        private static /* synthetic */ a[] a() {
            return new a[]{f27076a, f27077b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f27078c.clone();
        }

        /* synthetic */ a(String str, int i10, q qVar) {
            this(str, i10);
        }
    }

    static int a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) Math.ceil(((double) i10) / 0.75d) : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        c.b(i10, "expectedSize");
        return i10 + 1;
    }

    static boolean b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static LinkedHashMap c(int i10) {
        return new LinkedHashMap(a(i10));
    }

    static String d(Map map) {
        StringBuilder sbA = d.a(map.size());
        sbA.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
            z10 = false;
        }
        sbA.append('}');
        return sbA.toString();
    }

    static r9.e e() {
        return a.f27077b;
    }
}
