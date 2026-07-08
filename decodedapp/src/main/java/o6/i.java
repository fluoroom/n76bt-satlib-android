package o6;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f23243a;

    protected i(int i10) {
        this.f23243a = i10;
    }

    public static i a(h[] hVarArr) {
        if (hVarArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", hVarArr[0].getClass().getName(), Integer.valueOf(hVarArr.length)));
        }
        int iD = 0;
        for (h hVar : hVarArr) {
            if (hVar.a()) {
                iD |= hVar.d();
            }
        }
        return new i(iD);
    }

    public boolean b(h hVar) {
        return (hVar.d() & this.f23243a) != 0;
    }

    public i c(h hVar) {
        int iD = hVar.d() | this.f23243a;
        return iD == this.f23243a ? this : new i(iD);
    }
}
