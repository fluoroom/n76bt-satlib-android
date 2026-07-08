package o5;

import android.content.Context;
import android.media.SoundPool;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.Main;

/* JADX INFO: loaded from: classes.dex */
public enum j {
    INSTANCE;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseIntArray f23211b = new SparseIntArray(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseLongArray f23212c = new SparseLongArray(8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f23213d = Main.f5555g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SoundPool f23210a = new SoundPool(1, 3, 0);

    j() {
        int[] iArr = {R.raw.start_tx, R.raw.stop_tx};
        for (int i10 = 0; i10 < 2; i10++) {
            d(iArr[i10]);
        }
    }

    public synchronized void d(int i10) {
        if (this.f23211b.get(i10) == 0) {
            this.f23211b.put(i10, this.f23210a.load(this.f23213d, i10, 1));
        }
    }

    public synchronized boolean e(int i10, int i11) {
        if (i10 == R.raw.start_tx) {
            if (!Cfg.O().getSendStartTone()) {
                return true;
            }
        } else if (i10 == R.raw.stop_tx && !Cfg.O().getSendStopTone()) {
            return true;
        }
        int iLoad = this.f23211b.get(i10);
        if (iLoad == 0) {
            iLoad = this.f23210a.load(this.f23213d, i10, 1);
            this.f23211b.put(i10, iLoad);
        }
        int i12 = iLoad;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f23212c.get(i10) < i11) {
            return false;
        }
        if (this.f23210a.play(i12, 1.0f, 1.0f, 0, 0, 1.0f) == 0) {
            return false;
        }
        this.f23212c.put(i10, jElapsedRealtime);
        return true;
    }
}
