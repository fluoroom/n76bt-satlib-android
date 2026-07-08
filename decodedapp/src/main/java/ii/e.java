package ii;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends hi.b {
    public static d d(hi.e eVar) {
        if (e(eVar)) {
            byte b10 = eVar.a()[4];
            if (b10 == 72) {
                return new c(eVar);
            }
            if (b10 == 84) {
                return new f(eVar);
            }
        }
        return new a(eVar);
    }

    protected static boolean e(hi.e eVar) {
        byte[] bArrA = eVar.a();
        if (bArrA.length < 12) {
            return false;
        }
        return hi.c.a(d.f16173a, bArrA, 0) || hi.c.a(d.f16174b, bArrA, 0);
    }

    public static boolean f(hi.e eVar) {
        if (eVar.d()) {
            return e(eVar);
        }
        return false;
    }
}
