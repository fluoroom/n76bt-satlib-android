package androidx.core.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.dw.android.widget.b;

/* JADX INFO: loaded from: classes.dex */
public class CSViewPager extends ViewPager implements b.a {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f1924s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f1925t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private b f1926u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private float f1927v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f1928w0;

    public CSViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        S(context, attributeSet, 0, 0);
    }

    private void S(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1926u0 = new b(this, context, attributeSet, i10, i11);
        this.f1924s0 = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    @Override // com.dw.android.widget.b.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f1925t0) {
            return false;
        }
        return super.canScrollHorizontally(i10);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void draw(Canvas canvas) {
        this.f1926u0.a(canvas);
    }

    public b getCSHelper() {
        return this.f1926u0;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        return this.f1926u0 == null ? super.isOpaque() : super.isOpaque() && this.f1926u0.c();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1925t0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f1927v0 = motionEvent.getX();
            this.f1928w0 = false;
        } else if (action == 2) {
            if (Math.abs(motionEvent.getX() - this.f1927v0) < this.f1924s0) {
                return false;
            }
            if (!this.f1928w0) {
                this.f1928w0 = true;
                return false;
            }
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f1926u0.f(i10, i11, i12, i13);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1925t0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        float f10 = this.f1927v0;
        if (f10 >= this.f1924s0 && f10 <= getWidth() - this.f1924s0) {
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setCornerRadius(int i10) {
        this.f1926u0.h(i10);
    }

    public void setDisableSlideSwitchingPagers(boolean z10) {
        this.f1925t0 = z10;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        b bVar = this.f1926u0;
        if (bVar != null) {
            bVar.e();
        }
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        b bVar = this.f1926u0;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void setRising(int i10) {
        this.f1926u0.j(i10);
    }

    public void setRisingGravity(int i10) {
        this.f1926u0.l(i10);
    }

    public void setSinkGravity(int i10) {
        this.f1926u0.n(i10);
    }
}
