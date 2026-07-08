package ii;

import com.facebook.stetho.websocket.CloseCodes;
import hi.j;

/* JADX INFO: loaded from: classes3.dex */
public class a extends j implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16153g;

    public a(hi.e eVar) {
        super(eVar);
        this.f16152f = -1;
        this.f16153g = -1;
    }

    private void f() {
        byte[] bArrA = a();
        int iH = h(bArrA);
        this.f16152f = iH;
        this.f16153g = iH * i(bArrA, 48000);
    }

    private static int h(byte[] bArr) {
        if (bArr.length < 1) {
            return -1;
        }
        int i10 = bArr[0] & 3;
        if (i10 == 0) {
            return 1;
        }
        if (i10 != 3) {
            return 2;
        }
        if (bArr.length < 2) {
            return -4;
        }
        return bArr[1] & 63;
    }

    private static int i(byte[] bArr, int i10) {
        if (bArr.length == 0) {
            return 0;
        }
        int i11 = bArr[0];
        if ((i11 & 128) != 0) {
            return (i10 << ((i11 >> 3) & 3)) / 400;
        }
        if ((i11 & 96) == 96) {
            return (i11 & 8) != 0 ? i10 / 50 : i10 / 100;
        }
        int i12 = (i11 >> 3) & 3;
        return i12 == 3 ? (i10 * 60) / CloseCodes.NORMAL_CLOSURE : (i10 << i12) / 100;
    }

    public int g() {
        if (this.f16153g == -1) {
            f();
        }
        return this.f16153g;
    }

    public a(byte[] bArr) {
        super(bArr);
        this.f16152f = -1;
        this.f16153g = -1;
    }
}
