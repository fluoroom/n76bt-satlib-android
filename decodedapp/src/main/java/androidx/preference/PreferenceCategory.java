package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import c0.n;
import i1.c;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    public boolean J() {
        return !super.u();
    }

    @Override // androidx.preference.Preference
    public boolean u() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.a(context, c.f15669e, R.attr.preferenceCategoryStyle));
    }
}
