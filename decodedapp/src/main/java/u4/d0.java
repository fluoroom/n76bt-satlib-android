package u4;

import com.benshikj.ht.rpc.Im;
import com.benshikj.ii.II;
import com.dw.ht.entitys.IIChannel;
import com.dw.ht.user.b;
import j$.util.DesugarCollections;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import qb.x1;
import tg.p0;
import tg.z0;
import v4.l1;
import v4.n1;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a */
    public static final d0 f28046a;

    /* JADX INFO: renamed from: b */
    private static io.objectbox.a f28047b;

    /* JADX INFO: renamed from: c */
    private static boolean f28048c;

    /* JADX INFO: renamed from: d */
    private static List f28049d;

    /* JADX INFO: renamed from: e */
    private static HashMap f28050e;

    /* JADX INFO: renamed from: f */
    private static long f28051f;

    public static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final a f28052a = new a("Changed", 0);

        /* JADX INFO: renamed from: b */
        private static final /* synthetic */ a[] f28053b;

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ kd.a f28054c;

        static {
            a[] aVarArrA = a();
            f28053b = aVarArrA;
            f28054c = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f28052a};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f28053b.clone();
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28055a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.f6868a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.f6869b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28055a = iArr;
        }
    }

    static final class c extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e */
        int f28056e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f28057f;

        static final class a extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e */
            int f28058e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ ArrayList f28059f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ArrayList arrayList, hd.e eVar) {
                super(2, eVar);
                this.f28059f = arrayList;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new a(this.f28059f, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                l1 l1VarY;
                boolean z10;
                n1 n1VarM;
                id.b.e();
                if (this.f28058e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                s3.b.b("IIUserChannelManager", "加载" + this.f28059f.size() + "信道从服务器，" + d0.f28050e.size() + "信道在数据库");
                HashMap map = new HashMap();
                for (Im.UserChannel userChannel : this.f28059f) {
                    IIChannel iIChannel = (IIChannel) d0.f28050e.get(jd.b.c(userChannel.getChannelId()));
                    if (iIChannel != null) {
                        rd.m.b(userChannel);
                        if (iIChannel.z(userChannel)) {
                            d0.f28047b.n(iIChannel);
                        } else {
                            z10 = false;
                            map.put(jd.b.c(userChannel.getChannelId()), iIChannel);
                            if (!z10 && (n1VarM = v4.u.w().m(iIChannel.getChannelId())) != null && n1VarM.i()) {
                                n1VarM.h(false);
                                n1VarM.L(false);
                            }
                        }
                    } else {
                        rd.m.b(userChannel);
                        iIChannel = new IIChannel(userChannel, d0.f28051f);
                        d0.f28047b.n(iIChannel);
                        jd.b.b(s3.b.b("IIUserChannelManager", "新信道[" + iIChannel.k() + "]来自服务器"));
                    }
                    z10 = true;
                    map.put(jd.b.c(userChannel.getChannelId()), iIChannel);
                    if (!z10) {
                    }
                }
                HashMap map2 = d0.f28050e;
                d0.f28046a.r(map);
                for (Map.Entry entry : map.entrySet()) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    IIChannel iIChannel2 = (IIChannel) entry.getValue();
                    map2.remove(jd.b.c(jLongValue));
                    if (iIChannel2.getAutoConnect() && (l1VarY = v4.u.w().y(iIChannel2.getChannelId() + 28147497671065500L)) != null) {
                        l1VarY.L(false);
                    }
                }
                d0.f28047b.u(map2.values());
                d0.f28048c = true;
                mi.c.e().m(a.f28052a);
                s3.b.b("IIUserChannelManager", "load from network");
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((a) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        c(hd.e eVar) {
            super(2, eVar);
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            c cVar = new c(eVar);
            cVar.f28057f = obj;
            return cVar;
        }

        @Override // jd.a
        public final Object o(Object obj) {
            II.ChannelManager channelManager;
            ArrayList<Im.UserChannel> all;
            tg.d0 d0Var = (tg.d0) this.f28057f;
            id.b.e();
            if (this.f28056e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            II iiA = com.dw.ht.ii.a.a();
            if (iiA != null && (channelManager = iiA.channelManager) != null && (all = channelManager.getAll(true)) != null) {
                try {
                    tg.g.b(d0Var, p0.c(), null, new a(all, null), 2, null);
                } catch (x1 e10) {
                    e10.printStackTrace();
                }
            }
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((c) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    static {
        d0 d0Var = new d0();
        f28046a = d0Var;
        f28047b = com.dw.ht.j0.i().k(IIChannel.class);
        f28049d = new ArrayList(0);
        f28050e = new HashMap();
        t();
        mi.c.e().q(d0Var);
    }

    private d0() {
    }

    public static final int c(Collator collator, IIChannel iIChannel, IIChannel iIChannel2) {
        return collator.compare(iIChannel.k(), iIChannel2.k());
    }

    public static final int d(qd.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.s(obj, obj2)).intValue();
    }

    public static final IIChannel k(long j10) {
        return (IIChannel) f28050e.get(Long.valueOf(j10));
    }

    public static final void n() {
        II.ChannelManager channelManager;
        II iiA = com.dw.ht.ii.a.a();
        if (iiA == null || (channelManager = iiA.channelManager) == null) {
            return;
        }
        channelManager.reload();
    }

    public final void r(HashMap map) {
        f28050e = map;
        final Collator collator = Collator.getInstance(Locale.getDefault());
        ArrayList arrayList = new ArrayList(f28050e.values());
        final qd.p pVar = new qd.p() { // from class: u4.b0
            @Override // qd.p
            public final Object s(Object obj, Object obj2) {
                return Integer.valueOf(d0.c(collator, (IIChannel) obj, (IIChannel) obj2));
            }
        };
        f28049d = ed.q.B0(arrayList, new Comparator() { // from class: u4.c0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d0.d(pVar, obj, obj2);
            }
        });
    }

    public static final void t() {
        long jI = com.dw.ht.user.b.f6853a.i();
        if (jI == 0) {
            return;
        }
        if (jI != f28051f) {
            f28051f = jI;
            HashMap map = new HashMap();
            List<IIChannel> listX = f28047b.q().e(com.dw.ht.entitys.c.f5745f, f28051f).a().x();
            rd.m.d(listX, "find(...)");
            for (IIChannel iIChannel : listX) {
                if (map.get(Long.valueOf(iIChannel.getChannelId())) == null) {
                    map.put(Long.valueOf(iIChannel.getChannelId()), iIChannel);
                    s3.b.b("IIUserChannelManager", "加载[" + iIChannel.k() + "]从数据库");
                } else {
                    f28047b.w(iIChannel);
                    s3.b.d("IIUserChannelManager", "重复设置");
                }
            }
            f28046a.r(map);
            mi.c.e().m(a.f28052a);
            s3.b.b("IIUserChannelManager", "加载" + f28050e.size() + "信道从数据库");
        }
        tg.g.b(z0.f27881a, p0.b(), null, new c(null), 2, null);
    }

    public final void j(long j10) {
        IIChannel iIChannelK = k(j10);
        if (iIChannelK != null && iIChannelK.getHaveNewMessage()) {
            iIChannelK.u(false);
            f28047b.n(iIChannelK);
            mi.c.e().m(a.f28052a);
        }
    }

    public final List l() {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(f28049d);
        rd.m.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public final void m(long j10) {
        II.ChannelManager channelManager;
        o(j10);
        II iiA = com.dw.ht.ii.a.a();
        if (iiA == null || (channelManager = iiA.channelManager) == null) {
            return;
        }
        channelManager.quit(j10);
    }

    public final void o(long j10) {
        IIChannel iIChannel = (IIChannel) f28050e.get(Long.valueOf(j10));
        if (iIChannel == null) {
            return;
        }
        synchronized (f28050e) {
        }
        f28047b.w(iIChannel);
        mi.c.e().m(a.f28052a);
        v4.u uVarW = v4.u.w();
        rd.m.d(uVarW, "getInstance(...)");
        uVarW.c(uVarW.l(j10 + 28147497671065500L));
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(b.a aVar) {
        rd.m.e(aVar, "event");
        int i10 = b.f28055a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            t();
            n();
            return;
        }
        f28047b.x();
        if (f28050e.isEmpty()) {
            return;
        }
        r(new HashMap());
        mi.c.e().m(a.f28052a);
    }

    public final void p(long j10) {
        IIChannel iIChannelK = k(j10);
        if (iIChannelK == null || iIChannelK.getHaveNewMessage()) {
            return;
        }
        l1 l1VarR = v4.u.w().r();
        if (l1VarR == null || l1VarR.q() != j10 + 28147497671065500L) {
            iIChannelK.u(true);
            f28047b.n(iIChannelK);
            mi.c.e().m(a.f28052a);
        }
    }

    public final void q(long j10, boolean z10) {
        IIChannel iIChannel = (IIChannel) f28050e.get(Long.valueOf(j10));
        if (iIChannel == null || iIChannel.getAutoConnect() == z10) {
            return;
        }
        iIChannel.t(z10);
        f28047b.n(iIChannel);
        d5.g.s(iIChannel.k() + " autoConnect:" + z10);
    }

    public final void s(long j10, boolean z10) {
        IIChannel iIChannel = (IIChannel) f28050e.get(Long.valueOf(j10));
        if (iIChannel == null || iIChannel.getMonitor() == z10) {
            return;
        }
        iIChannel.w(z10);
        f28047b.n(iIChannel);
    }

    public final void u(long j10, Im.GetChannelConnectionParmResult getChannelConnectionParmResult) {
        rd.m.e(getChannelConnectionParmResult, "par");
        IIChannel iIChannelK = k(j10);
        if (iIChannelK == null || !iIChannelK.y(getChannelConnectionParmResult)) {
            return;
        }
        f28047b.n(iIChannelK);
    }
}
