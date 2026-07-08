package yd;

/* JADX INFO: loaded from: classes3.dex */
public interface i {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32519a = new a("INSTANCE", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f32520b = new a("CONTEXT", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f32521c = new a("EXTENSION_RECEIVER", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f32522d = new a("VALUE", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f32523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kd.a f32524f;

        static {
            a[] aVarArrA = a();
            f32523e = aVarArrA;
            f32524f = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f32519a, f32520b, f32521c, f32522d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f32523e.clone();
        }
    }

    boolean a();

    boolean b();

    int getIndex();

    String getName();

    m getType();

    a j();
}
