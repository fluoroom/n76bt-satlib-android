package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f17475c = new h0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.m
    public final n q(int i10) {
        if (i10 == 0) {
            return k0.BEFORE_BE;
        }
        if (i10 == 1) {
            return k0.BE;
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.m
    public final String h() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final b t(j$.time.temporal.n nVar) {
        if (nVar instanceof j0) {
            return (j0) nVar;
        }
        return new j0(j$.time.g.E(nVar));
    }

    private h0() {
    }

    public final j$.time.temporal.u j(j$.time.temporal.a aVar) {
        int i10 = g0.f17469a[aVar.ordinal()];
        if (i10 == 1) {
            j$.time.temporal.u uVar = j$.time.temporal.a.PROLEPTIC_MONTH.f17612b;
            return j$.time.temporal.u.e(uVar.f17637a + 6516, uVar.f17640d + 6516);
        }
        if (i10 == 2) {
            j$.time.temporal.u uVar2 = j$.time.temporal.a.YEAR.f17612b;
            return j$.time.temporal.u.f((-(uVar2.f17637a + 543)) + 1, uVar2.f17640d + 543);
        }
        if (i10 != 3) {
            return aVar.f17612b;
        }
        j$.time.temporal.u uVar3 = j$.time.temporal.a.YEAR.f17612b;
        return j$.time.temporal.u.e(uVar3.f17637a + 543, uVar3.f17640d + 543);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
