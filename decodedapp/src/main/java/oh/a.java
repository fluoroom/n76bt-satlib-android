package oh;

import dd.d0;
import rd.m;
import vh.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f23589c;

    public a(String str, String str2, String str3) {
        m.e(str, "sections");
        m.e(str2, "ranges");
        m.e(str3, "mappings");
        this.f23587a = str;
        this.f23588b = str2;
        this.f23589c = str3;
    }

    private final int a(int i10, int i11, int i12) {
        int i13;
        int i14 = i10 & 127;
        int i15 = i12 - 1;
        while (true) {
            if (i11 > i15) {
                i13 = (-i11) - 1;
                break;
            }
            i13 = (i11 + i15) / 2;
            int iF = m.f(i14, this.f23588b.charAt(i13 * 4));
            if (iF >= 0) {
                if (iF <= 0) {
                    break;
                }
                i11 = i13 + 1;
            } else {
                i15 = i13 - 1;
            }
        }
        return i13 >= 0 ? i13 * 4 : ((-i13) - 2) * 4;
    }

    private final int b(int i10) {
        int i11;
        int i12 = (i10 & 2097024) >> 7;
        int length = (this.f23587a.length() / 4) - 1;
        int i13 = 0;
        while (true) {
            if (i13 > length) {
                i11 = (-i13) - 1;
                break;
            }
            i11 = (i13 + length) / 2;
            int iF = m.f(i12, c.a(this.f23587a, i11 * 4));
            if (iF >= 0) {
                if (iF <= 0) {
                    break;
                }
                i13 = i11 + 1;
            } else {
                length = i11 - 1;
            }
        }
        return i11 >= 0 ? i11 * 4 : ((-i11) - 2) * 4;
    }

    public final boolean c(int i10, f fVar) {
        m.e(fVar, "sink");
        int iB = b(i10);
        int iA = a(i10, c.a(this.f23587a, iB + 2), iB + 4 < this.f23587a.length() ? c.a(this.f23587a, iB + 6) : this.f23588b.length() / 4);
        char cCharAt = this.f23588b.charAt(iA + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int iA2 = c.a(this.f23588b, iA + 2);
            fVar.M(this.f23589c, iA2, cCharAt + iA2);
            return true;
        }
        if ('@' <= cCharAt && cCharAt < 'P') {
            fVar.t(i10 - (this.f23588b.charAt(iA + 3) | (((cCharAt & 15) << 14) | (this.f23588b.charAt(iA + 2) << 7))));
            return true;
        }
        if ('P' <= cCharAt && cCharAt < '`') {
            fVar.t(i10 + (this.f23588b.charAt(iA + 3) | ((cCharAt & 15) << 14) | (this.f23588b.charAt(iA + 2) << 7)));
            return true;
        }
        if (cCharAt == 'w') {
            d0 d0Var = d0.f10897a;
            return true;
        }
        if (cCharAt == 'x') {
            fVar.t(i10);
            return true;
        }
        if (cCharAt == 'y') {
            fVar.t(i10);
            return false;
        }
        if (cCharAt == 'z') {
            fVar.writeByte(this.f23588b.charAt(iA + 2));
            return true;
        }
        if (cCharAt == '{') {
            fVar.writeByte(this.f23588b.charAt(iA + 2) | 128);
            return true;
        }
        if (cCharAt == '|') {
            fVar.writeByte(this.f23588b.charAt(iA + 2));
            fVar.writeByte(this.f23588b.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '}') {
            fVar.writeByte(this.f23588b.charAt(iA + 2) | 128);
            fVar.writeByte(this.f23588b.charAt(iA + 3));
            return true;
        }
        if (cCharAt == '~') {
            fVar.writeByte(this.f23588b.charAt(iA + 2));
            fVar.writeByte(this.f23588b.charAt(iA + 3) | 128);
            return true;
        }
        if (cCharAt == 127) {
            fVar.writeByte(this.f23588b.charAt(iA + 2) | 128);
            fVar.writeByte(this.f23588b.charAt(iA + 3) | 128);
            return true;
        }
        throw new IllegalStateException(("unexpected rangesIndex for " + i10).toString());
    }
}
