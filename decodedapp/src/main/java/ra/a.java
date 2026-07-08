package ra;

import android.animation.Animator;
import android.view.View;
import android.view.WindowManager;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f25653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WindowManager.LayoutParams f25654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WindowManager f25655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ta.a f25656d;

    public a(View view, WindowManager.LayoutParams layoutParams, WindowManager windowManager, ta.a aVar) {
        m.e(view, "view");
        m.e(layoutParams, "params");
        m.e(windowManager, "windowManager");
        m.e(aVar, "config");
        this.f25653a = view;
        this.f25654b = layoutParams;
        this.f25655c = windowManager;
        this.f25656d = aVar;
    }

    public final Animator a() {
        va.c cVarG = this.f25656d.g();
        if (cVarG != null) {
            return cVarG.b(this.f25653a, this.f25654b, this.f25655c, this.f25656d.y());
        }
        return null;
    }

    public final Animator b() {
        va.c cVarG = this.f25656d.g();
        if (cVarG != null) {
            return cVarG.a(this.f25653a, this.f25654b, this.f25655c, this.f25656d.y());
        }
        return null;
    }
}
