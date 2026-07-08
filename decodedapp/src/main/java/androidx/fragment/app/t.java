package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends y0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f2450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f2451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f2452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f2454e;

    public t(Activity activity, Context context, Handler handler, int i10) {
        rd.m.e(context, "context");
        rd.m.e(handler, "handler");
        this.f2450a = activity;
        this.f2451b = context;
        this.f2452c = handler;
        this.f2453d = i10;
        this.f2454e = new x();
    }

    public final Activity f() {
        return this.f2450a;
    }

    public final Context g() {
        return this.f2451b;
    }

    public final w h() {
        return this.f2454e;
    }

    public final Handler j() {
        return this.f2452c;
    }

    public abstract void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract Object m();

    public abstract LayoutInflater n();

    public void o(o oVar, String[] strArr, int i10) {
        rd.m.e(oVar, "fragment");
        rd.m.e(strArr, "permissions");
    }

    public abstract boolean p(String str);

    public void q(o oVar, Intent intent, int i10, Bundle bundle) {
        rd.m.e(oVar, "fragment");
        rd.m.e(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        b0.b.m(this.f2451b, intent, bundle);
    }

    public abstract void r();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(p pVar) {
        this(pVar, pVar, new Handler(), 0);
        rd.m.e(pVar, "activity");
    }
}
