package gb;

import android.content.Intent;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import kb.i;
import kb.k;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static d f13780b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f13781a;

    private d() {
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new HashMap());
        this.f13781a = mapSynchronizedMap;
        if (mapSynchronizedMap == null) {
            this.f13781a = DesugarCollections.synchronizedMap(new HashMap());
        }
    }

    private lb.a a(int i10, lb.a aVar) {
        if (i10 == 11101) {
            jb.a.f("openSDK_LOG.UIListenerManager", "登录的接口回调不能重新构建，暂时无法提供，先记录下来这种情况是否存在");
            return aVar;
        }
        if (i10 == 11105) {
            jb.a.f("openSDK_LOG.UIListenerManager", "Social Api 的接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
            return aVar;
        }
        if (i10 == 11106) {
            jb.a.f("openSDK_LOG.UIListenerManager", "Social Api 的H5接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        }
        return aVar;
    }

    private static void b(Intent intent, lb.a aVar) {
        if (intent.getBooleanExtra("key_auth_ignore_on_activity_result", false)) {
            jb.a.i("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, ignoreOnActivityResult");
            return;
        }
        int intExtra = intent.getIntExtra("key_error_code", 0);
        if (intExtra != 0) {
            jb.a.f("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra);
            aVar.a(new lb.c(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
            return;
        }
        String stringExtra = intent.getStringExtra("key_response");
        if (stringExtra == null) {
            jb.a.d("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
            aVar.a(new lb.c(-4, "服务器返回数据格式有误!", "response is null"));
            return;
        }
        try {
            aVar.b(k.p(stringExtra));
        } catch (JSONException e10) {
            aVar.a(new lb.c(-4, "服务器返回数据格式有误!", stringExtra));
            jb.a.g("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e10);
        }
    }

    public static d c() {
        if (f13780b == null) {
            f13780b = new d();
        }
        return f13780b;
    }

    public lb.a d(String str) {
        if (str == null) {
            jb.a.f("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
            return null;
        }
        synchronized (this.f13781a) {
            android.support.v4.media.session.b.a(this.f13781a.get(str));
            this.f13781a.remove(str);
        }
        return null;
    }

    public lb.a e(int i10) {
        String strB = i.b(i10);
        if (strB != null) {
            d(strB);
            return null;
        }
        jb.a.f("openSDK_LOG.UIListenerManager", "getListner action is null! rquestCode=" + i10);
        return null;
    }

    public boolean f(int i10, int i11, Intent intent, lb.a aVar) {
        jb.a.i("openSDK_LOG.UIListenerManager", "onActivityResult req=" + i10 + " res=" + i11);
        e(i10);
        if (aVar == null) {
            jb.a.f("openSDK_LOG.UIListenerManager", "onActivityResult can't find the listener");
            return false;
        }
        a(i10, aVar);
        if (i11 != -1) {
            throw null;
        }
        if (intent == null) {
            new lb.c(-6, "onActivityResult intent data is null.", "onActivityResult intent data is null.");
            throw null;
        }
        String stringExtra = intent.getStringExtra("key_action");
        if ("action_login".equals(stringExtra)) {
            b(intent, null);
            return true;
        }
        if ("action_share".equals(stringExtra) || "action_request_avatar".equals(stringExtra) || "action_request_dynamic_avatar".equals(stringExtra) || "action_request_set_emotion".equals(stringExtra) || "guildOpen".equals(stringExtra)) {
            String stringExtra2 = intent.getStringExtra("result");
            String stringExtra3 = intent.getStringExtra("response");
            if ("cancel".equals(stringExtra2)) {
                throw null;
            }
            if ("error".equals(stringExtra2)) {
                new lb.c(-6, "unknown error", stringExtra3 + "");
                throw null;
            }
            if (!"complete".equals(stringExtra2)) {
                return true;
            }
            try {
                new JSONObject(stringExtra3 == null ? "{\"ret\": 0}" : stringExtra3);
                throw null;
            } catch (JSONException e10) {
                jb.a.g("openSDK_LOG.UIListenerManager", "JSONException", e10);
                new lb.c(-4, "json error", stringExtra3 + "");
                throw null;
            }
        }
        if ("action_common_channel".equals(stringExtra)) {
            int intExtra = intent.getIntExtra("key_error_code", 0);
            if (intExtra != 0) {
                new lb.c(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail"));
                throw null;
            }
            String stringExtra4 = intent.getStringExtra("response");
            if (stringExtra4 == null) {
                new JSONObject();
                throw null;
            }
            try {
                k.p(stringExtra4).put("message", intent.getStringExtra("message"));
                throw null;
            } catch (JSONException unused) {
                new lb.c(-4, "服务器返回数据格式有误!", stringExtra4);
                throw null;
            }
        }
        int intExtra2 = intent.getIntExtra("key_error_code", 0);
        if (intExtra2 != 0) {
            new lb.c(intExtra2, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail"));
            throw null;
        }
        String stringExtra5 = intent.getStringExtra("key_response");
        if (stringExtra5 == null) {
            new JSONObject();
            throw null;
        }
        try {
            k.p(stringExtra5);
            throw null;
        } catch (JSONException unused2) {
            new lb.c(-4, "服务器返回数据格式有误!", stringExtra5);
            throw null;
        }
    }
}
