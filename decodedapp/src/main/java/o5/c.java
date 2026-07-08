package o5;

import android.media.AudioRecord;
import android.media.audiofx.NoiseSuppressor;
import com.dw.ht.Cfg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static HashMap f23186g = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f23189c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioRecord f23190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private NoiseSuppressor f23192f;

    private c(int i10, int i11) {
        this.f23187a = i10;
        this.f23188b = i11;
    }

    public static synchronized c a(int i10, int i11) {
        c cVar;
        long j10 = (((long) i10) << 32) | ((long) i11);
        cVar = (c) f23186g.get(Long.valueOf(j10));
        if (cVar == null) {
            cVar = new c(i10, i11);
            f23186g.put(Long.valueOf(j10), cVar);
        }
        return cVar;
    }

    public int b(short[] sArr, int i10, int i11, Object obj) {
        b6.d dVar = (b6.d) obj;
        if (dVar.c() > 0) {
            return dVar.l(sArr, i10, i11);
        }
        synchronized (this) {
            try {
                if (dVar.c() > 0) {
                    return dVar.l(sArr, i10, i11);
                }
                int i12 = this.f23190d.read(sArr, i10, i11);
                if (i12 > 0) {
                    c4.a.a(sArr, i10, i12, 4);
                    for (b6.d dVar2 : this.f23189c) {
                        if (dVar2 != dVar && dVar2.o(sArr, i10, i12) != i12) {
                            s3.b.d("AudioRecordSplitter", "data lost");
                        }
                    }
                }
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized Object c() {
        b6.d dVar;
        try {
            if (this.f23190d == null) {
                this.f23191e = AudioRecord.getMinBufferSize(this.f23188b, 16, 2);
                s3.b.b("AudioRecordSplitter", String.format(Locale.getDefault(), "s%d 创建", Integer.valueOf(this.f23187a)));
                this.f23190d = new AudioRecord(this.f23187a, this.f23188b, 16, 2, this.f23191e);
                if (!Cfg.f5482d && NoiseSuppressor.isAvailable()) {
                    NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(this.f23190d.getAudioSessionId());
                    this.f23192f = noiseSuppressorCreate;
                    if (noiseSuppressorCreate != null) {
                        noiseSuppressorCreate.setEnabled(true);
                    }
                }
                this.f23190d.startRecording();
                s3.b.b("AudioRecordSplitter", String.format(Locale.getDefault(), "s%d 开始录音", Integer.valueOf(this.f23187a)));
            }
            dVar = new b6.d(this.f23191e * 4);
            this.f23189c.add(dVar);
            s3.b.b("AudioRecordSplitter", String.format(Locale.getDefault(), "s%d add client count:%d", Integer.valueOf(this.f23187a), Integer.valueOf(this.f23189c.size())));
        } catch (Throwable th2) {
            throw th2;
        }
        return dVar;
    }

    public synchronized void d(Object obj) {
        AudioRecord audioRecord;
        try {
            if (this.f23189c.remove(obj)) {
                s3.b.b("AudioRecordSplitter", String.format(Locale.getDefault(), "s%d remove client count:%d", Integer.valueOf(this.f23187a), Integer.valueOf(this.f23189c.size())));
            }
            if (this.f23189c.isEmpty() && (audioRecord = this.f23190d) != null) {
                try {
                    try {
                        audioRecord.stop();
                        this.f23190d.release();
                    } finally {
                    }
                    try {
                        NoiseSuppressor noiseSuppressor = this.f23192f;
                        if (noiseSuppressor != null) {
                            noiseSuppressor.release();
                        }
                    } catch (Throwable th2) {
                        s3.b.e("AudioRecordSplitter", "release ns", th2);
                    }
                    this.f23192f = null;
                    this.f23190d = null;
                    s3.b.b("AudioRecordSplitter", String.format(Locale.getDefault(), "s%d 停止录音并释放", Integer.valueOf(this.f23187a)));
                } catch (Throwable th3) {
                    this.f23192f = null;
                    this.f23190d = null;
                    s3.b.b("AudioRecordSplitter", String.format(Locale.getDefault(), "s%d 停止录音并释放", Integer.valueOf(this.f23187a)));
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
