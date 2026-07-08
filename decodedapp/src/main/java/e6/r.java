package e6;

import com.facebook.stetho.websocket.CloseCodes;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class r implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static r f11587d = new r(CloseCodes.NORMAL_CLOSURE, CloseCodes.NORMAL_CLOSURE, 20000000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f11588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f11589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f11590c;

    protected r(int i10, int i11, int i12) {
        this.f11588a = i10;
        this.f11589b = i11;
        this.f11590c = i12;
    }

    public static r a() {
        return f11587d;
    }

    public void b(int i10) throws g6.b {
        if (Math.abs(i10) > 100000) {
            throw new g6.b(String.format("BigDecimal scale (%d) magnitude exceeds maximum allowed (%d)", Integer.valueOf(i10), 100000));
        }
    }

    public void c(int i10) throws g6.b {
        if (i10 > this.f11589b) {
            throw new g6.b(String.format("Number length (%d) exceeds the maximum length (%d)", Integer.valueOf(i10), Integer.valueOf(this.f11589b)));
        }
    }

    public void d(int i10) throws g6.b {
        if (i10 > this.f11589b) {
            throw new g6.b(String.format("Number length (%d) exceeds the maximum length (%d)", Integer.valueOf(i10), Integer.valueOf(this.f11589b)));
        }
    }

    public void e(int i10) throws g6.b {
        if (i10 > this.f11588a) {
            throw new g6.b(String.format("Depth (%d) exceeds the maximum allowed nesting depth (%d)", Integer.valueOf(i10), Integer.valueOf(this.f11588a)));
        }
    }

    public void f(int i10) throws g6.b {
        if (i10 > this.f11590c) {
            throw new g6.b(String.format("String length (%d) exceeds the maximum length (%d)", Integer.valueOf(i10), Integer.valueOf(this.f11590c)));
        }
    }
}
