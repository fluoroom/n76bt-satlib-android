package tb;

import androidx.appcompat.widget.ActivityChooserView;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.msgpack.core.MessagePack;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes3.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final vh.h f27716a = vh.h.f(":");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d[] f27717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f27718c;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f27719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vh.g f27720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f27722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        d[] f27723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f27724f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f27725g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f27726h;

        a(int i10, n0 n0Var) {
            this(i10, i10, n0Var);
        }

        private void a() {
            int i10 = this.f27722d;
            int i11 = this.f27726h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f27723e, (Object) null);
            this.f27724f = this.f27723e.length - 1;
            this.f27725g = 0;
            this.f27726h = 0;
        }

        private int c(int i10) {
            return this.f27724f + 1 + i10;
        }

        private int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f27723e.length;
                while (true) {
                    length--;
                    i11 = this.f27724f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f27723e[length].f27710c;
                    i10 -= i13;
                    this.f27726h -= i13;
                    this.f27725g--;
                    i12++;
                }
                d[] dVarArr = this.f27723e;
                System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f27725g);
                this.f27724f += i12;
            }
            return i12;
        }

        private vh.h f(int i10) throws IOException {
            if (i(i10)) {
                return f.f27717b[i10].f27708a;
            }
            int iC = c(i10 - f.f27717b.length);
            if (iC >= 0) {
                d[] dVarArr = this.f27723e;
                if (iC < dVarArr.length) {
                    return dVarArr[iC].f27708a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void h(int i10, d dVar) {
            this.f27719a.add(dVar);
            int i11 = dVar.f27710c;
            if (i10 != -1) {
                i11 -= this.f27723e[c(i10)].f27710c;
            }
            int i12 = this.f27722d;
            if (i11 > i12) {
                b();
                return;
            }
            int iD = d((this.f27726h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f27725g + 1;
                d[] dVarArr = this.f27723e;
                if (i13 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f27724f = this.f27723e.length - 1;
                    this.f27723e = dVarArr2;
                }
                int i14 = this.f27724f;
                this.f27724f = i14 - 1;
                this.f27723e[i14] = dVar;
                this.f27725g++;
            } else {
                this.f27723e[i10 + c(i10) + iD] = dVar;
            }
            this.f27726h += i11;
        }

        private boolean i(int i10) {
            return i10 >= 0 && i10 <= f.f27717b.length - 1;
        }

        private int j() {
            return this.f27720b.readByte() & MessagePack.Code.EXT_TIMESTAMP;
        }

        private void m(int i10) throws IOException {
            if (i(i10)) {
                this.f27719a.add(f.f27717b[i10]);
                return;
            }
            int iC = c(i10 - f.f27717b.length);
            if (iC >= 0) {
                d[] dVarArr = this.f27723e;
                if (iC <= dVarArr.length - 1) {
                    this.f27719a.add(dVarArr[iC]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void o(int i10) {
            h(-1, new d(f(i10), k()));
        }

        private void p() {
            h(-1, new d(f.e(k()), k()));
        }

        private void q(int i10) throws IOException {
            this.f27719a.add(new d(f(i10), k()));
        }

        private void r() throws IOException {
            this.f27719a.add(new d(f.e(k()), k()));
        }

        public List e() {
            ArrayList arrayList = new ArrayList(this.f27719a);
            this.f27719a.clear();
            return arrayList;
        }

        void g(int i10) {
            this.f27721c = i10;
            this.f27722d = i10;
            a();
        }

        vh.h k() {
            int iJ = j();
            boolean z10 = (iJ & 128) == 128;
            int iN = n(iJ, 127);
            return z10 ? vh.h.G(h.f().c(this.f27720b.Y(iN))) : this.f27720b.p(iN);
        }

        void l() throws IOException {
            while (!this.f27720b.z()) {
                byte b10 = this.f27720b.readByte();
                int i10 = b10 & MessagePack.Code.EXT_TIMESTAMP;
                if (i10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b10 & 128) == 128) {
                    m(n(i10, 127) - 1);
                } else if (i10 == 64) {
                    p();
                } else if ((b10 & 64) == 64) {
                    o(n(i10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int iN = n(i10, 31);
                    this.f27722d = iN;
                    if (iN < 0 || iN > this.f27721c) {
                        throw new IOException("Invalid dynamic table size update " + this.f27722d);
                    }
                    a();
                } else if (i10 == 16 || i10 == 0) {
                    r();
                } else {
                    q(n(i10, 15) - 1);
                }
            }
        }

        int n(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iJ = j();
                if ((iJ & 128) == 0) {
                    return i11 + (iJ << i13);
                }
                i11 += (iJ & 127) << i13;
                i13 += 7;
            }
        }

        a(int i10, int i11, n0 n0Var) {
            this.f27719a = new ArrayList();
            this.f27723e = new d[8];
            this.f27724f = r0.length - 1;
            this.f27725g = 0;
            this.f27726h = 0;
            this.f27721c = i10;
            this.f27722d = i11;
            this.f27720b = z.c(n0Var);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vh.e f27727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f27730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f27731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f27732f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        d[] f27733g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f27734h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f27735i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f27736j;

        b(vh.e eVar) {
            this(4096, false, eVar);
        }

        private void a() {
            Arrays.fill(this.f27733g, (Object) null);
            this.f27735i = this.f27733g.length - 1;
            this.f27734h = 0;
            this.f27736j = 0;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f27733g.length;
                while (true) {
                    length--;
                    i11 = this.f27735i;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f27733g[length].f27710c;
                    i10 -= i13;
                    this.f27736j -= i13;
                    this.f27734h--;
                    i12++;
                }
                d[] dVarArr = this.f27733g;
                System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f27734h);
                this.f27735i += i12;
            }
            return i12;
        }

        private void c(d dVar) {
            int i10 = dVar.f27710c;
            int i11 = this.f27732f;
            if (i10 > i11) {
                a();
                return;
            }
            b((this.f27736j + i10) - i11);
            int i12 = this.f27734h + 1;
            d[] dVarArr = this.f27733g;
            if (i12 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f27735i = this.f27733g.length - 1;
                this.f27733g = dVarArr2;
            }
            int i13 = this.f27735i;
            this.f27735i = i13 - 1;
            this.f27733g[i13] = dVar;
            this.f27734h++;
            this.f27736j += i10;
        }

        void d(vh.h hVar) throws IOException {
            if (!this.f27728b || h.f().e(hVar.Y()) >= hVar.Q()) {
                f(hVar.Q(), 127, 0);
                this.f27727a.Z(hVar);
                return;
            }
            vh.e eVar = new vh.e();
            h.f().d(hVar.Y(), eVar.X());
            vh.h hVarQ = eVar.Q();
            f(hVarQ.Q(), 127, 128);
            this.f27727a.Z(hVarQ);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void e(java.util.List r14) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.f.b.e(java.util.List):void");
        }

        void f(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f27727a.writeByte(i10 | i12);
                return;
            }
            this.f27727a.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f27727a.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f27727a.writeByte(i13);
        }

        b(int i10, boolean z10, vh.e eVar) {
            this.f27730d = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f27733g = new d[8];
            this.f27735i = r0.length - 1;
            this.f27729c = i10;
            this.f27732f = i10;
            this.f27728b = z10;
            this.f27727a = eVar;
        }
    }

    static {
        d dVar = new d(d.f27705h, "");
        vh.h hVar = d.f27702e;
        d dVar2 = new d(hVar, "GET");
        d dVar3 = new d(hVar, "POST");
        vh.h hVar2 = d.f27703f;
        d dVar4 = new d(hVar2, "/");
        d dVar5 = new d(hVar2, "/index.html");
        vh.h hVar3 = d.f27704g;
        d dVar6 = new d(hVar3, "http");
        d dVar7 = new d(hVar3, "https");
        vh.h hVar4 = d.f27701d;
        f27717b = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(hVar4, "200"), new d(hVar4, "204"), new d(hVar4, "206"), new d(hVar4, "304"), new d(hVar4, "400"), new d(hVar4, "404"), new d(hVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f27718c = f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static vh.h e(vh.h hVar) throws IOException {
        int iQ = hVar.Q();
        for (int i10 = 0; i10 < iQ; i10++) {
            byte bH = hVar.h(i10);
            if (bH >= 65 && bH <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.Z());
            }
        }
        return hVar;
    }

    private static Map f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f27717b.length);
        int i10 = 0;
        while (true) {
            d[] dVarArr = f27717b;
            if (i10 >= dVarArr.length) {
                return DesugarCollections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i10].f27708a)) {
                linkedHashMap.put(dVarArr[i10].f27708a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}
