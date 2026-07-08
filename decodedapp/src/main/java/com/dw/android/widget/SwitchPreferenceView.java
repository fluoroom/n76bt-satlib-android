package com.dw.android.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import c6.q;
import k3.g;
import u3.t;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceView extends TowLineTextView {

    /* JADX INFO: renamed from: e */
    private SwitchCompat f5381e;

    static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0081a();

        /* JADX INFO: renamed from: a */
        boolean f5382a;

        /* JADX INFO: renamed from: com.dw.android.widget.SwitchPreferenceView$a$a */
        class C0081a implements Parcelable.Creator {
            C0081a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* synthetic */ a(Parcel parcel, t tVar) {
            this(parcel);
        }

        public String toString() {
            return "CheckablePreferenceView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " checked=" + this.f5382a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f5382a));
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        private a(Parcel parcel) {
            super(parcel);
            this.f5382a = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public SwitchPreferenceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet, 0, 0);
    }

    private void c(Context context, AttributeSet attributeSet, int i10, int i11) {
    }

    @Override // com.dw.android.widget.TowLineTextView
    protected void d(Context context) {
        View.inflate(context, g.f19222p, this);
        setOrientation(0);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(k3.f.f19182b);
        this.f5381e = switchCompat;
        switchCompat.setId(q.d());
        setClickable(true);
    }

    public boolean isChecked() {
        return this.f5381e.isChecked();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setChecked(aVar.f5382a);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f5382a = isChecked();
        return aVar;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        this.f5381e.toggle();
        return true;
    }

    public void setChecked(boolean z10) {
        this.f5381e.setChecked(z10);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5381e.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
