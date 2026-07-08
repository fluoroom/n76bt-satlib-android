package s7;

import a0.k;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import u7.n0;
import u7.o0;
import v7.b0;
import v7.e0;

/* JADX INFO: loaded from: classes.dex */
public class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26991c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f26989e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f26990f = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f26988d = e.f26992a;

    public static d l() {
        return f26990f;
    }

    @Override // s7.e
    public Intent a(Context context, int i10, String str) {
        return super.a(context, i10, str);
    }

    @Override // s7.e
    public PendingIntent b(Context context, int i10, int i11) {
        return super.b(context, i10, i11);
    }

    @Override // s7.e
    public final String d(int i10) {
        return super.d(i10);
    }

    @Override // s7.e
    public int f(Context context) {
        return super.f(context);
    }

    @Override // s7.e
    public int g(Context context, int i10) {
        return super.g(context, i10);
    }

    @Override // s7.e
    public final boolean i(int i10) {
        return super.i(i10);
    }

    public Dialog j(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return o(activity, i10, e0.b(activity, a(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent k(Context context, a aVar) {
        return aVar.f() ? aVar.e() : b(context, aVar.b(), 0);
    }

    public boolean m(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogJ = j(activity, i10, i11, onCancelListener);
        if (dialogJ == null) {
            return false;
        }
        r(activity, dialogJ, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void n(Context context, int i10) {
        s(context, i10, null, c(context, i10, 0, "n"));
    }

    final Dialog o(Context context, int i10, e0 e0Var, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(b0.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = b0.b(context, i10);
        DialogInterface.OnClickListener onClickListener2 = e0Var;
        if (strB != null) {
            if (e0Var == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strB, onClickListener2);
        }
        String strF = b0.f(context, i10);
        if (strF != null) {
            builder.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog p(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(b0.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        r(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final o0 q(Context context, n0 n0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        o0 o0Var = new o0(n0Var);
        h8.f.n(context, o0Var, intentFilter);
        o0Var.a(context);
        if (h(context, "com.google.android.gms")) {
            return o0Var;
        }
        n0Var.a();
        o0Var.b();
        return null;
    }

    final void r(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.p) {
                k.h4(dialog, onCancelListener).g4(((androidx.fragment.app.p) activity).N0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void s(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            t(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = b0.e(context, i10);
        String strD = b0.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) v7.q.i(context.getSystemService("notification"));
        k.d dVarT = new k.d(context).o(true).g(true).k(strE).t(new k.b().h(strD));
        if (com.google.android.gms.common.util.e.c(context)) {
            v7.q.k(com.google.android.gms.common.util.f.a());
            dVarT.s(context.getApplicationInfo().icon).q(2);
            if (com.google.android.gms.common.util.e.d(context)) {
                dVarT.a(r7.a.f25589a, resources.getString(r7.b.f25604o), pendingIntent);
            } else {
                dVarT.i(pendingIntent);
            }
        } else {
            dVarT.s(R.drawable.stat_sys_warning).u(resources.getString(r7.b.f25597h)).v(System.currentTimeMillis()).i(pendingIntent).j(strD);
        }
        if (com.google.android.gms.common.util.f.c()) {
            v7.q.k(com.google.android.gms.common.util.f.c());
            synchronized (f26989e) {
                str2 = this.f26991c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(r7.b.f25596g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(l3.c.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            dVarT.h(str2);
        }
        Notification notificationC = dVarT.c();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            h.f26997b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationC);
    }

    final void t(Context context) {
        new l(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean u(Activity activity, u7.i iVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogO = o(activity, i10, e0.c(iVar, a(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogO == null) {
            return false;
        }
        r(activity, dialogO, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean v(Context context, a aVar, int i10) {
        PendingIntent pendingIntentK;
        if (b8.a.a(context) || (pendingIntentK = k(context, aVar)) == null) {
            return false;
        }
        s(context, aVar.b(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentK, i10, true), h8.g.f15176a | 134217728));
        return true;
    }
}
