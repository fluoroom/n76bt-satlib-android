package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends a implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final t f17501c = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n q(int i10) {
        if (i10 == 0) {
            return u.BCE;
        }
        if (i10 == 1) {
            return u.CE;
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.m
    public final String h() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String n() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final b t(j$.time.temporal.n nVar) {
        return j$.time.g.E(nVar);
    }

    private t() {
    }

    @Override // j$.time.chrono.a, j$.time.chrono.m
    public final e u(j$.time.i iVar) {
        return j$.time.i.D(iVar);
    }

    public static boolean j(long j10) {
        if ((3 & j10) == 0) {
            return j10 % 100 != 0 || j10 % 400 == 0;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new f0((byte) 1, this);
    }
}
