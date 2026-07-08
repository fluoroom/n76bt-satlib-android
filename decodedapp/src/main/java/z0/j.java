package z0;

import androidx.fragment.app.o;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f32857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, o oVar2, int i10) {
        super(oVar, "Attempting to nest fragment " + oVar + " within the view of parent fragment " + oVar2 + " via container with ID " + i10 + " without using parent's childFragmentManager");
        m.e(oVar, "fragment");
        m.e(oVar2, "expectedParentFragment");
        this.f32857b = oVar2;
        this.f32858c = i10;
    }
}
