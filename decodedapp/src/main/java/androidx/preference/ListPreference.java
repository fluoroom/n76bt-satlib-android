package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import c0.n;
import i1.c;
import i1.f;
import i1.g;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private CharSequence[] S;
    private CharSequence[] T;
    private String U;
    private String V;
    private boolean W;

    public static final class a implements Preference.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f2758a;

        private a() {
        }

        public static a b() {
            if (f2758a == null) {
                f2758a = new a();
            }
            return f2758a;
        }

        @Override // androidx.preference.Preference.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.N()) ? listPreference.e().getString(f.f15677a) : listPreference.N();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f15729x, i10, i11);
        this.S = n.q(typedArrayObtainStyledAttributes, g.A, g.f15731y);
        this.T = n.q(typedArrayObtainStyledAttributes, g.B, g.f15733z);
        int i12 = g.C;
        if (n.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            I(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.I, i10, i11);
        this.V = n.o(typedArrayObtainStyledAttributes2, g.f15716q0, g.Q);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private int Q() {
        return L(this.U);
    }

    @Override // androidx.preference.Preference
    protected Object B(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public int L(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.T) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.T[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] M() {
        return this.S;
    }

    public CharSequence N() {
        CharSequence[] charSequenceArr;
        int iQ = Q();
        if (iQ < 0 || (charSequenceArr = this.S) == null) {
            return null;
        }
        return charSequenceArr[iQ];
    }

    public CharSequence[] O() {
        return this.T;
    }

    public String P() {
        return this.U;
    }

    public void R(String str) {
        boolean zEquals = TextUtils.equals(this.U, str);
        if (zEquals && this.W) {
            return;
        }
        this.U = str;
        this.W = true;
        H(str);
        if (zEquals) {
            return;
        }
        w();
    }

    @Override // androidx.preference.Preference
    public CharSequence n() {
        if (q() != null) {
            return q().a(this);
        }
        CharSequence charSequenceN = N();
        CharSequence charSequenceN2 = super.n();
        String str = this.V;
        if (str != null) {
            if (charSequenceN == null) {
                charSequenceN = "";
            }
            String str2 = String.format(str, charSequenceN);
            if (!TextUtils.equals(str2, charSequenceN2)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceN2;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.a(context, c.f15666b, R.attr.dialogPreferenceStyle));
    }
}
