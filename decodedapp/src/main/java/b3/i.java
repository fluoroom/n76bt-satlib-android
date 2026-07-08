package b3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import e3.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends b3.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f3665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f3666g = com.bumptech.glide.i.f5140a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final View f3667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f3668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnAttachStateChangeListener f3669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3671e;

    static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static Integer f3672e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f3673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f3674b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC0056a f3676d;

        /* JADX INFO: renamed from: b3.i$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC0056a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference f3677a;

            ViewTreeObserverOnPreDrawListenerC0056a(a aVar) {
                this.f3677a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f3677a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f3673a = view;
        }

        private static int c(Context context) {
            if (f3672e == null) {
                Display defaultDisplay = ((WindowManager) k.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f3672e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f3672e.intValue();
        }

        private int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f3675c && this.f3673a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f3673a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f3673a.getContext());
        }

        private int f() {
            int paddingTop = this.f3673a.getPaddingTop() + this.f3673a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f3673a.getLayoutParams();
            return e(this.f3673a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f3673a.getPaddingLeft() + this.f3673a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f3673a.getLayoutParams();
            return e(this.f3673a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        private boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        private void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f3674b).iterator();
            while (it.hasNext()) {
                ((g) it.next()).f(i10, i11);
            }
        }

        void a() {
            if (this.f3674b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f3673a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f3676d);
            }
            this.f3676d = null;
            this.f3674b.clear();
        }

        void d(g gVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                gVar.f(iG, iF);
                return;
            }
            if (!this.f3674b.contains(gVar)) {
                this.f3674b.add(gVar);
            }
            if (this.f3676d == null) {
                ViewTreeObserver viewTreeObserver = this.f3673a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0056a viewTreeObserverOnPreDrawListenerC0056a = new ViewTreeObserverOnPreDrawListenerC0056a(this);
                this.f3676d = viewTreeObserverOnPreDrawListenerC0056a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0056a);
            }
        }

        void k(g gVar) {
            this.f3674b.remove(gVar);
        }
    }

    public i(View view) {
        this.f3667a = (View) k.e(view);
        this.f3668b = new a(view);
    }

    private Object l() {
        return this.f3667a.getTag(f3666g);
    }

    private void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f3669c;
        if (onAttachStateChangeListener == null || this.f3671e) {
            return;
        }
        this.f3667a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f3671e = true;
    }

    private void n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f3669c;
        if (onAttachStateChangeListener == null || !this.f3671e) {
            return;
        }
        this.f3667a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f3671e = false;
    }

    private void o(Object obj) {
        f3665f = true;
        this.f3667a.setTag(f3666g, obj);
    }

    @Override // b3.h
    public void c(a3.c cVar) {
        o(cVar);
    }

    @Override // b3.h
    public void d(g gVar) {
        this.f3668b.d(gVar);
    }

    @Override // b3.a, b3.h
    public void h(Drawable drawable) {
        super.h(drawable);
        m();
    }

    @Override // b3.h
    public void i(g gVar) {
        this.f3668b.k(gVar);
    }

    @Override // b3.h
    public a3.c j() {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        if (objL instanceof a3.c) {
            return (a3.c) objL;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // b3.a, b3.h
    public void k(Drawable drawable) {
        super.k(drawable);
        this.f3668b.b();
        if (this.f3670d) {
            return;
        }
        n();
    }

    public String toString() {
        return "Target for: " + this.f3667a;
    }
}
