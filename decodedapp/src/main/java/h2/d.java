package h2;

import android.util.Log;
import androidx.appcompat.widget.ActivityChooserView;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f15088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f15089c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f15087a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15090d = 0;

    private boolean b() {
        return this.f15089c.f15075b != 0;
    }

    private int d() {
        try {
            return this.f15088b.get() & MessagePack.Code.EXT_TIMESTAMP;
        } catch (Exception unused) {
            this.f15089c.f15075b = 1;
            return 0;
        }
    }

    private void e() {
        this.f15089c.f15077d.f15063a = n();
        this.f15089c.f15077d.f15064b = n();
        this.f15089c.f15077d.f15065c = n();
        this.f15089c.f15077d.f15066d = n();
        int iD = d();
        boolean z10 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f15089c.f15077d;
        bVar.f15067e = (iD & 64) != 0;
        if (z10) {
            bVar.f15073k = g(iPow);
        } else {
            bVar.f15073k = null;
        }
        this.f15089c.f15077d.f15072j = this.f15088b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f15089c;
        cVar.f15076c++;
        cVar.f15078e.add(cVar.f15077d);
    }

    private void f() {
        int iD = d();
        this.f15090d = iD;
        if (iD <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f15090d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f15088b.get(this.f15087a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f15090d, e10);
                }
                this.f15089c.f15075b = 1;
                return;
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f15088b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & MessagePack.Code.EXT_TIMESTAMP;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & MessagePack.Code.EXT_TIMESTAMP;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & MessagePack.Code.EXT_TIMESTAMP);
                i11 = i16;
            }
            return iArr;
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f15089c.f15075b = 1;
            return iArr;
        }
    }

    private void h() {
        i(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f15089c.f15076c <= i10) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 == 1) {
                    q();
                } else if (iD2 == 249) {
                    this.f15089c.f15077d = new b();
                    j();
                } else if (iD2 == 254) {
                    q();
                } else if (iD2 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f15087a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (iD == 44) {
                c cVar = this.f15089c;
                if (cVar.f15077d == null) {
                    cVar.f15077d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f15089c.f15075b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f15089c.f15077d;
        int i10 = (iD & 28) >> 2;
        bVar.f15069g = i10;
        if (i10 == 0) {
            bVar.f15069g = 1;
        }
        bVar.f15068f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f15089c.f15077d;
        bVar2.f15071i = iN * 10;
        bVar2.f15070h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f15089c.f15075b = 1;
            return;
        }
        l();
        if (!this.f15089c.f15081h || b()) {
            return;
        }
        c cVar = this.f15089c;
        cVar.f15074a = g(cVar.f15082i);
        c cVar2 = this.f15089c;
        cVar2.f15085l = cVar2.f15074a[cVar2.f15083j];
    }

    private void l() {
        this.f15089c.f15079f = n();
        this.f15089c.f15080g = n();
        int iD = d();
        c cVar = this.f15089c;
        cVar.f15081h = (iD & 128) != 0;
        cVar.f15082i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f15089c.f15083j = d();
        this.f15089c.f15084k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f15087a;
            if (bArr[0] == 1) {
                this.f15089c.f15086m = ((bArr[2] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[1] & MessagePack.Code.EXT_TIMESTAMP);
            }
            if (this.f15090d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f15088b.getShort();
    }

    private void o() {
        this.f15088b = null;
        Arrays.fill(this.f15087a, (byte) 0);
        this.f15089c = new c();
        this.f15090d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f15088b.position(Math.min(this.f15088b.position() + iD, this.f15088b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f15088b = null;
        this.f15089c = null;
    }

    public c c() {
        if (this.f15088b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f15089c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f15089c;
            if (cVar.f15076c < 0) {
                cVar.f15075b = 1;
            }
        }
        return this.f15089c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f15088b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f15088b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
