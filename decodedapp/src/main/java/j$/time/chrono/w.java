package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f17504c = new w();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.m
    public final String h() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final b t(j$.time.temporal.n nVar) {
        if (nVar instanceof y) {
            return (y) nVar;
        }
        return new y(j$.time.g.E(nVar));
    }

    private w() {
    }

    @Override // j$.time.chrono.m
    public final n q(int i10) {
        return z.q(i10);
    }

    public final j$.time.temporal.u j(j$.time.temporal.a aVar) {
        switch (v.f17503a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.t("Unsupported field: " + aVar);
            case 5:
                z[] zVarArr = z.f17511e;
                int i10 = zVarArr[zVarArr.length - 1].f17513b.f17572a;
                int iMin = 1000000000 - zVarArr[zVarArr.length - 1].f17513b.f17572a;
                int i11 = zVarArr[0].f17513b.f17572a;
                int i12 = 1;
                while (true) {
                    z[] zVarArr2 = z.f17511e;
                    if (i12 >= zVarArr2.length) {
                        return j$.time.temporal.u.f(iMin, 999999999 - i10);
                    }
                    z zVar = zVarArr2[i12];
                    iMin = Math.min(iMin, (zVar.f17513b.f17572a - i11) + 1);
                    i11 = zVar.f17513b.f17572a;
                    i12++;
                }
                break;
            case 6:
                z zVar2 = z.f17510d;
                long jMin = j$.time.temporal.a.DAY_OF_YEAR.f17612b.f17639c;
                for (z zVar3 : z.f17511e) {
                    jMin = Math.min(jMin, ((zVar3.f17513b.I() ? 366 : 365) - zVar3.f17513b.H()) + 1);
                    if (zVar3.n() != null) {
                        jMin = Math.min(jMin, zVar3.n().f17513b.H() - 1);
                    }
                }
                return j$.time.temporal.u.f(jMin, j$.time.temporal.a.DAY_OF_YEAR.f17612b.f17640d);
            case 7:
                return j$.time.temporal.u.e(y.f17506d.f17572a, 999999999L);
            case 8:
                long j10 = z.f17510d.f17512a;
                z[] zVarArr3 = z.f17511e;
                return j$.time.temporal.u.e(j10, zVarArr3[zVarArr3.length - 1].f17512a);
            default:
                return aVar.f17612b;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
