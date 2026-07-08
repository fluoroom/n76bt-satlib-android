package com.dw.ht.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.benshikj.ht.R;
import com.dw.android.widget.c;

/* JADX INFO: loaded from: classes.dex */
public class DTMFKeyboard extends c implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f6880b;

    public interface a {
        void C(DTMFKeyboard dTMFKeyboard, int i10);

        void F(DTMFKeyboard dTMFKeyboard, char c10);

        void M0(DTMFKeyboard dTMFKeyboard, char c10);

        void Z(DTMFKeyboard dTMFKeyboard, int i10);
    }

    public DTMFKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(attributeSet, 0);
    }

    private void d(AttributeSet attributeSet, int i10) {
        View.inflate(getContext(), R.layout.dtmf_keyboard, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.keyboard);
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            childAt.setOnClickListener(this);
            childAt.setOnLongClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f6880b == null) {
            return;
        }
        if (view instanceof Button) {
            CharSequence text = ((Button) view).getText();
            if (text.length() == 1) {
                char cCharAt = text.charAt(0);
                if (Character.isDigit(cCharAt) || cCharAt == '*' || cCharAt == '#') {
                    this.f6880b.F(this, cCharAt);
                    return;
                }
            }
        }
        this.f6880b.C(this, view.getId());
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (this.f6880b == null) {
            return true;
        }
        if (view instanceof Button) {
            CharSequence text = ((Button) view).getText();
            if (text.length() == 1) {
                char cCharAt = text.charAt(0);
                if (Character.isDigit(cCharAt) || cCharAt == '*' || cCharAt == '#') {
                    this.f6880b.M0(this, cCharAt);
                    return true;
                }
            }
        }
        this.f6880b.Z(this, view.getId());
        return true;
    }

    public void setOnButtonClickListener(a aVar) {
        this.f6880b = aVar;
    }
}
