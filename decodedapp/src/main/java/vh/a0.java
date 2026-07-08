package vh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class a0 {
    public static final l0 a(File file, boolean z10) {
        rd.m.e(file, "<this>");
        return z.e(new FileOutputStream(file, z10));
    }

    public static final l0 b(OutputStream outputStream) {
        rd.m.e(outputStream, "<this>");
        return new d0(outputStream, new o0());
    }

    public static final l0 c(Socket socket) throws IOException {
        rd.m.e(socket, "<this>");
        wh.m mVar = new wh.m(socket);
        OutputStream outputStream = socket.getOutputStream();
        rd.m.d(outputStream, "getOutputStream(...)");
        return mVar.z(new d0(outputStream, mVar));
    }

    public static /* synthetic */ l0 d(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return z.d(file, z10);
    }

    public static final m0 e(Socket socket) {
        rd.m.e(socket, "<this>");
        return new wh.g(socket);
    }

    public static final n0 f(File file) {
        rd.m.e(file, "<this>");
        return new r(new FileInputStream(file), o0.f30840e);
    }

    public static final n0 g(InputStream inputStream) {
        rd.m.e(inputStream, "<this>");
        return new r(inputStream, new o0());
    }

    public static final n0 h(Socket socket) throws IOException {
        rd.m.e(socket, "<this>");
        wh.m mVar = new wh.m(socket);
        InputStream inputStream = socket.getInputStream();
        rd.m.d(inputStream, "getInputStream(...)");
        return mVar.A(new r(inputStream, mVar));
    }
}
