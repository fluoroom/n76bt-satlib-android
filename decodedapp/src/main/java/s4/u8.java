package s4;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.BTActivity;
import com.dw.ht.Cfg;
import com.dw.ht.TrackRecordingService;
import com.dw.ht.factory.SettingsFragment;
import com.dw.ht.fragments.DeviceFragment;
import com.dw.ht.ii.IIUserFragment;
import com.dw.ht.provider.a;
import com.dw.ht.satellite.SatelliteActivity;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.xw.repo.BubbleSeekBar;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import w4.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0004J1\u0010\u001b\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001d\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Ls4/u8;", "Lcom/dw/ht/fragments/DeviceFragment;", "Lcom/xw/repo/BubbleSeekBar$k;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "H2", "y2", "Lcom/xw/repo/BubbleSeekBar;", "bubbleSeekBar", "", "progress", "", "progressFloat", "", "fromUser", "J", "(Lcom/xw/repo/BubbleSeekBar;IFZ)V", "b0", "(Lcom/xw/repo/BubbleSeekBar;IF)V", "H0", "Lm4/q1;", "P0", "Lm4/q1;", "binding", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u8 extends DeviceFragment implements BubbleSeekBar.k {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private m4.q1 binding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H5(View view) {
        v4.l1 l1VarR = v4.u.w().r();
        if (l1VarR != null) {
            l1VarR.P(c.a.f31098b.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I5(u8 u8Var, View view) {
        u8Var.O3(new Intent(u8Var.x3(), (Class<?>) BTActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J5(u8 u8Var, View view) {
        FragmentShowActivity.h2(u8Var.x3(), null, IIUserFragment.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K5(View view) throws Exception {
        throw new Exception();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L5(u8 u8Var, View view) {
        u8Var.O3(new Intent(u8Var.x3(), (Class<?>) SatelliteActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M5(m4.q1 q1Var, u8 u8Var, View view) {
        List arrayList = new ArrayList(WXMediaMessage.TITLE_LENGTH_LIMIT);
        Editable text = q1Var.f21454c.getText();
        rd.m.d(text, "getText(...)");
        Iterator it = rg.q.C0(text, new String[]{" "}, false, 0, 6, null).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), rg.a.a(16))));
            } catch (Exception e10) {
                e10.printStackTrace();
                arrayList.add((byte) 0);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        try {
            size = Integer.parseInt(q1Var.f21455d.getText().toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (size <= 0) {
            size = 1;
        }
        if (arrayList.size() > size) {
            arrayList = arrayList.subList(0, size);
        } else {
            byte bByteValue = ((Number) ed.q.k0(arrayList)).byteValue();
            while (arrayList.size() < size) {
                arrayList.add(Byte.valueOf(bByteValue));
            }
        }
        v4.l1 l1VarY4 = u8Var.Y4();
        if (l1VarY4 != null) {
            l1VarY4.O0(new w5.i(ed.q.E0(arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N5(CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        Cfg.Settings settingsO = Cfg.O();
        if (z10 == settingsO.testUseLocalServer) {
            return;
        }
        settingsO.testUseLocalServer = z10;
        Cfg.O0(settingsO);
        f5.d.f12792a.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O5(CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        Cfg.Settings settingsO = Cfg.O();
        if (z10 == settingsO.audioOutputAGC) {
            return;
        }
        settingsO.audioOutputAGC = z10;
        Cfg.O0(settingsO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P5(CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        Cfg.Settings settingsO = Cfg.O();
        if (z10 == settingsO.jfTestMode) {
            return;
        }
        settingsO.jfTestMode = z10;
        Cfg.O0(settingsO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q5(CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        Cfg.Settings settingsO = Cfg.O();
        if (z10 == settingsO.audioOutputNS) {
            return;
        }
        settingsO.audioOutputNS = z10;
        Cfg.O0(settingsO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R5(u8 u8Var, View view) {
        v4.l1 l1VarY4 = u8Var.Y4();
        rd.m.b(l1VarY4);
        FragmentShowActivity.i2(u8Var.x3(), null, SettingsFragment.class, DeviceFragment.b5(l1VarY4.q()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S5(u8 u8Var, View view) {
        FragmentShowActivity.h2(u8Var.x3(), null, h2.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T5(u8 u8Var, View view) {
        FragmentShowActivity.h2(u8Var.x3(), null, n.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U5(final u8 u8Var, View view) {
        hc.g gVarE = hc.g.c(Boolean.TRUE).e(zc.a.b());
        final qd.l lVar = new qd.l() { // from class: s4.j8
            @Override // qd.l
            public final Object l(Object obj) {
                return u8.V5(this.f26547a, (Boolean) obj);
            }
        };
        gVarE.d(new mc.d() { // from class: s4.k8
            @Override // mc.d
            public final Object apply(Object obj) {
                return u8.W5(lVar, obj);
            }
        }).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object V5(u8 u8Var, Boolean bool) throws IOException {
        ContentResolver contentResolver = u8Var.x3().getContentResolver();
        Cursor cursorQuery = contentResolver.query(a.d.f6668a, new String[]{"_id"}, null, null, null);
        if (cursorQuery != null) {
            while (cursorQuery.moveToNext()) {
                try {
                    long j10 = cursorQuery.getLong(0);
                    File fileN = Cfg.n(j10);
                    if (fileN != null && fileN.isFile()) {
                        fileN.delete();
                    }
                    File fileI = Cfg.I(j10);
                    if (fileI != null && fileI.isFile()) {
                        fileI.delete();
                    }
                } finally {
                }
            }
            dd.d0 d0Var = dd.d0.f10897a;
            od.a.a(cursorQuery, null);
        }
        return Integer.valueOf(contentResolver.delete(a.d.f6668a, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object W5(qd.l lVar, Object obj) {
        rd.m.e(obj, "p0");
        return lVar.l(obj);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void H2() {
        m4.q1 q1Var = this.binding;
        if (q1Var != null) {
            Cfg.O().bearer = q1Var.f21456e.getText().toString();
            Cfg.n0();
        }
        super.H2();
    }

    @Override // com.xw.repo.BubbleSeekBar.k
    public void J(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {
        Integer numValueOf = bubbleSeekBar != null ? Integer.valueOf(bubbleSeekBar.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.noiseThreshold) {
            Cfg.f5516z = progressFloat;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.threshold) {
            Cfg.f5515y = progressFloat / 10;
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == R.id.intensity) {
            Cfg.f5514x = progress;
        } else if (numValueOf != null && numValueOf.intValue() == R.id.points) {
            TrackRecordingService.INSTANCE.f(progress);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        h5(v4.u.w().r());
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        final m4.q1 q1VarC = m4.q1.c(inflater, container, false);
        rd.m.d(q1VarC, "inflate(...)");
        this.binding = q1VarC;
        q1VarC.f21472u.setOnClickListener(new View.OnClickListener() { // from class: s4.c8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8.F5(view);
            }
        });
        q1VarC.f21465n.setOnClickListener(new View.OnClickListener() { // from class: s4.r8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8.G5(view);
            }
        });
        q1VarC.f21461j.setChecked(Cfg.O().testUseLocalServer);
        q1VarC.f21461j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s4.s8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                u8.N5(compoundButton, z10);
            }
        });
        q1VarC.f21466o.setChecked(Cfg.O().audioOutputAGC);
        q1VarC.f21466o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s4.t8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                u8.O5(compoundButton, z10);
            }
        });
        q1VarC.f21460i.setChecked(Cfg.O().jfTestMode);
        q1VarC.f21460i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s4.d8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                u8.P5(compoundButton, z10);
            }
        });
        q1VarC.f21467p.setChecked(Cfg.O().audioOutputNS);
        q1VarC.f21467p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s4.e8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                u8.Q5(compoundButton, z10);
            }
        });
        q1VarC.f21453b.setOnClickListener(new View.OnClickListener() { // from class: s4.f8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8.R5(this.f26430a, view);
            }
        });
        q1VarC.f21473v.setOnClickListener(new View.OnClickListener() { // from class: s4.g8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8.S5(this.f26478a, view);
            }
        });
        q1VarC.f21462k.setOnClickListener(new View.OnClickListener() { // from class: s4.h8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8.T5(this.f26515a, view);
            }
        });
        q1VarC.f21457f.setOnClickListener(new View.OnClickListener() { // from class: s4.i8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8.U5(this.f26528a, view);
            }
        });
        q1VarC.f21471t.setOnClickListener(new View.OnClickListener() { // from class: s4.l8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8.H5(view);
            }
        });
        q1VarC.f21463l.setOnClickListener(new View.OnClickListener() { // from class: s4.m8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8.I5(this.f26611a, view);
            }
        });
        q1VarC.f21475x.setOnClickListener(new View.OnClickListener() { // from class: s4.n8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8.J5(this.f26635a, view);
            }
        });
        q1VarC.f21458g.setOnClickListener(new View.OnClickListener() { // from class: s4.o8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Exception {
                u8.K5(view);
            }
        });
        q1VarC.f21469r.setOnClickListener(new View.OnClickListener() { // from class: s4.p8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8.L5(this.f26661a, view);
            }
        });
        q1VarC.f21470s.setOnClickListener(new View.OnClickListener() { // from class: s4.q8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8.M5(q1VarC, this, view);
            }
        });
        q1VarC.f21456e.setText(Cfg.O().bearer);
        q1VarC.f21459h.setProgress(Cfg.f5514x);
        q1VarC.f21474w.setProgress(Cfg.f5515y * 10);
        q1VarC.f21464m.setProgress(Cfg.f5516z);
        q1VarC.f21468q.setProgress(TrackRecordingService.INSTANCE.a());
        q1VarC.f21459h.setOnProgressChangedListener(this);
        q1VarC.f21474w.setOnProgressChangedListener(this);
        q1VarC.f21464m.setOnProgressChangedListener(this);
        q1VarC.f21468q.setOnProgressChangedListener(this);
        ScrollView scrollViewB = q1VarC.b();
        rd.m.d(scrollViewB, "getRoot(...)");
        return scrollViewB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        this.binding = null;
        super.y2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F5(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G5(View view) {
    }

    @Override // com.xw.repo.BubbleSeekBar.k
    public void b0(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat) {
    }

    @Override // com.xw.repo.BubbleSeekBar.k
    public void H0(BubbleSeekBar bubbleSeekBar, int progress, float progressFloat, boolean fromUser) {
    }
}
