package com.dw.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import k3.l;

/* JADX INFO: loaded from: classes.dex */
public class ScrollHeaderLayout extends com.dw.android.widget.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f5330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f5332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f5333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private GestureDetector f5334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f5335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5336h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f5338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f5339t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f5340u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f5341v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f5342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f5343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private f f5344y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Runnable f5345z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollHeaderLayout.this.requestLayout();
        }
    }

    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Scroller f5347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5348b;

        private void a() {
            if (ScrollHeaderLayout.this.f5342w == 2) {
                ScrollHeaderLayout.this.setScrollState(0);
            }
        }

        public void b(int i10, int i11) {
            ScrollHeaderLayout.this.setScrollState(2);
            int scrollY = ScrollHeaderLayout.this.getScrollY();
            this.f5348b = scrollY;
            this.f5347a.startScroll(0, scrollY, 0, scrollY - i11);
            ScrollHeaderLayout.this.post(this);
        }

        public void c(int i10, int i11) {
            ScrollHeaderLayout.this.setScrollState(2);
            this.f5348b = 0;
            this.f5347a.fling(0, 0, i10, i11, 0, 0, RtlSpacingHelper.UNDEFINED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            ScrollHeaderLayout.this.post(this);
        }

        public void d() {
            this.f5347a.forceFinished(true);
            a();
            ScrollHeaderLayout.this.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ScrollHeaderLayout.this.f5338s) {
                a();
                return;
            }
            if (this.f5347a.isFinished()) {
                a();
                return;
            }
            this.f5347a.computeScrollOffset();
            int currY = this.f5347a.getCurrY();
            if (currY != this.f5348b && !ScrollHeaderLayout.this.l(0.0f, r1 - currY)) {
                a();
            } else {
                this.f5348b = currY;
                ScrollHeaderLayout.this.post(this);
            }
        }

        private b() {
            this.f5347a = new Scroller(ScrollHeaderLayout.this.getContext());
        }
    }

    private class c implements GestureDetector.OnGestureListener {
        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (ScrollHeaderLayout.this.f5341v == 0 || Math.abs(f10) > Math.abs(f11)) {
                return false;
            }
            return ScrollHeaderLayout.this.p((int) f10, (int) f11);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (ScrollHeaderLayout.this.f5341v == 0 || Math.abs(f10) > Math.abs(f11)) {
                return false;
            }
            ScrollHeaderLayout.this.setScrollState(1);
            return ScrollHeaderLayout.this.l(f10, f11);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        private c() {
        }
    }

    public interface d {
        void a(ScrollHeaderLayout scrollHeaderLayout, int i10);

        boolean b(ScrollHeaderLayout scrollHeaderLayout, float f10, float f11);

        void c(ScrollHeaderLayout scrollHeaderLayout);
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5351a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public String toString() {
            return ("ScrollHeaderLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " locked=" + this.f5351a) + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f5351a ? (byte) 1 : (byte) 0);
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        private e(Parcel parcel) {
            super(parcel);
            this.f5351a = parcel.readByte() != 0;
        }
    }

    private class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f5352a;

        public void a() {
            if (ScrollHeaderLayout.this.f5340u == null || this.f5352a) {
                return;
            }
            if (!ScrollHeaderLayout.this.isInLayout()) {
                ScrollHeaderLayout.this.f5340u.c(ScrollHeaderLayout.this);
            } else {
                this.f5352a = true;
                ScrollHeaderLayout.this.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5352a = false;
            if (ScrollHeaderLayout.this.f5340u == null) {
                return;
            }
            ScrollHeaderLayout.this.f5340u.c(ScrollHeaderLayout.this);
        }

        private f() {
            this.f5352a = false;
        }
    }

    public ScrollHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5344y = new f();
        this.f5345z = new a();
        c(context, attributeSet, 0, 0);
    }

    private void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        setClickable(true);
        this.f5334f = new GestureDetector(context, new c());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.R2, i10, i11);
        this.f5331c = typedArrayObtainStyledAttributes.getResourceId(l.S2, 0);
        this.f5336h = typedArrayObtainStyledAttributes.getResourceId(l.U2, 0);
        this.f5337r = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.T2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(float f10, float f11) {
        int scrollY = (int) (getScrollY() + f11);
        if (scrollY < 0) {
            scrollY = 0;
        }
        int i10 = this.f5341v;
        if (scrollY > i10) {
            scrollY = i10;
        }
        if (getScrollY() == scrollY) {
            return n(f10, f11);
        }
        if (f11 > 0.0f) {
            scrollTo(0, scrollY);
            return true;
        }
        if (n(f10, f11)) {
            return true;
        }
        scrollTo(0, scrollY);
        return true;
    }

    private boolean n(float f10, float f11) {
        d dVar = this.f5340u;
        if (dVar != null) {
            return dVar.b(this, f10, f11);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p(int i10, int i11) {
        if (this.f5332d == null) {
            this.f5332d = new b();
        }
        this.f5332d.c(i10, i11);
        return true;
    }

    private void q(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.f5342w == 1) {
                setScrollState(0);
                return;
            }
            return;
        }
        b bVar = this.f5332d;
        if (bVar != null) {
            bVar.d();
        }
    }

    private void setScrollMaxY(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (this.f5341v == i10) {
            return;
        }
        this.f5341v = i10;
        this.f5344y.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i10) {
        if (this.f5342w == i10) {
            return;
        }
        this.f5342w = i10;
        d dVar = this.f5340u;
        if (dVar != null) {
            dVar.a(this, i10);
        }
    }

    public int getRetain() {
        return this.f5337r;
    }

    public int getScrollMaxY() {
        return this.f5341v;
    }

    public int getScrollState() {
        return this.f5342w;
    }

    @Override // android.view.View
    public boolean isInLayout() {
        return super.isInLayout();
    }

    public void k() {
        this.f5338s = true;
        m();
    }

    public void m() {
        scrollTo(0, this.f5341v);
        this.f5339t = true;
    }

    public void o(int i10, int i11) {
        if (this.f5333e == null) {
            this.f5333e = new b();
        }
        b bVar = this.f5332d;
        if (bVar != null) {
            bVar.d();
        }
        this.f5333e.b(i10, i11);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f5335g = findViewById(this.f5336h);
        View viewFindViewById = findViewById(this.f5331c);
        this.f5330b = viewFindViewById;
        if (viewFindViewById != null && viewFindViewById.getParent() != this) {
            throw new IllegalArgumentException("the content must is direct children");
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f5338s) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.f5334f.onTouchEvent(motionEvent)) {
            return true;
        }
        q(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f5330b;
        if (view == null) {
            return;
        }
        this.f5343x = true;
        try {
            int top = view.getTop();
            View view2 = this.f5335g;
            if (view2 != null) {
                int top2 = 0;
                do {
                    top2 += view2.getTop();
                    view2 = (View) view2.getParent();
                    if (view2 == null) {
                        break;
                    }
                } while (view2 != this);
                setRetain(top - top2);
            }
            setScrollMaxY(top - this.f5337r);
            if (this.f5339t) {
                m();
            }
            this.f5343x = false;
        } catch (Throwable th2) {
            this.f5343x = false;
            throw th2;
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        View view = this.f5330b;
        if (view == null) {
            return;
        }
        measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), WXVideoFileObject.FILE_SIZE_LIMIT), 0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - this.f5337r, WXVideoFileObject.FILE_SIZE_LIMIT), 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.f5351a) {
            k();
        } else {
            r();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (!this.f5338s) {
            return parcelableOnSaveInstanceState;
        }
        e eVar = new e(parcelableOnSaveInstanceState);
        eVar.f5351a = this.f5338s;
        return eVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f5338s) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f5334f.onTouchEvent(motionEvent)) {
            return true;
        }
        q(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void r() {
        this.f5338s = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        removeCallbacks(this.f5345z);
        if (isInLayout()) {
            post(this.f5345z);
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getScrollX() == i10 && getScrollY() == i11) {
            return;
        }
        super.scrollTo(i10, i11);
        this.f5344y.a();
        if (i11 != this.f5341v) {
            this.f5339t = false;
        }
    }

    public void setOnScrollListener(d dVar) {
        this.f5340u = dVar;
    }

    public void setRetain(int i10) {
        if (i10 == this.f5337r) {
            return;
        }
        this.f5337r = i10;
        requestLayout();
    }
}
