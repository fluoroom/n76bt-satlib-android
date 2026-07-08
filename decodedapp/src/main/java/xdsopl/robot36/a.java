package xdsopl.robot36;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioRecord;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    private final Allocation A;
    private final pk.a B;
    private final Thread C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f31998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageView f31999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f32000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f32001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f32002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final short[] f32003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f32004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f32005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f32006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int[] f32007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f32008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float[] f32009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f32010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f32011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f32012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final RenderScript f32013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Allocation f32014t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Allocation f32015u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Allocation f32016v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Allocation f32017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Allocation f32018x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Allocation f32019y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Allocation f32020z;

    /* JADX INFO: renamed from: xdsopl.robot36.a$a, reason: collision with other inner class name */
    class C0434a extends Thread {
        C0434a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (this) {
                    try {
                        if (a.this.f31996b) {
                            return;
                        }
                        if (a.this.f31995a) {
                            ImageView imageView = a.this.f31999e;
                            if (imageView != null) {
                                imageView.b();
                            }
                            if (a.this.f31997c) {
                                a.e(a.this);
                                a.f(a.this);
                                a.g(a.this);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                a.this.h();
            }
        }
    }

    public interface b {
        void a(boolean z10, int i10);

        void b(Bitmap bitmap, boolean z10);
    }

    public interface c extends Closeable {
        int P(short[] sArr, int i10, int i11);

        int j();
    }

    private static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int[] f32022c = {44100, 48000, 22050, 16000, 11025, 8000};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f32023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioRecord f32024b;

        d() {
            AudioRecord audioRecord;
            int i10;
            int[] iArr = f32022c;
            int length = iArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    audioRecord = null;
                    i10 = -1;
                    break;
                }
                i10 = iArr[i11];
                if (AudioRecord.getMinBufferSize(i10, 16, 2) > 0) {
                    try {
                        audioRecord = new AudioRecord(1, i10, 16, 2, i10 * 2);
                        if (audioRecord.getState() == 1) {
                            break;
                        } else {
                            audioRecord.release();
                        }
                    } catch (IllegalArgumentException unused) {
                        continue;
                    }
                }
                i11++;
            }
            if (audioRecord == null) {
                throw new RuntimeException("Unable to open audio.\nPlease send a bug report.");
            }
            this.f32023a = i10;
            this.f32024b = audioRecord;
            audioRecord.startRecording();
            if (audioRecord.getRecordingState() == 3) {
                return;
            }
            audioRecord.stop();
            audioRecord.release();
            throw new RuntimeException("Unable to start recording.\nMaybe another app is recording?");
        }

        @Override // xdsopl.robot36.a.c
        public int P(short[] sArr, int i10, int i11) {
            return this.f32024b.read(sArr, i10, i11);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f32024b.stop();
            this.f32024b.release();
        }

        @Override // xdsopl.robot36.a.c
        public int j() {
            return this.f32023a;
        }
    }

    public a(Context context, b bVar, c cVar) {
        this(context, bVar, cVar, null, null, null);
    }

    static /* synthetic */ pk.b e(a aVar) {
        aVar.getClass();
        return null;
    }

    static /* synthetic */ pk.b f(a aVar) {
        aVar.getClass();
        return null;
    }

    static /* synthetic */ pk.c g(a aVar) {
        aVar.getClass();
        return null;
    }

    private void n() {
        int[] iArr = this.f32007m;
        if (iArr[3] <= 0 || iArr[2] <= 0) {
            return;
        }
        this.f32020z.copyTo(this.f32008n);
        b bVar = this.f31998d;
        int[] iArr2 = this.f32008n;
        int[] iArr3 = this.f32007m;
        bVar.b(Bitmap.createBitmap(iArr2, iArr3[2], iArr3[3], Bitmap.Config.ARGB_8888), this.f32011q);
    }

    private void q(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        switch (this.f32012r) {
            case 0:
                imageView.d(800, this.f32001g);
                break;
            case 1:
                imageView.d(320, k(240));
                break;
            case 2:
                imageView.d(320, k(240));
                break;
            case 3:
                imageView.d(320, k(256));
                break;
            case 4:
                imageView.d(320, k(256));
                break;
            case 5:
                imageView.d(320, k(256));
                break;
            case 6:
                imageView.d(320, k(256));
                break;
            case 7:
                imageView.d(320, k(256));
                break;
            case 8:
                imageView.d(320, k(256));
                break;
            case 9:
                imageView.d(320, k(256));
                break;
            case 10:
                imageView.d(320, k(256));
                break;
            case 11:
                imageView.d(640, k(496));
                break;
            case 12:
                imageView.d(WXMediaMessage.TITLE_LENGTH_LIMIT, k(400));
                break;
            case 13:
                imageView.d(640, k(496));
                break;
            case 14:
                imageView.d(640, k(496));
                break;
            case 15:
                imageView.d(800, k(616));
                break;
        }
    }

    void h() {
        c cVar = this.f32000f;
        short[] sArr = this.f32003i;
        int iP = cVar.P(sArr, 0, sArr.length >> this.f32010p);
        if (iP <= 0) {
            return;
        }
        this.f32014t.copyFrom(this.f32003i);
        this.B.g(iP);
        synchronized (this.f32007m) {
            this.f32019y.copyTo(this.f32007m);
            int[] iArr = this.f32007m;
            boolean z10 = true;
            if (iArr[1] != 0) {
                z10 = false;
            }
            p(z10, iArr[0]);
            n();
        }
        ImageView imageView = this.f31999e;
        if (imageView != null) {
            this.f32015u.copyTo(this.f32004j);
            imageView.setPixels(this.f32004j);
        }
    }

    public void i() {
        synchronized (this.C) {
            this.f31996b = true;
        }
        try {
            this.f32000f.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        try {
            this.C.join();
        } catch (InterruptedException unused) {
        }
    }

    void j(boolean z10) {
        pk.a aVar = this.B;
        this.f31997c = false;
        aVar.h(0);
    }

    int k(int i10) {
        return this.f32011q ? i10 : (i10 * 3) / 2;
    }

    public boolean l() {
        return this.f32011q;
    }

    public void m() {
        if (this.f32011q) {
            synchronized (this.f32007m) {
                this.B.j();
                this.f32019y.copyTo(this.f32007m);
                p(false, this.f32012r);
                n();
            }
        }
    }

    public void o(ImageView imageView) {
        q(imageView);
        this.f31999e = imageView;
    }

    void p(boolean z10, int i10) {
        if (this.f32012r == i10 && this.f32011q == z10) {
            return;
        }
        this.f32011q = z10;
        this.f32012r = i10;
        this.f31998d.a(z10, i10);
        q(this.f31999e);
    }

    public a(Context context, b bVar, c cVar, pk.b bVar2, pk.b bVar3, pk.c cVar2) {
        this.f31995a = true;
        this.f31996b = false;
        this.f31997c = true;
        int iK = k(616);
        this.f32001g = iK;
        this.f32002h = 800;
        this.f32010p = 1;
        this.f32012r = -1;
        C0434a c0434a = new C0434a();
        this.C = c0434a;
        Context applicationContext = context.getApplicationContext();
        this.f31998d = bVar;
        cVar = cVar == null ? new d() : cVar;
        this.f32000f = cVar;
        short[] sArr = new short[cVar.j()];
        this.f32003i = sArr;
        int[] iArr = new int[iK * 800];
        this.f32004j = iArr;
        this.f32005k = null;
        this.f32006l = null;
        int iJ = cVar.j() * 2;
        int iHighestOneBit = Integer.highestOneBit(iJ);
        int i10 = iJ > iHighestOneBit ? iHighestOneBit << 1 : iHighestOneBit;
        this.f32007m = new int[4];
        this.f32009o = new float[1];
        int[] iArr2 = new int[iArr.length];
        this.f32008n = iArr2;
        RenderScript renderScriptCreate = RenderScript.create(applicationContext);
        this.f32013s = renderScriptCreate;
        Allocation allocationCreateSized = Allocation.createSized(renderScriptCreate, Element.I16(renderScriptCreate), sArr.length, 129);
        this.f32014t = allocationCreateSized;
        Allocation allocationCreateSized2 = Allocation.createSized(renderScriptCreate, Element.U8(renderScriptCreate), i10, 1);
        this.f32018x = allocationCreateSized2;
        Allocation allocationCreateSized3 = Allocation.createSized(renderScriptCreate, Element.I32(renderScriptCreate), iArr.length, 129);
        this.f32015u = allocationCreateSized3;
        this.f32016v = null;
        this.f32017w = null;
        Allocation allocationCreateSized4 = Allocation.createSized(renderScriptCreate, Element.I32(renderScriptCreate), 4, 129);
        this.f32019y = allocationCreateSized4;
        Allocation allocationCreateSized5 = Allocation.createSized(renderScriptCreate, Element.F32(renderScriptCreate), 1, 129);
        this.A = allocationCreateSized5;
        Allocation allocationCreateSized6 = Allocation.createSized(renderScriptCreate, Element.I32(renderScriptCreate), iArr2.length, 129);
        this.f32020z = allocationCreateSized6;
        pk.a aVar = new pk.a(renderScriptCreate);
        this.B = aVar;
        aVar.a(allocationCreateSized);
        aVar.e(allocationCreateSized2);
        aVar.b(allocationCreateSized3);
        aVar.d(allocationCreateSized4);
        aVar.f(allocationCreateSized5);
        aVar.c(allocationCreateSized6);
        aVar.i(cVar.j(), i10, 800, iK, 0, 0, 0, 0);
        j(false);
        c0434a.start();
    }
}
