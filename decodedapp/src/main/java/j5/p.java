package j5;

import com.dw.ht.entitys.Satellite;
import nk.b;
import rg.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final Satellite b(b.C0305b c0305b) {
        rd.m.e(c0305b, "<this>");
        String name = c0305b.getName();
        rd.m.d(name, "getName(...)");
        int iD = c0305b.D();
        String strK = c0305b.K();
        rd.m.d(strK, "getTLELine1(...)");
        String strL = c0305b.L();
        rd.m.d(strL, "getTLELine2(...)");
        return new Satellite(0L, name, iD, strK, strL, false, false, null, 0, 0, null, null, 0, 0, 0, 0L, 65504, null);
    }

    public static final boolean c(Satellite satellite, b.C0305b c0305b) {
        boolean z10;
        if (rd.m.a(satellite.getName(), c0305b.getName()) || !q.e0(satellite.getName())) {
            z10 = false;
        } else {
            String name = c0305b.getName();
            rd.m.d(name, "getName(...)");
            satellite.y(name);
            z10 = true;
        }
        if (satellite.getNoradCatID() != c0305b.D()) {
            satellite.z(c0305b.D());
            z10 = true;
        }
        if (!rd.m.a(satellite.getTleLine1(), c0305b.K())) {
            String strK = c0305b.K();
            rd.m.d(strK, "getTLELine1(...)");
            satellite.G(strK);
            z10 = true;
        }
        if (!rd.m.a(satellite.getTleLine2(), c0305b.L())) {
            String strL = c0305b.L();
            rd.m.d(strL, "getTLELine2(...)");
            satellite.H(strL);
            z10 = true;
        }
        if (satellite.getUpdatedAt() == c0305b.N()) {
            return z10;
        }
        satellite.L(c0305b.N());
        return true;
    }
}
