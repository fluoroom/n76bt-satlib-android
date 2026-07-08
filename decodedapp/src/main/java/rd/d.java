package rd;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements yd.b, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f25938g = a.f25945a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient yd.b f25939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Object f25940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f25941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f25944f;

    private static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f25945a = new a();

        private a() {
        }
    }

    protected d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f25940b = obj;
        this.f25941c = cls;
        this.f25942d = str;
        this.f25943e = str2;
        this.f25944f = z10;
    }

    public yd.b b() {
        yd.b bVar = this.f25939a;
        if (bVar != null) {
            return bVar;
        }
        yd.b bVarD = d();
        this.f25939a = bVarD;
        return bVarD;
    }

    protected abstract yd.b d();

    public Object e() {
        return this.f25940b;
    }

    public yd.e g() {
        Class cls = this.f25941c;
        if (cls == null) {
            return null;
        }
        return this.f25944f ? c0.c(cls) : c0.b(cls);
    }

    @Override // yd.b
    public String getName() {
        return this.f25942d;
    }

    protected yd.b n() {
        yd.b bVarB = b();
        if (bVarB != this) {
            return bVarB;
        }
        throw new pd.b();
    }

    public String o() {
        return this.f25943e;
    }
}
