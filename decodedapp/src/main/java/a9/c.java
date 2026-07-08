package a9;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.internal.m;
import com.google.android.material.internal.p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u8.e;
import u8.f;
import u8.j;
import u8.k;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public class c extends AppCompatCheckBox {
    private static final int D = k.f28742r;
    private static final int[] E = {u8.b.U};
    private static final int[] F;
    private static final int[][] G;
    private static final int H;
    private CompoundButton.OnCheckedChangeListener A;
    private final androidx.vectordrawable.graphics.drawable.c B;
    private final androidx.vectordrawable.graphics.drawable.b C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorStateList f368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f373h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f374r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f375s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ColorStateList f376t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    ColorStateList f377u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private PorterDuff.Mode f378v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f379w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int[] f380x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f381y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f382z;

    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = c.this.f376t;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            c cVar = c.this;
            ColorStateList colorStateList = cVar.f376t;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(cVar.f380x, c.this.f376t.getDefaultColor()));
            }
        }
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f384a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        private String b() {
            int i10 = this.f384a;
            return i10 != 1 ? i10 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + b() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f384a));
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f384a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i10 = u8.b.T;
        F = new int[]{i10};
        G = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        H = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.C);
    }

    private boolean c(TintTypedArray tintTypedArray) {
        return tintTypedArray.getResourceId(l.f28954w3, 0) == H && tintTypedArray.getResourceId(l.f28963x3, 0) == 0;
    }

    private void e() {
        this.f373h = com.google.android.material.drawable.c.c(this.f373h, this.f376t, androidx.core.widget.c.c(this));
        this.f374r = com.google.android.material.drawable.c.c(this.f374r, this.f377u, this.f378v);
        g();
        h();
        super.setButtonDrawable(com.google.android.material.drawable.c.a(this.f373h, this.f374r));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f382z != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        androidx.vectordrawable.graphics.drawable.c cVar;
        if (this.f375s) {
            androidx.vectordrawable.graphics.drawable.c cVar2 = this.B;
            if (cVar2 != null) {
                cVar2.g(this.C);
                this.B.c(this.C);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.f373h;
                if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.B) == null) {
                    return;
                }
                int i10 = f.f28644b;
                int i11 = f.f28643a0;
                ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, cVar, false);
                ((AnimatedStateListDrawable) this.f373h).addTransition(f.f28650h, i11, this.B, false);
            }
        }
    }

    private String getButtonStateDescription() {
        int i10 = this.f379w;
        return i10 == 1 ? getResources().getString(j.f28709k) : i10 == 0 ? getResources().getString(j.f28711m) : getResources().getString(j.f28710l);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f368c == null) {
            int[][] iArr = G;
            int[] iArr2 = new int[iArr.length];
            int iD = c9.a.d(this, h.a.I);
            int iD2 = c9.a.d(this, h.a.L);
            int iD3 = c9.a.d(this, u8.b.f28552h);
            int iD4 = c9.a.d(this, u8.b.f28550f);
            iArr2[0] = c9.a.k(iD3, iD2, 1.0f);
            iArr2[1] = c9.a.k(iD3, iD, 1.0f);
            iArr2[2] = c9.a.k(iD3, iD4, 0.54f);
            iArr2[3] = c9.a.k(iD3, iD4, 0.38f);
            iArr2[4] = c9.a.k(iD3, iD4, 0.38f);
            this.f368c = new ColorStateList(iArr, iArr2);
        }
        return this.f368c;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f376t;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f373h;
        if (drawable != null && (colorStateList2 = this.f376t) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.f374r;
        if (drawable2 == null || (colorStateList = this.f377u) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    public boolean d() {
        return this.f371f;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f373h;
    }

    public Drawable getButtonIconDrawable() {
        return this.f374r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f377u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f378v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f376t;
    }

    public int getCheckedState() {
        return this.f379w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f372g;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f379w == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f369d && this.f376t == null && this.f377u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, E);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        this.f380x = com.google.android.material.drawable.c.e(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f370e || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (p.g(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f372g));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f384a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f384a = getCheckedState();
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(i.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f374r = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(i.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f377u == colorStateList) {
            return;
        }
        this.f377u = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f378v == mode) {
            return;
        }
        this.f378v = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f376t == colorStateList) {
            return;
        }
        this.f376t = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f370e = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f379w != i10) {
            this.f379w = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (this.f381y) {
                return;
            }
            this.f381y = true;
            LinkedHashSet linkedHashSet = this.f367b;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
            if (this.f379w != 2 && (onCheckedChangeListener = this.A) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = a9.b.a(getContext().getSystemService(a9.a.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.f381y = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f372g = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f371f == z10) {
            return;
        }
        this.f371f = z10;
        refreshDrawableState();
        Iterator it = this.f366a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f382z = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f369d = z10;
        if (z10) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context, AttributeSet attributeSet, int i10) {
        int i11 = D;
        super(q9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f366a = new LinkedHashSet();
        this.f367b = new LinkedHashSet();
        this.B = androidx.vectordrawable.graphics.drawable.c.a(getContext(), e.f28636e);
        this.C = new a();
        Context context2 = getContext();
        this.f373h = androidx.core.widget.c.a(this);
        this.f376t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        TintTypedArray tintTypedArrayJ = m.j(context2, attributeSet, l.f28945v3, i10, i11, new int[0]);
        this.f374r = tintTypedArrayJ.getDrawable(l.f28972y3);
        if (this.f373h != null && m.g(context2) && c(tintTypedArrayJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f373h = i.a.b(context2, e.f28635d);
            this.f375s = true;
            if (this.f374r == null) {
                this.f374r = i.a.b(context2, e.f28637f);
            }
        }
        this.f377u = j9.c.b(context2, tintTypedArrayJ, l.f28981z3);
        this.f378v = p.h(tintTypedArrayJ.getInt(l.A3, -1), PorterDuff.Mode.SRC_IN);
        this.f369d = tintTypedArrayJ.getBoolean(l.F3, false);
        this.f370e = tintTypedArrayJ.getBoolean(l.B3, true);
        this.f371f = tintTypedArrayJ.getBoolean(l.E3, false);
        this.f372g = tintTypedArrayJ.getText(l.D3);
        int i12 = l.C3;
        if (tintTypedArrayJ.hasValue(i12)) {
            setCheckedState(tintTypedArrayJ.getInt(i12, 0));
        }
        tintTypedArrayJ.recycle();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f373h = drawable;
        this.f375s = false;
        e();
    }
}
