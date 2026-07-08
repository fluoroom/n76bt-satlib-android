package j8;

import java.io.IOException;
import java.math.RoundingMode;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
class m extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final j f18544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Character f18545g;

    m(j jVar, Character ch2) {
        this.f18544f = jVar;
        if (ch2 != null && jVar.b('=')) {
            throw new IllegalArgumentException(i.a("Padding character %s was already in alphabet", ch2));
        }
        this.f18545g = ch2;
    }

    @Override // j8.n
    void a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        h.c(0, i11, bArr.length);
        while (i12 < i11) {
            e(appendable, bArr, i12, Math.min(this.f18544f.f18540f, i11 - i12));
            i12 += this.f18544f.f18540f;
        }
    }

    @Override // j8.n
    final int b(int i10) {
        j jVar = this.f18544f;
        return jVar.f18539e * p.a(i10, jVar.f18540f, RoundingMode.CEILING);
    }

    final void e(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        h.c(i10, i10 + i11, bArr.length);
        int i12 = 0;
        h.a(i11 <= this.f18544f.f18540f);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & MessagePack.Code.EXT_TIMESTAMP))) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.f18544f.f18538d;
        while (i12 < i11 * 8) {
            j jVar = this.f18544f;
            appendable.append(jVar.a(jVar.f18537c & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.f18544f.f18538d;
        }
        if (this.f18545g != null) {
            while (i12 < this.f18544f.f18540f * 8) {
                this.f18545g.getClass();
                appendable.append('=');
                i12 += this.f18544f.f18538d;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f18544f.equals(mVar.f18544f)) {
                Character ch2 = this.f18545g;
                Character ch3 = mVar.f18545g;
                if (ch2 == ch3) {
                    return true;
                }
                if (ch2 != null && ch2.equals(ch3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f18544f.hashCode();
        Character ch2 = this.f18545g;
        return iHashCode ^ (ch2 == null ? 0 : ch2.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.f18544f);
        if (8 % this.f18544f.f18538d != 0) {
            if (this.f18545g == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.f18545g);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    m(String str, String str2, Character ch2) {
        this(new j(str, str2.toCharArray()), ch2);
    }
}
