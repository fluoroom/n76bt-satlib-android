package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f17459c = new b0();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.m
    public final String h() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final n q(int i10) {
        if (i10 == 0) {
            return e0.BEFORE_ROC;
        }
        if (i10 == 1) {
            return e0.ROC;
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final b t(j$.time.temporal.n nVar) {
        if (nVar instanceof d0) {
            return (d0) nVar;
        }
        return new d0(j$.time.g.E(nVar));
    }

    public final j$.time.temporal.u j(j$.time.temporal.a aVar) {
        int i10 = a0.f17458a[aVar.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.f17612b;
            return j$.time.temporal.u.e(uVar.f17637a - 22932, uVar.f17640d - 22932);
        }
        if (i10 == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.f17612b;
            return j$.time.temporal.u.f(uVar2.f17640d - 1911, (-uVar2.f17637a) + 1912);
        }
        if (i10 != 3) {
            return aVar.f17612b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.f17612b;
        return j$.time.temporal.u.e(uVar3.f17637a - 1911, uVar3.f17640d - 1911);
    }

    private b0() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
