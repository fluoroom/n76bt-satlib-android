package gj;

import gj.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public class f0 implements d {

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f14564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f14565b = new byte[4096];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14566c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14567d = 0;

        a(InputStream inputStream) {
            this.f14564a = inputStream;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int b() throws IOException {
            if (this.f14566c == this.f14567d) {
                this.f14566c = 0;
                int i10 = this.f14564a.read(this.f14565b);
                this.f14567d = i10;
                if (i10 == -1) {
                    return -1;
                }
            }
            byte[] bArr = this.f14565b;
            int i11 = this.f14566c;
            this.f14566c = i11 + 1;
            return bArr[i11] & MessagePack.Code.EXT_TIMESTAMP;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f14568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte f14569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f14570c;

        b(b bVar, byte b10) {
            this.f14568a = bVar;
            this.f14569b = b10;
            this.f14570c = bVar == null ? 0 : bVar.f14570c + 1;
        }

        public byte a(int i10) {
            return this.f14570c == i10 ? this.f14569b : this.f14568a.a(i10);
        }

        public int b() {
            return this.f14570c + 1;
        }
    }

    public static /* synthetic */ InputStream b(String str, h.b bVar) {
        return new c(str, new a(bVar.b()));
    }

    @Override // gj.d
    public h a(h hVar) {
        final String strA = hVar.a();
        final h.b bVarB = hVar.b();
        return strA.endsWith(".Z") ? new h(strA.substring(0, strA.length() - 2), new h.e() { // from class: gj.e0
            @Override // gj.h.e
            public final InputStream a() {
                return f0.b(strA, bVarB);
            }
        }) : hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f14571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f14572b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b[] f14573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f14575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f14576f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f14578h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f14579r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f14580s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14581t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private a f14582u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private b f14583v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private b f14584w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f14585x;

        c(String str, a aVar) throws IOException {
            this.f14571a = str;
            this.f14582u = aVar;
            if (aVar.b() != 31 || aVar.b() != 157) {
                throw new hj.a(hj.f.NOT_A_SUPPORTED_UNIX_COMPRESSED_FILE, str);
            }
            int iB = aVar.b();
            this.f14575e = (iB & 128) != 0;
            int i10 = iB & 31;
            this.f14576f = i10;
            this.f14573c = new b[1 << aj.d.C(9, i10)];
            for (int i11 = 0; i11 < 257; i11++) {
                this.f14573c[i11] = new b(null, (byte) i11);
            }
            a();
        }

        private void a() {
            this.f14574d = 257;
            this.f14579r = 0;
            this.f14580s = 0;
            this.f14581t = 0;
            this.f14577g = 9;
            this.f14578h = (1 << 9) - 1;
            this.f14583v = null;
            this.f14584w = null;
            this.f14585x = 0;
        }

        private int c() throws IOException {
            int i10;
            int i11 = this.f14577g;
            while (true) {
                int i12 = (1 << i11) - 1;
                i10 = this.f14580s & i12;
                for (int i13 = this.f14577g - this.f14581t; i13 > 0; i13 -= 8) {
                    int iB = this.f14582u.b();
                    this.f14580s = iB;
                    this.f14581t += 8;
                    if (iB < 0) {
                        if (i10 == 0 || i10 == i12) {
                            return -1;
                        }
                        throw new hj.b(hj.f.UNEXPECTED_END_OF_FILE, this.f14571a);
                    }
                    i10 = (i10 | (iB << (this.f14577g - i13))) & i12;
                }
                int i14 = this.f14581t;
                int i15 = this.f14577g;
                int i16 = i14 - i15;
                this.f14581t = i16;
                this.f14580s >>>= 8 - i16;
                int i17 = this.f14579r + i15;
                this.f14579r = i17;
                if (!this.f14575e || i10 != 256) {
                    break;
                }
                int i18 = i15 * 8;
                int i19 = ((i18 - 1) - (((i17 + i18) - 1) % i18)) / 8;
                while (true) {
                    int i20 = i19 - 1;
                    if (i19 > 0) {
                        this.f14582u.b();
                        i19 = i20;
                    }
                }
                b[] bVarArr = this.f14573c;
                Arrays.fill(bVarArr, 257, bVarArr.length, (Object) null);
                a();
                i11 = this.f14577g;
            }
            return i10;
        }

        private boolean e() throws IOException {
            byte bA;
            int i10;
            int iC = c();
            if (iC < 0) {
                return false;
            }
            b bVar = this.f14583v;
            if (bVar != null) {
                int i11 = this.f14574d;
                b[] bVarArr = this.f14573c;
                if (i11 < bVarArr.length) {
                    if (iC == i11) {
                        bA = bVar.a(0);
                    } else {
                        b bVar2 = bVarArr[iC];
                        if (bVar2 == null) {
                            throw new hj.b(hj.f.CORRUPTED_FILE, this.f14571a);
                        }
                        bA = bVar2.a(0);
                    }
                    b[] bVarArr2 = this.f14573c;
                    int i12 = this.f14574d;
                    this.f14574d = i12 + 1;
                    bVarArr2[i12] = new b(this.f14583v, bA);
                    if (this.f14574d > this.f14578h && (i10 = this.f14577g) < this.f14576f) {
                        int i13 = i10 + 1;
                        this.f14577g = i13;
                        this.f14578h = (1 << i13) - 1;
                    }
                }
            }
            b bVar3 = this.f14573c[iC];
            this.f14584w = bVar3;
            if (bVar3 == null) {
                throw new hj.b(hj.f.CORRUPTED_FILE, this.f14571a);
            }
            this.f14585x = 0;
            return true;
        }

        @Override // java.io.InputStream
        public int available() {
            b bVar = this.f14584w;
            if (bVar == null) {
                return 0;
            }
            return bVar.b() - this.f14585x;
        }

        @Override // java.io.InputStream
        public int read() {
            byte[] bArr = new byte[1];
            if (read(bArr, 0, 1) < 0) {
                return -1;
            }
            return bArr[0];
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (this.f14584w == null && (this.f14572b || !e())) {
                this.f14572b = true;
                return -1;
            }
            int iE = aj.d.E(i11, this.f14584w.b() - this.f14585x);
            for (int i12 = 0; i12 < iE; i12++) {
                b bVar = this.f14584w;
                int i13 = this.f14585x;
                this.f14585x = i13 + 1;
                bArr[i10 + i12] = bVar.a(i13);
            }
            if (this.f14585x >= this.f14584w.b()) {
                this.f14583v = this.f14584w;
                this.f14584w = null;
                this.f14585x = 0;
            }
            return iE;
        }
    }
}
