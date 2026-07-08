package com.dw.android.widget;

import a6.q;
import a6.z;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.fragment.app.o;
import com.dw.android.widget.MultiSelectListPreferenceView;
import java.util.Arrays;
import k3.g;
import k3.k;
import k3.l;
import v3.j;
import v3.s;
import v3.t;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreferenceView extends TowLineTextView implements s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f5306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f5307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f5309h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String[] f5310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f5311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f5312t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private androidx.appcompat.app.d f5313u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private t f5314v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private a f5315w;

    public interface a {
        void a(MultiSelectListPreferenceView multiSelectListPreferenceView, String str);
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f5316a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public String toString() {
            return "MultiSelectListPreferenceView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " value=" + this.f5316a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(this.f5316a);
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f5316a = parcel.readString();
        }
    }

    public MultiSelectListPreferenceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k3.b.f19161i);
    }

    private void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        ComponentCallbacks2 componentCallbacks2B = j.b(context);
        if ((componentCallbacks2B instanceof t) && (componentCallbacks2B instanceof androidx.appcompat.app.d)) {
            this.f5313u = (androidx.appcompat.app.d) componentCallbacks2B;
            this.f5314v = (t) componentCallbacks2B;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f19261c2, i10, i11);
        Resources resources = context.getResources();
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.f19271e2, 0);
            if (resourceId != 0) {
                this.f5310r = resources.getStringArray(resourceId);
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(l.f19276f2, 0);
            if (resourceId2 != 0) {
                this.f5309h = resources.getStringArray(resourceId2);
            }
            this.f5311s = typedArrayObtainStyledAttributes.getBoolean(l.f19266d2, false);
            if (this.f5309h == null) {
                this.f5309h = this.f5310r;
            }
            typedArrayObtainStyledAttributes.recycle();
            h();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public static /* synthetic */ void e(MultiSelectListPreferenceView multiSelectListPreferenceView, DialogInterface dialogInterface, int i10) {
        multiSelectListPreferenceView.setValueIndex(i10);
        dialogInterface.dismiss();
    }

    private boolean f(String str) {
        if (q.d(str, this.f5307f)) {
            return false;
        }
        this.f5307f = str;
        g();
        h();
        return true;
    }

    private void g() {
        this.f5308g = -1;
        if (this.f5309h == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            String[] strArr = this.f5309h;
            if (i10 >= strArr.length) {
                return;
            }
            if (q.d(strArr[i10], this.f5307f)) {
                this.f5308g = i10;
                return;
            }
            i10++;
        }
    }

    private void h() {
        int i10;
        String[] strArr = this.f5310r;
        if (strArr == null || (i10 = this.f5308g) < 0 || i10 >= strArr.length) {
            this.f5306e.setText(this.f5307f);
        } else {
            this.f5306e.setText(strArr[i10]);
        }
    }

    private void setValueIndex(int i10) {
        String[] strArr = this.f5309h;
        if (i10 < strArr.length) {
            if (i10 == this.f5308g) {
                return;
            }
            this.f5308g = i10;
            setValue(strArr[i10]);
            return;
        }
        if (this.f5313u != null) {
            if (this.f5312t == null) {
                this.f5312t = "MultiSelectListPreferenceView:" + String.valueOf(z.a());
            }
            v3.q.o4(getContext(), getTitle(), null, this.f5307f, null).g4(this.f5313u.N0(), this.f5312t);
        }
    }

    @Override // v3.s
    public boolean N(o oVar, int i10, int i11, int i12, Object obj) {
        String str;
        if (oVar == null || (str = this.f5312t) == null || !str.equals(oVar.P1())) {
            return false;
        }
        if (k3.f.T != i10 || i11 != -1) {
            return true;
        }
        setValue(obj.toString());
        return true;
    }

    @Override // com.dw.android.widget.TowLineTextView
    protected void d(Context context) {
        View.inflate(context, g.f19220n, this);
        setOrientation(0);
        TextView textView = (TextView) findViewById(k3.f.R);
        this.f5306e = textView;
        textView.setId(c6.q.d());
        setClickable(true);
    }

    public String getValue() {
        return this.f5307f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        t tVar = this.f5314v;
        if (tVar != null) {
            tVar.x(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t tVar = this.f5314v;
        if (tVar != null) {
            tVar.c(this);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        f(bVar.f5316a);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f5316a = this.f5307f;
        return bVar;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        String[] strArr = this.f5310r;
        if (this.f5311s) {
            strArr = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            strArr[strArr.length - 1] = getResources().getString(k3.j.f19234b);
        }
        new c.a(getContext()).x(strArr, this.f5308g, new DialogInterface.OnClickListener() { // from class: u3.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                MultiSelectListPreferenceView.e(this.f28033a, dialogInterface, i10);
            }
        }).z(getTitle()).C();
        return true;
    }

    public void setEntries(String[] strArr) {
        this.f5310r = strArr;
        h();
    }

    public void setListener(a aVar) {
        this.f5315w = aVar;
    }

    public void setValue(String str) {
        a aVar;
        if (!f(str) || (aVar = this.f5315w) == null) {
            return;
        }
        aVar.a(this, str);
    }

    public void setValues(String[] strArr) {
        this.f5309h = strArr;
        g();
        h();
    }

    public MultiSelectListPreferenceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5308g = -1;
        c(context, attributeSet, i10, k.f19247e);
    }
}
