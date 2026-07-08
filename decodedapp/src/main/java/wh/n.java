package wh;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.List;
import vh.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f31467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f31470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f31471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f31472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f31473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f31474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f31475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f31476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Long f31477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Long f31478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Long f31479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f31480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Integer f31481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Integer f31482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f31483q;

    public n(e0 e0Var, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        rd.m.e(e0Var, "canonicalPath");
        rd.m.e(str, "comment");
        this.f31467a = e0Var;
        this.f31468b = z10;
        this.f31469c = str;
        this.f31470d = j10;
        this.f31471e = j11;
        this.f31472f = j12;
        this.f31473g = i10;
        this.f31474h = j13;
        this.f31475i = i11;
        this.f31476j = i12;
        this.f31477k = l10;
        this.f31478l = l11;
        this.f31479m = l12;
        this.f31480n = num;
        this.f31481o = num2;
        this.f31482p = num3;
        this.f31483q = new ArrayList();
    }

    public final n a(Integer num, Integer num2, Integer num3) {
        return new n(this.f31467a, this.f31468b, this.f31469c, this.f31470d, this.f31471e, this.f31472f, this.f31473g, this.f31474h, this.f31475i, this.f31476j, this.f31477k, this.f31478l, this.f31479m, num, num2, num3);
    }

    public final e0 b() {
        return this.f31467a;
    }

    public final List c() {
        return this.f31483q;
    }

    public final long d() {
        return this.f31471e;
    }

    public final int e() {
        return this.f31473g;
    }

    public final Long f() {
        Long l10 = this.f31479m;
        if (l10 != null) {
            return Long.valueOf(r.f(l10.longValue()));
        }
        Integer num = this.f31482p;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long g() {
        Long l10 = this.f31478l;
        if (l10 != null) {
            return Long.valueOf(r.f(l10.longValue()));
        }
        Integer num = this.f31481o;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long h() {
        Long l10 = this.f31477k;
        if (l10 != null) {
            return Long.valueOf(r.f(l10.longValue()));
        }
        Integer num = this.f31480n;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i10 = this.f31476j;
        if (i10 != -1) {
            return r.e(this.f31475i, i10);
        }
        return null;
    }

    public final long i() {
        return this.f31474h;
    }

    public final long j() {
        return this.f31472f;
    }

    public final boolean k() {
        return this.f31468b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(e0 e0Var, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3, int i13, rd.h hVar) {
        Integer num4;
        boolean z11;
        Integer num5;
        boolean z12 = (i13 & 2) != 0 ? false : z10;
        String str2 = (i13 & 4) != 0 ? "" : str;
        long j14 = (i13 & 8) != 0 ? -1L : j10;
        long j15 = (i13 & 16) != 0 ? -1L : j11;
        long j16 = (i13 & 32) != 0 ? -1L : j12;
        int i14 = (i13 & 64) != 0 ? -1 : i10;
        long j17 = (i13 & 128) == 0 ? j13 : -1L;
        int i15 = (i13 & 256) != 0 ? -1 : i11;
        int i16 = (i13 & WXMediaMessage.TITLE_LENGTH_LIMIT) == 0 ? i12 : -1;
        Long l13 = (i13 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? null : l10;
        Long l14 = (i13 & 2048) != 0 ? null : l11;
        boolean z13 = z12;
        Long l15 = (i13 & 4096) != 0 ? null : l12;
        Integer num6 = (i13 & 8192) != 0 ? null : num;
        Integer num7 = (i13 & 16384) != 0 ? null : num2;
        if ((i13 & 32768) != 0) {
            num4 = num6;
            z11 = z13;
            num5 = null;
        } else {
            num4 = num6;
            z11 = z13;
            num5 = num3;
        }
        this(e0Var, z11, str2, j14, j15, j16, i14, j17, i15, i16, l13, l14, l15, num4, num7, num5);
    }
}
