package b2;

import android.os.SystemClock;
import android.util.Log;
import b2.a;
import b6.d;
import com.dw.audio.codec.OpusEncoder;
import com.dw.audio.codec.Resample;
import com.facebook.stetho.websocket.CloseCodes;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f3652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Resample f3653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final short[] f3654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final short[] f3656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f3657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OpusEncoder f3658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a.C0055a f3659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f3660k;

    public b(int i10, int i11, int i12) {
        this.f3650a = i11;
        this.f3651b = i12;
        int i13 = i12 / CloseCodes.NORMAL_CLOSURE;
        int i14 = i10 <= 8000 ? i13 * 40 : i13 * 20;
        int i15 = (i14 * i11) / i12;
        this.f3655f = i15;
        this.f3658i = new OpusEncoder(i12, i14, i10);
        if (i11 != i12) {
            this.f3653d = new Resample(i11, i12);
            this.f3654e = new short[i15];
        } else {
            this.f3653d = null;
            this.f3654e = null;
        }
        this.f3652c = new d(i15 * 2);
        this.f3656g = new short[i14];
        byte[] bArr = new byte[i14];
        this.f3657h = bArr;
        this.f3659j = new a.C0055a(bArr);
    }

    @Override // b2.a
    public a.C0055a a(short[] sArr, int i10, int i11) {
        m.e(sArr, "data");
        if (this.f3660k == 0) {
            this.f3660k = (SystemClock.elapsedRealtime() * ((long) this.f3651b)) / ((long) CloseCodes.NORMAL_CLOSURE);
        }
        this.f3652c.o(sArr, i10, i11);
        if (this.f3652c.c() < this.f3655f) {
            return null;
        }
        if (this.f3653d != null) {
            d dVar = this.f3652c;
            short[] sArr2 = this.f3654e;
            m.b(sArr2);
            dVar.l(sArr2, 0, sArr2.length);
            Resample resample = this.f3653d;
            short[] sArr3 = this.f3654e;
            int length = sArr3.length;
            short[] sArr4 = this.f3656g;
            if (resample.b(sArr3, 0, length, sArr4, 0, sArr4.length) != this.f3656g.length) {
                Log.e("OPUSEncoder", "重新采样错误");
                return null;
            }
        } else {
            d dVar2 = this.f3652c;
            short[] sArr5 = this.f3656g;
            dVar2.l(sArr5, 0, sArr5.length);
        }
        int iB = this.f3658i.b(this.f3656g, this.f3657h);
        if (iB <= 0) {
            return null;
        }
        a.C0055a c0055a = this.f3659j;
        c0055a.f3648b = iB;
        long j10 = this.f3660k;
        c0055a.f3649c = j10;
        this.f3660k = j10 + ((long) this.f3656g.length);
        return c0055a;
    }

    @Override // b2.a
    public int b() {
        return this.f3655f;
    }

    @Override // b2.a
    public int c() {
        return this.f3652c.c();
    }

    @Override // b2.a
    public a.C0055a d() {
        return null;
    }

    @Override // b2.a
    public void e() {
        this.f3658i.c();
        Resample resample = this.f3653d;
        if (resample != null) {
            resample.c();
        }
    }
}
