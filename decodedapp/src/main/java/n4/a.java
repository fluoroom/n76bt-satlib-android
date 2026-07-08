package n4;

import android.bluetooth.BluetoothDevice;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22427b;

    protected a(long j10) {
        this.f22426a = j10;
    }

    public abstract void a();

    public abstract String b();

    public abstract BluetoothDevice c();

    public abstract String d();

    public abstract String e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f22426a == ((a) obj).f22426a;
    }

    public abstract int f();

    public abstract int g();

    public boolean h() {
        return this.f22427b;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f22426a));
    }

    protected void i(boolean z10) {
        this.f22427b = z10;
    }
}
