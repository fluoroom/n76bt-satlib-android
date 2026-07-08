package i7;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f15909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Enum[] f15910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e6.p[] f15911c;

    private l(Class cls, e6.p[] pVarArr) {
        this.f15909a = cls;
        this.f15910b = (Enum[]) cls.getEnumConstants();
        this.f15911c = pVarArr;
    }

    public static l a(Class cls, e6.p[] pVarArr) {
        return new l(cls, pVarArr);
    }

    public static l b(r6.q qVar, Class cls) {
        Class clsR = h.r(cls);
        Enum[] enumArr = (Enum[]) clsR.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
        }
        String[] strArrQ = qVar.g().q(clsR, enumArr, new String[enumArr.length]);
        e6.p[] pVarArr = new e6.p[enumArr.length];
        int length = enumArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Enum r52 = enumArr[i10];
            String lowerCase = strArrQ[i10];
            if (lowerCase == null) {
                lowerCase = r52.name();
            }
            if (qVar.N(r6.n.WRITE_ENUMS_TO_LOWERCASE)) {
                lowerCase = lowerCase.toLowerCase();
            }
            pVarArr[r52.ordinal()] = qVar.d(lowerCase);
        }
        return a(cls, pVarArr);
    }

    public Class c() {
        return this.f15909a;
    }

    public e6.p d(Enum r22) {
        return this.f15911c[r22.ordinal()];
    }
}
