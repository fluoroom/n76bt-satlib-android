package com.dw.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.dw.widget.c;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutEx extends com.dw.android.widget.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View.OnTouchListener f6951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.dw.widget.c f6952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f6953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f6954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f6955f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f6957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f6959d;

        a(int i10, int i11, int i12, int i13) {
            this.f6956a = i10;
            this.f6957b = i11;
            this.f6958c = i12;
            this.f6959d = i13;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayoutEx.this.f6955f = null;
            if (LinearLayoutEx.this.f6953d != null) {
                LinearLayoutEx.this.f6953d.a(LinearLayoutEx.this, this.f6956a, this.f6957b, this.f6958c, this.f6959d);
            }
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
        void a(View view, int i10, int i11, int i12, int i13);
    }

    public LinearLayoutEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            View.OnTouchListener onTouchListener = this.f6951b;
            if (onTouchListener == null || !onTouchListener.onTouch(this, motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return true;
        } catch (ArrayIndexOutOfBoundsException e10) {
            Log.w("LinearLayoutEx", e10);
            e10.printStackTrace();
            return true;
        }
    }

    public View.OnTouchListener getOnInterceptTouchListener() {
        return this.f6951b;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f6951b;
        if (onTouchListener == null || !onTouchListener.onTouch(this, motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // com.dw.android.widget.c, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d dVar = this.f6954e;
        if (dVar != null) {
            dVar.a(this, i10, i11, i12, i13);
        }
        if (this.f6953d != null) {
            Runnable runnable = this.f6955f;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            a aVar = new a(i10, i11, i12, i13);
            this.f6955f = aVar;
            post(aVar);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setOnInterceptClickListener(b bVar) {
        if (isClickable()) {
            return;
        }
        setClickable(true);
    }

    public void setOnInterceptTouchListener(View.OnTouchListener onTouchListener) {
        this.f6951b = onTouchListener;
    }

    public void setOnLayoutChangedListener(c cVar) {
    }

    public void setOnMultiTouchListener(c.a aVar) {
        if (aVar == null || this.f6952c != null) {
            return;
        }
        this.f6952c = new com.dw.widget.c(2);
    }

    public void setOnSizeChangedListener(d dVar) {
        this.f6953d = dVar;
    }

    public void setOnSizeChangingListener(d dVar) {
        this.f6954e = dVar;
    }
}
