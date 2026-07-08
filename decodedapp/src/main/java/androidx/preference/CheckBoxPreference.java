package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import c0.n;
import i1.c;
import i1.g;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final a R;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (CheckBoxPreference.this.a(Boolean.valueOf(z10))) {
                CheckBoxPreference.this.M(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void R(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.M);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.R);
        }
    }

    private void S(View view) {
        if (((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            R(view.findViewById(R.id.checkbox));
            Q(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    protected void E(View view) {
        super.E(view);
        S(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.R = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f15681b, i10, i11);
        P(n.o(typedArrayObtainStyledAttributes, g.f15697h, g.f15684c));
        O(n.o(typedArrayObtainStyledAttributes, g.f15695g, g.f15687d));
        N(n.b(typedArrayObtainStyledAttributes, g.f15693f, g.f15690e, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.a(context, c.f15665a, R.attr.checkBoxPreferenceStyle));
    }
}
