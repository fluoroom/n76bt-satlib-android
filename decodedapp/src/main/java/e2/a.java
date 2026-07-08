package e2;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f11342c = "a";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f11343d = {MessagePack.Code.UINT8, -86, 85, -18, 18, 25, -28};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f11344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f11345b = 0;

    public a() {
    }

    private byte[] k(byte b10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put(b10);
        byteBufferAllocate.put((byte) 0);
        return byteBufferAllocate.array();
    }

    public byte[] a() {
        return k((byte) 6);
    }

    public byte[] b() {
        return k((byte) 4);
    }

    public byte[] c() {
        return k((byte) 3);
    }

    public byte[] d() {
        return k((byte) 1);
    }

    public byte[] e() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(-110);
        byte b10 = this.f11345b;
        this.f11345b = (byte) (b10 + 1);
        byteArrayOutputStream.write(b10);
        try {
            byteArrayOutputStream.write(d());
            byteArrayOutputStream.write(c());
            byteArrayOutputStream.write(b());
            byteArrayOutputStream.write(a());
        } catch (Exception e10) {
            Log.e(f11342c, "Failed to generate Command", e10);
            e10.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] f(int i10, byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(9).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put((byte) -111);
        byte b10 = this.f11345b;
        this.f11345b = (byte) (b10 + 1);
        byteBufferOrder.put(b10);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.putShort((short) i10);
        if (bArr != null) {
            byteBufferOrder.put(bArr, 0, 4);
        } else {
            byteBufferOrder.putInt(-1);
        }
        return byteBufferOrder.array();
    }

    public byte[] g() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
        byteBufferAllocate.put((byte) -111);
        byte b10 = this.f11345b;
        this.f11345b = (byte) (b10 + 1);
        byteBufferAllocate.put(b10);
        byteBufferAllocate.put((byte) 1);
        return byteBufferAllocate.array();
    }

    public byte[] h() {
        return f11343d;
    }

    public byte[] i() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(517).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put((byte) 32);
        byte b10 = this.f11345b;
        this.f11345b = (byte) (b10 + 1);
        byteBufferOrder.put(b10);
        byteBufferOrder.put(this.f11344a.a(byteBufferOrder.position()));
        byte[] bArr = new byte[byteBufferOrder.position()];
        byteBufferOrder.rewind();
        byteBufferOrder.get(bArr);
        return bArr;
    }

    public byte[] j() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(517).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(MessagePack.Code.FIXSTR_PREFIX);
        byte b10 = this.f11345b;
        this.f11345b = (byte) (b10 + 1);
        byteBufferOrder.put(b10);
        byteBufferOrder.putInt(this.f11344a.e());
        byteBufferOrder.putInt(this.f11344a.g());
        byteBufferOrder.put(this.f11344a.f(byteBufferOrder.position()));
        byte[] bArr = new byte[byteBufferOrder.position()];
        byteBufferOrder.rewind();
        byteBufferOrder.get(bArr);
        return bArr;
    }

    public void l() {
        Log.d(f11342c, "Reset CommandGenerator");
        this.f11345b = (byte) 0;
    }

    public void m(b bVar) {
        this.f11344a = bVar;
    }

    public a(b bVar) {
        this.f11344a = bVar;
    }
}
