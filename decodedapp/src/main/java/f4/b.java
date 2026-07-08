package f4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class b extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BufferedReader f12784f;

    public b(InputStream inputStream) {
        this.f12784f = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("utf-8")));
    }

    public String[] g() throws IOException {
        String line = this.f12784f.readLine();
        if (line == null) {
            return null;
        }
        while (!c(line)) {
            String line2 = this.f12784f.readLine();
            if (line2 == null) {
                return null;
            }
            line = line + "\n" + line2;
        }
        return d(line);
    }
}
