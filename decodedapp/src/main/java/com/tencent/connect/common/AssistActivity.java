package com.tencent.connect.common;

import android.R;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import ib.e;
import ib.h;
import kb.k;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AssistActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f10267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10268e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10264a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f10265b = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private fb.a f10269f = new fb.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Handler f10270g = new a();

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0 && !AssistActivity.this.isFinishing()) {
                jb.a.l("openSDK_LOG.AssistActivity", "-->finish by timeout");
                AssistActivity.this.finish();
            }
        }
    }

    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            jb.a.l("openSDK_LOG.AssistActivity", "-->finish by touch");
            AssistActivity.this.finish();
            return false;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jb.a.i("openSDK_LOG.AssistActivity", "onActivityResult finish delay");
            AssistActivity.this.finish();
        }
    }

    private class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str = "#";
            Intent intent2 = new Intent();
            String stringExtra = intent.getStringExtra("key_action");
            if (stringExtra == null || stringExtra.isEmpty()) {
                intent2.putExtra("key_action", "action_share");
            } else {
                jb.a.i("openSDK_LOG.AssistActivity", "QQStayReceiver action: " + stringExtra);
                intent2.putExtra("key_action", stringExtra);
            }
            try {
                Uri uri = (Uri) intent.getParcelableExtra("uriData");
                String string = uri.toString();
                if (!string.contains("#")) {
                    str = "?";
                }
                for (String str2 : string.substring(string.indexOf(str) + 1).split("&")) {
                    String[] strArrSplit = str2.split("=");
                    intent2.putExtra(strArrSplit[0], strArrSplit[1]);
                }
                intent2.setData(uri);
            } catch (Exception e10) {
                jb.a.i("openSDK_LOG.AssistActivity", "QQStayReceiver parse uri error : " + e10.getMessage());
                intent2.putExtra("result", "error");
                intent2.putExtra("response", "parse error.");
            }
            AssistActivity.this.setResult(-1, intent2);
        }

        /* synthetic */ d(AssistActivity assistActivity, a aVar) {
            this();
        }
    }

    private void a() {
        View viewFindViewById = findViewById(R.id.content);
        if (viewFindViewById == null) {
            return;
        }
        viewFindViewById.setOnTouchListener(new b());
    }

    private void b(Intent intent) {
        try {
            Uri data = intent.getData();
            if (data == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter("com.tencent.tauth.opensdk.SHARE_SUCCESS_AND_STAY_QQ_" + data.getQueryParameter("share_id"));
            if (this.f10267d == null) {
                this.f10267d = new d(this, null);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                registerReceiver(this.f10267d, intentFilter, 2);
            } else {
                registerReceiver(this.f10267d, intentFilter);
            }
        } catch (Exception e10) {
            jb.a.g("openSDK_LOG.AssistActivity", "registerReceiver exception: ", e10);
        }
    }

    private void c(Intent intent, boolean z10) {
        if (intent == null) {
            jb.a.d("openSDK_LOG.AssistActivity", "reportStartActivitySuccess, but intent is null.");
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra(gb.b.f13772h);
        if (bundleExtra != null) {
            k.a(bundleExtra, z10 ? "0" : "1");
            h.b().c(bundleExtra, this.f10266c, intent.getBooleanExtra(gb.b.f13773i, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(android.os.Bundle r13) {
        /*
            r12 = this;
            java.lang.String r0 = "viaShareType"
            java.lang.String r8 = r13.getString(r0)
            java.lang.String r0 = "callbackAction"
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r1 = "url"
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r2 = "openId"
            java.lang.String r2 = r13.getString(r2)
            java.lang.String r3 = "appId"
            java.lang.String r3 = r13.getString(r3)
            java.lang.String r13 = "shareToQQ"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L2d
            java.lang.String r13 = "ANDROIDQQ.SHARETOQQ.XX"
            java.lang.String r4 = "10"
        L2a:
            r5 = r4
            r4 = r13
            goto L3e
        L2d:
            java.lang.String r13 = "shareToQzone"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L3a
            java.lang.String r13 = "ANDROIDQQ.SHARETOQZ.XX"
            java.lang.String r4 = "11"
            goto L2a
        L3a:
            java.lang.String r13 = ""
            r4 = r13
            r5 = r4
        L3e:
            boolean r13 = kb.k.i(r12, r1)
            if (r13 != 0) goto L60
            gb.d r13 = gb.d.c()
            r13.d(r0)
            ib.e r1 = ib.e.a()
            java.lang.String r10 = "2"
            java.lang.String r11 = "0"
            java.lang.String r6 = "3"
            java.lang.String r7 = "1"
            java.lang.String r9 = "0"
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.finish()
            goto L71
        L60:
            ib.e r1 = ib.e.a()
            java.lang.String r10 = "2"
            java.lang.String r11 = "0"
            java.lang.String r6 = "3"
            java.lang.String r7 = "0"
            java.lang.String r9 = "0"
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L71:
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r0 = "shareH5"
            r13.removeExtra(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.common.AssistActivity.d(android.os.Bundle):void");
    }

    public void e(int i10, Bundle bundle) {
        if (bundle == null) {
            jb.a.l("openSDK_LOG.AssistActivity", "--setResultData--bundle is null, setResult ACTIVITY_CANCEL");
            setResult(0);
            if (i10 == 11101) {
                e.a().b("", this.f10266c, "2", "1", "7", "2");
                return;
            }
            return;
        }
        try {
            String string = bundle.getString("key_response");
            jb.a.d("openSDK_LOG.AssistActivity", "--setResultDataForLogin-- ");
            Intent intent = new Intent();
            intent.putExtras(bundle);
            if (TextUtils.isEmpty(string)) {
                jb.a.l("openSDK_LOG.AssistActivity", "--setResultData--response is empty, setResult ACTIVITY_OK");
                setResult(-1, intent);
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            String strOptString = jSONObject.optString("openid");
            String strOptString2 = jSONObject.optString("access_token");
            String strOptString3 = jSONObject.optString("proxy_code");
            long jOptLong = jSONObject.optLong("proxy_expires_in");
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                jb.a.i("openSDK_LOG.AssistActivity", "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
                setResult(-1, intent);
                e.a().b(strOptString, this.f10266c, "2", "1", "7", "0");
            } else if (!TextUtils.isEmpty(strOptString3) && jOptLong != 0) {
                jb.a.i("openSDK_LOG.AssistActivity", "--setResultData--proxy_code and proxy_expires_in are valid");
                setResult(-1, intent);
            } else {
                jb.a.l("openSDK_LOG.AssistActivity", "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                setResult(0, intent);
                e.a().b("", this.f10266c, "2", "1", "7", "1");
            }
        } catch (Exception e10) {
            jb.a.f("openSDK_LOG.AssistActivity", "--setResultData--parse response failed");
            jb.a.g("openSDK_LOG.AssistActivity", "--setResultData--parse response exception", e10);
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--onActivityResult--requestCode: ");
        sb2.append(i10);
        sb2.append(" | resultCode: ");
        sb2.append(i11);
        sb2.append("data = null ? ");
        sb2.append(intent == null);
        jb.a.i("openSDK_LOG.AssistActivity", sb2.toString());
        super.onActivityResult(i10, i11, intent);
        if (i10 == 0) {
            return;
        }
        if (fb.b.b(this)) {
            jb.a.f("openSDK_LOG.AssistActivity", "onActivityResult callPack: " + getCallingPackage());
            finish();
            return;
        }
        if (intent != null) {
            intent.putExtra("key_action", "action_login");
        }
        e(i10, intent == null ? null : intent.getExtras());
        if (this.f10268e) {
            new Handler(Looper.getMainLooper()).postDelayed(new c(), 200L);
        } else {
            jb.a.i("openSDK_LOG.AssistActivity", "onActivityResult finish immediate");
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x014d  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onCreate(android.os.Bundle r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.common.AssistActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        jb.a.i("openSDK_LOG.AssistActivity", "-->onDestroy");
        super.onDestroy();
        this.f10269f.a(5);
        d dVar = this.f10267d;
        if (dVar != null) {
            unregisterReceiver(dVar);
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        jb.a.i("openSDK_LOG.AssistActivity", "--onNewIntent: " + hashCode());
        super.onNewIntent(intent);
        this.f10269f.a(6);
        fb.b.a(intent);
        int intExtra = intent.getIntExtra("key_request_code", -1);
        jb.a.i("openSDK_LOG.AssistActivity", "--onNewIntent callbackRequestCode= " + intExtra);
        if (intExtra == 10108) {
            intent.putExtra("key_action", "action_request_avatar");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10109) {
            intent.putExtra("key_action", "action_request_set_emotion");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10110) {
            intent.putExtra("key_action", "action_request_dynamic_avatar");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10111) {
            intent.putExtra("key_action", "joinGroup");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10112) {
            intent.putExtra("key_action", "bindGroup");
            if (intent.getBooleanExtra("stay_back_stack", false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10113) {
            intent.putExtra("key_action", intent.getStringExtra("action"));
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            jb.a.i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        if (intExtra != 10114) {
            intent.putExtra("key_action", "action_share");
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            jb.a.i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        intent.putExtra("key_action", intent.getStringExtra("action"));
        setResult(-1, intent);
        if (isFinishing()) {
            return;
        }
        jb.a.i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
        finish();
    }

    @Override // android.app.Activity
    protected void onPause() {
        jb.a.i("openSDK_LOG.AssistActivity", "-->onPause");
        this.f10270g.removeMessages(0);
        super.onPause();
        this.f10269f.a(3);
    }

    @Override // android.app.Activity
    protected void onResume() {
        jb.a.i("openSDK_LOG.AssistActivity", "-->onResume");
        super.onResume();
        this.f10269f.a(2);
        Intent intent = getIntent();
        if (intent.getBooleanExtra("is_login", false)) {
            return;
        }
        if (!intent.getBooleanExtra("is_qq_mobile_share", false) && this.f10264a && !isFinishing()) {
            finish();
        }
        if (!this.f10265b || !this.f10269f.b(4)) {
            this.f10265b = true;
        } else {
            this.f10270g.sendMessage(this.f10270g.obtainMessage(0));
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        jb.a.i("openSDK_LOG.AssistActivity", "--onSaveInstanceState--");
        bundle.putBoolean("RESTART_FLAG", true);
        bundle.putBoolean("RESUME_FLAG", this.f10265b);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        jb.a.i("openSDK_LOG.AssistActivity", "-->onStart");
        super.onStart();
        this.f10269f.a(1);
    }

    @Override // android.app.Activity
    protected void onStop() {
        jb.a.i("openSDK_LOG.AssistActivity", "-->onStop");
        super.onStop();
        this.f10269f.a(4);
        if (lb.b.f20533d) {
            return;
        }
        try {
            int intExtra = getIntent().getIntExtra("key_request_orientation", -1);
            jb.a.i("openSDK_LOG.AssistActivity", "getRequestedOrientation= " + intExtra);
            if (intExtra != -1) {
                setRequestedOrientation(intExtra);
            }
        } catch (Throwable th2) {
            jb.a.g("openSDK_LOG.AssistActivity", "reset requestedOrientation catch exception", th2);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (kb.d.b(this)) {
            return;
        }
        super.setRequestedOrientation(i10);
    }
}
