package s4;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
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
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m;
import c2.a;
import com.benshikj.ht.R;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import s4.f9;
import s4.q2;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u009e\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0001_B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0005J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010\u0005J\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010\u0005J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\u0005J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u001dH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u0005J\u000f\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010\u0005J\u000f\u00106\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u0010\u0005J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u001dH\u0002¢\u0006\u0004\b8\u00103J\u0019\u0010;\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<J!\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=2\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b?\u0010@J;\u0010H\u001a\u00020\u00142\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001d2\b\u0010G\u001a\u0004\u0018\u00010FH\u0014¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0006H\u0016¢\u0006\u0004\bJ\u0010\u0005J\u000f\u0010K\u001a\u00020\u0014H\u0014¢\u0006\u0004\bK\u0010LJ+\u0010Q\u001a\u00020=2\u0006\u0010N\u001a\u00020M2\b\u0010P\u001a\u0004\u0018\u00010O2\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0006H\u0016¢\u0006\u0004\bS\u0010\u0005J\u000f\u0010T\u001a\u00020\u0006H\u0016¢\u0006\u0004\bT\u0010\u0005J\u001f\u0010V\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001d2\u0006\u0010U\u001a\u00020\u001dH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u001dH\u0016¢\u0006\u0004\bY\u00103J\u001f\u0010\\\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\u00142\u0006\u0010[\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010_\u001a\u00020\u00062\u0006\u0010^\u001a\u00020\u0014H\u0016¢\u0006\u0004\b_\u0010\u0017J\u000f\u0010`\u001a\u00020\u0006H\u0016¢\u0006\u0004\b`\u0010\u0005J\u0019\u0010c\u001a\u00020\u00062\b\u0010b\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\bc\u0010dJ\u0019\u0010e\u001a\u00020\u00062\b\u0010b\u001a\u0004\u0018\u00010aH\u0016¢\u0006\u0004\be\u0010dR\u0014\u0010h\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR(\u0010z\u001a\u0004\u0018\u00010u2\b\u0010U\u001a\u0004\u0018\u00010u8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0016\u0010}\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010gR\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008e\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010|R\u001a\u0010\u0090\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008b\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0087\u0001R\u0018\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001d\u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R'\u0010\u009d\u0001\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u00148\u0002@BX\u0082\u000e¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010|\"\u0005\b\u009c\u0001\u0010\u0017¨\u0006\u009f\u0001"}, d2 = {"Ls4/q2;", "Lv3/m0;", "Lc2/a$b;", "Ld2/b;", "<init>", "()V", "Ldd/d0;", "u5", "s5", "", "percentage", "S4", "(F)V", "r5", "I4", "", "error", "p5", "(Ljava/lang/String;)V", "W4", "", "updating", "e5", "(Z)V", "q5", "Ls4/f9$j;", "status", "n5", "(Ls4/f9$j;)V", "", "T4", "()I", "beta", "inviteCode", "b5", "(ZI)V", "Lm4/g0;", "binding", "X4", "(Lm4/g0;)V", "V4", "()Ljava/lang/String;", "Lj3/a;", "U4", "()Lj3/a;", "t5", "P4", "i5", "j5", "progress", "l5", "(I)V", "h5", "f5", "g5", "errorCode", "k5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/fragment/app/o;", "sender", "what", "arg1", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "w2", "c4", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "M2", "value", "j", "(II)V", "version", "c", "isTws", "isTwsConnected", "k", "(ZZ)V", "isLeftChannel", "a", "s", "", "data", "X", "([B)V", "y", "F0", "I", "RESUME_POINTS_LENGTH", "Lv4/i0;", "G0", "Lv4/i0;", "link", "Ld2/a;", "H0", "Ld2/a;", "bluetoothManager", "Lc2/a;", "I0", "Lc2/a;", "abOta", "Lv4/m2;", "J0", "Lv4/m2;", "o5", "(Lv4/m2;)V", "updateInfo", "K0", "Z", "isUpdating", "L0", "Lm4/g0;", "M0", "clickTimes", "Ljava/lang/Runnable;", "N0", "Ljava/lang/Runnable;", "cleanClickTimes", "O0", "F", "mTransferPercentage", "", "P0", "J", "mLastUpdateTime", "Q0", "inCountdown", "R0", "mStartUpdateTime", "S0", "mStartUpdatePercentage", "T0", "Ls4/f9$j;", "Landroid/view/View$OnClickListener;", "U0", "Landroid/view/View$OnClickListener;", "getLoadTestFirmware", "()Landroid/view/View$OnClickListener;", "loadTestFirmware", "V0", "m5", "bluetoothReady", "W0", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q2 extends v3.m0 implements a.b, d2.b {

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private v4.i0 link;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private d2.a bluetoothManager;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private c2.a abOta;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private v4.m2 updateInfo;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private boolean isUpdating;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private m4.g0 binding;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private int clickTimes;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private float mTransferPercentage;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private long mLastUpdateTime;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private boolean inCountdown;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private long mStartUpdateTime;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private float mStartUpdatePercentage;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private boolean bluetoothReady;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private final int RESUME_POINTS_LENGTH = b.f26668a.size();

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private final Runnable cleanClickTimes = new Runnable() { // from class: s4.k2
        @Override // java.lang.Runnable
        public final void run() {
            q2.O4(this.f26551a);
        }
    };

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private f9.j status = f9.j.LoadingUpdateInfo;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private final View.OnClickListener loadTestFirmware = new d();

    /* JADX INFO: renamed from: s4.q2$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        public final Bundle a(v4.i0 i0Var) {
            rd.m.e(i0Var, "link");
            Bundle bundle = new Bundle();
            bundle.putLong("EXTRA_DEVICE_ID", i0Var.q());
            bundle.putBoolean("EXTRA_IS_HM", true);
            return bundle;
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kd.a f26668a = kd.b.a(j3.a.values());
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26670b;

        static {
            int[] iArr = new int[f9.j.values().length];
            try {
                iArr[f9.j.LoadingUpdateInfo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f9.j.IsUpToDate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f9.j.ShowChanges.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f9.j.Downloading.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f9.j.InUpdating.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f26669a = iArr;
            int[] iArr2 = new int[j3.a.values().length];
            try {
                iArr2[j3.a.DATA_TRANSFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[j3.a.VALIDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[j3.a.TRANSFER_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[j3.a.IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[j3.a.COMMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f26670b = iArr2;
        }
    }

    public static final class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ConstraintLayout constraintLayoutB;
            q2.this.clickTimes++;
            m4.g0 g0Var = q2.this.binding;
            if (g0Var != null && (constraintLayoutB = g0Var.b()) != null) {
                q2 q2Var = q2.this;
                constraintLayoutB.removeCallbacks(q2Var.cleanClickTimes);
                constraintLayoutB.postDelayed(q2Var.cleanClickTimes, 1000L);
            }
            if (q2.this.clickTimes >= 10) {
                q2.this.clickTimes = 0;
                q2.c5(q2.this, true, 0, 2, null);
            }
        }
    }

    public static final class f implements m0.u {
        f() {
        }

        @Override // m0.u
        public void E0(Menu menu, MenuInflater menuInflater) {
            rd.m.e(menu, "menu");
            rd.m.e(menuInflater, "menuInflater");
            menuInflater.inflate(R.menu.optioins_update, menu);
        }

        @Override // m0.u
        public /* synthetic */ void K0(Menu menu) {
            m0.t.b(this, menu);
        }

        @Override // m0.u
        public boolean v(MenuItem menuItem) {
            rd.m.e(menuItem, "menuItem");
            if (R.id.upgrade_to_test_firmware != menuItem.getItemId()) {
                return false;
            }
            Context contextX3 = q2.this.x3();
            rd.m.d(contextX3, "requireContext(...)");
            q.b bVar = new q.b(contextX3, contextX3.getString(R.string.enter_test_invitation_code), null, null, contextX3.getString(R.string.blank_for_public_beta), 0);
            bVar.f29596u = 2;
            v3.q.q4(bVar).g4(q2.this.j1(), "upgrade_to_test_firmware");
            return true;
        }

        @Override // m0.u
        public /* synthetic */ void z0(Menu menu) {
            m0.t.a(this, menu);
        }
    }

    private final void I4() {
        y1.a aVarF;
        if (this.isUpdating) {
            e5(false);
            if (this.abOta != null) {
                v4.i0 i0Var = this.link;
                if (i0Var != null && (aVarF = i0Var.F()) != null) {
                    aVarF.j();
                }
                d2.a aVar = this.bluetoothManager;
                if (aVar != null) {
                    aVar.i();
                }
                W3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O4(q2 q2Var) {
        q2Var.clickTimes = 0;
    }

    private final void P4() {
        e5(false);
        final androidx.fragment.app.p pVarE1 = e1();
        if (pVarE1 == null) {
            return;
        }
        c.a aVar = new c.a(pVarE1);
        aVar.j(R.string.update_complete).d(false).r(new DialogInterface.OnDismissListener() { // from class: s4.m2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                q2.Q4(pVarE1, dialogInterface);
            }
        }).t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: s4.n2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                q2.R4(pVarE1, dialogInterface, i10);
            }
        });
        aVar.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q4(androidx.fragment.app.p pVar, DialogInterface dialogInterface) {
        pVar.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(androidx.fragment.app.p pVar, DialogInterface dialogInterface, int i10) {
        pVar.finish();
    }

    private final void S4(float percentage) {
        if (percentage < 0.0f) {
            percentage = 0.0f;
        } else if (percentage > 100.0f) {
            percentage = 100.0f;
        }
        this.mTransferPercentage = percentage;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.mLastUpdateTime < 500) {
            return;
        }
        this.mLastUpdateTime = jUptimeMillis;
        m4.g0 g0Var = this.binding;
        if (g0Var == null) {
            return;
        }
        TextView textView = g0Var.f21157j;
        rd.g0 g0Var2 = rd.g0.f25951a;
        String str = String.format(Locale.getDefault(), " %.0f%%", Arrays.copyOf(new Object[]{Float.valueOf(percentage)}, 1));
        rd.m.d(str, "format(...)");
        textView.setText(str);
        s5();
        if (!this.inCountdown) {
            g0Var.f21152e.setText("");
            if (percentage < 0.1d) {
                return;
            }
            this.inCountdown = true;
            this.mStartUpdateTime = System.currentTimeMillis();
            this.mStartUpdatePercentage = percentage;
            return;
        }
        if (percentage == 0.0f || this.mStartUpdateTime == 0) {
            g0Var.f21152e.setText("");
            return;
        }
        float f10 = this.mStartUpdatePercentage;
        float f11 = percentage - f10;
        float fCurrentTimeMillis = ((System.currentTimeMillis() - this.mStartUpdateTime) / f11) * ((100 - f10) - f11);
        if (fCurrentTimeMillis > 3600000.0f) {
            g0Var.f21152e.setText("");
            return;
        }
        TextView textView2 = g0Var.f21152e;
        Resources resourcesH1 = H1();
        long j10 = CloseCodes.NORMAL_CLOSURE;
        textView2.setText(a6.j.b(resourcesH1, j10 * (((long) fCurrentTimeMillis) / j10), 1000L, 60000L));
    }

    private final int T4() {
        v4.a0 a0VarD;
        v4.i0 i0Var = this.link;
        return (i0Var == null || (a0VarD = i0Var.d()) == null) ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : a0VarD.k();
    }

    private final j3.a U4() {
        return j3.a.DATA_TRANSFER;
    }

    private final String V4() {
        j3.a aVarU4 = U4();
        int i10 = aVarU4 == null ? -1 : c.f26670b[aVarU4.ordinal()];
        if (i10 == -1) {
            String string = H1().getString(R.string.update_step_initialisation);
            rd.m.d(string, "getString(...)");
            return string;
        }
        if (i10 == 1) {
            String string2 = H1().getString(R.string.update_step_data_transfer);
            rd.m.d(string2, "getString(...)");
            return string2;
        }
        if (i10 == 2) {
            String string3 = H1().getString(R.string.update_step_validation);
            rd.m.d(string3, "getString(...)");
            return string3;
        }
        if (i10 == 3) {
            String string4 = H1().getString(R.string.update_step_transfer_complete);
            rd.m.d(string4, "getString(...)");
            return string4;
        }
        if (i10 == 4) {
            String string5 = H1().getString(R.string.update_step_in_progress);
            rd.m.d(string5, "getString(...)");
            return string5;
        }
        if (i10 != 5) {
            String string6 = H1().getString(R.string.update_step_initialisation);
            rd.m.d(string6, "getString(...)");
            return string6;
        }
        String string7 = H1().getString(R.string.update_step_commit);
        rd.m.d(string7, "getString(...)");
        return string7;
    }

    private final void W4() {
        m4.g0 g0Var = this.binding;
        if (g0Var == null) {
            return;
        }
        g0Var.f21159l.setVisibility(8);
        g0Var.f21160m.setVisibility(8);
    }

    private final void X4(m4.g0 binding) {
        binding.f21150c.setMovementMethod(ScrollingMovementMethod.getInstance());
        binding.f21153f.setOnClickListener(this.loadTestFirmware);
        binding.f21162o.setOnClickListener(this.loadTestFirmware);
        binding.f21149b.setOnClickListener(new View.OnClickListener() { // from class: s4.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q2.Y4(this.f26561a, view);
            }
        });
        r5();
        t5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(final q2 q2Var, View view) {
        v4.m2 m2Var = q2Var.updateInfo;
        if (m2Var == null) {
            return;
        }
        if (!m2Var.h()) {
            q2Var.n5(f9.j.Downloading);
            m2Var.l(view.getContext(), new mc.c() { // from class: s4.o2
                @Override // mc.c
                public final void accept(Object obj) {
                    q2.Z4(this.f26644a, (Boolean) obj);
                }
            }, new mc.c() { // from class: s4.p2
                @Override // mc.c
                public final void accept(Object obj) {
                    q2.a5(this.f26655a, (Throwable) obj);
                }
            });
        } else if (q2Var.isUpdating) {
            q2Var.I4();
        } else {
            q2Var.q5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z4(q2 q2Var, Boolean bool) {
        q2Var.n5(f9.j.ShowChanges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a5(q2 q2Var, Throwable th2) {
        Button button;
        rd.m.e(th2, "throwable");
        th2.printStackTrace();
        q2Var.n5(f9.j.ShowChanges);
        m4.g0 g0Var = q2Var.binding;
        if (g0Var == null || (button = g0Var.f21149b) == null) {
            return;
        }
        button.setText(R.string.retry);
    }

    private final void b5(boolean beta, int inviteCode) {
        v4.i0 i0Var = this.link;
        if (i0Var == null) {
            return;
        }
        o5(null);
        i0Var.d().x(x3(), beta, inviteCode, com.dw.ht.user.b.f6853a.i(), new e());
    }

    static /* synthetic */ void c5(q2 q2Var, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        q2Var.b5(z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d5(q2 q2Var, DialogInterface dialogInterface, int i10) {
        q2Var.W3();
    }

    private final void e5(boolean updating) {
        if (this.binding == null) {
            return;
        }
        this.isUpdating = updating;
        if (!updating) {
            n5(f9.j.ShowChanges);
        } else {
            n5(f9.j.InUpdating);
            W4();
        }
    }

    private final void g5() {
        P4();
    }

    private final void k5(int errorCode) {
        p5(errorCode != 1 ? errorCode != 2 ? errorCode != 11 ? errorCode != 4097 ? errorCode != 4099 ? errorCode != 4100 ? "未知错误" : "TWS已断开，停止升级" : "接收超时" : "设备拒绝升级" : "CRC错误" : "Key不对应" : "固件相同");
    }

    private final void l5(int progress) {
        S4(progress);
    }

    private final void m5(boolean z10) {
        if (this.bluetoothReady == z10) {
            return;
        }
        this.bluetoothReady = z10;
        u5();
    }

    private final void n5(f9.j status) {
        v4.m2 m2Var = this.updateInfo;
        if (m2Var == null) {
            status = f9.j.LoadingUpdateInfo;
        } else {
            rd.m.b(m2Var);
            if (m2Var.i(T4())) {
                status = f9.j.IsUpToDate;
            }
        }
        if (status == this.status) {
            return;
        }
        this.status = status;
        u5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o5(v4.m2 m2Var) {
        this.updateInfo = m2Var;
        r5();
    }

    private final void p5(String error) {
        m4.g0 g0Var = this.binding;
        if (g0Var == null) {
            return;
        }
        g0Var.f21159l.setVisibility(0);
        g0Var.f21160m.setVisibility(0);
        g0Var.f21160m.setText(error);
    }

    private final void q5() {
        v4.m2 m2Var;
        byte[] bArrD;
        d2.a aVar = this.bluetoothManager;
        if (aVar == null) {
            return;
        }
        if (!aVar.k()) {
            aVar.i();
            aVar.l();
            return;
        }
        c2.a aVar2 = this.abOta;
        if (aVar2 == null || aVar2.p() || (m2Var = this.updateInfo) == null || (bArrD = m2Var.d(x3())) == null) {
            return;
        }
        aVar2.u(bArrD);
        aVar2.w();
        e5(true);
    }

    private final void r5() {
        m4.g0 g0Var = this.binding;
        if (g0Var == null) {
            return;
        }
        v4.m2 m2Var = this.updateInfo;
        if (m2Var == null) {
            n5(f9.j.LoadingUpdateInfo);
            return;
        }
        if (m2Var.i(T4())) {
            n5(f9.j.IsUpToDate);
            return;
        }
        if (this.isUpdating) {
            n5(f9.j.InUpdating);
            return;
        }
        n5(f9.j.ShowChanges);
        g0Var.f21162o.setText(v4.a0.E(m2Var.f29995b));
        String strE = m2Var.e(x3());
        rd.m.d(strE, "getChanges(...)");
        if (rg.q.J(strE, "<", false, 2, null)) {
            g0Var.f21150c.setText(Html.fromHtml(strE));
        } else {
            g0Var.f21150c.setText(strE);
        }
    }

    private final void s5() {
        float fOrdinal;
        m4.g0 g0Var = this.binding;
        if (g0Var == null) {
            return;
        }
        j3.a aVarU4 = U4();
        if (aVarU4 == null) {
            fOrdinal = 0.0f;
        } else {
            if (aVarU4 == j3.a.DATA_TRANSFER) {
                g0Var.f21156i.setMax(100);
                g0Var.f21156i.setProgress((int) this.mTransferPercentage);
                return;
            }
            fOrdinal = 100 + (((aVarU4.ordinal() + 1) * 20.0f) / this.RESUME_POINTS_LENGTH);
        }
        g0Var.f21156i.setMax(1200);
        g0Var.f21156i.setProgress((int) (fOrdinal * 10));
    }

    private final void t5() {
        m4.g0 g0Var = this.binding;
        if (g0Var == null) {
            return;
        }
        g0Var.f21158k.setText(V4());
        if (U4() == j3.a.DATA_TRANSFER) {
            g0Var.f21157j.setVisibility(0);
            g0Var.f21152e.setVisibility(0);
            g0Var.f21152e.setText("");
        } else {
            g0Var.f21157j.setVisibility(8);
            g0Var.f21152e.setVisibility(8);
        }
        s5();
    }

    private final void u5() {
        m4.g0 g0Var = this.binding;
        if (g0Var == null) {
            return;
        }
        if (!rd.m.a(Looper.getMainLooper(), Looper.myLooper())) {
            g0Var.b().post(new Runnable() { // from class: s4.i2
                @Override // java.lang.Runnable
                public final void run() {
                    q2.v5(this.f26520a);
                }
            });
            return;
        }
        g0Var.f21151d.setVisibility(8);
        g0Var.f21161n.setVisibility(8);
        g0Var.f21154g.setVisibility(8);
        g0Var.f21149b.setVisibility(8);
        g0Var.f21153f.setVisibility(8);
        g0Var.f21149b.setEnabled(true);
        int i10 = c.f26669a[this.status.ordinal()];
        if (i10 == 1) {
            g0Var.f21154g.setVisibility(0);
            g0Var.f21155h.setText(R.string.checking_for_updates);
            return;
        }
        if (i10 == 2) {
            g0Var.f21153f.setVisibility(0);
            return;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                g0Var.f21154g.setVisibility(0);
                g0Var.f21155h.setText(R.string.downloading);
                return;
            } else {
                if (i10 != 5) {
                    throw new dd.o();
                }
                g0Var.f21161n.setVisibility(0);
                Button button = g0Var.f21149b;
                button.setVisibility(0);
                button.setText(R.string.update_abort);
                rd.m.b(button);
                return;
            }
        }
        g0Var.f21151d.setVisibility(0);
        g0Var.f21149b.setVisibility(0);
        v4.m2 m2Var = this.updateInfo;
        if (m2Var == null || !m2Var.h()) {
            g0Var.f21149b.setText(R.string.download);
        } else if (this.bluetoothReady) {
            g0Var.f21149b.setText(R.string.start);
        } else {
            g0Var.f21149b.setText(R.string.connecting);
            g0Var.f21149b.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v5(q2 q2Var) {
        q2Var.u5();
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        if (this.updateInfo == null) {
            c5(this, false, 0, 2, null);
        }
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        androidx.fragment.app.p pVarE1 = e1();
        if (pVarE1 != null) {
            f fVar = new f();
            androidx.lifecycle.t tVarU1 = U1();
            rd.m.d(tVarU1, "getViewLifecycleOwner(...)");
            pVarE1.addMenuProvider(fVar, tVarU1, m.b.f2655e);
        }
    }

    @Override // d2.b
    public void X(byte[] data) {
        c2.a aVar = this.abOta;
        if (aVar != null) {
            aVar.n(data);
        }
    }

    @Override // c2.a.b
    public void c(int version) {
        Log.d("FirmwareUpdateFragment", "onReceiveVersion version=" + version);
    }

    @Override // v3.v
    protected boolean c4() {
        c2.a aVar = this.abOta;
        if (aVar == null || !aVar.p()) {
            return super.c4();
        }
        new c.a(x3()).j(R.string.exitWillAbortUpdate).t(R.string.update_abort, new DialogInterface.OnClickListener() { // from class: s4.j2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                q2.d5(this.f26533a, dialogInterface, i10);
            }
        }).m(android.R.string.cancel, null).C();
        return true;
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o sender, int what, int arg1, int arg2, Object obj) {
        String str;
        if (!(sender instanceof v3.q) || !a6.q.d("upgrade_to_test_firmware", ((v3.q) sender).P1())) {
            return super.f4(sender, what, arg1, arg2, obj);
        }
        if (arg1 == -1) {
            try {
                str = obj instanceof String ? (String) obj : null;
            } catch (Exception unused) {
            }
            int i10 = str != null ? Integer.parseInt(str) : 1;
            b5(true, i10);
        }
        return true;
    }

    @Override // c2.a.b
    public void j(int status, int value) {
        Log.d("FirmwareUpdateFragment", "onStatusChanged status=" + status);
        switch (status) {
            case 0:
                i5();
                break;
            case 1:
                j5();
                break;
            case 2:
                l5(value);
                break;
            case 3:
                h5();
                break;
            case 4:
                f5();
                break;
            case 5:
                g5();
                break;
            case 6:
                k5(value);
                break;
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        BluetoothDevice bluetoothDeviceG;
        super.r2(savedInstanceState);
        y4(R.string.firmware_update);
        Bundle bundleI1 = i1();
        if (bundleI1 != null) {
            this.link = v4.i0.F.d(bundleI1.getLong("EXTRA_DEVICE_ID"));
        }
        v4.i0 i0Var = this.link;
        if (i0Var != null) {
            z4(i0Var.getName() + " - " + x3().getString(R.string.firmware_update));
        }
        v4.i0 i0Var2 = this.link;
        if (i0Var2 == null || (bluetoothDeviceG = i0Var2.G()) == null) {
            return;
        }
        c2.a aVar = new c2.a();
        aVar.t(this);
        d2.a aVar2 = new d2.a(x3(), bluetoothDeviceG);
        this.bluetoothManager = aVar2;
        aVar.v(aVar2);
        this.abOta = aVar;
        aVar2.n(this);
        aVar2.l();
    }

    @Override // d2.b
    public void s() {
        m5(true);
        c2.a aVar = this.abOta;
        if (aVar != null) {
            aVar.s();
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.g0 g0VarC = m4.g0.c(inflater, container, false);
        rd.m.d(g0VarC, "inflate(...)");
        this.binding = g0VarC;
        X4(g0VarC);
        ConstraintLayout constraintLayoutB = g0VarC.b();
        rd.m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        d2.a aVar = this.bluetoothManager;
        if (aVar != null) {
            aVar.i();
        }
    }

    @Override // d2.b
    public void y(byte[] data) {
        c2.a aVar = this.abOta;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    public static final class e implements io.grpc.stub.j {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(q2 q2Var, v4.m2 m2Var) {
            q2Var.o5(m2Var);
        }

        @Override // io.grpc.stub.j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(final v4.m2 m2Var) {
            ConstraintLayout constraintLayoutB;
            m4.g0 g0Var = q2.this.binding;
            if (g0Var == null || (constraintLayoutB = g0Var.b()) == null) {
                return;
            }
            final q2 q2Var = q2.this;
            constraintLayoutB.post(new Runnable() { // from class: s4.r2
                @Override // java.lang.Runnable
                public final void run() {
                    q2.e.c(q2Var, m2Var);
                }
            });
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            rd.m.e(th2, "t");
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
        }
    }

    private final void f5() {
    }

    private final void h5() {
    }

    private final void i5() {
    }

    private final void j5() {
    }

    @Override // c2.a.b
    public void a(boolean isLeftChannel) {
    }

    @Override // c2.a.b
    public void k(boolean isTws, boolean isTwsConnected) {
    }
}
