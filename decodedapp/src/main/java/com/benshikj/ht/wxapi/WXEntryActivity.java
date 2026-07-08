package com.benshikj.ht.wxapi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Um;
import com.dw.ht.o;
import com.dw.ht.user.LoginActivity;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import dd.d0;
import dd.s;
import eh.f;
import eh.f0;
import eh.h0;
import eh.i0;
import f5.d;
import hd.e;
import java.io.IOException;
import kotlin.Metadata;
import org.json.JSONObject;
import org.json.JSONTokener;
import qd.p;
import rd.h;
import rd.m;
import tg.g;
import tg.p0;
import tg.z0;
import vd.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/benshikj/ht/wxapi/WXEntryActivity;", "Landroid/app/Activity;", "Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/tencent/mm/opensdk/modelbase/BaseReq;", "baseReq", "onReq", "(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)V", "Lcom/tencent/mm/opensdk/modelbase/BaseResp;", "resp", "onResp", "(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WXEntryActivity extends Activity implements IWXAPIEventHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static IWXAPI f4956b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f4957c = "";

    /* JADX INFO: renamed from: com.benshikj.ht.wxapi.WXEntryActivity$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: com.benshikj.ht.wxapi.WXEntryActivity$a$a, reason: collision with other inner class name */
        public static final class C0072a extends BroadcastReceiver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ IWXAPI f4958a;

            C0072a(IWXAPI iwxapi) {
                this.f4958a = iwxapi;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                this.f4958a.registerApp("wx67239a5bea7bdd66");
            }
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final String a() {
            WXEntryActivity.f4957c = String.valueOf(c.f30542a.c());
            return WXEntryActivity.f4957c;
        }

        public final IWXAPI b() {
            if (WXEntryActivity.f4956b == null) {
                o.a aVar = o.f6637b;
                IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(aVar.a().e(), "wx67239a5bea7bdd66", true);
                iwxapiCreateWXAPI.registerApp("wx67239a5bea7bdd66");
                b0.b.j(aVar.a().e(), new C0072a(iwxapiCreateWXAPI), new IntentFilter(ConstantsAPI.ACTION_REFRESH_WXAPP), 2);
                WXEntryActivity.f4956b = iwxapiCreateWXAPI;
            }
            IWXAPI iwxapi = WXEntryActivity.f4956b;
            m.b(iwxapi);
            return iwxapi;
        }

        private Companion() {
        }
    }

    public static final class b implements f {

        static final class a extends jd.m implements p {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f4960e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f4961f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f4962g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ WXEntryActivity f4963h;

            /* JADX INFO: renamed from: com.benshikj.ht.wxapi.WXEntryActivity$b$a$a, reason: collision with other inner class name */
            static final class C0073a extends jd.m implements p {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f4964e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ Um.LoginResult f4965f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ WXEntryActivity f4966g;

                /* JADX INFO: renamed from: com.benshikj.ht.wxapi.WXEntryActivity$b$a$a$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0074a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f4967a;

                    static {
                        int[] iArr = new int[Um.StatusCode.values().length];
                        try {
                            iArr[Um.StatusCode.ok.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f4967a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0073a(Um.LoginResult loginResult, WXEntryActivity wXEntryActivity, e eVar) {
                    super(2, eVar);
                    this.f4965f = loginResult;
                    this.f4966g = wXEntryActivity;
                }

                @Override // jd.a
                public final e g(Object obj, e eVar) {
                    return new C0073a(this.f4965f, this.f4966g, eVar);
                }

                @Override // jd.a
                public final Object o(Object obj) {
                    id.b.e();
                    if (this.f4964e != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    Um.StatusCode code = this.f4965f.getCode();
                    if ((code == null ? -1 : C0074a.f4967a[code.ordinal()]) == 1) {
                        com.dw.ht.user.a aVarI = com.dw.ht.user.a.i(this.f4966g);
                        m.d(aVarI, "getInstance(...)");
                        aVarI.m(this.f4965f);
                        LoginActivity loginActivity = (LoginActivity) LoginActivity.INSTANCE.b().get();
                        if (loginActivity != null) {
                            loginActivity.finish();
                        }
                    } else {
                        LoginActivity loginActivity2 = (LoginActivity) LoginActivity.INSTANCE.b().get();
                        if (loginActivity2 != null) {
                            loginActivity2.F2(false);
                        }
                        Toast.makeText(this.f4966g, R.string.usernameOrPasswordIsIncorrect, 1).show();
                    }
                    return d0.f10897a;
                }

                @Override // qd.p
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final Object s(tg.d0 d0Var, e eVar) {
                    return ((C0073a) g(d0Var, eVar)).o(d0.f10897a);
                }
            }

            /* JADX INFO: renamed from: com.benshikj.ht.wxapi.WXEntryActivity$b$a$b, reason: collision with other inner class name */
            static final class C0075b extends jd.m implements p {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f4968e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ WXEntryActivity f4969f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ Throwable f4970g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0075b(WXEntryActivity wXEntryActivity, Throwable th2, e eVar) {
                    super(2, eVar);
                    this.f4969f = wXEntryActivity;
                    this.f4970g = th2;
                }

                @Override // jd.a
                public final e g(Object obj, e eVar) {
                    return new C0075b(this.f4969f, this.f4970g, eVar);
                }

                @Override // jd.a
                public final Object o(Object obj) {
                    id.b.e();
                    if (this.f4968e != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    Toast.makeText(this.f4969f, this.f4970g.getLocalizedMessage(), 1).show();
                    LoginActivity loginActivity = (LoginActivity) LoginActivity.INSTANCE.b().get();
                    if (loginActivity != null) {
                        loginActivity.F2(false);
                    }
                    return d0.f10897a;
                }

                @Override // qd.p
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final Object s(tg.d0 d0Var, e eVar) {
                    return ((C0075b) g(d0Var, eVar)).o(d0.f10897a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, WXEntryActivity wXEntryActivity, e eVar) {
                super(2, eVar);
                this.f4962g = obj;
                this.f4963h = wXEntryActivity;
            }

            @Override // jd.a
            public final e g(Object obj, e eVar) {
                a aVar = new a(this.f4962g, this.f4963h, eVar);
                aVar.f4961f = obj;
                return aVar;
            }

            @Override // jd.a
            public final Object o(Object obj) {
                tg.d0 d0Var = (tg.d0) this.f4961f;
                id.b.e();
                if (this.f4960e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                try {
                    g.b(d0Var, p0.c(), null, new C0073a(d.f12792a.h().openIDLogin(Um.OpenIDLoginRequest.newBuilder().setType(Um.OpenIDLoginRequest.Type.WeiXin).setOpenID(((JSONObject) this.f4962g).getString("openid")).setAccessToken(((JSONObject) this.f4962g).getString("access_token")).build()), this.f4963h, null), 2, null);
                } catch (Throwable th2) {
                    Log.e("WXEntryActivity", "weixinLogin", th2);
                    g.b(d0Var, p0.c(), null, new C0075b(this.f4963h, th2, null), 2, null);
                }
                return d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object s(tg.d0 d0Var, e eVar) {
                return ((a) g(d0Var, eVar)).o(d0.f10897a);
            }
        }

        b() {
        }

        @Override // eh.f
        public void a(eh.e eVar, h0 h0Var) {
            String strString;
            m.e(eVar, "call");
            m.e(h0Var, "response");
            try {
                try {
                    Log.d("WXEntryActivity", h0Var.toString());
                    i0 i0VarC = h0Var.c();
                    if (i0VarC != null && (strString = i0VarC.string()) != null) {
                        Log.d("WXEntryActivity", strString);
                        Object objNextValue = new JSONTokener(strString).nextValue();
                        if (objNextValue instanceof JSONObject) {
                            g.b(z0.f27881a, p0.b(), null, new a(objNextValue, WXEntryActivity.this, null), 2, null);
                        }
                        h0Var.close();
                        return;
                    }
                    h0Var.close();
                } catch (Exception e10) {
                    Log.e("WXEntryActivity", "weixinLogin", e10);
                    LoginActivity loginActivity = (LoginActivity) LoginActivity.INSTANCE.b().get();
                    if (loginActivity != null) {
                        loginActivity.F2(false);
                    }
                    h0Var.close();
                }
            } catch (Throwable th2) {
                h0Var.close();
                throw th2;
            }
        }

        @Override // eh.f
        public void b(eh.e eVar, IOException iOException) {
            m.e(eVar, "call");
            m.e(iOException, "e");
            LoginActivity loginActivity = (LoginActivity) LoginActivity.INSTANCE.b().get();
            if (loginActivity != null) {
                loginActivity.F2(false);
            }
            Log.e("WXEntryActivity", iOException.toString());
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        INSTANCE.b().handleIntent(getIntent(), this);
        finish();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        m.e(baseReq, "baseReq");
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp resp) {
        m.e(resp, "resp");
        if (resp instanceof SendAuth.Resp) {
            if (resp.errCode != 0) {
                return;
            }
            SendAuth.Resp resp2 = (SendAuth.Resp) resp;
            if (!m.a(resp2.state, f4957c)) {
                return;
            }
            LoginActivity loginActivity = (LoginActivity) LoginActivity.INSTANCE.b().get();
            if (loginActivity != null) {
                loginActivity.F2(true);
            }
            new eh.d0().a(new f0.a().s("https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx67239a5bea7bdd66&secret=5eb3b1893d11596863f9ad3502954a62&code=" + resp2.code + "&grant_type=authorization_code").a()).q(new b());
        }
        Log.d("WXEntryActivity", "errCode=" + resp.errCode + ",errStr=" + resp.errStr + ",transaction=" + resp.transaction + ",openId=" + resp.openId + ',');
    }
}
