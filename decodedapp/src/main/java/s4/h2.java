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
import com.dw.multimon.MDecoder;

/* JADX INFO: loaded from: classes.dex */
public class h2 extends v3.m0 implements View.OnClickListener {
    private a F0 = null;
    private Button G0;
    private TextView H0;
    private PlotView I0;
    private com.dw.android.plot.b J0;
    private com.dw.android.plot.a K0;

    public class a extends m5.c implements q3.b, MDecoder.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f26498r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private short[] f26499s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final MDecoder f26500t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Runnable f26501u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final b6.d f26502v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private String f26503w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final StringBuilder f26504x;

        /* JADX INFO: renamed from: s4.h2$a$a, reason: collision with other inner class name */
        class RunnableC0365a implements Runnable {
            RunnableC0365a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h2.this.H0.setText(a.this.f26503w);
            }
        }

        public a() {
            super("DTMF Monitor Thread");
            this.f26501u = new RunnableC0365a();
            this.f26502v = new b6.d(640000);
            this.f26504x = new StringBuilder();
            MDecoder mDecoder = new MDecoder(32000, 2);
            this.f26500t = mDecoder;
            mDecoder.f(this);
        }

        @Override // com.dw.multimon.MDecoder.a
        public void a(int i10, byte[] bArr) {
            for (byte b10 : bArr) {
                this.f26504x.append((char) b10);
            }
            this.f26503w = this.f26504x.toString();
            h2.this.H0.post(this.f26501u);
        }

        @Override // q3.b
        public int c(float[] fArr, int i10, int i11) {
            int iL;
            if (this.f26499s == null) {
                return 0;
            }
            synchronized (this.f26502v) {
                try {
                    if (this.f26502v.c() > this.f26499s.length) {
                        b6.d dVar = this.f26502v;
                        dVar.a(dVar.c() - this.f26499s.length);
                    }
                    b6.d dVar2 = this.f26502v;
                    short[] sArr = this.f26499s;
                    iL = dVar2.l(sArr, 0, sArr.length);
                    this.f26502v.f(iL);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i12 = 0; i12 < iL; i12++) {
                fArr[i12] = this.f26499s[i12];
            }
            return iL;
        }

        @Override // q3.b
        public int d() {
            return this.f26498r;
        }

        @Override // q3.b
        public void g(int i10) {
            if (i10 > 640000) {
                i10 = 640000;
            }
            if (this.f26498r == i10) {
                return;
            }
            this.f26498r = i10;
            this.f26499s = new short[i10];
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
            this.f26500t.c(sArr, i10, i11);
            synchronized (this.f26502v) {
                try {
                    int iB = i11 - this.f26502v.b();
                    if (iB > 0) {
                        this.f26502v.a(iB);
                    }
                    this.f26502v.o(sArr, i10, i11);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void B4() {
        int iG = a6.k.g(k1(), 1.0f);
        com.dw.android.plot.c cVar = new com.dw.android.plot.c(this.I0, false);
        cVar.m(iG);
        this.I0.e(cVar);
        cVar.l(32000.0f);
        cVar.k(2.0f);
        cVar.j(-2013265920);
        this.K0 = cVar;
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
            this.J0.k(null);
            return;
        }
        a aVar2 = new a();
        this.F0 = aVar2;
        aVar2.start();
        this.G0.setText(R.string.stop_monitor);
        this.G0.setKeepScreenOn(true);
        this.J0.k(this.F0);
        a aVar3 = this.F0;
        aVar3.g(aVar3.t() * 2);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        z4(N1(R.string.dtmf_decode));
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_morse_code, viewGroup, false);
        PlotView plotView = (PlotView) viewInflate.findViewById(R.id.plot);
        this.I0 = plotView;
        plotView.setMaxValue(32767.0f);
        this.I0.setMinValue(1.0f);
        this.I0.m(0.0f, 32767.0f, 32000.0f, -32767.0f);
        B4();
        this.J0 = this.I0.i();
        this.I0.j(32767.0f);
        this.I0.j(-32768.0f);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text);
        this.H0 = textView;
        textView.setMovementMethod(new ScrollingMovementMethod());
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
