package m0;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GestureDetector f20841a;

    public k(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f20841a.onTouchEvent(motionEvent);
    }

    public k(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f20841a = new GestureDetector(context, onGestureListener, handler);
    }
}
