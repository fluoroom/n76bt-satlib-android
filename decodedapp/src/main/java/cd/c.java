package cd;

import androidx.appcompat.widget.ActivityChooserView;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f4548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f4549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f4550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f4551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long[] f4552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean[] f4553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[][] f4556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f4557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4558k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f4559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f4560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f4561n;

    protected c(g gVar, e eVar, int i10) {
        this.f4550c = -1L;
        this.f4554g = false;
        this.f4555h = 0;
        this.f4561n = i10;
        x xVar = gVar.f4597g;
        int i11 = gVar.f4594d;
        this.f4560m = i11;
        this.f4549b = gVar.f4595e;
        this.f4551d = xVar.k();
        this.f4552e = xVar.c();
        this.f4548a = xVar.e();
        double d10 = eVar.f4587z;
        if (d10 > 0.0d) {
            this.f4550c = eVar.A + ((long) (d10 * (this.f4549b - eVar.D)));
        }
        int iH = xVar.h();
        this.f4556i = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, gVar.f4594d, iH);
        int i12 = gVar.f4594d;
        this.f4557j = new int[i12];
        this.f4553f = new boolean[i12];
        int i13 = 0;
        while (i13 < i11) {
            byte[] bArrG = gVar.f4597g.g();
            this.f4558k += bArrG.length;
            if (bArrG.length == iH) {
                this.f4556i[i13] = bArrG;
            } else if (bArrG.length < iH) {
                System.arraycopy(bArrG, 0, this.f4556i[i13], 0, bArrG.length);
            } else {
                System.out.println("DataFrame() received node structure with increasing packet payload size.");
            }
            this.f4557j[i13] = gVar.f4596f;
            this.f4553f[i13] = gVar.f4597g.m();
            if (this.f4553f[i13]) {
                this.f4554g = true;
            }
            gVar = gVar.f4593c;
            i13++;
        }
        int i14 = this.f4557j[i13 - 1];
        this.f4559l = i14;
        if (i10 <= 0) {
            this.f4555h = -1;
            return;
        }
        int i15 = this.f4560m;
        int i16 = i15 - i14;
        if ((i16 < 0 ? (ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - i15) + i14 : i16) == i11 && i11 == i10) {
            this.f4555h = 1;
        }
    }

    public byte[][] a() {
        return this.f4556i;
    }

    public byte[] b() {
        return this.f4548a;
    }

    public long c() {
        return this.f4549b;
    }

    public int[] d() {
        return this.f4557j;
    }

    public long e() {
        return this.f4551d;
    }
}
