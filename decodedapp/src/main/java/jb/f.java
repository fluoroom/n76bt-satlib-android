package jb;

import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public static final class a {
        public static final boolean a(int i10, int i11) {
            return i11 == (i10 & i11);
        }
    }

    public static final class b {
        public static SimpleDateFormat a(String str) {
            return new SimpleDateFormat(str);
        }
    }

    public static boolean a(String str) {
        return str.contains("access_token") || str.contains("pay_token") || str.contains("pfkey") || str.contains("expires_in") || str.contains("openid") || str.contains("proxy_code") || str.contains("proxy_expires_in");
    }
}
