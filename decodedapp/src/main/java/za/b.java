package za;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import rd.h;
import rd.m;
import va.d;
import va.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ta.a f33098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f33099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f33100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33101d;

    public interface a {
        void a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, ta.a aVar, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m.e(context, "context");
        m.e(aVar, "config");
        this.f33098a = aVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (this.f33098a.k() && keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
            ya.e.c(this.f33098a.i());
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public final a getLayoutListener() {
        return this.f33100c;
    }

    public final e getTouchListener() {
        return this.f33099b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d dVarC = this.f33098a.c();
        if (dVarC != null) {
            dVarC.dismiss();
        }
        this.f33098a.h();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e eVar;
        if (motionEvent != null && (eVar = this.f33099b) != null) {
            eVar.a(motionEvent);
        }
        return this.f33098a.D() || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f33101d) {
            return;
        }
        this.f33101d = true;
        a aVar = this.f33100c;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        e eVar;
        if (motionEvent != null && (eVar = this.f33099b) != null) {
            eVar.a(motionEvent);
        }
        return this.f33098a.D() || super.onTouchEvent(motionEvent);
    }

    public final void setLayoutListener(a aVar) {
        this.f33100c = aVar;
    }

    public final void setTouchListener(e eVar) {
        this.f33099b = eVar;
    }

    public /* synthetic */ b(Context context, ta.a aVar, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, aVar, (i11 & 4) != 0 ? null : attributeSet, (i11 & 8) != 0 ? 0 : i10);
    }
}
