package com.google.android.material.theme;

import a9.c;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.v;
import i9.a;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends r {
    @Override // androidx.appcompat.app.r
    protected AppCompatAutoCompleteTextView c(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected AppCompatButton d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.r
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new p9.a(context, attributeSet);
    }
}
