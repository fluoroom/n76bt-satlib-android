package m0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActivityChooserView;
import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f20788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f20789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f20790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f20791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f20792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f20796j;

    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public h(Context context, i iVar) {
        this(context, iVar, new b() { // from class: m0.f
            @Override // m0.h.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                h.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: m0.g
            @Override // m0.h.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return h.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = r0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = r0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f20794h == source && this.f20795i == deviceId && this.f20793g == i10) {
            return false;
        }
        this.f20789c.a(this.f20787a, this.f20796j, motionEvent, i10);
        this.f20794h = source;
        this.f20795i = deviceId;
        this.f20793g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f20791e == null) {
            this.f20791e = VelocityTracker.obtain();
        }
        return this.f20790d.a(this.f20791e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        k0.a(velocityTracker, motionEvent);
        k0.b(velocityTracker, CloseCodes.NORMAL_CLOSURE);
        return k0.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f20796j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f20791e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f20791e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f20788b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f20792f) && fSignum != 0.0f)) {
            this.f20788b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f20796j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f20792f = this.f20788b.a(fMax) ? fMax : 0.0f;
    }

    h(Context context, i iVar, b bVar, a aVar) {
        this.f20793g = -1;
        this.f20794h = -1;
        this.f20795i = -1;
        this.f20796j = new int[]{ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0};
        this.f20787a = context;
        this.f20788b = iVar;
        this.f20789c = bVar;
        this.f20790d = aVar;
    }
}
