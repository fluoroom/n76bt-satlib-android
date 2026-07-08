package eh;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12597a = a.f12599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f12598b = new a.C0173a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f12599a = new a();

        /* JADX INFO: renamed from: eh.r$a$a, reason: collision with other inner class name */
        private static final class C0173a implements r {
            @Override // eh.r
            public List a(String str) throws UnknownHostException {
                rd.m.e(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    rd.m.d(allByName, "getAllByName(...)");
                    return ed.j.k0(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    List a(String str);
}
