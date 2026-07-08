package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    public static abstract class b {
    }

    public abstract void A();

    public androidx.appcompat.view.b B(b.a aVar) {
        return null;
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z10);

    public abstract int d();

    public abstract Context e();

    public abstract void f();

    public boolean g() {
        return false;
    }

    public void h(Configuration configuration) {
    }

    void i() {
    }

    public abstract boolean j(int i10, KeyEvent keyEvent);

    public boolean k(KeyEvent keyEvent) {
        return false;
    }

    public boolean l() {
        return false;
    }

    public abstract void m(Drawable drawable);

    public abstract void n(boolean z10);

    public abstract void o(boolean z10);

    public abstract void p(boolean z10);

    public abstract void q(int i10);

    public abstract void r(int i10);

    public abstract void s(Drawable drawable);

    public abstract void t(boolean z10);

    public abstract void u(int i10);

    public abstract void v(boolean z10);

    public abstract void w(CharSequence charSequence);

    public abstract void x(int i10);

    public abstract void y(CharSequence charSequence);

    public abstract void z(CharSequence charSequence);

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0015a extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public C0015a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f15016t);
            this.gravity = typedArrayObtainStyledAttributes.getInt(h.j.f15021u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0015a(int i10, int i11) {
            super(i10, i11);
            this.gravity = 8388627;
        }

        public C0015a(C0015a c0015a) {
            super((ViewGroup.MarginLayoutParams) c0015a);
            this.gravity = 0;
            this.gravity = c0015a.gravity;
        }

        public C0015a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }
}
