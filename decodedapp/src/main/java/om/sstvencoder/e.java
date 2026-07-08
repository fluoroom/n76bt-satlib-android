package om.sstvencoder;

import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProgressBar f23813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f23814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f23815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23819g;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f23820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23821b;

        a(int i10, String str) {
            this.f23820a = i10;
            this.f23821b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f23813a.setMax(this.f23820a);
            e.this.f23813a.setProgress(0);
            e.this.f23813a.setVisibility(0);
            if (this.f23821b != null) {
                e.this.f23814b.setText(this.f23821b);
                e.this.f23814b.setVisibility(0);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f23823a;

        b(int i10) {
            this.f23823a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f23813a.setProgress(this.f23823a);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f23813a.setVisibility(8);
            e.this.f23814b.setVisibility(8);
        }
    }

    e(ProgressBar progressBar, TextView textView) {
        this.f23813a = progressBar;
        progressBar.setVisibility(8);
        this.f23814b = textView;
        textView.setVisibility(8);
        this.f23815c = new Handler();
        this.f23816d = 30;
    }

    private void e() {
        this.f23815c.post(new c());
    }

    private void f(int i10, String str) {
        this.f23815c.post(new a(i10, str));
    }

    private void h(int i10) {
        this.f23815c.post(new b(i10));
    }

    void c(int i10, String str) {
        this.f23817e = 0;
        this.f23818f = 0;
        this.f23819g = i10;
        f(this.f23816d, str);
    }

    void d() {
        e();
    }

    void g() {
        int i10 = this.f23818f + 1;
        this.f23818f = i10;
        int i11 = this.f23816d * i10;
        int i12 = this.f23819g;
        int i13 = (i11 + (i12 / 2)) / i12;
        if (i13 != this.f23817e) {
            h(i13);
            this.f23817e = i13;
        }
    }
}
