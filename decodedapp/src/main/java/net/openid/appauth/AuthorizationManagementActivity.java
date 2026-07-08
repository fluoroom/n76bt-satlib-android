package net.openid.appauth;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import net.openid.appauth.d;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class AuthorizationManagementActivity extends androidx.appcompat.app.d {
    private boolean M = false;
    private Intent N;
    private ah.b O;
    private PendingIntent P;
    private PendingIntent Q;

    private static Intent m1(Context context) {
        return new Intent(context, (Class<?>) AuthorizationManagementActivity.class);
    }

    public static Intent n1(Context context, Uri uri) {
        Intent intentM1 = m1(context);
        intentM1.setData(uri);
        intentM1.addFlags(603979776);
        return intentM1;
    }

    private Intent o1(Uri uri) {
        if (uri.getQueryParameterNames().contains("error")) {
            return d.j(uri).o();
        }
        ah.c cVarD = e.d(this.O, uri);
        if ((this.O.getState() != null || cVarD.a() == null) && (this.O.getState() == null || this.O.getState().equals(cVarD.a()))) {
            return cVarD.d();
        }
        dh.a.g("State returned in authorization response (%s) does not match state from request (%s) - discarding response", cVarD.a(), this.O.getState());
        return d.a.f22752j.o();
    }

    private void p1(Bundle bundle) {
        if (bundle == null) {
            dh.a.g("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.N = (Intent) bundle.getParcelable("authIntent");
        this.M = bundle.getBoolean("authStarted", false);
        this.P = (PendingIntent) bundle.getParcelable("completeIntent");
        this.Q = (PendingIntent) bundle.getParcelable("cancelIntent");
        try {
            String string = bundle.getString("authRequest", null);
            this.O = string != null ? e.b(string, bundle.getString("authRequestType", null)) : null;
        } catch (JSONException unused) {
            t1(this.Q, d.a.f22743a.o(), 0);
        }
    }

    private void q1() {
        dh.a.a("Authorization flow canceled by user", new Object[0]);
        t1(this.Q, d.l(d.b.f22755b, null).o(), 0);
    }

    private void r1() {
        Uri data = getIntent().getData();
        Intent intentO1 = o1(data);
        if (intentO1 == null) {
            dh.a.c("Failed to extract OAuth2 response from redirect", new Object[0]);
        } else {
            intentO1.setData(data);
            t1(this.P, intentO1, -1);
        }
    }

    private void s1() {
        dh.a.a("Authorization flow canceled due to missing browser", new Object[0]);
        t1(this.Q, d.l(d.b.f22756c, null).o(), 0);
    }

    private void t1(PendingIntent pendingIntent, Intent intent, int i10) {
        if (pendingIntent == null) {
            setResult(i10, intent);
            return;
        }
        try {
            pendingIntent.send(this, 0, intent);
        } catch (PendingIntent.CanceledException e10) {
            dh.a.c("Failed to send cancel intent", e10);
        }
    }

    @Override // androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            p1(getIntent().getExtras());
        } else {
            p1(bundle);
        }
    }

    @Override // d.q, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.M) {
            if (getIntent().getData() != null) {
                r1();
            } else {
                q1();
            }
            finish();
            return;
        }
        try {
            startActivity(this.N);
            this.M = true;
        } catch (ActivityNotFoundException unused) {
            s1();
            finish();
        }
    }

    @Override // d.q, a0.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.M);
        bundle.putParcelable("authIntent", this.N);
        bundle.putString("authRequest", this.O.a());
        bundle.putString("authRequestType", e.c(this.O));
        bundle.putParcelable("completeIntent", this.P);
        bundle.putParcelable("cancelIntent", this.Q);
    }
}
