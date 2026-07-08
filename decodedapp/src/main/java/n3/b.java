package n3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class b extends g1.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f22422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    long f22423x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    boolean f22424y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Handler f22425z;

    public b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context, uri, strArr, str, strArr2, str2);
        W();
    }

    public static /* synthetic */ void V(b bVar) {
        bVar.f22424y = false;
        bVar.p();
    }

    private void W() {
        this.f22425z = new Handler(Looper.getMainLooper());
    }

    @Override // g1.b, g1.a
    /* JADX INFO: renamed from: O */
    public Cursor H() {
        Cursor cursorH = super.H();
        this.f22423x = SystemClock.uptimeMillis();
        return cursorH;
    }

    public void X() {
        super.p();
    }

    public void Y(int i10) {
        this.f22422w = i10;
    }

    @Override // g1.c
    public void p() {
        if (SystemClock.uptimeMillis() - this.f22423x >= this.f22422w) {
            super.p();
        } else {
            if (this.f22424y) {
                return;
            }
            this.f22424y = true;
            this.f22425z.postAtTime(new Runnable() { // from class: n3.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.V(this.f22421a);
                }
            }, ((long) this.f22422w) + this.f22423x);
        }
    }
}
