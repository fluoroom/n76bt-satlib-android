package d;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10412a = new b();

    private b() {
    }

    public final long a(BackEvent backEvent) {
        rd.m.e(backEvent, "backEvent");
        return backEvent.getFrameTimeMillis();
    }
}
