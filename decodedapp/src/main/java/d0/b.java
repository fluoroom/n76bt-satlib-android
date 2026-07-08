package d0;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f10509e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10513d;

    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f10510a = i10;
        this.f10511b = i11;
        this.f10512c = i12;
        this.f10513d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10510a, bVar2.f10510a), Math.max(bVar.f10511b, bVar2.f10511b), Math.max(bVar.f10512c, bVar2.f10512c), Math.max(bVar.f10513d, bVar2.f10513d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f10509e : new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f10510a, this.f10511b, this.f10512c, this.f10513d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10513d == bVar.f10513d && this.f10510a == bVar.f10510a && this.f10512c == bVar.f10512c && this.f10511b == bVar.f10511b;
    }

    public int hashCode() {
        return (((((this.f10510a * 31) + this.f10511b) * 31) + this.f10512c) * 31) + this.f10513d;
    }

    public String toString() {
        return "Insets{left=" + this.f10510a + ", top=" + this.f10511b + ", right=" + this.f10512c + ", bottom=" + this.f10513d + '}';
    }
}
