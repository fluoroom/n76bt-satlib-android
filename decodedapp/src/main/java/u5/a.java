package u5;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import w5.c;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f28164l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0394a f28166b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28168d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f28173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f28174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f28175k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f28167c = g.Disconnected;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f28170f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BlockingQueue f28171g = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w5.e f28172h = new w5.e(60000, 600);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Charset f28169e = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: u5.a$a, reason: collision with other inner class name */
    public static final class C0394a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f28177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f28178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f28179d;

        public C0394a(String str, String str2, String str3, Integer num) {
            this.f28176a = str;
            this.f28178c = str3;
            this.f28177b = str2;
            this.f28179d = num;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0394a.class == obj.getClass()) {
                C0394a c0394a = (C0394a) obj;
                if (this.f28176a.equals(c0394a.f28176a) && this.f28177b.equals(c0394a.f28177b) && this.f28178c.equals(c0394a.f28178c) && Objects.equals(this.f28179d, c0394a.f28179d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f28176a, this.f28177b, this.f28178c, this.f28179d);
        }

        public String toString() {
            return "Config{server='" + this.f28176a + "', user='" + this.f28177b + "', password='***', distanceFilter=" + this.f28179d + "}";
        }
    }

    public interface b {
        void b(w5.c cVar);
    }

    public interface c {
        void c(a aVar, g gVar);
    }

    private class d extends com.dw.util.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final InputStream f28180e;

        public d(InputStream inputStream) {
            super("IGate - Reader");
            this.f28180e = inputStream;
        }

        private boolean t(String str) {
            try {
                w5.c cVarT = w5.c.t(str);
                if (a.this.f28173i == null) {
                    return true;
                }
                a.this.f28173i.b(cVarT);
                return true;
            } catch (w5.g e10) {
                a.q("parse err:" + e10.getLocalizedMessage());
                e10.printStackTrace();
                return false;
            }
        }

        private void u(g gVar) {
            synchronized (a.this) {
                try {
                    if (a.this.f28175k != null && a.this.f28175k.f28186r == this) {
                        a.this.v(gVar);
                    }
                } finally {
                }
            }
        }

        @Override // com.dw.util.concurrent.a
        protected void doInBackground() {
            int i10;
            byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
            while (!isCancelled()) {
                try {
                    int i11 = 0;
                    do {
                        i10 = this.f28180e.read();
                        if (i10 == -1) {
                            throw new IOException("end of the stream");
                        }
                        a.this.f28170f.f28188a++;
                        if (i11 < 1024) {
                            bArr[i11] = (byte) i10;
                            i11++;
                        }
                    } while (i10 != 10);
                    if (i11 >= 2) {
                        int i12 = i11 - 1;
                        if (bArr[i12] == 10) {
                            bArr[i12] = 0;
                            i11--;
                        }
                    }
                    if (i11 >= 1) {
                        int i13 = i11 - 1;
                        if (bArr[i13] == 13) {
                            bArr[i13] = 0;
                            i11--;
                        }
                    }
                    if (i11 != 0) {
                        String str = new String(bArr, 0, i11, a.this.f28169e);
                        if (a.f28164l >= 2) {
                            a.q("[is>ig]" + str);
                        }
                        if (bArr[0] == 35) {
                            if (!str.contains("logresp")) {
                                continue;
                            } else if (str.contains("unverified")) {
                                u(g.ConnectionFailed);
                                this.f28180e.close();
                                return;
                            } else if (str.contains("verified")) {
                                u(g.Connected);
                            }
                        } else if (t(str)) {
                            u(g.Connected);
                        }
                    }
                } catch (IOException e10) {
                    a.q("err:" + e10.getLocalizedMessage());
                    e10.printStackTrace();
                    e eVar = a.this.f28175k;
                    if (eVar != null) {
                        eVar.v();
                        return;
                    }
                    return;
                }
            }
        }
    }

    private class e extends com.dw.util.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f28182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f28183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private OutputStream f28184g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Socket f28185h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private d f28186r;

        public e() {
            super("IGate - Sender");
            this.f28182e = new byte[WXMediaMessage.TITLE_LENGTH_LIMIT];
        }

        private void A(g gVar) {
            synchronized (a.this) {
                try {
                    if (a.this.f28175k != this) {
                        return;
                    }
                    a.this.v(gVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void v() {
            if (this.f28185h == null) {
                return;
            }
            a.q("unlink");
            try {
                this.f28185h.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            this.f28185h = null;
            this.f28186r = null;
        }

        private void x() {
            String str;
            try {
                A(g.Connecting);
                Socket socket = new Socket(a.this.f28165a, a.this.f28168d);
                this.f28185h = socket;
                a.q("link to:" + socket.getInetAddress().toString() + ":" + a.this.f28168d);
                this.f28184g = this.f28185h.getOutputStream();
                d dVar = a.this.new d(this.f28185h.getInputStream());
                this.f28186r = dVar;
                dVar.start();
                String str2 = String.format(Locale.ENGLISH, "user %s pass %s vers bs %d.%d", a.this.f28166b.f28177b, a.this.f28166b.f28178c, 0, 1);
                if (a.this.f28166b.f28179d != null) {
                    str = "m/" + a.this.f28166b.f28179d;
                } else {
                    str = null;
                }
                if (str != null) {
                    str2 = str2 + " filter " + str;
                }
                z(str2);
            } catch (Exception e10) {
                v();
                A(g.ConnectionFailed);
                a.this.n(e10, 10000L);
            }
        }

        private void y() {
            if (this.f28185h == null) {
                return;
            }
            while (!isCancelled()) {
                try {
                    try {
                        String str = (String) a.this.f28171g.poll(5L, TimeUnit.SECONDS);
                        if (str != null) {
                            z(str);
                        } else if (this.f28183f < System.nanoTime()) {
                            z("#");
                        }
                    } catch (InterruptedException e10) {
                        e10.printStackTrace();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    v();
                    return;
                }
            }
        }

        private void z(String str) throws IOException {
            if (this.f28184g == null) {
                return;
            }
            byte[] bytes = str.getBytes(a.this.f28169e);
            if (bytes.length > 510) {
                a.q("send to server(err msg to long):" + str);
                return;
            }
            int i10 = 0;
            while (i10 < bytes.length) {
                this.f28182e[i10] = bytes[i10];
                i10++;
            }
            byte[] bArr = this.f28182e;
            bArr[i10] = 13;
            bArr[i10 + 1] = 10;
            this.f28184g.write(bArr, 0, i10 + 2);
            this.f28183f = System.nanoTime() + 30000000000L;
            if (a.f28164l >= 2) {
                a.q("[ig>is]" + str);
            }
        }

        @Override // com.dw.util.concurrent.a
        protected void doInBackground() {
            while (!isCancelled()) {
                try {
                    x();
                    y();
                } finally {
                    v();
                    A(g.ConnectionFailed);
                }
            }
        }

        @Override // com.dw.util.concurrent.a
        protected void onCancel() {
            v();
            super.onCancel();
        }
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28188a;

        f() {
        }
    }

    public enum g {
        Disconnected,
        Connecting,
        ConnectionFailed,
        Connected
    }

    public a(C0394a c0394a) {
        this.f28166b = c0394a;
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Exception exc, long j10) {
        q(exc.getLocalizedMessage());
        exc.printStackTrace();
        try {
            Thread.sleep(j10);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
    }

    private synchronized void o() {
        String[] strArrSplit = this.f28166b.f28176a.split(":");
        this.f28165a = strArrSplit[0];
        if (strArrSplit.length > 1) {
            try {
                this.f28168d = Integer.parseInt(strArrSplit[1]);
            } catch (Exception unused) {
                this.f28168d = 14580;
            }
        } else {
            this.f28168d = 14580;
        }
        e eVar = this.f28175k;
        if (eVar == null) {
            return;
        }
        eVar.cancel();
        this.f28175k = null;
        w();
    }

    public static String p(String str) {
        int iIndexOf = str.indexOf(45);
        int i10 = 0;
        if (iIndexOf > 0) {
            str = str.substring(0, iIndexOf);
        }
        if (str.length() > 10) {
            str = str.substring(0, 10);
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length();
        int iCharAt = 29666;
        while (i10 < length) {
            int i11 = i10 + 1;
            iCharAt ^= (upperCase.charAt(i10) & 255) << 8;
            if (i11 < length) {
                i10 += 2;
                iCharAt ^= upperCase.charAt(i11) & 255;
            } else {
                i10 = i11;
            }
        }
        return String.valueOf(iCharAt & 32767);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(String str) {
        System.err.printf("IGate:%s\n", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void v(g gVar) {
        if (gVar == this.f28167c) {
            return;
        }
        this.f28167c = gVar;
        q("Status -> " + String.valueOf(gVar));
        c cVar = this.f28174j;
        if (cVar != null) {
            cVar.c(this, gVar);
        }
    }

    public synchronized void l() {
        e eVar = this.f28175k;
        this.f28175k = null;
        if (eVar != null) {
            eVar.cancel();
            v(g.Disconnected);
        }
    }

    public synchronized g m() {
        return this.f28167c;
    }

    public boolean r(w5.a aVar) {
        w5.c cVarC;
        c.a aVar2;
        if (this.f28175k == null || (cVarC = aVar.C()) == null) {
            return false;
        }
        if (this.f28172h.e(cVarC)) {
            if (f28164l >= 1) {
                q("重复数据");
            }
            return false;
        }
        ArrayList arrayListR = cVarC.r();
        for (int i10 = 0; i10 < arrayListR.size(); i10++) {
            aVar2 = (c.a) arrayListR.get(i10);
            String strJ = aVar2.j();
            strJ.getClass();
            switch (strJ) {
                case "NOGATE":
                case "RFONLY":
                case "TCPIP":
                case "TCPXX":
                    if (f28164l >= 1) {
                        q(String.format(Locale.ENGLISH, "Do not relay with %s in path.\n", aVar2.j()));
                    }
                    return false;
                default:
                    break;
            }
        }
        this.f28171g.add(aVar.b0(this.f28166b.f28177b));
        this.f28172h.b(cVarC);
        return true;
    }

    public void s(C0394a c0394a) {
        if (this.f28166b.equals(c0394a)) {
            return;
        }
        this.f28166b = c0394a;
        o();
    }

    public void t(b bVar) {
        this.f28173i = bVar;
    }

    public void u(c cVar) {
        this.f28174j = cVar;
    }

    public synchronized void w() {
        if (this.f28175k != null) {
            return;
        }
        e eVar = new e();
        this.f28175k = eVar;
        eVar.start();
    }
}
