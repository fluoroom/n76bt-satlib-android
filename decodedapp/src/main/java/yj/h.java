package yj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f32658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f32659c;

    public h(String str, y yVar) {
        this.f32657a = str;
        this.f32658b = yVar;
        this.f32659c = yVar.L();
    }

    @Override // yj.b0
    public y a(b bVar) {
        return this.f32658b;
    }

    @Override // yj.b0
    public /* synthetic */ boolean b(b bVar) {
        return a0.b(this, bVar);
    }

    @Override // yj.b0
    public y c(i iVar, w wVar) {
        return this.f32659c;
    }

    @Override // yj.b0
    public /* synthetic */ y d(b bVar) {
        return a0.a(this, bVar);
    }

    @Override // yj.b0
    public /* synthetic */ int e(b bVar) {
        return a0.c(this, bVar);
    }

    public String f() {
        return this.f32657a;
    }

    public String toString() {
        return f();
    }
}
