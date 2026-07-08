package mh;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a */
    public static final f f22139a = new f();

    /* JADX INFO: renamed from: b */
    public static final vh.h f22140b = vh.h.f30792d.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: c */
    private static final String[] f22141c = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: d */
    private static final String[] f22142d = new String[64];

    /* JADX INFO: renamed from: e */
    private static final String[] f22143e;

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            rd.m.d(binaryString, "toBinaryString(...)");
            strArr[i10] = rg.q.E(fh.p.j("%8s", binaryString), ' ', '0', false, 4, null);
        }
        f22143e = strArr;
        String[] strArr2 = f22142d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = strArr2[i11] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f22142d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + '|' + strArr3[i13] + "|PADDED";
        }
        int length = f22142d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f22142d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f22143e[i16];
            }
        }
    }

    private f() {
    }

    public final String a(int i10, int i11) {
        String str;
        if (i11 == 0) {
            return "";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f22143e[i11];
            }
            if (i10 != 7 && i10 != 8) {
                String[] strArr = f22142d;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    rd.m.b(str);
                } else {
                    str = f22143e[i11];
                }
                String str2 = str;
                return (i10 != 5 || (i11 & 4) == 0) ? (i10 != 0 || (i11 & 32) == 0) ? str2 : rg.q.F(str2, "PRIORITY", "COMPRESSED", false, 4, null) : rg.q.F(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
            }
        }
        return f22143e[i11];
    }

    public final String b(int i10) {
        String[] strArr = f22141c;
        return i10 < strArr.length ? strArr[i10] : fh.p.j("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return fh.p.j("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }

    public final String d(boolean z10, int i10, int i11, long j10) {
        return fh.p.j("%s 0x%08x %5d %-13s %d", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(8), Long.valueOf(j10));
    }
}
