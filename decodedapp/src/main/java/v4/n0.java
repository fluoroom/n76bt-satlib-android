package v4;

import android.location.Location;

/* JADX INFO: loaded from: classes.dex */
public interface n0 {

    public enum a {
        CONTROL_LINK_STATUS_CHANGED,
        AUDIO_LINK_STATUS_CHANGED
    }

    public interface b {
        void r(y4.b bVar);
    }

    public enum c {
        Idle,
        Interrupted,
        Connecting,
        ConnectionFailed,
        Connected,
        Sending;

        public boolean d() {
            return this == Connected || this == Sending;
        }

        public boolean e(c cVar) {
            int iOrdinal;
            return (ordinal() == 0 && ((iOrdinal = cVar.ordinal()) == 1 || iOrdinal == 3)) ? false : true;
        }
    }

    public interface d {
        void M(n0 n0Var, g3.d dVar);

        void W0(n0 n0Var);

        void h0(n0 n0Var);

        void i0(n0 n0Var);

        void j0(n0 n0Var, k0 k0Var, k0 k0Var2);

        void o0(n0 n0Var);
    }

    boolean a(v vVar, byte... bArr);

    boolean b(v vVar, q0 q0Var);

    a0 d();

    void destroy();

    void g(b bVar);

    String getName();

    void h(boolean z10);

    boolean i();

    boolean isDestroyed();

    w4.c[] j();

    void k(d dVar);

    c l();

    boolean n();

    void p(Location location);

    long q();

    void r(d dVar);

    r1 s();

    xdsopl.robot36.a u();

    void v(boolean z10);

    void x(b bVar);

    mi.c z();
}
