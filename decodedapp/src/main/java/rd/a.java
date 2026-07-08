package rd;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f25925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f25926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f25929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f25930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f25931g;

    public a(int i10, Object obj, Class cls, String str, String str2, int i11) {
        this.f25925a = obj;
        this.f25926b = cls;
        this.f25927c = str;
        this.f25928d = str2;
        this.f25929e = (i11 & 1) == 1;
        this.f25930f = i10;
        this.f25931g = i11 >> 1;
    }

    @Override // rd.j
    public int c() {
        return this.f25930f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25929e == aVar.f25929e && this.f25930f == aVar.f25930f && this.f25931g == aVar.f25931g && m.a(this.f25925a, aVar.f25925a) && m.a(this.f25926b, aVar.f25926b) && this.f25927c.equals(aVar.f25927c) && this.f25928d.equals(aVar.f25928d);
    }

    public int hashCode() {
        Object obj = this.f25925a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f25926b;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f25927c.hashCode()) * 31) + this.f25928d.hashCode()) * 31) + (this.f25929e ? 1231 : 1237)) * 31) + this.f25930f) * 31) + this.f25931g;
    }

    public String toString() {
        return c0.g(this);
    }
}
