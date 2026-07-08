package m0;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointerIcon f20784a;

    static class a {
        static PointerIcon a(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }
    }

    private f0(PointerIcon pointerIcon) {
        this.f20784a = pointerIcon;
    }

    public static f0 b(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new f0(a.a(context, i10)) : new f0(null);
    }

    public Object a() {
        return this.f20784a;
    }
}
