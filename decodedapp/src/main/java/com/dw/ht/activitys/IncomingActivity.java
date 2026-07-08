package com.dw.ht.activitys;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.dw.ht.BTActivity;
import com.dw.ht.activitys.IncomingActivity;
import com.dw.ht.alarms.AlarmService;
import java.util.Collection;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;
import rd.m;
import v3.j;
import v4.l1;
import v4.u;
import v4.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/dw/ht/activitys/IncomingActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "", Name.MARK, "Ldd/d0;", "q1", "(J)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lm4/d;", "M", "Lm4/d;", "binding", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncomingActivity extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private m4.d binding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o1(IncomingActivity incomingActivity, long j10, View view) {
        incomingActivity.q1(j10);
        j.e(incomingActivity, new Intent(incomingActivity, (Class<?>) BTActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p1(IncomingActivity incomingActivity, long j10, View view) {
        incomingActivity.q1(j10);
    }

    private final void q1(long id2) {
        Collection<l1> collectionA = u.w().A();
        m.d(collectionA, "getLinks(...)");
        for (l1 l1Var : collectionA) {
            if (l1Var.n()) {
                l1Var.a(v.STOP_RINGING, new byte[0]);
            }
        }
        Object systemService = getSystemService("notification");
        m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(getIntent().getStringExtra("android.intent.extra.TITLE"), 2131231106);
        k4.b bVarC = k4.b.c(getContentResolver(), id2);
        if (bVarC != null) {
            AlarmService.l(this, bVarC);
        }
        finish();
    }

    @Override // androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m4.d dVarC = m4.d.c(getLayoutInflater());
        m.d(dVarC, "inflate(...)");
        this.binding = dVarC;
        setContentView(dVarC.b());
        final long longExtra = getIntent().getLongExtra("android.intent.extra.UID", 0L);
        dVarC.f21043e.setText(getIntent().getStringExtra("android.intent.extra.TEXT"));
        dVarC.f21040b.setOnClickListener(new View.OnClickListener() { // from class: j4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IncomingActivity.o1(this.f18415a, longExtra, view);
            }
        });
        dVarC.f21042d.setOnClickListener(new View.OnClickListener() { // from class: j4.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IncomingActivity.p1(this.f18417a, longExtra, view);
            }
        });
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}
