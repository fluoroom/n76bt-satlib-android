package ok;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f23671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f23672b;

    public k(di.a aVar, di.a aVar2) {
        this.f23671a = new d(aVar);
        this.f23672b = new d(aVar2);
    }

    public boolean a() {
        return this.f23671a.f23659b.equals(new di.a(0.0d, 0.0d)) && this.f23672b.f23659b.equals(new di.a(0.0d, 0.0d));
    }

    public k(di.a aVar, di.a aVar2, di.a aVar3, di.a aVar4) {
        this.f23671a = new d(aVar, aVar3);
        this.f23672b = new d(aVar2, aVar4);
    }
}
