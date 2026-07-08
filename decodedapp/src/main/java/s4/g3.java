package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.fragments.BottomActionFragment;
import com.dw.ht.fragments.DeviceFragment;
import com.dw.ht.provider.a;
import com.dw.widget.ActionButton;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import d5.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import s4.l5;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\b\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0006J\u001d\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010 \u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J-\u0010-\u001a\u0004\u0018\u00010\u001b2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\u0006J!\u00100\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b0\u00101J#\u00105\u001a\u00020\u000b2\b\u00103\u001a\u0004\u0018\u0001022\b\u00104\u001a\u0004\u0018\u000102H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000bH\u0000¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u000bH\u0000¢\u0006\u0004\b8\u0010\u0006J\u000f\u00109\u001a\u00020\u000bH\u0000¢\u0006\u0004\b9\u0010\u0006J\u000f\u0010:\u001a\u00020\u000bH\u0000¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010;\u001a\u00020\u000bH\u0000¢\u0006\u0004\b;\u0010\u0006J\u0017\u0010=\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u001bH\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0015\u0010C\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020EH\u0007¢\u0006\u0004\bG\u0010HJ;\u0010P\u001a\u00020\"2\b\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010K\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020\u000f2\b\u0010O\u001a\u0004\u0018\u00010NH\u0014¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u000bH\u0016¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010S\u001a\u00020\u000bH\u0016¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010T\u001a\u00020\u000bH\u0016¢\u0006\u0004\bT\u0010\u0006J\u0015\u0010W\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bW\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001c\u0010e\u001a\b\u0018\u00010bR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010o\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010lR\u0016\u0010r\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0016\u0010x\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR$\u0010|\u001a\u00020\u000f2\u0006\u0010y\u001a\u00020\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bz\u0010q\"\u0004\b{\u0010DR$\u0010\u007f\u001a\u00020\u000f2\u0006\u0010y\u001a\u00020\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b}\u0010q\"\u0004\b~\u0010DR\u0018\u0010\u0081\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010qR/\u0010\u0086\u0001\u001a\u00020\u000f2\u0006\u0010y\u001a\u00020\u000f8B@BX\u0082\u000e¢\u0006\u0016\n\u0005\b\u0082\u0001\u0010q\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0005\b\u0085\u0001\u0010DR\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0090\u0001¨\u0006\u0098\u0001"}, d2 = {"Ls4/g3;", "Lcom/dw/ht/fragments/DeviceFragment;", "Landroid/view/View$OnClickListener;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "Lv4/n0$b;", "<init>", "()V", "", "", "C5", "()[Ljava/lang/String;", "Ldd/d0;", "D5", "f6", "e6", "", "freq", "F5", "(I)I", "Y5", "G5", "g6", "Landroid/widget/AdapterView;", "p0", "onNothingSelected", "(Landroid/widget/AdapterView;)V", "parent", "Landroid/view/View;", "view", "position", "", "p3", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "", "D0", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lv4/n0;", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "H5", "N5", "K5", "M5", "J5", "v", "onClick", "(Landroid/view/View;)V", "Ly4/b;", "status", "r", "(Ly4/b;)V", "b6", "(I)V", "Ls4/l5$b;", "event", "onMessageEvent", "(Ls4/l5$b;)V", "Landroidx/fragment/app/o;", "sender", "what", "arg1", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "H2", "M2", "w2", "Ly4/a;", "fp", "Z5", "(Ly4/a;)V", "Lm4/h0;", "P0", "Lm4/h0;", "binding", "Q0", "J", "updateSubAudioTime", "R0", "Ly4/b;", "Ls4/g3$a;", "S0", "Ls4/g3$a;", "mAdapter", "Ls4/g3$c;", "T0", "Ls4/g3$c;", "mFreqManager", "Lv4/d0;", "U0", "Lv4/d0;", "mRxFreqRange", "V0", "mTxFreqRange", "W0", "I", "mStartFreq", "X0", "mEndFreq", "Ld5/a$d;", "Y0", "Ld5/a$d;", "modulation", "value", "Z0", "d6", "mTxFreq", "a1", "c6", "mRxFreq", "b1", "mFreqDiff", "c1", "E5", "()I", "a6", "fineTuningStep", "", "d1", "[I", "fineTuningSteps", "Lcom/dw/ht/fragments/BottomActionFragment;", "e1", "Lcom/dw/ht/fragments/BottomActionFragment;", "bottomActionFragment", "f1", "Z", "mSubAudioViewInited", "g1", "showModulation", "d", "b", "c", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g3 extends DeviceFragment implements View.OnClickListener, AdapterView.OnItemSelectedListener, n0.b {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private m4.h0 binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private long updateSubAudioTime;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private a mAdapter;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private v4.d0 mRxFreqRange;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private v4.d0 mTxFreqRange;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    private int mStartFreq;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    private int mEndFreq;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    private int mTxFreq;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    private int mRxFreq;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    private int mFreqDiff;

    /* JADX INFO: renamed from: c1, reason: from kotlin metadata */
    private int fineTuningStep;

    /* JADX INFO: renamed from: e1, reason: from kotlin metadata */
    private BottomActionFragment bottomActionFragment;

    /* JADX INFO: renamed from: f1, reason: from kotlin metadata */
    private boolean mSubAudioViewInited;

    /* JADX INFO: renamed from: g1, reason: from kotlin metadata */
    private boolean showModulation;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private y4.b status = new y4.b();

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private final c mFreqManager = new c();

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    private a.d modulation = a.d.FM;

    /* JADX INFO: renamed from: d1, reason: from kotlin metadata */
    private final int[] fineTuningSteps = {HttpStatus.HTTP_INTERNAL_SERVER_ERROR, 5000, 6250, 10000, 12500, 15000, 250000};

    private final class a extends c6.b {
        final /* synthetic */ g3 A;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g3 g3Var, Context context) {
            super(context, 0);
            rd.m.e(context, "context");
            this.A = g3Var;
            Q();
        }

        private final void Q() {
            E(this.A.mFreqManager.e());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: R */
        public void s(d dVar, int i10) {
            rd.m.e(dVar, "holder");
            Object objJ = J(i10);
            rd.m.d(objJ, "getItem(...)");
            dVar.O((b) objJ);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: S */
        public d u(ViewGroup viewGroup, int i10) {
            rd.m.e(viewGroup, "parent");
            g3 g3Var = this.A;
            View viewInflate = this.f4395r.inflate(R.layout.fragment_freq_scan_item, viewGroup, false);
            rd.m.d(viewInflate, "inflate(...)");
            return new d(g3Var, viewInflate);
        }

        public final void T(int i10) {
            int iF = f();
            for (int i11 = 0; i11 < iF; i11++) {
                if (i10 == ((b) J(i11)).d()) {
                    M(i11);
                    return;
                }
            }
        }

        public final void U(int i10, String str) {
            rd.m.e(str, "name");
            int iF = f();
            for (int i11 = 0; i11 < iF; i11++) {
                if (i10 == ((b) J(i11)).d()) {
                    ((b) J(i11)).g(str);
                    l(i11);
                    return;
                }
            }
        }
    }

    public static final class b implements Comparable {

        /* JADX INFO: renamed from: a */
        private int f26462a;

        /* JADX INFO: renamed from: b */
        private String f26463b;

        /* JADX INFO: renamed from: c */
        private long f26464c;

        public b(int i10, String str, long j10) {
            rd.m.e(str, "name");
            this.f26462a = i10;
            this.f26463b = str;
            this.f26464c = j10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a */
        public int compareTo(b bVar) {
            rd.m.e(bVar, "other");
            return rd.m.g(bVar.f26464c, this.f26464c);
        }

        public final int d() {
            return this.f26462a;
        }

        public final String e() {
            int iA = w4.b.a(this.f26462a);
            rd.g0 g0Var = rd.g0.f25951a;
            String str = String.format(Locale.getDefault(), "%.4f", Arrays.copyOf(new Object[]{Float.valueOf(iA / 1000000.0f)}, 1));
            rd.m.d(str, "format(...)");
            if (!Cfg.P()) {
                return str;
            }
            return w4.b.b(this.f26462a).name() + ' ' + str;
        }

        public final String f() {
            return this.f26463b;
        }

        public final void g(String str) {
            rd.m.e(str, "<set-?>");
            this.f26463b = str;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a */
        private final SharedPreferences f26465a;

        /* JADX INFO: renamed from: b */
        private SharedPreferences f26466b;

        public c() {
            SharedPreferences sharedPreferences = Main.f5555g.getSharedPreferences("freq_scan", 0);
            rd.m.d(sharedPreferences, "getSharedPreferences(...)");
            this.f26465a = sharedPreferences;
            SharedPreferences sharedPreferences2 = Main.f5555g.getSharedPreferences("freq_scan_last_rx", 0);
            rd.m.d(sharedPreferences2, "getSharedPreferences(...)");
            this.f26466b = sharedPreferences2;
        }

        public final b a(int i10) {
            b bVar = new b(i10, c(i10), System.currentTimeMillis());
            this.f26465a.edit().putString(String.valueOf(i10), bVar.f()).apply();
            this.f26466b.edit().putLong(String.valueOf(i10), System.currentTimeMillis()).apply();
            return bVar;
        }

        public final void b() {
            this.f26465a.edit().clear().apply();
        }

        public final String c(int i10) {
            String string = this.f26465a.getString(String.valueOf(i10), "");
            rd.m.b(string);
            return string;
        }

        public final boolean d(int i10) {
            return this.f26465a.contains(String.valueOf(i10));
        }

        public final ArrayList e() {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f26465a.getAll().keySet()) {
                try {
                    int i10 = Integer.parseInt(str);
                    String string = this.f26465a.getString(str, "");
                    rd.m.b(string);
                    arrayList.add(new b(i10, string, this.f26466b.getLong(str, 0L)));
                } catch (NumberFormatException e10) {
                    e10.printStackTrace();
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        }

        public final void f(int i10) {
            this.f26465a.edit().remove(String.valueOf(i10)).apply();
            this.f26466b.edit().remove(String.valueOf(i10)).apply();
        }

        public final void g(int i10, String str) {
            rd.m.e(str, "name");
            this.f26465a.edit().putString(String.valueOf(i10), str).apply();
        }

        public final void h(int i10) {
            this.f26466b.edit().putLong(String.valueOf(i10), System.currentTimeMillis()).apply();
        }
    }

    private final class d extends RecyclerView.f0 implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {
        private final TextView D;
        private final TextView E;
        private b F;
        final /* synthetic */ g3 G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g3 g3Var, View view) {
            super(view);
            rd.m.e(view, "itemView");
            this.G = g3Var;
            View viewFindViewById = view.findViewById(R.id.freq);
            rd.m.d(viewFindViewById, "findViewById(...)");
            this.D = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.name);
            rd.m.d(viewFindViewById2, "findViewById(...)");
            this.E = (TextView) viewFindViewById2;
            view.findViewById(R.id.content).setOnClickListener(this);
            view.findViewById(R.id.settings).setOnClickListener(this);
        }

        public final void O(b bVar) {
            rd.m.e(bVar, "channel");
            this.F = bVar;
            this.D.setText(bVar.e());
            this.E.setText(bVar.f());
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rd.m.e(view, "v");
            int id2 = view.getId();
            if (id2 == R.id.content) {
                g3 g3Var = this.G;
                b bVar = this.F;
                rd.m.b(bVar);
                g3Var.b6(bVar.d());
                return;
            }
            if (id2 != R.id.settings) {
                return;
            }
            c6.k kVar = new c6.k(view.getContext(), view);
            kVar.b().inflate(R.menu.radio_ch_settings, kVar.a());
            kVar.e(this);
            kVar.f();
        }

        @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            rd.m.e(menuItem, "item");
            int itemId = menuItem.getItemId();
            if (itemId != R.id.rename) {
                if (itemId != R.id.unstar) {
                    return false;
                }
                c cVar = this.G.mFreqManager;
                b bVar = this.F;
                rd.m.b(bVar);
                cVar.f(bVar.d());
                a aVar = this.G.mAdapter;
                if (aVar != null) {
                    b bVar2 = this.F;
                    rd.m.b(bVar2);
                    aVar.T(bVar2.d());
                }
                this.G.g6();
                return true;
            }
            Context contextK1 = this.G.k1();
            rd.m.b(contextK1);
            String strN1 = this.G.N1(R.string.rename);
            b bVar3 = this.F;
            rd.m.b(bVar3);
            v3.q qVarO4 = v3.q.o4(contextK1, strN1, null, bVar3.f(), null);
            androidx.fragment.app.w wVarJ1 = this.G.j1();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rename_freq:");
            b bVar4 = this.F;
            rd.m.b(bVar4);
            sb2.append(bVar4.d());
            qVarO4.g4(wVarJ1, sb2.toString());
            return true;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26467a;

        static {
            int[] iArr = new int[y4.c.values().length];
            try {
                iArr[y4.c.f32400c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y4.c.f32401d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26467a = iArr;
        }
    }

    public g3() {
        i5(3);
        this.showModulation = Cfg.P();
    }

    private final String[] C5() {
        int[] iArr = a.C0096a.f6664b;
        String[] strArr = new String[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = d5.a.j(a.C0096a.f6664b[i10]);
        }
        return (String[]) ed.j.V(strArr);
    }

    private final void D5() {
        m4.h0 h0Var = this.binding;
        if (h0Var == null) {
            return;
        }
        v4.l1 l1VarY4 = Y4();
        v4.d0 d0VarD0 = l1VarY4 != null ? l1VarY4.d0() : null;
        if (d0VarD0 != null) {
            int i10 = this.mStartFreq;
            int i11 = this.mEndFreq;
            a.d dVar = this.modulation;
            a.d[] dVarArrJ = d0VarD0.j();
            rd.m.b(dVarArrJ);
            if (!ed.j.z(dVarArrJ, dVar)) {
                dVar = a.d.FM;
                if (!ed.j.z(dVarArrJ, dVar) && dVarArrJ.length > 0) {
                    dVar = dVarArrJ[0];
                    rd.m.d(dVar, "get(...)");
                }
            }
            this.modulation = dVar;
            if (d0VarD0.m(i10, dVar)) {
                this.mStartFreq = i10;
            } else {
                this.mStartFreq = d0VarD0.h(dVar);
            }
            if (d0VarD0.m(i11, dVar)) {
                this.mEndFreq = i11;
            } else {
                this.mEndFreq = d0VarD0.g(dVar);
            }
            if (!d0VarD0.m(this.mRxFreq, dVar)) {
                c6(d0VarD0.h(dVar));
            }
            this.mFreqDiff = this.mRxFreq - this.mTxFreq;
        } else {
            h0Var.f21199y.setVisibility(8);
            h0Var.f21181g.setVisibility(8);
        }
        this.mRxFreqRange = d0VarD0;
        v4.l1 l1VarY42 = Y4();
        v4.d0 d0VarH0 = l1VarY42 != null ? l1VarY42.h0() : null;
        if (d0VarH0 != null) {
            a.d dVar2 = this.modulation;
            if (!d0VarH0.m(this.mTxFreq, dVar2)) {
                if (d0VarH0.m(this.mRxFreq, dVar2)) {
                    d6(this.mRxFreq);
                } else {
                    d6(d0VarH0.h(dVar2));
                }
            }
            this.mFreqDiff = this.mRxFreq - this.mTxFreq;
        }
        this.mTxFreqRange = d0VarH0;
    }

    /* JADX INFO: renamed from: E5, reason: from getter */
    private final int getFineTuningStep() {
        return this.fineTuningStep;
    }

    private final int F5(int freq) {
        int i10 = this.mEndFreq;
        int i11 = this.mStartFreq;
        if (i10 != i11) {
            if (i11 < i10) {
                if (freq < i11 || freq > i10) {
                    int i12 = e.f26467a[this.status.b().ordinal()];
                    if (i12 != 1) {
                        if (i12 == 2) {
                            return i10;
                        }
                    }
                    return i11;
                }
            } else if (freq > i11 || freq < i10) {
                int i13 = e.f26467a[this.status.b().ordinal()];
                if (i13 != 1) {
                    if (i13 == 2) {
                        return i11;
                    }
                }
                return i10;
            }
        }
        return freq;
    }

    private final void G5() {
        m4.h0 h0Var;
        if ((SystemClock.elapsedRealtime() - this.updateSubAudioTime <= 3000 && this.mSubAudioViewInited) || (h0Var = this.binding) == null) {
            return;
        }
        h0Var.f21194t.setSelection(d5.a.M(this.status.d()));
        h0Var.J.setSelection(d5.a.M(this.status.l()));
        this.mSubAudioViewInited = true;
    }

    public static final void I5(g3 g3Var, DialogInterface dialogInterface, int i10) {
        g3Var.mFreqManager.b();
        a aVar = g3Var.mAdapter;
        if (aVar != null) {
            aVar.G();
        }
    }

    public static final void L5(g3 g3Var, DialogInterface dialogInterface, int i10) {
        g3Var.a6(i10);
        g3Var.g6();
        dialogInterface.dismiss();
    }

    public static final void O5(g3 g3Var, DialogInterface dialogInterface, int i10) {
        g3Var.status.t(y4.e.f32418a.a(i10));
        g3Var.Z5(new y4.a(g3Var.status));
        dialogInterface.dismiss();
    }

    public static final void P5(g3 g3Var, View view) {
        y4.a aVar = new y4.a(g3Var.status);
        aVar.q(aVar.f());
        g3Var.Z5(aVar);
    }

    public static final void Q5(g3 g3Var, View view) {
        d5.a aVar = new d5.a();
        aVar.f10574h = g3Var.status.e();
        aVar.f10575r = g3Var.status.c();
        aVar.f10583z = g3Var.status.d();
        aVar.f10573g = g3Var.status.m();
        aVar.f10576s = g3Var.status.k();
        aVar.f10582y = g3Var.status.l();
        com.dw.ht.m0 m0VarJ = com.dw.ht.o.f6637b.a().j();
        Context contextK1 = g3Var.k1();
        rd.m.b(contextK1);
        m0VarJ.c(contextK1, aVar);
    }

    public static final void R5(g3 g3Var, View view) {
        g3Var.M5();
    }

    public static final void S5(g3 g3Var, View view) {
        g3Var.J5();
    }

    public static final void T5(g3 g3Var, View view) {
        g3Var.N5();
    }

    public static final void U5(g3 g3Var, View view) {
        g3Var.H5();
    }

    public static final void V5(final g3 g3Var, m4.h0 h0Var, View view) {
        c6.k kVar = new c6.k(g3Var.x3(), view);
        kVar.b().inflate(R.menu.o_freq_scan, kVar.a());
        MenuItem menuItemFindItem = kVar.a().findItem(R.id.auto_scan);
        if (menuItemFindItem != null) {
            menuItemFindItem.setChecked(Cfg.O().isFreqScanAutoScan());
        }
        MenuItem menuItemFindItem2 = kVar.a().findItem(R.id.clean);
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(h0Var.f21178d == null);
        }
        kVar.e(new PopupMenu.OnMenuItemClickListener() { // from class: s4.v2
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return g3.W5(this.f26809a, menuItem);
            }
        });
        kVar.f();
    }

    public static final boolean W5(g3 g3Var, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.auto_scan) {
            Cfg.O().setFreqScanAutoScan(!Cfg.O().isFreqScanAutoScan());
        } else if (itemId == R.id.clean) {
            g3Var.H5();
        }
        return true;
    }

    public static final void X5(g3 g3Var, View view) {
        g3Var.K5();
    }

    private final void Y5() {
        int iE = this.status.e();
        if (this.status.b() == y4.c.f32401d) {
            iE -= this.status.h();
        } else if (this.status.b() == y4.c.f32400c) {
            iE += this.status.h();
        }
        this.status.s(iE);
        Z5(new y4.a(this.status));
    }

    private final void a6(int i10) {
        if (i10 >= this.fineTuningSteps.length || i10 < 0) {
            this.fineTuningStep = 0;
        } else {
            this.fineTuningStep = i10;
        }
    }

    private final void c6(int i10) {
        if (this.mRxFreq == i10) {
            return;
        }
        this.mRxFreq = i10;
        e6();
    }

    private final void d6(int i10) {
        v4.d0 d0Var = this.mTxFreqRange;
        if (d0Var != null && !d0Var.m(i10, w4.b.b(i10))) {
            i10 = 0;
        }
        if (this.mTxFreq == i10) {
            return;
        }
        this.mTxFreq = i10;
        f6();
    }

    private final void e6() {
        String str;
        String string;
        m4.h0 h0Var = this.binding;
        if (h0Var == null) {
            return;
        }
        int iA = w4.b.a(this.mRxFreq);
        if (this.showModulation) {
            str = w4.b.b(this.mRxFreq).name() + ' ';
        } else {
            str = "";
        }
        if (iA % CloseCodes.NORMAL_CLOSURE == 0) {
            h0Var.f21184j.setText("0");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            rd.g0 g0Var = rd.g0.f25951a;
            String str2 = String.format(Locale.getDefault(), "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(iA / 1000000.0f)}, 1));
            rd.m.d(str2, "format(...)");
            sb2.append(str2);
            string = sb2.toString();
        } else {
            h0Var.f21184j.setText("5");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            rd.g0 g0Var2 = rd.g0.f25951a;
            String str3 = String.format(Locale.getDefault(), "%.3f", Arrays.copyOf(new Object[]{Float.valueOf((iA - 500) / 1000000.0f)}, 1));
            rd.m.d(str3, "format(...)");
            sb3.append(str3);
            string = sb3.toString();
        }
        h0Var.f21183i.setText(string);
    }

    private final void f6() {
        String str;
        String string;
        m4.h0 h0Var = this.binding;
        if (h0Var == null) {
            return;
        }
        int iA = w4.b.a(this.mTxFreq);
        if (this.showModulation) {
            str = w4.b.b(this.mTxFreq).name() + ' ';
        } else {
            str = "";
        }
        if (iA % CloseCodes.NORMAL_CLOSURE == 0) {
            h0Var.E.setText("0");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            rd.g0 g0Var = rd.g0.f25951a;
            String str2 = String.format(Locale.getDefault(), "%3.3f", Arrays.copyOf(new Object[]{Float.valueOf(iA / 1000000.0f)}, 1));
            rd.m.d(str2, "format(...)");
            sb2.append(str2);
            string = sb2.toString();
        } else {
            h0Var.E.setText("5");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            rd.g0 g0Var2 = rd.g0.f25951a;
            String str3 = String.format(Locale.getDefault(), "%3.3f", Arrays.copyOf(new Object[]{Float.valueOf((iA - 500) / 1000000.0f)}, 1));
            rd.m.d(str3, "format(...)");
            sb3.append(str3);
            string = sb3.toString();
        }
        h0Var.D.setText(string);
    }

    public final void g6() {
        String str;
        m4.h0 h0Var = this.binding;
        if (h0Var == null) {
            return;
        }
        a.d dVarK = this.status.k();
        a.d dVar = a.d.FM;
        this.showModulation = (dVarK == dVar && this.status.c() == dVar && !Cfg.P()) ? false : true;
        if (this.mRxFreqRange != null) {
            if (this.modulation != dVar) {
                str = this.modulation.name() + ' ';
            } else {
                str = "";
            }
            TextView textView = h0Var.f21199y;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(N1(R.string.freq_range_start));
            sb2.append('\n');
            rd.g0 g0Var = rd.g0.f25951a;
            String str2 = String.format(Locale.getDefault(), "%s%.4fMHz", Arrays.copyOf(new Object[]{str, Float.valueOf(this.mStartFreq / 1000000.0f)}, 2));
            rd.m.d(str2, "format(...)");
            sb2.append(str2);
            textView.setText(sb2.toString());
            TextView textView2 = h0Var.f21181g;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(N1(R.string.freq_range_end));
            sb3.append('\n');
            String str3 = String.format(Locale.getDefault(), "%s%.4fMHz", Arrays.copyOf(new Object[]{str, Float.valueOf(this.mEndFreq / 1000000.0f)}, 2));
            rd.m.d(str3, "format(...)");
            sb3.append(str3);
            textView2.setText(sb3.toString());
        } else {
            h0Var.f21199y.setVisibility(8);
            h0Var.f21181g.setVisibility(8);
        }
        if (this.status.b() != y4.c.f32399b) {
            c6(this.status.f());
            d6(this.status.n());
        }
        G5();
        h0Var.f21200z.setText(N1(R.string.freq_scan_step) + '\n' + H1().getStringArray(R.array.freq_scan_steps)[this.status.i().ordinal()]);
        h0Var.f21182h.setText(N1(R.string.fine_tuning_step) + '\n' + H1().getStringArray(R.array.freq_scan_fine_tuning_steps)[getFineTuningStep()]);
        if (h0Var.f21180f != null) {
            a aVar = this.mAdapter;
            rd.m.b(aVar);
            if (aVar.f() > 0) {
                h0Var.f21180f.setVisibility(8);
                h0Var.f21186l.setVisibility(0);
            } else {
                h0Var.f21186l.setVisibility(8);
                h0Var.f21180f.setVisibility(0);
            }
        }
    }

    @Override // v3.m0, v3.n0
    public boolean D0() {
        return true;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        Cfg.K().edit().putInt("freq_scan.start_freq", this.mStartFreq).putInt("freq_scan.end_freq", this.mEndFreq).putInt("freq_scan.fine_tuning_step", getFineTuningStep()).putInt("freq_scan.modulation", this.status.c().ordinal()).apply();
    }

    public final void H5() {
        Context contextK1 = k1();
        rd.m.b(contextK1);
        new c.a(contextK1).k(N1(R.string.qClearScanResults)).m(android.R.string.cancel, null).t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: s4.e3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                g3.I5(this.f26412a, dialogInterface, i10);
            }
        }).C();
    }

    public final void J5() {
        l5.Companion.c(l5.INSTANCE, this.mRxFreqRange, Integer.valueOf(this.mEndFreq), this.modulation, false, 8, null).g4(j1(), "stop_freq");
    }

    public final void K5() {
        Context contextK1 = k1();
        rd.m.b(contextK1);
        new c.a(contextK1).z(N1(R.string.fine_tuning_step)).v(R.array.freq_scan_fine_tuning_steps, getFineTuningStep(), new DialogInterface.OnClickListener() { // from class: s4.f3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                g3.L5(this.f26424a, dialogInterface, i10);
            }
        }).C();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        com.dw.ht.satellite.b.P(0);
    }

    public final void M5() {
        l5.Companion.c(l5.INSTANCE, this.mRxFreqRange, Integer.valueOf(this.mStartFreq), this.modulation, false, 8, null).g4(j1(), "start_freq");
    }

    public final void N5() {
        Context contextK1 = k1();
        rd.m.b(contextK1);
        new c.a(contextK1).y(R.string.freq_scan_step).v(R.array.freq_scan_steps, this.status.i().ordinal(), new DialogInterface.OnClickListener() { // from class: s4.w2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                g3.O5(this.f26821a, dialogInterface, i10);
            }
        }).C();
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        final m4.h0 h0Var = this.binding;
        if (h0Var == null) {
            return;
        }
        Cfg.K();
        ArrayAdapter arrayAdapter = new ArrayAdapter(h0Var.f21176b.getContext(), android.R.layout.simple_spinner_item, C5());
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        h0Var.f21194t.setAdapter((SpinnerAdapter) arrayAdapter);
        h0Var.J.setAdapter((SpinnerAdapter) arrayAdapter);
        Context contextK1 = k1();
        rd.m.b(contextK1);
        a aVar = new a(this, contextK1);
        this.mAdapter = aVar;
        h0Var.f21186l.setAdapter(aVar);
        h0Var.f21177c.setOnClickListener(this);
        h0Var.f21191q.setOnClickListener(this);
        h0Var.G.setOnClickListener(this);
        h0Var.f21197w.setOnClickListener(this);
        h0Var.f21198x.setOnClickListener(this);
        h0Var.f21189o.setOnClickListener(this);
        h0Var.f21188n.setOnClickListener(this);
        h0Var.f21195u.setOnClickListener(new View.OnClickListener() { // from class: s4.u2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g3.P5(this.f26785a, view2);
            }
        });
        h0Var.f21196v.setOnClickListener(new View.OnClickListener() { // from class: s4.x2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g3.Q5(this.f26836a, view2);
            }
        });
        h0Var.f21194t.setOnItemSelectedListener(this);
        h0Var.J.setOnItemSelectedListener(this);
        h0Var.f21199y.setOnClickListener(new View.OnClickListener() { // from class: s4.y2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g3.R5(this.f26861a, view2);
            }
        });
        h0Var.f21181g.setOnClickListener(new View.OnClickListener() { // from class: s4.z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g3.S5(this.f26868a, view2);
            }
        });
        h0Var.f21200z.setOnClickListener(new View.OnClickListener() { // from class: s4.a3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g3.T5(this.f26359a, view2);
            }
        });
        ActionButton actionButton = h0Var.f21178d;
        if (actionButton != null) {
            actionButton.setOnClickListener(new View.OnClickListener() { // from class: s4.b3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    g3.U5(this.f26371a, view2);
                }
            });
        }
        ActionButton actionButton2 = h0Var.f21187m;
        if (actionButton2 != null) {
            actionButton2.setOnClickListener(new View.OnClickListener() { // from class: s4.c3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    g3.V5(this.f26389a, h0Var, view2);
                }
            });
        }
        h0Var.f21182h.setOnClickListener(new View.OnClickListener() { // from class: s4.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g3.X5(this.f26401a, view2);
            }
        });
        this.bottomActionFragment = (BottomActionFragment) j1().i0(R.id.bottom_bar);
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            BottomActionFragment bottomActionFragment = this.bottomActionFragment;
            if (bottomActionFragment != null) {
                bottomActionFragment.e5(l1VarY4.q());
            }
            D5();
        }
        g6();
        f6();
        e6();
        if (Cfg.f5476a || !Cfg.f5482d) {
            return;
        }
        view.findViewById(R.id.bottom_bar).setVisibility(8);
    }

    public final void Z5(y4.a fp) {
        rd.m.e(fp, "fp");
        s3.b.b("FreqScanFragment", "send: " + fp);
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            l1VarY4.b(v4.v.FREQ_MODE_SET_PAR, fp);
        }
    }

    public final void b6(int freq) {
        if (freq == this.status.e()) {
            return;
        }
        this.status.s(freq);
        this.status.p(y4.c.f32402e);
        Z5(new y4.a(this.status));
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(v4.n0 oldLink, v4.n0 newLink) {
        super.d5(oldLink, newLink);
        BottomActionFragment bottomActionFragment = this.bottomActionFragment;
        if (bottomActionFragment != null) {
            bottomActionFragment.h5(Y4());
        }
        if (oldLink != null) {
            oldLink.g(this);
        }
        if (newLink != null) {
            newLink.x(this);
        }
        D5();
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o sender, int what, int arg1, int arg2, Object obj) {
        String strP1;
        if (sender == null || (strP1 = sender.P1()) == null || !rg.q.J(strP1, "rename_freq:", false, 2, null)) {
            return super.f4(sender, what, arg1, arg2, obj);
        }
        if (R.id.what_dialog_onclick != what && arg1 != -1) {
            return true;
        }
        String strSubstring = strP1.substring(12, strP1.length());
        rd.m.d(strSubstring, "substring(...)");
        c cVar = this.mFreqManager;
        int i10 = Integer.parseInt(strSubstring);
        rd.m.c(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        cVar.g(i10, str);
        a aVar = this.mAdapter;
        rd.m.b(aVar);
        aVar.U(Integer.parseInt(strSubstring), str);
        g6();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        rd.m.e(v10, "v");
        if (v10.getId() == R.id.back) {
            androidx.fragment.app.p pVarE1 = e1();
            if (pVarE1 != null) {
                pVarE1.finish();
                return;
            }
            return;
        }
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        if (l1VarY4.l() != n0.c.Connected) {
            l1VarY4.v(true);
        }
        int id2 = v10.getId();
        if (id2 == R.id.rx_freq_cc) {
            l5.Companion.c(l5.INSTANCE, this.mRxFreqRange, Integer.valueOf(this.status.e()), this.status.c(), false, 8, null).g4(j1(), "rx_freq");
            return;
        }
        if (id2 == R.id.tx_freq_cc) {
            l5.Companion.c(l5.INSTANCE, this.mRxFreqRange, Integer.valueOf(this.status.m()), this.status.k(), false, 8, null).g4(j1(), "tx_freq");
            return;
        }
        y4.a aVar = new y4.a(this.status);
        switch (v10.getId()) {
            case R.id.next /* 2131297090 */:
                aVar.j(y4.c.f32402e);
                aVar.n(aVar.f() + this.fineTuningSteps[getFineTuningStep()]);
                break;
            case R.id.play_stop /* 2131297181 */:
                y4.c cVarB = this.status.b();
                y4.c cVar = y4.c.f32399b;
                if (cVarB != cVar) {
                    aVar.j(cVar);
                } else {
                    aVar.j(y4.c.f32400c);
                }
                break;
            case R.id.previous /* 2131297214 */:
                aVar.j(y4.c.f32402e);
                aVar.n(aVar.f() - this.fineTuningSteps[getFineTuningStep()]);
                break;
            case R.id.seek_down /* 2131297339 */:
                aVar.j(y4.c.f32401d);
                aVar.n(aVar.f() - this.status.h());
                break;
            case R.id.seek_up /* 2131297340 */:
                aVar.j(y4.c.f32400c);
                aVar.n(aVar.f() + this.status.h());
                break;
        }
        Z5(aVar);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView parent, View view, int position, long p32) {
        m4.h0 h0Var;
        if (this.mSubAudioViewInited && (h0Var = this.binding) != null) {
            int i10 = a.C0096a.f6664b[position];
            if (rd.m.a(parent, h0Var.J)) {
                if (i10 == this.status.l()) {
                    return;
                } else {
                    this.status.u(i10);
                }
            } else if (i10 == this.status.d()) {
                return;
            } else {
                this.status.r(i10);
            }
            this.updateSubAudioTime = SystemClock.elapsedRealtime();
            Z5(new y4.a(this.status));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(l5.b event) {
        v4.d0 d0VarD0;
        v4.d0 d0VarD02;
        rd.m.e(event, "event");
        String strB = event.b();
        if (strB != null) {
            switch (strB.hashCode()) {
                case -1573554123:
                    if (!strB.equals("start_freq")) {
                        return;
                    }
                    this.mStartFreq = event.c().intValue();
                    if (this.modulation != event.a()) {
                        this.modulation = event.a();
                        v4.l1 l1VarY4 = Y4();
                        if (l1VarY4 != null && (d0VarD0 = l1VarY4.d0()) != null) {
                            this.mEndFreq = d0VarD0.g(this.modulation);
                        }
                    }
                    break;
                    break;
                case -897371309:
                    if (!strB.equals("tx_freq")) {
                        return;
                    }
                    y4.a aVar = new y4.a(this.status);
                    aVar.q(event.c().intValue());
                    aVar.o(event.a());
                    Z5(aVar);
                    break;
                case 1622588625:
                    if (!strB.equals("rx_freq")) {
                        return;
                    }
                    y4.a aVar2 = new y4.a(this.status);
                    aVar2.n(event.c().intValue());
                    aVar2.l(event.a());
                    aVar2.j(y4.c.f32402e);
                    Z5(aVar2);
                    break;
                case 1629714581:
                    if (!strB.equals("stop_freq")) {
                        return;
                    }
                    this.mEndFreq = event.c().intValue();
                    if (this.modulation != event.a()) {
                        this.modulation = event.a();
                        v4.l1 l1VarY42 = Y4();
                        if (l1VarY42 != null && (d0VarD02 = l1VarY42.d0()) != null) {
                            this.mStartFreq = d0VarD02.h(this.modulation);
                        }
                    }
                    break;
                    break;
                default:
                    return;
            }
            g6();
        }
    }

    @Override // v4.n0.b
    public void r(y4.b status) {
        v4.l1 l1VarY4;
        v4.k0 k0VarY;
        int iF5;
        rd.m.e(status, "status");
        y4.b bVar = this.status;
        if (!rd.m.a(bVar, status)) {
            s3.b.b("FreqScanFragment", "rx " + status);
        }
        this.status = status;
        if (status.g() && status.b() != y4.c.f32402e && ((iF5 = F5(status.e())) != status.e() || status.c() != this.modulation)) {
            status.s(iF5);
            status.q(this.modulation);
            Z5(new y4.a(status));
        }
        if (status.b() == y4.c.f32401d || status.b() == y4.c.f32400c) {
            if (status.j()) {
                if (this.mFreqManager.d(status.f())) {
                    this.mFreqManager.h(status.f());
                    a aVar = this.mAdapter;
                    rd.m.b(aVar);
                    aVar.F(this.mFreqManager.e());
                } else {
                    this.mFreqManager.a(status.f());
                    a aVar2 = this.mAdapter;
                    rd.m.b(aVar2);
                    aVar2.F(this.mFreqManager.e());
                }
                if (Cfg.O().isFreqScanAutoScan()) {
                    Y5();
                }
            } else if (bVar.e() == status.e() && (((l1VarY4 = Y4()) == null || (k0VarY = l1VarY4.Y()) == null || !k0VarY.f29913b) && Cfg.O().isFreqScanAutoScan())) {
                Y5();
            }
        }
        g6();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        SharedPreferences sharedPreferencesK = Cfg.K();
        d6(sharedPreferencesK.getInt("freq_scan.tx_freq", this.mTxFreq));
        c6(sharedPreferencesK.getInt("freq_scan.rx_freq", this.mRxFreq));
        this.mStartFreq = sharedPreferencesK.getInt("freq_scan.start_freq", 0);
        this.mEndFreq = sharedPreferencesK.getInt("freq_scan.end_freq", 0);
        a.d dVarD = a.d.d(sharedPreferencesK.getInt("freq_scan.modulation", a.d.FM.ordinal()));
        rd.m.d(dVarD, "valueOf(...)");
        this.modulation = dVarD;
        a6(sharedPreferencesK.getInt("freq_scan.fine_tuning_step", getFineTuningStep()));
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        z4(N1(R.string.frequencyScan));
        m4.h0 h0VarC = m4.h0.c(inflater, container, false);
        this.binding = h0VarC;
        rd.m.b(h0VarC);
        return h0VarC.b();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void w2() {
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            l1VarY4.r(this);
        }
        try {
            y4.c cVarB = this.status.b();
            y4.c cVar = y4.c.f32399b;
            if (cVarB == cVar) {
                return;
            }
            this.status.p(cVar);
            Z5(new y4.a(this.status));
        } finally {
            super.w2();
        }
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView p02) {
    }
}
