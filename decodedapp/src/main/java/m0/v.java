package m0;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static boolean a(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }
}
