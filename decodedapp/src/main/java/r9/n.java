package r9;

import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f25640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f25642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25643d;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
    }

    private n(a aVar) {
        this(aVar, false, c.e(), ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public static n a(char c10) {
        return b(c.c(c10));
    }

    public static n b(final c cVar) {
        l.n(cVar);
        return new n(new a() { // from class: r9.m
        });
    }

    public n c() {
        return d(c.g());
    }

    public n d(c cVar) {
        l.n(cVar);
        return new n(this.f25642c, this.f25641b, cVar, this.f25643d);
    }

    private n(a aVar, boolean z10, c cVar, int i10) {
        this.f25642c = aVar;
        this.f25641b = z10;
        this.f25640a = cVar;
        this.f25643d = i10;
    }
}
