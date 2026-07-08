package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import c0.n;
import i1.c;
import i1.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    private CharSequence M;
    private CharSequence N;
    private Drawable O;
    private CharSequence P;
    private CharSequence Q;
    private int R;

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f15699i, i10, i11);
        String strO = n.o(typedArrayObtainStyledAttributes, g.f15719s, g.f15701j);
        this.M = strO;
        if (strO == null) {
            this.M = r();
        }
        this.N = n.o(typedArrayObtainStyledAttributes, g.f15717r, g.f15703k);
        this.O = n.c(typedArrayObtainStyledAttributes, g.f15713p, g.f15705l);
        this.P = n.o(typedArrayObtainStyledAttributes, g.f15723u, g.f15707m);
        this.Q = n.o(typedArrayObtainStyledAttributes, g.f15721t, g.f15709n);
        this.R = n.n(typedArrayObtainStyledAttributes, g.f15715q, g.f15711o, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void y() {
        m();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.a(context, c.f15666b, R.attr.dialogPreferenceStyle));
    }
}
