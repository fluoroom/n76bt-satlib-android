package q2;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import i2.g;
import i2.h;
import i2.i;
import r2.a0;
import r2.m;
import r2.s;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: a */
    private final a0 f24283a = a0.b();

    /* JADX INFO: renamed from: b */
    private final int f24284b;

    /* JADX INFO: renamed from: c */
    private final int f24285c;

    /* JADX INFO: renamed from: d */
    private final i2.b f24286d;

    /* JADX INFO: renamed from: e */
    private final m f24287e;

    /* JADX INFO: renamed from: f */
    private final boolean f24288f;

    /* JADX INFO: renamed from: g */
    private final i f24289g;

    class a implements ImageDecoder.OnPartialImageListener {
        a() {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public c(int i10, int i11, h hVar) {
        this.f24284b = i10;
        this.f24285c = i11;
        this.f24286d = (i2.b) hVar.c(s.f25392f);
        this.f24287e = (m) hVar.c(m.f25387h);
        g gVar = s.f25396j;
        this.f24288f = hVar.c(gVar) != null && ((Boolean) hVar.c(gVar)).booleanValue();
        this.f24289g = (i) hVar.c(s.f25393g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f24283a.f(this.f24284b, this.f24285c, this.f24288f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f24286d == i2.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f24284b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f24285c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f24287e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        i iVar = this.f24289g;
        if (iVar != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((iVar == i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i10 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
