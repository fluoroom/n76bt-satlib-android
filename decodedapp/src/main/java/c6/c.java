package c6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends u3.e {
    private int A;
    private ImageView B;
    private WindowManager C;
    private WindowManager.LayoutParams D;
    private o E;
    private Bitmap F;
    private boolean G;
    private boolean H;
    private int I;
    private boolean J;
    private d K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private ListAdapter R;
    private boolean S;
    private Runnable T;
    private boolean U;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f4405u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f4406v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f4407w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f4408x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f4409y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f4410z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E.d(c.this.f4406v);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f4412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f4413b;

        b(ImageView imageView, Bitmap bitmap) {
            this.f4412a = imageView;
            this.f4413b = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4412a != null) {
                ((WindowManager) c.this.getContext().getSystemService("window")).removeView(this.f4412a);
                this.f4412a.setImageDrawable(null);
            }
            Bitmap bitmap = this.f4413b;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    /* JADX INFO: renamed from: c6.c$c, reason: collision with other inner class name */
    private class RunnableC0068c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (c.this.G) {
                c.this.G = false;
                c.this.t();
            }
            c.this.E.a();
        }

        private RunnableC0068c() {
        }
    }

    private class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected boolean f4416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f4417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected boolean f4418c = false;

        public d() {
        }

        public int a() {
            if (this.f4418c) {
                return this.f4417b;
            }
            return 0;
        }

        public boolean b() {
            return this.f4418c;
        }

        public abstract void c(int i10);

        public void d(boolean z10) {
            if (!z10) {
                this.f4416a = true;
            } else {
                c.this.removeCallbacks(this);
                this.f4418c = false;
            }
        }
    }

    private class e extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f4420e;

        private void e(int i10) {
            c.this.scrollListBy(i10);
        }

        @Override // c6.c.d
        public void c(int i10) {
            if (this.f4418c) {
                return;
            }
            this.f4416a = false;
            this.f4418c = true;
            this.f4417b = i10;
            this.f4420e = SystemClock.elapsedRealtime();
            c.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            float f10;
            int i10;
            if (this.f4416a) {
                this.f4418c = false;
                return;
            }
            if (this.f4417b == -1) {
                f10 = -(c.this.O - c.this.M);
                i10 = c.this.Q;
            } else {
                f10 = c.this.M - c.this.P;
                i10 = c.this.Q;
            }
            float f11 = f10 / i10;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i11 = (int) (jElapsedRealtime - this.f4420e);
            this.f4420e = jElapsedRealtime;
            if (i11 == 0) {
                i11 = 1;
            }
            int i12 = ((int) (f11 * i11)) * 2;
            if (!c.this.u(i12)) {
                this.f4418c = false;
                return;
            }
            c.this.J = true;
            e(i12);
            c.this.layoutChildren();
            c.this.invalidate();
            c.this.J = false;
            c.this.post(this);
        }

        private e() {
            super();
        }
    }

    public class g extends o {
        public g(ListAdapter listAdapter) {
            super(listAdapter);
        }

        @Override // c6.o, c6.r
        protected void a() {
            if (c.this.H) {
                super.a();
                return;
            }
            this.f4458c.clear();
            int count = getCount();
            for (int i10 = 0; i10 < count; i10++) {
                this.f4458c.add(Integer.valueOf(i10));
            }
            notifyDataSetChanged();
        }
    }

    public interface h {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4406v = -1;
        this.J = false;
    }

    private boolean A(int i10) {
        return true;
    }

    private void B(int i10, int i11) {
        Rect rect;
        if (i10 == i11) {
            return;
        }
        View viewZ = z(i10);
        View viewZ2 = z(i11);
        if (viewZ == null) {
            return;
        }
        this.G = true;
        Rect rect2 = new Rect();
        y(viewZ, rect2);
        if (viewZ2 != null) {
            rect = new Rect();
            y(viewZ2, rect);
        } else {
            Rect rect3 = new Rect(rect2);
            int numColumns = getNumColumns();
            if (numColumns < 1) {
                return;
            }
            rect3.offset(((i11 % numColumns) - (i10 % numColumns)) * rect3.width(), ((i11 / numColumns) - (i10 / numColumns)) * rect3.height());
            rect = rect3;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, rect.left - rect2.left, 0.0f, rect.top - rect2.top);
        translateAnimation.setDuration(200L);
        translateAnimation.setInterpolator(new t3.a());
        translateAnimation.setFillEnabled(true);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new f(viewZ, rect.left, rect.top));
        viewZ.startAnimation(translateAnimation);
    }

    private void C(MotionEvent motionEvent) {
        if (this.B == null) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                int iPointToPosition = pointToPosition(this.L, this.M);
                if (iPointToPosition != -1 && A(iPointToPosition) && iPointToPosition != this.f4407w) {
                    this.f4407w = iPointToPosition;
                }
                t();
            } else if (action != 2) {
                if (action != 3) {
                    return;
                }
            }
            G();
            return;
        }
        x();
        v();
    }

    private void D(int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (a6.f.f328a) {
            Log.d("DragSortGridView", "reorderViews: " + i10 + "->" + i11);
        }
        View viewZ = z(i10);
        View viewZ2 = z(i11);
        if (viewZ == null || viewZ2 == null) {
            return;
        }
        this.U = false;
        Rect rect = new Rect();
        if (i11 < i10) {
            y(viewZ2, rect);
            if (this.I == 1) {
                B(this.f4405u, i10);
                B(i11, this.f4405u);
            } else {
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    B(i11, i12);
                    i11 = i12;
                }
            }
            viewZ.layout(rect.left, rect.top, rect.right, rect.bottom);
        } else {
            y(viewZ2, rect);
            if (this.I == 1) {
                B(this.f4405u, i10);
                B(i11, this.f4405u);
            } else {
                while (i11 > i10) {
                    B(i11, i11 - 1);
                    i11--;
                }
            }
            viewZ.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        if (this.G) {
            removeCallbacks(this.T);
            postDelayed(this.T, 400L);
        }
    }

    private void E(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            this.N = this.M;
        }
        this.L = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        this.M = y10;
        if (action == 0) {
            this.N = y10;
        }
    }

    private void F(Bitmap bitmap, int i10, int i11) {
        Context context = getContext();
        int[] iArr = new int[2];
        Bitmap bitmapW = w(bitmap, a6.k.b(context, 3.0f), iArr);
        bitmap.recycle();
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(bitmapW);
        this.f4408x -= iArr[0];
        this.f4409y -= iArr[1];
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.D = layoutParams;
        layoutParams.gravity = 51;
        layoutParams.x = (i10 - this.f4408x) + this.f4410z;
        layoutParams.y = (i11 - this.f4409y) + this.A;
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.flags = 920;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 0;
        this.F = bitmapW;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.C = windowManager;
        windowManager.addView(imageView, this.D);
        this.B = imageView;
        this.E.notifyDataSetChanged();
        post(new a());
        H(bitmapW.getHeight());
    }

    private void G() {
        this.G = false;
        ImageView imageView = this.B;
        Bitmap bitmap = this.F;
        this.B = null;
        this.F = null;
        post(new b(imageView, bitmap));
        this.f4406v = -1;
        o oVar = this.E;
        if (oVar != null) {
            oVar.d(-1);
        }
        if (this.K.b()) {
            this.K.d(true);
        }
    }

    private void H(int i10) {
        int paddingTop = getPaddingTop();
        int height = (getHeight() - paddingTop) - getPaddingBottom();
        int i11 = height / 3;
        if (i10 > i11) {
            i10 = i11;
        }
        this.O = paddingTop + i10;
        this.P = (paddingTop + height) - i10;
        this.Q = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (this.f4406v == this.f4407w) {
            return;
        }
        if (a6.f.f328a) {
            Log.d("DragSortGridView", "applyMove: " + this.f4406v + "->" + this.f4407w);
        }
        this.E.e(false);
        int i10 = this.I;
        if (i10 == 1) {
            this.E.c(this.f4406v, this.f4405u, i10);
            this.E.c(this.f4407w, this.f4405u, this.I);
        } else {
            this.E.c(this.f4406v, this.f4407w, i10);
        }
        this.E.d(this.f4407w);
        this.f4406v = this.f4407w;
        this.E.notifyDataSetChanged();
    }

    private void v() {
        int i10 = this.M;
        int iA = this.K.a();
        int i11 = this.N;
        if (i10 > i11 && i10 > this.P && iA != 1) {
            if (iA != 0) {
                this.K.d(true);
            }
            if (u(1)) {
                this.K.c(1);
                return;
            }
            return;
        }
        if (i10 >= i11 || i10 >= this.O || iA == -1) {
            if (i10 < this.O || i10 > this.P || !this.K.b()) {
                return;
            }
            this.K.d(true);
            return;
        }
        if (iA != 0) {
            this.K.d(true);
        }
        if (u(-1)) {
            this.K.c(-1);
        }
    }

    private Bitmap w(Bitmap bitmap, float f10, int[] iArr) {
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10, BlurMaskFilter.Blur.OUTER);
        Paint paint = new Paint();
        paint.setMaskFilter(blurMaskFilter);
        if (iArr == null) {
            iArr = new int[2];
        }
        Bitmap bitmapExtractAlpha = bitmap.extractAlpha(paint, iArr);
        Bitmap bitmapCopy = bitmapExtractAlpha.copy(Bitmap.Config.ARGB_8888, true);
        if (!bitmapCopy.isPremultiplied()) {
            bitmapCopy.setPremultiplied(true);
        }
        new Canvas(bitmapCopy).drawBitmap(bitmap, -iArr[0], -iArr[1], (Paint) null);
        bitmapExtractAlpha.recycle();
        return bitmapCopy;
    }

    private void x() {
        int iPointToPosition;
        ImageView imageView = this.B;
        if (imageView != null) {
            WindowManager.LayoutParams layoutParams = this.D;
            layoutParams.alpha = 1.0f;
            layoutParams.x = (this.L - this.f4408x) + this.f4410z;
            layoutParams.y = (this.M - this.f4409y) + this.A;
            this.C.updateViewLayout(imageView, layoutParams);
        }
        if (!this.G && this.U && (iPointToPosition = pointToPosition(this.L, this.M)) != -1 && A(iPointToPosition)) {
            if (iPointToPosition == this.f4407w) {
                t();
            } else {
                if (this.K.b()) {
                    return;
                }
                D(this.f4407w, iPointToPosition);
                this.f4407w = iPointToPosition;
            }
        }
    }

    private void y(View view, Rect rect) {
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private View z(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    public o getSortableAdapter() {
        return this.E;
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    protected void layoutChildren() {
        super.layoutChildren();
        this.U = true;
    }

    @Override // u3.e, android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.H) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        E(motionEvent);
        if (motionEvent.getAction() != 0) {
            C(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        }
        G();
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int iPointToPosition = pointToPosition(x10, y10);
        this.f4407w = iPointToPosition;
        this.f4406v = iPointToPosition;
        this.f4405u = iPointToPosition;
        if (iPointToPosition == -1 || !A(iPointToPosition)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        View childAt = getChildAt(this.f4406v - getFirstVisiblePosition());
        this.f4408x = x10 - childAt.getLeft();
        this.f4409y = y10 - childAt.getTop();
        this.f4410z = (int) (motionEvent.getRawX() - x10);
        this.A = (int) (motionEvent.getRawY() - y10);
        q.a(childAt);
        childAt.setDrawingCacheEnabled(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
        childAt.setDrawingCacheEnabled(false);
        F(bitmapCreateBitmap, x10, y10);
        requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @Override // u3.e, android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.H) {
            return super.onTouchEvent(motionEvent);
        }
        E(motionEvent);
        C(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.S || this.J || this.G) {
            return;
        }
        this.S = true;
        super.requestLayout();
        this.S = false;
    }

    public void setDragEnabled(boolean z10) {
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        if (!z10) {
            this.K = null;
            return;
        }
        this.K = new e();
        this.T = new RunnableC0068c();
        ListAdapter listAdapter = this.R;
        if (listAdapter != null) {
            setAdapter(listAdapter);
        }
    }

    public void setDragMode(int i10) {
        this.I = i10;
    }

    public boolean u(int i10) {
        return super.canScrollList(i10);
    }

    @Override // u3.e, android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        boolean z10 = this.R == listAdapter;
        this.R = listAdapter;
        if (!this.H) {
            this.E = null;
            super.setAdapter(listAdapter);
            return;
        }
        this.E = new g(listAdapter);
        Parcelable parcelableOnSaveInstanceState = z10 ? onSaveInstanceState() : null;
        super.setAdapter((ListAdapter) this.E);
        if (parcelableOnSaveInstanceState != null) {
            onRestoreInstanceState(parcelableOnSaveInstanceState);
        }
    }

    private class f implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private View f4422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f4423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4424c;

        public f(View view, int i10, int i11) {
            this.f4422a = view;
            this.f4423b = i10;
            this.f4424c = i11;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            View view = this.f4422a;
            int i10 = this.f4423b;
            view.layout(i10, this.f4424c, view.getWidth() + i10, this.f4424c + this.f4422a.getHeight());
            this.f4422a.clearAnimation();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public void setOnSortChangedListener(h hVar) {
    }
}
