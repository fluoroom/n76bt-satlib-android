package vh;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public interface g extends n0, ReadableByteChannel {
    long B(l0 l0Var);

    long E();

    String F(long j10);

    String K(Charset charset);

    h Q();

    String U();

    int V();

    byte[] Y(long j10);

    short b0();

    long d0();

    e h();

    void l0(long j10);

    String o(long j10);

    int o0(c0 c0Var);

    h p(long j10);

    long q0();

    byte readByte();

    int readInt();

    short readShort();

    InputStream s0();

    void skip(long j10);

    byte[] y();

    boolean z();
}
