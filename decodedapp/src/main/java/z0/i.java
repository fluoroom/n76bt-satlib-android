package z0;

import android.view.ViewGroup;
import androidx.fragment.app.o;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f32856b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, ViewGroup viewGroup) {
        super(oVar, "Attempting to add fragment " + oVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        m.e(oVar, "fragment");
        m.e(viewGroup, "container");
        this.f32856b = viewGroup;
    }
}
