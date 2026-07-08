package com.tencent.tauth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import gb.d;
import java.util.HashMap;
import java.util.Map;
import kb.i;
import kb.k;
import mb.b;

/* JADX INFO: loaded from: classes3.dex */
public class AuthActivity extends Activity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10319b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f10320a = new HashMap();

    class a implements mb.a {
        a() {
        }

        @Override // mb.a
        public void a(Intent intent, Bundle bundle) {
            jb.a.i("openSDK_LOG.AuthActivity", "-->handleActionUri--common channel. ");
            Intent intent2 = new Intent(AuthActivity.this, (Class<?>) AssistActivity.class);
            intent2.putExtras(bundle);
            intent2.putExtra("key_request_code", 10114);
            intent2.setFlags(603979776);
            AuthActivity.this.startActivity(intent2);
        }
    }

    private void a() {
        Uri data;
        Intent intent = getIntent();
        if (intent == null) {
            jb.a.l("openSDK_LOG.AuthActivity", "-->onCreate, getIntent() return null");
            finish();
            return;
        }
        try {
            data = intent.getData();
        } catch (Exception e10) {
            jb.a.g("openSDK_LOG.AuthActivity", "onCreate exception: ", e10);
            data = null;
        }
        jb.a.j("openSDK_LOG.AuthActivity", "-->onCreate, uri: " + data);
        try {
            b(intent, data);
        } catch (Exception e11) {
            jb.a.g("openSDK_LOG.AuthActivity", "onCreate exception: ", e11);
            finish();
        }
    }

    private void b(Intent intent, Uri uri) {
        jb.a.i("openSDK_LOG.AuthActivity", "-->handleActionUri--start");
        if (uri != null && uri.toString() != null) {
            String string = "";
            if (!uri.toString().equals("")) {
                String string2 = uri.toString();
                Bundle bundleB = k.b(string2.substring(string2.indexOf("#") + 1));
                if (bundleB == null) {
                    jb.a.l("openSDK_LOG.AuthActivity", "-->handleActionUri, bundle is null");
                    finish();
                    return;
                }
                String string3 = bundleB.getString("action");
                jb.a.i("openSDK_LOG.AuthActivity", "-->handleActionUri, action: " + string3);
                if (string3 == null) {
                    finish();
                    return;
                }
                if (string3.equals("shareToQQ") || string3.equals("shareToQzone") || string3.equals("sendToMyComputer") || string3.equals("shareToTroopBar")) {
                    if (string3.equals("shareToQzone") && i.d(this, "com.tencent.mobileqq") != null && i.f(this, "5.2.0") < 0) {
                        int i10 = f10319b + 1;
                        f10319b = i10;
                        if (i10 == 2) {
                            f10319b = 0;
                            finish();
                            return;
                        }
                    }
                    jb.a.i("openSDK_LOG.AuthActivity", "-->handleActionUri, most share action, start assistactivity");
                    Intent intent2 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent2.putExtras(bundleB);
                    intent2.setFlags(603979776);
                    startActivity(intent2);
                    finish();
                    return;
                }
                if (string3.equals("addToQQFavorites")) {
                    Intent intent3 = getIntent();
                    intent3.putExtras(bundleB);
                    intent3.putExtra("key_action", "action_share");
                    d.c().d(string3);
                    finish();
                    return;
                }
                if (string3.equals("sharePrize")) {
                    Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                    try {
                        string = k.p(bundleB.getString("response")).getString("activityid");
                    } catch (Exception e10) {
                        jb.a.g("openSDK_LOG.AuthActivity", "sharePrize parseJson has exception.", e10);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        launchIntentForPackage.putExtra("sharePrize", true);
                        Bundle bundle = new Bundle();
                        bundle.putString("activityid", string);
                        launchIntentForPackage.putExtras(bundle);
                    }
                    startActivity(launchIntentForPackage);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetAvatar")) {
                    boolean booleanExtra = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent4 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent4.putExtra("key_request_code", 10108);
                    intent4.putExtra("stay_back_stack", booleanExtra);
                    intent4.putExtras(bundleB);
                    intent4.setFlags(603979776);
                    startActivity(intent4);
                    finish();
                    return;
                }
                if ("sdkSetDynamicAvatar".equals(string3)) {
                    boolean booleanExtra2 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent5 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent5.putExtra("key_request_code", 10110);
                    intent5.putExtra("stay_back_stack", booleanExtra2);
                    intent5.putExtras(bundleB);
                    intent5.setFlags(603979776);
                    startActivity(intent5);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetEmotion")) {
                    boolean booleanExtra3 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent6 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent6.putExtra("key_request_code", 10109);
                    intent6.putExtra("stay_back_stack", booleanExtra3);
                    intent6.putExtras(bundleB);
                    intent6.setFlags(603979776);
                    startActivity(intent6);
                    finish();
                    return;
                }
                if (string3.equals("bindGroup")) {
                    jb.a.i("openSDK_LOG.AuthActivity", "-->handleActionUri--bind group callback.");
                    boolean booleanExtra4 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent7 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent7.putExtra("key_request_code", 10112);
                    intent7.putExtra("stay_back_stack", booleanExtra4);
                    intent7.putExtras(bundleB);
                    intent7.setFlags(603979776);
                    startActivity(intent7);
                    finish();
                    return;
                }
                if (string3.equals("joinGroup")) {
                    jb.a.i("openSDK_LOG.AuthActivity", "-->handleActionUri--join group callback. ");
                    boolean booleanExtra5 = getIntent().getBooleanExtra("stay_back_stack", false);
                    Intent intent8 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent8.putExtra("key_request_code", 10111);
                    intent8.putExtra("stay_back_stack", booleanExtra5);
                    intent8.putExtras(bundleB);
                    intent8.setFlags(603979776);
                    startActivity(intent8);
                    finish();
                    return;
                }
                if ("guildOpen".equals(string3)) {
                    Intent intent9 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent9.putExtras(bundleB);
                    intent9.putExtra("key_request_code", 10113);
                    intent9.setFlags(603979776);
                    startActivity(intent9);
                    finish();
                    return;
                }
                mb.a aVar = (mb.a) this.f10320a.get(string3);
                jb.a.j("openSDK_LOG.AuthActivity", "actionHandler: " + aVar);
                if (aVar != null) {
                    aVar.a(intent, bundleB);
                }
                finish();
                return;
            }
        }
        jb.a.l("openSDK_LOG.AuthActivity", "-->handleActionUri, uri invalid");
        finish();
    }

    private void c() {
        this.f10320a.put("action_common_channel", new a());
        this.f10320a.put("action_auth", new b());
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception e10) {
            jb.a.g("openSDK_LOG.AuthActivity", "activity finish exception: ", e10);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jb.a.i("openSDK_LOG.AuthActivity", "->onCreate");
        c();
        a();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        jb.a.i("openSDK_LOG.AuthActivity", "->onNewIntent");
        a();
    }
}
