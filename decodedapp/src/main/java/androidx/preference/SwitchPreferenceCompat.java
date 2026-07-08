package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import c0.n;
import i1.c;
import i1.d;
import i1.g;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final a R;
    private CharSequence S;
    private CharSequence T;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreferenceCompat.this.a(Boolean.valueOf(z10))) {
                SwitchPreferenceCompat.this.M(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.R = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.U0, i10, i11);
        P(n.o(typedArrayObtainStyledAttributes, g.f15686c1, g.V0));
        O(n.o(typedArrayObtainStyledAttributes, g.f15683b1, g.W0));
        S(n.o(typedArrayObtainStyledAttributes, g.f15692e1, g.Y0));
        R(n.o(typedArrayObtainStyledAttributes, g.f15689d1, g.Z0));
        N(n.b(typedArrayObtainStyledAttributes, g.f15680a1, g.X0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void T(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.M);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.S);
            switchCompat.setTextOff(this.T);
            switchCompat.setOnCheckedChangeListener(this.R);
        }
    }

    private void U(View view) {
        if (((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            T(view.findViewById(d.f15675a));
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

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f15673i);
    }
}
