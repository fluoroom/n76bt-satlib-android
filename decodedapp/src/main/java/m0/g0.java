package m0;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f20785a;

    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScrollFeedbackProvider f20786a;

        b(View view) {
            this.f20786a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // m0.g0.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
            this.f20786a.onScrollLimit(i10, i11, i12, z10);
        }

        @Override // m0.g0.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
            this.f20786a.onScrollProgress(i10, i11, i12, i13);
        }
    }

    private interface d {
        void onScrollLimit(int i10, int i11, int i12, boolean z10);

        void onScrollProgress(int i10, int i11, int i12, int i13);
    }

    private g0(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f20785a = new b(view);
        } else {
            this.f20785a = new c();
        }
    }

    public static g0 a(View view) {
        return new g0(view);
    }

    public void b(int i10, int i11, int i12, boolean z10) {
        this.f20785a.onScrollLimit(i10, i11, i12, z10);
    }

    public void c(int i10, int i11, int i12, int i13) {
        this.f20785a.onScrollProgress(i10, i11, i12, i13);
    }

    private static class c implements d {
        private c() {
        }

        @Override // m0.g0.d
        public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        }

        @Override // m0.g0.d
        public void onScrollProgress(int i10, int i11, int i12, int i13) {
        }
    }
}
