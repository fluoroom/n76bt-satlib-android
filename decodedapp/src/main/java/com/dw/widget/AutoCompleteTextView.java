package com.dw.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class AutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f6906a;

    public interface a {
        boolean a(AutoCompleteTextView autoCompleteTextView);
    }

    public AutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean a() {
        a aVar = this.f6906a;
        if (aVar == null || !aVar.a(this)) {
            return false;
        }
        dismissDropDown();
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if ((i10 == 23 || i10 == 66) && a()) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public void setOnCompletedListener(a aVar) {
        this.f6906a = aVar;
    }
}
