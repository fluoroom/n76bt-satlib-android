package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import c0.n;
import i1.c;
import i1.f;
import i1.g;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    private String S;

    public static final class a implements Preference.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f2757a;

        private a() {
        }

        public static a b() {
            if (f2757a == null) {
                f2757a = new a();
            }
            return f2757a;
        }

        @Override // androidx.preference.Preference.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.L()) ? editTextPreference.e().getString(f.f15677a) : editTextPreference.L();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f15725v, i10, i11);
        int i12 = g.f15727w;
        if (n.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            I(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected Object B(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    @Override // androidx.preference.Preference
    public boolean J() {
        return TextUtils.isEmpty(this.S) || super.J();
    }

    public String L() {
        return this.S;
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.a(context, c.f15668d, R.attr.editTextPreferenceStyle));
    }
}
