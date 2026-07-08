package com.dw.ht.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.entitys.ChannelBond;
import com.dw.ht.entitys.IIChannel;
import kotlin.Metadata;
import m4.h;
import rd.m;
import u4.d0;
import v4.c0;
import v4.r;
import v4.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R*\u0010 \u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/dw/ht/widget/ChannelButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lv4/c0$k;", "channelWithIndex", "", "showMod", "Ldd/d0;", "y", "(Lv4/c0$k;Z)V", "Lcom/dw/ht/entitys/ChannelBond;", "channelBond", "isAudioLinked", "x", "(Lcom/dw/ht/entitys/ChannelBond;Z)V", "Lm4/h;", "I", "Lm4/h;", "binding", "value", "J", "getIndex", "()I", "setIndex", "(I)V", "index", "getAudioConnected", "()Z", "setAudioConnected", "(Z)V", "audioConnected", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChannelButton extends ConstraintLayout {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private h binding;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private int index;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        m.e(context, "context");
    }

    public final boolean getAudioConnected() {
        return this.binding.f21172f.isEnabled();
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setAudioConnected(boolean z10) {
        this.binding.f21172f.setEnabled(z10);
    }

    public final void setIndex(int i10) {
        if (this.index == i10) {
            return;
        }
        this.binding.f21169c.setText(s.a(i10));
        this.index = i10;
    }

    public final void x(ChannelBond channelBond, boolean isAudioLinked) {
        if (channelBond == null) {
            this.binding.f21172f.setVisibility(8);
            return;
        }
        IIChannel iIChannelK = d0.k(channelBond.getNetworkChannelId());
        if (iIChannelK == null) {
            this.binding.f21172f.setVisibility(8);
            return;
        }
        this.binding.f21172f.setVisibility(0);
        String strK = iIChannelK.k();
        this.binding.f21172f.setEnabled(isAudioLinked);
        this.binding.f21172f.setText(strK);
    }

    public final void y(c0.k channelWithIndex, boolean showMod) {
        String str;
        m.e(channelWithIndex, "channelWithIndex");
        r rVar = channelWithIndex.f29790a;
        setIndex(channelWithIndex.f29791b);
        boolean z10 = rVar.f30066b != 0;
        if (z10 && rVar.f30071g) {
            this.binding.f21171e.setVisibility(0);
        } else {
            this.binding.f21171e.setVisibility(4);
        }
        this.binding.f21169c.setEnabled(z10);
        String str2 = "";
        if (!z10) {
            this.binding.f21170d.setText("");
            this.binding.f21174h.setText("");
            this.binding.f21168b.setText("");
            this.binding.f21173g.setVisibility(4);
            return;
        }
        String strM = rVar.m();
        m.d(strM, "getName(...)");
        if (TextUtils.isEmpty(strM)) {
            strM = rVar.o(showMod);
            m.d(strM, "getRealRxFreq(...)");
        }
        this.binding.f21170d.setText(strM);
        this.binding.f21170d.setEnabled(rVar.w());
        if (rVar.D) {
            str = " R";
        } else {
            str = "";
        }
        if (!Cfg.f5490h && rVar.f30076u) {
            str = str + " ID";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(rVar.f30074s ? " W" : " N");
        this.binding.f21174h.setText(sb2.toString());
        if (rVar.x() != 0 && rVar.A() != 0) {
            if (rVar.x() > rVar.A()) {
                str2 = " -";
            } else if (rVar.x() < rVar.A()) {
                str2 = " +";
            }
        }
        if (rVar.z() >= 1000) {
            str2 = str2 + " CTC";
        } else if (rVar.z() > 0) {
            str2 = str2 + " DCS";
        }
        this.binding.f21168b.setText(str2);
        this.binding.f21173g.setVisibility(rVar.A ? 0 : 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m.e(context, "context");
        View.inflate(context, R.layout.button_ch, this);
        h hVarA = h.a(this);
        m.d(hVarA, "bind(...)");
        this.binding = hVarA;
        this.index = -1;
    }

    public /* synthetic */ ChannelButton(Context context, AttributeSet attributeSet, int i10, int i11, rd.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
