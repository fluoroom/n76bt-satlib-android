package com.dw.ht.activitys;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import com.benshikj.ht.R;
import com.dw.ht.BTActivity;
import com.dw.ht.Cfg;
import com.dw.ht.activitys.SplashActivity;
import dd.d0;
import kotlin.Metadata;
import q4.l;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/dw/ht/activitys/SplashActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Ldd/d0;", "u1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/os/Handler;", "M", "Landroid/os/Handler;", "mHandler", "Lkotlin/Function0;", "N", "Lqd/a;", "mToMainActivity", "O", "mToFactoryActivity", "P", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplashActivity extends androidx.appcompat.app.d {
    private static boolean Q;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final Handler mHandler = new Handler();

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final qd.a mToMainActivity = new qd.a() { // from class: j4.h
        @Override // qd.a
        public final Object a() {
            return SplashActivity.r1(this.f18422a);
        }
    };

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final qd.a mToFactoryActivity = new qd.a() { // from class: j4.i
        @Override // qd.a
        public final Object a() {
            return SplashActivity.q1(this.f18423a);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 q1(SplashActivity splashActivity) {
        splashActivity.startActivity(new Intent(splashActivity, (Class<?>) l.class));
        splashActivity.finish();
        return d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 r1(SplashActivity splashActivity) {
        splashActivity.u1();
        return d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s1(qd.a aVar) {
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t1(qd.a aVar) {
        aVar.a();
    }

    private final void u1() {
        startActivity(new Intent(this, (Class<?>) BTActivity.class));
        Q = true;
        finish();
    }

    @Override // androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (Cfg.f5480c || m.a(getPackageName(), "com.benshikj.ht.factory") || m.a(getPackageName(), "com.benshikj.ht.distribute")) {
            Handler handler = this.mHandler;
            final qd.a aVar = this.mToFactoryActivity;
            handler.post(new Runnable() { // from class: j4.j
                @Override // java.lang.Runnable
                public final void run() {
                    SplashActivity.s1(aVar);
                }
            });
        } else {
            if (Q) {
                u1();
                return;
            }
            Object drawable = ((ImageView) findViewById(R.id.image)).getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
            Handler handler2 = this.mHandler;
            final qd.a aVar2 = this.mToMainActivity;
            handler2.postDelayed(new Runnable() { // from class: j4.k
                @Override // java.lang.Runnable
                public final void run() {
                    SplashActivity.t1(aVar2);
                }
            }, 500L);
        }
    }
}
