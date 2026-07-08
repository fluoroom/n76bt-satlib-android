package v4;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UsbDeviceConnection f29877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UsbEndpoint f29878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29879c;

    public h2(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint) {
        rd.m.e(usbDeviceConnection, "connection");
        rd.m.e(usbEndpoint, "endpoint");
        this.f29877a = usbDeviceConnection;
        this.f29878b = usbEndpoint;
        if (usbEndpoint.getDirection() != 0) {
            throw new InvalidParameterException("endpoint dir is not output");
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f29879c = true;
        super.close();
    }

    public final boolean isClosed() {
        return this.f29879c;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) (i10 & 255)});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        bArr.getClass();
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        if (i11 > 64) {
            s3.b.n("USBOutputStream", "write len:" + i11 + " > 64");
        }
        if (this.f29879c) {
            throw new IOException("output stream is closed");
        }
        int iBulkTransfer = this.f29877a.bulkTransfer(this.f29878b, bArr, i10, i11, CloseCodes.NORMAL_CLOSURE);
        if (iBulkTransfer == i11 || iBulkTransfer == 0) {
            return;
        }
        s3.b.b("USBOutputStream", "err:len:" + i11 + " r:" + iBulkTransfer);
        throw new IOException("write err:" + iBulkTransfer);
    }
}
