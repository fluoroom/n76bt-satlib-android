package f4;

import java.io.OutputStream;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PrintStream f12785f;

    public c(OutputStream outputStream) {
        this.f12785f = new PrintStream(outputStream, false, "utf-8");
    }

    public void g(String[] strArr) {
        this.f12785f.append((CharSequence) e(strArr, strArr.length));
    }
}
