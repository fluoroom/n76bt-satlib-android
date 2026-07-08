package com.dw.ht.activitys;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.o;
import kotlin.Metadata;
import s4.i5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dw/ht/activitys/MessageComposeActivity;", "Ll3/b;", "<init>", "()V", "Landroidx/fragment/app/o;", "Z1", "()Landroidx/fragment/app/o;", "k0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MessageComposeActivity extends l3.b {
    @Override // l3.b
    protected o Z1() {
        i5 i5Var = new i5();
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        Uri data = getIntent().getData();
        extras.putString("TO", data != null ? data.getHost() : null);
        i5Var.E3(extras);
        return i5Var;
    }
}
