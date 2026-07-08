package m5;

import a6.m;
import android.os.SystemClock;
import com.dw.audio.codec.OpusEncoder;
import com.dw.audio.codec.Resample;
import com.dw.ht.Cfg;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import v4.y;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.dw.util.concurrent.a implements y.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f21731w = Cfg.f5494j;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f21732x = Cfg.f5496k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OpusEncoder f21734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b6.d f21735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f21736h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private File f21737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private File f21738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Resample f21739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f21740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private x3.b f21741v;

    public h(int i10) {
        super("Opus Encoder");
        this.f21736h = new byte[1275];
        this.f21733e = i10;
        int i11 = (f21732x * i10) / f21731w;
        this.f21740u = i11;
        this.f21735g = new b6.d(Math.max(i11 * 2, i10));
    }

    @Override // v4.y.a
    public void discard() {
        s3.b.b("OpusEncoderThread", "discard");
        cancel();
    }

    @Override // com.dw.util.concurrent.a
    protected void doInBackground() {
        int i10 = this.f21740u;
        short[] sArr = new short[i10];
        int i11 = f21732x;
        short[] sArr2 = new short[i11];
        int i12 = 0;
        while (true) {
            if (isCancelled()) {
                break;
            }
            this.f21735g.h(this.f21740u, 500L);
            if (this.f21735g.c() >= this.f21740u) {
                this.f21735g.l(sArr, 0, i10);
                if (this.f21739t.b(sArr, 0, i10, sArr2, 0, i11) != i11) {
                    s3.b.d("OpusEncoderThread", "重新采样错误");
                    break;
                }
                int iB = this.f21734f.b(sArr2, this.f21736h);
                x3.b bVar = this.f21741v;
                if (bVar != null && iB > 0) {
                    if (i12 != iB) {
                        i12 = iB;
                    }
                    try {
                        bVar.a(new ii.a(Arrays.copyOf(this.f21736h, iB)));
                    } catch (IOException e10) {
                        s3.b.e("OpusEncoderThread", "writeAudioData", e10);
                    }
                }
            }
        }
        if (this.f21737r != null) {
            s3.b.b("OpusEncoderThread", "退出:处理缓存中的数据=" + this.f21735g.c());
            while (true) {
                if (this.f21735g.c() < this.f21740u) {
                    break;
                }
                this.f21735g.l(sArr, 0, i10);
                if (this.f21739t.b(sArr, 0, i10, sArr2, 0, i11) != i11) {
                    s3.b.d("OpusEncoderThread", "重新采样错误");
                    break;
                }
                int iB2 = this.f21734f.b(sArr2, this.f21736h);
                x3.b bVar2 = this.f21741v;
                if (bVar2 != null && iB2 > 0) {
                    try {
                        bVar2.a(new ii.a(Arrays.copyOf(this.f21736h, iB2)));
                    } catch (IOException e11) {
                        s3.b.e("OpusEncoderThread", "writeAudioData", e11);
                    }
                }
            }
        }
        s3.b.b("OpusEncoderThread", "退出:未处理音频数据=" + this.f21735g.c());
    }

    @Override // com.dw.util.concurrent.a
    protected boolean onInit() {
        File file;
        if (Cfg.f5504o == null) {
            return false;
        }
        int i10 = f21731w;
        this.f21734f = new OpusEncoder(i10, f21732x, Cfg.f5498l);
        this.f21739t = new Resample(this.f21733e, i10);
        do {
            file = new File(Cfg.f5504o, "/tmp-" + SystemClock.elapsedRealtimeNanos() + ".opus");
            this.f21738s = file;
        } while (file.exists());
        m.l(this.f21738s);
        try {
            this.f21741v = new x3.b(new FileOutputStream(this.f21738s), 1, Cfg.f5494j);
        } catch (IOException e10) {
            s3.b.e("OpusEncoderThread", "创建输出文件失败", e10);
        }
        return this.f21741v != null;
    }

    @Override // com.dw.util.concurrent.a
    protected void onStop() {
        s3.b.b("OpusEncoderThread", "onStop SaveTo = " + this.f21737r);
        OpusEncoder opusEncoder = this.f21734f;
        if (opusEncoder != null) {
            opusEncoder.c();
        }
        Resample resample = this.f21739t;
        if (resample != null) {
            resample.c();
        }
        x3.b bVar = this.f21741v;
        if (bVar != null) {
            try {
                bVar.close();
            } catch (IOException e10) {
                s3.b.e("OpusEncoderThread", "onStop", e10);
            }
            File file = this.f21737r;
            if (file != null) {
                m.l(file);
                if (!this.f21738s.renameTo(this.f21737r)) {
                    s3.b.d("OpusEncoderThread", "储存文件到目标位置失败");
                }
            } else {
                this.f21738s.delete();
            }
        }
        super.onStop();
    }

    @Override // v4.y.a
    public void r(long j10) {
        this.f21737r = Cfg.n(j10);
        s3.b.b("OpusEncoderThread", "save to " + this.f21737r);
        cancel();
    }

    public int write(short[] sArr, int i10, int i11) {
        int iO = this.f21735g.o(sArr, i10, i11);
        if (iO != i11) {
            int iD = this.f21735g.d();
            if (this.f21735g.d() < 5242880) {
                this.f21735g.m(Math.min(5242880, iD * 2));
                s3.b.n("OpusEncoderThread", String.format(Locale.getDefault(), "扩展缓存：%d->%d", Integer.valueOf(iD), Integer.valueOf(this.f21735g.d())));
                return write(sArr, i10 + iO, i11 - iO) + iO;
            }
            s3.b.d("OpusEncoderThread", String.format(Locale.getDefault(), "数据丢失:%d(%d-%d), 缓存大小:%d, 可用空间:%d", Integer.valueOf(i11 - iO), Integer.valueOf(i11), Integer.valueOf(iO), Integer.valueOf(iD), Integer.valueOf(this.f21735g.b())));
        }
        return iO;
    }

    public h() {
        this(32000);
    }
}
