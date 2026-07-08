package com.dw.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.i;
import g4.g;
import java.util.Arrays;
import k3.l;
import m0.o0;

/* JADX INFO: loaded from: classes.dex */
public class TableView extends View implements GestureDetector.OnGestureListener {
    private GestureDetector A;
    private i B;
    private int C;
    private int D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f6985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f6986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextPaint f6988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Cursor f6989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String[] f6990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6991h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f6993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int[] f6994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f6995u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f6996v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f6997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f6998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextPaint f6999y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f7000z;

    static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0106a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f7001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7002b;

        /* JADX INFO: renamed from: com.dw.widget.TableView$a$a, reason: collision with other inner class name */
        class C0106a implements Parcelable.Creator {
            C0106a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public String toString() {
            return "SavedState [scrollX=" + this.f7001a + ", scrollY=" + this.f7002b + "]";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f7001a));
            parcel.writeValue(Integer.valueOf(this.f7002b));
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        private a(Parcel parcel) {
            super(parcel);
            this.f7001a = parcel.readInt();
            this.f7002b = parcel.readInt();
        }
    }

    public TableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6984a = -16777216;
        this.f6985b = 16.0f;
        this.f6987d = 1149798536;
        b(context, attributeSet, 0);
    }

    private String a(int i10) {
        if (this.f6989f.isNull(i10)) {
            return null;
        }
        try {
            return this.f6989f.getString(i10);
        } catch (SQLiteException unused) {
            return "BLOB";
        }
    }

    private void b(Context context, AttributeSet attributeSet, int i10) {
        this.B = i.b(context);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.f19342s3, i10, 0);
        this.f6984a = typedArrayObtainStyledAttributes.getColor(l.f19352u3, this.f6984a);
        this.f6987d = typedArrayObtainStyledAttributes.getColor(l.f19347t3, this.f6987d);
        this.f6985b = typedArrayObtainStyledAttributes.getDimension(l.f19357v3, this.f6985b);
        int i11 = l.f19362w3;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f6986c = typedArrayObtainStyledAttributes.getDrawable(i11);
        }
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f6988e = textPaint;
        textPaint.setFlags(1);
        this.f6988e.setTextAlign(Paint.Align.LEFT);
        TextPaint textPaint2 = new TextPaint();
        this.f6999y = textPaint2;
        textPaint2.setFlags(1);
        this.A = new GestureDetector(getContext(), this);
        c();
        if (isInEditMode()) {
            setCursor(new g(new String[]{"_id", "name", "number", "type", "name2", "number2", "type2"}, 300, "data"));
            scrollTo(30, 30);
        }
    }

    private void c() {
        if (!this.f6995u) {
            this.f6996v = (int) (this.f6985b * 40.0f);
        }
        float f10 = this.f6985b;
        float f11 = f10 / 4.0f;
        this.f6997w = f11;
        this.f7000z = f10 / 2.0f;
        float f12 = f11 + f10;
        this.f6998x = f12;
        this.C = (int) ((this.f6992r + 1) * f12);
        this.f6988e.setTextSize(f10);
        this.f6988e.setColor(this.f6984a);
        this.f6999y.setColor(this.f6987d);
        e();
    }

    private void d(int i10) {
        String strA;
        int iMeasureText;
        int i11 = this.f6993s;
        Cursor cursor = this.f6989f;
        int i12 = 0;
        if (cursor != null && cursor.moveToPosition(i10)) {
            this.f6989f.moveToPosition(i10 - 1);
            while (true) {
                int i13 = i11 - 1;
                if (i11 <= 0 || !this.f6989f.moveToNext()) {
                    break;
                }
                for (int i14 = 0; i14 < this.f6991h; i14++) {
                    int i15 = this.f6994t[i14];
                    if (i15 < this.f6996v && (strA = a(i14)) != null && (iMeasureText = (int) this.f6988e.measureText(strA)) > i15) {
                        int i16 = this.f6996v;
                        if (iMeasureText > i16) {
                            iMeasureText = i16;
                        }
                        this.f6994t[i14] = iMeasureText;
                    }
                }
                i11 = i13;
            }
        }
        float f10 = 0.0f;
        while (true) {
            int i17 = this.f6991h;
            if (i12 >= i17) {
                this.D = (int) (f10 + ((i17 * this.f6985b) / 2.0f));
                return;
            } else {
                f10 += this.f6994t[i12];
                i12++;
            }
        }
    }

    private void e() {
        if (this.f6985b > 0.0f) {
            this.f6993s = (int) Math.ceil(((getHeight() - getPaddingTop()) - getPaddingBottom()) / this.f6998x);
        } else {
            this.f6993s = 0;
        }
    }

    private int getMaxScrollX() {
        int width = (this.D - getWidth()) + getPaddingLeft() + getPaddingRight();
        if (width > 0) {
            return width;
        }
        return 0;
    }

    private int getMaxScrollY() {
        int height = (this.C - getHeight()) + getPaddingBottom() + getPaddingTop();
        if (height > 0) {
            return height;
        }
        return 0;
    }

    @Override // android.view.View
    protected int computeHorizontalScrollRange() {
        return this.D;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.B.a()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int iF = this.B.f();
            int iG = this.B.g();
            if (scrollX != iF || scrollY != iG) {
                scrollTo(iF, iG);
            }
            if (awakenScrollBars()) {
                return;
            }
            o0.d0(this);
        }
    }

    @Override // android.view.View
    protected int computeVerticalScrollRange() {
        return this.C;
    }

    public int getMaxColumnWidth() {
        return this.f6996v;
    }

    public int getTextColor() {
        return this.f6984a;
    }

    public float getTextSize() {
        return this.f6985b;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f10;
        float f11;
        String strA;
        super.onDraw(canvas);
        Cursor cursor = this.f6989f;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        getPaddingBottom();
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int width = (getWidth() - paddingLeft) - paddingRight;
        getHeight();
        float f12 = scrollY;
        int i10 = (int) (f12 / this.f6998x);
        int i11 = this.f6993s;
        d(i10);
        float f13 = paddingTop;
        getHeight();
        float f14 = scrollX + paddingLeft;
        float f15 = width + f14;
        canvas.save();
        canvas.translate(0.0f, f12);
        Drawable drawable = this.f6986c;
        if (drawable != null) {
            drawable.setBounds((int) f14, paddingTop, (int) f15, ((int) this.f6998x) + paddingTop);
            this.f6986c.draw(canvas);
        }
        float f16 = paddingLeft;
        float f17 = f13 + this.f6985b;
        float f18 = f16;
        for (int i12 = 0; i12 < this.f6991h; i12++) {
            float f19 = this.f6994t[i12];
            float f20 = f18 + f19;
            if (f20 > f14) {
                String str = this.f6990g[i12];
                canvas.save();
                canvas.clipRect(f18, -2.14748365E9f, f20, 2.14748365E9f);
                canvas.drawText(str, f18, f17, this.f6988e);
                canvas.restore();
            }
            f18 += f19 + this.f7000z;
            if (f18 > f15) {
                break;
            }
        }
        canvas.restore();
        canvas.save();
        canvas.clipRect(0.0f, this.f6997w + f17 + f12, 2.14748365E9f, 2.14748365E9f);
        canvas.translate(0.0f, f12 - (f12 % this.f6998x));
        Cursor cursor2 = this.f6989f;
        if (cursor2 != null && cursor2.moveToPosition(i10)) {
            this.f6989f.moveToPosition(i10 - 1);
            while (true) {
                int i13 = i11 - 1;
                if (i11 <= 0 || !this.f6989f.moveToNext()) {
                    break;
                }
                f17 += this.f6998x;
                if (this.f6989f.getPosition() % 2 == 0) {
                    float f21 = this.f6997w;
                    f10 = f14;
                    f11 = f15;
                    canvas.drawRect(f10, (f17 + f21) - this.f6998x, f11, f21 + f17, this.f6999y);
                } else {
                    f10 = f14;
                    f11 = f15;
                }
                float f22 = f16;
                for (int i14 = 0; i14 < this.f6991h; i14++) {
                    float f23 = this.f6994t[i14];
                    float f24 = f22 + f23;
                    if (f24 > f10 && (strA = a(i14)) != null) {
                        canvas.save();
                        canvas.clipRect(f22, -2.14748365E9f, f24, 2.14748365E9f);
                        canvas.drawText(strA, f22, f17, this.f6988e);
                        canvas.restore();
                    }
                    f22 += f23 + this.f7000z;
                    if (f22 > f11) {
                        break;
                    }
                }
                f14 = f10;
                f15 = f11;
                i11 = i13;
            }
        }
        canvas.restore();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.B.e(getScrollX(), getScrollY(), (int) (-f10), (int) (-f11), 0, getMaxScrollX(), 0, getMaxScrollY(), 0, 0);
        o0.d0(this);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        scrollTo(aVar.f7001a, aVar.f7002b);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f7001a = getScrollX();
        aVar.f7002b = getScrollY();
        return aVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int scrollX = (int) (getScrollX() + f10);
        int scrollY = (int) (getScrollY() + f11);
        if (scrollX < 0) {
            scrollX = 0;
        }
        if (scrollY < 0) {
            scrollY = 0;
        }
        int maxScrollY = getMaxScrollY();
        int maxScrollX = getMaxScrollX();
        if (scrollX > maxScrollX) {
            scrollX = maxScrollX;
        }
        if (scrollY > maxScrollY) {
            scrollY = maxScrollY;
        }
        scrollTo(scrollX, scrollY);
        return true;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        e();
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.A.onTouchEvent(motionEvent);
        return true;
    }

    public void setCursor(Cursor cursor) {
        this.f6989f = cursor;
        if (cursor == null) {
            this.f6990g = null;
            this.f6991h = 0;
            this.f6992r = 0;
        } else {
            this.f6992r = cursor.getCount();
            this.f6990g = cursor.getColumnNames();
            int columnCount = cursor.getColumnCount();
            this.f6991h = columnCount;
            int[] iArr = new int[columnCount];
            this.f6994t = iArr;
            Arrays.fill(iArr, 0);
            for (int i10 = 0; i10 < this.f6991h; i10++) {
                String str = this.f6990g[i10];
                if (str != null) {
                    this.f6994t[i10] = (int) this.f6988e.measureText(str);
                }
            }
        }
        this.C = (int) ((this.f6992r + 1) * this.f6998x);
        invalidate();
    }

    public void setMaxColumnWidth(int i10) {
        this.f6996v = i10;
        if (i10 > 0) {
            this.f6995u = true;
        } else {
            this.f6995u = false;
            c();
        }
    }

    public void setTextColor(int i10) {
        this.f6984a = i10;
        c();
    }

    public void setTextSize(float f10) {
        this.f6985b = f10;
        c();
    }
}
