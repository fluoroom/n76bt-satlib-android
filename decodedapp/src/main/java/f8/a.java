package f8;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f12891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12892d;

    protected a(IBinder iBinder, String str) {
        this.f12891c = iBinder;
        this.f12892d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12891c;
    }
}
