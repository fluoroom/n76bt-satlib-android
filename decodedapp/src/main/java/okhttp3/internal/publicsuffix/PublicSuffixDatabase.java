package okhttp3.internal.publicsuffix;

import ed.q;
import fh.m;
import java.net.IDN;
import java.util.List;
import kotlin.Metadata;
import qg.k;
import rg.d;
import vh.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "Lokhttp3/internal/publicsuffix/a;", "publicSuffixList", "<init>", "(Lokhttp3/internal/publicsuffix/a;)V", "", "domain", "", "d", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "b", "(Ljava/util/List;)Ljava/util/List;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "a", "Lokhttp3/internal/publicsuffix/a;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f23689c = h.f30792d.e(42);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f23690d = q.e("*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static PublicSuffixDatabase f23691e = new PublicSuffixDatabase(b.a(a.f23693a));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a publicSuffixList;

    /* JADX INFO: renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(h hVar, h[] hVarArr, int i10) {
            int i11;
            int iB;
            boolean z10;
            int iB2;
            int iQ = hVar.Q();
            int i12 = 0;
            while (i12 < iQ) {
                int i13 = (i12 + iQ) / 2;
                while (i13 > -1 && hVar.h(i13) != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (hVar.h(i11) == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iB = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iB = m.b(hVarArr[i17].h(i18), 255);
                        z10 = z12;
                    }
                    iB2 = iB - m.b(hVar.h(i14 + i19), 255);
                    if (iB2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (hVarArr[i17].Q() != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == hVarArr.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iB2 >= 0) {
                    if (iB2 <= 0) {
                        int i20 = i16 - i19;
                        int iQ2 = hVarArr[i17].Q() - i18;
                        int length = hVarArr.length;
                        for (int i21 = i17 + 1; i21 < length; i21++) {
                            iQ2 += hVarArr[i21].Q();
                        }
                        if (iQ2 >= i20) {
                            if (iQ2 <= i20) {
                                return hVar.T(i14, i16 + i14).S(d.f26007b);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                iQ = i13;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.f23691e;
        }

        private Companion() {
        }
    }

    public PublicSuffixDatabase(a aVar) {
        rd.m.e(aVar, "publicSuffixList");
        this.publicSuffixList = aVar;
    }

    private final List b(List domainLabels) {
        String str;
        String strB;
        String str2;
        List listK;
        List listK2;
        this.publicSuffixList.b();
        int size = domainLabels.size();
        h[] hVarArr = new h[size];
        for (int i10 = 0; i10 < size; i10++) {
            hVarArr[i10] = h.f30792d.d((String) domainLabels.get(i10));
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strB = null;
                break;
            }
            strB = INSTANCE.b(this.publicSuffixList.a(), hVarArr, i11);
            if (strB != null) {
                break;
            }
            i11++;
        }
        if (size > 1) {
            h[] hVarArr2 = (h[]) hVarArr.clone();
            int length = hVarArr2.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                hVarArr2[i12] = f23689c;
                String strB2 = INSTANCE.b(this.publicSuffixList.a(), hVarArr2, i12);
                if (strB2 != null) {
                    str2 = strB2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i13 = size - 1;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                String strB3 = INSTANCE.b(this.publicSuffixList.c(), hVarArr, i14);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
                i14++;
            }
        }
        if (str != null) {
            return rg.q.B0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f23690d;
        }
        if (strB == null || (listK = rg.q.B0(strB, new char[]{'.'}, false, 0, 6, null)) == null) {
            listK = q.k();
        }
        if (str2 == null || (listK2 = rg.q.B0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listK2 = q.k();
        }
        return listK.size() > listK2.size() ? listK : listK2;
    }

    private final List d(String domain) {
        List listB0 = rg.q.B0(domain, new char[]{'.'}, false, 0, 6, null);
        return rd.m.a(q.k0(listB0), "") ? q.W(listB0, 1) : listB0;
    }

    public final String c(String domain) {
        int size;
        int size2;
        rd.m.e(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        rd.m.b(unicode);
        List listD = d(unicode);
        List listB = b(listD);
        if (listD.size() == listB.size() && ((String) listB.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listB.get(0)).charAt(0) == '!') {
            size = listD.size();
            size2 = listB.size();
        } else {
            size = listD.size();
            size2 = listB.size() + 1;
        }
        return k.F(k.w(q.S(d(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
