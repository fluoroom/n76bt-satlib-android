package com.dw.android.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.c;
import c6.q;
import com.dw.android.widget.NumberPreferenceView;
import k3.g;
import k3.l;
import v3.a0;

/* JADX INFO: loaded from: classes.dex */
public class NumberPreferenceView extends TowLineTextView implements a0.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f5317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f5318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f5319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5320h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f5321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f5323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f5324u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CharSequence f5325v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String[] f5326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f5327x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private a f5328y;

    public interface a {
        String format(int i10);
    }

    public interface b {
        void B0(NumberPreferenceView numberPreferenceView, int i10, boolean z10);

        void y0(NumberPreferenceView numberPreferenceView, int i10, int i11, boolean z10);
    }

    public interface c {
        void f(NumberPreferenceView numberPreferenceView, int i10, int i11);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f5329a;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public String toString() {
            return "NumberPreferenceView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5329a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f5329a));
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        private d(Parcel parcel) {
            super(parcel);
            this.f5329a = ((Integer) parcel.readValue(null)).intValue();
        }
    }

    public NumberPreferenceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k3.b.f19162j);
    }

    private void c(Context context, AttributeSet attributeSet, int i10, int i11) throws Exception {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f19326p2, i10, i11);
        try {
            this.f5322s = typedArrayObtainStyledAttributes.getInt(l.f19351u2, 0);
            this.f5323t = typedArrayObtainStyledAttributes.getInt(l.f19341s2, 2147483646);
            this.f5324u = typedArrayObtainStyledAttributes.getText(l.f19346t2);
            this.f5325v = typedArrayObtainStyledAttributes.getText(l.f19361w2);
            this.f5321r = typedArrayObtainStyledAttributes.getString(l.f19356v2);
            this.f5327x = typedArrayObtainStyledAttributes.getBoolean(l.f19336r2, false);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.f19331q2, 0);
            if (resourceId != 0) {
                this.f5326w = context.getResources().getStringArray(resourceId);
                if (this.f5323t == 2147483646) {
                    this.f5323t = r2.length - 1;
                }
            }
            setNumber(typedArrayObtainStyledAttributes.getInt(l.f19366x2, this.f5322s));
            c0.e.a(typedArrayObtainStyledAttributes);
            h();
        } catch (Throwable th2) {
            if (typedArrayObtainStyledAttributes != null) {
                try {
                    c0.e.a(typedArrayObtainStyledAttributes);
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static /* synthetic */ void e(NumberPreferenceView numberPreferenceView, DialogInterface dialogInterface, int i10) {
        numberPreferenceView.g(i10 + numberPreferenceView.f5322s, true);
        dialogInterface.dismiss();
    }

    private String f(int i10) {
        a aVar = this.f5328y;
        return aVar != null ? aVar.format(i10) : String.valueOf(i10);
    }

    private void h() {
        String strValueOf;
        a aVar = this.f5328y;
        if (aVar != null) {
            this.f5317e.setText(aVar.format(this.f5320h));
            return;
        }
        String[] strArr = this.f5326w;
        if (strArr != null) {
            this.f5317e.setText(strArr[this.f5320h - this.f5322s]);
            return;
        }
        if (!TextUtils.isEmpty(this.f5321r)) {
            strValueOf = String.format(this.f5321r, Integer.valueOf(this.f5320h));
        } else if (TextUtils.isEmpty(this.f5325v)) {
            strValueOf = String.valueOf(this.f5320h);
        } else {
            strValueOf = this.f5320h + " " + ((Object) this.f5325v);
        }
        this.f5317e.setText(strValueOf);
    }

    @Override // v3.a0.a
    public void a(a0 a0Var, int i10, int i11) {
        g(i11, true);
    }

    @Override // com.dw.android.widget.TowLineTextView
    protected void d(Context context) {
        View.inflate(context, g.f19221o, this);
        setOrientation(0);
        TextView textView = (TextView) findViewById(k3.f.f19181a);
        this.f5317e = textView;
        textView.setId(q.d());
        setClickable(true);
    }

    public void g(int i10, boolean z10) {
        int i11 = this.f5322s;
        if (i10 < i11 || i10 > (i11 = this.f5323t)) {
            i10 = i11;
        }
        int i12 = this.f5320h;
        if (i10 == i12) {
            b bVar = this.f5319g;
            if (bVar != null) {
                bVar.B0(this, i10, z10);
                return;
            }
            return;
        }
        this.f5320h = i10;
        h();
        c cVar = this.f5318f;
        if (cVar != null) {
            cVar.f(this, i12, i10);
        }
        b bVar2 = this.f5319g;
        if (bVar2 != null) {
            bVar2.B0(this, i10, z10);
            this.f5319g.y0(this, i12, i10, z10);
        }
    }

    public int getMaxValue() {
        return this.f5323t;
    }

    public int getMinValue() {
        return this.f5322s;
    }

    public int getNumber() {
        return this.f5320h;
    }

    public CharSequence getRightText() {
        return this.f5325v;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setNumber(dVar.f5329a);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f5329a = this.f5320h;
        return dVar;
    }

    @Override // android.view.View
    public boolean performClick() {
        String[] strArr;
        if (super.performClick()) {
            return true;
        }
        String string = getTitle() != null ? getTitle().toString() : null;
        if (!this.f5327x && ((((strArr = this.f5326w) == null || strArr.length > 40) && (this.f5328y == null || this.f5323t - this.f5322s > 40)) || !TextUtils.isEmpty(this.f5325v) || !TextUtils.isEmpty(this.f5324u))) {
            a0 a0VarL4 = a0.l4(string, this.f5324u, this.f5325v, getNumber(), this.f5322s, this.f5323t, this.f5326w);
            a0VarL4.n4(this);
            a0VarL4.m4(null, getContext()).show();
            return true;
        }
        c.a aVar = new c.a(getContext());
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: u3.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                NumberPreferenceView.e(this.f28034a, dialogInterface, i10);
            }
        };
        String[] strArr2 = this.f5326w;
        if (strArr2 == null) {
            int i10 = (this.f5323t - this.f5322s) + 1;
            String[] strArr3 = new String[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                strArr3[i11] = f(this.f5322s + i11);
            }
            strArr2 = strArr3;
        }
        aVar.x(strArr2, getNumber() - this.f5322s, onClickListener);
        aVar.z(string).C();
        return true;
    }

    public void setDisplayedValues(String[] strArr) {
        this.f5326w = strArr;
        if (strArr != null) {
            setMaxValue(strArr.length - 1);
            setMinValue(0);
        }
        h();
    }

    public void setFormatter(a aVar) {
        this.f5328y = aVar;
        h();
    }

    public void setMaxValue(int i10) {
        this.f5323t = i10;
        if (this.f5320h > i10) {
            this.f5320h = i10;
        }
    }

    public void setMessage(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.f5324u = charSequence;
    }

    public void setMinValue(int i10) {
        this.f5322s = i10;
        if (this.f5320h < i10) {
            this.f5320h = i10;
        }
    }

    public void setNumber(int i10) {
        g(i10, false);
    }

    public void setOnNumberChangeListener(c cVar) {
        this.f5318f = cVar;
    }

    public void setRightText(CharSequence charSequence) {
        if (a6.q.d(charSequence, this.f5325v)) {
            return;
        }
        this.f5325v = charSequence;
        h();
    }

    public NumberPreferenceView(Context context, AttributeSet attributeSet, int i10) throws Exception {
        super(context, attributeSet, i10);
        c(context, attributeSet, i10, 0);
    }

    public void setOnNumberChangeListener(b bVar) {
        this.f5319g = bVar;
    }
}
