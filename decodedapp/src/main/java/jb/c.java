package jb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b implements Handler.Callback {

    /* JADX INFO: renamed from: d */
    private d f18589d;

    /* JADX INFO: renamed from: e */
    private FileWriter f18590e;

    /* JADX INFO: renamed from: f */
    private File f18591f;

    /* JADX INFO: renamed from: g */
    private char[] f18592g;

    /* JADX INFO: renamed from: h */
    private volatile h f18593h;

    /* JADX INFO: renamed from: r */
    private volatile h f18594r;

    /* JADX INFO: renamed from: s */
    private volatile h f18595s;

    /* JADX INFO: renamed from: t */
    private volatile h f18596t;

    /* JADX INFO: renamed from: u */
    private volatile boolean f18597u;

    /* JADX INFO: renamed from: v */
    private HandlerThread f18598v;

    /* JADX INFO: renamed from: w */
    private Handler f18599w;

    public c(d dVar) {
        this(e.f18610b, true, i.f18627a, dVar);
    }

    private void i(File file) {
        File[] fileArrListFiles;
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists() || !parentFile.isDirectory() || (fileArrListFiles = parentFile.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (l(file2)) {
                String name = file2.getName();
                if (d.b(System.currentTimeMillis() - (lb.b.f20532c ? 3600000L : 259200000L)).compareTo(name.substring(32, 43)) > 0) {
                    a.d("FileTracer", "delete name=" + name + ", success=" + file2.delete());
                }
            }
        }
    }

    private void j(String str) {
        this.f18595s.c(str);
        if (this.f18595s.b() >= m().i()) {
            h();
        }
    }

    private boolean l(File file) {
        if (file == null) {
            return false;
        }
        String name = file.getName();
        a.d("FileTracer", "name=" + name);
        return !TextUtils.isEmpty(name) && name.length() == 47 && name.startsWith("com.tencent.mobileqq_connectSdk.") && name.endsWith(".log");
    }

    private void n() {
        if (Thread.currentThread() == this.f18598v && !this.f18597u) {
            this.f18597u = true;
            q();
            try {
                try {
                    this.f18596t.d(o(), this.f18592g);
                } catch (IOException e10) {
                    a.g("FileTracer", "flushBuffer exception", e10);
                }
                this.f18597u = false;
            } finally {
                this.f18596t.e();
            }
        }
    }

    private Writer o() {
        File fileA = m().a();
        if (fileA != null && (!fileA.equals(this.f18591f) || this.f18590e == null)) {
            this.f18591f = fileA;
            p();
            try {
                this.f18590e = new FileWriter(this.f18591f, true);
            } catch (IOException unused) {
                this.f18590e = null;
                a.f("openSDK_LOG", "-->obtainFileWriter() app specific file permission denied");
            }
            i(fileA);
        }
        return this.f18590e;
    }

    private void p() {
        try {
            FileWriter fileWriter = this.f18590e;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f18590e.close();
            }
        } catch (IOException e10) {
            a.g("openSDK_LOG", "-->closeAppSpecificFileWriter() exception:", e10);
        }
    }

    private void q() {
        synchronized (this) {
            try {
                if (this.f18595s == this.f18593h) {
                    this.f18595s = this.f18594r;
                    this.f18596t = this.f18593h;
                } else {
                    this.f18595s = this.f18593h;
                    this.f18596t = this.f18594r;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // jb.b
    protected void f(int i10, Thread thread, long j10, String str, String str2, Throwable th2) {
        j(g().b(i10, thread, j10, str, str2, th2));
    }

    public void h() {
        if (this.f18599w.hasMessages(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT)) {
            this.f18599w.removeMessages(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
        }
        this.f18599w.sendEmptyMessage(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1024) {
            return true;
        }
        n();
        return true;
    }

    public void k(d dVar) {
        this.f18589d = dVar;
    }

    public d m() {
        return this.f18589d;
    }

    public c(int i10, boolean z10, i iVar, d dVar) {
        super(i10, z10, iVar);
        this.f18597u = false;
        k(dVar);
        this.f18593h = new h();
        this.f18594r = new h();
        this.f18595s = this.f18593h;
        this.f18596t = this.f18594r;
        this.f18592g = new char[dVar.i()];
        HandlerThread handlerThread = new HandlerThread(dVar.e(), dVar.m());
        this.f18598v = handlerThread;
        handlerThread.start();
        if (!this.f18598v.isAlive() || this.f18598v.getLooper() == null) {
            return;
        }
        this.f18599w = new Handler(this.f18598v.getLooper(), this);
    }
}
