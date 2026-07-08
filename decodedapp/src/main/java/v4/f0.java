package v4;

import com.dw.audio.codec.Resample;
import com.facebook.stetho.server.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends s0 implements r0 {
    private boolean M;
    private final b6.c N;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29863a;

        static {
            int[] iArr = new int[c1.values().length];
            f29863a = iArr;
            try {
                iArr[c1.RX_AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29863a[c1.RX_AUDIO_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public f0(c0 c0Var) {
        super(c0Var);
        this.N = new b6.c(new g3.d[100]);
    }

    @Override // v4.s0
    protected void i() {
        short[] sArr;
        short[] sArr2;
        int i10;
        Resample resample = new Resample(8000, 32000);
        short[] sArr3 = new short[HttpStatus.HTTP_INTERNAL_SERVER_ERROR];
        int iCeil = (int) (((double) HttpStatus.HTTP_INTERNAL_SERVER_ERROR) * Math.ceil(32000.0d / ((double) 8000)));
        short[] sArr4 = new short[iCeil];
        while (!this.M) {
            try {
                this.N.h(1, 0L);
                g3.d dVar = (g3.d) this.N.m();
                if (dVar != null && !dVar.n()) {
                    int i11 = a.f29863a[c1.d(dVar.e()).ordinal()];
                    if (i11 != 1) {
                        if (i11 == 2) {
                            s();
                        }
                        i10 = iCeil;
                        sArr = sArr4;
                        sArr2 = sArr3;
                    } else {
                        byte[] bArrI = dVar.i();
                        sArr = sArr4;
                        sArr2 = sArr3;
                        i10 = iCeil;
                        p(sArr, 0, resample.b(sArr2, 0, w3.b.g(bArrI, 0, bArrI.length, sArr3, 0, w3.d.PCM_16BIT_BE), sArr, 0, i10), false);
                    }
                    sArr3 = sArr2;
                    sArr4 = sArr;
                    iCeil = i10;
                }
            } catch (Throwable th2) {
                resample.c();
                throw th2;
            }
        }
        resample.c();
    }

    @Override // v4.s0
    public int r(byte[] bArr) {
        return -1;
    }

    public void u() {
        this.M = true;
        this.N.j();
    }

    public void v(g3.d dVar) {
        if (dVar.m() != 3) {
            return;
        }
        this.N.n(dVar);
    }
}
