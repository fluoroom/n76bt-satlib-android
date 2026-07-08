package s4;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.lifecycle.m;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import g3.a;
import java.util.Arrays;
import java.util.Locale;
import org.msgpack.core.MessagePack;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public class f9 extends v3.v {

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    static final boolean f26431d1 = Cfg.f5476a;
    private i E0;
    private byte[] I0;
    private byte[] L0;
    private float P0;
    private v4.m2 Q0;
    private m4.s1 R0;
    private boolean S0;
    private int T0;
    private j W0;
    private long Y0;
    private long Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private float f26432a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private long f26433b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private boolean f26434c1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final Handler f26435z0 = new Handler();
    private final int A0 = 251;
    private final int B0 = 5;
    private final int C0 = 2000;
    private final int D0 = j3.a.values().length;
    private boolean F0 = false;
    private int G0 = 0;
    private int H0 = 0;
    private boolean J0 = false;
    private boolean K0 = false;
    private boolean M0 = false;
    private j3.a N0 = null;
    private boolean O0 = false;
    private final Runnable U0 = new b();
    private final View.OnClickListener V0 = new c();
    private final Runnable X0 = new Runnable() { // from class: s4.v8
        @Override // java.lang.Runnable
        public final void run() {
            f9.l4(this.f26815a);
        }
    };

    class a implements m0.u {
        a() {
        }

        @Override // m0.u
        public void E0(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.optioins_update, menu);
        }

        @Override // m0.u
        public /* synthetic */ void K0(Menu menu) {
            m0.t.b(this, menu);
        }

        @Override // m0.u
        public boolean v(MenuItem menuItem) {
            if (R.id.upgrade_to_test_firmware != menuItem.getItemId()) {
                return false;
            }
            androidx.fragment.app.p pVarE1 = f9.this.e1();
            if (!(pVarE1 instanceof com.dw.ht.activitys.d)) {
                return true;
            }
            q.b bVar = new q.b(pVarE1, pVarE1.getString(R.string.enter_test_invitation_code), null, null, pVarE1.getString(R.string.blank_for_public_beta), 0);
            bVar.f29596u = 2;
            v3.q.q4(bVar).g4(f9.this.j1(), "upgrade_to_test_firmware");
            return true;
        }

        @Override // m0.u
        public /* synthetic */ void z0(Menu menu) {
            m0.t.a(this, menu);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f9.this.T0 = 0;
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f9.x4(f9.this);
            if (f9.this.R0 != null) {
                f9.this.R0.b().removeCallbacks(f9.this.U0);
                f9.this.R0.b().postDelayed(f9.this.U0, 1000L);
            }
            if (f9.this.T0 >= 10) {
                f9.this.T0 = 0;
                androidx.fragment.app.p pVarE1 = f9.this.e1();
                if (pVarE1 instanceof com.dw.ht.activitys.d) {
                    ((com.dw.ht.activitys.d) pVarE1).b2(true, 0);
                }
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f9.this.x5();
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            f9.this.r5(false);
            f9.this.O0 = true;
        }
    }

    class f implements DialogInterface.OnClickListener {
        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            f9.this.r5(true);
        }
    }

    class g implements DialogInterface.OnClickListener {
        g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            f9.this.t5();
        }
    }

    static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26443a;

        static {
            int[] iArr = new int[j3.a.values().length];
            f26443a = iArr;
            try {
                iArr[j3.a.COMMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26443a[j3.a.TRANSFER_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26443a[j3.a.IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26443a[j3.a.VALIDATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26443a[j3.a.DATA_TRANSFER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface i {
        void C();

        void D(int i10, int... iArr);

        void q(a.EnumC0194a enumC0194a);

        void y(a.EnumC0194a enumC0194a);

        void z(int i10, byte[] bArr);
    }

    enum j {
        LoadingUpdateInfo,
        IsUpToDate,
        ShowChanges,
        Downloading,
        InUpdating
    }

    private void A5() {
        byte[] bArrB = new i3.b(22, 0, null).b();
        this.E0.z(1602, bArrB);
        if (f26431d1) {
            Log.d("UpdateVMFragment", "send UPDATE_IS_VALIDATION_DONE_REQ: " + o5.k.c(bArrB));
        }
    }

    private void C5(j3.a aVar) {
        this.N0 = aVar;
        J5();
    }

    private void D5(j jVar) {
        v4.m2 m2Var = this.Q0;
        if (m2Var == null) {
            jVar = j.LoadingUpdateInfo;
        } else if (m2Var.i(N4())) {
            jVar = j.IsUpToDate;
        }
        if (jVar == this.W0) {
            return;
        }
        this.W0 = jVar;
        K5();
    }

    private void E4() {
        c.a aVar = new c.a(e1());
        aVar.j(R.string.update_alert_commit).y(R.string.update_alert_commit_title).d(false).t(android.R.string.yes, new f()).m(android.R.string.no, new e());
        aVar.C();
    }

    private void F4() {
        c.a aVar = new c.a(e1());
        aVar.j(R.string.update_alert_erase_sqif).y(R.string.update_alert_erase_sqif_title).t(android.R.string.ok, new g());
        aVar.C();
    }

    private void G4() {
        c.a aVar = new c.a(e1());
        aVar.j(R.string.update_alert_transfer_complete).d(false).t(android.R.string.yes, new DialogInterface.OnClickListener() { // from class: s4.w8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f26829a.z5(true);
            }
        }).m(android.R.string.no, new DialogInterface.OnClickListener() { // from class: s4.x8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                f9.t4(this.f26852a, dialogInterface, i10);
            }
        });
        aVar.C();
    }

    private void G5() {
        c5(true);
        this.E0.D(1600, new int[0]);
    }

    private void H4() {
        c5(false);
        this.E0.q(a.EnumC0194a.VMU_PACKET);
        this.E0.D(1601, new int[0]);
    }

    private void H5() {
        if (this.R0 == null) {
            return;
        }
        v4.m2 m2Var = this.Q0;
        if (m2Var == null) {
            D5(j.LoadingUpdateInfo);
            return;
        }
        if (m2Var.i(N4())) {
            D5(j.IsUpToDate);
            return;
        }
        if (this.F0) {
            D5(j.InUpdating);
            return;
        }
        D5(j.ShowChanges);
        this.R0.f21551o.setText(v4.a0.E(this.Q0.f29995b));
        String strE = this.Q0.e(x3());
        if (strE.startsWith("<")) {
            this.R0.f21539c.setText(Html.fromHtml(strE));
        } else {
            this.R0.f21539c.setText(strE);
        }
        if (this.Q0.h()) {
            this.R0.f21538b.setText(R.string.start);
        } else {
            this.R0.f21538b.setText(R.string.download);
        }
    }

    private void I4() {
        c5(false);
        c.a aVar = new c.a(e1());
        aVar.j(R.string.update_complete).d(false).r(new DialogInterface.OnDismissListener() { // from class: s4.a9
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                f9.o4(this.f26366a, dialogInterface);
            }
        }).t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: s4.b9
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                f9.q4(this.f26383a, dialogInterface, i10);
            }
        });
        aVar.C();
    }

    private void I5() {
        if (this.R0 == null) {
            return;
        }
        j3.a aVarP4 = P4();
        float fOrdinal = aVarP4 != null ? aVarP4 == j3.a.DATA_TRANSFER ? this.P0 : (((aVarP4.ordinal() + 1) * 20.0f) / this.D0) + 100.0f : 0.0f;
        this.R0.f21545i.setMax(1200);
        this.R0.f21545i.setProgress((int) (fOrdinal * 10.0f));
    }

    private void J4() {
        if (this.S0) {
            return;
        }
        c.a aVar = new c.a(e1());
        aVar.j(R.string.update_alert_battery_low).y(R.string.update_alert_battery_low_title).t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: s4.y8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f26864a.y5();
            }
        }).r(new DialogInterface.OnDismissListener() { // from class: s4.z8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f26874a.S0 = false;
            }
        });
        aVar.C();
        this.S0 = true;
    }

    private void K4(String str) {
        F5(str);
    }

    private void K5() {
        m4.s1 s1Var = this.R0;
        if (s1Var == null) {
            return;
        }
        s1Var.f21540d.setVisibility(8);
        this.R0.f21550n.setVisibility(8);
        this.R0.f21543g.setVisibility(8);
        this.R0.f21538b.setVisibility(8);
        this.R0.f21542f.setVisibility(8);
        int iOrdinal = this.W0.ordinal();
        if (iOrdinal == 0) {
            this.R0.f21543g.setVisibility(0);
            this.R0.f21544h.setText(R.string.checking_for_updates);
            return;
        }
        if (iOrdinal == 1) {
            this.R0.f21542f.setVisibility(0);
            return;
        }
        if (iOrdinal == 2) {
            this.R0.f21540d.setVisibility(0);
            this.R0.f21538b.setVisibility(0);
            this.R0.f21538b.setText(R.string.start);
        } else if (iOrdinal == 3) {
            this.R0.f21543g.setVisibility(0);
            this.R0.f21544h.setText(R.string.downloading);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            this.R0.f21550n.setVisibility(0);
            this.R0.f21538b.setVisibility(0);
            this.R0.f21538b.setText(R.string.update_abort);
        }
    }

    private byte[] M4() {
        v4.m2 m2Var = this.Q0;
        if (m2Var == null) {
            return null;
        }
        return m2Var.d(k1());
    }

    private int N4() {
        v4.n0 n0VarA2;
        return (!(e1() instanceof com.dw.ht.activitys.d) || (n0VarA2 = ((com.dw.ht.activitys.d) e1()).a2()) == null) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : n0VarA2.d().k();
    }

    private byte[] O4() {
        v4.m2 m2Var = this.Q0;
        if (m2Var != null) {
            return m2Var.g(x3());
        }
        return null;
    }

    private String Q4() {
        if (P4() == null) {
            return H1().getString(R.string.update_step_initialisation);
        }
        int i10 = h.f26443a[P4().ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? H1().getString(R.string.update_step_initialisation) : H1().getString(R.string.update_step_data_transfer) : H1().getString(R.string.update_step_validation) : H1().getString(R.string.update_step_in_progress) : H1().getString(R.string.update_step_transfer_complete) : H1().getString(R.string.update_step_commit);
    }

    private void R4(i3.b bVar) {
        int iE = bVar.e();
        if (iE == 2) {
            l5(bVar);
            return;
        }
        if (iE == 3) {
            j5(bVar);
            return;
        }
        if (iE == 8) {
            g5();
            return;
        }
        if (iE == 11) {
            n5();
            return;
        }
        if (iE == 15) {
            h5();
            return;
        }
        if (iE == 20) {
            m5(bVar);
            return;
        }
        if (iE == 23) {
            o5();
            return;
        }
        if (iE == 29) {
            k5();
            return;
        }
        if (iE == 17) {
            S4(bVar);
            return;
        }
        if (iE == 18) {
            i5();
        } else if (f26431d1) {
            Log.d("UpdateVMFragment", "Received VM packet: " + o5.k.c(bVar.b()));
        }
    }

    private void S4(i3.b bVar) {
        byte[] bArrC = bVar.c();
        int iA = o5.k.a(bArrC, 0, 2, false);
        if (f26431d1) {
            Log.d("UpdateVMFragment", "Receive VM UPDATE ERRORS with code: " + o5.k.c(bArrC));
        }
        if (iA == 33) {
            J4();
            return;
        }
        if (iA == 129) {
            this.J0 = true;
            K4(H1().getString(R.string.update_error_sync_is_different));
            return;
        }
        this.K0 = true;
        this.L0 = bArrC;
        if (bArrC.length != 2) {
            K4(H1().getString(R.string.update_error_code) + " " + o5.k.c(bArrC));
            return;
        }
        K4(H1().getString(R.string.update_error_code) + " " + ((bArrC[1] & MessagePack.Code.EXT_TIMESTAMP) | ((bArrC[0] & MessagePack.Code.EXT_TIMESTAMP) << 8)));
    }

    private void V4(m4.s1 s1Var) {
        s1Var.f21539c.setMovementMethod(ScrollingMovementMethod.getInstance());
        s1Var.f21542f.setOnClickListener(this.V0);
        s1Var.f21551o.setOnClickListener(this.V0);
        s1Var.f21538b.setOnClickListener(new View.OnClickListener() { // from class: s4.c9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f9.r4(this.f26397a, view);
            }
        });
        H5();
        J5();
    }

    public static f9 X4() {
        return new f9();
    }

    private void c5(boolean z10) {
        if (this.R0 == null) {
            return;
        }
        this.F0 = z10;
        if (!z10) {
            D5(j.ShowChanges);
        } else {
            D5(j.InUpdating);
            U4();
        }
    }

    private void g5() {
        if (f26431d1) {
            Log.d("UpdateVMFragment", "received UPDATE_ABORT_CFM");
        }
        if (!this.J0) {
            H4();
        } else {
            a5();
            this.J0 = false;
        }
    }

    private void h5() {
        if (f26431d1) {
            Log.d("UpdateVMFragment", "received UPDATE_COMMIT_RES");
        }
        C5(j3.a.COMMIT);
        E4();
    }

    private void i5() {
        if (f26431d1) {
            Log.d("UpdateVMFragment", "received UPDATE_COMPLETE_IND");
        }
        I4();
    }

    private void j5(i3.b bVar) {
        byte[] bArrC = bVar.c();
        if (f26431d1) {
            Log.d("UpdateVMFragment", "received UPDATE_DATA_BYTES_REQ: " + o5.k.c(bArrC));
        }
        if (bArrC.length != 8) {
            K4("UPDATE_DATA_BYTES_REQ with wrong arguments.");
            return;
        }
        if (this.I0 == null) {
            this.I0 = M4();
        }
        L4((this.H0 * 100.0f) / this.I0.length);
        int iA = o5.k.a(bArrC, 0, 4, false);
        int iA2 = o5.k.a(bArrC, 4, 4, false);
        int i10 = (iA < 0 || iA > 250) ? 250 : iA;
        if (iA2 > 0) {
            int i11 = this.H0;
            if (iA2 + i11 < this.I0.length) {
                this.H0 = i11 + iA2;
            }
        }
        byte[] bArr = this.I0;
        int length = bArr.length;
        int i12 = this.H0;
        boolean z10 = length - i12 <= i10;
        byte[] bArr2 = new byte[i10];
        o5.k.d(bArr, i12, bArr2, 0, i10, false);
        s5(z10, bArr2);
        m4.s1 s1Var = this.R0;
        if (s1Var != null) {
            s1Var.f21538b.removeCallbacks(this.X0);
        }
        if (z10) {
            this.M0 = true;
            this.H0 = 0;
            this.I0 = null;
        } else {
            m4.s1 s1Var2 = this.R0;
            if (s1Var2 != null) {
                s1Var2.f21538b.postDelayed(this.X0, 2000L);
            }
            this.H0 += i10;
        }
    }

    private void k5() {
        if (f26431d1) {
            Log.d("UpdateVMFragment", "received UPDATE_COMMIT_RES");
        }
        C5(j3.a.COMMIT);
        F4();
    }

    public static /* synthetic */ void l4(f9 f9Var) {
        f9Var.getClass();
        if (Cfg.f5482d && f9Var.F0) {
            v4.l1 l1VarX = v4.u.w().x();
            if (l1VarX instanceof v4.g2) {
                if (f26431d1) {
                    Log.d("UpdateVMFragment", "send EventSysReboot");
                }
                ((v4.g2) l1VarX).t(18319);
            }
        }
    }

    private void l5(i3.b bVar) {
        int i10;
        byte[] bArrC = bVar.c();
        if (f26431d1) {
            Log.d("UpdateVMFragment", "received UPDATE_START_CFM: " + o5.k.c(bArrC));
        }
        if (bArrC.length <= 0) {
            this.G0 = 0;
            K4("UPDATE_START failed.");
            return;
        }
        byte b10 = bArrC[0];
        if (b10 != 0) {
            if (b10 != 9 || (i10 = this.G0) >= 5) {
                this.G0 = 0;
                K4("UPDATE_START failed.");
                return;
            } else {
                this.G0 = i10 + 1;
                this.f26435z0.postDelayed(new d(), 2000L);
                return;
            }
        }
        this.G0 = 0;
        if (this.N0 == null) {
            Log.d("UpdateVMFragment", "避免 ResumePoint 导致 NullPointerException异常，需要确认升级是否可以正常工作");
            this.N0 = j3.a.DATA_TRANSFER;
        }
        int i11 = h.f26443a[this.N0.ordinal()];
        if (i11 == 1) {
            E4();
            return;
        }
        if (i11 == 2) {
            G4();
        } else {
            if (i11 == 3) {
                v5();
                return;
            }
            if (i11 == 4) {
                A5();
            }
            w5();
        }
    }

    private void m5(i3.b bVar) {
        if (f26431d1) {
            Log.d("UpdateVMFragment", "received UPDATE_SYNC_CFM: " + o5.k.c(bVar.c()));
        }
        C5(j3.a.d(bVar.d()));
        x5();
    }

    private void n5() {
        if (f26431d1) {
            Log.d("UpdateVMFragment", "received UPDATE_TRANSFER_COMPLETE_IND");
        }
        C5(j3.a.TRANSFER_COMPLETE);
        G4();
    }

    public static /* synthetic */ void o4(f9 f9Var, DialogInterface dialogInterface) {
        f9Var.H4();
        f9Var.e1().finish();
    }

    private void o5() {
        if (f26431d1) {
            Log.d("UpdateVMFragment", "received UPDATE_IS_VALIDATION_DONE_CFM");
        }
        A5();
    }

    public static /* synthetic */ void p4(f9 f9Var, Throwable th2) {
        f9Var.getClass();
        th2.printStackTrace();
        if (f9Var.R0 == null) {
            return;
        }
        f9Var.D5(j.ShowChanges);
        f9Var.R0.f21538b.setText(R.string.retry);
    }

    private void p5() {
        this.H0 = 0;
    }

    public static /* synthetic */ void q4(f9 f9Var, DialogInterface dialogInterface, int i10) {
        f9Var.H4();
        f9Var.e1().finish();
    }

    private void q5() {
        byte[] bArrB = new i3.b(7, 0, null).b();
        this.E0.z(1602, bArrB);
        if (f26431d1) {
            Log.d("UpdateVMFragment", "send UPDATE_ABORT_REQ: " + o5.k.c(bArrB));
        }
    }

    public static /* synthetic */ void r4(final f9 f9Var, View view) {
        v4.m2 m2Var = f9Var.Q0;
        if (m2Var == null) {
            return;
        }
        if (!m2Var.h()) {
            f9Var.D5(j.Downloading);
            f9Var.Q0.l(view.getContext(), new mc.c() { // from class: s4.d9
                @Override // mc.c
                public final void accept(Object obj) {
                    f9.s4(this.f26407a, (Boolean) obj);
                }
            }, new mc.c() { // from class: s4.e9
                @Override // mc.c
                public final void accept(Object obj) {
                    f9.p4(this.f26417a, (Throwable) obj);
                }
            });
        } else if (f9Var.F0) {
            f9Var.u4();
        } else {
            f9Var.G5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r5(boolean z10) {
        byte[] bArr = new byte[1];
        if (z10) {
            bArr[0] = 0;
        } else {
            bArr[0] = 1;
        }
        byte[] bArrB = new i3.b(16, 1, bArr).b();
        this.E0.z(1602, bArrB);
        if (f26431d1) {
            Log.d("UpdateVMFragment", "send UPDATE_COMMIT_CFM: " + o5.k.c(bArrB));
        }
    }

    public static /* synthetic */ void s4(f9 f9Var, Boolean bool) {
        f9Var.getClass();
        f9Var.D5(j.ShowChanges);
    }

    private void s5(boolean z10, byte[] bArr) {
        int length = bArr.length + 1;
        byte[] bArr2 = new byte[length];
        bArr2[0] = z10 ? (byte) 1 : (byte) 0;
        o5.k.d(bArr, 0, bArr2, 1, bArr.length, false);
        this.E0.z(1602, new i3.b(4, length, bArr2).b());
        if (f26431d1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Log.d("UpdateVMFragment", "send UPDATE_DATA, last packet: " + ((int) bArr2[0]) + " - data length: " + bArr.length + " 间隔: " + (jCurrentTimeMillis - this.Y0) + "ms");
            this.Y0 = jCurrentTimeMillis;
        }
    }

    public static /* synthetic */ void t4(f9 f9Var, DialogInterface dialogInterface, int i10) {
        f9Var.z5(false);
        f9Var.O0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t5() {
        byte[] bArrB = new i3.b(30, 1, new byte[0]).b();
        this.E0.z(1602, bArrB);
        if (f26431d1) {
            Log.d("UpdateVMFragment", "send UPDATE_ERASE_SQIF_CFM: " + o5.k.c(bArrB));
        }
    }

    private void u5(byte[] bArr) {
        byte[] bArrB = new i3.b(31, 2, bArr).b();
        this.E0.z(1602, bArrB);
        if (f26431d1) {
            Log.d("UpdateVMFragment", "send UPDATE_ABORT_REQ: " + o5.k.c(bArrB));
        }
        this.E0.z(1602, new i3.b(32, 2, bArr).b());
    }

    private void v5() {
        byte[] bArrB = new i3.b(14, 1, new byte[]{0}).b();
        this.E0.z(1602, bArrB);
        if (f26431d1) {
            Log.d("UpdateVMFragment", "send UPDATE_IN_PROGRESS_RES: " + o5.k.c(bArrB));
        }
    }

    private void w5() {
        C5(j3.a.DATA_TRANSFER);
        byte[] bArrB = new i3.b(21, 0, null).b();
        this.E0.z(1602, bArrB);
        if (f26431d1) {
            Log.d("UpdateVMFragment", "send UPDATE_START_DATA_REQ: " + o5.k.c(bArrB));
        }
    }

    static /* synthetic */ int x4(f9 f9Var) {
        int i10 = f9Var.T0;
        f9Var.T0 = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x5() {
        byte[] bArrB = new i3.b(1, 0, null).b();
        this.E0.z(1602, bArrB);
        if (f26431d1) {
            Log.d("UpdateVMFragment", "send UPDATE_START_REQ: " + o5.k.c(bArrB));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y5() {
        byte[] bArrO4 = O4();
        if (bArrO4 == null) {
            K4("固件效验错误");
            return;
        }
        byte[] bArr = new byte[4];
        o5.k.d(bArrO4, bArrO4.length - 4, bArr, 0, 4, false);
        byte[] bArrB = new i3.b(19, 4, bArr).b();
        this.E0.z(1602, bArrB);
        if (f26431d1) {
            Log.d("UpdateVMFragment", "send UPDATE_SYNC_REQ: " + o5.k.c(bArrB));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z5(boolean z10) {
        byte[] bArr = new byte[1];
        if (z10) {
            bArr[0] = 0;
        } else {
            bArr[0] = 1;
        }
        byte[] bArrB = new i3.b(12, 1, bArr).b();
        this.E0.z(1602, bArrB);
        if (f26431d1) {
            Log.d("UpdateVMFragment", "send UPDATE_TRANSFER_COMPLETE_RES: " + o5.k.c(bArrB));
        }
    }

    public void B5(boolean z10) {
        m4.s1 s1Var = this.R0;
        if (s1Var == null) {
            return;
        }
        s1Var.f21545i.setIndeterminate(z10);
    }

    public void E5(v4.m2 m2Var) {
        this.Q0 = m2Var;
        H5();
    }

    public void F5(String str) {
        m4.s1 s1Var = this.R0;
        if (s1Var == null) {
            return;
        }
        s1Var.f21548l.setVisibility(0);
        this.R0.f21549m.setVisibility(0);
        this.R0.f21549m.setText(str);
    }

    public void J5() {
        m4.s1 s1Var = this.R0;
        if (s1Var == null) {
            return;
        }
        s1Var.f21547k.setText(Q4());
        if (P4() == j3.a.DATA_TRANSFER) {
            this.R0.f21546j.setVisibility(0);
            this.R0.f21541e.setVisibility(0);
            this.R0.f21541e.setText("");
        } else {
            this.R0.f21546j.setVisibility(8);
            this.R0.f21541e.setVisibility(8);
        }
        I5();
    }

    public void L4(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        this.P0 = f10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.f26433b1 < 500) {
            return;
        }
        this.f26433b1 = jUptimeMillis;
        m4.s1 s1Var = this.R0;
        if (s1Var == null) {
            return;
        }
        s1Var.f21546j.setText(String.format(Locale.getDefault(), " %.0f%%", Float.valueOf(f10)));
        I5();
        if (!this.f26434c1) {
            this.R0.f21541e.setText("");
            if (f10 < 0.1d) {
                return;
            }
            this.f26434c1 = true;
            this.Z0 = System.currentTimeMillis();
            this.f26432a1 = f10;
            return;
        }
        if (f10 == 0.0f || this.Z0 == 0) {
            this.R0.f21541e.setText("");
            return;
        }
        float f11 = this.f26432a1;
        float f12 = f10 - f11;
        this.R0.f21541e.setText(a6.j.b(H1(), 1000 * (((long) (((System.currentTimeMillis() - this.Z0) / f12) * ((100.0f - f11) - f12))) / 1000), 1000L, 60000L));
    }

    public j3.a P4() {
        return this.N0;
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle bundle) {
        super.Q2(view, bundle);
        v3().addMenuProvider(new a(), U1(), m.b.f2655e);
    }

    public void T4(g3.d dVar) {
        byte[] bArrI = dVar.i();
        R4(i3.b.a(Arrays.copyOfRange(bArrI, 1, bArrI.length)));
    }

    public void U4() {
        m4.s1 s1Var = this.R0;
        if (s1Var == null) {
            return;
        }
        s1Var.f21548l.setVisibility(8);
        this.R0.f21549m.setVisibility(8);
    }

    public boolean W4() {
        return this.F0;
    }

    public void Y4() {
        B5(false);
        G5();
    }

    public void Z4() {
        B5(true);
        p5();
    }

    public void a5() {
        c5(true);
        this.E0.y(a.EnumC0194a.VMU_PACKET);
        y5();
    }

    public void b5() {
        K4(H1().getString(R.string.update_error_vm_connection_failed));
    }

    public void d5() {
        this.M0 = false;
        this.O0 = false;
        K4(H1().getString(R.string.update_vm_command_failed));
    }

    public void e5() {
        if (this.M0) {
            this.M0 = false;
            C5(j3.a.VALIDATION);
            A5();
        } else if (this.O0) {
            this.O0 = false;
            H4();
        }
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o oVar, int i10, int i11, int i12, Object obj) {
        int i13;
        if (!(oVar instanceof v3.q) || !a6.q.d("upgrade_to_test_firmware", oVar.P1())) {
            return super.f4(oVar, i10, i11, i12, obj);
        }
        if (i11 == -1) {
            try {
                i13 = Integer.parseInt((String) obj);
            } catch (Exception unused) {
                i13 = 1;
            }
            androidx.fragment.app.p pVarE1 = e1();
            if (pVarE1 instanceof com.dw.ht.activitys.d) {
                ((com.dw.ht.activitys.d) pVarE1).b2(true, i13);
            }
        }
        return true;
    }

    public void f5() {
        if (this.K0) {
            this.K0 = false;
            this.E0.C();
        }
        this.H0 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.v, androidx.fragment.app.o
    public void n2(Activity activity) {
        super.n2(activity);
        try {
            this.E0 = (i) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity + " must implement IUpdateVMListener");
        }
    }

    public void u4() {
        this.f26434c1 = false;
        if (this.F0) {
            c5(false);
            if (!this.K0) {
                q5();
            } else {
                u5(this.L0);
                H4();
            }
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m4.s1 s1VarC = m4.s1.c(layoutInflater, viewGroup, false);
        this.R0 = s1VarC;
        V4(s1VarC);
        return this.R0.b();
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.R0 = null;
    }
}
