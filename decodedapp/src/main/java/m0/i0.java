package m0;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f20798a;

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f20799a;

        a(View view) {
            this.f20799a = view;
        }

        @Override // m0.i0.c
        void a() {
            final View viewFindViewById = this.f20799a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f20799a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: m0.h0
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    private static class c {
        c() {
        }

        abstract void a();
    }

    public i0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f20798a = new b(view);
        } else {
            this.f20798a = new a(view);
        }
    }

    public void a() {
        this.f20798a.a();
    }

    private static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View f20800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsetsController f20801c;

        b(View view) {
            super(view);
            this.f20800b = view;
        }

        @Override // m0.i0.a, m0.i0.c
        void a() {
            View view = this.f20800b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f20801c;
            if (windowInsetsController == null) {
                View view2 = this.f20800b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.a();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f20801c = windowInsetsController;
        }
    }

    i0(WindowInsetsController windowInsetsController) {
        this.f20798a = new b(windowInsetsController);
    }
}
