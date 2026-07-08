package com.dw.ht.activitys;

import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.ViewGroup;
import androidx.appcompat.app.c;
import androidx.fragment.app.d0;
import com.benshikj.ht.R;
import com.dw.ht.activitys.b;
import g3.a;
import g3.b;
import g3.c;
import java.lang.ref.WeakReference;
import o5.k;
import s4.f9;
import v4.c0;
import v4.m2;

/* JADX INFO: loaded from: classes.dex */
public class UpdateActivity extends com.dw.ht.activitys.d implements f9.i, b.a {

    /* JADX INFO: renamed from: u0 */
    private static final Handler f5604u0 = new Handler();

    /* JADX INFO: renamed from: v0 */
    private static com.dw.ht.activitys.b f5605v0;

    /* JADX INFO: renamed from: p0 */
    private f9 f5606p0;

    /* JADX INFO: renamed from: q0 */
    private androidx.appcompat.app.c f5607q0;

    /* JADX INFO: renamed from: r0 */
    private androidx.appcompat.app.c f5608r0;

    /* JADX INFO: renamed from: s0 */
    private boolean f5609s0 = false;

    /* JADX INFO: renamed from: t0 */
    private BluetoothDevice f5610t0;

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
            UpdateActivity.this.j2();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
            UpdateActivity.this.finish();
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5613a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f5614b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f5615c;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f5616d;

        static {
            int[] iArr = new int[c.EnumC0195c.values().length];
            f5616d = iArr;
            try {
                iArr[c.EnumC0195c.PACKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5616d[c.EnumC0195c.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5616d[c.EnumC0195c.DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5616d[c.EnumC0195c.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[a.b.values().length];
            f5615c = iArr2;
            try {
                iArr2[a.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5615c[a.b.NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5615c[a.b.AUTHENTICATING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5615c[a.b.INCORRECT_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5615c[a.b.INSUFFICIENT_RESOURCES.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5615c[a.b.INVALID_PARAMETER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5615c[a.b.NOT_AUTHENTICATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr3 = new int[a.EnumC0194a.values().length];
            f5614b = iArr3;
            try {
                iArr3[a.EnumC0194a.VMU_PACKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr4 = new int[b.a.values().length];
            f5613a = iArr4;
            try {
                iArr4[b.a.CONNECTION_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5613a[b.a.ILLEGAL_ARGUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5613a[b.a.SENDING_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5613a[b.a.RECEIVING_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    private static class d extends Handler {

        /* JADX INFO: renamed from: a */
        final WeakReference f5617a;

        public d(UpdateActivity updateActivity) {
            this.f5617a = new WeakReference(updateActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            UpdateActivity updateActivity = (UpdateActivity) this.f5617a.get();
            int i10 = c.f5616d[c.EnumC0195c.d(message.what).ordinal()];
            if (i10 == 1) {
                updateActivity.o2(message);
                return;
            }
            if (i10 == 2) {
                if (com.dw.ht.activitys.d.f5623o0) {
                    Log.i("UpdateActivity", "Handle a message from Gaia: CONNECTED");
                }
                updateActivity.p2();
                return;
            }
            if (i10 == 3) {
                if (com.dw.ht.activitys.d.f5623o0) {
                    Log.i("UpdateActivity", "Handle a message from Gaia: DISCONNECTED");
                }
                updateActivity.q2();
                return;
            }
            if (i10 == 4) {
                if (com.dw.ht.activitys.d.f5623o0) {
                    Log.i("UpdateActivity", "Handle a message from Gaia: ERROR");
                }
                updateActivity.m2((g3.b) message.obj);
                return;
            }
            if (com.dw.ht.activitys.d.f5623o0) {
                Log.d("UpdateActivity", "Handle a message from Gaia: OTHER MESSAGE: " + message);
            }
        }
    }

    private void P0() {
        Y0().u(R.drawable.ic_update_small);
        Y0().o(true);
        k2();
        this.f5606p0 = f9.X4();
        f5605v0 = new com.dw.ht.activitys.b(this);
    }

    public void j2() {
        f5604u0.postDelayed(f5605v0, 10000L);
        if (this.f5606p0.W4()) {
            return;
        }
        this.f5607q0.show();
    }

    private void k2() {
        c.a aVar = new c.a(this);
        aVar.z(getString(R.string.alert_attempt_connection_title));
        aVar.k(getString(R.string.alert_attempt_connection_text));
        aVar.B(getLayoutInflater().inflate(R.layout.dialog_progress_bar, (ViewGroup) null));
        aVar.d(false);
        this.f5607q0 = aVar.a();
        c.a aVar2 = new c.a(this);
        aVar2.z(getString(R.string.connection_failed));
        aVar2.k(getString(R.string.alert_connection_failed_text));
        aVar2.u(getString(R.string.alert_connection_failed_ok), new a());
        aVar2.n(getString(android.R.string.cancel), new b());
        aVar2.d(false);
        this.f5608r0 = aVar2.a();
    }

    private boolean l2(g3.d dVar) {
        if (!dVar.n()) {
            return false;
        }
        int i10 = c.f5615c[dVar.l().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            r2(dVar);
        } else if (com.dw.ht.activitys.d.f5623o0) {
            Log.i("UpdateActivity", "Status " + dVar.l().toString() + " with the command " + k.b(dVar.e()));
        }
        return false;
    }

    public void m2(g3.b bVar) {
        if (c.f5613a[bVar.c().ordinal()] != 1) {
            if (com.dw.ht.activitys.d.f5623o0) {
                Log.w("UpdateActivity", "Received error: " + bVar.b());
                return;
            }
            return;
        }
        if (com.dw.ht.activitys.d.f5623o0) {
            Log.w("UpdateActivity", "Received error: " + bVar.b());
        }
        f5604u0.postDelayed(f5605v0, 10000L);
    }

    private void n2(g3.d dVar) {
        a.EnumC0194a enumC0194aG = dVar.g();
        if (c.f5614b[enumC0194aG.ordinal()] == 1) {
            this.f5606p0.T4(dVar);
        } else if (com.dw.ht.activitys.d.f5623o0) {
            Log.i("UpdateActivity", "Received event: " + enumC0194aG);
        }
    }

    public void o2(Message message) {
        g3.d dVar = (g3.d) message.obj;
        int iE = dVar.e();
        if (iE == 16387) {
            if (com.dw.ht.activitys.d.f5623o0) {
                Log.i("UpdateActivity", "Received \"Notification\" packet.");
            }
            n2(dVar);
            return;
        }
        switch (iE) {
            case 1600:
                boolean zL2 = l2(dVar);
                if (com.dw.ht.activitys.d.f5623o0) {
                    Log.i("UpdateActivity", "Received \"VM connection\" packet with a " + zL2 + " status.");
                }
                if (!zL2) {
                    this.f5606p0.b5();
                } else {
                    this.f5606p0.a5();
                }
                break;
            case 1601:
                boolean zL22 = l2(dVar);
                if (com.dw.ht.activitys.d.f5623o0) {
                    Log.i("UpdateActivity", "Received \"VM disconnection\" packet with a " + zL22 + " status.");
                }
                this.f5606p0.f5();
                break;
            case 1602:
                boolean zL23 = l2(dVar);
                if (com.dw.ht.activitys.d.f5623o0) {
                    Log.i("UpdateActivity", "Received \"VM Control\" packet with a " + zL23 + " status.");
                }
                if (!zL23) {
                    this.f5606p0.d5();
                } else {
                    this.f5606p0.e5();
                }
                break;
            default:
                if (com.dw.ht.activitys.d.f5623o0 && dVar.n()) {
                    Log.i("UpdateActivity", "ACK - command: " + dVar.e() + " - status: " + dVar.l());
                }
                l2(dVar);
                break;
        }
    }

    public void p2() {
        f5604u0.removeCallbacks(f5605v0);
        f5605v0.a();
        if (this.f5606p0.W4()) {
            this.f5606p0.Y4();
        } else {
            this.f5607q0.cancel();
        }
    }

    public void q2() {
        if (this.f5606p0.W4()) {
            this.f5610t0 = this.f5625j0.A();
            this.f5606p0.Z4();
            j2();
        } else if (this.f5609s0) {
            this.f5609s0 = false;
            finish();
        } else {
            this.f5610t0 = this.f5625j0.A();
            j2();
        }
    }

    private void r2(g3.d dVar) {
        switch (dVar.e()) {
            case 1600:
                if (com.dw.ht.activitys.d.f5623o0) {
                    Log.i("UpdateActivity", "Update VM connection not supported.");
                }
                break;
            case 1601:
                if (com.dw.ht.activitys.d.f5623o0) {
                    Log.i("UpdateActivity", "Update VM Disconnection not supported.");
                }
                break;
            case 1602:
                if (com.dw.ht.activitys.d.f5623o0) {
                    Log.i("UpdateActivity", "Update VM Control not supported.");
                }
                break;
        }
    }

    @Override // s4.f9.i
    public void C() {
        this.f5609s0 = true;
        this.f5625j0.x();
    }

    @Override // s4.f9.i
    public void D(int i10, int... iArr) {
        this.f5625j0.M(10, i10, iArr);
    }

    @Override // com.dw.ht.activitys.b.a
    public void F() {
        if (!this.f5606p0.W4()) {
            this.f5607q0.cancel();
        }
        this.f5608r0.show();
    }

    @Override // androidx.fragment.app.p
    protected void U0() {
        super.U0();
        if (this.f5606p0.j2()) {
            return;
        }
        d0 d0VarO = N0().o();
        d0VarO.p(R.id.fragment_container, this.f5606p0);
        d0VarO.h();
    }

    @Override // com.dw.ht.activitys.d
    protected Handler Z1() {
        return new d(this);
    }

    @Override // com.dw.ht.activitys.d
    public void c2(m2 m2Var) {
        super.c2(m2Var);
        this.f5606p0.E5(m2Var);
    }

    @Override // com.dw.ht.activitys.b.a
    public void o() {
        if (this.f5625j0.F()) {
            return;
        }
        if (this.f5625j0.B() != c.e.USB) {
            g3.c cVar = this.f5625j0;
            cVar.t(this.f5610t0, cVar.B());
        } else {
            c0 c0Var = this.f5627l0;
            if (c0Var != null) {
                c0Var.v(false);
            }
        }
    }

    @Override // v3.b, v3.i, d.q, android.app.Activity
    public void onBackPressed() {
        if (this.f5606p0.W4()) {
            new c.a(this).j(R.string.exitWillAbortUpdate).t(R.string.update_abort, new DialogInterface.OnClickListener() { // from class: j4.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f18426a.finish();
                }
            }).m(android.R.string.cancel, null).C();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.dw.ht.activitys.d, v3.b, androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_update);
        P0();
    }

    @Override // com.dw.ht.activitys.d, v3.b, v3.i, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        f5604u0.removeCallbacks(f5605v0);
    }

    @Override // com.dw.ht.activitys.d, v3.b, v3.i, androidx.fragment.app.p, android.app.Activity
    protected void onResume() {
        super.onResume();
        m2 m2Var = this.f5628m0;
        if (m2Var != null) {
            this.f5606p0.E5(m2Var);
        }
    }

    @Override // s4.f9.i
    public void q(a.EnumC0194a enumC0194a) {
        if (this.f5625j0.F()) {
            this.f5625j0.r(10, enumC0194a);
        }
    }

    @Override // s4.f9.i
    public void y(a.EnumC0194a enumC0194a) {
        this.f5625j0.J(10, enumC0194a);
    }

    @Override // s4.f9.i
    public void z(int i10, byte[] bArr) {
        this.f5625j0.K(10, i10, bArr);
    }
}
