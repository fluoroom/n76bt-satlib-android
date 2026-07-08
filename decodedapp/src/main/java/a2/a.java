package a2;

import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends com.dw.util.concurrent.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b6.d f156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioTrack f158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f159h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f160r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile boolean f161s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile int f162t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f163u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f164v;

    public a(String str, int i10) {
        this(str, i10, 3);
    }

    private int u() {
        int i10;
        AudioTrack audioTrack = this.f158g;
        if ((audioTrack != null ? audioTrack.getPlayState() : 1) == 3 || this.f161s || (i10 = this.f160r) <= 0) {
            return 1;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        if (r10.f158g.getPlaybackHeadPosition() >= r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
    
        java.lang.Thread.sleep(10);
     */
    @Override // com.dw.util.concurrent.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void doInBackground() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.a.doInBackground():void");
    }

    @Override // com.dw.util.concurrent.a
    protected boolean onInit() {
        if (!super.onInit()) {
            return false;
        }
        int iV = v();
        Process.setThreadPriority(-16);
        Thread.currentThread().setPriority(10);
        int minBufferSize = AudioTrack.getMinBufferSize(iV, 4, 2);
        if (minBufferSize <= 0) {
            return false;
        }
        this.f158g = new AudioTrack(this.f157f, iV, 4, 2, minBufferSize, 1);
        if (Build.VERSION.SDK_INT >= 24) {
            Log.d("AudioPlayThread", "BufferCapacityInFrames:" + this.f158g.getBufferCapacityInFrames() + " BufferSizeInFrames:" + this.f158g.getBufferSizeInFrames());
        }
        this.f159h = minBufferSize / 2;
        Log.d("AudioPlayThread", "init");
        return true;
    }

    @Override // com.dw.util.concurrent.a
    protected void onStop() {
        super.onStop();
        AudioTrack audioTrack = this.f158g;
        if (audioTrack != null) {
            audioTrack.release();
        }
        Log.d("AudioPlayThread", "stop");
    }

    protected int read(short[] sArr, int i10, int i11) {
        this.f156e.i(u(), 0L);
        if (this.f156e.d() < u()) {
            return 0;
        }
        return this.f156e.l(sArr, i10, i11);
    }

    protected boolean t(AudioTrack audioTrack) {
        return true;
    }

    protected abstract int v();

    public int write(short[] sArr, int i10, int i11) {
        if (this.f156e.d() == 0) {
            throw new RuntimeException("未设置缓存大小");
        }
        this.f161s = false;
        return this.f156e.o(sArr, i10, i11);
    }

    public void x(int i10) {
        this.f160r = i10;
    }

    public a(String str, int i10, int i11) {
        super("Audio Play -" + str);
        this.f164v = false;
        b6.d dVar = new b6.d(i10);
        this.f156e = dVar;
        this.f157f = i11;
        this.f160r = Math.min(dVar.d() / 2, v() / 2);
    }
}
