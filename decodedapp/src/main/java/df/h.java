package df;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f10980e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f10981f = new h(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f10983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f10984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10985d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final h a() {
            return h.f10981f;
        }

        private a() {
        }
    }

    public h(k kVar, i iVar, boolean z10, boolean z11) {
        this.f10982a = kVar;
        this.f10983b = iVar;
        this.f10984c = z10;
        this.f10985d = z11;
    }

    public static /* synthetic */ h c(h hVar, k kVar, i iVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = hVar.f10982a;
        }
        if ((i10 & 2) != 0) {
            iVar = hVar.f10983b;
        }
        if ((i10 & 4) != 0) {
            z10 = hVar.f10984c;
        }
        if ((i10 & 8) != 0) {
            z11 = hVar.f10985d;
        }
        return hVar.b(kVar, iVar, z10, z11);
    }

    public final h b(k kVar, i iVar, boolean z10, boolean z11) {
        return new h(kVar, iVar, z10, z11);
    }

    public final boolean d() {
        return this.f10984c;
    }

    public final i e() {
        return this.f10983b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f10982a == hVar.f10982a && this.f10983b == hVar.f10983b && this.f10984c == hVar.f10984c && this.f10985d == hVar.f10985d;
    }

    public final k f() {
        return this.f10982a;
    }

    public final boolean g() {
        return this.f10985d;
    }

    public int hashCode() {
        k kVar = this.f10982a;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        i iVar = this.f10983b;
        return ((((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31) + o4.b.a(this.f10984c)) * 31) + o4.b.a(this.f10985d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f10982a + ", mutability=" + this.f10983b + ", definitelyNotNull=" + this.f10984c + ", isNullabilityQualifierForWarning=" + this.f10985d + ')';
    }

    public /* synthetic */ h(k kVar, i iVar, boolean z10, boolean z11, int i10, rd.h hVar) {
        this(kVar, iVar, z10, (i10 & 8) != 0 ? false : z11);
    }
}
