package s4;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.c;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.activitys.UpdateActivity;
import com.dw.ht.fragments.DeviceFragment;
import e5.a;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public class f1 extends DeviceFragment implements View.OnClickListener {
    private final Thread P0;
    private TextView Q0;
    private int R0;
    private n0.c S0;
    private View T0;
    private ProgressBar U0;
    private View V0;
    private a.d W0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f26422c;

        static {
            int[] iArr = new int[a.d.values().length];
            f26422c = iArr;
            try {
                iArr[a.d.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26422c[a.d.DeviceConnection.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26422c[a.d.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26422c[a.d.Server.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[v4.v.values().length];
            f26421b = iArr2;
            try {
                iArr2[v4.v.READ_FREQ_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[n0.c.values().length];
            f26420a = iArr3;
            try {
                iArr3[n0.c.Connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26420a[n0.c.Connecting.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26420a[n0.c.ConnectionFailed.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26420a[n0.c.Interrupted.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public f1() {
        i5(0);
        this.P0 = Thread.currentThread();
    }

    public static /* synthetic */ void n5(f1 f1Var, DialogInterface dialogInterface, int i10) {
        f1Var.getClass();
        Intent intent = new Intent(f1Var.k1(), (Class<?>) UpdateActivity.class);
        intent.putExtra("EXTRA_BLUETOOTH_DEVICE_ADDRESS", f1Var.U4());
        f1Var.O3(intent);
        f1Var.e1().finish();
    }

    public static /* synthetic */ void o5(f1 f1Var, CharSequence charSequence) {
        f1Var.Q0.setText(charSequence);
        f1Var.w5();
    }

    private boolean q5(boolean z10) {
        v4.c0 c0VarW4 = W4();
        if (c0VarW4 == null || z10) {
            return false;
        }
        v4.n nVar = c0VarW4.Q;
        if (nVar.m().i(nVar.k())) {
            return false;
        }
        new c.a(k1()).d(false).j(R.string.remind_update).t(android.R.string.yes, new DialogInterface.OnClickListener() { // from class: s4.c1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                f1.n5(this.f26387a, dialogInterface, i10);
            }
        }).m(android.R.string.no, new DialogInterface.OnClickListener() { // from class: s4.d1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f26399a.e1().finish();
            }
        }).C();
        return true;
    }

    private void r5(v4.n0 n0Var) {
        n0Var.a(v4.v.READ_FREQ_RANGE, new byte[0]);
        s5(a.d.None, N1(R.string.actionGetDeviceConfigurationInformation));
    }

    private void s5(a.d dVar, CharSequence charSequence) {
        this.W0 = dVar;
        int i10 = a.f26422c[dVar.ordinal()];
        if (i10 == 1) {
            v5(charSequence);
            return;
        }
        if (i10 == 2) {
            v4.c0 c0VarW4 = W4();
            if (c0VarW4.m2()) {
                charSequence = O1(R.string.devIsUnauthorized, v4.m0.j(c0VarW4.q()));
            }
        } else if (i10 == 3 && charSequence == null) {
            charSequence = N1(R.string.unknownError);
        }
        v5(charSequence);
    }

    private void t5(a.d dVar, String str) {
        if (str != null) {
            str = this.Q0.getContext().getString(R.string.errorMessage, str);
        }
        s5(dVar, str);
    }

    private void u5() {
        v4.c0 c0VarW4 = W4();
        if (c0VarW4 == null) {
            return;
        }
        if (c0VarW4.n()) {
            c0VarW4.h(true);
        }
        c0VarW4.y();
        c0VarW4.v(true);
    }

    private void v5(final CharSequence charSequence) {
        if (Thread.currentThread() != this.P0) {
            this.Q0.post(new Runnable() { // from class: s4.e1
                @Override // java.lang.Runnable
                public final void run() {
                    f1.o5(this.f26409a, charSequence);
                }
            });
        } else {
            this.Q0.setText(charSequence);
            w5();
        }
    }

    private void w5() {
        if (a.f26422c[this.W0.ordinal()] == 1) {
            this.U0.setVisibility(0);
            this.V0.setEnabled(false);
            return;
        }
        this.U0.setVisibility(4);
        if (this.T0.getVisibility() != 0) {
            this.T0.setVisibility(0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.T0, "translationY", a6.y.c(r0.getContext(), R.attr.actionBarSize), 0.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.start();
        }
        this.V0.setEnabled(true);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(v4.n0 n0Var, g3.d dVar) {
        if (!DeviceFragment.a5(dVar)) {
            if (a.f26421b[v4.v.d(dVar.e()).ordinal()] != 1) {
                return;
            }
            t5(a.d.DeviceConnection, N1(R.string.actionGetDeviceConfigurationInformation));
            return;
        }
        if (a.f26421b[v4.v.d(dVar.e()).ordinal()] != 1) {
            return;
        }
        try {
            new a6.v(dVar.i(), 8);
            if ((dVar.i().length - 1) / 4 == 0) {
                throw new Exception("未提供频率范围");
            }
            if (n0Var instanceof v4.o) {
                v4.o oVar = (v4.o) n0Var;
                Cfg.d(oVar.a3().getAddress());
                v4.u.w().G(oVar);
                if (q5(false)) {
                    return;
                }
                e1().finish();
            }
        } catch (Exception unused) {
            t5(a.d.DeviceConnection, String.valueOf(dVar.e()));
            q5(false);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        v4.n0 n0VarX4 = X4();
        if (n0VarX4 != null) {
            W0(n0VarX4);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void W0(v4.n0 n0Var) {
        super.W0(n0Var);
        if ((n0Var instanceof v4.c0) && a2()) {
            v4.c0 c0Var = (v4.c0) n0Var;
            z4(c0Var.getName());
            n0.c cVarL = n0Var.l();
            if (this.S0 == cVarL) {
                return;
            }
            this.S0 = cVarL;
            v4.n nVar = c0Var.Q;
            int i10 = a.f26420a[cVarL.ordinal()];
            if (i10 == 1) {
                if (!nVar.s()) {
                    s5(a.d.None, "不支持此设备");
                    n0Var.h(true);
                    return;
                } else {
                    if (q5(true)) {
                        return;
                    }
                    r5(n0Var);
                    return;
                }
            }
            if (i10 == 2) {
                s5(a.d.None, N1(R.string.connecting));
                return;
            }
            if (i10 == 3 || i10 == 4) {
                int i11 = this.R0 + 1;
                this.R0 = i11;
                if (i11 < 1) {
                    c0Var.v(true);
                }
            }
            int i12 = this.R0;
            if (i12 == 0) {
                s5(a.d.None, N1(R.string.connecting));
            } else if (i12 < 1) {
                s5(a.d.None, Html.fromHtml(O1(R.string.promptConnectionFailed, c0Var.getName())));
            } else {
                s5(a.d.DeviceConnection, Html.fromHtml(O1(R.string.promptConnectionFailed, c0Var.getName())));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.cancel) {
            e1().finish();
            return;
        }
        if (id2 != R.id.retry) {
            return;
        }
        int i10 = a.f26422c[this.W0.ordinal()];
        if (i10 == 2 || i10 == 3) {
            this.R0 = 0;
            u5();
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_bind, viewGroup, false);
        this.Q0 = (TextView) viewInflate.findViewById(R.id.message);
        this.U0 = (ProgressBar) viewInflate.findViewById(R.id.progressBar);
        View viewFindViewById = viewInflate.findViewById(R.id.buttonPanel);
        this.T0 = viewFindViewById;
        viewFindViewById.findViewById(R.id.cancel).setOnClickListener(this);
        View viewFindViewById2 = this.T0.findViewById(R.id.retry);
        this.V0 = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        u5();
        return viewInflate;
    }
}
