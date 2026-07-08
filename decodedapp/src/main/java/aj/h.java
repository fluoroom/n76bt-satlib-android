package aj;

import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f673d = new a() { // from class: aj.g
        @Override // aj.h.a
        public final void a(int i10) {
            h.a(i10);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f676c;

    public interface a {
        void a(int i10);
    }

    public h() {
        this(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public static /* synthetic */ void a(int i10) {
        throw new ui.f(ui.d.MAX_COUNT_EXCEEDED, Integer.valueOf(i10));
    }

    public void b() {
        int i10 = this.f676c;
        int i11 = this.f674a;
        if (i10 > i11 - 1) {
            this.f675b.a(i11);
        }
        this.f676c++;
    }

    public h c(int i10) {
        return new h(0, i10, this.f675b);
    }

    public h(int i10) {
        this(i10, f673d);
    }

    public h(int i10, a aVar) {
        this(0, i10, aVar);
    }

    private h(int i10, int i11, a aVar) {
        if (aVar == null) {
            throw new ui.h();
        }
        if (i11 >= 0) {
            this.f674a = i11;
            this.f675b = aVar;
            this.f676c = i10;
            return;
        }
        throw new ui.e(ui.d.NUMBER_TOO_SMALL, Integer.valueOf(i11), 0);
    }
}
