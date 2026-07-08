package j6;

import java.math.BigInteger;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class e0 {
    static BigInteger a(CharSequence charSequence, int i10, int i11) {
        int i12 = i11 - i10;
        i iVar = new i(m.d(i12));
        int i13 = (i12 & 7) + i10;
        int iM = k.m(charSequence, i10, i13);
        boolean z10 = iM >= 0;
        iVar.a(iM);
        while (i13 < i11) {
            int iF = k.f(charSequence, i13);
            z10 &= iF >= 0;
            iVar.b(100000000, iF);
            i13 += 8;
        }
        if (z10) {
            return iVar.c();
        }
        throw new NumberFormatException("illegal syntax");
    }

    static BigInteger b(CharSequence charSequence, int i10, int i11, Map map, int i12) {
        if (i11 - i10 <= i12) {
            return a(charSequence, i10, i11);
        }
        int iG = m.g(i10, i11);
        return b(charSequence, iG, i11, map, i12).add(n.k(b(charSequence, i10, iG, map, i12), (BigInteger) map.get(Integer.valueOf(i11 - iG))));
    }
}
