package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.activitys.MessageListActivity;
import com.dw.ht.provider.a;
import com.dw.ht.satellite.a;
import com.dw.widget.InsetsLayout;
import com.facebook.stetho.websocket.CloseCodes;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import s4.a6;
import s4.l5;
import s4.t7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0004J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'J;\u0010/\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0007H\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\u0007H\u0016¢\u0006\u0004\b2\u0010\u0004R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R*\u0010>\u001a\u00020\n2\u0006\u00107\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010F\u001a\u00020?2\u0006\u00107\u001a\u00020?8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER.\u0010L\u001a\u0004\u0018\u00010\u00052\b\u00107\u001a\u0004\u0018\u00010\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010\tR$\u0010T\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010X\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010A\u001a\u0004\bV\u0010C\"\u0004\bW\u0010ER\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R(\u0010b\u001a\u0004\u0018\u00010]2\b\u00107\u001a\u0004\u0018\u00010]8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR(\u0010e\u001a\u0004\u0018\u00010]2\b\u00107\u001a\u0004\u0018\u00010]8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010_\"\u0004\bd\u0010aR\u0013\u0010h\u001a\u0004\u0018\u00010?8F¢\u0006\u0006\u001a\u0004\bf\u0010gR(\u0010n\u001a\u0004\u0018\u00010i2\b\u00107\u001a\u0004\u0018\u00010i8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m¨\u0006o"}, d2 = {"Ls4/s;", "Lv3/v;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Ld5/d;", "item", "Ldd/d0;", "v4", "(Ld5/d;)V", "", "freq", "", "isTx", "p4", "(IZ)V", "force", "E4", "(Z)V", "C4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "onClick", "(Landroid/view/View;)V", "y2", "Ls4/l5$b;", "event", "onMessageEvent", "(Ls4/l5$b;)V", "Landroidx/fragment/app/o;", "sender", "what", "arg1", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "M2", "H2", "Landroid/os/Handler;", "z0", "Landroid/os/Handler;", "mHandler", "value", "A0", "I", "getSatelliteID", "()I", "z4", "(I)V", "satelliteID", "", "B0", "J", "getDataId", "()J", "x4", "(J)V", "dataId", "C0", "Ld5/d;", "getData", "()Ld5/d;", "w4", "data", "Lm4/r;", "D0", "Lm4/r;", "getBinding", "()Lm4/r;", "setBinding", "(Lm4/r;)V", "binding", "E0", "getLastUpdateViewTime", "setLastUpdateViewTime", "lastUpdateViewTime", "Ljava/lang/Runnable;", "F0", "Ljava/lang/Runnable;", "updateDateTask", "", "getSnippet", "()Ljava/lang/CharSequence;", "A4", "(Ljava/lang/CharSequence;)V", "snippet", "getTitle", "B4", "title", "q4", "()Ljava/lang/Long;", "nextVisibility", "Lo4/d;", "r4", "()Lo4/d;", "y4", "(Lo4/d;)V", "radioInfo", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends v3.v implements View.OnClickListener {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private int satelliteID;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private long dataId;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private d5.d data;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private m4.r binding;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private long lastUpdateViewTime;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    private final Handler mHandler = new Handler();

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private final Runnable updateDateTask = new Runnable() { // from class: s4.p
        @Override // java.lang.Runnable
        public final void run() {
            s.D4(this.f26651a);
        }
    };

    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            s.this.E4(false);
        }
    }

    private final void A4(CharSequence charSequence) {
        TextView textView;
        m4.r rVar = this.binding;
        if (rVar == null || (textView = rVar.f21491o) == null) {
            return;
        }
        if (a6.w.b(charSequence)) {
            textView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    private final void C4() {
        d5.d dVar;
        m4.r rVar;
        TextView textView;
        if (!a2() || (dVar = this.data) == null || (rVar = this.binding) == null || (textView = rVar.f21492p) == null) {
            return;
        }
        if (this.satelliteID != 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(DateUtils.getRelativeDateTimeString(k1(), dVar.f10612n, 1000L, 604800000L, 524289));
        long jCurrentTimeMillis = (System.currentTimeMillis() - dVar.f10612n) / ((long) CloseCodes.NORMAL_CLOSURE);
        this.mHandler.removeCallbacks(this.updateDateTask);
        if (jCurrentTimeMillis < 60) {
            this.mHandler.postDelayed(this.updateDateTask, 1000L);
        } else if (jCurrentTimeMillis < 3600) {
            this.mHandler.postDelayed(this.updateDateTask, 30000L);
        }
    }

    public static final void D4(s sVar) {
        sVar.C4();
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E4(boolean r30) {
        /*
            Method dump skipped, instruction units count: 949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.s.E4(boolean):void");
    }

    static /* synthetic */ void F4(s sVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        sVar.E4(z10);
    }

    private final void p4(int freq, boolean isTx) {
        t7.Companion companion = t7.INSTANCE;
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        String strN1 = N1(isTx ? R.string.txCTCSS : R.string.rxCTCSS);
        rd.m.b(strN1);
        companion.a(contextX3, strN1, freq / 100, "").g4(j1(), isTx ? "tx_sub_audio" : "rx_sub_audio");
    }

    public static final void s4(s sVar, int i10, o4.d dVar, DialogInterface dialogInterface, int i11) {
        if (i11 == 1) {
            sVar.p4(i10, false);
            dialogInterface.dismiss();
        } else {
            dVar.m(i11 != 0 ? a.C0096a.f6664b[i11 - 1] : 0);
            sVar.y4(dVar);
            dialogInterface.dismiss();
        }
    }

    public static final void t4(s sVar, int i10, o4.d dVar, DialogInterface dialogInterface, int i11) {
        if (i11 == 1) {
            sVar.p4(i10, true);
            dialogInterface.dismiss();
        } else {
            dVar.p(i11 == 0 ? 0 : a.C0096a.f6664b[i11 - 1]);
            sVar.y4(dVar);
            dialogInterface.dismiss();
        }
    }

    public static final boolean u4(s sVar, View view) {
        d5.d dVar = sVar.data;
        Location locationA = dVar != null ? dVar.a() : null;
        if (locationA == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("geo:0,0?q=");
        sb2.append(locationA.getLatitude());
        sb2.append(',');
        sb2.append(locationA.getLongitude());
        sb2.append('(');
        d5.d dVar2 = sVar.data;
        rd.m.b(dVar2);
        sb2.append(Uri.encode(dVar2.f10599a));
        sb2.append(')');
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString())), "");
        rd.m.d(intentCreateChooser, "createChooser(...)");
        sVar.O3(intentCreateChooser);
        return true;
    }

    private final void v4(d5.d item) {
        String str;
        if (item.f10614p == 3) {
            str = item.f10600b;
            rd.m.d(str, "to");
        } else {
            str = item.f10599a;
            rd.m.d(str, "from");
        }
        String str2 = str;
        if (h4(item.f10609k == 0 ? R.id.send_aprs_message : R.id.send_bss_message, 0, 0, str2)) {
            return;
        }
        MessageListActivity.Companion companion = MessageListActivity.INSTANCE;
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        MessageListActivity.Companion.b(companion, contextX3, str2, item.f10609k == 0 ? v4.m1.APRS : v4.m1.BSS, 0L, 8, null);
    }

    public final void B4(CharSequence charSequence) {
        TextView textView;
        m4.r rVar = this.binding;
        if (rVar == null || (textView = rVar.f21493q) == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        mi.c.e().t(this);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        mi.c.e().q(this);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        m4.r rVar = this.binding;
        if (rVar == null) {
            return;
        }
        rVar.f21480d.setOnLongClickListener(new View.OnLongClickListener() { // from class: s4.o
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return s.u4(this.f26636a, view2);
            }
        });
        rVar.f21485i.setOnClickListener(this);
        rVar.f21480d.setOnClickListener(this);
        rVar.f21482f.setOnClickListener(this);
        rVar.f21497u.setOnClickListener(this);
        rVar.f21494r.setOnClickListener(this);
        rVar.f21479c.setOnClickListener(this);
        rVar.f21491o.setOnClickListener(this);
        rVar.f21495s.setOnClickListener(this);
        rVar.f21487k.setOnClickListener(this);
        rVar.f21496t.setOnClickListener(this);
        rVar.f21488l.setOnClickListener(this);
        rVar.f21489m.setOnClickListener(this);
        rVar.f21490n.setOnClickListener(this);
        rVar.f21481e.setOnClickListener(this);
        if (Cfg.f5482d) {
            rVar.f21480d.setVisibility(8);
        }
        F4(this, false, 1, null);
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o sender, int what, int arg1, int arg2, Object obj) {
        t7 t7Var;
        String strP1;
        o4.d dVarR4 = r4();
        if (dVarR4 == null) {
            return super.f4(sender, what, arg1, arg2, obj);
        }
        if ((sender instanceof t7) && (strP1 = (t7Var = (t7) sender).P1()) != null) {
            int iHashCode = strP1.hashCode();
            if (iHashCode != -603687330) {
                if (iHashCode == -345521892 && strP1.equals("tx_sub_audio")) {
                    dVarR4.p(td.a.b(t7Var.v4() * 100));
                    y4(dVarR4);
                }
            } else if (strP1.equals("rx_sub_audio")) {
                dVarR4.m(td.a.b(t7Var.v4() * 100));
                y4(dVarR4);
            }
        }
        return super.f4(sender, what, arg1, arg2, obj);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        Context contextK1;
        d5.d dVar;
        o4.d dVarR4;
        final o4.d dVarR42;
        String[] strArrK;
        o4.d dVarR43;
        final o4.d dVarR44;
        String[] strArrK2;
        m4.r rVar = this.binding;
        if (rVar == null || (contextK1 = k1()) == null || v10 == null || (dVar = this.data) == null) {
            return;
        }
        String str = dVar.f10599a;
        v4.l1 l1VarR = v4.u.w().r();
        Intent intent = null;
        v4.c0 c0Var = l1VarR instanceof v4.c0 ? (v4.c0) l1VarR : null;
        switch (v10.getId()) {
            case R.id.delete /* 2131296623 */:
                dVar.f(x3().getContentResolver());
                B1().o().o(this).i();
                break;
            case R.id.directions /* 2131296651 */:
                Location locationA = dVar.a();
                if (locationA == null) {
                    return;
                } else {
                    intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=" + locationA.getLatitude() + ',' + locationA.getLongitude() + '(' + str + ')'));
                }
                break;
            case R.id.edit /* 2131296696 */:
                a6.Companion companion = a6.INSTANCE;
                Context context = rVar.b().getContext();
                rd.m.d(context, "getContext(...)");
                companion.a(context, this.satelliteID);
                break;
            case R.id.follow /* 2131296764 */:
                dVar.t(true);
                F4(this, false, 1, null);
                break;
            case R.id.message /* 2131296995 */:
                v4(dVar);
                break;
            case R.id.rx_freq /* 2131297288 */:
                if (c0Var == null || (dVarR4 = r4()) == null) {
                    return;
                } else {
                    l5.INSTANCE.b(c0Var.d0(), Integer.valueOf(dVarR4.b()), dVarR4.d(), Cfg.P()).g4(j1(), "rx");
                }
                break;
            case R.id.rx_sub_audio /* 2131297295 */:
                if (c0Var == null || (dVarR42 = r4()) == null) {
                    return;
                }
                final int iE = dVarR42.e();
                int iM = d5.a.M(iE);
                if (iM > 0) {
                    iM++;
                }
                if (iM != 0 || iE == 0) {
                    strArrK = d5.a.k(1);
                } else {
                    iM++;
                    strArrK = d5.a.k(iE);
                }
                new c.a(contextK1).y(R.string.rxCTCSS).x(strArrK, iM, new DialogInterface.OnClickListener() { // from class: s4.q
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        s.s4(this.f26662a, iE, dVarR42, dialogInterface, i10);
                    }
                }).C();
                break;
            case R.id.satellite_connect /* 2131297301 */:
                com.dw.ht.satellite.b.P(this.satelliteID);
                break;
            case R.id.satellite_disconnect /* 2131297302 */:
                com.dw.ht.satellite.b.P(0);
                break;
            case R.id.snippetText /* 2131297413 */:
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) rVar.f21493q.getText());
                sb2.append('\n');
                sb2.append((Object) rVar.f21491o.getText());
                a6.e.a(contextK1, sb2.toString(), null, null);
                String string = contextK1.getString(R.string.toast_text_copied);
                rd.m.d(string, "getString(...)");
                Toast.makeText(contextK1, string, 0).show();
                break;
            case R.id.track /* 2131297570 */:
                dVar.r(!dVar.i());
                F4(this, false, 1, null);
                break;
            case R.id.tx_freq /* 2131297594 */:
                if (c0Var == null || (dVarR43 = r4()) == null) {
                    return;
                } else {
                    l5.INSTANCE.b(c0Var.d0(), Integer.valueOf(dVarR43.f()), dVarR43.h(), Cfg.P()).g4(j1(), "tx");
                }
                break;
            case R.id.tx_sub_audio /* 2131297602 */:
                if (c0Var == null || (dVarR44 = r4()) == null) {
                    return;
                }
                final int i10 = dVarR44.i();
                int iM2 = d5.a.M(i10);
                if (iM2 > 0) {
                    iM2++;
                }
                if (iM2 != 0 || i10 == 0) {
                    strArrK2 = d5.a.k(1);
                } else {
                    iM2++;
                    strArrK2 = d5.a.k(i10);
                }
                new c.a(contextK1).y(R.string.rxCTCSS).x(strArrK2, iM2, new DialogInterface.OnClickListener() { // from class: s4.r
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        s.t4(this.f26681a, i10, dVarR44, dialogInterface, i11);
                    }
                }).C();
                break;
            case R.id.unfollow /* 2131297614 */:
                dVar.t(false);
                F4(this, false, 1, null);
                break;
        }
        if (intent == null) {
            return;
        }
        v3.j.f(this, intent);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(l5.b event) {
        rd.m.e(event, "event");
        o4.d dVarR4 = r4();
        if (dVarR4 == null) {
            return;
        }
        String strB = event.b();
        if (rd.m.a(strB, "rx")) {
            dVarR4.k(event.c().intValue());
            dVarR4.l(event.a());
        } else {
            if (!rd.m.a(strB, "tx")) {
                return;
            }
            dVarR4.n(event.c().intValue());
            dVarR4.o(event.a());
        }
        y4(dVarR4);
    }

    public final Long q4() {
        com.dw.ht.satellite.a aVarB;
        a.b bVarS;
        int i10 = this.satelliteID;
        if (i10 <= 0 || (aVarB = com.dw.ht.satellite.b.B(i10)) == null || (bVarS = com.dw.ht.satellite.a.s(aVarB, null, false, 3, null)) == null) {
            return null;
        }
        return bVarS.c();
    }

    public final o4.d r4() {
        int i10 = this.satelliteID;
        if (i10 <= 0) {
            return null;
        }
        return com.dw.ht.satellite.b.A(i10);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.r rVarC = m4.r.c(inflater, container, false);
        this.binding = rVarC;
        rd.m.b(rVarC);
        InsetsLayout insetsLayoutB = rVarC.b();
        rd.m.d(insetsLayoutB, "getRoot(...)");
        return insetsLayoutB;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w4(d5.d r12) {
        /*
            r11 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            d5.d r2 = r11.data
            r3 = 0
            if (r2 == 0) goto Le
            long r5 = r2.f10611m
            goto Lf
        Le:
            r5 = r3
        Lf:
            if (r2 == 0) goto L14
            long r7 = r2.f10612n
            goto L15
        L14:
            r7 = r3
        L15:
            r11.data = r12
            if (r12 == 0) goto L22
            long r9 = r12.f10611m
            int r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r12 >= 0) goto L22
            int r12 = (int) r9
            int r12 = -r12
            goto L23
        L22:
            r12 = 0
        L23:
            r11.z4(r12)
            d5.d r12 = r11.data
            if (r12 == 0) goto L31
            long r2 = r12.f10611m
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            goto L32
        L31:
            r12 = r1
        L32:
            boolean r2 = r12 instanceof java.lang.Long
            if (r2 != 0) goto L37
            goto L5a
        L37:
            long r2 = r12.longValue()
            int r12 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r12 != 0) goto L5a
            int r12 = r11.satelliteID
            if (r12 != 0) goto L5b
            d5.d r12 = r11.data
            if (r12 == 0) goto L4d
            long r1 = r12.f10612n
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L4d:
            boolean r12 = r1 instanceof java.lang.Long
            if (r12 != 0) goto L52
            goto L5a
        L52:
            long r1 = r1.longValue()
            int r12 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r12 == 0) goto L5b
        L5a:
            r0 = 1
        L5b:
            r11.E4(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.s.w4(d5.d):void");
    }

    public final void x4(long j10) {
        this.dataId = j10;
        w4(d5.d.k(j10));
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
        this.mHandler.removeCallbacks(this.updateDateTask);
    }

    public final void y4(o4.d dVar) {
        int i10 = this.satelliteID;
        if (i10 <= 0) {
            return;
        }
        com.dw.ht.satellite.b.S(i10, dVar);
        F4(this, false, 1, null);
    }

    public final void z4(int i10) {
        if (this.satelliteID == i10) {
            return;
        }
        this.satelliteID = i10;
    }
}
