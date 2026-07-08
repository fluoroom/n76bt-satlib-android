package rd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x extends d implements yd.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f25959h;

    public x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f25959h = (i10 & 2) == 2;
    }

    @Override // rd.d
    public yd.b b() {
        return this.f25959h ? this : super.b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return g().equals(xVar.g()) && getName().equals(xVar.getName()) && o().equals(xVar.o()) && m.a(e(), xVar.e());
        }
        if (obj instanceof yd.j) {
            return obj.equals(b());
        }
        return false;
    }

    public int hashCode() {
        return (((g().hashCode() * 31) + getName().hashCode()) * 31) + o().hashCode();
    }

    protected yd.j p() {
        if (this.f25959h) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (yd.j) super.n();
    }

    public String toString() {
        yd.b bVarB = b();
        if (bVarB != this) {
            return bVarB.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
