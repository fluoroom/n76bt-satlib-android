package info.hoang8f.android.segmented;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import pb.b;
import pb.c;
import pb.d;

/* JADX INFO: loaded from: classes3.dex */
public class SegmentedGroup extends RadioGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources f16207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f16210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Float f16211f;

    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f16214c = c.f24105a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f16215d = c.f24106b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f16216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f16217f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float[] f16218g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float[] f16219h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float[] f16220i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f16221j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final float[] f16222k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final float[] f16223l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float[] f16224m;

        public a(float f10) {
            float fApplyDimension = TypedValue.applyDimension(1, 0.1f, SegmentedGroup.this.getResources().getDisplayMetrics());
            this.f16217f = fApplyDimension;
            this.f16212a = -1;
            this.f16213b = -1;
            this.f16216e = f10;
            this.f16218g = new float[]{f10, f10, fApplyDimension, fApplyDimension, fApplyDimension, fApplyDimension, f10, f10};
            this.f16219h = new float[]{fApplyDimension, fApplyDimension, f10, f10, f10, f10, fApplyDimension, fApplyDimension};
            this.f16220i = new float[]{fApplyDimension, fApplyDimension, fApplyDimension, fApplyDimension, fApplyDimension, fApplyDimension, fApplyDimension, fApplyDimension};
            this.f16221j = new float[]{f10, f10, f10, f10, f10, f10, f10, f10};
            this.f16222k = new float[]{f10, f10, f10, f10, fApplyDimension, fApplyDimension, fApplyDimension, fApplyDimension};
            this.f16223l = new float[]{fApplyDimension, fApplyDimension, fApplyDimension, fApplyDimension, f10, f10, f10, f10};
        }

        private int a(View view) {
            return SegmentedGroup.this.indexOfChild(view);
        }

        private int c() {
            return SegmentedGroup.this.getChildCount();
        }

        private void f(int i10, int i11) {
            if (this.f16212a == i10 && this.f16213b == i11) {
                return;
            }
            this.f16212a = i10;
            this.f16213b = i11;
            if (i10 == 1) {
                this.f16224m = this.f16221j;
                return;
            }
            if (i11 == 0) {
                this.f16224m = SegmentedGroup.this.getOrientation() == 0 ? this.f16218g : this.f16222k;
            } else if (i11 == i10 - 1) {
                this.f16224m = SegmentedGroup.this.getOrientation() == 0 ? this.f16219h : this.f16223l;
            } else {
                this.f16224m = this.f16220i;
            }
        }

        public float[] b(View view) {
            f(c(), a(view));
            return this.f16224m;
        }

        public int d() {
            return this.f16214c;
        }

        public int e() {
            return this.f16215d;
        }
    }

    public SegmentedGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16209d = -1;
        Resources resources = getResources();
        this.f16207b = resources;
        this.f16208c = resources.getColor(pb.a.f24102a);
        this.f16206a = (int) getResources().getDimension(b.f24104b);
        this.f16211f = Float.valueOf(getResources().getDimension(b.f24103a));
        a(attributeSet);
        this.f16210e = new a(this.f16211f.floatValue());
    }

    private void a(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, d.f24107a, 0, 0);
        try {
            this.f16206a = (int) typedArrayObtainStyledAttributes.getDimension(d.f24108b, getResources().getDimension(b.f24104b));
            this.f16211f = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(d.f24110d, getResources().getDimension(b.f24103a)));
            this.f16208c = typedArrayObtainStyledAttributes.getColor(d.f24111e, getResources().getColor(pb.a.f24102a));
            this.f16209d = typedArrayObtainStyledAttributes.getColor(d.f24109c, getResources().getColor(R.color.white));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void c(View view) {
        int iD = this.f16210e.d();
        int iE = this.f16210e.e();
        ((Button) view).setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{-16842919, -16842912}, new int[]{-16842919, R.attr.state_checked}}, new int[]{-7829368, this.f16208c, this.f16209d}));
        Drawable drawableMutate = this.f16207b.getDrawable(iD).mutate();
        Drawable drawableMutate2 = this.f16207b.getDrawable(iE).mutate();
        GradientDrawable gradientDrawable = (GradientDrawable) drawableMutate;
        gradientDrawable.setColor(this.f16208c);
        gradientDrawable.setStroke(this.f16206a, this.f16208c);
        GradientDrawable gradientDrawable2 = (GradientDrawable) drawableMutate2;
        gradientDrawable2.setStroke(this.f16206a, this.f16208c);
        gradientDrawable.setCornerRadii(this.f16210e.b(view));
        gradientDrawable2.setCornerRadii(this.f16210e.b(view));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912}, drawableMutate2);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, drawableMutate);
        view.setBackground(stateListDrawable);
    }

    public void b() {
        int childCount = super.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c(childAt);
            if (i10 == childCount - 1) {
                return;
            }
            RadioGroup.LayoutParams layoutParams = (RadioGroup.LayoutParams) childAt.getLayoutParams();
            RadioGroup.LayoutParams layoutParams2 = new RadioGroup.LayoutParams(layoutParams.width, layoutParams.height, layoutParams.weight);
            if (getOrientation() == 0) {
                layoutParams2.setMargins(0, 0, -this.f16206a, 0);
            } else {
                layoutParams2.setMargins(0, 0, 0, -this.f16206a);
            }
            childAt.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.widget.RadioGroup, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        b();
    }

    public void setTintColor(int i10) {
        this.f16208c = i10;
        b();
    }
}
