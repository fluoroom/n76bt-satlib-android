package wb;

import com.google.protobuf.l1;
import com.google.protobuf.o;
import com.google.protobuf.z1;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import qb.p0;
import qb.x;

/* JADX INFO: loaded from: classes3.dex */
final class a extends InputStream implements x, p0 {

    /* JADX INFO: renamed from: a */
    private l1 f31376a;

    /* JADX INFO: renamed from: b */
    private final z1 f31377b;

    /* JADX INFO: renamed from: c */
    private ByteArrayInputStream f31378c;

    a(l1 l1Var, z1 z1Var) {
        this.f31376a = l1Var;
        this.f31377b = z1Var;
    }

    @Override // qb.x
    public int a(OutputStream outputStream) {
        l1 l1Var = this.f31376a;
        if (l1Var != null) {
            int serializedSize = l1Var.getSerializedSize();
            this.f31376a.writeTo(outputStream);
            this.f31376a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.f31378c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int iA = (int) b.a(byteArrayInputStream, outputStream);
        this.f31378c = null;
        return iA;
    }

    @Override // java.io.InputStream
    public int available() {
        l1 l1Var = this.f31376a;
        if (l1Var != null) {
            return l1Var.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f31378c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    l1 c() {
        l1 l1Var = this.f31376a;
        if (l1Var != null) {
            return l1Var;
        }
        throw new IllegalStateException("message not available");
    }

    z1 e() {
        return this.f31377b;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f31376a != null) {
            this.f31378c = new ByteArrayInputStream(this.f31376a.toByteArray());
            this.f31376a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f31378c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        l1 l1Var = this.f31376a;
        if (l1Var != null) {
            int serializedSize = l1Var.getSerializedSize();
            if (serializedSize == 0) {
                this.f31376a = null;
                this.f31378c = null;
                return -1;
            }
            if (i11 >= serializedSize) {
                o oVarJ0 = o.j0(bArr, i10, serializedSize);
                this.f31376a.writeTo(oVarJ0);
                oVarJ0.d0();
                oVarJ0.d();
                this.f31376a = null;
                this.f31378c = null;
                return serializedSize;
            }
            this.f31378c = new ByteArrayInputStream(this.f31376a.toByteArray());
            this.f31376a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f31378c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}
