package ei;

import fi.c;

/* JADX INFO: loaded from: classes3.dex */
public class a extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fi.b f12639a;

    public a(c cVar, Object... objArr) {
        fi.b bVar = new fi.b(this);
        this.f12639a = bVar;
        bVar.a(cVar, objArr);
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f12639a.c();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f12639a.d();
    }
}
