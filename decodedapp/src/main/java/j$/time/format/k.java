package j$.time.format;

import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f17541d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f17542e = new k("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17545c;

    static {
        new k("+HH:MM:ss", "0");
    }

    public k(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        for (int i10 = 0; i10 < 22; i10++) {
            if (f17541d[i10].equals(str)) {
                this.f17544b = i10;
                this.f17545c = i10 % 11;
                this.f17543a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
    }

    @Override // j$.time.format.g
    public final boolean i(q qVar, StringBuilder sb2) {
        Long lA = qVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z10 = false;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int i10 = (int) jLongValue;
        if (jLongValue != i10) {
            throw new ArithmeticException();
        }
        String str = this.f17543a;
        if (i10 == 0) {
            sb2.append(str);
            return true;
        }
        int iAbs = Math.abs((i10 / 3600) % 100);
        int iAbs2 = Math.abs((i10 / 60) % 60);
        int iAbs3 = Math.abs(i10 % 60);
        int length = sb2.length();
        sb2.append(i10 < 0 ? "-" : "+");
        if (this.f17544b >= 11 && iAbs < 10) {
            sb2.append((char) (iAbs + 48));
        } else {
            a(false, iAbs, sb2);
        }
        int i11 = this.f17545c;
        if ((i11 >= 3 && i11 <= 8) || ((i11 >= 9 && iAbs3 > 0) || (i11 >= 1 && iAbs2 > 0))) {
            a(i11 > 0 && i11 % 2 == 0, iAbs2, sb2);
            iAbs += iAbs2;
            if (i11 == 7 || i11 == 8 || (i11 >= 5 && iAbs3 > 0)) {
                if (i11 > 0 && i11 % 2 == 0) {
                    z10 = true;
                }
                a(z10, iAbs3, sb2);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    public static void a(boolean z10, int i10, StringBuilder sb2) {
        sb2.append(z10 ? ":" : "");
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }

    public final String toString() {
        String strReplace = this.f17543a.replace("'", "''");
        return "Offset(" + f17541d[this.f17544b] + ",'" + strReplace + "')";
    }
}
