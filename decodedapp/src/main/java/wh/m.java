package wh;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends vh.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Socket f31466p;

    public m(Socket socket) {
        rd.m.e(socket, "socket");
        this.f31466p = socket;
    }

    @Override // vh.c
    protected void B() {
        try {
            this.f31466p.close();
        } catch (AssertionError e10) {
            if (!t.b(e10)) {
                throw e10;
            }
            t.f31501a.log(Level.WARNING, "Failed to close timed out socket " + this.f31466p, (Throwable) e10);
        } catch (Exception e11) {
            t.f31501a.log(Level.WARNING, "Failed to close timed out socket " + this.f31466p, (Throwable) e11);
        }
    }

    @Override // vh.c
    protected IOException v(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
