package c6;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class m extends RecyclerView.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f4453e = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f4454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f4455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f4456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4457d;

    public m(Context context, int i10) {
        if (i10 != 1 && i10 != 0) {
            throw new IllegalArgumentException("请输入正确的参数！");
        }
        this.f4457d = i10;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f4453e);
        this.f4455b = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        int intrinsicHeight = this.f4455b.getIntrinsicHeight();
        this.f4456c = intrinsicHeight;
        if (intrinsicHeight == 0) {
            this.f4456c = a6.k.b(context, 1.0f);
        }
    }

    private void j(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingLeft = recyclerView.getPaddingLeft();
        int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = recyclerView.getChildAt(i10);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) childAt.getLayoutParams())).bottomMargin;
            int i11 = this.f4456c + bottom;
            Drawable drawable = this.f4455b;
            if (drawable != null) {
                drawable.setBounds(paddingLeft, bottom, measuredWidth, i11);
                this.f4455b.draw(canvas);
            }
            Paint paint = this.f4454a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(paddingLeft, bottom, measuredWidth, i11, paint);
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }

    private void k(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int paddingTop = recyclerView.getPaddingTop();
        int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = recyclerView.getChildAt(i10);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) childAt.getLayoutParams())).rightMargin;
            int i11 = this.f4456c + right;
            Drawable drawable = this.f4455b;
            if (drawable != null) {
                drawable.setBounds(right, paddingTop, i11, measuredHeight);
                this.f4455b.draw(canvas);
            }
            Paint paint = this.f4454a;
            if (paint != null) {
                canvas2 = canvas;
                canvas2.drawRect(right, paddingTop, i11, measuredHeight, paint);
            } else {
                canvas2 = canvas;
            }
            i10++;
            canvas = canvas2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        super.e(rect, view, recyclerView, b0Var);
        rect.set(0, 0, 0, this.f4456c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        super.g(canvas, recyclerView, b0Var);
        if (this.f4457d == 1) {
            k(canvas, recyclerView);
        } else {
            j(canvas, recyclerView);
        }
    }
}
