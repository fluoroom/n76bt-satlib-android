package v2;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import e3.l;
import h2.a;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class a implements i2.j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C0402a f29484f = new C0402a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f29485g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f29487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f29488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0402a f29489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v2.b f29490e;

    /* JADX INFO: renamed from: v2.a$a, reason: collision with other inner class name */
    static class C0402a {
        C0402a() {
        }

        h2.a a(a.InterfaceC0210a interfaceC0210a, h2.c cVar, ByteBuffer byteBuffer, int i10) {
            return new h2.e(interfaceC0210a, cVar, byteBuffer, i10);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f29491a = l.f(0);

        b() {
        }

        synchronized h2.d a(ByteBuffer byteBuffer) {
            h2.d dVar;
            try {
                dVar = (h2.d) this.f29491a.poll();
                if (dVar == null) {
                    dVar = new h2.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return dVar.p(byteBuffer);
        }

        synchronized void b(h2.d dVar) {
            dVar.a();
            this.f29491a.offer(dVar);
        }
    }

    public a(Context context, List list, l2.d dVar, l2.b bVar) {
        this(context, list, dVar, bVar, f29485g, f29484f);
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, h2.d dVar, i2.h hVar) {
        StringBuilder sb2;
        long jB = e3.g.b();
        try {
            h2.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = hVar.c(i.f29531a) == i2.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                h2.a aVarA = this.f29489d.a(this.f29490e, cVarC, byteBuffer, e(cVarC, i10, i11));
                aVarA.e(config);
                aVarA.b();
                Bitmap bitmapA = aVarA.a();
                if (bitmapA == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder();
                    }
                    return null;
                }
                e eVar = new e(new c(this.f29486a, aVarA, q2.e.c(), i10, i11, bitmapA));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + e3.g.a(jB));
                }
                return eVar;
            }
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                return null;
            }
            sb2 = new StringBuilder();
            sb2.append("Decoded GIF from stream in ");
            sb2.append(e3.g.a(jB));
            Log.v("BufferGifDecoder", sb2.toString());
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + e3.g.a(jB));
            }
            throw th2;
        }
    }

    private static int e(h2.c cVar, int i10, int i11) {
        int iMin = Math.min(cVar.a() / i11, cVar.d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return iMax;
    }

    @Override // i2.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(ByteBuffer byteBuffer, int i10, int i11, i2.h hVar) {
        h2.d dVarA = this.f29488c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, dVarA, hVar);
        } finally {
            this.f29488c.b(dVarA);
        }
    }

    @Override // i2.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, i2.h hVar) {
        return !((Boolean) hVar.c(i.f29532b)).booleanValue() && com.bumptech.glide.load.a.g(this.f29487b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List list, l2.d dVar, l2.b bVar, b bVar2, C0402a c0402a) {
        this.f29486a = context.getApplicationContext();
        this.f29487b = list;
        this.f29489d = c0402a;
        this.f29490e = new v2.b(dVar, bVar);
        this.f29488c = bVar2;
    }
}
