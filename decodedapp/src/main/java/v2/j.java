package v2;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k2.v;

/* JADX INFO: loaded from: classes.dex */
public class j implements i2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i2.j f29534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l2.b f29535c;

    public j(List list, i2.j jVar, l2.b bVar) {
        this.f29533a = list;
        this.f29534b = jVar;
        this.f29535c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // i2.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(InputStream inputStream, int i10, int i11, i2.h hVar) {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f29534b.b(ByteBuffer.wrap(bArrE), i10, i11, hVar);
    }

    @Override // i2.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, i2.h hVar) {
        return !((Boolean) hVar.c(i.f29532b)).booleanValue() && com.bumptech.glide.load.a.f(this.f29533a, inputStream, this.f29535c) == ImageHeaderParser.ImageType.GIF;
    }
}
