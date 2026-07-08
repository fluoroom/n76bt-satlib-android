package rd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends d implements j, yd.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f25954h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f25955r;

    public k(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f25954h = i10;
        this.f25955r = i11 >> 1;
    }

    @Override // rd.j
    public int c() {
        return this.f25954h;
    }

    @Override // rd.d
    protected yd.b d() {
        return c0.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return getName().equals(kVar.getName()) && o().equals(kVar.o()) && this.f25955r == kVar.f25955r && this.f25954h == kVar.f25954h && m.a(e(), kVar.e()) && m.a(g(), kVar.g());
        }
        if (obj instanceof yd.f) {
            return obj.equals(b());
        }
        return false;
    }

    public int hashCode() {
        return (((g() == null ? 0 : g().hashCode() * 31) + getName().hashCode()) * 31) + o().hashCode();
    }

    public String toString() {
        yd.b bVarB = b();
        if (bVarB != this) {
            return bVarB.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
