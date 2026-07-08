package m5;

import android.os.SystemClock;
import com.dw.ht.Cfg;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import v4.y;

/* JADX INFO: loaded from: classes.dex */
public class i extends com.dw.util.concurrent.a implements y.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b6.c f21742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f21743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private File f21744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private x3.b f21745h;

    public i() {
        super("Opus save");
        this.f21742e = new b6.c(new byte[100][]);
    }

    @Override // v4.y.a
    public void discard() {
        cancel();
    }

    @Override // com.dw.util.concurrent.a
    protected void doInBackground() {
        while (!isCancelled()) {
            this.f21742e.i(1, 100L);
            byte[] bArr = (byte[]) this.f21742e.m();
            if (bArr != null) {
                try {
                    this.f21745h.a(new ii.a(bArr));
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    @Override // com.dw.util.concurrent.a
    protected boolean onInit() {
        File file;
        if (Cfg.f5504o == null) {
            return false;
        }
        do {
            file = new File(Cfg.f5504o, "/tmp-" + SystemClock.elapsedRealtimeNanos() + ".opus");
            this.f21744g = file;
        } while (file.exists());
        this.f21744g.getParentFile().mkdirs();
        try {
            x3.b bVar = new x3.b(new FileOutputStream(this.f21744g), 1, Cfg.f5494j);
            this.f21745h = bVar;
            bVar.c();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return this.f21745h != null;
    }

    @Override // com.dw.util.concurrent.a
    protected void onStop() {
        x3.b bVar = this.f21745h;
        if (bVar != null) {
            try {
                bVar.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            File file = this.f21743f;
            if (file != null) {
                file.getParentFile().mkdirs();
                this.f21744g.renameTo(this.f21743f);
            } else {
                this.f21744g.delete();
            }
        }
        super.onStop();
    }

    @Override // v4.y.a
    public void r(long j10) {
        this.f21743f = Cfg.n(j10);
        cancel();
    }

    public void t(byte[] bArr, int i10, int i11) {
        try {
            this.f21742e.h(1, 100L);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        this.f21742e.n(Arrays.copyOfRange(bArr, i10, i11));
    }
}
