package y1;

import g3.a;
import rd.m;
import v4.c1;
import v4.v;

/* JADX INFO: loaded from: classes.dex */
public final class g extends g3.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(byte[] bArr, boolean z10) {
        super(bArr, z10);
        m.e(bArr, "source");
    }

    @Override // g3.d
    public String toString() {
        a.b bVarL;
        StringBuilder sb2 = new StringBuilder();
        int iM = m();
        Object objD = "XX";
        sb2.append(iM != 2 ? iM != 3 ? iM != 4106 ? "XX" : "HM" : "JF" : "BS");
        sb2.append(':');
        int iM2 = m();
        if (iM2 == 2) {
            objD = v.d(e());
            m.d(objD, "valueOf(...)");
        } else if (iM2 == 3) {
            objD = c1.d(e());
            m.d(objD, "valueOf(...)");
        } else if (iM2 == 4106) {
            objD = h.f32337b.a(e());
        }
        sb2.append(objD);
        byte[] bArrI = i();
        if (bArrI != null) {
            sb2.append('[');
            sb2.append(bArrI.length);
            sb2.append(']');
        }
        if (n() && (bVarL = l()) != null) {
            sb2.append('(');
            sb2.append(bVarL);
            sb2.append(')');
        }
        String string = sb2.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
