package u3;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f27945e = {R.attr.textColor};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f27946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PorterDuff.Mode f27947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorStateList f27948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f27949d;

    public b(TextView textView, AttributeSet attributeSet, int i10, int i11) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        this.f27946a = textView;
        Context context = textView.getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k3.l.C3, i10, i11);
        int i12 = k3.l.D3;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            colorStateList = typedArrayObtainStyledAttributes.getColorStateList(i12);
            mode = PorterDuff.Mode.SRC_IN;
        } else {
            colorStateList = null;
            mode = null;
        }
        f(typedArrayObtainStyledAttributes.hasValue(k3.l.E3) ? u.a(typedArrayObtainStyledAttributes.getInt(i12, -1), mode) : mode);
        e(colorStateList);
        typedArrayObtainStyledAttributes.recycle();
        d(context, attributeSet);
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int[] r0 = k3.l.F3
            androidx.appcompat.widget.TintTypedArray r10 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r10, r11, r0)
            int r11 = r10.getIndexCount()
            android.widget.TextView r0 = r9.f27946a
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            android.widget.TextView r1 = r9.f27946a
            android.graphics.drawable.Drawable[] r1 = r1.getCompoundDrawablesRelative()
            r2 = 0
            r3 = r1[r2]
            r4 = 1
            if (r3 == 0) goto L20
            r0[r2] = r3
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            r5 = 2
            r1 = r1[r5]
            if (r1 == 0) goto L29
            r0[r5] = r1
            r3 = 1
        L29:
            r1 = 0
        L2a:
            r6 = 3
            if (r1 >= r11) goto L73
            int r7 = r10.getIndex(r1)
            int r8 = k3.l.I3
            if (r7 == r8) goto L65
            int r8 = k3.l.K3
            if (r7 != r8) goto L3a
            goto L65
        L3a:
            int r8 = k3.l.L3
            if (r7 != r8) goto L45
            android.graphics.drawable.Drawable r6 = r10.getDrawable(r7)
            r0[r4] = r6
            goto L70
        L45:
            int r8 = k3.l.J3
            if (r7 == r8) goto L59
            int r8 = k3.l.H3
            if (r7 != r8) goto L4e
            goto L59
        L4e:
            int r8 = k3.l.G3
            if (r7 != r8) goto L70
            android.graphics.drawable.Drawable r7 = r10.getDrawable(r7)
            r0[r6] = r7
            goto L70
        L59:
            android.graphics.drawable.Drawable r6 = r10.getDrawable(r7)
            r0[r5] = r6
            int r6 = k3.l.H3
            if (r7 != r6) goto L70
        L63:
            r3 = 1
            goto L70
        L65:
            android.graphics.drawable.Drawable r6 = r10.getDrawable(r7)
            r0[r2] = r6
            int r6 = k3.l.K3
            if (r7 != r6) goto L70
            goto L63
        L70:
            int r1 = r1 + 1
            goto L2a
        L73:
            r11 = 0
        L74:
            int r1 = r0.length
            if (r11 >= r1) goto L8a
            r1 = r0[r11]
            if (r1 != 0) goto L7c
            goto L87
        L7c:
            int r7 = r1.getIntrinsicWidth()
            int r8 = r1.getIntrinsicHeight()
            r1.setBounds(r2, r2, r7, r8)
        L87:
            int r11 = r11 + 1
            goto L74
        L8a:
            if (r3 == 0) goto L9a
            android.widget.TextView r11 = r9.f27946a
            r1 = r0[r2]
            r2 = r0[r4]
            r3 = r0[r5]
            r0 = r0[r6]
            r11.setCompoundDrawablesRelative(r1, r2, r3, r0)
            goto La7
        L9a:
            android.widget.TextView r11 = r9.f27946a
            r1 = r0[r2]
            r2 = r0[r4]
            r3 = r0[r5]
            r0 = r0[r6]
            r11.setCompoundDrawables(r1, r2, r3, r0)
        La7:
            r10.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.b.d(android.content.Context, android.util.AttributeSet):void");
    }

    private void h(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (this.f27949d == null || this.f27947b == null) {
            drawable.setColorFilter(null);
        } else {
            drawable.mutate();
            drawable.setColorFilter(this.f27949d.intValue(), this.f27947b);
        }
        this.f27946a.invalidate();
    }

    private void i() {
        ColorStateList colorStateList = this.f27948c;
        if (colorStateList == null) {
            if (this.f27949d != null) {
                this.f27949d = null;
                g();
                return;
            }
            return;
        }
        Integer num = this.f27949d;
        int iIntValue = num != null ? num.intValue() : colorStateList.getDefaultColor();
        int colorForState = this.f27948c.getColorForState(this.f27946a.getDrawableState(), iIntValue);
        if (colorForState != iIntValue || this.f27949d == null) {
            this.f27949d = Integer.valueOf(colorForState);
            g();
        }
    }

    public void a() {
        ColorStateList colorStateList = this.f27948c;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        i();
    }

    public ColorStateList b() {
        return this.f27948c;
    }

    public PorterDuff.Mode c() {
        return this.f27947b;
    }

    public void e(ColorStateList colorStateList) {
        if (this.f27948c == colorStateList) {
            return;
        }
        this.f27948c = colorStateList;
        i();
    }

    public void f(PorterDuff.Mode mode) {
        if (this.f27947b == mode) {
            return;
        }
        this.f27947b = mode;
        g();
    }

    public void g() {
        for (Drawable drawable : this.f27946a.getCompoundDrawables()) {
            h(drawable);
        }
        for (Drawable drawable2 : this.f27946a.getCompoundDrawablesRelative()) {
            h(drawable2);
        }
    }
}
