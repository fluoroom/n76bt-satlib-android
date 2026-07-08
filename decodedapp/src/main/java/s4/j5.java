package s4;

import android.content.Context;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.benshikj.ht.R;
import com.dw.android.plot.PlotView;

/* JADX INFO: loaded from: classes.dex */
public class j5 extends v3.m0 implements View.OnClickListener {
    private a F0 = null;
    private Button G0;
    private TextView H0;
    private TextView I0;
    private PlotView J0;
    private com.dw.android.plot.b K0;
    private com.dw.android.plot.a L0;

    public class a extends m5.c implements q3.b {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f26537r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private short[] f26538s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final a4.b f26539t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f26540u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Runnable f26541v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final b6.d f26542w;

        /* JADX INFO: renamed from: s4.j5$a$a, reason: collision with other inner class name */
        class RunnableC0366a implements Runnable {
            RunnableC0366a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j5.this.H0.setText(a.this.f26539t.getText());
                j5.this.I0.setText("wpm:" + a.this.f26539t.e());
            }
        }

        public a() {
            super("Morse Code Monitor Thread");
            this.f26541v = new RunnableC0366a();
            this.f26542w = new b6.d(640000);
            this.f26539t = new a4.b(32000);
        }

        @Override // q3.b
        public int c(float[] fArr, int i10, int i11) {
            int iL;
            if (this.f26538s == null) {
                return 0;
            }
            synchronized (this.f26542w) {
                try {
                    if (this.f26542w.c() > this.f26538s.length) {
                        b6.d dVar = this.f26542w;
                        dVar.a(dVar.c() - this.f26538s.length);
                    }
                    b6.d dVar2 = this.f26542w;
                    short[] sArr = this.f26538s;
                    iL = dVar2.l(sArr, 0, sArr.length);
                    this.f26542w.f(iL);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i12 = 0; i12 < iL; i12++) {
                fArr[i12] = this.f26538s[i12];
            }
            return iL;
        }

        @Override // q3.b
        public int d() {
            return this.f26537r;
        }

        @Override // q3.b
        public void g(int i10) {
            if (i10 > 640000) {
                i10 = 640000;
            }
            if (this.f26537r == i10) {
                return;
            }
            this.f26537r = i10;
            this.f26538s = new short[i10];
        }

        @Override // q3.b
        public int length() {
            return -1;
        }

        @Override // q3.b
        public boolean q() {
            return true;
        }

        @Override // q3.b
        public boolean s(int i10) {
            return false;
        }

        @Override // m5.c
        public int t() {
            return 32000;
        }

        @Override // m5.c
        protected void v(short[] sArr, int i10, int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("size < 0");
            }
            this.f26539t.i(sArr, i10, i11);
            int iD = this.f26539t.d();
            if (this.f26540u != iD) {
                this.f26540u = iD;
                j5.this.H0.post(this.f26541v);
            }
            synchronized (this.f26542w) {
                try {
                    int iB = i11 - this.f26542w.b();
                    if (iB > 0) {
                        this.f26542w.a(iB);
                    }
                    this.f26542w.o(sArr, i10, i11);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void C4() {
        int iG = a6.k.g(k1(), 1.0f);
        com.dw.android.plot.c cVar = new com.dw.android.plot.c(this.J0, false);
        cVar.m(iG);
        this.J0.e(cVar);
        cVar.l(32000.0f);
        cVar.k(2.0f);
        cVar.j(-2013265920);
        this.L0 = cVar;
    }

    @Override // androidx.fragment.app.o
    public void o2(Context context) {
        super.o2(context);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
        a aVar = this.F0;
        if (aVar != null) {
            aVar.cancel();
            this.F0 = null;
            this.G0.setText(R.string.start_monitor);
            this.G0.setKeepScreenOn(false);
            this.K0.k(null);
            return;
        }
        a aVar2 = new a();
        this.F0 = aVar2;
        aVar2.start();
        this.G0.setText(R.string.stop_monitor);
        this.G0.setKeepScreenOn(true);
        this.K0.k(this.F0);
        a aVar3 = this.F0;
        aVar3.g(aVar3.t() * 2);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        z4(N1(R.string.morseCode));
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_morse_code, viewGroup, false);
        PlotView plotView = (PlotView) viewInflate.findViewById(R.id.plot);
        this.J0 = plotView;
        plotView.setMaxValue(32767.0f);
        this.J0.setMinValue(1.0f);
        this.J0.m(0.0f, 32767.0f, 32000.0f, -32767.0f);
        C4();
        this.K0 = this.J0.i();
        for (short s10 = Short.MAX_VALUE; s10 > 0; s10 = (short) (s10 / 2)) {
            this.J0.j(s10);
            this.J0.j(-s10);
        }
        this.J0.k(0.0f, -65536);
        this.J0.k(a4.b.f280u * 32767.0f, -65536);
        this.J0.k((-a4.b.f280u) * 32767.0f, -65536);
        this.J0.k(16.0f, -16711936);
        this.J0.k(-16.0f, -267387136);
        this.H0 = (TextView) viewInflate.findViewById(R.id.text);
        this.I0 = (TextView) viewInflate.findViewById(R.id.pwm);
        this.H0.setMovementMethod(new ScrollingMovementMethod());
        Button button = (Button) viewInflate.findViewById(R.id.start);
        this.G0 = button;
        button.setOnClickListener(this);
        return viewInflate;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        a aVar = this.F0;
        if (aVar != null) {
            aVar.cancel();
            this.F0 = null;
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void z2() {
        super.z2();
    }
}
