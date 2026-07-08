package q7;

import com.facebook.stetho.server.http.HttpHeaders;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y7.a f24382c = new y7.a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u7.s f24384b = new u7.s(null);

    public f(String str) {
        this.f24383a = v7.q.f(str);
    }

    public static t7.h a(String str) {
        if (str == null) {
            return t7.i.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.f24384b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f7194h;
        try {
            String str = this.f24383a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
            sb2.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb2.append(str);
            URL url = new URL(sb2.toString());
            int i10 = g8.m.f13702a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f7192f;
            } else {
                f24382c.b("Unable to revoke access!", new Object[0]);
            }
            y7.a aVar = f24382c;
            StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb3.append("Response Code: ");
            sb3.append(responseCode);
            aVar.a(sb3.toString(), new Object[0]);
        } catch (IOException e10) {
            f24382c.b("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f24382c.b("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f24384b.f(status);
    }
}
