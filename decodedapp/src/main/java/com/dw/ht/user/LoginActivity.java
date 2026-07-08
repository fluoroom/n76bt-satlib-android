package com.dw.ht.user;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.u;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Um;
import com.benshikj.ht.rpc.UserGrpc;
import com.benshikj.ht.wxapi.WXEntryActivity;
import com.dw.grpc.Error;
import com.dw.ht.o;
import com.dw.ht.user.LoginActivity;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import dd.d0;
import dd.j;
import dd.k;
import dd.s;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import n7.a;
import org.json.JSONException;
import org.json.JSONObject;
import qd.l;
import qd.p;
import rd.h;
import rd.m;
import rg.q;
import tg.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010*\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/dw/ht/user/LoginActivity;", "Lj4/a;", "<init>", "()V", "Ldd/d0;", "I2", "s2", "t2", "", "e", "E2", "(Ljava/lang/Throwable;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "onResume", "", "show", "F2", "(Z)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Ln7/e;", "j0", "Ln7/e;", "oneTapClient", "Ln7/a;", "k0", "Ln7/a;", "signInRequest", "Landroid/os/Handler;", "l0", "Landroid/os/Handler;", "getMHandler$app_prodGoogleGmapRelease", "()Landroid/os/Handler;", "mHandler", "Lm4/e;", "m0", "Lm4/e;", "binding", "n0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoginActivity extends j4.a {

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o0 */
    private static boolean f6794o0 = true;

    /* JADX INFO: renamed from: p0 */
    private static final j f6795p0 = k.b(new qd.a() { // from class: n5.k0
        @Override // qd.a
        public final Object a() {
            return LoginActivity.H2();
        }
    });

    /* JADX INFO: renamed from: q0 */
    private static SoftReference f6796q0 = new SoftReference(null);

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private n7.e oneTapClient;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private n7.a signInRequest;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private final Handler mHandler = new c(Looper.getMainLooper());

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private m4.e binding;

    /* JADX INFO: renamed from: com.dw.ht.user.LoginActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final lb.b c() {
            Object value = LoginActivity.f6795p0.getValue();
            m.d(value, "getValue(...)");
            return (lb.b) value;
        }

        public final SoftReference b() {
            return LoginActivity.f6796q0;
        }

        public final IWXAPI d() {
            return WXEntryActivity.INSTANCE.b();
        }

        private Companion() {
        }
    }

    static final class b extends jd.m implements p {

        /* JADX INFO: renamed from: e */
        int f6801e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f6802f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ String f6803g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f6804h;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ LoginActivity f6805r;

        static final class a extends jd.m implements p {

            /* JADX INFO: renamed from: e */
            int f6806e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ Um.LoginResult f6807f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ LoginActivity f6808g;

            /* JADX INFO: renamed from: com.dw.ht.user.LoginActivity$b$a$a */
            public static final /* synthetic */ class C0100a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f6809a;

                static {
                    int[] iArr = new int[Um.StatusCode.values().length];
                    try {
                        iArr[Um.StatusCode.ok.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Um.StatusCode.ErrUnconfirmed.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f6809a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Um.LoginResult loginResult, LoginActivity loginActivity, hd.e eVar) {
                super(2, eVar);
                this.f6807f = loginResult;
                this.f6808g = loginActivity;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new a(this.f6807f, this.f6808g, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                TextView textView;
                id.b.e();
                if (this.f6806e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                Um.StatusCode code = this.f6807f.getCode();
                int i10 = code == null ? -1 : C0100a.f6809a[code.ordinal()];
                if (i10 == 1) {
                    com.dw.ht.user.a aVarI = com.dw.ht.user.a.i(this.f6808g);
                    m.d(aVarI, "getInstance(...)");
                    aVarI.m(this.f6807f);
                    this.f6808g.finish();
                    return d0.f10897a;
                }
                if (i10 != 2) {
                    Toast.makeText(this.f6808g, R.string.usernameOrPasswordIsIncorrect, 1).show();
                } else {
                    m4.e eVar = this.f6808g.binding;
                    if (eVar != null && (textView = eVar.f21094q) != null) {
                        textView.setVisibility(0);
                    }
                    LoginActivity loginActivity = this.f6808g;
                    Toast.makeText(loginActivity, loginActivity.getString(R.string.needConfirmEmailAddress), 1).show();
                }
                this.f6808g.F2(false);
                return d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((a) g(d0Var, eVar)).o(d0.f10897a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, LoginActivity loginActivity, hd.e eVar) {
            super(2, eVar);
            this.f6803g = str;
            this.f6804h = str2;
            this.f6805r = loginActivity;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            b bVar = new b(this.f6803g, this.f6804h, this.f6805r, eVar);
            bVar.f6802f = obj;
            return bVar;
        }

        @Override // jd.a
        public final Object o(Object obj) {
            tg.d0 d0Var = (tg.d0) this.f6802f;
            id.b.e();
            if (this.f6801e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            try {
                tg.g.b(d0Var, p0.c(), null, new a(f5.d.f12792a.h().login(Um.LoginRequest.newBuilder().setUsernameOrEmail(this.f6803g).setPassword(this.f6804h).build()), this.f6805r, null), 2, null);
            } catch (Throwable th2) {
                this.f6805r.E2(th2);
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((b) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    public static final class c extends Handler {

        static final class a extends jd.m implements p {

            /* JADX INFO: renamed from: e */
            int f6811e;

            /* JADX INFO: renamed from: f */
            private /* synthetic */ Object f6812f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ String f6813g;

            /* JADX INFO: renamed from: h */
            final /* synthetic */ LoginActivity f6814h;

            /* JADX INFO: renamed from: com.dw.ht.user.LoginActivity$c$a$a */
            static final class C0101a extends jd.m implements p {

                /* JADX INFO: renamed from: e */
                int f6815e;

                /* JADX INFO: renamed from: f */
                final /* synthetic */ Um.LoginResult f6816f;

                /* JADX INFO: renamed from: g */
                final /* synthetic */ LoginActivity f6817g;

                /* JADX INFO: renamed from: com.dw.ht.user.LoginActivity$c$a$a$a */
                public static final /* synthetic */ class C0102a {

                    /* JADX INFO: renamed from: a */
                    public static final /* synthetic */ int[] f6818a;

                    static {
                        int[] iArr = new int[Um.StatusCode.values().length];
                        try {
                            iArr[Um.StatusCode.ok.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f6818a = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0101a(Um.LoginResult loginResult, LoginActivity loginActivity, hd.e eVar) {
                    super(2, eVar);
                    this.f6816f = loginResult;
                    this.f6817g = loginActivity;
                }

                @Override // jd.a
                public final hd.e g(Object obj, hd.e eVar) {
                    return new C0101a(this.f6816f, this.f6817g, eVar);
                }

                @Override // jd.a
                public final Object o(Object obj) {
                    id.b.e();
                    if (this.f6815e != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    Um.StatusCode code = this.f6816f.getCode();
                    if ((code == null ? -1 : C0102a.f6818a[code.ordinal()]) == 1) {
                        com.dw.ht.user.a aVarI = com.dw.ht.user.a.i(this.f6817g);
                        m.d(aVarI, "getInstance(...)");
                        aVarI.m(this.f6816f);
                        LoginActivity.INSTANCE.c().i(this.f6817g);
                        this.f6817g.finish();
                    } else {
                        this.f6817g.F2(false);
                        Toast.makeText(this.f6817g, R.string.usernameOrPasswordIsIncorrect, 1).show();
                    }
                    return d0.f10897a;
                }

                @Override // qd.p
                /* JADX INFO: renamed from: t */
                public final Object s(tg.d0 d0Var, hd.e eVar) {
                    return ((C0101a) g(d0Var, eVar)).o(d0.f10897a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, LoginActivity loginActivity, hd.e eVar) {
                super(2, eVar);
                this.f6813g = str;
                this.f6814h = loginActivity;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                a aVar = new a(this.f6813g, this.f6814h, eVar);
                aVar.f6812f = obj;
                return aVar;
            }

            @Override // jd.a
            public final Object o(Object obj) {
                tg.d0 d0Var = (tg.d0) this.f6812f;
                id.b.e();
                if (this.f6811e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                try {
                    UserGrpc.UserBlockingStub userBlockingStubH = f5.d.f12792a.h();
                    Um.OpenIDLoginRequest.Builder type = Um.OpenIDLoginRequest.newBuilder().setType(Um.OpenIDLoginRequest.Type.QQ);
                    Companion companion = LoginActivity.INSTANCE;
                    tg.g.b(d0Var, p0.c(), null, new C0101a(userBlockingStubH.openIDLogin(type.setOpenID(companion.c().h()).setAccessToken(companion.c().f()).setNickname(this.f6813g).build()), this.f6814h, null), 2, null);
                } catch (Throwable th2) {
                    this.f6814h.E2(th2);
                }
                return d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((a) g(d0Var, eVar)).o(d0.f10897a);
            }
        }

        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            m.e(message, "msg");
            if (message.what != 0) {
                return;
            }
            Object obj = message.obj;
            m.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.has("nickname")) {
                try {
                    String string = jSONObject.getString("nickname");
                    LoginActivity.this.F2(true);
                    tg.g.b(u.a(LoginActivity.this), p0.b(), null, new a(string, LoginActivity.this, null), 2, null);
                } catch (JSONException e10) {
                    LoginActivity.this.F2(false);
                    e10.printStackTrace();
                }
            }
        }
    }

    static final class d extends jd.m implements p {

        /* JADX INFO: renamed from: e */
        int f6819e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f6820f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ String f6821g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ String f6822h;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ n7.f f6823r;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ LoginActivity f6824s;

        static final class a extends jd.m implements p {

            /* JADX INFO: renamed from: e */
            int f6825e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ Um.LoginResult f6826f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ LoginActivity f6827g;

            /* JADX INFO: renamed from: com.dw.ht.user.LoginActivity$d$a$a */
            public static final /* synthetic */ class C0103a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f6828a;

                static {
                    int[] iArr = new int[Um.StatusCode.values().length];
                    try {
                        iArr[Um.StatusCode.ok.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f6828a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Um.LoginResult loginResult, LoginActivity loginActivity, hd.e eVar) {
                super(2, eVar);
                this.f6826f = loginResult;
                this.f6827g = loginActivity;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new a(this.f6826f, this.f6827g, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f6825e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                Um.StatusCode code = this.f6826f.getCode();
                if ((code == null ? -1 : C0103a.f6828a[code.ordinal()]) == 1) {
                    com.dw.ht.user.a aVarI = com.dw.ht.user.a.i(this.f6827g);
                    m.d(aVarI, "getInstance(...)");
                    aVarI.m(this.f6826f);
                    this.f6827g.finish();
                } else {
                    this.f6827g.F2(false);
                    Toast.makeText(this.f6827g, R.string.usernameOrPasswordIsIncorrect, 1).show();
                }
                return d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((a) g(d0Var, eVar)).o(d0.f10897a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, n7.f fVar, LoginActivity loginActivity, hd.e eVar) {
            super(2, eVar);
            this.f6821g = str;
            this.f6822h = str2;
            this.f6823r = fVar;
            this.f6824s = loginActivity;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            d dVar = new d(this.f6821g, this.f6822h, this.f6823r, this.f6824s, eVar);
            dVar.f6820f = obj;
            return dVar;
        }

        @Override // jd.a
        public final Object o(Object obj) {
            tg.d0 d0Var = (tg.d0) this.f6820f;
            id.b.e();
            if (this.f6819e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            try {
                tg.g.b(d0Var, p0.c(), null, new a(f5.d.f12792a.h().openIDLogin(Um.OpenIDLoginRequest.newBuilder().setType(Um.OpenIDLoginRequest.Type.Google).setOpenID(this.f6821g).setAccessToken(this.f6822h).setNickname(this.f6823r.b()).build()), this.f6824s, null), 2, null);
            } catch (Throwable th2) {
                this.f6824s.E2(th2);
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((d) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    static final class e extends jd.m implements p {

        /* JADX INFO: renamed from: e */
        int f6829e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Throwable f6830f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ LoginActivity f6831g;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f6832a;

            static {
                int[] iArr = new int[Error.Code.values().length];
                try {
                    iArr[Error.Code.InvalidArgument.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f6832a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Throwable th2, LoginActivity loginActivity, hd.e eVar) {
            super(2, eVar);
            this.f6830f = th2;
            this.f6831g = loginActivity;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return new e(this.f6830f, this.f6831g, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f6829e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Error.Info infoJ = f5.d.j(this.f6830f);
            Error.Code code = infoJ != null ? infoJ.getCode() : null;
            if ((code == null ? -1 : a.f6832a[code.ordinal()]) == 1) {
                Toast.makeText(this.f6831g, R.string.usernameOrPasswordIsIncorrect, 1).show();
            } else {
                Toast.makeText(this.f6831g, this.f6830f.getLocalizedMessage(), 1).show();
            }
            this.f6831g.F2(false);
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((e) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m4.e f6833a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f6834b;

        f(m4.e eVar, boolean z10) {
            this.f6833a = eVar;
            this.f6834b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.e(animator, "animation");
            this.f6833a.f21087j.setVisibility(this.f6834b ? 8 : 0);
        }
    }

    public static final class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m4.e f6835a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f6836b;

        g(m4.e eVar, boolean z10) {
            this.f6835a = eVar;
            this.f6836b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.e(animator, "animation");
            this.f6835a.f21088k.setVisibility(this.f6836b ? 0 : 8);
        }
    }

    public static final void A2(LoginActivity loginActivity, Exception exc) {
        m.e(exc, "e");
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage != null) {
            Log.d("LoginActivity", localizedMessage);
        }
        loginActivity.F2(false);
    }

    public static final void B2(LoginActivity loginActivity, View view) {
        v3.j.e(loginActivity, new Intent("android.intent.action.VIEW", Uri.parse("https://account.benshikj.com/user/register")));
    }

    public static final void C2(LoginActivity loginActivity, View view) {
        v3.j.e(loginActivity, new Intent("android.intent.action.VIEW", Uri.parse("https://account.benshikj.com/user/forgot")));
    }

    public static final void D2(LoginActivity loginActivity, View view) {
        v3.j.e(loginActivity, new Intent("android.intent.action.VIEW", Uri.parse("https://account.benshikj.com/user/resend")));
    }

    public final void E2(Throwable e10) {
        tg.g.b(u.a(this), p0.c(), null, new e(e10, this, null), 2, null);
    }

    public static final void G2(LoginActivity loginActivity, boolean z10) {
        loginActivity.F2(z10);
    }

    public static final lb.b H2() {
        return lb.b.e("101439258", o.f6637b.a().e());
    }

    private final void I2() {
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = WXEntryActivity.INSTANCE.a();
        INSTANCE.d().sendReq(req);
    }

    private final void s2() {
        boolean z10;
        EditText editText;
        m4.e eVar = this.binding;
        if (eVar == null) {
            return;
        }
        t2();
        eVar.f21081d.setError(null);
        eVar.f21090m.setError(null);
        String string = q.W0(eVar.f21081d.getText().toString()).toString();
        String string2 = q.W0(eVar.f21090m.getText().toString()).toString();
        if (TextUtils.isEmpty(string2)) {
            eVar.f21090m.setError(getString(R.string.error_field_required));
            editText = eVar.f21090m;
            z10 = true;
        } else {
            z10 = false;
            editText = null;
        }
        if (TextUtils.isEmpty(string)) {
            eVar.f21081d.setError(getString(R.string.error_field_required));
            editText = eVar.f21081d;
            z10 = true;
        }
        if (!z10) {
            F2(true);
            tg.g.b(u.a(this), p0.b(), null, new b(string, string2, this, null), 2, null);
        } else if (editText != null) {
            editText.requestFocus();
        }
    }

    private final void t2() {
        m4.e eVar = this.binding;
        if (eVar == null) {
            return;
        }
        Object systemService = getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        if (inputMethodManager.isActive(eVar.f21090m)) {
            inputMethodManager.hideSoftInputFromWindow(eVar.f21090m.getWindowToken(), 0);
        } else if (inputMethodManager.isActive(eVar.f21081d)) {
            inputMethodManager.hideSoftInputFromWindow(eVar.f21081d.getWindowToken(), 0);
        }
    }

    public static final boolean u2(LoginActivity loginActivity, TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 0 && i10 != 6) {
            return false;
        }
        loginActivity.s2();
        return true;
    }

    public static final void v2(LoginActivity loginActivity, View view) {
        loginActivity.s2();
    }

    public static final void w2(LoginActivity loginActivity, View view) {
        loginActivity.I2();
    }

    public static final void x2(final LoginActivity loginActivity, View view) {
        loginActivity.F2(true);
        n7.e eVar = loginActivity.oneTapClient;
        n7.a aVar = null;
        if (eVar == null) {
            m.o("oneTapClient");
            eVar = null;
        }
        n7.a aVar2 = loginActivity.signInRequest;
        if (aVar2 == null) {
            m.o("signInRequest");
        } else {
            aVar = aVar2;
        }
        t8.g gVarD = eVar.d(aVar);
        final l lVar = new l() { // from class: n5.m0
            @Override // qd.l
            public final Object l(Object obj) {
                return LoginActivity.y2(this.f22528a, (n7.b) obj);
            }
        };
        gVarD.d(loginActivity, new t8.e() { // from class: n5.c0
            @Override // t8.e
            public final void a(Object obj) {
                LoginActivity.z2(lVar, obj);
            }
        }).c(loginActivity, new t8.d() { // from class: n5.d0
            @Override // t8.d
            public final void a(Exception exc) {
                LoginActivity.A2(this.f22509a, exc);
            }
        });
    }

    public static final d0 y2(LoginActivity loginActivity, n7.b bVar) {
        loginActivity.F2(false);
        try {
            IntentSender intentSender = bVar.b().getIntentSender();
            m.d(intentSender, "getIntentSender(...)");
            loginActivity.startIntentSenderForResult(intentSender, 1, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e10) {
            Log.e("LoginActivity", "Couldn't start One Tap UI: " + e10.getLocalizedMessage());
        }
        return d0.f10897a;
    }

    public static final void z2(l lVar, Object obj) {
        lVar.l(obj);
    }

    public final void F2(final boolean show) {
        m4.e eVar = this.binding;
        if (eVar == null) {
            return;
        }
        if (!com.dw.util.concurrent.b.a()) {
            eVar.f21087j.post(new Runnable() { // from class: n5.l0
                @Override // java.lang.Runnable
                public final void run() {
                    LoginActivity.G2(this.f22525a, show);
                }
            });
            return;
        }
        long integer = getResources().getInteger(android.R.integer.config_shortAnimTime);
        eVar.f21087j.setVisibility(show ? 8 : 0);
        eVar.f21087j.animate().setDuration(integer).alpha(!show ? 1 : 0).setListener(new f(eVar, show));
        eVar.f21088k.setVisibility(show ? 0 : 8);
        eVar.f21088k.animate().setDuration(integer).alpha(show ? 1.0f : 0.0f).setListener(new g(eVar, show));
    }

    @Override // j4.a, v3.b, androidx.fragment.app.p, d.q, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        EditText editText;
        AutoCompleteTextView autoCompleteTextView;
        n7.e eVar = null;
        if ((requestCode == 10102 || requestCode == 11101) && data != null) {
            lb.b.j(requestCode, resultCode, data, null);
        }
        if (requestCode == 1) {
            try {
                n7.e eVar2 = this.oneTapClient;
                if (eVar2 == null) {
                    m.o("oneTapClient");
                } else {
                    eVar = eVar2;
                }
                n7.f fVarC = eVar.c(data);
                m.d(fVarC, "getSignInCredentialFromIntent(...)");
                String strF = fVarC.f();
                String strG = fVarC.g();
                m.d(strG, "getId(...)");
                String strH = fVarC.h();
                if (strF != null) {
                    Log.d("LoginActivity", "Got ID token.");
                    try {
                        F2(true);
                        tg.g.b(u.a(this), p0.b(), null, new d(strG, strF, fVarC, this, null), 2, null);
                    } catch (JSONException e10) {
                        F2(false);
                        e10.printStackTrace();
                        d0 d0Var = d0.f10897a;
                    }
                } else if (strH != null) {
                    Log.d("LoginActivity", "Got password.");
                    m4.e eVar3 = this.binding;
                    if (eVar3 != null && (autoCompleteTextView = eVar3.f21081d) != null) {
                        autoCompleteTextView.setText(strG);
                    }
                    m4.e eVar4 = this.binding;
                    if (eVar4 != null && (editText = eVar4.f21090m) != null) {
                        editText.setText(strH);
                    }
                    s2();
                } else {
                    Log.d("LoginActivity", "No ID token or password!");
                }
            } catch (t7.b e11) {
                int iB = e11.b();
                if (iB == 7) {
                    Log.d("LoginActivity", "One-tap encountered a network error.");
                } else if (iB != 16) {
                    Log.d("LoginActivity", "Couldn't get credential from result. (" + e11.getLocalizedMessage() + ')');
                } else {
                    Log.d("LoginActivity", "One-tap dialog was closed.");
                    f6794o0 = false;
                }
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // v3.b, androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        f6796q0 = new SoftReference(this);
        n7.e eVarA = n7.d.a(this);
        m.d(eVarA, "getSignInClient(...)");
        this.oneTapClient = eVarA;
        n7.a aVarA = n7.a.b().c(a.b.b().d(true).c("745944101416-t3prq4s3bp9dgm83d3huakg5r7c5h7t0.apps.googleusercontent.com").b(false).a()).a();
        m.d(aVarA, "build(...)");
        this.signInRequest = aVarA;
        m4.e eVarC = m4.e.c(getLayoutInflater());
        m.d(eVarC, "inflate(...)");
        this.binding = eVarC;
        setContentView(eVarC.b());
        eVarC.f21090m.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: n5.b0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return LoginActivity.u2(this.f22504a, textView, i10, keyEvent);
            }
        });
        eVarC.f21084g.setOnClickListener(new View.OnClickListener() { // from class: n5.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.v2(this.f22512a, view);
            }
        });
        getResources().getBoolean(R.bool.enable_qq_login);
        eVarC.f21092o.setVisibility(8);
        if (INSTANCE.d().isWXAppInstalled()) {
            eVarC.f21095r.setOnClickListener(new View.OnClickListener() { // from class: n5.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginActivity.w2(this.f22514a, view);
                }
            });
        } else {
            eVarC.f21095r.setVisibility(8);
        }
        eVarC.f21086i.setOnClickListener(new View.OnClickListener() { // from class: n5.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.x2(this.f22517a, view);
            }
        });
        eVarC.f21093p.setOnClickListener(new View.OnClickListener() { // from class: n5.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.B2(this.f22519a, view);
            }
        });
        eVarC.f21085h.setOnClickListener(new View.OnClickListener() { // from class: n5.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.C2(this.f22520a, view);
            }
        });
        eVarC.f21094q.setOnClickListener(new View.OnClickListener() { // from class: n5.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoginActivity.D2(this.f22522a, view);
            }
        });
    }

    @Override // v3.b, v3.i, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }

    @Override // j4.a, v3.b, v3.i, androidx.fragment.app.p, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.dw.ht.user.b.f6853a.i() != 0) {
            finish();
        }
    }
}
