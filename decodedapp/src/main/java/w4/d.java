package w4;

import a6.v;
import android.text.TextUtils;
import com.facebook.stetho.websocket.CloseCodes;
import java.nio.charset.Charset;
import rd.m;
import rg.q;
import v4.p0;
import v4.q0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f31141a = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31142b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f31147g;

    @Override // v4.q0
    public byte[] a(int i10) {
        long j10;
        byte[] bytes;
        byte[] bArr = new byte[30];
        v vVar = new v(bArr);
        String str = this.f31142b;
        int length = str.length() - 1;
        int i11 = 0;
        boolean z10 = false;
        while (i11 <= length) {
            boolean z11 = m.f(str.charAt(!z10 ? i11 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i11++;
            } else {
                z10 = true;
            }
        }
        String string = str.subSequence(i11, length + 1).toString();
        if (!TextUtils.isEmpty(this.f31142b)) {
            int length2 = string.length();
            int i12 = this.f31141a;
            if (length2 > i12) {
                string = q.a1(string, i12);
            }
            Charset charsetDefaultCharset = Charset.defaultCharset();
            try {
                charsetDefaultCharset = Charset.forName("gb2312");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            do {
                m.b(charsetDefaultCharset);
                bytes = string.getBytes(charsetDefaultCharset);
                m.d(bytes, "getBytes(...)");
                if (bytes.length <= this.f31141a) {
                    break;
                }
                string = q.Y0(string, 1);
            } while (string.length() != 0);
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 30));
        }
        vVar.l(this.f31141a * 8);
        int i13 = this.f31145e;
        if (i13 > 65535) {
            s3.b.n("SatelliteInfo", "距离溢出:" + this.f31145e);
            i13 = 0;
        }
        int i14 = this.f31146f;
        if (i14 > 65535) {
            s3.b.n("SatelliteInfo", "轨道高度溢出:" + this.f31146f);
            i14 = 0;
        }
        Long l10 = this.f31147g;
        if (l10 != null) {
            long jLongValue = l10.longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            j10 = jLongValue < jCurrentTimeMillis ? 0L : (jLongValue - jCurrentTimeMillis) / ((long) CloseCodes.NORMAL_CLOSURE);
        } else {
            j10 = 65535;
        }
        vVar.n(this.f31143c, 9).n(0, 7).n(this.f31144d, 8).n(0, 8).n(i13, 16).n(i14, 16).o(j10 <= 65535 ? j10 : 65535L, 16);
        return bArr;
    }

    @Override // v4.q0
    public /* synthetic */ byte[] b() {
        return p0.a(this);
    }

    public final void c(int i10) {
        this.f31146f = i10;
    }

    public final void d(int i10) {
        this.f31143c = i10;
    }

    public final void e(int i10) {
        this.f31145e = i10;
    }

    public final void f(int i10) {
        this.f31144d = i10;
    }

    public final void g(String str) {
        m.e(str, "<set-?>");
        this.f31142b = str;
    }

    public final void h(Long l10) {
        this.f31147g = l10;
    }
}
