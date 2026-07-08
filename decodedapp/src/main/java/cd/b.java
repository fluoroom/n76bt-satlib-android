package cd;

import java.net.InetSocketAddress;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f4546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected LinkedList f4547b;

    protected b() {
        this.f4546a = 0;
        this.f4547b = new LinkedList();
    }

    protected void a(p pVar) {
        int i10 = pVar.f4653a;
        if (i10 == 0) {
            this.f4547b.add(pVar);
        } else {
            this.f4546a = i10;
        }
    }

    protected byte[] b() {
        int length;
        ListIterator listIterator = this.f4547b.listIterator();
        byte[] bArr = new byte[1500];
        int i10 = 0;
        while (listIterator.hasNext()) {
            p pVar = (p) listIterator.next();
            int i11 = pVar.f4657e;
            if (i11 == 200) {
                w wVar = (w) pVar;
                wVar.c();
                byte[] bArr2 = wVar.f4660h;
                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                length = wVar.f4660h.length;
            } else if (i11 == 201) {
                t tVar = (t) pVar;
                tVar.c();
                byte[] bArr3 = tVar.f4660h;
                System.arraycopy(bArr3, 0, bArr, i10, bArr3.length);
                length = tVar.f4660h.length;
            } else if (i11 == 202) {
                v vVar = (v) pVar;
                vVar.c();
                byte[] bArr4 = vVar.f4660h;
                System.arraycopy(bArr4, 0, bArr, i10, bArr4.length);
                length = vVar.f4660h.length;
            } else if (i11 == 203) {
                r rVar = (r) pVar;
                rVar.c();
                byte[] bArr5 = rVar.f4660h;
                System.arraycopy(bArr5, 0, bArr, i10, bArr5.length);
                length = rVar.f4660h.length;
            } else if (i11 == 204) {
                q qVar = (q) pVar;
                qVar.c();
                byte[] bArr6 = qVar.f4660h;
                System.arraycopy(bArr6, 0, bArr, i10, bArr6.length);
                length = qVar.f4660h.length;
            } else if (i11 == 205) {
                u uVar = (u) pVar;
                uVar.c();
                byte[] bArr7 = uVar.f4660h;
                System.arraycopy(bArr7, 0, bArr, i10, bArr7.length);
                length = uVar.f4660h.length;
            } else if (i11 == 206) {
                s sVar = (s) pVar;
                sVar.j();
                byte[] bArr8 = sVar.f4660h;
                System.arraycopy(bArr8, 0, bArr, i10, bArr8.length);
                length = sVar.f4660h.length;
            } else {
                System.out.println("CompRtcpPkt aPkt.packetType:" + pVar.f4657e);
            }
            i10 += length;
        }
        byte[] bArr9 = new byte[i10];
        System.arraycopy(bArr, 0, bArr9, 0, i10);
        return bArr9;
    }

    protected b(byte[] bArr, int i10, InetSocketAddress inetSocketAddress, o oVar) {
        int i11 = 0;
        this.f4546a = 0;
        this.f4547b = new LinkedList();
        while (i11 < i10 && this.f4546a == 0) {
            int iA = (y.a(bArr, i11 + 2) + 1) * 4;
            int i12 = iA + i11;
            if (i12 > bArr.length) {
                System.out.println("!!!! CompRtcpPkt.(rawPkt,..,..) length (" + i12 + ") exceeds size of raw packet (" + bArr.length + ") !");
                this.f4546a = -3;
            }
            int i13 = bArr[i11 + 1];
            i13 = i13 < 0 ? i13 + 256 : i13;
            if (i11 == 0) {
                if (i13 != 200 && i13 != 201) {
                    this.f4546a = -1;
                }
                if (((bArr[i11] & 32) >>> 5) == 1) {
                    this.f4546a = -2;
                }
            }
            if (i13 == 200) {
                a(new w(bArr, i11, iA));
            } else if (i13 == 201) {
                a(new t(bArr, i11, -1));
            } else if (i13 == 202) {
                a(new v(bArr, i11, inetSocketAddress, oVar.f4643q));
            } else if (i13 == 203) {
                a(new r(bArr, i11));
            } else if (i13 == 204) {
                a(new q(bArr, i11));
            } else if (i13 == 205) {
                a(new u(bArr, i11, oVar));
            } else if (i13 == 206) {
                a(new s(bArr, i11, oVar));
            } else {
                System.out.println("!!!! CompRtcpPkt(byte[] rawPkt, int packetSize...) UNKNOWN RTCP PACKET TYPE:" + i13);
            }
            i11 = i12;
        }
    }
}
