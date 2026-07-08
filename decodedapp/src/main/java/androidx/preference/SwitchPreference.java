package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import c0.n;
import i1.c;
import i1.g;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final a R;
    private CharSequence S;
    private CharSequence T;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreference.this.a(Boolean.valueOf(z10))) {
                SwitchPreference.this.M(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.R = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.J0, i10, i11);
        P(n.o(typedArrayObtainStyledAttributes, g.R0, g.K0));
        O(n.o(typedArrayObtainStyledAttributes, g.Q0, g.L0));
        S(n.o(typedArrayObtainStyledAttributes, g.T0, g.N0));
        R(n.o(typedArrayObtainStyledAttributes, g.S0, g.O0));
        N(n.b(typedArrayObtainStyledAttributes, g.P0, g.M0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void T(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.M);
        }
        if (z10) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.S);
            r42.setTextOff(this.T);
            r42.setOnCheckedChangeListener(this.R);
        }
    }

    private void U(View view) {
        if (((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            T(view.findViewById(R.id.switch_widget));
            Q(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    protected void E(View view) {
        super.E(view);
        U(view);
    }

    public void R(CharSequence charSequence) {
        this.T = charSequence;
        w();
    }

    public void S(CharSequence charSequence) {
        this.S = charSequence;
        w();
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.a(context, c.f15674j, R.attr.switchPreferenceStyle));
    }
}
