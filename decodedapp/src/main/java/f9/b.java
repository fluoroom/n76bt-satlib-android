package f9;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f12893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12894b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12895c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f12893a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.f12893a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f12893a);
        }
    }

    public int b() {
        return this.f12895c;
    }

    public boolean c() {
        return this.f12894b;
    }

    public void d(Bundle bundle) {
        this.f12894b = bundle.getBoolean("expanded", false);
        this.f12895c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f12894b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f12894b);
        bundle.putInt("expandedComponentIdHint", this.f12895c);
        return bundle;
    }

    public void f(int i10) {
        this.f12895c = i10;
    }
}
