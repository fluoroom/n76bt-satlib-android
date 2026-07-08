package com.dw.ht.fragments;

import a6.y;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.channels.ChannelEditorFragment;
import com.dw.ht.fragments.DeviceStatusFragment;
import com.dw.ht.satellite.b;
import kotlin.Metadata;
import m4.k;
import org.greenrobot.eventbus.ThreadMode;
import p3.b;
import rd.m;
import s4.g3;
import v4.a2;
import v4.c0;
import v4.k0;
import v4.l1;
import v4.n0;
import v4.u;
import v4.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J!\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J'\u0010-\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b1\u00100J#\u00104\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010(2\b\u00103\u001a\u0004\u0018\u00010(H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u0010\u0004J\r\u00107\u001a\u00020\u0005¢\u0006\u0004\b7\u0010\u0004J\u000f\u00108\u001a\u00020\u0005H\u0016¢\u0006\u0004\b8\u0010\u0004J\u0017\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010;\u001a\u00020\u00052\u0006\u0010:\u001a\u00020=H\u0007¢\u0006\u0004\b;\u0010>J\u0017\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BR*\u0010K\u001a\u00020C2\u0006\u0010D\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010NR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010FR\u0016\u0010Y\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010FR\u0016\u0010\\\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010^R\u0016\u0010a\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010FR\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006d"}, d2 = {"Lcom/dw/ht/fragments/DeviceStatusFragment;", "Lcom/dw/ht/fragments/DeviceFragment;", "Lv4/n0$b;", "<init>", "()V", "Ldd/d0;", "x5", "", "index", "J5", "(I)V", "Lm4/k;", "chView", "channelI", "H5", "(Lm4/k;I)V", "Lv4/r;", "ch", "I5", "(Lm4/k;ILv4/r;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "w2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "m2", "(IILandroid/content/Intent;)V", "Lv4/n0;", "link", "Lv4/k0;", "oldStatus", "newStatus", "j0", "(Lv4/n0;Lv4/k0;Lv4/k0;)V", "W0", "(Lv4/n0;)V", "i0", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "M2", "K5", "H2", "Lv4/u$c;", "event", "onMessageEvent", "(Lv4/u$c;)V", "Lcom/dw/ht/Cfg$a;", "(Lcom/dw/ht/Cfg$a;)V", "Ly4/b;", "status", "r", "(Ly4/b;)V", "", "value", "P0", "Z", "getHide", "()Z", "G5", "(Z)V", "hide", "Lp3/b;", "Q0", "Lp3/b;", "audioLevelDrawable", "R0", "rssiLevelDrawable", "Ljava/lang/Runnable;", "S0", "Ljava/lang/Runnable;", "mAdaptiveResponseTimeout", "T0", "mInAdaptiveResponseDelay", "U0", "mTxOnScanCh", "V0", "I", "mLastScanCh", "Lm4/j;", "Lm4/j;", "binding", "X0", "inSimple", "Y0", "Ly4/b;", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceStatusFragment extends DeviceFragment implements n0.b {

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private boolean mInAdaptiveResponseDelay;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private boolean mTxOnScanCh;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    private m4.j binding;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    private boolean inSimple;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private boolean hide = true;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private final p3.b audioLevelDrawable = new p3.b(null);

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private final p3.b rssiLevelDrawable = new p3.b(null);

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private final Runnable mAdaptiveResponseTimeout = new b();

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private int mLastScanCh = -1;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    private y4.b status = new y4.b();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6171a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f6172b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f6173c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f6174d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f6175e;

        static {
            int[] iArr = new int[c0.q.values().length];
            try {
                iArr[c0.q.DoubleCh.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.q.ChannelScan.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6171a = iArr;
            int[] iArr2 = new int[n0.c.values().length];
            try {
                iArr2[n0.c.Connecting.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[n0.c.Idle.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[n0.c.Interrupted.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[n0.c.ConnectionFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f6172b = iArr2;
            int[] iArr3 = new int[a2.a.values().length];
            try {
                iArr3[a2.a.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[a2.a.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f6173c = iArr3;
            int[] iArr4 = new int[u.c.values().length];
            try {
                iArr4[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            f6174d = iArr4;
            int[] iArr5 = new int[Cfg.a.values().length];
            try {
                iArr5[Cfg.a.SimpleUIBindChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            f6175e = iArr5;
        }
    }

    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DeviceStatusFragment.this.mInAdaptiveResponseDelay) {
                DeviceStatusFragment.this.mTxOnScanCh = false;
                DeviceStatusFragment.this.K5();
            }
        }
    }

    public static final boolean A5(DeviceStatusFragment deviceStatusFragment, View view) {
        a2 a2VarC2;
        c0 c0VarW4 = deviceStatusFragment.W4();
        if (c0VarW4 == null || (a2VarC2 = c0VarW4.c2()) == null) {
            return true;
        }
        deviceStatusFragment.J5(a2VarC2.f29687b);
        return true;
    }

    public static final boolean B5(DeviceStatusFragment deviceStatusFragment, View view) {
        a2 a2VarC2;
        c0 c0VarW4 = deviceStatusFragment.W4();
        if (c0VarW4 == null || (a2VarC2 = c0VarW4.c2()) == null) {
            return true;
        }
        deviceStatusFragment.J5(a2VarC2.f29688c);
        return true;
    }

    public static final void C5(DeviceStatusFragment deviceStatusFragment, View view) {
        a2 a2VarC2;
        c0 c0VarW4 = deviceStatusFragment.W4();
        if (c0VarW4 == null || (a2VarC2 = c0VarW4.c2()) == null) {
            return;
        }
        deviceStatusFragment.J5(a2VarC2.f29687b);
    }

    public static final void D5(DeviceStatusFragment deviceStatusFragment, View view) {
        a2 a2VarC2;
        c0 c0VarW4 = deviceStatusFragment.W4();
        if (c0VarW4 == null || (a2VarC2 = c0VarW4.c2()) == null) {
            return;
        }
        deviceStatusFragment.J5(a2VarC2.f29688c);
    }

    public static final void E5(DeviceStatusFragment deviceStatusFragment, View view) {
        c0 c0VarW4 = deviceStatusFragment.W4();
        if (c0VarW4 != null) {
            if (c0VarW4.n() && !c0VarW4.Y().f29912a) {
                c0VarW4.a(v.SET_HT_ON_OFF, 1);
            } else if (c0VarW4.l() == n0.c.Connecting) {
                c0VarW4.h(true);
            } else {
                c0VarW4.v(true);
            }
        }
    }

    public static final int F5(DeviceStatusFragment deviceStatusFragment) {
        k0 k0VarY;
        l1 l1VarY4 = deviceStatusFragment.Y4();
        if (l1VarY4 == null || (k0VarY = l1VarY4.Y()) == null) {
            return 0;
        }
        return k0VarY.b();
    }

    private final void H5(k chView, int channelI) {
        c0 c0VarW4 = W4();
        if (c0VarW4 == null) {
            return;
        }
        I5(chView, channelI, c0VarW4.Q1(channelI));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I5(m4.k r6, int r7, v4.r r8) {
        /*
            r5 = this;
            v4.c0 r0 = r5.W4()
            if (r0 != 0) goto L7
            return
        L7:
            r1 = 8
            if (r8 != 0) goto L13
            androidx.constraintlayout.widget.ConstraintLayout r6 = r6.b()
            r6.setVisibility(r1)
            return
        L13:
            androidx.constraintlayout.widget.ConstraintLayout r2 = r6.b()
            r3 = 0
            r2.setVisibility(r3)
            java.lang.String r2 = r8.m()
            java.lang.String r4 = "getName(...)"
            rd.m.d(r2, r4)
            int r4 = r2.length()
            if (r4 <= 0) goto L35
            android.widget.TextView r1 = r6.f21262e
            r1.setText(r2)
            android.widget.TextView r1 = r6.f21262e
            r1.setVisibility(r3)
            goto L3a
        L35:
            android.widget.TextView r2 = r6.f21262e
            r2.setVisibility(r1)
        L3a:
            v4.k0 r1 = r0.Y()
            java.lang.String r2 = "getHTStatus(...)"
            rd.m.d(r1, r2)
            android.widget.TextView r2 = r6.f21260c
            int r4 = r1.f29919h
            if (r7 != r4) goto L5a
            boolean r4 = r1.f29913b
            if (r4 == 0) goto L5a
            boolean r4 = r8.f30073r
            if (r4 != 0) goto L5a
            boolean r0 = r0.k2()
            java.lang.String r8 = r8.p(r0)
            goto L62
        L5a:
            boolean r0 = r0.k2()
            java.lang.String r8 = r8.o(r0)
        L62:
            r2.setText(r8)
            int r8 = r1.f29919h
            if (r7 != r8) goto L79
            boolean r7 = r1.f29913b
            if (r7 == 0) goto L71
            r7 = 2131231118(0x7f08018e, float:1.8078308E38)
            goto L7a
        L71:
            boolean r7 = r1.f29915d
            if (r7 == 0) goto L79
            r7 = 2131231080(0x7f080168, float:1.807823E38)
            goto L7a
        L79:
            r7 = 0
        L7a:
            if (r7 != 0) goto L83
            androidx.appcompat.widget.AppCompatImageView r6 = r6.f21261d
            r7 = 4
            r6.setVisibility(r7)
            return
        L83:
            androidx.appcompat.widget.AppCompatImageView r8 = r6.f21261d
            r8.setImageResource(r7)
            androidx.appcompat.widget.AppCompatImageView r6 = r6.f21261d
            r6.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.fragments.DeviceStatusFragment.I5(m4.k, int, v4.r):void");
    }

    private final void J5(int index) {
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        d5.a aVarV = l1VarY4.V(index);
        ChannelEditorFragment.Companion companion = ChannelEditorFragment.INSTANCE;
        Context contextX3 = x3();
        m.d(contextX3, "requireContext(...)");
        startActivityForResult(companion.c(contextX3, aVarV, Long.valueOf(l1VarY4.q()), Integer.valueOf(index)), 1);
    }

    private final void x5() {
        if (Cfg.O().getSimpleUI()) {
            u.w().G(Y4());
        }
    }

    public static final void y5(DeviceStatusFragment deviceStatusFragment, View view) {
        c0 c0VarW4 = deviceStatusFragment.W4();
        if (c0VarW4 == null) {
            return;
        }
        if (!deviceStatusFragment.inSimple && deviceStatusFragment.status.b() != y4.c.f32399b) {
            if (com.dw.ht.satellite.b.x() != 0) {
                mi.c.e().m(b.a.f6706c);
                return;
            }
            deviceStatusFragment.k5(g3.class);
        }
        c0.q qVarG2 = c0VarW4.g2();
        if ((qVarG2 == null ? -1 : a.f6171a[qVarG2.ordinal()]) == 1) {
            c0VarW4.h1(a2.a.A);
        }
        deviceStatusFragment.x5();
    }

    public static final void z5(DeviceStatusFragment deviceStatusFragment, View view) {
        c0 c0VarW4 = deviceStatusFragment.W4();
        if (c0VarW4 == null) {
            return;
        }
        c0.q qVarG2 = c0VarW4.g2();
        int i10 = qVarG2 == null ? -1 : a.f6171a[qVarG2.ordinal()];
        if (i10 == 1) {
            c0VarW4.h1(a2.a.B);
        } else if (i10 == 2) {
            int iC = c0VarW4.c2().c();
            c0VarW4.f1(deviceStatusFragment.mLastScanCh);
            deviceStatusFragment.mLastScanCh = iC;
        }
        deviceStatusFragment.x5();
    }

    public final void G5(boolean z10) {
        if (this.hide == z10) {
            return;
        }
        this.hide = z10;
        K5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
    }

    public final void K5() {
        int i10;
        m4.j jVar = this.binding;
        if (jVar == null) {
            return;
        }
        c0 c0VarW4 = W4();
        if (c0VarW4 == null || this.hide) {
            jVar.f21242h.setVisibility(8);
            return;
        }
        k0 k0VarY = c0VarW4.Y();
        m.d(k0VarY, "getHTStatus(...)");
        a2 a2VarC2 = c0VarW4.c2();
        m.d(a2VarC2, "getSettings(...)");
        jVar.f21242h.setVisibility(0);
        boolean z10 = true;
        if (!c0VarW4.n()) {
            jVar.f21236b.b().setVisibility(8);
            jVar.f21237c.b().setVisibility(8);
            jVar.f21243i.setVisibility(8);
            jVar.f21244j.setVisibility(0);
            n0.c cVarL = c0VarW4.l();
            i10 = cVarL != null ? a.f6172b[cVarL.ordinal()] : -1;
            if (i10 == 1) {
                jVar.f21244j.setText(R.string.promptCancelConnection);
                return;
            } else {
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    jVar.f21244j.setText(R.string.connectToControlTheDevice);
                    return;
                }
                return;
            }
        }
        if (!c0VarW4.Y().f29912a) {
            jVar.f21236b.b().setVisibility(8);
            jVar.f21237c.b().setVisibility(8);
            jVar.f21243i.setVisibility(8);
            jVar.f21244j.setVisibility(0);
            jVar.f21244j.setText(c0VarW4.f0());
            return;
        }
        jVar.f21244j.setVisibility(8);
        if (!this.inSimple && this.status.b() != y4.c.f32399b) {
            k kVar = jVar.f21236b;
            m.d(kVar, "cha");
            I5(kVar, k0VarY.f29919h, this.status.a());
            jVar.f21236b.f21259b.setVisibility(4);
            jVar.f21237c.b().setVisibility(8);
        } else if (k0VarY.f29916e != a2.a.Off) {
            k kVar2 = jVar.f21236b;
            m.d(kVar2, "cha");
            H5(kVar2, a2VarC2.f29687b);
            k kVar3 = jVar.f21237c;
            m.d(kVar3, "chb");
            H5(kVar3, a2VarC2.f29688c);
            a2.a aVar = k0VarY.f29916e;
            i10 = aVar != null ? a.f6173c[aVar.ordinal()] : -1;
            if (i10 == 1) {
                jVar.f21236b.f21259b.setVisibility(0);
                jVar.f21237c.f21259b.setVisibility(4);
            } else if (i10 == 2) {
                jVar.f21236b.f21259b.setVisibility(4);
                jVar.f21237c.f21259b.setVisibility(0);
            }
        } else if (k0VarY.f29917f) {
            jVar.f21236b.b().setVisibility(0);
            jVar.f21237c.b().setVisibility(0);
            if (k0VarY.f29915d) {
                int i11 = k0VarY.f29919h;
                if (i11 != a2VarC2.f29687b) {
                    this.mLastScanCh = i11;
                    this.mTxOnScanCh = a2VarC2.f29702q;
                }
                this.mInAdaptiveResponseDelay = false;
                jVar.f21237c.b().removeCallbacks(this.mAdaptiveResponseTimeout);
            } else if (k0VarY.f29913b) {
                this.mInAdaptiveResponseDelay = false;
                jVar.f21237c.b().removeCallbacks(this.mAdaptiveResponseTimeout);
            } else if (this.mTxOnScanCh && !this.mInAdaptiveResponseDelay) {
                this.mInAdaptiveResponseDelay = true;
                jVar.f21237c.b().postDelayed(this.mAdaptiveResponseTimeout, 3000L);
            }
            if (this.mLastScanCh < 0) {
                jVar.f21236b.f21259b.setVisibility(4);
                jVar.f21237c.f21259b.setVisibility(4);
            } else if (this.mTxOnScanCh) {
                jVar.f21236b.f21259b.setVisibility(4);
                jVar.f21237c.f21259b.setVisibility(0);
            } else {
                jVar.f21236b.f21259b.setVisibility(0);
                jVar.f21237c.f21259b.setVisibility(4);
            }
            k kVar4 = jVar.f21236b;
            m.d(kVar4, "cha");
            H5(kVar4, a2VarC2.f29687b);
            k kVar5 = jVar.f21237c;
            m.d(kVar5, "chb");
            H5(kVar5, this.mLastScanCh);
        } else {
            jVar.f21236b.f21259b.setVisibility(4);
            jVar.f21237c.b().setVisibility(8);
            k kVar6 = jVar.f21236b;
            m.d(kVar6, "cha");
            H5(kVar6, a2VarC2.f29687b);
        }
        if (c0VarW4.Y().f29915d) {
            jVar.f21243i.setVisibility(0);
        } else {
            jVar.f21243i.setVisibility(this.inSimple ? 4 : 8);
        }
        if (!m.a(u.w().r(), c0VarW4) && !Cfg.O().getSimpleUIBind()) {
            z10 = false;
        }
        if (Cfg.O().getSimpleUI()) {
            if (!z10) {
                jVar.f21236b.f21259b.setVisibility(4);
                jVar.f21237c.f21259b.setVisibility(4);
            } else if (jVar.f21237c.b().getVisibility() == 8 || (jVar.f21236b.f21259b.getVisibility() == 4 && jVar.f21237c.f21259b.getVisibility() == 4)) {
                jVar.f21236b.f21259b.setVisibility(0);
            }
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        K5();
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        m4.j jVar = this.binding;
        if (jVar == null) {
            return;
        }
        jVar.f21236b.b().setOnClickListener(new View.OnClickListener() { // from class: s4.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeviceStatusFragment.y5(this.f26867a, view2);
            }
        });
        jVar.f21237c.b().setOnClickListener(new View.OnClickListener() { // from class: s4.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeviceStatusFragment.z5(this.f26358a, view2);
            }
        });
        jVar.f21236b.b().setOnLongClickListener(new View.OnLongClickListener() { // from class: s4.b2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return DeviceStatusFragment.A5(this.f26370a, view2);
            }
        });
        jVar.f21237c.b().setOnLongClickListener(new View.OnLongClickListener() { // from class: s4.c2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return DeviceStatusFragment.B5(this.f26388a, view2);
            }
        });
        View viewFindViewById = jVar.f21236b.b().findViewById(R.id.edit);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: s4.d2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceStatusFragment.C5(this.f26400a, view2);
                }
            });
        }
        View viewFindViewById2 = jVar.f21237c.b().findViewById(R.id.edit);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: s4.e2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DeviceStatusFragment.D5(this.f26411a, view2);
                }
            });
        }
        jVar.f21244j.setOnClickListener(new View.OnClickListener() { // from class: s4.f2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeviceStatusFragment.E5(this.f26423a, view2);
            }
        });
        this.audioLevelDrawable.f(2);
        p3.b bVar = this.audioLevelDrawable;
        Integer numB = y.b(k1(), R.attr.colorPrimary);
        m.b(numB);
        bVar.a(numB.intValue());
        this.audioLevelDrawable.e(32767);
        this.audioLevelDrawable.c(20);
        jVar.f21241g.setImageDrawable(this.audioLevelDrawable);
        this.rssiLevelDrawable.f(2);
        this.rssiLevelDrawable.e(100);
        this.rssiLevelDrawable.c(100);
        Integer numB2 = y.b(k1(), R.attr.colorPrimary);
        m.b(numB2);
        this.rssiLevelDrawable.b(new int[]{0, 60}, new int[]{numB2.intValue(), -65536});
        this.rssiLevelDrawable.d(new b.a() { // from class: s4.g2
            @Override // p3.b.a
            public final int w() {
                return DeviceStatusFragment.F5(this.f26454a);
            }
        });
        jVar.f21240f.setImageDrawable(this.rssiLevelDrawable);
        if (this.hide) {
            view.setVisibility(8);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void W0(n0 link) {
        m.e(link, "link");
        super.W0(link);
        K5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 oldLink, n0 newLink) {
        super.d5(oldLink, newLink);
        if (oldLink != null) {
            oldLink.g(this);
        }
        if (newLink != null) {
            newLink.x(this);
        }
        if (newLink instanceof c0) {
            this.audioLevelDrawable.d(((c0) newLink).Z());
        } else {
            this.audioLevelDrawable.d(null);
        }
        K5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void i0(n0 link) {
        m.e(link, "link");
        super.i0(link);
        K5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void j0(n0 link, k0 oldStatus, k0 newStatus) {
        m.e(link, "link");
        m.e(oldStatus, "oldStatus");
        m.e(newStatus, "newStatus");
        super.j0(link, oldStatus, newStatus);
        if (link instanceof c0) {
            this.audioLevelDrawable.d(((c0) link).Z());
        }
        K5();
    }

    @Override // androidx.fragment.app.o
    public void m2(int requestCode, int resultCode, Intent data) {
        if (resultCode != -1 || requestCode != 1) {
            super.m2(requestCode, resultCode, data);
            return;
        }
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null || data == null) {
            return;
        }
        int intExtra = data.getIntExtra("android.intent.extra.INDEX", 0);
        Uri data2 = data.getData();
        if (data2 == null) {
            l1VarY4.d1(intExtra, null);
            return;
        }
        d5.a aVarF = d5.a.F(ContentUris.parseId(data2));
        if (aVarF == null) {
            return;
        }
        l1VarY4.d1(intExtra, aVarF);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.c event) {
        m.e(event, "event");
        if (a.f6174d[event.ordinal()] == 1) {
            K5();
        }
    }

    @Override // v4.n0.b
    public void r(y4.b status) {
        m.e(status, "status");
        if (m.a(this.status, status)) {
            return;
        }
        this.status = status;
        K5();
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewInflate;
        m.e(inflater, "inflater");
        boolean zA = m.a(P1(), "s_dev_status");
        this.inSimple = zA;
        if (zA) {
            viewInflate = inflater.inflate(R.layout.s_dev_status, container, false);
            m.d(viewInflate, "inflate(...)");
        } else {
            viewInflate = inflater.inflate(R.layout.dev_status, container, false);
            m.d(viewInflate, "inflate(...)");
        }
        this.binding = m4.j.a(viewInflate);
        return viewInflate;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            l1VarY4.r(this);
        }
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(Cfg.a event) {
        m.e(event, "event");
        if (a.f6175e[event.ordinal()] == 1) {
            K5();
        }
    }
}
