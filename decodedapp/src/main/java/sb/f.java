package sb;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import r9.t;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f27230a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f27231b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private f() {
    }

    private static List a(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private static boolean b(String str) {
        return t.a(str) == str.length();
    }

    private boolean c(String str, X509Certificate x509Certificate) {
        return d(str) ? g(str, x509Certificate) : f(str, x509Certificate);
    }

    static boolean d(String str) {
        return f27231b.matcher(str).matches();
    }

    private boolean e(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String strB = r9.b.b(str2);
            if (!strB.contains("*")) {
                return str.equals(strB);
            }
            if (!strB.startsWith("*.") || strB.indexOf(42, 1) != -1 || str.length() < strB.length() || "*.".equals(strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    private boolean f(String str, X509Certificate x509Certificate) {
        String strB;
        String strB2 = r9.b.b(str);
        List listA = a(x509Certificate, 2);
        int size = listA.size();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            if (e(strB2, (String) listA.get(i10))) {
                return true;
            }
            i10++;
            z10 = true;
        }
        if (z10 || (strB = new d(x509Certificate.getSubjectX500Principal()).b("cn")) == null) {
            return false;
        }
        return e(strB2, strB);
    }

    private boolean g(String str, X509Certificate x509Certificate) {
        List listA = a(x509Certificate, 7);
        int size = listA.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase((String) listA.get(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        if (!b(str)) {
            return false;
        }
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
