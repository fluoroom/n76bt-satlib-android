package androidx.transition;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static j a(ViewGroup viewGroup) {
        android.support.v4.media.session.b.a(viewGroup.getTag(h.f3388c));
        return null;
    }

    static void b(ViewGroup viewGroup, j jVar) {
        viewGroup.setTag(h.f3388c, jVar);
    }
}
