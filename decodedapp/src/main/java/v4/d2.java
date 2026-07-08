package v4;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UsbDeviceConnection f29842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UsbEndpoint f29843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29844c;

    public d2(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint) {
        rd.m.e(usbDeviceConnection, "connection");
        rd.m.e(usbEndpoint, "endpoint");
        this.f29842a = usbDeviceConnection;
        this.f29843b = usbEndpoint;
        if (usbEndpoint.getDirection() != 128) {
            throw new InvalidParameterException("endpoint dir is not input");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f29844c = true;
        super.close();
    }

    public final boolean isClosed() {
        return this.f29844c;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10;
        byte[] bArr = new byte[1];
        do {
            i10 = read(bArr);
            if (i10 == 1) {
                return bArr[0] & MessagePack.Code.EXT_TIMESTAMP;
            }
        } while (i10 >= 0);
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        while (!this.f29844c) {
            byte[] bArr2 = bArr;
            int i12 = i10;
            int i13 = i11;
            int iBulkTransfer = this.f29842a.bulkTransfer(this.f29843b, bArr2, i12, i13, 100);
            if (iBulkTransfer > 0) {
                return iBulkTransfer;
            }
            if (iBulkTransfer != 0 && this.f29842a.getFileDescriptor() == 0) {
                s3.b.d("USBInputStream", "fileDescriptor==0");
                return -1;
            }
            bArr = bArr2;
            i10 = i12;
            i11 = i13;
        }
        throw new IOException("input stream is closed");
    }
}
