package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.collection.i;
import c0.n;
import i1.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    final i M;
    private final Handler N;
    private final List O;
    private boolean P;
    private int Q;
    private boolean R;
    private int S;
    private final Runnable T;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.M.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.M = new i();
        this.N = new Handler(Looper.getMainLooper());
        this.P = true;
        this.Q = 0;
        this.R = false;
        this.S = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.T = new a();
        this.O = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f15726v0, i10, i11);
        int i12 = g.f15730x0;
        this.P = n.b(typedArrayObtainStyledAttributes, i12, i12, true);
        int i13 = g.f15728w0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            N(n.d(typedArrayObtainStyledAttributes, i13, i13, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public Preference L(int i10) {
        return (Preference) this.O.get(i10);
    }

    public int M() {
        return this.O.size();
    }

    public void N(int i10) {
        if (i10 != Integer.MAX_VALUE && !s()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.S = i10;
    }

    @Override // androidx.preference.Preference
    public void x(boolean z10) {
        super.x(z10);
        int iM = M();
        for (int i10 = 0; i10 < iM; i10++) {
            L(i10).C(this, z10);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
