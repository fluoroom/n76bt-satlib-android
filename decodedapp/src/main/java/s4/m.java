package s4;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.benshikj.ht.R;
import com.dw.android.plot.PlotView;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.ht.Cfg;
import com.dw.sbc.SbcDecoder;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.xw.repo.BubbleSeekBar;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0003PQRB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0004J!\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0004J\r\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u0004J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u001f\u0010#\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R$\u0010*\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010,\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R$\u0010.\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R\u0018\u00101\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R.\u0010B\u001a\u0004\u0018\u0001082\b\u0010<\u001a\u0004\u0018\u0001088B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b=\u0010:\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010F\u001a\b\u0018\u00010CR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006S"}, d2 = {"Ls4/m;", "Lv3/m0;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "Ldd/d0;", "L4", "N4", "P4", "M4", "E4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "O4", "K4", "Landroid/content/Context;", "context", "o2", "(Landroid/content/Context;)V", "z2", "Landroid/widget/CompoundButton;", "buttonView", "", "isChecked", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "Ljava/util/ArrayList;", "Lcom/dw/android/plot/b;", "Lkotlin/collections/ArrayList;", "F0", "Ljava/util/ArrayList;", "mAfskPlots", "G0", "mMorseCodePlots", "H0", "mSubaudios", "I0", "Lcom/dw/android/plot/b;", "refPlot", "J0", "mAudioPlot", "Lcom/dw/android/plot/a;", "K0", "Lcom/dw/android/plot/a;", "mGrid1s", "", "L0", "[F", "audio", "value", "M0", "F4", "()[F", "J4", "([F)V", "audioF", "Ls4/m$c;", "N0", "Ls4/m$c;", "mAudioDataAdapter", "Lm4/p;", "O0", "Lm4/p;", "getBinding", "()Lm4/p;", "setBinding", "(Lm4/p;)V", "binding", "P0", "a", "c", "b", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends v3.m0 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private final ArrayList mAfskPlots = new ArrayList();

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private final ArrayList mMorseCodePlots = new ArrayList();

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private final ArrayList mSubaudios = new ArrayList();

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private com.dw.android.plot.b refPlot;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private com.dw.android.plot.b mAudioPlot;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private com.dw.android.plot.a mGrid1s;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private float[] audio;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private float[] audioF;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private c mAudioDataAdapter;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private m4.p binding;

    public static final class d implements BubbleSeekBar.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f26595a;

        d() {
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void H0(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
            rd.m.e(bubbleSeekBar, "bubbleSeekBar");
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void J(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10) {
            rd.m.e(bubbleSeekBar, "bubbleSeekBar");
            if (this.f26595a == f10) {
                return;
            }
            this.f26595a = f10;
            m.this.K4();
        }

        @Override // com.xw.repo.BubbleSeekBar.k
        public void b0(BubbleSeekBar bubbleSeekBar, int i10, float f10) {
            rd.m.e(bubbleSeekBar, "bubbleSeekBar");
        }
    }

    private final void E4() {
        m4.p pVar = this.binding;
        if (pVar == null) {
            return;
        }
        int iG = a6.k.g(k1(), 1.0f);
        com.dw.android.plot.c cVar = new com.dw.android.plot.c(pVar.f21413n, true);
        cVar.m(iG);
        pVar.f21413n.e(cVar);
        cVar.l(32000.0f);
        cVar.k(2.0f);
        cVar.j(-2013265920);
        this.mGrid1s = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float[] F4() {
        /*
            r4 = this;
            float[] r0 = r4.audioF
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            m4.p r1 = r4.binding
            if (r1 == 0) goto L13
            android.widget.SeekBar r1 = r1.f21405f
            if (r1 == 0) goto L13
            int r1 = r1.getProgress()
            goto L14
        L13:
            r1 = 0
        L14:
            int r2 = r0.length
            if (r1 >= r2) goto L2a
            float[] r2 = r4.audio
            if (r2 == 0) goto L23
            rd.m.b(r2)
            int r2 = r2.length
            int r2 = r2 + r1
            int r3 = r0.length
            if (r2 == r3) goto L2a
        L23:
            int r2 = r0.length
            float[] r0 = ed.j.o(r0, r1, r2)
            r4.audio = r0
        L2a:
            float[] r0 = r4.audio
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.m.F4():float[]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G4(m4.p pVar, m mVar, CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "<unused var>");
        pVar.f21415p.setVisibility(z10 ? 0 : 8);
        mVar.O4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H4(m4.p pVar, NumberPreferenceView numberPreferenceView, int i10, int i11) {
        rd.m.e(numberPreferenceView, "<unused var>");
        pVar.f21404e.setProgress(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I4(m4.p pVar, NumberPreferenceView numberPreferenceView, int i10, int i11) {
        rd.m.e(numberPreferenceView, "<unused var>");
        pVar.f21424y.setProgress(i11);
    }

    private final void J4(float[] fArr) {
        this.audioF = fArr;
        this.audio = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L4() {
        float[] fArrF4;
        m4.p pVar = this.binding;
        com.dw.android.plot.b bVar = null;
        if ((pVar != null ? pVar.f21413n : null) == null || (fArrF4 = F4()) == null) {
            return;
        }
        this.mAudioDataAdapter = new c(this, new b4.b(fArrF4), 0, 2, null);
        com.dw.android.plot.b bVar2 = this.mAudioPlot;
        if (bVar2 == null) {
            rd.m.o("mAudioPlot");
        } else {
            bVar = bVar2;
        }
        bVar.k(this.mAudioDataAdapter);
    }

    private final void M4() {
        m4.p pVar = this.binding;
        if (pVar == null) {
            return;
        }
        Iterator it = this.mMorseCodePlots.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            rd.m.d(next, "next(...)");
            pVar.f21413n.l((com.dw.android.plot.b) next);
        }
        this.mMorseCodePlots.clear();
        if (pVar.f21410k.isChecked() && F4() != null) {
            ok.b bVar = new ok.b();
            bVar.f(2, 32000.0d, 100.0d);
            i4.b bVar2 = new i4.b(32000, a4.b.f281v, 1.0d);
            float[] fArrF4 = F4();
            rd.m.b(fArrF4);
            int length = fArrF4.length;
            float[] fArr = new float[length];
            float[] fArrF42 = F4();
            rd.m.b(fArrF42);
            int length2 = fArrF42.length;
            float[] fArr2 = new float[length2];
            float[] fArrF43 = F4();
            rd.m.b(fArrF43);
            float[] fArr3 = new float[fArrF43.length];
            for (int i10 = 0; i10 < length; i10++) {
                rd.m.b(F4());
                fArr[i10] = (float) bVar.c(Math.abs(r10[i10]));
            }
            for (int i11 = 0; i11 < length; i11++) {
                fArr2[i11] = (float) bVar2.a(((double) fArr[i11]) / 2.0d);
            }
            int i12 = length - 3200;
            for (int i13 = 0; i13 < i12; i13++) {
                float f10 = fArr[i13];
                fArr3[i13] = (f10 <= fArr2[i13 + 3200] || f10 <= a4.b.f280u) ? 0.0f : 0.1f;
            }
            b4.b bVar3 = new b4.b(fArr);
            com.dw.android.plot.b bVarI = pVar.f21413n.i();
            bVarI.j(-16711681);
            bVarI.l(4.0f);
            c cVar = this.mAudioDataAdapter;
            rd.m.b(cVar);
            bVarI.k(new c(this, bVar3, cVar.d()));
            this.mMorseCodePlots.add(bVarI);
            b4.b bVar4 = new b4.b(Arrays.copyOfRange(fArr2, 3200, length2));
            com.dw.android.plot.b bVarI2 = pVar.f21413n.i();
            bVarI2.j(-65536);
            bVarI2.l(4.0f);
            c cVar2 = this.mAudioDataAdapter;
            rd.m.b(cVar2);
            bVarI2.k(new c(this, bVar4, cVar2.d()));
            this.mMorseCodePlots.add(bVarI2);
            b4.b bVar5 = new b4.b(fArr3);
            com.dw.android.plot.b bVarI3 = pVar.f21413n.i();
            bVarI3.j(-16776961);
            bVarI3.l(4.0f);
            c cVar3 = this.mAudioDataAdapter;
            rd.m.b(cVar3);
            bVarI3.k(new c(this, bVar5, cVar3.d()));
            this.mMorseCodePlots.add(bVarI3);
        }
    }

    private final void N4() {
        m4.p pVar = this.binding;
        if (pVar == null) {
            return;
        }
        boolean zIsChecked = pVar.f21417r.isChecked();
        com.dw.android.plot.b bVar = null;
        PlotView plotView = pVar.f21413n;
        if (zIsChecked) {
            com.dw.android.plot.b bVar2 = this.mAudioPlot;
            if (bVar2 == null) {
                rd.m.o("mAudioPlot");
            } else {
                bVar = bVar2;
            }
            plotView.e(bVar);
        } else {
            com.dw.android.plot.b bVar3 = this.mAudioPlot;
            if (bVar3 == null) {
                rd.m.o("mAudioPlot");
            } else {
                bVar = bVar3;
            }
            plotView.l(bVar);
        }
        K4();
        P4();
    }

    private final void P4() {
        m4.p pVar = this.binding;
        if (pVar == null) {
            return;
        }
        Iterator it = this.mSubaudios.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            rd.m.d(next, "next(...)");
            pVar.f21413n.l((com.dw.android.plot.b) next);
        }
        if ((pVar.f21406g.isChecked() || pVar.f21407h.isChecked()) && F4() != null) {
            if (pVar.f21406g.isChecked()) {
                ok.b bVar = new ok.b();
                bVar.f(2, 32000.0d, 110.0d);
                float[] fArrF4 = F4();
                rd.m.b(fArrF4);
                int length = fArrF4.length;
                float[] fArr = new float[length];
                for (int i10 = 0; i10 < length; i10++) {
                    rd.m.b(F4());
                    fArr[i10] = (float) bVar.c(r7[i10]);
                }
                b4.b bVar2 = new b4.b(fArr);
                com.dw.android.plot.b bVarI = pVar.f21413n.i();
                bVarI.j(-65536);
                bVarI.l(4.0f);
                c cVar = this.mAudioDataAdapter;
                rd.m.b(cVar);
                bVarI.k(new c(this, bVar2, cVar.d()));
                this.mSubaudios.add(bVarI);
            }
            if (pVar.f21407h.isChecked()) {
                ok.b bVar3 = new ok.b();
                bVar3.f(2, 32000.0d, 250.0d);
                float[] fArrF42 = F4();
                rd.m.b(fArrF42);
                int length2 = fArrF42.length;
                float[] fArr2 = new float[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    rd.m.b(F4());
                    fArr2[i11] = (float) bVar3.c(r6[i11]);
                }
                b4.b bVar4 = new b4.b(fArr2);
                com.dw.android.plot.b bVarI2 = pVar.f21413n.i();
                bVarI2.j(-16776961);
                bVarI2.l(4.0f);
                c cVar2 = this.mAudioDataAdapter;
                rd.m.b(cVar2);
                bVarI2.k(new c(this, bVar4, cVar2.d()));
                this.mSubaudios.add(bVarI2);
            }
        }
    }

    public final void K4() {
        float progressFloat;
        String strC;
        String localizedMessage;
        String str;
        m4.p pVar = this.binding;
        if (pVar == null) {
            return;
        }
        Iterator it = this.mAfskPlots.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            rd.m.d(next, "next(...)");
            pVar.f21413n.l((com.dw.android.plot.b) next);
        }
        this.mAfskPlots.clear();
        if (!pVar.f21416q.isChecked()) {
            pVar.f21411l.setVisibility(8);
            return;
        }
        pVar.f21411l.setVisibility(0);
        if (F4() == null) {
            return;
        }
        a aVar = pVar.f21418s.isChecked() ? new a(32000, pVar.f21409j.isChecked(), pVar.f21406g.isChecked(), 2083.3333f, 1562.5f, 520.8333f, 1, true) : new a(32000, pVar.f21409j.isChecked(), pVar.f21406g.isChecked(), 0.0f, 0.0f, 0.0f, 0, false, 248, null);
        try {
            progressFloat = pVar.f21401b.getProgressFloat();
        } catch (NumberFormatException unused) {
            progressFloat = 1.0f;
        }
        aVar.c(progressFloat);
        float[] fArrF4 = F4();
        rd.m.b(fArrF4);
        a.C0367a c0367aA = aVar.a(fArrF4);
        b4.b bVar = new b4.b(c0367aA.a());
        com.dw.android.plot.b bVarI = pVar.f21413n.i();
        rd.m.d(bVarI, "newPlot(...)");
        bVarI.j(-65536);
        bVarI.l(4.0f);
        c cVar = this.mAudioDataAdapter;
        rd.m.b(cVar);
        bVarI.k(new c(this, bVar, cVar.d()));
        this.mAfskPlots.add(bVarI);
        b4.b bVar2 = new b4.b(c0367aA.c());
        com.dw.android.plot.b bVarI2 = pVar.f21413n.i();
        rd.m.d(bVarI2, "newPlot(...)");
        bVarI2.j(-16711936);
        bVarI2.l(4.0f);
        c cVar2 = this.mAudioDataAdapter;
        rd.m.b(cVar2);
        bVarI2.k(new c(this, bVar2, cVar2.d()));
        this.mAfskPlots.add(bVarI2);
        float[] fArrA = c0367aA.a();
        rd.m.b(fArrA);
        int length = fArrA.length;
        float[] fArr = new float[length];
        float fAbs = 0.0f;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            float[] fArrA2 = c0367aA.a();
            rd.m.b(fArrA2);
            float f11 = fArrA2[i10];
            float[] fArrC = c0367aA.c();
            rd.m.b(fArrC);
            f10 += ((f11 + fArrC[i10]) - f10) * 0.01f;
            fArr[i10] = f10;
        }
        b4.b bVar3 = new b4.b(fArr);
        com.dw.android.plot.b bVarI3 = pVar.f21413n.i();
        rd.m.d(bVarI3, "newPlot(...)");
        bVarI3.j(-256);
        bVarI3.l(4.0f);
        c cVar3 = this.mAudioDataAdapter;
        rd.m.b(cVar3);
        bVarI3.k(new c(this, bVar3, cVar3.d()));
        this.mAfskPlots.add(bVarI3);
        float[] fArrF42 = F4();
        rd.m.b(fArrF42);
        float[] fArrA3 = c0367aA.a();
        rd.m.b(fArrA3);
        int length2 = fArrA3.length;
        float[] fArr2 = new float[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            fAbs += (Math.abs(fArrF42[i11]) - fAbs) * 0.01f;
            fArr2[i11] = fAbs;
        }
        b4.b bVar4 = new b4.b(fArr2);
        com.dw.android.plot.b bVarI4 = pVar.f21413n.i();
        rd.m.d(bVarI4, "newPlot(...)");
        bVarI4.j(-65536);
        bVarI4.l(4.0f);
        c cVar4 = this.mAudioDataAdapter;
        rd.m.b(cVar4);
        bVarI4.k(new c(this, bVar4, cVar4.d()));
        this.mAfskPlots.add(bVarI4);
        float[] fArrA4 = c0367aA.a();
        rd.m.b(fArrA4);
        int length3 = fArrA4.length;
        float[] fArr3 = new float[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            fArr3[i12] = fArr[i12] / fArr2[i12];
        }
        b4.b bVar5 = new b4.b(fArr3);
        com.dw.android.plot.b bVarI5 = pVar.f21413n.i();
        rd.m.d(bVarI5, "newPlot(...)");
        bVarI5.j(-16776961);
        bVarI5.l(4.0f);
        c cVar5 = this.mAudioDataAdapter;
        rd.m.b(cVar5);
        bVarI5.k(new c(this, bVar5, cVar5.d()));
        this.mAfskPlots.add(bVarI5);
        b4.b bVar6 = new b4.b(c0367aA.b());
        com.dw.android.plot.b bVarI6 = pVar.f21413n.i();
        rd.m.d(bVarI6, "newPlot(...)");
        bVarI6.j(-65536);
        bVarI6.l(4.0f);
        c cVar6 = this.mAudioDataAdapter;
        rd.m.b(cVar6);
        bVarI6.k(new c(this, bVar6, cVar6.d()));
        this.mAfskPlots.add(bVarI6);
        b4.b bVar7 = new b4.b(c0367aA.e());
        com.dw.android.plot.b bVarI7 = pVar.f21413n.i();
        rd.m.d(bVarI7, "newPlot(...)");
        bVarI7.j(-1442840321);
        bVarI7.l(4.0f);
        c cVar7 = this.mAudioDataAdapter;
        rd.m.b(cVar7);
        bVarI7.k(new c(this, bVar7, cVar7.d()));
        this.mAfskPlots.add(bVarI7);
        if (c0367aA.f().size() > 0) {
            ArrayList arrayListB = d4.d.b();
            ArrayList<byte[]> arrayListF = c0367aA.f();
            rd.m.d(arrayListF, "<get-packets>(...)");
            for (byte[] bArr : arrayListF) {
                if (pVar.f21418s.isChecked()) {
                    rd.m.b(bArr);
                    str = new String(bArr, rg.d.f26007b);
                } else {
                    try {
                        localizedMessage = rg.q.j("\n                 " + w5.h.j(bArr, 0, bArr.length) + "\n                 len:" + bArr.length + "\n                 ");
                    } catch (w5.g e10) {
                        localizedMessage = e10.getLocalizedMessage();
                    }
                    str = localizedMessage;
                }
                arrayListB.add(str);
            }
            strC = a6.w.c("\n", arrayListB);
        } else {
            strC = "FCS ERR:" + TextUtils.join(",", c0367aA.d());
        }
        pVar.f21408i.setText(strC);
    }

    public final void O4() {
        c cVar;
        m4.p pVar = this.binding;
        if (pVar == null) {
            return;
        }
        com.dw.android.plot.b bVar = this.refPlot;
        if (bVar != null) {
            pVar.f21413n.l(bVar);
            this.refPlot = null;
        }
        if (pVar.f21414o.isChecked() && (cVar = this.mAudioDataAdapter) != null) {
            z3.a aVar = new z3.a(32000, pVar.f21403d.getNumber(), (short) ((pVar.f21423x.getNumber() * 32767) / 100));
            aVar.k((((double) pVar.f21412m.getProgress()) * 6.283185307179586d) / ((double) pVar.f21412m.getMax()));
            c cVar2 = new c(this, new w3.b(aVar, w3.d.PCM_FLOAT), cVar.d());
            com.dw.android.plot.b bVarI = pVar.f21413n.i();
            bVarI.j(-65536);
            bVarI.k(cVar2);
            this.refPlot = bVarI;
        }
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) throws Throwable {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        final m4.p pVar = this.binding;
        if (pVar == null) {
            return;
        }
        if (Cfg.f5476a) {
            pVar.f21402c.setVisibility(0);
        }
        pVar.f21401b.setOnProgressChangedListener(new d());
        pVar.f21417r.setOnCheckedChangeListener(this);
        pVar.f21416q.setOnCheckedChangeListener(this);
        pVar.f21418s.setOnCheckedChangeListener(this);
        pVar.f21406g.setOnCheckedChangeListener(this);
        pVar.f21407h.setOnCheckedChangeListener(this);
        pVar.f21410k.setOnCheckedChangeListener(this);
        E4();
        pVar.f21413n.setMaxValue(1.0f);
        pVar.f21413n.setMinValue(3.051851E-5f);
        for (float f10 = 1.0f; f10 >= 0.01d; f10 /= 2.0f) {
            pVar.f21413n.j(f10);
            pVar.f21413n.j(-f10);
        }
        pVar.f21413n.k(a4.b.f280u, -65536);
        pVar.f21413n.k(-a4.b.f280u, -65536);
        pVar.f21413n.k(4.8829615E-4f, -16711936);
        pVar.f21413n.k(-4.8829615E-4f, -267387136);
        pVar.f21413n.k(0.0f, -65536);
        com.dw.android.plot.b bVarI = pVar.f21413n.i();
        rd.m.d(bVarI, "newPlot(...)");
        this.mAudioPlot = bVarI;
        w3.c aVar = null;
        if (bVarI == null) {
            rd.m.o("mAudioPlot");
            bVarI = null;
        }
        bVarI.l(2.0f);
        Bundle bundleI1 = i1();
        rd.m.b(bundleI1);
        long j10 = bundleI1.getLong("SESSION_ID");
        File fileN = Cfg.n(j10);
        if (fileN == null || !fileN.isFile()) {
            byte[] bArrC = SbcDecoder.c(d5.g.l(x3().getContentResolver(), j10), false);
            if (bArrC != null) {
                aVar = new b4.a(bArrC, w3.d.PCM_16BIT_LE);
            }
        } else {
            short[] sArrA = o5.e.a(fileN);
            rd.m.b(sArrA);
            int length = sArrA.length;
            for (int i10 = 0; i10 < length; i10++) {
                sArrA[i10] = (short) (-sArrA[i10]);
            }
            aVar = new b4.c(sArrA);
        }
        if (aVar == null) {
            return;
        }
        w3.b bVar = new w3.b(aVar, w3.d.PCM_FLOAT);
        int iA = bVar.a();
        float[] fArr = new float[iA];
        bVar.d(fArr, 0, iA);
        J4(fArr);
        L4();
        pVar.f21413n.m(0.0f, 1.0f, Math.min(iA, 64000), -1.0f);
        new a(32000, pVar.f21409j.isChecked(), pVar.f21406g.isChecked(), 0.0f, 0.0f, 0.0f, 0, false, 248, null);
        K4();
        M4();
        N4();
        P4();
        pVar.f21414o.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s4.j
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                m.G4(pVar, this, compoundButton, z10);
            }
        });
        pVar.f21403d.setOnNumberChangeListener(new NumberPreferenceView.c() { // from class: s4.k
            @Override // com.dw.android.widget.NumberPreferenceView.c
            public final void f(NumberPreferenceView numberPreferenceView, int i11, int i12) {
                m.H4(pVar, numberPreferenceView, i11, i12);
            }
        });
        pVar.f21423x.setOnNumberChangeListener(new NumberPreferenceView.c() { // from class: s4.l
            @Override // com.dw.android.widget.NumberPreferenceView.c
            public final void f(NumberPreferenceView numberPreferenceView, int i11, int i12) {
                m.I4(pVar, numberPreferenceView, i11, i12);
            }
        });
        pVar.f21424y.setOnSeekBarChangeListener(new e(pVar, this));
        pVar.f21405f.setOnSeekBarChangeListener(new f());
        pVar.f21404e.setOnSeekBarChangeListener(new g(pVar, this));
        pVar.f21412m.setOnSeekBarChangeListener(new h());
        O4();
    }

    @Override // androidx.fragment.app.o
    public void o2(Context context) {
        rd.m.e(context, "context");
        super.o2(context);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        rd.m.e(buttonView, "buttonView");
        switch (buttonView.getId()) {
            case R.id.lp /* 2131296946 */:
                K4();
                P4();
                break;
            case R.id.lp250 /* 2131296947 */:
                P4();
                N4();
                break;
            case R.id.morse_code /* 2131297018 */:
                M4();
                break;
            case R.id.show_afsk_decode /* 2131297382 */:
            case R.id.show_audio /* 2131297383 */:
            case R.id.show_same_decode /* 2131297385 */:
                N4();
                break;
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.p pVarC = m4.p.c(v1(), container, false);
        this.binding = pVarC;
        rd.m.b(pVarC);
        LinearLayout linearLayoutB = pVarC.b();
        rd.m.d(linearLayoutB, "getRoot(...)");
        return linearLayoutB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        this.binding = null;
        super.y2();
    }

    @Override // v3.v, androidx.fragment.app.o
    public void z2() {
        super.z2();
    }

    private final class c implements q3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w3.c f26591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f26592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f26593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ m f26594d;

        public c(m mVar, w3.c cVar, int i10) {
            rd.m.e(cVar, "mStream");
            this.f26594d = mVar;
            this.f26591a = cVar;
            this.f26592b = i10;
            this.f26593c = 320000;
            if (i10 < 0) {
                throw new IllegalArgumentException("流必须支持长度查询");
            }
        }

        @Override // q3.b
        public int c(float[] fArr, int i10, int i11) {
            rd.m.e(fArr, "buf");
            int iD = this.f26591a.d(fArr, i10, i11);
            this.f26591a.b(-iD);
            return iD;
        }

        @Override // q3.b
        public int d() {
            return this.f26592b;
        }

        @Override // q3.b
        public void g(int i10) {
            if (this.f26592b == i10) {
                return;
            }
            int i11 = this.f26593c;
            if (i10 > i11) {
                i10 = i11;
            }
            this.f26592b = i10;
        }

        @Override // q3.b
        public int length() {
            return this.f26591a.a();
        }

        @Override // q3.b
        public boolean q() {
            return false;
        }

        @Override // q3.b
        public boolean s(int i10) {
            this.f26591a.f(i10);
            return true;
        }

        public /* synthetic */ c(m mVar, w3.c cVar, int i10, int i11, rd.h hVar) {
            this(mVar, cVar, (i11 & 2) != 0 ? Math.min(cVar.a(), 64000) : i10);
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f26569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f26570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f26571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f26572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f26573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float[] f26574f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float[] f26575g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float[] f26576h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f26577i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f26578j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final float[] f26579k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final float[] f26580l;

        /* JADX INFO: renamed from: s4.m$a$a, reason: collision with other inner class name */
        public static final class C0367a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private float[] f26581a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float[] f26582b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float[] f26583c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float[] f26584d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private ArrayList f26585e = d4.d.b();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList f26586f = d4.d.b();

            public final float[] a() {
                return this.f26581a;
            }

            public final float[] b() {
                return this.f26583c;
            }

            public final float[] c() {
                return this.f26582b;
            }

            public final ArrayList d() {
                return this.f26585e;
            }

            public final float[] e() {
                return this.f26584d;
            }

            public final ArrayList f() {
                return this.f26586f;
            }

            public final void g(float[] fArr) {
                this.f26581a = fArr;
            }

            public final void h(float[] fArr) {
                this.f26583c = fArr;
            }

            public final void i(float[] fArr) {
                this.f26582b = fArr;
            }

            public final void j(float[] fArr) {
                this.f26584d = fArr;
            }
        }

        public static final class b extends v5.c {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ C0367a f26587k;

            b(C0367a c0367a) {
                this.f26587k = c0367a;
            }

            @Override // v5.c
            protected void b(byte[] bArr, int i10, int i11) {
                rd.m.e(bArr, "buffer");
                this.f26587k.f().add(ed.j.n(bArr, i10, i11));
            }

            @Override // v5.c
            protected void c(byte[] bArr, int i10, int i11) {
                rd.m.e(bArr, "buffer");
                this.f26587k.f().add(ed.j.n(bArr, i10, i11));
            }
        }

        public static final class c extends v5.a {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ rg.g f26589i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ C0367a f26590j;

            c(rg.g gVar, C0367a c0367a) {
                this.f26589i = gVar;
                this.f26590j = c0367a;
            }

            @Override // v5.a
            protected void b(byte[] bArr, int i10, int i11) {
                rd.m.e(bArr, "buffer");
                rd.g0 g0Var = rd.g0.f25951a;
                String str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(a.this.b())}, 1));
                rd.m.d(str, "format(...)");
                s3.b.b("AnalyzeFragment", "receiveBadPacket:[" + str + ']' + rg.f.h(ed.j.n(bArr, i10, i11), this.f26589i));
                this.f26590j.d().add(Integer.valueOf(i11));
            }

            @Override // v5.a
            protected void c(byte[] bArr, int i10, int i11) {
                rd.m.e(bArr, "buffer");
                rd.g0 g0Var = rd.g0.f25951a;
                String str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(a.this.b())}, 1));
                rd.m.d(str, "format(...)");
                s3.b.h("AnalyzeFragment", "receivePacket:[" + str + ']' + rg.f.h(ed.j.n(bArr, i10, i11), this.f26589i));
                this.f26590j.f().add(ed.j.n(bArr, i10, i11));
            }
        }

        public a(int i10, boolean z10, boolean z11, float f10, float f11, float f12, int i11, boolean z12) {
            this.f26569a = z12;
            this.f26577i = 1.0f;
            this.f26579k = new float[]{0.014375446f, 0.0075531187f, 0.009378666f, 0.011374977f, 0.013503511f, 0.01577066f, 0.018111473f, 0.020508276f, 0.022932032f, 0.025324088f, 0.027652914f, 0.029881816f, 0.031965267f, 0.033864267f, 0.035535455f, 0.03694869f, 0.038083095f, 0.038911533f, 0.039416447f, 0.03958709f, 0.039416447f, 0.038911533f, 0.038083095f, 0.03694869f, 0.035535455f, 0.033864267f, 0.031965267f, 0.029881816f, 0.027652914f, 0.025324088f, 0.022932032f, 0.020508276f, 0.018111473f, 0.01577066f, 0.013503511f, 0.011374977f, 0.009378666f, 0.0075531187f, 0.014375446f};
            this.f26580l = new float[]{0.05165803f, 0.012117464f, 0.013375518f, 0.014686276f, 0.016016057f, 0.017318305f, 0.018580724f, 0.01981184f, 0.021011468f, 0.022160577f, 0.023233715f, 0.024214718f, 0.025099624f, 0.025888247f, 0.02657634f, 0.027155263f, 0.027616018f, 0.027951488f, 0.02815591f, 0.028224682f, 0.02815591f, 0.027951488f, 0.027616018f, 0.027155263f, 0.02657634f, 0.025888247f, 0.025099624f, 0.024214718f, 0.023233715f, 0.022160577f, 0.021011468f, 0.01981184f, 0.018580724f, 0.017318305f, 0.016016057f, 0.014686276f, 0.013375518f, 0.012117464f, 0.05165803f};
            float f13 = i10;
            int iB = td.a.b(f13 / f12);
            this.f26570b = iB;
            this.f26571c = td.a.b(((WXMediaMessage.THUMB_LENGTH_LIMIT * f12) * i11) / f13);
            this.f26572d = new float[iB];
            this.f26573e = new float[iB];
            this.f26574f = new float[iB];
            this.f26575g = new float[iB];
            if (!z10) {
                float f14 = 0.0f;
                float f15 = 0.0f;
                for (int i12 = 0; i12 < this.f26570b; i12++) {
                    double d10 = f15;
                    this.f26572d[i12] = (float) Math.cos(d10);
                    this.f26573e[i12] = (float) Math.sin(d10);
                    f15 += (float) ((((double) f10) * 6.283185307179586d) / ((double) i10));
                }
                for (int i13 = 0; i13 < this.f26570b; i13++) {
                    double d11 = f14;
                    this.f26574f[i13] = (float) Math.cos(d11);
                    this.f26575g[i13] = (float) Math.sin(d11);
                    f14 += (float) ((((double) f11) * 6.283185307179586d) / ((double) f13));
                }
            }
            if (!z11) {
                this.f26578j = 0;
                this.f26576h = null;
            } else {
                float[] fArr = {9.6495514E-4f, -0.008745726f, -0.008754533f, -0.011565957f, -0.01433539f, -0.016287487f, -0.016825028f, -0.015396106f, -0.011550771f, -0.0050113723f, 0.0042701773f, 0.016073456f, 0.029886134f, 0.0449723f, 0.06036089f, 0.07498555f, 0.08776859f, 0.09771055f, 0.104016915f, 0.10617748f, 0.104016915f, 0.09771055f, 0.08776859f, 0.07498555f, 0.06036089f, 0.0449723f, 0.029886134f, 0.016073456f, 0.0042701773f, -0.0050113723f, -0.011550771f, -0.015396106f, -0.016825028f, -0.016287487f, -0.01433539f, -0.011565957f, -0.008754533f, -0.008745726f, 9.6495514E-4f};
                this.f26576h = fArr;
                this.f26578j = fArr.length;
            }
        }

        public final C0367a a(float[] fArr) {
            float f10;
            rd.m.e(fArr, "in");
            float[] fArr2 = new float[fArr.length + this.f26570b];
            float[] fArr3 = new float[fArr.length];
            float[] fArr4 = new float[fArr.length];
            float[] fArr5 = new float[fArr.length];
            int length = fArr.length;
            float[] fArr6 = new float[length];
            C0367a c0367a = new C0367a();
            v5.b bVar = this.f26569a ? new b(c0367a) : new c(rg.g.f26032d.b(), c0367a);
            int i10 = 0;
            while (i10 < this.f26570b) {
                fArr2[i10] = 0.0f;
                i10++;
            }
            System.arraycopy(fArr, 0, fArr2, i10, fArr.length);
            float f11 = 0.0625f;
            if (this.f26576h != null) {
                int length2 = fArr.length;
                int i11 = this.f26578j;
                float[] fArr7 = new float[length2 + i11];
                float[] fArr8 = new float[fArr.length + i11];
                for (int i12 = 0; i12 < this.f26578j; i12++) {
                    fArr7[i12] = 0.0f;
                    fArr8[i12] = 0.0f;
                }
                int i13 = 0;
                while (i13 < length) {
                    float fA = i4.a.a(fArr2, i13, this.f26572d) * f11;
                    float fA2 = i4.a.a(fArr2, i13, this.f26573e) * f11;
                    float fA3 = i4.a.a(fArr2, i13, this.f26574f) * 0.0625f;
                    float fA4 = i4.a.a(fArr2, i13, this.f26575g) * 0.0625f;
                    float f12 = (fA * fA) + (fA2 * fA2);
                    float f13 = ((fA3 * fA3) + (fA4 * fA4)) * this.f26577i;
                    int i14 = this.f26578j;
                    fArr8[i13 + i14] = f13;
                    fArr7[i14 + i13] = f12;
                    i13++;
                    f11 = 0.0625f;
                }
                f10 = 0.0f;
                for (int i15 = 0; i15 < length; i15++) {
                    fArr4[i15] = i4.a.a(fArr8, i15, this.f26576h);
                    fArr3[i15] = i4.a.a(fArr7, i15, this.f26576h);
                }
            } else {
                f10 = 0.0f;
                for (int i16 = 0; i16 < length; i16++) {
                    float fA5 = i4.a.a(fArr2, i16, this.f26572d) * 0.0625f;
                    float fA6 = i4.a.a(fArr2, i16, this.f26573e) * 0.0625f;
                    float fA7 = i4.a.a(fArr2, i16, this.f26574f) * 0.0625f;
                    float fA8 = i4.a.a(fArr2, i16, this.f26575g) * 0.0625f;
                    fArr4[i16] = ((fA7 * fA7) + (fA8 * fA8)) * this.f26577i;
                    fArr3[i16] = (fA5 * fA5) + (fA6 * fA6);
                }
            }
            int i17 = 0;
            boolean z10 = false;
            int i18 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i17 < length) {
                float f14 = fArr3[i17];
                float f15 = fArr4[i17];
                boolean z13 = f14 - f15 > f10;
                fArr5[i17] = f14 > f15 ? -0.01f : -0.11f;
                if (z13 != z10) {
                    if (i18 < 28672) {
                        i18 += 4096;
                    } else if (i18 > 36864) {
                        i18 -= 4096;
                    }
                }
                i18 += this.f26571c;
                if (i18 >= 65536) {
                    int i19 = 65535 & i18;
                    z12 = this.f26569a ? z13 : z11 == z13;
                    bVar.a(z12);
                    fArr6[i17] = z12 ? 0.08f : 0.02f;
                    i18 = i19;
                    z11 = z13;
                } else {
                    fArr6[i17] = z12 ? 0.1f : 0.0f;
                }
                i17++;
                z10 = z13;
            }
            c0367a.g(fArr3);
            c0367a.h(fArr5);
            c0367a.j(fArr6);
            c0367a.i(fArr4);
            return c0367a;
        }

        public final float b() {
            return this.f26577i;
        }

        public final void c(float f10) {
            this.f26577i = f10;
        }

        public /* synthetic */ a(int i10, boolean z10, boolean z11, float f10, float f11, float f12, int i11, boolean z12, int i12, rd.h hVar) {
            this(i10, z10, z11, (i12 & 8) != 0 ? 1200.0f : f10, (i12 & 16) != 0 ? 2200.0f : f11, (i12 & 32) != 0 ? 1200.0f : f12, (i12 & 64) != 0 ? 1 : i11, (i12 & 128) != 0 ? false : z12);
        }
    }

    public static final class e implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m4.p f26597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f26598b;

        e(m4.p pVar, m mVar) {
            this.f26597a = pVar;
            this.f26598b = mVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                this.f26597a.f21423x.setNumber(i10);
            }
            this.f26598b.O4();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public static final class f implements SeekBar.OnSeekBarChangeListener {
        f() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            m.this.K4();
            m.this.L4();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public static final class g implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m4.p f26600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f26601b;

        g(m4.p pVar, m mVar) {
            this.f26600a = pVar;
            this.f26601b = mVar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                this.f26600a.f21403d.setNumber(i10);
            }
            this.f26601b.O4();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public static final class h implements SeekBar.OnSeekBarChangeListener {
        h() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            m.this.O4();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
