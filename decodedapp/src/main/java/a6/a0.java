package a6;

import android.content.Context;
import android.os.AsyncTask;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f318b;

    public a0(Context context, int i10, String str) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, str);
            this.f318b = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
        } else {
            s3.b.d("WakeLockAsyncTask", "can not start wake lock");
        }
        this.f317a = i10;
    }

    @Override // android.os.AsyncTask
    protected void onCancelled(Object obj) {
        PowerManager.WakeLock wakeLock = this.f318b;
        if (wakeLock != null) {
            wakeLock.release();
        }
        super.onCancelled(obj);
    }

    @Override // android.os.AsyncTask
    protected void onPostExecute(Object obj) {
        PowerManager.WakeLock wakeLock = this.f318b;
        if (wakeLock != null) {
            wakeLock.release();
        }
        super.onPostExecute(obj);
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        PowerManager.WakeLock wakeLock = this.f318b;
        if (wakeLock != null) {
            wakeLock.acquire(this.f317a);
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        PowerManager.WakeLock wakeLock = this.f318b;
        if (wakeLock != null) {
            wakeLock.release();
        }
        super.onCancelled();
    }
}
