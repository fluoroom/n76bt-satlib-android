package lg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20585a;

    public static final class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f20586b = new a();

        private a() {
            super(false, null);
        }
    }

    public static final class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f20587b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, null);
            rd.m.e(str, "error");
            this.f20587b = str;
        }
    }

    public static final class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f20588b = new c();

        private c() {
            super(true, null);
        }
    }

    public /* synthetic */ g(boolean z10, rd.h hVar) {
        this(z10);
    }

    public final boolean a() {
        return this.f20585a;
    }

    private g(boolean z10) {
        this.f20585a = z10;
    }
}
