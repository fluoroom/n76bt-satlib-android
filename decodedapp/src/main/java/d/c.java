package d;

import android.os.Build;
import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f10416f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f10417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f10418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f10419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f10421e;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public c(float f10, float f11, float f12, int i10, long j10) {
        this.f10417a = f10;
        this.f10418b = f11;
        this.f10419c = f12;
        this.f10420d = i10;
        this.f10421e = j10;
    }

    public final float a() {
        return this.f10419c;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f10417a + ", touchY=" + this.f10418b + ", progress=" + this.f10419c + ", swipeEdge=" + this.f10420d + ", frameTimeMillis=" + this.f10421e + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(BackEvent backEvent) {
        rd.m.e(backEvent, "backEvent");
        d.a aVar = d.a.f10404a;
        this(aVar.c(backEvent), aVar.d(backEvent), aVar.a(backEvent), aVar.b(backEvent), Build.VERSION.SDK_INT >= 36 ? b.f10412a.a(backEvent) : 0L);
    }
}
