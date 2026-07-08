package ai;

import java.io.BufferedOutputStream;

/* JADX INFO: loaded from: classes3.dex */
class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BufferedOutputStream f626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f628e;

    c(d dVar, double d10) {
        this.f625b = dVar;
        this.f624a = d10;
    }

    private void a() {
        try {
            this.f626c = new BufferedOutputStream(this.f625b.d());
        } catch (Exception unused) {
        }
    }

    private void b(int i10) {
        while (true) {
            try {
                int i11 = this.f628e;
                this.f628e = i11 + 1;
                if (i11 >= i10) {
                    return;
                } else {
                    this.f626c.write(d((short) 0));
                }
            } catch (Exception unused) {
                return;
            }
        }
    }

    private byte[] c(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255)};
    }

    private byte[] d(short s10) {
        return new byte[]{(byte) (s10 & 255), (byte) ((s10 >> 8) & 255)};
    }

    private void e() {
        try {
            int i10 = this.f627d * 2;
            this.f626c.write("RIFF".getBytes());
            this.f626c.write(c(i10 + 36));
            this.f626c.write("WAVE".getBytes());
            this.f626c.write("fmt ".getBytes());
            this.f626c.write(c(16));
            this.f626c.write(d((short) 1));
            this.f626c.write(d((short) 1));
            this.f626c.write(c((int) this.f624a));
            this.f626c.write(c(((int) this.f624a) * 2));
            this.f626c.write(d((short) 2));
            this.f626c.write(d((short) 16));
            this.f626c.write("data".getBytes());
            this.f626c.write(c(i10));
        } catch (Exception unused) {
        }
    }

    @Override // ai.a
    public double j() {
        return this.f624a;
    }

    @Override // ai.a
    public void k(boolean z10) {
        if (!z10) {
            b(this.f627d);
        }
        try {
            this.f626c.close();
            this.f626c = null;
        } catch (Exception unused) {
        }
        if (z10) {
            this.f625b.a();
        }
    }

    @Override // ai.a
    public void l(int i10) {
        int i11 = (int) ((this.f624a * 0.01d) / 2.0d);
        this.f627d = i10 + (i11 * 2);
        this.f628e = 0;
        a();
        e();
        b(i11);
    }

    @Override // ai.a
    public void p(double d10) {
        short s10 = (short) (d10 * 32767.0d);
        this.f628e++;
        try {
            this.f626c.write(d(s10));
        } catch (Exception unused) {
        }
    }
}
