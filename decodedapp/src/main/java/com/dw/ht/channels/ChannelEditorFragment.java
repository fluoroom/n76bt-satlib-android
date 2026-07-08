package com.dw.ht.channels;

import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.fragment.app.o;
import androidx.fragment.app.p;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.ht.Cfg;
import com.dw.ht.channels.ChannelEditorFragment;
import com.dw.ht.provider.a;
import d5.a;
import ed.j;
import java.util.Arrays;
import kotlin.Metadata;
import m4.x;
import o5.i;
import rd.g0;
import rd.h;
import rd.m;
import s4.l5;
import s4.t7;
import v3.m0;
import v4.a0;
import v4.d0;
import v4.l1;
import v4.n;
import v4.r;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u0002:\u0002\u0088\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J+\u0010,\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020+2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\u0005H\u0016¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u0010\u0004J'\u00107\u001a\u00020\u00052\u0006\u0010.\u001a\u0002042\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u00108J/\u0010;\u001a\u00020\u00052\u0006\u0010.\u001a\u0002042\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010<J;\u0010D\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00072\b\u0010C\u001a\u0004\u0018\u00010BH\u0014¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00052\u0006\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00052\b\u0010J\u001a\u0004\u0018\u00010%¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u000fH\u0014¢\u0006\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR$\u0010Y\u001a\u00020%2\u0006\u0010V\u001a\u00020%8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bW\u0010T\"\u0004\bX\u0010LR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010\\R\u0016\u0010b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010aR\u0016\u0010f\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010aR\u0016\u0010h\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010aR\u0016\u0010j\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010aR\u0016\u0010l\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010aR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010s\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR*\u0010w\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010a\u001a\u0004\bu\u0010N\"\u0004\bv\u0010\u0015R\u0016\u0010y\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010aR$\u0010|\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bz\u0010a\"\u0004\b{\u0010\u0015R\u0014\u0010~\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010NR(\u0010\u0083\u0001\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u0086\u0001\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0084\u0001\u0010\u0080\u0001\"\u0006\b\u0085\u0001\u0010\u0082\u0001¨\u0006\u0089\u0001"}, d2 = {"Lcom/dw/ht/channels/ChannelEditorFragment;", "Lv3/m0;", "Lcom/dw/android/widget/NumberPreferenceView$b;", "<init>", "()V", "Ldd/d0;", "Q4", "", "freq", "", "", "G4", "(I)[Ljava/lang/String;", "Y4", "J4", "", "isTx", "I4", "(IZ)V", "all", "f5", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "F2", "(Landroid/view/MenuItem;)Z", "showMessage", "Ld5/a;", "h5", "(Z)Ld5/a;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "y2", "M2", "H2", "Lcom/dw/android/widget/NumberPreferenceView;", "number", "byUser", "B0", "(Lcom/dw/android/widget/NumberPreferenceView;IZ)V", "from", "to", "y0", "(Lcom/dw/android/widget/NumberPreferenceView;IIZ)V", "Landroidx/fragment/app/o;", "sender", "what", "arg1", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "Ls4/l5$b;", "event", "onMessageEvent", "(Ls4/l5$b;)V", "ch", "a5", "(Ld5/a;)V", "c4", "()Z", "Lm4/x;", "F0", "Lm4/x;", "binding", "G0", "Ld5/a;", "oriChannel", "value", "H0", "c5", "mChannel", "Lv4/d0;", "I0", "Lv4/d0;", "txFreqRange", "J0", "rxFreqRange", "K0", "Z", "isSupportMediumPower", "L0", "isGMRS", "M0", "isSupportDMR", "N0", "showBCLO", "O0", "showGroupID", "P0", "showRev", "Lv4/l1;", "Q0", "Lv4/l1;", "link", "R0", "I", "channelIndex", "S0", "getInIIChannelEditor", "b5", "inIIChannelEditor", "T0", "showModulation", "U0", "Z4", "advancedMode", "N4", "formDevice", "P4", "()I", "e5", "(I)V", "txSubAudio", "O4", "d5", "rxSubAudio", "V0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChannelEditorFragment extends m0 implements NumberPreferenceView.b {

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private x binding;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private d5.a oriChannel;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private d5.a mChannel;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private d0 txFreqRange;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private d0 rxFreqRange;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private boolean isSupportMediumPower;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private boolean isGMRS;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private boolean isSupportDMR;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private boolean showBCLO;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private boolean showGroupID;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private boolean showRev;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private l1 link;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private int channelIndex;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private boolean inIIChannelEditor;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private boolean showModulation;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private boolean advancedMode;

    /* JADX INFO: renamed from: com.dw.ht.channels.ChannelEditorFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public static /* synthetic */ Intent d(Companion companion, Context context, d5.a aVar, Long l10, Integer num, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                l10 = null;
            }
            if ((i10 & 8) != 0) {
                num = null;
            }
            return companion.c(context, aVar, l10, num);
        }

        public final void a(Context context, long j10) {
            m.e(context, "context");
            Bundle bundle = new Bundle();
            bundle.putLong("_id", j10);
            FragmentShowActivity.i2(context, null, ChannelEditorFragment.class, bundle);
        }

        public final Intent b(Context context, d5.a aVar) {
            m.e(context, "context");
            return d(this, context, aVar, null, null, 12, null);
        }

        public final Intent c(Context context, d5.a aVar, Long l10, Integer num) {
            m.e(context, "context");
            Bundle bundle = new Bundle();
            if (aVar != null && aVar.f10574h != 0) {
                bundle.putParcelable("channel", aVar);
            }
            if (l10 != null) {
                bundle.putLong("com.dw.ht.intent.extras.DEV_ID", l10.longValue());
            }
            if (num != null) {
                bundle.putInt("android.intent.extra.INDEX", num.intValue());
            }
            Intent intentE2 = FragmentShowActivity.e2(context, null, ChannelEditorFragment.class, bundle);
            m.d(intentE2, "getShowFragmentIntent(...)");
            return intentE2;
        }

        public final void e(Context context) {
            m.e(context, "context");
            FragmentShowActivity.h2(context, null, ChannelEditorFragment.class);
        }

        private Companion() {
        }
    }

    public ChannelEditorFragment() {
        d5.a aVarN = d5.a.n();
        m.d(aVarN, "createDefault(...)");
        this.oriChannel = aVarN;
        d5.a aVarN2 = d5.a.n();
        m.d(aVarN2, "createDefault(...)");
        this.mChannel = aVarN2;
        this.isSupportMediumPower = true;
        this.channelIndex = -1;
        this.showModulation = true;
        this.advancedMode = true;
    }

    private final String[] G4(int freq) {
        if (freq < 1 || d5.a.M(freq) > 0) {
            freq = 1;
        }
        String[] strArrK = d5.a.k(freq);
        m.d(strArrK, "buildSubAudioNames(...)");
        return strArrK;
    }

    static /* synthetic */ String[] H4(ChannelEditorFragment channelEditorFragment, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return channelEditorFragment.G4(i10);
    }

    private final void I4(int freq, boolean isTx) {
        t7.Companion aVar = t7.INSTANCE;
        Context contextX3 = x3();
        m.d(contextX3, "requireContext(...)");
        String strN1 = N1(isTx ? R.string.txCTCSS : R.string.rxCTCSS);
        m.b(strN1);
        aVar.a(contextX3, strN1, freq / 100, "").g4(j1(), isTx ? "tx_sub_audio" : "rx_sub_audio");
    }

    private final void J4() {
        p pVarE1 = e1();
        if (pVarE1 == null) {
            return;
        }
        if (!N4()) {
            this.mChannel.o(pVarE1.getContentResolver());
        }
        if (i1() != null) {
            Intent intent = new Intent();
            int i10 = this.channelIndex;
            if (i10 >= 0) {
                intent.putExtra("android.intent.extra.INDEX", i10);
            }
            pVarE1.setResult(-1, intent);
        }
        pVarE1.finish();
    }

    public static final void K4(Context context, long j10) {
        INSTANCE.a(context, j10);
    }

    public static final Intent L4(Context context, d5.a aVar) {
        return INSTANCE.b(context, aVar);
    }

    public static final Intent M4(Context context, d5.a aVar, Long l10, Integer num) {
        return INSTANCE.c(context, aVar, l10, num);
    }

    private final boolean N4() {
        return this.link != null && this.channelIndex >= 0;
    }

    private final void Q4() {
        x xVar;
        if (!this.inIIChannelEditor || (xVar = this.binding) == null) {
            return;
        }
        xVar.f21682q.setVisibility(8);
        xVar.f21686u.setVisibility(8);
        xVar.f21684s.setVisibility(8);
        xVar.f21671f.setVisibility(8);
        xVar.f21673h.setVisibility(8);
        xVar.f21679n.setVisibility(8);
        xVar.f21674i.setVisibility(8);
        xVar.f21680o.setVisibility(8);
    }

    public static final void R4(Context context) {
        INSTANCE.e(context);
    }

    public static final void S4(ChannelEditorFragment channelEditorFragment, DialogInterface dialogInterface, int i10) {
        channelEditorFragment.Y4();
    }

    public static final void T4(ChannelEditorFragment channelEditorFragment, DialogInterface dialogInterface, int i10) {
        p pVarE1 = channelEditorFragment.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    public static final void U4(ChannelEditorFragment channelEditorFragment, View view) {
        channelEditorFragment.Z4(true);
    }

    public static final void V4(ChannelEditorFragment channelEditorFragment, View view) {
        d5.a aVar = channelEditorFragment.mChannel;
        if (!aVar.D) {
            l5.Companion aVar2 = l5.INSTANCE;
            d0 d0Var = channelEditorFragment.rxFreqRange;
            Integer numValueOf = Integer.valueOf(aVar.f10574h);
            a.d dVar = channelEditorFragment.mChannel.f10575r;
            m.d(dVar, "rxModulation");
            aVar2.b(d0Var, numValueOf, dVar, channelEditorFragment.showModulation).g4(channelEditorFragment.j1(), "rx");
            return;
        }
        Context contextX3 = channelEditorFragment.x3();
        g0 g0Var = g0.f25951a;
        String strN1 = channelEditorFragment.N1(R.string.x_is_locked);
        m.d(strN1, "getString(...)");
        String str = String.format(strN1, Arrays.copyOf(new Object[]{channelEditorFragment.N1(R.string.rx_freq)}, 1));
        m.d(str, "format(...)");
        Toast.makeText(contextX3, str, 0).show();
    }

    public static final void W4(final ChannelEditorFragment channelEditorFragment, View view) {
        if (channelEditorFragment.isGMRS) {
            new c.a(channelEditorFragment.x3()).z("GMRS Channels").x(r.f(), r.v(channelEditorFragment.mChannel.f10573g), new DialogInterface.OnClickListener() { // from class: l4.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ChannelEditorFragment.X4(this.f20388a, dialogInterface, i10);
                }
            }).C();
            return;
        }
        d5.a aVar = channelEditorFragment.mChannel;
        if (!aVar.D) {
            l5.Companion aVar2 = l5.INSTANCE;
            d0 d0Var = channelEditorFragment.txFreqRange;
            Integer numValueOf = Integer.valueOf(aVar.f10573g);
            a.d dVar = channelEditorFragment.mChannel.f10576s;
            m.d(dVar, "txModulation");
            aVar2.b(d0Var, numValueOf, dVar, channelEditorFragment.showModulation).g4(channelEditorFragment.j1(), "tx");
            return;
        }
        Context contextX3 = channelEditorFragment.x3();
        g0 g0Var = g0.f25951a;
        String strN1 = channelEditorFragment.N1(R.string.x_is_locked);
        m.d(strN1, "getString(...)");
        String str = String.format(strN1, Arrays.copyOf(new Object[]{channelEditorFragment.N1(R.string.tx_freq)}, 1));
        m.d(str, "format(...)");
        Toast.makeText(contextX3, str, 0).show();
    }

    public static final void X4(ChannelEditorFragment channelEditorFragment, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        channelEditorFragment.a5(r.t(i10).G());
        d5.a aVarP = d5.a.p(channelEditorFragment.mChannel);
        if (aVarP != null) {
            channelEditorFragment.mChannel.i(aVarP.b());
        }
    }

    private final void Y4() {
        d5.a aVarH5 = h5(true);
        if (aVarH5 == null) {
            return;
        }
        aVarH5.i(this.mChannel.b());
        d5.a aVar = this.mChannel;
        aVarH5.f10579v = aVar.f10579v;
        aVarH5.E = aVar.E;
        aVarH5.D = aVar.D;
        aVarH5.F = aVar.F;
        c5(aVarH5);
        if (aVarH5.b() != 0 || aVarH5.f10574h != 0 || aVarH5.f10573g != 0) {
            aVarH5.L();
        }
        p pVarE1 = e1();
        if (pVarE1 == null) {
            return;
        }
        if (i1() != null) {
            Intent intent = new Intent((String) null, ContentUris.withAppendedId(a.C0096a.f6663a, aVarH5.b()));
            intent.putExtra("channel", aVarH5);
            int i10 = this.channelIndex;
            if (i10 >= 0) {
                intent.putExtra("android.intent.extra.INDEX", i10);
            }
            pVarE1.setResult(-1, intent);
        }
        pVarE1.finish();
    }

    private final void Z4(boolean z10) {
        x xVar;
        if (this.advancedMode == z10 || Cfg.f5482d || (xVar = this.binding) == null) {
            return;
        }
        this.advancedMode = z10;
        int i10 = z10 ? 0 : 8;
        xVar.f21685t.setVisibility(i10);
        xVar.f21678m.setVisibility(i10);
        xVar.f21687v.setVisibility(i10);
        xVar.f21667b.setVisibility(i10);
        xVar.f21673h.setVisibility(i10);
        xVar.f21679n.setVisibility(i10);
        if (this.showRev) {
            xVar.f21675j.setVisibility(i10);
        } else {
            xVar.f21675j.setVisibility(8);
        }
        if (x3().getResources().getBoolean(R.bool.ch_editor_pre_de_emph_dis)) {
            xVar.f21674i.setVisibility(8);
        } else {
            xVar.f21674i.setVisibility(i10);
        }
        if (z10) {
            xVar.f21677l.setTitle(N1(R.string.rx_freq));
            xVar.f21670e.setVisibility(8);
        } else {
            xVar.f21677l.setTitle(N1(R.string.freq));
            xVar.f21670e.setVisibility(0);
        }
        Q4();
    }

    private final void c5(d5.a aVar) {
        this.mChannel = aVar;
        d5.a aVarClone = aVar.clone();
        m.d(aVarClone, "clone(...)");
        this.oriChannel = aVarClone;
    }

    private final void f5(boolean all) {
        String str;
        String str2;
        x xVar = this.binding;
        if (xVar == null) {
            return;
        }
        d5.a aVar = this.mChannel;
        a.d dVar = aVar.f10576s;
        a.d dVar2 = a.d.FM;
        this.showModulation = (dVar == dVar2 && aVar.f10575r == dVar2 && !Cfg.P()) ? false : true;
        Z4(this.advancedMode || this.mChannel.D() || O4() != 0 || P4() != 0 || this.isGMRS);
        String str3 = "";
        if (this.showModulation) {
            ListItemView listItemView = xVar.f21685t;
            if (aVar.f10573g <= 0) {
                str2 = "";
            } else {
                str2 = aVar.f10576s + ' ' + aVar.z() + " MHz";
            }
            listItemView.setDetail(str2);
            ListItemView listItemView2 = xVar.f21677l;
            if (aVar.f10574h > 0) {
                str3 = aVar.f10575r + ' ' + aVar.v() + " MHz";
            }
            listItemView2.setDetail(str3);
        } else {
            ListItemView listItemView3 = xVar.f21685t;
            if (aVar.f10573g <= 0) {
                str = "";
            } else {
                str = aVar.z() + " MHz";
            }
            listItemView3.setDetail(str);
            ListItemView listItemView4 = xVar.f21677l;
            if (aVar.f10574h > 0) {
                str3 = aVar.v() + " MHz";
            }
            listItemView4.setDetail(str3);
        }
        int iM = d5.a.M(O4());
        if (iM > 0) {
            iM++;
        }
        if (iM == 0 && O4() != 0) {
            iM++;
        }
        xVar.f21678m.setDisplayedValues(G4(O4()));
        xVar.f21678m.setNumber(iM);
        int iM2 = d5.a.M(P4());
        if (iM2 > 0) {
            iM2++;
        }
        if (iM2 == 0 && P4() != 0) {
            iM2++;
        }
        xVar.f21687v.setDisplayedValues(G4(P4()));
        xVar.f21687v.setNumber(iM2);
        if (all) {
            if (this.isSupportMediumPower) {
                NumberPreferenceView numberPreferenceView = xVar.f21686u;
                int i10 = aVar.A;
                numberPreferenceView.setNumber(i10 != -2 ? i10 != 0 ? 0 : 2 : 1);
            } else {
                NumberPreferenceView numberPreferenceView2 = xVar.f21686u;
                int i11 = aVar.A;
                numberPreferenceView2.setNumber((i11 == -2 || i11 != 0) ? 0 : 1);
            }
            xVar.f21686u.setEnabled(!aVar.F);
            xVar.f21672g.setText(aVar.f10571e);
            xVar.f21667b.setNumber(aVar.B == 12500 ? 1 : 0);
            xVar.f21667b.setEnabled(!aVar.E);
            xVar.f21679n.setChecked(aVar.f10578u);
            xVar.f21673h.setChecked(aVar.f10577t);
            xVar.f21674i.setChecked(!aVar.f10580w);
            xVar.f21680o.setChecked(aVar.f10581x);
            xVar.f21684s.setChecked(aVar.C);
            xVar.f21671f.setChecked(aVar.G);
            xVar.f21668c.setChecked(aVar.H);
            xVar.f21675j.setChecked(aVar.I);
            xVar.f21676k.setNumber(aVar.K);
            xVar.f21683r.setNumber(aVar.J);
            xVar.f21681p.setNumber(aVar.L);
            xVar.f21669d.setNumber(aVar.M);
        }
    }

    static /* synthetic */ void g5(ChannelEditorFragment channelEditorFragment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        channelEditorFragment.f5(z10);
    }

    @Override // com.dw.android.widget.NumberPreferenceView.b
    public void B0(NumberPreferenceView view, int number, boolean byUser) {
        m.e(view, "view");
        if (byUser && number == 1) {
            int id2 = view.getId();
            if (id2 == R.id.rx_sub_audio) {
                I4(O4() < 1000 ? 0 : O4(), false);
            } else {
                if (id2 != R.id.tx_sub_audio) {
                    return;
                }
                I4(P4() >= 1000 ? P4() : 0, true);
            }
        }
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        m.e(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.delete) {
            J4();
            return true;
        }
        if (itemId == R.id.save) {
            Y4();
            return true;
        }
        if (itemId != R.id.share) {
            return super.F2(item);
        }
        i.b(x3(), this.mChannel);
        return true;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        mi.c.e().t(this);
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        mi.c.e().q(this);
    }

    public final int O4() {
        return this.mChannel.f10583z;
    }

    public final int P4() {
        return this.mChannel.f10582y;
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        g5(this, false, 1, null);
    }

    public final void a5(d5.a ch2) {
        if (ch2 == null) {
            ch2 = d5.a.n();
            m.d(ch2, "createDefault(...)");
        }
        c5(ch2);
        g5(this, false, 1, null);
    }

    public final void b5(boolean z10) {
        this.inIIChannelEditor = z10;
        G3(!z10);
    }

    @Override // v3.v
    protected boolean c4() {
        if (m.a(this.oriChannel, h5(false))) {
            return false;
        }
        new c.a(x3()).k(N1(R.string.saveChangesQ)).p(N1(android.R.string.cancel), null).t(R.string.save, new DialogInterface.OnClickListener() { // from class: l4.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ChannelEditorFragment.S4(this.f20376a, dialogInterface, i10);
            }
        }).n(N1(R.string.discard), new DialogInterface.OnClickListener() { // from class: l4.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                ChannelEditorFragment.T4(this.f20377a, dialogInterface, i10);
            }
        }).C();
        return true;
    }

    public final void d5(int i10) {
        this.mChannel.f10583z = i10;
    }

    public final void e5(int i10) {
        this.mChannel.f10582y = i10;
    }

    @Override // v3.v
    protected boolean f4(o sender, int what, int arg1, int arg2, Object obj) {
        t7 t7Var;
        String strP1;
        if ((sender instanceof t7) && (strP1 = (t7Var = (t7) sender).P1()) != null) {
            int iHashCode = strP1.hashCode();
            if (iHashCode != -603687330) {
                if (iHashCode == -345521892 && strP1.equals("tx_sub_audio")) {
                    e5(td.a.b(t7Var.v4() * 100));
                    f5(false);
                }
            } else if (strP1.equals("rx_sub_audio")) {
                d5(td.a.b(t7Var.v4() * 100));
                f5(false);
            }
        }
        return super.f4(sender, what, arg1, arg2, obj);
    }

    public final d5.a h5(boolean showMessage) {
        d0 d0Var;
        d0 d0Var2;
        x xVar = this.binding;
        if (xVar == null) {
            return null;
        }
        a.d dVar = this.mChannel.f10575r;
        m.d(dVar, "rxModulation");
        a.d dVar2 = this.advancedMode ? this.mChannel.f10576s : dVar;
        m.b(dVar2);
        d5.a aVar = this.mChannel;
        int i10 = aVar.f10574h;
        int i11 = this.advancedMode ? aVar.f10573g : i10;
        if (i10 != 0 && (d0Var2 = this.rxFreqRange) != null) {
            m.b(d0Var2);
            if (!d0Var2.m(i10, dVar)) {
                xVar.f21677l.requestFocus();
                if (showMessage) {
                    c.a aVarY = new c.a(x3()).y(R.string.err_rxFreqRange);
                    d0 d0Var3 = this.rxFreqRange;
                    m.b(d0Var3);
                    aVarY.k(d0Var3.toString()).m(android.R.string.ok, null).C();
                }
                return null;
            }
        }
        boolean z10 = true;
        if (i11 != 0 && (d0Var = this.txFreqRange) != null) {
            m.b(d0Var);
            if (!d0Var.m(i11, dVar2)) {
                Z4(true);
                xVar.f21685t.requestFocus();
                if (showMessage) {
                    c.a aVarY2 = new c.a(x3()).y(R.string.err_txFreqRange);
                    d0 d0Var4 = this.txFreqRange;
                    m.b(d0Var4);
                    aVarY2.k(d0Var4.toString()).m(android.R.string.ok, null).C();
                }
                return null;
            }
        }
        if (i10 < 0 || i11 < 0) {
            return null;
        }
        d5.a aVar2 = new d5.a();
        aVar2.f10574h = i10;
        aVar2.f10573g = i11;
        aVar2.f10575r = dVar;
        aVar2.f10576s = dVar2;
        String string = xVar.f21672g.getText().toString();
        int length = string.length() - 1;
        int i12 = 0;
        boolean z11 = false;
        while (i12 <= length) {
            boolean z12 = m.f(string.charAt(!z11 ? i12 : length), 32) <= 0;
            if (z11) {
                if (!z12) {
                    break;
                }
                length--;
            } else if (z12) {
                i12++;
            } else {
                z11 = true;
            }
        }
        aVar2.f10571e = string.subSequence(i12, length + 1).toString();
        if (this.isSupportMediumPower) {
            int number = xVar.f21686u.getNumber();
            if (number == 1) {
                i = -2;
            } else if (number == 2) {
                i = 0;
            }
            aVar2.A = i;
        } else {
            aVar2.A = xVar.f21686u.getNumber() == 1 ? 0 : -1;
        }
        aVar2.f10583z = O4();
        aVar2.f10582y = P4();
        aVar2.B = new int[]{25000, 12500}[xVar.f21667b.getNumber()];
        aVar2.f10578u = xVar.f21679n.isChecked();
        aVar2.f10577t = xVar.f21673h.isChecked();
        aVar2.f10580w = !xVar.f21674i.isChecked();
        if (!xVar.f21680o.isChecked() && !Cfg.f5490h) {
            z10 = false;
        }
        aVar2.f10581x = z10;
        aVar2.C = xVar.f21684s.isChecked();
        aVar2.G = xVar.f21671f.isChecked();
        aVar2.H = xVar.f21668c.isChecked();
        aVar2.I = xVar.f21675j.isChecked();
        aVar2.K = xVar.f21676k.getNumber();
        aVar2.J = xVar.f21683r.getNumber();
        aVar2.L = xVar.f21681p.getNumber();
        aVar2.M = xVar.f21669d.getNumber();
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    @mi.m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN_ORDERED)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessageEvent(s4.l5.b r5) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            rd.m.e(r5, r0)
            java.lang.String r0 = r5.b()
            java.lang.String r1 = "rx"
            boolean r1 = rd.m.a(r0, r1)
            if (r1 == 0) goto L56
            d5.a r0 = r4.mChannel
            java.math.BigDecimal r1 = r5.c()
            int r1 = r1.intValue()
            r0.f10574h = r1
            d5.a r0 = r4.mChannel
            d5.a$d r1 = r5.a()
            r0.f10575r = r1
            boolean r0 = r4.advancedMode
            if (r0 != 0) goto L72
            v4.d0 r0 = r4.txFreqRange
            if (r0 == 0) goto L41
            r1 = 1
            if (r0 == 0) goto L3d
            d5.a r2 = r4.mChannel
            int r3 = r2.f10574h
            d5.a$d r2 = r2.f10575r
            boolean r0 = r0.m(r3, r2)
            if (r0 != r1) goto L3d
            goto L41
        L3d:
            r4.Z4(r1)
            goto L72
        L41:
            d5.a r0 = r4.mChannel
            java.math.BigDecimal r1 = r5.c()
            int r1 = r1.intValue()
            r0.f10573g = r1
            d5.a r0 = r4.mChannel
            d5.a$d r5 = r5.a()
            r0.f10576s = r5
            goto L72
        L56:
            java.lang.String r1 = "tx"
            boolean r0 = rd.m.a(r0, r1)
            if (r0 == 0) goto L76
            d5.a r0 = r4.mChannel
            java.math.BigDecimal r1 = r5.c()
            int r1 = r1.intValue()
            r0.f10573g = r1
            d5.a r0 = r4.mChannel
            d5.a$d r5 = r5.a()
            r0.f10576s = r5
        L72:
            r5 = 0
            r4.f5(r5)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.channels.ChannelEditorFragment.onMessageEvent(s4.l5$b):void");
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        d5.a aVarF;
        d5.a aVarP;
        d0 d0Var;
        d0 d0Var2;
        a.d[] dVarArrJ;
        a.d[] dVarArrJ2;
        super.r2(savedInstanceState);
        G3(!this.inIIChannelEditor);
        Bundle bundleI1 = i1();
        if (bundleI1 == null) {
            return;
        }
        long j10 = bundleI1.getLong("com.dw.ht.intent.extras.DEV_ID");
        this.channelIndex = bundleI1.getInt("android.intent.extra.INDEX", -1);
        this.showBCLO = Cfg.O().getShowBCLOInChannelEditor();
        if (j10 != 0) {
            l1 l1VarL = u.w().l(j10);
            this.link = l1VarL;
            if (l1VarL != null) {
                this.txFreqRange = l1VarL.h0();
                this.rxFreqRange = l1VarL.d0();
                a0 a0VarD = l1VarL.d();
                n nVar = a0VarD instanceof n ? (n) a0VarD : null;
                if (nVar != null) {
                    this.isSupportMediumPower = nVar.Q();
                    this.isGMRS = nVar.P();
                    this.isSupportDMR = nVar.u() || !(((d0Var = this.txFreqRange) == null || (dVarArrJ2 = d0Var.j()) == null || !j.z(dVarArrJ2, a.d.DMR)) && ((d0Var2 = this.rxFreqRange) == null || (dVarArrJ = d0Var2.j()) == null || !j.z(dVarArrJ, a.d.DMR)));
                    this.showBCLO = nVar.t(a0.d.BusyChannelLockoutInChannelConfig);
                    this.showGroupID = this.isSupportDMR && nVar.t(a0.d.GroupID);
                    this.showRev = nVar.t(a0.d.ReverseFrequency);
                }
            }
        }
        d5.a aVar = (d5.a) bundleI1.getParcelable("channel");
        if (aVar != null) {
            if (aVar.b() == 0 && (aVarP = d5.a.p(aVar)) != null) {
                aVar.i(aVarP.b());
            }
            c5(aVar);
            return;
        }
        long j11 = bundleI1.getLong("_id", -1L);
        if (((int) j11) == -1 || (aVarF = d5.a.F(j11)) == null) {
            return;
        }
        c5(aVarF);
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        MenuItem menuItemFindItem;
        m.e(menu, "menu");
        m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.o_channel_editor, menu);
        if (this.mChannel.b() != 0 || N4() || (menuItemFindItem = menu.findItem(R.id.delete)) == null) {
            return;
        }
        menuItemFindItem.setVisible(false);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        z4((this.mChannel.b() != 0 || N4()) ? N1(R.string.editChannel) : N1(R.string.newChannel));
        x xVarC = x.c(inflater, container, false);
        m.d(xVarC, "inflate(...)");
        this.binding = xVarC;
        xVarC.f21670e.setOnClickListener(new View.OnClickListener() { // from class: l4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChannelEditorFragment.U4(this.f20380a, view);
            }
        });
        boolean z10 = true;
        String[] strArrH4 = H4(this, 0, 1, null);
        xVarC.f21678m.setDisplayedValues(strArrH4);
        xVarC.f21678m.setOnNumberChangeListener(this);
        xVarC.f21687v.setDisplayedValues(strArrH4);
        xVarC.f21687v.setOnNumberChangeListener(this);
        if (Cfg.f5490h) {
            xVarC.f21680o.setVisibility(8);
        }
        Z4(false);
        if (!this.mChannel.D() && !this.isGMRS) {
            z10 = false;
        }
        Z4(z10);
        String[] stringArray = H1().getStringArray(this.isSupportMediumPower ? R.array.txPowerArray : R.array.txPowerLH);
        m.d(stringArray, "getStringArray(...)");
        xVarC.f21686u.setDisplayedValues(stringArray);
        Q4();
        xVarC.f21677l.setOnClickListener(new View.OnClickListener() { // from class: l4.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChannelEditorFragment.V4(this.f20382a, view);
            }
        });
        xVarC.f21685t.setOnClickListener(new View.OnClickListener() { // from class: l4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChannelEditorFragment.W4(this.f20385a, view);
            }
        });
        if (x3().getResources().getBoolean(R.bool.ch_editor_pre_de_emph_dis)) {
            xVarC.f21674i.setVisibility(8);
        } else if (Cfg.f5482d && Cfg.f5486f) {
            xVarC.f21674i.setVisibility(0);
        }
        if (this.isSupportDMR) {
            xVarC.f21676k.setVisibility(0);
            xVarC.f21683r.setVisibility(0);
            xVarC.f21681p.setVisibility(0);
            if (this.showGroupID) {
                xVarC.f21669d.setVisibility(0);
            }
        }
        xVarC.f21668c.setVisibility(this.showBCLO ? 0 : 8);
        xVarC.f21675j.setVisibility((this.showRev && this.advancedMode) ? 0 : 8);
        ScrollView scrollViewB = xVarC.b();
        m.d(scrollViewB, "getRoot(...)");
        return scrollViewB;
    }

    @Override // com.dw.android.widget.NumberPreferenceView.b
    public void y0(NumberPreferenceView view, int from, int to, boolean byUser) {
        m.e(view, "view");
        if (byUser && to != 1) {
            int id2 = view.getId();
            if (id2 == R.id.rx_sub_audio) {
                d5(to == 0 ? 0 : a.C0096a.f6664b[to - 1]);
                f5(false);
            } else {
                if (id2 != R.id.tx_sub_audio) {
                    return;
                }
                e5(to == 0 ? 0 : a.C0096a.f6664b[to - 1]);
                f5(false);
            }
        }
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
