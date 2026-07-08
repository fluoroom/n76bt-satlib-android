package p0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import m0.u0;
import m0.v0;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f23842a = c.f23846b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f23843b = c.f23845a;

    public static final void a(View view) {
        m.e(view, "<this>");
        Iterator it = v0.a(view).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        m.e(viewGroup, "<this>");
        Iterator it = u0.a(viewGroup).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    private static final b c(View view) {
        int i10 = f23842a;
        b bVar = (b) view.getTag(i10);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i10, bVar2);
        return bVar2;
    }

    public static final void d(View view, boolean z10) {
        m.e(view, "<this>");
        view.setTag(f23843b, Boolean.valueOf(z10));
    }
}
