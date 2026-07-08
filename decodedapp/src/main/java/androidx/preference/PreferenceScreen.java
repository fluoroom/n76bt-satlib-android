package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import c0.n;
import i1.c;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    private boolean U;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, n.a(context, c.f15670f, R.attr.preferenceScreenStyle));
        this.U = true;
    }

    @Override // androidx.preference.Preference
    protected void y() {
        if (h() == null && g() == null && M() != 0) {
            m();
            throw null;
        }
    }
}
