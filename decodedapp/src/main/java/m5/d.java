package m5;

import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import com.dw.ht.o;
import p3.b;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.dw.util.concurrent.a implements b.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b6.d f21720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioTrack f21722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21723h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f21724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f21725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile int f21726t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f21727u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected o.b f21728v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f21729w;

    public d(String str) {
        this(str, 0);
    }

    private int x() {
        int i10;
        AudioTrack audioTrack = this.f21722g;
        if ((audioTrack != null ? audioTrack.getPlayState() : 1) == 3 || this.f21725s || (i10 = this.f21724r) <= 0) {
            return 1;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
    
        if (r12.f21722g.getPlaybackHeadPosition() >= r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
    
        java.lang.Thread.sleep(10);
     */
    @Override // com.dw.util.concurrent.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void doInBackground() {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.d.doInBackground():void");
    }

    @Override // com.dw.util.concurrent.a
    protected boolean onInit() {
        if (!super.onInit()) {
            return false;
        }
        int iY = y();
        Process.setThreadPriority(-16);
        Thread.currentThread().setPriority(10);
        int minBufferSize = AudioTrack.getMinBufferSize(iY, 4, 2);
        if (minBufferSize <= 0) {
            return false;
        }
        this.f21722g = new AudioTrack(this.f21721f, iY, 4, 2, minBufferSize, 1);
        this.f21728v = o.d().g(iY);
        if (Build.VERSION.SDK_INT >= 24) {
            s3.b.b("AudioPlayThread", "BufferCapacityInFrames:" + this.f21722g.getBufferCapacityInFrames() + " BufferSizeInFrames:" + this.f21722g.getBufferSizeInFrames());
        }
        this.f21723h = minBufferSize / 2;
        s3.b.b("AudioPlayThread", "init");
        return true;
    }

    @Override // com.dw.util.concurrent.a
    protected void onStop() {
        super.onStop();
        AudioTrack audioTrack = this.f21722g;
        if (audioTrack != null) {
            audioTrack.release();
        }
        o.b bVar = this.f21728v;
        if (bVar != null) {
            bVar.a();
        }
        s3.b.b("AudioPlayThread", "stop");
    }

    protected int read(short[] sArr, int i10, int i11) {
        this.f21720e.i(x(), 0L);
        if (this.f21720e.d() < x()) {
            return 0;
        }
        return this.f21720e.l(sArr, i10, i11);
    }

    public void t() {
        this.f21729w = true;
        super.cancel();
    }

    protected boolean u(AudioTrack audioTrack) {
        return true;
    }

    public void v() {
        this.f21725s = true;
        this.f21720e.j();
    }

    @Override // p3.b.a
    public int w() {
        this.f21727u = true;
        int i10 = this.f21726t;
        this.f21726t = 0;
        return i10;
    }

    public int write(short[] sArr, int i10, int i11) {
        if (this.f21720e.d() == 0) {
            throw new RuntimeException("未设置缓存大小");
        }
        this.f21725s = false;
        return this.f21720e.o(sArr, i10, i11);
    }

    protected int y() {
        return 32000;
    }

    public void z(int i10) {
        this.f21724r = i10;
    }

    public d(String str, int i10) {
        this(str, i10, 3);
    }

    public d(String str, int i10, int i11) {
        super("Audio Play -" + str);
        this.f21729w = false;
        b6.d dVar = new b6.d(i10);
        this.f21720e = dVar;
        this.f21721f = i11;
        this.f21724r = Math.min(dVar.d() / 2, y() / 2);
    }
}
