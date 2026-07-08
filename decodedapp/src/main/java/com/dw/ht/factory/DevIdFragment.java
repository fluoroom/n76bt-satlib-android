package com.dw.ht.factory;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.p;
import com.dw.ht.Cfg;
import com.dw.ht.factory.DevIdFragment;
import com.dw.ht.fragments.DeviceFragment;
import g3.a;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import m4.m;
import org.greenrobot.eventbus.ThreadMode;
import rd.g0;
import v4.c0;
import v4.l1;
import v4.m0;
import v4.n0;
import v4.o;
import v4.u;
import v4.v;
import v4.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0003J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/dw/ht/factory/DevIdFragment;", "Lcom/dw/ht/fragments/DeviceFragment;", "<init>", "()V", "Ldd/d0;", "p5", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "s5", "Lv4/n0;", "link", "Lg3/d;", "packet", "M", "(Lv4/n0;Lg3/d;)V", "Lq4/m;", "event", "onMessageEvent", "(Lq4/m;)V", "Lm4/m;", "P0", "Lm4/m;", "binding", "", "Q0", "Z", "saveing", "R0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DevIdFragment extends DeviceFragment {
    private static final String S0 = "DevIdFragment";

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private m binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private boolean saveing;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f5831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f5832d;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.RESTORE_FACTORY_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5829a = iArr;
            int[] iArr2 = new int[a.b.values().length];
            try {
                iArr2[a.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f5830b = iArr2;
            int[] iArr3 = new int[v.values().length];
            try {
                iArr3[v.EVENT_NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr3[v.SET_DID.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f5831c = iArr3;
            int[] iArr4 = new int[q4.m.values().length];
            try {
                iArr4[q4.m.f24308b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f5832d = iArr4;
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            rd.m.e(adapterView, "parent");
            rd.m.e(view, "view");
            Cfg.K().edit().putInt("factory.vendor", i10).apply();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
            rd.m.e(adapterView, "parent");
        }
    }

    public static final class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            rd.m.e(editable, "s");
            SharedPreferences.Editor editorEdit = Cfg.K().edit();
            String string = editable.toString();
            int length = string.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = rd.m.f(string.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            editorEdit.putString("factory.dev_name", string.subSequence(i10, length + 1).toString()).apply();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            rd.m.e(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            rd.m.e(charSequence, "s");
        }
    }

    private final void p5() {
        EditText editText;
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        int i10 = Calendar.getInstance().get(1);
        m mVar = this.binding;
        if (mVar == null || (editText = mVar.f21325b) == null) {
            return;
        }
        g0 g0Var = g0.f25951a;
        String str = String.format(Locale.ENGLISH, "%d%sS", Arrays.copyOf(new Object[]{Integer.valueOf(i10 % 20), l1VarY4.d().g()}, 2));
        rd.m.d(str, "format(...)");
        editText.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q5(DevIdFragment devIdFragment) {
        p pVarE1 = devIdFragment.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r5(DevIdFragment devIdFragment, View view) {
        devIdFragment.s5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(n0 link, g3.d packet) {
        rd.m.e(link, "link");
        rd.m.e(packet, "packet");
        super.M(link, packet);
        if (packet.m() != 2) {
            return;
        }
        v vVarD = v.d(packet.e());
        rd.m.d(vVarD, "valueOf(...)");
        int i10 = b.f5831c[vVarD.ordinal()];
        if (i10 == 1) {
            x xVarD = x.d(packet.d(0));
            rd.m.d(xVarD, "valueOf(...)");
            if (b.f5829a[xVarD.ordinal()] == 1) {
                String strJ = m0.j(link.q());
                rd.m.d(strJ, "toAddress(...)");
                o oVar = (o) link;
                u.w().c(oVar);
                m3.a.e(oVar.a3());
                Toast.makeText(k1(), "已经恢复出厂状态", 0).show();
                Cfg.m0(strJ);
                View viewT1 = T1();
                rd.m.b(viewT1);
                viewT1.postDelayed(new Runnable() { // from class: q4.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DevIdFragment.q5(this.f24298a);
                    }
                }, 2000L);
                return;
            }
            return;
        }
        if (i10 == 2 && packet.n()) {
            a.b bVarL = packet.l();
            if ((bVarL == null ? -1 : b.f5830b[bVarL.ordinal()]) == 1) {
                if (this.saveing) {
                    this.saveing = false;
                    Toast.makeText(k1(), "设备 ID 已保存", 0).show();
                }
                if (link instanceof c0) {
                    ((c0) link).t(12290);
                    return;
                }
                return;
            }
            Toast.makeText(k1(), "设备 ID 保存失败(" + packet.l() + ')', 0).show();
        }
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        m mVar = this.binding;
        if (mVar == null) {
            return;
        }
        mVar.f21333j.setSelection(Cfg.K().getInt("factory.vendor", 0));
        mVar.f21333j.setOnItemSelectedListener(new c());
        mVar.f21327d.setText(Cfg.K().getString("factory.dev_name", ""));
        mVar.f21327d.addTextChangedListener(new d());
        mVar.f21330g.setOnClickListener(new View.OnClickListener() { // from class: q4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DevIdFragment.r5(this.f24297a, view2);
            }
        });
        p5();
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(q4.m event) {
        rd.m.e(event, "event");
        if (b.f5832d[event.ordinal()] == 1) {
            s5();
        }
    }

    public final void s5() {
        m mVar;
        n0 n0VarX4 = X4();
        if (n0VarX4 == null || (mVar = this.binding) == null) {
            return;
        }
        int i10 = 0;
        if (n0VarX4.d().k() < 45) {
            String string = mVar.f21325b.getText().toString();
            int length = string.length() - 1;
            int i11 = 0;
            boolean z10 = false;
            while (i11 <= length) {
                boolean z11 = rd.m.f(string.charAt(!z10 ? i11 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i11++;
                } else {
                    z10 = true;
                }
            }
            char[] charArray = string.subSequence(i11, length + 1).toString().toCharArray();
            rd.m.d(charArray, "toCharArray(...)");
            int length2 = charArray.length + (charArray.length % 2);
            byte[] bArr = new byte[length2];
            int length3 = charArray.length;
            while (i10 < length3) {
                bArr[i10] = (byte) charArray[i10];
                i10++;
            }
            this.saveing = true;
            n0VarX4.a(v.SET_DID, Arrays.copyOf(bArr, length2));
            return;
        }
        byte[] bArr2 = new byte[34];
        a6.v vVar = new a6.v(bArr2);
        String string2 = mVar.f21325b.getText().toString();
        int length4 = string2.length() - 1;
        int i12 = 0;
        boolean z12 = false;
        while (i12 <= length4) {
            boolean z13 = rd.m.f(string2.charAt(!z12 ? i12 : length4), 32) <= 0;
            if (z12) {
                if (!z13) {
                    break;
                } else {
                    length4--;
                }
            } else if (z13) {
                i12++;
            } else {
                z12 = true;
            }
        }
        char[] charArray2 = string2.subSequence(i12, length4 + 1).toString().toCharArray();
        rd.m.d(charArray2, "toCharArray(...)");
        String string3 = mVar.f21327d.getText().toString();
        int length5 = string3.length() - 1;
        int i13 = 0;
        boolean z14 = false;
        while (i13 <= length5) {
            boolean z15 = rd.m.f(string3.charAt(!z14 ? i13 : length5), 32) <= 0;
            if (z14) {
                if (!z15) {
                    break;
                } else {
                    length5--;
                }
            } else if (z15) {
                i13++;
            } else {
                z14 = true;
            }
        }
        char[] charArray3 = string3.subSequence(i13, length5 + 1).toString().toCharArray();
        rd.m.d(charArray3, "toCharArray(...)");
        for (int i14 = 0; i14 < charArray2.length && i14 < 16; i14++) {
            vVar.n(charArray2[i14], 8);
        }
        vVar.l(128);
        while (i10 < charArray3.length && i10 < 16) {
            vVar.n(charArray3[i10], 8);
            i10++;
        }
        vVar.l(256);
        vVar.n(mVar.f21333j.getSelectedItemPosition(), 16);
        this.saveing = true;
        n0VarX4.a(v.SET_DID, Arrays.copyOf(bArr2, 34));
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m mVarC = m.c(inflater, container, false);
        this.binding = mVarC;
        rd.m.b(mVarC);
        return mVarC.b();
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
