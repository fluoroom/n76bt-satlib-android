package vh;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends l0, WritableByteChannel {
    f D();

    f J(String str);

    f M(String str, int i10, int i11);

    f O(long j10);

    f Z(h hVar);

    @Override // vh.l0, java.io.Flushable
    void flush();

    e h();

    f n0(long j10);

    f t(int i10);

    f write(byte[] bArr);

    f write(byte[] bArr, int i10, int i11);

    f writeByte(int i10);

    f writeInt(int i10);

    f writeShort(int i10);
}
