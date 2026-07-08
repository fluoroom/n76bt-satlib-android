package eh;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import vh.h;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f12421c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f12422d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f12423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final th.c f12424b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f12425a = new ArrayList();

        public final h a() {
            return new h(ed.q.M0(this.f12425a), null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final String a(Certificate certificate) {
            rd.m.e(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + b((X509Certificate) certificate).a();
        }

        public final vh.h b(X509Certificate x509Certificate) {
            rd.m.e(x509Certificate, "<this>");
            h.a aVar = vh.h.f30792d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            rd.m.d(encoded, "getEncoded(...)");
            return h.a.g(aVar, encoded, 0, 0, 3, null).O();
        }

        private b() {
        }
    }

    public h(Set set, th.c cVar) {
        rd.m.e(set, "pins");
        this.f12423a = set;
        this.f12424b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(h hVar, List list, String str) {
        List listA;
        th.c cVar = hVar.f12424b;
        if (cVar != null && (listA = cVar.a(list, str)) != null) {
            list = listA;
        }
        ArrayList arrayList = new ArrayList(ed.q.v(list, 10));
        for (Certificate certificate : list) {
            rd.m.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public final void b(final String str, final List list) throws SSLPeerUnverifiedException {
        rd.m.e(str, "hostname");
        rd.m.e(list, "peerCertificates");
        d(str, new qd.a() { // from class: eh.g
            @Override // qd.a
            public final Object a() {
                return h.c(this.f12410a, list, str);
            }
        });
    }

    public final void d(String str, qd.a aVar) throws SSLPeerUnverifiedException {
        rd.m.e(str, "hostname");
        rd.m.e(aVar, "cleanedPeerCertificatesFn");
        List listE = e(str);
        if (listE.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) aVar.a();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listE.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(f12421c.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        Iterator it2 = listE.iterator();
        while (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            sb2.append("\n    ");
            sb2.append((Object) null);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public final List e(String str) {
        rd.m.e(str, "hostname");
        Set set = this.f12423a;
        List listK = ed.q.k();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listK;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return rd.m.a(hVar.f12423a, this.f12423a) && rd.m.a(hVar.f12424b, this.f12424b);
    }

    public final th.c f() {
        return this.f12424b;
    }

    public final h g(th.c cVar) {
        rd.m.e(cVar, "certificateChainCleaner");
        return rd.m.a(this.f12424b, cVar) ? this : new h(this.f12423a, cVar);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f12423a.hashCode()) * 41;
        th.c cVar = this.f12424b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ h(Set set, th.c cVar, int i10, rd.h hVar) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
