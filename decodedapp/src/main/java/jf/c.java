package jf;

import java.util.Arrays;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends jf.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f18689h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f18690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f18691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f18692k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f18693g;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    static {
        c cVar = new c(2, 2, 0);
        f18690i = cVar;
        f18691j = cVar.m();
        f18692k = new c(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int[] iArr, boolean z10) {
        super(Arrays.copyOf(iArr, iArr.length));
        m.e(iArr, "versionArray");
        this.f18693g = z10;
    }

    private final boolean i(c cVar) {
        if ((a() == 1 && b() == 0) || a() == 0) {
            return false;
        }
        return !l(cVar);
    }

    private final boolean l(c cVar) {
        if (a() > cVar.a()) {
            return true;
        }
        return a() >= cVar.a() && b() > cVar.b();
    }

    public final boolean h(c cVar) {
        m.e(cVar, "metadataVersionFromLanguageVersion");
        return i(cVar.k(this.f18693g));
    }

    public final boolean j() {
        return this.f18693g;
    }

    public final c k(boolean z10) {
        c cVar = z10 ? f18690i : f18691j;
        return cVar.l(this) ? cVar : this;
    }

    public final c m() {
        return (a() == 1 && b() == 9) ? new c(2, 0, 0) : new c(a(), b() + 1, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int... iArr) {
        this(iArr, false);
        m.e(iArr, "numbers");
    }
}
