package com.dw.ht;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.channels.ChannelEditorFragment;
import com.dw.ht.fragments.DeviceFragment;
import com.dw.ht.fragments.TalkListFragment;
import com.dw.ht.settings.DeviceSettingsFragment;
import n5.o0;
import s4.b4;
import s4.h2;
import s4.j5;

/* JADX INFO: loaded from: classes.dex */
class n0 extends m0 {
    n0() {
    }

    @Override // com.dw.ht.m0
    public void b(Context context) {
        FragmentShowActivity.h2(context, null, s4.c.class);
    }

    @Override // com.dw.ht.m0
    public void c(Context context, d5.a aVar) {
        Bundle bundle;
        if (aVar != null) {
            bundle = new Bundle();
            bundle.putParcelable("channel", aVar);
        } else {
            bundle = null;
        }
        FragmentShowActivity.i2(context, null, ChannelEditorFragment.class, bundle);
    }

    @Override // com.dw.ht.m0
    public void d(Context context) {
        FragmentShowActivity.h2(context, null, h2.class);
    }

    @Override // com.dw.ht.m0
    public void e(Context context, long j10) {
        DeviceFragment.j5(context, context.getString(R.string.dev_settings), DeviceSettingsFragment.class, j10);
    }

    @Override // com.dw.ht.m0
    public void f(Context context, long j10) {
        Intent intent = new Intent(context, (Class<?>) BTActivity.class);
        intent.putExtra("showItemInMap", j10);
        v3.j.e(context, intent);
    }

    @Override // com.dw.ht.m0
    public void g(Context context) {
        FragmentShowActivity.h2(context, null, b4.class);
    }

    @Override // com.dw.ht.m0
    public void h(Context context) {
    }

    @Override // com.dw.ht.m0
    public void i(Context context) {
        FragmentShowActivity.h2(context, null, j5.class);
    }

    @Override // com.dw.ht.m0
    public void j(Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.dw.ht.intent.extras.PICTURE_MODE", true);
        FragmentShowActivity.i2(context, context.getString(R.string.picture), TalkListFragment.class, bundle);
    }

    @Override // com.dw.ht.m0
    public void l(Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRAS_LOGIN", true);
        FragmentShowActivity.i2(context, null, o0.class, bundle);
    }
}
