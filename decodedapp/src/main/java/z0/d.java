package z0;

import android.view.ViewGroup;
import androidx.fragment.app.o;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f32853b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o oVar, ViewGroup viewGroup) {
        super(oVar, "Attempting to use <fragment> tag to add fragment " + oVar + " to container " + viewGroup);
        m.e(oVar, "fragment");
        this.f32853b = viewGroup;
    }
}
