package m5;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.os.SystemClock;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.k0;
import com.facebook.stetho.server.http.HttpStatus;
import p3.b;
import v4.i0;
import v4.l;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
public class j extends l implements b.a {
    private volatile int H;
    private final o5.c I;
    private Object J;
    private int K;
    private long L;
    private final AudioManager M;
    private final Object N;
    private BroadcastReceiver O;
    private final Context P;
    private long Q;
    private boolean R;
    private i0 S;
    private final boolean T;
    boolean U;
    private int V;
    private int W;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            s3.b.b("SendThread", String.format("SCO_AUDIO_STATE：%d->%d", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)), Integer.valueOf(intExtra)));
            if (intExtra == -1) {
                s3.b.b("SendThread", "SCO_AUDIO_STATE_ERROR");
                return;
            }
            if (intExtra == 0) {
                j jVar = j.this;
                if (jVar.U) {
                    synchronized (jVar.N) {
                        j jVar2 = j.this;
                        jVar2.U = false;
                        jVar2.N.notifyAll();
                    }
                }
                s3.b.b("SendThread", "SCO_AUDIO_STATE_DISCONNECTED");
                return;
            }
            if (intExtra != 1) {
                if (intExtra != 2) {
                    return;
                }
                s3.b.b("SendThread", "SCO_AUDIO_STATE_CONNECTING");
                return;
            }
            s3.b.b("SendThread", "SCO_AUDIO_STATE_CONNECTED");
            s3.b.h("SendThread", "Routing:" + j.this.M.isBluetoothScoOn());
            synchronized (j.this.N) {
                j jVar3 = j.this;
                jVar3.U = true;
                jVar3.N.notifyAll();
            }
        }
    }

    public j(l1 l1Var, int i10) {
        super(l1Var, "MicAudioSend");
        this.N = new Object();
        Main main = Main.f5555g;
        this.P = main;
        this.T = !Cfg.f5482d;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.I = o5.c.a(i10, 32000);
        H(false);
        this.M = (AudioManager) main.getSystemService("audio");
    }

    private void O() {
        this.M.abandonAudioFocus(null);
    }

    private long R() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.Q;
        this.Q = jElapsedRealtime;
        return j10;
    }

    private void S() throws InterruptedException {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        s3.b.b("SendThread", "播放发送开始提示音");
        o5.j.INSTANCE.e(R.raw.start_tx, HttpStatus.HTTP_OK);
        if (com.dw.ht.i.f6302a.g(300L)) {
            Thread.sleep(200L);
        }
        s3.b.b("SendThread", "播放发送开始提示音时间：" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void T() {
        AudioManager audioManager = this.M;
        if (audioManager == null) {
            return;
        }
        audioManager.requestAudioFocus(null, 3, 2);
    }

    private boolean U() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        if (2 != defaultAdapter.getProfileConnectionState(1)) {
            s3.b.b("SendThread", "SCO_NOT_CONNECTED");
            return false;
        }
        AudioManager audioManager = this.M;
        if (audioManager == null || !audioManager.isBluetoothScoAvailableOffCall()) {
            s3.b.b("SendThread", "系统不支持蓝牙录音");
            return false;
        }
        a aVar = new a();
        this.O = aVar;
        b0.b.j(this.P, aVar, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
        s3.b.b("SendThread", "startBluetoothSco");
        this.M.startBluetoothSco();
        synchronized (this.N) {
            try {
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            if (!this.U) {
                this.N.wait(3000L);
            }
        }
        if (this.U) {
            s3.b.b("SendThread", "开始蓝牙录音");
        } else {
            s3.b.b("SendThread", "开始蓝牙录音失败");
        }
        return this.M.isBluetoothScoOn();
    }

    private void V() {
        if (this.O == null) {
            return;
        }
        s3.b.b("SendThread", "stopBluetoothSco");
        this.M.stopBluetoothSco();
        synchronized (this.N) {
            try {
                if (this.U) {
                    this.N.wait(3000L);
                }
            } catch (InterruptedException unused) {
            }
            try {
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            if (this.U) {
                this.N.wait(3000L);
            }
        }
        this.U = false;
        this.P.unregisterReceiver(this.O);
        this.O = null;
    }

    @Override // v4.l
    protected int E() {
        return 0;
    }

    @Override // v4.l, com.dw.util.concurrent.a
    protected boolean onInit() throws InterruptedException {
        boolean z10;
        i0 i0Var = this.S;
        if (i0Var != null && i0Var.e0()) {
            this.S.X();
        } else {
            if (AudioRecord.getMinBufferSize(32000, 16, 2) <= 0) {
                return false;
            }
            T();
            if (this.T && com.dw.ht.i.f6302a.c()) {
                S();
                z10 = true;
            } else {
                z10 = false;
            }
            U();
            try {
                this.J = this.I.c();
                i0 i0Var2 = this.S;
                if (i0Var2 != null) {
                    i0Var2.X();
                } else if (this.T && !z10) {
                    s3.b.b("SendThread", "播放发送开始提示音");
                    o5.j.INSTANCE.e(R.raw.start_tx, HttpStatus.HTTP_OK);
                    Thread.sleep(150L);
                }
            } catch (Exception e10) {
                V();
                e10.printStackTrace();
                return false;
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.L = jElapsedRealtime;
        this.Q = jElapsedRealtime;
        boolean zOnInit = super.onInit();
        this.R = zOnInit;
        if (zOnInit && this.J != null) {
            k0.g(this);
        }
        return this.R;
    }

    @Override // v4.l, com.dw.util.concurrent.a
    protected void onStop() {
        super.onStop();
        i0 i0Var = this.S;
        if (i0Var != null) {
            i0Var.f0();
            this.S.Y();
        }
        Object obj = this.J;
        if (obj != null) {
            this.I.d(obj);
            this.J = null;
        }
        if (this.R) {
            k0.h(this);
        }
        V();
        if (this.S == null && this.T) {
            s3.b.b("SendThread", "播放发送接结束提示音");
            o5.j.INSTANCE.e(R.raw.stop_tx, HttpStatus.HTTP_OK);
            sleepMs(150L);
        }
        O();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0054 A[PHI: r9
      0x0054: PHI (r9v2 int) = (r9v1 int), (r9v1 int), (r9v12 int) binds: [B:62:0x0062, B:64:0x0068, B:56:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int read(short[] r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.j.read(short[], int, int):int");
    }

    @Override // p3.b.a
    public int w() {
        int i10 = this.H;
        this.H = 0;
        return i10;
    }

    public j(l1 l1Var, BluetoothDevice bluetoothDevice) {
        this(l1Var, Cfg.f5500m);
        if (bluetoothDevice != null) {
            this.S = i0.O(bluetoothDevice);
        }
        H(false);
    }
}
