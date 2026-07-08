package v4;

import android.content.ContentUris;
import android.net.Uri;
import android.text.TextUtils;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.alarms.AlarmService;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import v4.u;
import w5.c;
import w5.d;

/* JADX INFO: loaded from: classes.dex */
public class r1 {

    /* JADX INFO: renamed from: l */
    private static final boolean f30089l = Cfg.f5476a;

    /* JADX INFO: renamed from: a */
    private final l1 f30090a;

    /* JADX INFO: renamed from: c */
    private final boolean f30092c;

    /* JADX INFO: renamed from: d */
    private int f30093d;

    /* JADX INFO: renamed from: g */
    k4.b f30096g;

    /* JADX INFO: renamed from: b */
    private final byte[] f30091b = new byte[330];

    /* JADX INFO: renamed from: e */
    private final AtomicInteger f30094e = new AtomicInteger();

    /* JADX INFO: renamed from: f */
    private final boolean f30095f = false;

    /* JADX INFO: renamed from: h */
    private final w5.e f30097h = new w5.e(28000, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);

    /* JADX INFO: renamed from: i */
    private final w5.e f30098i = new w5.e(28000, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);

    /* JADX INFO: renamed from: j */
    private final w5.e f30099j = new w5.e(28000, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);

    /* JADX INFO: renamed from: k */
    private final s5.a f30100k = new s5.a(false);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f30101a;

        static {
            int[] iArr = new int[d.b.values().length];
            f30101a = iArr;
            try {
                iArr[d.b.BA_ALARM_AND_MUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30101a[d.b.BA_ALARM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public r1(l1 l1Var) {
        this.f30090a = l1Var;
        this.f30092c = l1Var instanceof n1;
    }

    private void h(w5.d dVar, int i10, long j10, s sVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        r0 r0VarZ;
        int i11;
        boolean z14 = f30089l;
        if (z14) {
            s3.b.h("PacketReceiver", "onRx BSS:" + dVar.toString());
        }
        if (this.f30100k.F0(dVar)) {
            return;
        }
        boolean z15 = false;
        boolean z16 = dVar.x() || j10 > 0;
        if (z16) {
            this.f30094e.incrementAndGet();
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String strW = this.f30090a.T().w();
            if (a6.q.d(strW, dVar.f31253d) || a6.q.d(strW, dVar.f31263w) || a6.q.d(strW, dVar.f31252c)) {
                z10 = false;
            }
        }
        if (z16 && f(dVar)) {
            if (z14) {
                s3.b.b("PacketReceiver", "接收到重复数据");
            }
            z12 = false;
            z11 = false;
            z13 = true;
        } else {
            z11 = z10;
            z12 = true;
            z13 = false;
        }
        if (z12 && !z16 && this.f30090a.i()) {
            z12 = false;
        }
        if (dVar.r() == d.a.Call && ((!TextUtils.isEmpty(dVar.f31263w) || dVar.f31264x != 0) && !this.f30097h.c(dVar))) {
            long j11 = dVar.f31264x;
            if ((j11 != 0 && j11 == com.dw.ht.user.b.f6853a.i()) || (!TextUtils.isEmpty(dVar.f31263w) && a6.q.d(dVar.f31263w.toUpperCase(), this.f30090a.T().w().toUpperCase()))) {
                z12 = true;
                z15 = true;
            }
        }
        if (z12) {
            if (z14) {
                s3.b.b("PacketReceiver", "保存数据");
            }
            Uri uriR = d5.g.r(this.f30090a.q(), j10, i10, dVar);
            if (uriR != null) {
                long id2 = ContentUris.parseId(uriR);
                if (z15) {
                    k4.b bVarC = k4.b.c(Main.f5555g.getContentResolver(), id2);
                    this.f30096g = bVarC;
                    AlarmService.j(Main.f5555g, bVarC);
                }
                if (!z13 && ((i11 = a.f30101a[dVar.u().ordinal()]) == 1 || i11 == 2)) {
                    k4.b bVarC2 = k4.b.c(Main.f5555g.getContentResolver(), id2);
                    this.f30096g = bVarC2;
                    AlarmService.j(Main.f5555g, bVarC2);
                }
            }
        } else if (z14) {
            s3.b.b("PacketReceiver", "丢弃数据");
        }
        if (z11) {
            c(dVar, sVar);
        }
        if (z16 || (r0VarZ = this.f30090a.Z()) == null) {
            return;
        }
        r0VarZ.m(dVar);
    }

    public void a(s5.b bVar) {
        this.f30100k.a(bVar);
    }

    public boolean b(w5.c cVar, s sVar) {
        if (this.f30092c) {
            return false;
        }
        c.a aVarD = d();
        if (aVarD.j().isEmpty()) {
            return false;
        }
        for (c.a aVar : cVar.r()) {
            if (aVarD.equals(aVar)) {
                if (aVar.n()) {
                    return false;
                }
                aVar.t(true);
                this.f30090a.R0(cVar, 100000, true, true, sVar);
                return true;
            }
        }
        int iP = this.f30090a.T().p();
        if (iP <= 0) {
            return false;
        }
        if (cVar.f31218c.m() > 0) {
            if (cVar.r().size() >= iP || cVar.r().size() >= cVar.f31218c.m() || !cVar.m(aVarD)) {
                return false;
            }
            this.f30090a.R0(cVar, 100000, true, true, sVar);
            return true;
        }
        if (cVar.r().size() >= 8) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < cVar.r().size() && i10 < iP; i11++) {
            c.a aVar2 = (c.a) cVar.r().get(i11);
            if (aVar2.n()) {
                i10++;
            } else if (aVar2.j().startsWith("WIDE") && aVar2.m() > 0) {
                aVar2.u(aVar2.m() - 1);
                cVar.r().add(i11, aVarD);
                this.f30090a.R0(cVar, 100000, true, true, sVar);
                return true;
            }
        }
        return false;
    }

    public boolean c(w5.d dVar, s sVar) {
        int iP;
        if (this.f30092c || dVar.f31258r == 0) {
            return false;
        }
        q qVarT = this.f30090a.T();
        if (TextUtils.isEmpty(qVarT.w())) {
            return false;
        }
        ArrayList arrayList = dVar.f31261u;
        if ((arrayList != null && arrayList.contains(qVarT.w())) || (iP = qVarT.p()) <= 0) {
            return false;
        }
        ArrayList arrayList2 = dVar.f31261u;
        if (arrayList2 != null && arrayList2.size() >= iP) {
            return false;
        }
        dVar.f31258r--;
        dVar.o(qVarT.w());
        s3.b.b("PacketReceiver", "转发");
        this.f30090a.S0(dVar, sVar);
        return true;
    }

    public c.a d() {
        String strL = this.f30090a.T().l();
        return strL.isEmpty() ? Cfg.H() : new c.a(strL, c.a.EnumC0415a.Repeater, true);
    }

    public boolean e(w5.c cVar) {
        boolean zC;
        synchronized (this.f30098i) {
            zC = this.f30098i.c(cVar);
        }
        return zC;
    }

    public boolean f(w5.d dVar) {
        boolean zC;
        synchronized (this.f30099j) {
            zC = this.f30099j.c(dVar);
        }
        return zC;
    }

    void g(g3.d dVar, int i10, s sVar) {
        int i11;
        byte[] bArrI = dVar.i();
        if (bArrI == null || bArrI.length < 2) {
            s3.b.b("PacketReceiver", "无效数据：长度小于2");
            return;
        }
        boolean z10 = f30089l;
        if (z10) {
            s3.b.h("PacketReceiver", dVar.c() + ":" + new String(bArrI, 2, bArrI.length - 2));
        }
        int iC = dVar.c();
        if (iC == 0) {
            this.f30093d = 0;
        }
        int iMin = Math.min(bArrI.length - 2, this.f30091b.length - this.f30093d);
        if (iMin > 0) {
            System.arraycopy(bArrI, 2, this.f30091b, this.f30093d, iMin);
            this.f30093d += iMin;
        }
        if (iC < 0 && (i11 = this.f30093d) > 0) {
            try {
                w5.h hVarJ = w5.h.j(this.f30091b, 0, i11);
                if (z10) {
                    s3.b.b("PacketReceiver", "rx form dev:[" + this.f30093d + "]" + a6.w.d(this.f30091b, 0, this.f30093d));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("rx form dev:");
                    sb2.append(hVarJ);
                    s3.b.h("PacketReceiver", sb2.toString());
                }
                r0 r0VarZ = this.f30090a.Z();
                if (!(r0VarZ != null ? r0VarZ.m(hVarJ) : false)) {
                    k(hVarJ, i10, sVar);
                }
            } catch (w5.g e10) {
                s3.b.c("PacketReceiver", "onPacketRx", e10);
            }
            this.f30093d = 0;
        }
        if (this.f30093d >= 330) {
            this.f30093d = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(w5.c r12, int r13, long r14, v4.s r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.r1.i(w5.c, int, long, v4.s, boolean):void");
    }

    public void j(w5.h hVar, int i10, long j10, byte[] bArr, s sVar) {
        u.d dVarW1;
        if (hVar instanceof w5.c) {
            i((w5.c) hVar, i10, j10, sVar, false);
        } else if (hVar instanceof w5.d) {
            h((w5.d) hVar, i10, j10, sVar);
        }
        if (bArr != null) {
            l1 l1Var = this.f30090a;
            if (!(l1Var instanceof n1) || (dVarW1 = ((n1) l1Var).w1(false)) == null || dVarW1.f30167a.Q.k() < 60) {
                return;
            }
            dVarW1.f30167a.a(v.RX_DATA, bArr);
            s3.b.b("PacketReceiver", "RX_DATA:len=" + bArr.length);
        }
    }

    public void k(w5.h hVar, int i10, s sVar) {
        j(hVar, i10, 0L, null, sVar);
    }

    public int l() {
        return this.f30094e.get();
    }

    public void m(s5.b bVar) {
        this.f30100k.c(bVar);
    }
}
