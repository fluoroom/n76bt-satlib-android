package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.ListItemView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.ht.Cfg;
import com.dw.ht.fragments.DeviceFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import s4.d;
import v3.q;
import v4.a0;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0006J+\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010\u0006J!\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020&H\u0016¢\u0006\u0004\b.\u0010/J'\u00103\u001a\u00020\n2\u0006\u0010*\u001a\u0002002\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u00104J;\u0010<\u001a\u00020\u00072\b\u00106\u001a\u0004\u0018\u0001052\u0006\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u00182\b\u0010;\u001a\u0004\u0018\u00010:H\u0014¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\nH\u0016¢\u0006\u0004\b>\u0010\u0006J\u000f\u0010?\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u0010\u0006J\u0019\u0010B\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010@H\u0017¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\n¢\u0006\u0004\bD\u0010\u0006J\u001f\u0010H\u001a\u00020\n2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020JH\u0007¢\u0006\u0004\bB\u0010KR$\u0010S\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0016\u0010V\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010YR$\u0010a\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u00078\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b^\u0010U\"\u0004\b_\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\"\u0010i\u001a\u0010\u0012\f\u0012\n f*\u0004\u0018\u00010\f0\f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010l\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010n\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010kR\u0016\u0010p\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010cR\u0016\u0010s\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR$\u0010v\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u00078B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bt\u0010\t\"\u0004\bu\u0010`R\u0014\u0010y\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006z"}, d2 = {"Ls4/b7;", "Lcom/dw/ht/fragments/DeviceFragment;", "Lcom/dw/android/widget/NumberPreferenceView$c;", "Landroid/view/View$OnClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "", "F5", "()Z", "Ldd/d0;", "N5", "", "path", "d6", "(Ljava/lang/String;)V", "h6", "g6", "Lv4/q;", "bc", "L5", "(Lv4/q;)V", "i6", "j6", "", "interval", "K5", "(I)I", "index", "J5", "k6", "M5", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "onClick", "(Landroid/view/View;)V", "Lcom/dw/android/widget/NumberPreferenceView;", "from", "number", "f", "(Lcom/dw/android/widget/NumberPreferenceView;II)V", "Landroidx/fragment/app/o;", "sender", "what", "arg1", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "M2", "H2", "Lv4/l1$e;", "event", "onMessageEvent", "(Lv4/l1$e;)V", "c6", "Landroid/widget/CompoundButton;", "buttonView", "isChecked", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "Lv4/l1$f;", "(Lv4/l1$f;)V", "Lm4/m1;", "P0", "Lm4/m1;", "getBinding", "()Lm4/m1;", "setBinding", "(Lm4/m1;)V", "binding", "Q0", "Z", "inUpdateView", "", "R0", "[I", "intervals", "S0", "smartBeaconMinIntervals", "value", "T0", "e6", "(Z)V", "isSmartBeaconIntervalShowing", "U0", "Ljava/lang/String;", "aprsSymbol", "Lf/c;", "kotlin.jvm.PlatformType", "V0", "Lf/c;", "getAprsSymbol", "W0", "I", "autoShareLocChVisibility", "X0", "aprsPathVisibility", "Y0", "devCertifiedCallSign", "Z0", "Lv4/q;", "config", "I5", "f6", "syncSettings", "H5", "()I", "autoShareLocCH", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b7 extends DeviceFragment implements NumberPreferenceView.c, View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private m4.m1 binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private boolean inUpdateView = true;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private final int[] intervals;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private final int[] smartBeaconMinIntervals;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private boolean isSmartBeaconIntervalShowing;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private String aprsSymbol;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private final f.c getAprsSymbol;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    private int autoShareLocChVisibility;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    private int aprsPathVisibility;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    private String devCertifiedCallSign;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    private v4.q config;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26380a;

        static {
            int[] iArr = new int[l1.e.values().length];
            try {
                iArr[l1.e.SETTINGS_SYNCING_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l1.e.SETTINGS_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26380a = iArr;
        }
    }

    public b7() {
        this.intervals = Cfg.f5482d ? new int[]{0, 60000, 120000, 300000, 600000, 900000} : new int[]{0, 10000, 20000, 30000, 40000, 50000, 60000, 120000, 180000, 240000, 300000, 360000, 420000, 480000, 540000, 600000, 900000, 1200000, 1500000, 1800000};
        this.smartBeaconMinIntervals = new int[]{10000, 20000, 30000, 40000, 50000, 60000, 120000, 180000, 240000, 300000, 360000, 420000, 480000, 540000, 600000, 900000, 1200000, 1500000, 1800000};
        f.c cVarR3 = r3(new d.a(), new f.b() { // from class: s4.m6
            @Override // f.b
            public final void a(Object obj) {
                b7.G5(this.f26608a, (String) obj);
            }
        });
        rd.m.d(cVarR3, "registerForActivityResult(...)");
        this.getAprsSymbol = cVarR3;
        this.autoShareLocChVisibility = 8;
        this.aprsPathVisibility = 8;
        this.devCertifiedCallSign = "";
        this.config = new v4.q();
    }

    public final boolean F5() {
        m4.m1 m1Var = this.binding;
        if (m1Var == null) {
            return false;
        }
        String upperCase = rg.q.W0(m1Var.f21349j.getText().toString()).toString().toUpperCase(Locale.ROOT);
        rd.m.d(upperCase, "toUpperCase(...)");
        if (!rg.q.e0(upperCase)) {
            m1Var.f21364y.setText(R.string.correct);
            return true;
        }
        m1Var.f21364y.setText("");
        m1Var.f21354o.setNumber(0);
        return false;
    }

    public static final void G5(b7 b7Var, String str) {
        ListItemView listItemView;
        if (str == null) {
            return;
        }
        b7Var.aprsSymbol = str;
        b7Var.config.G(str);
        m4.m1 m1Var = b7Var.binding;
        if (m1Var == null || (listItemView = m1Var.f21343d) == null) {
            return;
        }
        listItemView.setDetail(b7Var.config.i());
        listItemView.setDetailDrawable(new BitmapDrawable(b7Var.H1(), o5.a.b().c(b7Var.config.i())));
        b7Var.M5();
    }

    private final int H5() {
        v4.l1 l1VarY4 = Y4();
        v4.c0 c0Var = l1VarY4 instanceof v4.c0 ? (v4.c0) l1VarY4 : null;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.c2().f29706u;
    }

    private final boolean I5() {
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            return rd.m.a(l1VarY4.g0(), Boolean.TRUE);
        }
        return false;
    }

    private final int J5(int index) {
        if (index < 0) {
            return 0;
        }
        int[] iArr = this.intervals;
        return index < iArr.length ? iArr[index] : iArr[iArr.length - 1];
    }

    private final int K5(int interval) {
        Object next;
        Iterator it = ed.j.F(this.intervals).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (interval <= this.intervals[((Number) next).intValue()]) {
                break;
            }
        }
        Integer num = (Integer) next;
        return num != null ? num.intValue() : this.intervals.length - 1;
    }

    private final void L5(v4.q bc2) {
        v4.q qVarG = bc2.g();
        this.config = qVarG;
        if (Cfg.f5492i) {
            qVarG.W(false);
        }
        String str = this.aprsSymbol;
        if (str != null) {
            this.config.G(str);
        }
        if (this.config.A()) {
            String upperCase = rg.q.W0(this.config.k()).toString().toUpperCase(Locale.ROOT);
            rd.m.d(upperCase, "toUpperCase(...)");
            this.devCertifiedCallSign = upperCase;
        }
        j6();
    }

    public final void M5() {
        if (this.inUpdateView) {
            return;
        }
        c6();
    }

    private final void N5() {
        boolean zI5 = I5();
        m4.m1 m1Var = this.binding;
        if (m1Var != null) {
            if (zI5) {
                m1Var.K.setVisibility(8);
                m1Var.f21358s.setVisibility(8);
                m1Var.f21351l.setVisibility(8);
                m1Var.f21348i.setVisibility(8);
                if (this.autoShareLocChVisibility == 8 && this.aprsPathVisibility == 8) {
                    m1Var.f21342c.setVisibility(8);
                } else {
                    m1Var.f21344e.setVisibility(0);
                }
                m1Var.f21345f.setVisibility(8);
                m1Var.f21347h.setVisibility(this.autoShareLocChVisibility);
                m1Var.f21357r.setVisibility(0);
            } else {
                m1Var.K.setVisibility(0);
                m1Var.f21358s.setVisibility(0);
                if (rd.m.a(Z4(), Boolean.TRUE)) {
                    m1Var.f21351l.setVisibility(8);
                } else {
                    m1Var.f21351l.setVisibility(0);
                }
                m1Var.f21348i.setVisibility(0);
                if (this.autoShareLocChVisibility == 8 && this.aprsPathVisibility == 8) {
                    m1Var.f21342c.setVisibility(8);
                } else {
                    m1Var.f21342c.setVisibility(0);
                }
                m1Var.f21345f.setVisibility(0);
                m1Var.f21347h.setVisibility(8);
                m1Var.f21357r.setVisibility(8);
            }
            m1Var.J.setChecked(zI5);
        }
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            l1VarY4.l1(Boolean.valueOf(zI5));
        }
    }

    public static final void O5(b7 b7Var, CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        b7Var.f6(z10);
    }

    public static final void P5(ListItemView listItemView, b7 b7Var, View view) {
        Context context = view.getContext();
        CharSequence title = listItemView.getTitle();
        CharSequence detail = listItemView.getDetail();
        q.b bVar = new q.b(context, title, null, detail != null ? detail.toString() : null, null, 0);
        bVar.f29597v = new r3.a(v4.q.f30039z.d() * 2);
        v3.q.q4(bVar).g4(b7Var.j1(), "edit_nickname");
    }

    public static final void Q5(final m4.m1 m1Var, final b7 b7Var, View view) {
        String strValueOf = String.valueOf(m1Var.f21344e.getDetail());
        final ArrayList arrayListB = a6.o.b("WIDE1-1,WIDE2-1", "WIDE1-1,WIDE2-2", "WIDE2-1", "WIDE2-2", "ARISS,SGATE,WIDE2-1", b7Var.N1(R.string.customize));
        if (!arrayListB.contains(strValueOf)) {
            arrayListB.add(0, strValueOf);
        }
        new c.a(view.getContext()).z(m1Var.f21344e.getTitle()).x((CharSequence[]) arrayListB.toArray(d4.c.f10567g), arrayListB.indexOf(strValueOf), new DialogInterface.OnClickListener() { // from class: s4.o6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                b7.R5(arrayListB, b7Var, m1Var, dialogInterface, i10);
            }
        }).C();
    }

    public static final void R5(ArrayList arrayList, b7 b7Var, m4.m1 m1Var, DialogInterface dialogInterface, int i10) {
        if (i10 < arrayList.size() - 1) {
            Object obj = arrayList.get(i10);
            rd.m.d(obj, "get(...)");
            b7Var.d6((String) obj);
        } else {
            v3.q.o4(b7Var.x3(), m1Var.f21344e.getTitle(), null, String.valueOf(m1Var.f21344e.getDetail()), "ARISS,SGATE,WIDE2-1").g4(b7Var.j1(), "aprs_path");
        }
        dialogInterface.dismiss();
    }

    public static final void S5(final b7 b7Var, final m4.m1 m1Var, NumberPreferenceView numberPreferenceView, final int i10, final int i11) {
        rd.m.e(numberPreferenceView, "<unused var>");
        if (b7Var.inUpdateView) {
            return;
        }
        int iK5 = b7Var.K5(60000);
        if ((i11 > 0 && i10 == 0) || (i11 + 1 <= iK5 && iK5 <= i10 && i11 > 0)) {
            new c.a(b7Var.x3()).j(R.string.turnOnAutomaticLocationSharingTips).t(R.string.enable, new DialogInterface.OnClickListener() { // from class: s4.p6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    b7.T5(this.f26658a, i11, m1Var, dialogInterface, i12);
                }
            }).m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: s4.q6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    b7.U5(m1Var, i10, b7Var, dialogInterface, i12);
                }
            }).q(new DialogInterface.OnCancelListener() { // from class: s4.r6
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    b7.V5(m1Var, i10, b7Var, dialogInterface);
                }
            }).C();
            return;
        }
        b7Var.config.P(b7Var.J5(i11));
        if (i11 > 0) {
            m1Var.f21350k.setChecked(true);
        }
        b7Var.M5();
    }

    public static final void T5(b7 b7Var, int i10, m4.m1 m1Var, DialogInterface dialogInterface, int i11) {
        b7Var.config.P(b7Var.J5(i10));
        m1Var.f21350k.setChecked(true);
        b7Var.M5();
    }

    public static final void U5(m4.m1 m1Var, int i10, b7 b7Var, DialogInterface dialogInterface, int i11) {
        m1Var.f21361v.setNumber(i10);
        b7Var.M5();
    }

    public static final void V5(m4.m1 m1Var, int i10, b7 b7Var, DialogInterface dialogInterface) {
        m1Var.f21361v.setNumber(i10);
        b7Var.M5();
    }

    public static final void W5(b7 b7Var, NumberPreferenceView numberPreferenceView, int i10, int i11) {
        rd.m.e(numberPreferenceView, "<unused var>");
        if (b7Var.inUpdateView || !b7Var.isSmartBeaconIntervalShowing) {
            return;
        }
        b7Var.config.P(b7Var.J5(i11));
        b7Var.M5();
    }

    public static final void X5(b7 b7Var, NumberPreferenceView numberPreferenceView, int i10, int i11) {
        rd.m.e(numberPreferenceView, "<unused var>");
        if (b7Var.inUpdateView || !b7Var.isSmartBeaconIntervalShowing) {
            return;
        }
        b7Var.config.Y(i11);
        b7Var.M5();
    }

    public static final void Y5(b7 b7Var, m4.m1 m1Var, CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        if (b7Var.inUpdateView) {
            return;
        }
        m1Var.f21361v.setNumber(z10 ? b7Var.K5(b7Var.config.t()) : 0);
        b7Var.M5();
    }

    public static final void Z5(View view) {
        FragmentShowActivity.i2(view.getContext(), null, n5.o0.class, null);
    }

    public static final void a6(b7 b7Var, m4.m1 m1Var, NumberPreferenceView numberPreferenceView, int i10, int i11) {
        rd.m.e(numberPreferenceView, "<unused var>");
        if (b7Var.inUpdateView) {
            return;
        }
        if (i11 == 1 && !b7Var.F5()) {
            Toast.makeText(b7Var.x3(), R.string.pleaseProvideCallSign, 1).show();
            m1Var.f21349j.requestFocus();
        } else {
            if (b7Var.config.A() != (i11 == 1)) {
                b7Var.M5();
            }
        }
    }

    public static final void b6(m4.m1 m1Var, b7 b7Var, View view) {
        Context context = view.getContext();
        CharSequence title = m1Var.A.getTitle();
        CharSequence detail = m1Var.A.getDetail();
        q.b bVar = new q.b(context, title, null, detail != null ? detail.toString() : null, null, 0);
        bVar.f29597v = new r3.a(v4.q.f30039z.c());
        v3.q.q4(bVar).g4(b7Var.j1(), "edit_position_report_message");
    }

    private final void d6(String path) {
        v4.c0 c0VarW4;
        v4.q qVarT;
        String strP = w5.c.p(path, 8, 8);
        rd.m.d(strP, "formatRepeater(...)");
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            v4.v vVar = v4.v.SET_APRS_PATH;
            byte[] bytes = strP.getBytes(rg.d.f26007b);
            rd.m.d(bytes, "getBytes(...)");
            l1VarY4.a(vVar, Arrays.copyOf(bytes, bytes.length));
        }
        m4.m1 m1Var = this.binding;
        if (m1Var == null) {
            return;
        }
        if (strP.length() == 0 && (c0VarW4 = W4()) != null && (qVarT = c0VarW4.T()) != null && qVarT.y() > 0) {
            strP = "WIDE" + qVarT.y() + '-' + qVarT.y();
        }
        m1Var.f21344e.setDetail(strP);
    }

    private final void e6(boolean z10) {
        if (this.isSmartBeaconIntervalShowing == z10) {
            return;
        }
        this.isSmartBeaconIntervalShowing = z10;
        i6();
    }

    private final void f6(boolean z10) {
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            l1VarY4.l1(Boolean.valueOf(z10));
        }
        N5();
    }

    private final void g6() {
        m4.m1 m1Var = this.binding;
        if (m1Var != null) {
            m1Var.B.setSummary(r3.a.b(String.valueOf(m1Var.f21360u.getDetail()), "utf-8", v4.q.f30039z.d()));
        }
    }

    private final void h6() {
        m4.m1 m1Var = this.binding;
        if (m1Var == null) {
            return;
        }
        int iD = this.config.D();
        if (iD <= 0) {
            m1Var.I.setText(R.string.notSet);
        } else {
            m1Var.I.setText(String.valueOf(iD));
        }
    }

    private final void i6() {
        m4.m1 m1Var = this.binding;
        if (m1Var == null) {
            return;
        }
        int i10 = this.isSmartBeaconIntervalShowing ? 0 : 8;
        m1Var.G.setVisibility(i10);
        m1Var.H.setVisibility(i10);
        m1Var.f21361v.setVisibility(this.isSmartBeaconIntervalShowing ? 8 : 0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void j6() {
        v4.a0 a0VarD;
        m4.m1 m1Var = this.binding;
        if (m1Var == null) {
            return;
        }
        this.inUpdateView = true;
        v4.q qVar = this.config;
        m1Var.D.setChecked(qVar.r());
        m1Var.B.setChecked(qVar.q() || qVar.s());
        m1Var.f21360u.setDetail(qVar.w());
        g6();
        m1Var.f21350k.setChecked(qVar.j());
        m1Var.F.setChecked(qVar.B());
        m1Var.f21361v.setNumber(qVar.j() ? K5(qVar.t()) : 0);
        m1Var.f21365z.setChecked(qVar.z());
        m1Var.A.setDetail(qVar.u());
        m1Var.H.setNumber(K5(qVar.t()));
        m1Var.G.setNumber(qVar.C() == 0 ? 30 : qVar.C());
        v4.l1 l1VarY4 = Y4();
        e6(l1VarY4 != null && (a0VarD = l1VarY4.d()) != null && a0VarD.w() && a0VarD.t(a0.d.SmartBeaconMaxInterval) && qVar.B());
        m1Var.f21362w.setNumber(qVar.v());
        m1Var.E.setNumber(qVar.y());
        m1Var.f21355p.setNumber(qVar.p());
        m1Var.C.setChecked(qVar.x());
        m1Var.f21346g.setNumber(H5());
        m1Var.f21347h.setNumber(H5());
        m1Var.f21354o.setNumber(qVar.A() ? 1 : 0);
        m1Var.f21341b.setChecked(qVar.h());
        h6();
        m1Var.f21353n.setChecked(qVar.o());
        ListItemView listItemView = m1Var.f21344e;
        v4.l1 l1VarY42 = Y4();
        listItemView.setDetail(l1VarY42 != null ? l1VarY42.Q() : null);
        String strK = qVar.k();
        Locale locale = Locale.ROOT;
        String upperCase = strK.toUpperCase(locale);
        rd.m.d(upperCase, "toUpperCase(...)");
        String upperCase2 = m1Var.f21349j.getText().toString().toUpperCase(locale);
        rd.m.d(upperCase2, "toUpperCase(...)");
        if (!rd.m.a(upperCase, upperCase2)) {
            m1Var.f21349j.setText(qVar.k());
        }
        m1Var.f21343d.setDetail(this.config.i());
        m1Var.f21343d.setDetailDrawable(new BitmapDrawable(H1(), o5.a.b().c(this.config.i())));
        if (Cfg.X(qVar.k())) {
            m1Var.f21363x.setText(u5.a.p(qVar.k()));
        }
        F5();
        this.inUpdateView = false;
    }

    private final void k6() {
        v4.q qVar = this.config;
        m4.m1 m1Var = this.binding;
        if (m1Var == null) {
            return;
        }
        qVar.N(m1Var.D.isChecked());
        qVar.M(m1Var.B.isChecked());
        qVar.O(m1Var.B.isChecked());
        qVar.S(rg.q.W0(String.valueOf(m1Var.B.getSummary())).toString());
        qVar.H(m1Var.f21350k.isChecked());
        qVar.X(m1Var.F.isChecked());
        qVar.P(J5(m1Var.f21361v.getNumber()));
        qVar.V(m1Var.f21365z.isChecked());
        qVar.Q(rg.q.W0(String.valueOf(m1Var.A.getDetail())).toString());
        if (this.isSmartBeaconIntervalShowing) {
            qVar.P(J5(m1Var.H.getNumber()));
            qVar.Y(m1Var.G.getNumber());
        }
        qVar.R(m1Var.f21362w.getNumber());
        qVar.U(m1Var.E.getNumber());
        qVar.L(m1Var.f21355p.getNumber());
        String string = rg.q.W0(m1Var.f21349j.getText().toString()).toString();
        Locale locale = Locale.getDefault();
        rd.m.d(locale, "getDefault(...)");
        String upperCase = string.toUpperCase(locale);
        rd.m.d(upperCase, "toUpperCase(...)");
        qVar.I(upperCase);
        qVar.W(m1Var.f21354o.getNumber() != 0);
        qVar.K(m1Var.f21353n.isChecked());
        qVar.F(m1Var.f21341b.isChecked());
        qVar.T(m1Var.C.isChecked());
        if (qVar.x()) {
            qVar.N(true);
        }
        if (Cfg.f5482d) {
            qVar.N(m1Var.B.isChecked());
            qVar.F(m1Var.B.isChecked());
        }
        if (Cfg.f5492i) {
            qVar.W(false);
        }
        if (F5()) {
            Cfg.f(qVar.k());
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        M5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            f6(rd.m.a(l1VarY4.g0(), Boolean.TRUE));
            v4.q qVarT = l1VarY4.T();
            rd.m.d(qVarT, "getBssConfig(...)");
            L5(qVarT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0274  */
    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Q2(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.b7.Q2(android.view.View, android.os.Bundle):void");
    }

    public final void c6() {
        k6();
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null ? rd.m.a(l1VarY4.g0(), Boolean.TRUE) : false) {
            v4.l1 l1VarY42 = Y4();
            if (l1VarY42 != null) {
                l1VarY42.b1(com.dw.ht.user.b.f6853a.b().g().f(this.config));
                return;
            }
            return;
        }
        v4.l1 l1VarY43 = Y4();
        if (l1VarY43 != null) {
            l1VarY43.b1(this.config.g());
        }
    }

    @Override // com.dw.android.widget.NumberPreferenceView.c
    public void f(NumberPreferenceView view, int from, int number) {
        rd.m.e(view, "view");
        v4.l1 l1VarY4 = Y4();
        v4.c0 c0Var = l1VarY4 instanceof v4.c0 ? (v4.c0) l1VarY4 : null;
        if (c0Var == null) {
            return;
        }
        v4.a2 a2VarC2 = c0Var.c2();
        rd.m.d(a2VarC2, "getSettings(...)");
        m4.m1 m1Var = this.binding;
        if (m1Var == null) {
            return;
        }
        switch (view.getId()) {
            case R.id.auto_share_loc_ch /* 2131296437 */:
            case R.id.auto_share_loc_ch2 /* 2131296438 */:
                if (a2VarC2.f29706u == number) {
                    return;
                }
                a2VarC2.f29706u = number;
                m1Var.f21346g.setNumber(number);
                m1Var.f21347h.setNumber(number);
                break;
            case R.id.forward_ttl /* 2131296773 */:
            case R.id.send_ttl /* 2131297363 */:
                M5();
                break;
            default:
                return;
        }
        c0Var.A2();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o sender, int what, int arg1, int arg2, Object obj) {
        String strP1;
        ListItemView listItemView;
        ListItemView listItemView2;
        if (sender != null && (strP1 = sender.P1()) != null) {
            switch (strP1.hashCode()) {
                case -406415613:
                    if (strP1.equals("edit_nickname")) {
                        if (what == R.id.what_dialog_onclick && arg1 == -1) {
                            m4.m1 m1Var = this.binding;
                            if (m1Var != null && (listItemView = m1Var.f21360u) != null) {
                                listItemView.setDetail(String.valueOf(obj));
                            }
                            g6();
                            M5();
                        }
                        return true;
                    }
                    break;
                case -123436972:
                    if (strP1.equals("aprs_path")) {
                        if (arg1 == -1) {
                            String str = (String) obj;
                            if (str == null) {
                                str = "";
                            }
                            d6(str);
                        }
                        return true;
                    }
                    break;
                case 3539835:
                    if (strP1.equals("ssid")) {
                        if (arg1 == -1) {
                            this.config.Z(arg2);
                            h6();
                            M5();
                        }
                        return true;
                    }
                    break;
                case 1859533469:
                    if (strP1.equals("edit_position_report_message")) {
                        if (what == R.id.what_dialog_onclick && arg1 == -1) {
                            m4.m1 m1Var2 = this.binding;
                            if (m1Var2 != null && (listItemView2 = m1Var2.A) != null) {
                                listItemView2.setDetail(String.valueOf(obj));
                            }
                            M5();
                        }
                        return true;
                    }
                    break;
            }
        }
        return super.f4(sender, what, arg1, arg2, obj);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        rd.m.e(buttonView, "buttonView");
        if (this.inUpdateView) {
            return;
        }
        if (this.config.x()) {
            m4.m1 m1Var = this.binding;
            if (rd.m.a(buttonView, m1Var != null ? m1Var.D : null) && !isChecked) {
                buttonView.setChecked(true);
                Toast.makeText(buttonView.getContext(), R.string.loc_share_use_by_aprs, 1).show();
                return;
            }
        }
        M5();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        rd.m.e(v10, "v");
        int id2 = v10.getId();
        if (id2 == R.id.aprs_icon) {
            this.getAprsSymbol.a(this.config.i());
            return;
        }
        if (id2 == R.id.get_passcode) {
            v3.j.e(k1(), new Intent("android.intent.action.VIEW", Uri.parse("http://go.benshikj.com/aprs.get_passcode")));
            return;
        }
        if (id2 != R.id.ssid) {
            return;
        }
        String[] strArr = new String[16];
        for (int i10 = 0; i10 < 16; i10++) {
            strArr[i10] = String.valueOf(i10);
        }
        strArr[0] = N1(R.string.notSet);
        v3.a0.l4(N1(R.string.setSSID), null, null, this.config.D(), 0, 15, strArr).g4(j1(), "ssid");
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    public void onMessageEvent(l1.e event) {
        v4.l1 l1VarY4;
        super.onMessageEvent(event);
        if ((event == null ? -1 : a.f26380a[event.ordinal()]) != 1 || (l1VarY4 = Y4()) == null) {
            return;
        }
        f6(rd.m.a(l1VarY4.g0(), Boolean.TRUE));
        v4.q qVarT = l1VarY4.T();
        rd.m.d(qVarT, "getBssConfig(...)");
        L5(qVarT);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.m1 m1VarC = m4.m1.c(inflater, container, false);
        this.binding = m1VarC;
        rd.m.b(m1VarC);
        ScrollView scrollViewB = m1VarC.b();
        rd.m.d(scrollViewB, "getRoot(...)");
        return scrollViewB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(l1.f event) {
        rd.m.e(event, "event");
        if (a.f26380a[event.f29977a.ordinal()] == 2 && rd.m.a(event.f29978b, W4())) {
            v4.q qVarT = event.f29978b.T();
            rd.m.d(qVarT, "getBssConfig(...)");
            L5(qVarT);
        }
    }

    public static final class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (!b7.this.inUpdateView && b7.this.F5()) {
                b7.this.M5();
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
