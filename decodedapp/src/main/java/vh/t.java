package vh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class t extends k {
    private final List X(e0 e0Var, boolean z10) throws IOException {
        File file = e0Var.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                rd.m.b(str);
                arrayList.add(e0Var.k(str));
            }
            ed.q.y(arrayList);
            return arrayList;
        }
        if (!z10) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + e0Var);
        }
        throw new FileNotFoundException("no such file: " + e0Var);
    }

    private final void h0(e0 e0Var) throws IOException {
        if (v(e0Var)) {
            throw new IOException(e0Var + " already exists.");
        }
    }

    private final void p0(e0 e0Var) throws IOException {
        if (v(e0Var)) {
            return;
        }
        throw new IOException(e0Var + " doesn't exist.");
    }

    @Override // vh.k
    public j G(e0 e0Var) {
        rd.m.e(e0Var, "path");
        File file = e0Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new j(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // vh.k
    public i H(e0 e0Var) {
        rd.m.e(e0Var, "file");
        return new s(false, new RandomAccessFile(e0Var.toFile(), "r"));
    }

    @Override // vh.k
    public l0 T(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "file");
        if (z10) {
            h0(e0Var);
        }
        return a0.d(e0Var.toFile(), false, 1, null);
    }

    @Override // vh.k
    public n0 W(e0 e0Var) {
        rd.m.e(e0Var, "file");
        return z.i(e0Var.toFile());
    }

    @Override // vh.k
    public l0 c(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "file");
        if (z10) {
            p0(e0Var);
        }
        return z.d(e0Var.toFile(), true);
    }

    @Override // vh.k
    public void e(e0 e0Var, e0 e0Var2) throws IOException {
        rd.m.e(e0Var, "source");
        rd.m.e(e0Var2, "target");
        if (e0Var.toFile().renameTo(e0Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + e0Var + " to " + e0Var2);
    }

    @Override // vh.k
    public void n(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "dir");
        if (e0Var.toFile().mkdir()) {
            return;
        }
        j jVarG = G(e0Var);
        if (jVarG == null || !jVarG.e()) {
            throw new IOException("failed to create directory: " + e0Var);
        }
        if (z10) {
            throw new IOException(e0Var + " already exists.");
        }
    }

    @Override // vh.k
    public void s(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = e0Var.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + e0Var);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + e0Var);
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // vh.k
    public List w(e0 e0Var) throws IOException {
        rd.m.e(e0Var, "dir");
        List listX = X(e0Var, true);
        rd.m.b(listX);
        return listX;
    }
}
