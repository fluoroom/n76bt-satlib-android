package com.dw.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class NumberPicker$CustomEditText extends EditText {
    public NumberPicker$CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView
    public void onEditorAction(int i10) {
        super.onEditorAction(i10);
        if (i10 == 6) {
            clearFocus();
        }
    }
}
