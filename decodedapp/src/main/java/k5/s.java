package k5;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import androidx.appcompat.app.c;
import com.benshikj.ht.R;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.ht.Cfg;
import com.dw.ht.fragments.DeviceFragment;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import v4.a0;
import v4.a2;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0006J!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b#\u0010\"J\r\u0010$\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\u0006J\u0017\u0010'\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u001dH\u0016¢\u0006\u0004\b,\u0010-J'\u00101\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020.2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001bH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001b2\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u0004\u0018\u00010A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lk5/s;", "Lcom/dw/ht/fragments/DeviceFragment;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Lcom/dw/android/widget/NumberPreferenceView$c;", "<init>", "()V", "Ldd/d0;", "E5", "B5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/widget/SeekBar;", "seekBar", "", "progress", "", "fromUser", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "onStopTrackingTouch", "S5", "Lv4/n0;", "link", "i0", "(Lv4/n0;)V", "Landroid/widget/CompoundButton;", "buttonView", "isChecked", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "Lcom/dw/android/widget/NumberPreferenceView;", "from", "number", "f", "(Lcom/dw/android/widget/NumberPreferenceView;II)V", "Lg3/d;", "packet", "M", "(Lv4/n0;Lg3/d;)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "m2", "(IILandroid/content/Intent;)V", "Lm4/i0;", "P0", "Lm4/i0;", "binding", "Lv4/c0;", "H5", "()Lv4/c0;", "btLink", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends DeviceFragment implements SeekBar.OnSeekBarChangeListener, CompoundButton.OnCheckedChangeListener, NumberPreferenceView.c {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private m4.i0 binding;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19441a;

        static {
            int[] iArr = new int[v4.v.values().length];
            try {
                iArr[v4.v.GET_PP_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f19441a = iArr;
        }
    }

    public s() {
        i5(3);
    }

    private final void B5() {
        new c.a(x3()).y(R.string.factory_data_reset).k(N1(R.string.prompt_factory_data_reset)).t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: k5.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                s.C5(this.f19437a, dialogInterface, i10);
            }
        }).m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: k5.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                s.D5(dialogInterface, i10);
            }
        }).C();
    }

    public static final void C5(s sVar, DialogInterface dialogInterface, int i10) {
        l1 l1VarY4 = sVar.Y4();
        if (l1VarY4 != null && (l1VarY4 instanceof v4.c0)) {
            ((v4.c0) l1VarY4).t(12290);
        }
    }

    private final void E5() {
        new c.a(x3()).y(R.string.reset_settings).k(N1(R.string.prompt_reset_settings)).t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: k5.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                s.F5(this.f19417a, dialogInterface, i10);
            }
        }).m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: k5.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                s.G5(dialogInterface, i10);
            }
        }).C();
    }

    public static final void F5(s sVar, DialogInterface dialogInterface, int i10) {
        l1 l1VarY4 = sVar.Y4();
        if (l1VarY4 != null && (l1VarY4 instanceof v4.c0)) {
            v4.c0 c0Var = (v4.c0) l1VarY4;
            c0Var.t(12291);
            c0Var.a(v4.v.READ_BSS_SETTINGS, 2);
        }
    }

    private final v4.c0 H5() {
        l1 l1VarY4 = Y4();
        if (l1VarY4 instanceof v4.c0) {
            return (v4.c0) l1VarY4;
        }
        return null;
    }

    public static final void I5(final s sVar, final CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "buttonView");
        if (z10) {
            new c.a(compoundButton.getContext()).j(R.string.enableAudioRelayTips).t(R.string.enable, new DialogInterface.OnClickListener() { // from class: k5.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    s.J5(compoundButton, sVar, dialogInterface, i10);
                }
            }).m(android.R.string.no, new DialogInterface.OnClickListener() { // from class: k5.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    s.K5(compoundButton, dialogInterface, i10);
                }
            }).C();
        }
    }

    public static final void J5(CompoundButton compoundButton, s sVar, DialogInterface dialogInterface, int i10) {
        compoundButton.setChecked(true);
        l1 l1VarY4 = sVar.Y4();
        if (l1VarY4 == null) {
            return;
        }
        v4.c0 c0Var = (v4.c0) l1VarY4;
        a2 a2VarC2 = c0Var.c2();
        rd.m.d(a2VarC2, "getSettings(...)");
        a2VarC2.f29694i = true;
        c0Var.A2();
    }

    public static final void K5(CompoundButton compoundButton, DialogInterface dialogInterface, int i10) {
        compoundButton.setChecked(false);
    }

    public static final void L5(s sVar, View view) {
        sVar.B5();
    }

    public static final void M5(s sVar, View view) {
        sVar.E5();
    }

    public static final String N5(s sVar, int i10) {
        return i10 == 0 ? sVar.N1(R.string.notSet) : String.valueOf(i10);
    }

    public static final void O5(s sVar, CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        v4.c0 c0VarW4 = sVar.W4();
        if (c0VarW4 == null || z10 == c0VarW4.c2().D) {
            return;
        }
        c0VarW4.c2().D = z10;
        c0VarW4.A2();
    }

    public static final void P5(s sVar, CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        v4.c0 c0VarW4 = sVar.W4();
        if (c0VarW4 == null || z10 == c0VarW4.c2().E) {
            return;
        }
        c0VarW4.c2().E = z10;
        c0VarW4.A2();
    }

    public static final void Q5(final s sVar, m4.i0 i0Var, View view) {
        int size;
        a2 a2VarC2;
        a2 a2VarC22;
        a2 a2VarC23;
        Location location;
        String[] stringArray = sVar.x3().getResources().getStringArray(R.array.locationSource);
        List listQ = ed.q.q(Arrays.copyOf(stringArray, stringArray.length));
        v4.c0 c0VarW4 = sVar.W4();
        if (c0VarW4 != null && (a2VarC23 = c0VarW4.c2()) != null && (location = a2VarC23.Y) != null) {
            listQ.add(o5.h.p(location, 2));
        }
        v4.c0 c0VarW42 = sVar.W4();
        if ((c0VarW42 == null || (a2VarC22 = c0VarW42.c2()) == null) ? false : a2VarC22.V) {
            v4.c0 c0VarW43 = sVar.W4();
            size = ((c0VarW43 == null || (a2VarC2 = c0VarW43.c2()) == null) ? null : a2VarC2.Y) != null ? listQ.size() - 1 : -1;
        } else {
            size = 0;
        }
        new c.a(sVar.x3()).z(i0Var.f21223r.getTitle()).x((CharSequence[]) listQ.toArray(new String[0]), size, new DialogInterface.OnClickListener() { // from class: k5.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                s.R5(this.f19432a, dialogInterface, i10);
            }
        }).C();
    }

    public static final void R5(s sVar, DialogInterface dialogInterface, int i10) {
        a2 a2VarC2;
        a2 a2VarC22;
        rd.m.e(dialogInterface, "dialog");
        if (i10 == 0) {
            v4.c0 c0VarW4 = sVar.W4();
            if (c0VarW4 != null && (a2VarC2 = c0VarW4.c2()) != null) {
                a2VarC2.V = false;
            }
            v4.c0 c0VarW42 = sVar.W4();
            if (c0VarW42 != null) {
                c0VarW42.A2();
            }
        } else if (i10 != 1) {
            v4.c0 c0VarW43 = sVar.W4();
            if (c0VarW43 != null && (a2VarC22 = c0VarW43.c2()) != null) {
                a2VarC22.V = true;
            }
            v4.c0 c0VarW44 = sVar.W4();
            if (c0VarW44 != null) {
                c0VarW44.A2();
            }
        } else {
            Context contextK1 = sVar.k1();
            Context contextK12 = sVar.k1();
            sVar.startActivityForResult(com.dw.ht.fragments.j.k5(contextK1, contextK12 != null ? contextK12.getString(android.R.string.ok) : null), 1);
        }
        dialogInterface.dismiss();
        sVar.S5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(v4.n0 link, g3.d packet) {
        m4.i0 i0Var;
        NumberPreferenceView numberPreferenceView;
        rd.m.e(link, "link");
        rd.m.e(packet, "packet");
        if (DeviceFragment.a5(packet)) {
            if (a.f19441a[v4.v.d(packet.e()).ordinal()] != 1 || (i0Var = this.binding) == null || (numberPreferenceView = i0Var.f21229x) == null) {
                return;
            }
            numberPreferenceView.setNumber(packet.k(1));
        }
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        final m4.i0 i0Var = this.binding;
        if (i0Var == null) {
            return;
        }
        i0Var.f21210e.setOnCheckedChangeListener(this);
        i0Var.f21231z.setOnCheckedChangeListener(this);
        i0Var.f21212g.setOnCheckedChangeListener(this);
        i0Var.f21226u.setOnCheckedChangeListener(this);
        i0Var.f21219n.setOnCheckedChangeListener(this);
        i0Var.f21207b.setOnCheckedChangeListener(this);
        i0Var.f21222q.setOnCheckedChangeListener(this);
        i0Var.A.setOnCheckedChangeListener(this);
        i0Var.f21228w.setOnCheckedChangeListener(this);
        i0Var.L.setOnNumberChangeListener(this);
        i0Var.E.setMinValue(0);
        i0Var.E.setMaxValue(30);
        String[] strArr = new String[31];
        strArr[0] = N1(R.string.unlimited);
        for (int i10 = 1; i10 < 31; i10++) {
            strArr[i10] = a6.j.a(H1(), i10 * 10000, 1000L).toString();
        }
        i0Var.E.setDisplayedValues(strArr);
        i0Var.E.setOnNumberChangeListener(this);
        i0Var.C.setMinValue(0);
        i0Var.C.setMaxValue(10);
        String[] strArr2 = new String[11];
        for (int i11 = 0; i11 < 11; i11++) {
            strArr2[i11] = a6.j.b(H1(), i11 * 100, 1000L, 1000L).toString();
        }
        strArr2[0] = N1(R.string.off);
        i0Var.C.setDisplayedValues(strArr2);
        i0Var.C.setOnNumberChangeListener(this);
        i0Var.f21208c.setOnNumberChangeListener(this);
        i0Var.f21224s.setOnNumberChangeListener(this);
        i0Var.f21213h.setOnNumberChangeListener(this);
        i0Var.f21210e.setOnUserChangeCheckedListener(new CompoundButton.OnCheckedChangeListener() { // from class: k5.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                s.I5(this.f19398a, compoundButton, z10);
            }
        });
        i0Var.f21211f.setDisplayedValues(new String[]{N1(R.string.off), a6.j.b(H1(), 900000L, 1000L, 3600000L).toString(), a6.j.b(H1(), 1800000L, 1000L, 3600000L).toString(), a6.j.b(H1(), 3600000L, 1000L, 3600000L).toString(), a6.j.b(H1(), 7200000L, 1000L, 3600000L).toString(), a6.j.b(H1(), 14400000L, 1000L, 3600000L).toString(), a6.j.b(H1(), 28800000L, 1000L, 3600000L).toString(), a6.j.b(H1(), 57600000L, 1000L, 3600000L).toString()});
        i0Var.f21211f.setOnNumberChangeListener(this);
        i0Var.f21217l.setOnClickListener(new View.OnClickListener() { // from class: k5.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                s.L5(this.f19420a, view2);
            }
        });
        i0Var.f21230y.setOnClickListener(new View.OnClickListener() { // from class: k5.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                s.M5(this.f19422a, view2);
            }
        });
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        i0(l1VarY4);
        v4.a0 a0VarD = l1VarY4.d();
        rd.m.d(a0VarD, "getDevInformation(...)");
        if (a0VarD.k() < 45) {
            i0Var.f21230y.setVisibility(8);
        }
        boolean z10 = a0VarD instanceof v4.n;
        if (z10 && ((v4.n) a0VarD).R()) {
            String[] stringArray = H1().getStringArray(R.array.wx_ch_7);
            rd.m.d(stringArray, "getStringArray(...)");
            i0Var.K.setOnNumberChangeListener(this);
            i0Var.K.setMinValue(0);
            i0Var.K.setMaxValue(stringArray.length - 1);
            i0Var.K.setDisplayedValues(stringArray);
            i0Var.f21225t.setVisibility(0);
        }
        if (a0VarD.k() >= 69) {
            l1VarY4.a(v4.v.GET_PP_ID, new byte[0]);
            i0Var.f21229x.setVisibility(0);
            i0Var.f21229x.setOnNumberChangeListener(this);
            i0Var.f21229x.setFormatter(new NumberPreferenceView.a() { // from class: k5.l
                @Override // com.dw.android.widget.NumberPreferenceView.a
                public final String format(int i12) {
                    return s.N5(this.f19425a, i12);
                }
            });
        }
        if (a0VarD.k() >= 78) {
            i0Var.f21222q.setVisibility(0);
        }
        if (a0VarD.k() >= 85) {
            i0Var.f21226u.setVisibility(0);
        }
        if (a0VarD.k() >= 97) {
            i0Var.f21215j.setVisibility(0);
            i0Var.f21215j.setOnCheckedChangeListener(this);
        }
        if (a0VarD.k() >= 100) {
            i0Var.f21214i.setVisibility(0);
            i0Var.f21214i.setOnCheckedChangeListener(this);
        }
        if (a0VarD.k() >= 122 && z10) {
            v4.n nVar = (v4.n) a0VarD;
            if (!nVar.P()) {
                i0Var.f21220o.setVisibility(0);
                String[] strArr3 = new String[201];
                strArr3[0] = N1(R.string._default);
                for (int i12 = 1; i12 < 201; i12++) {
                    strArr3[i12] = (i12 * 10) + " ms";
                }
                i0Var.B.setDisplayedValues(strArr3);
                i0Var.D.setDisplayedValues(strArr3);
                i0Var.B.setOnNumberChangeListener(this);
                i0Var.D.setOnNumberChangeListener(this);
                if (nVar.k() >= 126) {
                    i0Var.F.setVisibility(0);
                    i0Var.F.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k5.m
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                            s.O5(this.f19427a, compoundButton, z11);
                        }
                    });
                }
                i0Var.f21221p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: k5.n
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                        s.P5(this.f19428a, compoundButton, z11);
                    }
                });
            }
        }
        if (a0VarD.k() >= 127) {
            i0Var.f21216k.setVisibility(0);
            i0Var.f21216k.setOnCheckedChangeListener(this);
            i0Var.G.setVisibility(0);
            i0Var.J.setOnNumberChangeListener(this);
            i0Var.I.setOnCheckedChangeListener(this);
            i0Var.H.setOnNumberChangeListener(this);
            i0Var.H.setDisplayedValues(new String[]{"0.5S", "1.0S", "1.5S", "2.0S", "2.5S", "3.0S"});
            if (a0VarD.k() >= 128) {
                i0Var.H.setVisibility(0);
            }
        }
        if (z10 && !((v4.n) a0VarD).T()) {
            i0Var.f21212g.setVisibility(8);
        }
        if (a0VarD.t(a0.d.CustomLocation)) {
            i0Var.f21223r.setVisibility(0);
            i0Var.f21223r.setOnClickListener(new View.OnClickListener() { // from class: k5.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    s.Q5(this.f19429a, i0Var, view2);
                }
            });
        }
        if (a0VarD.t(a0.d.GPWPLUpload)) {
            i0Var.f21218m.setVisibility(0);
            i0Var.f21218m.setOnCheckedChangeListener(this);
        }
        if (Cfg.f5482d) {
            i0Var.f21209d.setVisibility(8);
            i0Var.f21227v.setVisibility(8);
            i0Var.C.setVisibility(8);
            i0Var.f21231z.setVisibility(8);
            i0Var.f21229x.setVisibility(8);
            i0Var.f21210e.setVisibility(8);
        }
    }

    public final void S5() {
        v4.c0 c0VarW4;
        a2 a2VarC2;
        m4.i0 i0Var = this.binding;
        if (i0Var == null || (c0VarW4 = W4()) == null || (a2VarC2 = c0VarW4.c2()) == null) {
            return;
        }
        Location location = a2VarC2.Y;
        if (location == null) {
            location = new Location("");
        }
        if (a2VarC2.V) {
            i0Var.f21223r.setSummary(o5.h.p(location, 2));
        } else {
            i0Var.f21223r.setSummary(R.string.system);
        }
    }

    @Override // com.dw.android.widget.NumberPreferenceView.c
    public void f(NumberPreferenceView view, int from, int number) {
        rd.m.e(view, "view");
        l1 l1VarY4 = Y4();
        v4.c0 c0Var = l1VarY4 instanceof v4.c0 ? (v4.c0) l1VarY4 : null;
        if (c0Var == null) {
            return;
        }
        a2 a2VarC2 = c0Var.c2();
        rd.m.d(a2VarC2, "getSettings(...)");
        switch (view.getId()) {
            case R.id.aghfp_mode /* 2131296389 */:
                if (a2VarC2.f29700o == number) {
                    return;
                } else {
                    a2VarC2.f29700o = number;
                }
                break;
            case R.id.auto_power_off /* 2131296434 */:
                if (a2VarC2.f29705t == number) {
                    return;
                } else {
                    a2VarC2.f29705t = number;
                }
                break;
            case R.id.auto_share_loc_ch /* 2131296437 */:
                if (a2VarC2.f29706u == number) {
                    return;
                } else {
                    a2VarC2.f29706u = number;
                }
                break;
            case R.id.bt_mic_gain /* 2131296490 */:
                if (a2VarC2.b() == number) {
                    return;
                } else {
                    a2VarC2.i(number);
                }
                break;
            case R.id.device_speaker /* 2131296644 */:
                if (a2VarC2.f29690e == number) {
                    return;
                } else {
                    a2VarC2.f29690e = number;
                }
                break;
            case R.id.mic_gain /* 2131296999 */:
                if (a2VarC2.d() == number) {
                    return;
                } else {
                    a2VarC2.l(number);
                }
                break;
            case R.id.pp_id /* 2131297205 */:
                c0Var.b(v4.v.SET_PP_ID, new w4.e(number));
                return;
            case R.id.txDelay /* 2131297590 */:
                if (a2VarC2.N == number) {
                    return;
                } else {
                    a2VarC2.N = number;
                }
                break;
            case R.id.txTail /* 2131297591 */:
                if (a2VarC2.O == number) {
                    return;
                } else {
                    a2VarC2.O = number;
                }
                break;
            case R.id.tx_hold_time /* 2131297600 */:
                if (a2VarC2.f29698m == number) {
                    return;
                } else {
                    a2VarC2.f29698m = number;
                }
                break;
            case R.id.tx_time_limit /* 2131297603 */:
                if (a2VarC2.f29697l == number) {
                    return;
                } else {
                    a2VarC2.f29697l = number;
                }
                break;
            case R.id.vox_delay /* 2131297678 */:
                if (a2VarC2.S == number) {
                    return;
                } else {
                    a2VarC2.S = number;
                }
                break;
            case R.id.vox_level /* 2131297680 */:
                int i10 = number - 1;
                if (a2VarC2.Q == i10) {
                    return;
                } else {
                    a2VarC2.Q = i10;
                }
                break;
            case R.id.wx_ch /* 2131297701 */:
                if (a2VarC2.H == number) {
                    return;
                } else {
                    a2VarC2.H = number;
                }
                break;
            case R.id.wx_mode /* 2131297703 */:
                if (a2VarC2.G == number) {
                    return;
                } else {
                    a2VarC2.G = number;
                }
                break;
            default:
                return;
        }
        c0Var.A2();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i0(v4.n0 r5) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.s.i0(v4.n0):void");
    }

    @Override // androidx.fragment.app.o
    public void m2(int requestCode, int resultCode, Intent data) {
        if (requestCode != 1) {
            super.m2(requestCode, resultCode, data);
            return;
        }
        if (resultCode != -1 || data == null) {
            return;
        }
        double doubleExtra = data.getDoubleExtra("longitude", Double.MAX_VALUE);
        double doubleExtra2 = data.getDoubleExtra("latitude", Double.MAX_VALUE);
        if (doubleExtra == Double.MAX_VALUE || doubleExtra2 == Double.MAX_VALUE) {
            return;
        }
        Location location = new Location("");
        location.setLongitude(doubleExtra);
        location.setLatitude(doubleExtra2);
        location.setTime(System.currentTimeMillis());
        v4.c0 c0VarW4 = W4();
        if (c0VarW4 != null) {
            c0VarW4.c2().V = true;
            c0VarW4.c2().Y = location;
            c0VarW4.A2();
            S5();
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        rd.m.e(buttonView, "buttonView");
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        v4.c0 c0Var = (v4.c0) l1VarY4;
        a2 a2VarC2 = c0Var.c2();
        rd.m.d(a2VarC2, "getSettings(...)");
        switch (buttonView.getId()) {
            case R.id.adaptive_response /* 2131296368 */:
                if (isChecked == a2VarC2.f29702q) {
                    return;
                } else {
                    a2VarC2.f29702q = isChecked;
                }
                break;
            case R.id.audio_relay_en /* 2131296427 */:
                if (isChecked || isChecked == a2VarC2.f29694i) {
                    return;
                } else {
                    a2VarC2.f29694i = isChecked;
                }
                break;
            case R.id.auto_power_on /* 2131296435 */:
                if (isChecked == a2VarC2.f29695j) {
                    return;
                } else {
                    a2VarC2.f29695j = isChecked;
                }
                break;
            case R.id.ch_data_lock /* 2131296530 */:
                if (isChecked == a2VarC2.M) {
                    return;
                } else {
                    a2VarC2.M = isChecked;
                }
                break;
            case R.id.digital_mute /* 2131296648 */:
                if (isChecked == (!a2VarC2.K)) {
                    return;
                } else {
                    a2VarC2.K = !isChecked;
                }
                break;
            case R.id.enable_bt_mic /* 2131296722 */:
                if (isChecked == (!a2VarC2.R)) {
                    return;
                } else {
                    a2VarC2.R = !isChecked;
                }
                break;
            case R.id.gpwpl_upload_en /* 2131296806 */:
                if (isChecked == a2VarC2.W) {
                    return;
                } else {
                    a2VarC2.W = isChecked;
                }
                break;
            case R.id.keep_aghfp_link /* 2131296900 */:
                if (isChecked == a2VarC2.f29696k) {
                    return;
                } else {
                    a2VarC2.f29696k = isChecked;
                }
                break;
            case R.id.leading_sync_bit_en /* 2131296910 */:
                if (isChecked == a2VarC2.A) {
                    return;
                } else {
                    a2VarC2.A = isChecked;
                }
                break;
            case R.id.pairing_at_power_on /* 2131297156 */:
                if (isChecked == a2VarC2.B) {
                    return;
                } else {
                    a2VarC2.B = isChecked;
                }
                break;
            case R.id.power_saving_mode /* 2131297204 */:
                if (isChecked == a2VarC2.f29704s) {
                    return;
                } else {
                    a2VarC2.f29704s = isChecked;
                }
                break;
            case R.id.tail_elimination /* 2131297491 */:
                if (isChecked == a2VarC2.f29693h) {
                    return;
                } else {
                    a2VarC2.f29693h = isChecked;
                }
                break;
            case R.id.tone /* 2131297562 */:
                if (isChecked == a2VarC2.e()) {
                    return;
                } else {
                    a2VarC2.m(isChecked);
                }
                break;
            case R.id.vox_en /* 2131297679 */:
                if (isChecked == a2VarC2.P) {
                    return;
                } else {
                    a2VarC2.P = isChecked;
                }
                break;
            default:
                return;
        }
        c0Var.A2();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        rd.m.e(seekBar, "seekBar");
        l1 l1VarY4 = Y4();
        if (l1VarY4 != null && fromUser) {
            int id2 = seekBar.getId();
            if (id2 != R.id.squelch_level) {
                if (id2 != R.id.vol) {
                    return;
                }
                l1VarY4.a(v4.v.SET_VOLUME, (byte) progress);
                return;
            }
            v4.c0 c0VarH5 = H5();
            if (c0VarH5 == null) {
                return;
            }
            a2 a2VarC2 = c0VarH5.c2();
            rd.m.d(a2VarC2, "getSettings(...)");
            a2VarC2.f29692g = progress;
            c0VarH5.A2();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        rd.m.e(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        rd.m.e(seekBar, "seekBar");
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        y4(R.string.generalSettings);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.i0 i0VarC = m4.i0.c(inflater, container, false);
        this.binding = i0VarC;
        rd.m.b(i0VarC);
        return i0VarC.b();
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    public static final void D5(DialogInterface dialogInterface, int i10) {
    }

    public static final void G5(DialogInterface dialogInterface, int i10) {
    }
}
