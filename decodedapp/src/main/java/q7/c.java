package q7;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lock f24378c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static c f24379d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f24380a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f24381b;

    c(Context context) {
        this.f24381b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        v7.q.i(context);
        Lock lock = f24378c;
        lock.lock();
        try {
            if (f24379d == null) {
                f24379d = new c(context.getApplicationContext());
            }
            c cVar = f24379d;
            lock.unlock();
            return cVar;
        } catch (Throwable th2) {
            f24378c.unlock();
            throw th2;
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f24380a.lock();
        try {
            this.f24381b.edit().clear().apply();
        } finally {
            this.f24380a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(i("googleSignInAccount", strG2))) != null) {
            try {
                return GoogleSignInAccount.m(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions d() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(i("googleSignInOptions", strG2))) != null) {
            try {
                return GoogleSignInOptions.l(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        v7.q.i(googleSignInAccount);
        v7.q.i(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.n());
        v7.q.i(googleSignInAccount);
        v7.q.i(googleSignInOptions);
        String strN = googleSignInAccount.n();
        h(i("googleSignInAccount", strN), googleSignInAccount.o());
        h(i("googleSignInOptions", strN), googleSignInOptions.p());
    }

    protected final String g(String str) {
        this.f24380a.lock();
        try {
            return this.f24381b.getString(str, null);
        } finally {
            this.f24380a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.f24380a.lock();
        try {
            this.f24381b.edit().putString(str, str2).apply();
        } finally {
            this.f24380a.unlock();
        }
    }
}
