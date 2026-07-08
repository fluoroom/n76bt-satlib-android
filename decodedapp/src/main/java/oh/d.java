package oh;

import androidx.appcompat.widget.ActivityChooserView;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import rd.m;
import rg.q;
import vh.e;
import vh.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23591a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f23592b = "xn--";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f23593c = h.f30792d.d("xn--");

    private d() {
    }

    private final int a(int i10, int i11, boolean z10) {
        int i12 = z10 ? i10 / 700 : i10 / 2;
        int i13 = i12 + (i12 / i11);
        int i14 = 0;
        while (i13 > 455) {
            i13 /= 35;
            i14 += 36;
        }
        return i14 + ((i13 * 36) / (i13 + 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    private final List b(String str, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i10 < i11) {
            int iCharAt = str.charAt(i10);
            if (rg.a.f(iCharAt)) {
                int i12 = i10 + 1;
                char cCharAt = i12 < i11 ? str.charAt(i12) : (char) 0;
                if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                    iCharAt = 63;
                } else {
                    iCharAt = WXMediaMessage.THUMB_LENGTH_LIMIT + (((iCharAt & 1023) << 10) | (cCharAt & 1023));
                    i10 = i12;
                }
            }
            arrayList.add(Integer.valueOf(iCharAt));
            i10++;
        }
        return arrayList;
    }

    private final boolean d(String str, int i10, int i11, e eVar) {
        int i12;
        int i13;
        if (!q.z(str, i10, f23592b, 0, 4, true)) {
            eVar.M(str, i10, i11);
            return true;
        }
        int i14 = i10 + 4;
        ArrayList arrayList = new ArrayList();
        int iH0 = q.h0(str, '-', i11, false, 4, null);
        char c10 = '0';
        char c11 = '[';
        char c12 = '{';
        if (iH0 >= i14) {
            while (i14 < iH0) {
                int i15 = i14 + 1;
                char cCharAt = str.charAt(i14);
                if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && (('0' > cCharAt || cCharAt >= ':') && cCharAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(cCharAt));
                i14 = i15;
            }
            i14++;
        }
        int i16 = 128;
        int iA = 72;
        int i17 = 0;
        while (i14 < i11) {
            xd.a aVarH = xd.d.h(xd.d.i(36, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED), 36);
            int iB = aVarH.b();
            int iC = aVarH.c();
            int iD = aVarH.d();
            if ((iD > 0 && iB <= iC) || (iD < 0 && iC <= iB)) {
                i12 = i17;
                int i18 = 1;
                while (i14 != i11) {
                    int i19 = i14 + 1;
                    char cCharAt2 = str.charAt(i14);
                    if ('a' <= cCharAt2 && cCharAt2 < c12) {
                        i13 = cCharAt2 - 'a';
                    } else if ('A' <= cCharAt2 && cCharAt2 < c11) {
                        i13 = cCharAt2 - 'A';
                    } else {
                        if (c10 > cCharAt2 || cCharAt2 >= ':') {
                            return false;
                        }
                        i13 = cCharAt2 - 22;
                    }
                    int i20 = i18;
                    int i21 = i13 * i20;
                    int i22 = i12;
                    if (i22 > ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i21) {
                        return false;
                    }
                    i12 = i22 + i21;
                    int i23 = iB <= iA ? 1 : iB >= iA + 26 ? 26 : iB - iA;
                    if (i13 >= i23) {
                        int i24 = 36 - i23;
                        if (i20 > ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED / i24) {
                            return false;
                        }
                        i18 = i20 * i24;
                        if (iB != iC) {
                            iB += iD;
                            i14 = i19;
                            c10 = '0';
                            c11 = '[';
                            c12 = '{';
                        }
                    }
                    i14 = i19;
                }
                return false;
            }
            i12 = i17;
            iA = a(i12 - i17, arrayList.size() + 1, i17 == 0);
            int size = i12 / (arrayList.size() + 1);
            if (i16 > ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - size) {
                return false;
            }
            i16 += size;
            int size2 = i12 % (arrayList.size() + 1);
            if (i16 > 1114111) {
                return false;
            }
            arrayList.add(size2, Integer.valueOf(i16));
            i17 = size2 + 1;
            c10 = '0';
            c11 = '[';
            c12 = '{';
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eVar.t(((Number) it.next()).intValue());
        }
        return true;
    }

    private final boolean f(String str, int i10, int i11, e eVar) {
        int i12;
        int i13;
        int i14 = 1;
        if (!h(str, i10, i11)) {
            eVar.M(str, i10, i11);
            return true;
        }
        eVar.Z(f23593c);
        List listB = b(str, i10, i11);
        Iterator it = listB.iterator();
        int i15 = 0;
        while (true) {
            i12 = 128;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue < 128) {
                eVar.writeByte(iIntValue);
                i15++;
            }
        }
        if (i15 > 0) {
            eVar.writeByte(45);
        }
        int iA = 72;
        int i16 = i15;
        int i17 = 0;
        while (i16 < listB.size()) {
            Iterator it2 = listB.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int iIntValue2 = ((Number) next).intValue();
                if (iIntValue2 < i12) {
                    iIntValue2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                }
                do {
                    Object next2 = it2.next();
                    int iIntValue3 = ((Number) next2).intValue();
                    if (iIntValue3 < i12) {
                        iIntValue3 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    }
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
            int iIntValue4 = ((Number) next).intValue();
            int i18 = (iIntValue4 - i12) * (i16 + 1);
            if (i17 > ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i18) {
                return false;
            }
            int i19 = i17 + i18;
            Iterator it3 = listB.iterator();
            while (it3.hasNext()) {
                int iIntValue5 = ((Number) it3.next()).intValue();
                if (iIntValue5 < iIntValue4) {
                    if (i19 == Integer.MAX_VALUE) {
                        return false;
                    }
                    i19++;
                } else if (iIntValue5 == iIntValue4) {
                    xd.a aVarH = xd.d.h(xd.d.i(36, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED), 36);
                    int iB = aVarH.b();
                    int iC = aVarH.c();
                    int iD = aVarH.d();
                    if ((iD > 0 && iB <= iC) || (iD < 0 && iC <= iB)) {
                        i13 = i19;
                        while (true) {
                            if (iB > iA) {
                                i14 = iB >= iA + 26 ? 26 : iB - iA;
                            }
                            if (i13 < i14) {
                                break;
                            }
                            int i20 = i13 - i14;
                            int i21 = 36 - i14;
                            eVar.writeByte(g(i14 + (i20 % i21)));
                            i13 = i20 / i21;
                            if (iB == iC) {
                                break;
                            }
                            iB += iD;
                            i14 = 1;
                        }
                    } else {
                        i13 = i19;
                    }
                    eVar.writeByte(g(i13));
                    int i22 = i16 + 1;
                    iA = a(i19, i22, i16 == i15);
                    i16 = i22;
                    i14 = 1;
                    i19 = 0;
                }
            }
            i17 = i19 + 1;
            i12 = iIntValue4 + 1;
            i14 = 1;
        }
        return true;
    }

    private final int g(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }

    private final boolean h(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) >= 128) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public final String c(String str) {
        m.e(str, "string");
        int length = str.length();
        e eVar = new e();
        int i10 = 0;
        while (i10 < length) {
            String str2 = str;
            int iB0 = q.b0(str2, '.', i10, false, 4, null);
            if (iB0 == -1) {
                iB0 = length;
            }
            if (!d(str2, i10, iB0, eVar)) {
                return null;
            }
            if (iB0 >= length) {
                break;
            }
            eVar.writeByte(46);
            i10 = iB0 + 1;
            str = str2;
        }
        return eVar.w0();
    }

    public final String e(String str) {
        m.e(str, "string");
        int length = str.length();
        e eVar = new e();
        int i10 = 0;
        while (i10 < length) {
            String str2 = str;
            int iB0 = q.b0(str2, '.', i10, false, 4, null);
            if (iB0 == -1) {
                iB0 = length;
            }
            if (!f(str2, i10, iB0, eVar)) {
                return null;
            }
            if (iB0 >= length) {
                break;
            }
            eVar.writeByte(46);
            i10 = iB0 + 1;
            str = str2;
        }
        return eVar.w0();
    }
}
