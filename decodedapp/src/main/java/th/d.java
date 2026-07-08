package th;

import d.h0;
import ed.q;
import fh.k;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import rd.m;
import vh.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f27887a = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        m.d(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        m.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final List c(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return q.k();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && m.a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return q.k();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) p0.b(str, 0, 0, 3, null));
    }

    private final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !rg.q.J(str, ".", false, 2, null) && !rg.q.w(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !rg.q.J(str2, ".", false, 2, null) && !rg.q.w(str2, "..", false, 2, null)) {
            if (!rg.q.w(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!rg.q.w(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String strB = b(str2);
            if (!rg.q.P(strB, "*", false, 2, null)) {
                return m.a(str3, strB);
            }
            if (!rg.q.J(strB, "*.", false, 2, null) || rg.q.b0(strB, '*', 1, false, 4, null) != -1 || str3.length() < strB.length() || m.a("*.", strB)) {
                return false;
            }
            String strSubstring = strB.substring(1);
            m.d(strSubstring, "substring(...)");
            if (!rg.q.w(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || rg.q.h0(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String strB = b(str);
        List listC = c(x509Certificate, 2);
        if (h0.a(listC) && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (f27887a.f(strB, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String strK = k.k(str);
        List listC = c(x509Certificate, 7);
        if (h0.a(listC) && listC.isEmpty()) {
            return false;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (m.a(strK, k.k((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List a(X509Certificate x509Certificate) {
        m.e(x509Certificate, "certificate");
        return q.s0(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        m.e(str, "host");
        m.e(x509Certificate, "certificate");
        return k.a(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        m.e(str, "host");
        m.e(sSLSession, "session");
        if (!d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            m.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return e(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
