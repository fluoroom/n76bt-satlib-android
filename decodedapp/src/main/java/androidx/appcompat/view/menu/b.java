package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AppCompatTextView implements o.a, View.OnClickListener, ActionMenuView.ActionMenuChildView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    j f1176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f1177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f1178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    h.b f1179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ForwardingListener f1180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    AbstractC0020b f1181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1183h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1186t;

    private class a extends ForwardingListener {
        public a() {
            super(b.this);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public q getPopup() {
            AbstractC0020b abstractC0020b = b.this.f1181f;
            if (abstractC0020b != null) {
                return abstractC0020b.getPopup();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean onForwardingStarted() {
            q popup;
            b bVar = b.this;
            h.b bVar2 = bVar.f1179d;
            return bVar2 != null && bVar2.invokeItem(bVar.f1176a) && (popup = getPopup()) != null && popup.isShowing();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0020b {
        public abstract q getPopup();
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f1182g = c();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f15026v, i10, 0);
        this.f1184r = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.f15031w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1186t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1185s = -1;
        setSaveEnabled(false);
    }

    private boolean c() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    private void d() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1177b);
        if (this.f1178c != null && (!this.f1176a.B() || (!this.f1182g && !this.f1183h))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f1177b : null);
        CharSequence contentDescription = this.f1176a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f1176a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1176a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            TooltipCompat.setTooltipText(this, z12 ? null : this.f1176a.getTitle());
        } else {
            TooltipCompat.setTooltipText(this, tooltipText);
        }
    }

    public boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.o.a
    public j getItemData() {
        return this.f1176a;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void initialize(j jVar, int i10) {
        this.f1176a = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.i(this));
        setId(jVar.getItemId());
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f1180e == null) {
            this.f1180e = new a();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerAfter() {
        return a();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerBefore() {
        return a() && this.f1176a.getIcon() == null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        h.b bVar = this.f1179d;
        if (bVar != null) {
            bVar.invokeItem(this.f1176a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1182g = c();
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zA = a();
        if (zA && (i12 = this.f1185s) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f1184r) : this.f1184r;
        if (mode != 1073741824 && this.f1184r > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, WXVideoFileObject.FILE_SIZE_LIMIT), i11);
        }
        if (zA || this.f1178c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1178c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener;
        if (this.f1176a.hasSubMenu() && (forwardingListener = this.f1180e) != null && forwardingListener.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean prefersCondensedTitle() {
        return true;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f1183h != z10) {
            this.f1183h = z10;
            j jVar = this.f1176a;
            if (jVar != null) {
                jVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1178c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f1186t;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        d();
    }

    public void setItemInvoker(h.b bVar) {
        this.f1179d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f1185s = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC0020b abstractC0020b) {
        this.f1181f = abstractC0020b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1177b = charSequence;
        d();
    }
}
