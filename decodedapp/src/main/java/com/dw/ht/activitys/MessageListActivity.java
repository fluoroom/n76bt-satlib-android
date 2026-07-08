package com.dw.ht.activitys;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.o;
import com.benshikj.ht.R;
import com.dw.ht.fragments.BottomActionFragment;
import com.dw.ht.fragments.TalkListFragment;
import kotlin.Metadata;
import rd.h;
import rd.m;
import v4.l1;
import v4.m1;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/dw/ht/activitys/MessageListActivity;", "Lv3/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "onCreate", "(Landroid/os/Bundle;)V", "i0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MessageListActivity extends v3.b {

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.dw.ht.activitys.MessageListActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public static /* synthetic */ void b(Companion companion, Context context, String str, m1 m1Var, long j10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                m1Var = m1.AUTO;
            }
            m1 m1Var2 = m1Var;
            if ((i10 & 8) != 0) {
                j10 = 0;
            }
            companion.a(context, str, m1Var2, j10);
        }

        public final void a(Context context, String str, m1 m1Var, long j10) {
            m.e(context, "context");
            m.e(m1Var, "mode");
            Intent intent = new Intent(context, (Class<?>) MessageListActivity.class);
            intent.putExtra("com.dw.ht.intent.extras.TO", str);
            if (m1Var == m1.APRS) {
                intent.putExtra("com.dw.ht.intent.extras.PROTOCOL", 0);
            } else if (m1Var == m1.BSS) {
                intent.putExtra("com.dw.ht.intent.extras.PROTOCOL", 1);
            }
            intent.putExtra("com.dw.ht.intent.extras.DEV_ID", j10);
            context.startActivity(intent);
        }

        private Companion() {
        }
    }

    @Override // v3.b, androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messge_list);
        String stringExtra = getIntent().getStringExtra("com.dw.ht.intent.extras.TO");
        int intExtra = getIntent().getIntExtra("com.dw.ht.intent.extras.PROTOCOL", 0);
        long longExtra = getIntent().getLongExtra("com.dw.ht.intent.extras.DEV_ID", 0L);
        o oVarI0 = N0().i0(R.id.message_list);
        m.c(oVarI0, "null cannot be cast to non-null type com.dw.ht.fragments.TalkListFragment");
        o oVarI02 = N0().i0(R.id.bottom_bar);
        m.c(oVarI02, "null cannot be cast to non-null type com.dw.ht.fragments.BottomActionFragment");
        BottomActionFragment bottomActionFragment = (BottomActionFragment) oVarI02;
        ((TalkListFragment) oVarI0).G5(true);
        bottomActionFragment.v5(true);
        l1 l1VarY = longExtra != 0 ? u.w().y(longExtra) : null;
        if (l1VarY == null) {
            l1VarY = u.w().z();
        }
        bottomActionFragment.h5(l1VarY);
        if (stringExtra != null) {
            N(null, intExtra == 0 ? R.id.send_aprs_message : R.id.send_bss_message, 0, 0, stringExtra);
        }
    }
}
