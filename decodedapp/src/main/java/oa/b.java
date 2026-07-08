package oa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.ui.RotationLayout;
import da.d;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewGroup f23338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RotationLayout f23339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f23340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f23341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f23343g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f23344h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f23345i;

    public b(Context context) {
        this.f23337a = context;
        this.f23345i = new a(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(da.c.f10878b, (ViewGroup) null);
        this.f23338b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f23339c = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(da.b.f10875a);
        this.f23340d = textView;
        this.f23341e = textView;
        h(1);
    }

    private static int a(int i10) {
        if (i10 == 3) {
            return -3407872;
        }
        if (i10 == 4) {
            return -16737844;
        }
        if (i10 == 5) {
            return -10053376;
        }
        if (i10 != 6) {
            return i10 != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    private static int b(int i10) {
        return (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? d.f10880b : d.f10879a;
    }

    public Bitmap c() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f23338b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredWidth = this.f23338b.getMeasuredWidth();
        int measuredHeight = this.f23338b.getMeasuredHeight();
        this.f23338b.layout(0, 0, measuredWidth, measuredHeight);
        int i10 = this.f23342f;
        if (i10 == 1 || i10 == 3) {
            measuredHeight = this.f23338b.getMeasuredWidth();
            measuredWidth = this.f23338b.getMeasuredHeight();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i11 = this.f23342f;
        if (i11 == 1) {
            canvas.translate(measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        } else if (i11 == 2) {
            canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
        } else if (i11 == 3) {
            canvas.translate(0.0f, measuredHeight);
            canvas.rotate(270.0f);
        }
        this.f23338b.draw(canvas);
        return bitmapCreateBitmap;
    }

    public Bitmap d(CharSequence charSequence) {
        TextView textView = this.f23340d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return c();
    }

    public void e(Drawable drawable) {
        this.f23338b.setBackgroundDrawable(drawable);
        if (drawable == null) {
            this.f23338b.setPadding(0, 0, 0, 0);
            return;
        }
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.f23338b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void f(int i10) {
        this.f23345i.a(i10);
        e(this.f23345i);
    }

    public void g(View view) {
        this.f23339c.removeAllViews();
        this.f23339c.addView(view);
        this.f23341e = view;
        View viewFindViewById = this.f23339c.findViewById(da.b.f10875a);
        this.f23340d = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
    }

    public void h(int i10) {
        f(a(i10));
        j(this.f23337a, b(i10));
    }

    public void i(int i10) {
        j(this.f23337a, i10);
    }

    public void j(Context context, int i10) {
        TextView textView = this.f23340d;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }
}
