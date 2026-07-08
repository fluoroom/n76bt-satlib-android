package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.IHTGrpc;
import com.benshikj.ht.rpc.Im;
import com.benshikj.ht.rpc.Um;
import com.benshikj.ht.rpc.UserGrpc;
import com.benshikj.ii.II;
import com.dw.ht.fragments.DeviceFragment;
import com.dw.ht.ii.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import qb.u1;
import s4.r3;
import s4.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0002:\u0001WB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\r\u001a\u00020\n2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\u0006J\u0019\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J+\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020\n2\u0006\u00104\u001a\u0002012\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b5\u00106J#\u0010:\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u000107H\u0014¢\u0006\u0004\b:\u0010;J#\u0010>\u001a\u00020\u00192\n\u0010\u0016\u001a\u00060\u0003R\u00020\u00042\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u001d\u0010B\u001a\u00020\n2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\n2\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bH\u0010\u0006R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001e\u0010V\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006X"}, d2 = {"Ls4/r3;", "Lcom/dw/ht/fragments/DeviceFragment;", "Lc6/i;", "Ls4/x3$a;", "Ls4/x3;", "<init>", "()V", "Lkotlin/Function2;", "Ltg/d0;", "Lhd/e;", "Ldd/d0;", "", "block", "v5", "(Lqd/p;)V", "", "e", "y5", "(Ljava/lang/Throwable;)V", "Lv4/n1;", "ll", "Lg5/b;", "item", "u5", "(Lv4/n1;Lg5/b;)V", "", "ban", "F5", "(Lv4/n1;Lg5/b;Z)V", "isAdmin", "E5", "x5", "(Lg5/b;)V", "w5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "F2", "(Landroid/view/MenuItem;)Z", "", "queryText", "h", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lv4/n0;", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "", "action", "z5", "(Ls4/x3$a;I)Z", "Ld5/g;", "listener", "G5", "(Lc6/i;)V", "Lcom/dw/ht/ii/a$b;", "event", "onMessageEvent", "(Lcom/dw/ht/ii/a$b;)V", "M2", "Lm4/z;", "P0", "Lm4/z;", "binding", "Q0", "Ls4/x3;", "mAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "R0", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mLinearLayoutManager", "S0", "Lc6/i;", "mListener", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r3 extends DeviceFragment implements c6.i {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private m4.z binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private x3 mAdapter;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private LinearLayoutManager mLinearLayoutManager;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private c6.i mListener;

    public static final class a extends ed.d {

        /* JADX INFO: renamed from: b */
        private ArrayList f26691b;

        /* JADX INFO: renamed from: c */
        private final long f26692c;

        public a(ArrayList arrayList, long j10) {
            rd.m.e(arrayList, "meb");
            this.f26691b = arrayList;
            this.f26692c = j10;
            final boolean z10 = com.dw.ht.user.b.f6853a.i() == j10;
            ed.q.z(this.f26691b, gd.a.b(new qd.l() { // from class: s4.l3
                @Override // qd.l
                public final Object l(Object obj) {
                    return r3.a.l((g5.b) obj);
                }
            }, new qd.l() { // from class: s4.m3
                @Override // qd.l
                public final Object l(Object obj) {
                    return r3.a.o(this.f26606a, (g5.b) obj);
                }
            }, new qd.l() { // from class: s4.n3
                @Override // qd.l
                public final Object l(Object obj) {
                    return r3.a.p(z10, (g5.b) obj);
                }
            }, new qd.l() { // from class: s4.o3
                @Override // qd.l
                public final Object l(Object obj) {
                    return r3.a.q((g5.b) obj);
                }
            }, new qd.l() { // from class: s4.p3
                @Override // qd.l
                public final Object l(Object obj) {
                    return r3.a.s((g5.b) obj);
                }
            }, new qd.l() { // from class: s4.q3
                @Override // qd.l
                public final Object l(Object obj) {
                    return r3.a.t((g5.b) obj);
                }
            }));
        }

        public static final Comparable l(g5.b bVar) {
            rd.m.e(bVar, "it");
            return Boolean.valueOf(!bVar.b());
        }

        public static final Comparable o(a aVar, g5.b bVar) {
            rd.m.e(bVar, "it");
            return Boolean.valueOf(bVar.c() != aVar.f26692c);
        }

        public static final Comparable p(boolean z10, g5.b bVar) {
            rd.m.e(bVar, "it");
            return Boolean.valueOf(z10 && !bVar.e());
        }

        public static final Comparable q(g5.b bVar) {
            rd.m.e(bVar, "it");
            return Boolean.valueOf(!bVar.d());
        }

        public static final Comparable s(g5.b bVar) {
            rd.m.e(bVar, "it");
            return Integer.valueOf(-bVar.a());
        }

        public static final Comparable t(g5.b bVar) {
            rd.m.e(bVar, "it");
            return Long.valueOf(bVar.c());
        }

        @Override // ed.d, java.util.List
        /* JADX INFO: renamed from: A */
        public g5.b get(int i10) {
            Object obj = this.f26691b.get(i10);
            rd.m.d(obj, "get(...)");
            return (g5.b) obj;
        }

        public /* bridge */ int C(g5.b bVar) {
            return super.indexOf(bVar);
        }

        public /* bridge */ int D(g5.b bVar) {
            return super.lastIndexOf(bVar);
        }

        public final int K(long j10) {
            Iterator it = this.f26691b.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                }
                if (((g5.b) it.next()).c() == j10) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                this.f26691b.remove(i10);
            }
            return i10;
        }

        @Override // ed.b
        public int c() {
            return this.f26691b.size();
        }

        @Override // ed.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof g5.b) {
                return z((g5.b) obj);
            }
            return false;
        }

        @Override // ed.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof g5.b) {
                return C((g5.b) obj);
            }
            return -1;
        }

        @Override // ed.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof g5.b) {
                return D((g5.b) obj);
            }
            return -1;
        }

        public /* bridge */ boolean z(g5.b bVar) {
            return super.contains(bVar);
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26693a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f26694b;

        static {
            int[] iArr = new int[u1.b.values().length];
            try {
                iArr[u1.b.UNAUTHENTICATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26693a = iArr;
            int[] iArr2 = new int[a.EnumC0091a.values().length];
            try {
                iArr2[a.EnumC0091a.f6334e.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[a.EnumC0091a.f6333d.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f26694b = iArr2;
        }
    }

    static final class c extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e */
        int f26695e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ v4.n1 f26696f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ g5.b f26697g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ r3 f26698h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v4.n1 n1Var, g5.b bVar, r3 r3Var, hd.e eVar) {
            super(2, eVar);
            this.f26696f = n1Var;
            this.f26697g = bVar;
            this.f26698h = r3Var;
        }

        public static final void w(r3 r3Var, g5.b bVar) {
            x3 x3Var = r3Var.mAdapter;
            if (x3Var != null) {
                x3Var.L(bVar.c());
            }
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return new c(this.f26696f, this.f26697g, this.f26698h, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            II.RPC rpc;
            IHTGrpc.IHTBlockingStub iHTBlockingStub;
            id.b.e();
            if (this.f26695e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            II iiA = com.dw.ht.ii.a.a();
            if (iiA != null && (rpc = iiA.RPC) != null && (iHTBlockingStub = rpc.getIHTBlockingStub()) != null) {
                iHTBlockingStub.removeUserFromChannel(Im.RemoveUserFromChannelRequest.newBuilder().setChannelID(this.f26696f.T).setUserID(this.f26697g.c()).build());
            }
            Handler handler = ((v3.v) this.f26698h).f29607x0;
            final r3 r3Var = this.f26698h;
            final g5.b bVar = this.f26697g;
            handler.post(new Runnable() { // from class: s4.s3
                @Override // java.lang.Runnable
                public final void run() {
                    r3.c.w(r3Var, bVar);
                }
            });
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: v */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((c) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    static final class d extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e */
        int f26699e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f26700f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ qd.p f26701g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ r3 f26702h;

        static final class a extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e */
            int f26703e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ r3 f26704f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ Throwable f26705g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r3 r3Var, Throwable th2, hd.e eVar) {
                super(2, eVar);
                this.f26704f = r3Var;
                this.f26705g = th2;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new a(this.f26704f, this.f26705g, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f26703e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                this.f26704f.y5(this.f26705g);
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((a) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(qd.p pVar, r3 r3Var, hd.e eVar) {
            super(2, eVar);
            this.f26701g = pVar;
            this.f26702h = r3Var;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            d dVar = new d(this.f26701g, this.f26702h, eVar);
            dVar.f26700f = obj;
            return dVar;
        }

        @Override // jd.a
        public final Object o(Object obj) {
            tg.d0 d0Var = (tg.d0) this.f26700f;
            Object objE = id.b.e();
            int i10 = this.f26699e;
            try {
                if (i10 == 0) {
                    dd.s.b(obj);
                    qd.p pVar = this.f26701g;
                    this.f26700f = d0Var;
                    this.f26699e = 1;
                    if (pVar.s(d0Var, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dd.s.b(obj);
                }
            } catch (Throwable th2) {
                tg.g.b(d0Var, tg.p0.c(), null, new a(this.f26702h, th2, null), 2, null);
            }
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((d) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    static final class e extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e */
        int f26706e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f26707f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ g5.b f26708g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ r3 f26709h;

        static final class a extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e */
            int f26710e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ r3 f26711f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r3 r3Var, hd.e eVar) {
                super(2, eVar);
                this.f26711f = r3Var;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new a(this.f26711f, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f26710e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                Toast.makeText(this.f26711f.k1(), "用户已锁定", 0).show();
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((a) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g5.b bVar, r3 r3Var, hd.e eVar) {
            super(2, eVar);
            this.f26708g = bVar;
            this.f26709h = r3Var;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            e eVar2 = new e(this.f26708g, this.f26709h, eVar);
            eVar2.f26707f = obj;
            return eVar2;
        }

        @Override // jd.a
        public final Object o(Object obj) {
            II.RPC rpc;
            UserGrpc.UserBlockingStub userBlockingStub;
            tg.d0 d0Var = (tg.d0) this.f26707f;
            id.b.e();
            if (this.f26706e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            II iiA = com.dw.ht.ii.a.a();
            System.out.print((iiA == null || (rpc = iiA.RPC) == null || (userBlockingStub = rpc.getUserBlockingStub()) == null) ? null : userBlockingStub.doActionForUsers(Um.DoActionForUsersRequest.newBuilder().addUserIDs(this.f26708g.c()).addActions(Um.ActionForUser.Logout).addActions(Um.ActionForUser.Lock).build()));
            tg.g.b(d0Var, tg.p0.c(), null, new a(this.f26709h, null), 2, null);
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((e) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    static final class f extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e */
        int f26712e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ v4.n1 f26713f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ g5.b f26714g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ boolean f26715h;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ r3 f26716r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(v4.n1 n1Var, g5.b bVar, boolean z10, r3 r3Var, hd.e eVar) {
            super(2, eVar);
            this.f26713f = n1Var;
            this.f26714g = bVar;
            this.f26715h = z10;
            this.f26716r = r3Var;
        }

        public static final void w(r3 r3Var) {
            x3 x3Var = r3Var.mAdapter;
            if (x3Var != null) {
                x3Var.k();
            }
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return new f(this.f26713f, this.f26714g, this.f26715h, this.f26716r, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            II.RPC rpc;
            IHTGrpc.IHTBlockingStub iHTBlockingStub;
            id.b.e();
            if (this.f26712e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            II iiA = com.dw.ht.ii.a.a();
            if (iiA != null && (rpc = iiA.RPC) != null && (iHTBlockingStub = rpc.getIHTBlockingStub()) != null) {
                iHTBlockingStub.setChannelMemberAuth(Im.SetChannelMemberAuthRequest.newBuilder().setChannelID(this.f26713f.T).setUserID(this.f26714g.c()).setIsAdmin(com.google.protobuf.h.v(this.f26715h)).build());
            }
            this.f26714g.f(this.f26715h);
            Handler handler = ((v3.v) this.f26716r).f29607x0;
            final r3 r3Var = this.f26716r;
            handler.post(new Runnable() { // from class: s4.t3
                @Override // java.lang.Runnable
                public final void run() {
                    r3.f.w(r3Var);
                }
            });
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: v */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((f) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    static final class g extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e */
        int f26717e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ v4.n1 f26718f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ g5.b f26719g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ boolean f26720h;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ r3 f26721r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(v4.n1 n1Var, g5.b bVar, boolean z10, r3 r3Var, hd.e eVar) {
            super(2, eVar);
            this.f26718f = n1Var;
            this.f26719g = bVar;
            this.f26720h = z10;
            this.f26721r = r3Var;
        }

        public static final void w(r3 r3Var) {
            x3 x3Var = r3Var.mAdapter;
            if (x3Var != null) {
                x3Var.k();
            }
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return new g(this.f26718f, this.f26719g, this.f26720h, this.f26721r, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            II.RPC rpc;
            IHTGrpc.IHTBlockingStub iHTBlockingStub;
            id.b.e();
            if (this.f26717e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            II iiA = com.dw.ht.ii.a.a();
            if (iiA != null && (rpc = iiA.RPC) != null && (iHTBlockingStub = rpc.getIHTBlockingStub()) != null) {
                iHTBlockingStub.setChannelMemberAuth(Im.SetChannelMemberAuthRequest.newBuilder().setChannelID(this.f26718f.T).setUserID(this.f26719g.c()).setBan(com.google.protobuf.h.v(this.f26720h)).build());
            }
            this.f26719g.g(this.f26720h);
            Handler handler = ((v3.v) this.f26721r).f29607x0;
            final r3 r3Var = this.f26721r;
            handler.post(new Runnable() { // from class: s4.u3
                @Override // java.lang.Runnable
                public final void run() {
                    r3.g.w(r3Var);
                }
            });
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: v */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((g) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    public static final void A5(r3 r3Var, v4.n1 n1Var, x3.a aVar, DialogInterface dialogInterface, int i10) {
        r3Var.F5(n1Var, aVar.T(), true);
    }

    public static final void B5(r3 r3Var, x3.a aVar, DialogInterface dialogInterface, int i10) {
        r3Var.x5(aVar.T());
    }

    public static final void C5(final r3 r3Var) {
        m4.z zVar = r3Var.binding;
        if (zVar == null) {
            return;
        }
        v4.l1 l1VarY4 = r3Var.Y4();
        zVar.f21710d.postDelayed(new Runnable() { // from class: s4.k3
            @Override // java.lang.Runnable
            public final void run() {
                r3.D5(this.f26552a);
            }
        }, 10000L);
        if (l1VarY4 instanceof v4.n1) {
            v4.n1 n1Var = (v4.n1) l1VarY4;
            n1Var.A1();
            n1Var.y1(true);
        }
    }

    public static final void D5(r3 r3Var) {
        SwipeRefreshLayout swipeRefreshLayout;
        m4.z zVar = r3Var.binding;
        if (zVar == null || (swipeRefreshLayout = zVar.f21710d) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    private final void E5(v4.n1 ll, g5.b item, boolean isAdmin) {
        v5(new f(ll, item, isAdmin, this, null));
    }

    private final void F5(v4.n1 ll, g5.b item, boolean ban) {
        v5(new g(ll, item, ban, this, null));
    }

    private final void u5(v4.n1 ll, g5.b item) {
        v5(new c(ll, item, this, null));
    }

    private final void v5(qd.p block) {
        tg.g.b(androidx.lifecycle.u.a(this), tg.p0.b(), null, new d(block, this, null), 2, null);
    }

    private final void w5() {
        long ownUserID;
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null || !(l1VarY4 instanceof v4.n1)) {
            x3 x3Var = this.mAdapter;
            if (x3Var != null) {
                x3Var.M(null);
                return;
            }
            return;
        }
        v4.n1 n1Var = (v4.n1) l1VarY4;
        Long[] lArrA0 = n1Var.a0();
        if (lArrA0 == null) {
            lArrA0 = new Long[0];
        }
        Long[] lArr = lArrA0;
        Im.GetChannelMembersResult getChannelMembersResultY1 = n1Var.y1(false);
        ArrayList arrayList = new ArrayList();
        ed.j.t(lArr);
        if (getChannelMembersResultY1 != null) {
            x3 x3Var2 = this.mAdapter;
            if (x3Var2 != null) {
                x3Var2.O(getChannelMembersResultY1.getOwnUserID());
            }
            ownUserID = getChannelMembersResultY1.getOwnUserID();
            List<Im.IIChannelMember> membersList = getChannelMembersResultY1.getMembersList();
            rd.m.d(membersList, "getMembersList(...)");
            for (Im.IIChannelMember iIChannelMember : membersList) {
                boolean z10 = ed.j.f(lArr, Long.valueOf(iIChannelMember.getUserID()), 0, 0, 6, null) >= 0;
                rd.m.b(iIChannelMember);
                arrayList.add(new g5.b(z10, iIChannelMember));
            }
        } else {
            ownUserID = 0;
        }
        x3 x3Var3 = this.mAdapter;
        if (x3Var3 != null) {
            x3Var3.M(new a(arrayList, ownUserID));
        }
    }

    private final void x5(g5.b item) {
        v5(new e(item, this, null));
    }

    public final void y5(Throwable e10) {
        qb.u1 u1VarA;
        Context contextK1 = k1();
        if (contextK1 == null) {
            return;
        }
        u1.b bVarO = null;
        qb.x1 x1Var = e10 instanceof qb.x1 ? (qb.x1) e10 : null;
        if (x1Var != null && (u1VarA = x1Var.a()) != null) {
            bVarO = u1VarA.o();
        }
        if ((bVarO == null ? -1 : b.f26693a[bVarO.ordinal()]) == 1) {
            com.dw.ht.user.a.i(contextK1).h().u(true);
        } else {
            e10.printStackTrace();
            Toast.makeText(contextK1, e10.getLocalizedMessage(), 0).show();
        }
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        rd.m.e(item, "item");
        if (item.getItemId() == R.id.clean) {
            return true;
        }
        return super.F2(item);
    }

    public final void G5(c6.i listener) {
        this.mListener = listener;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        w5();
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        Context context = view.getContext();
        m4.z zVar = this.binding;
        if (zVar == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.mLinearLayoutManager = linearLayoutManager;
        zVar.f21709c.setLayoutManager(linearLayoutManager);
        zVar.f21709c.l(new c6.m(k1(), 0));
        x3 x3Var = new x3(this, 0L);
        this.mAdapter = x3Var;
        rd.m.b(x3Var);
        v4.l1 l1VarY4 = Y4();
        x3Var.N(l1VarY4 instanceof v4.n1 ? (v4.n1) l1VarY4 : null);
        zVar.f21709c.setAdapter(this.mAdapter);
        zVar.f21710d.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: s4.h3
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                r3.C5(this.f26507a);
            }
        });
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(v4.n0 oldLink, v4.n0 newLink) {
        super.d5(oldLink, newLink);
        x3 x3Var = this.mAdapter;
        if (x3Var != null) {
            rd.m.b(x3Var);
            x3Var.N(newLink instanceof v4.n1 ? (v4.n1) newLink : null);
        }
        w5();
    }

    @Override // v3.f0, v3.e0
    public void h(String queryText) {
        rd.m.e(queryText, "queryText");
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(a.b event) {
        SwipeRefreshLayout swipeRefreshLayout;
        rd.m.e(event, "event");
        v4.l1 l1VarY4 = Y4();
        v4.n1 n1Var = l1VarY4 instanceof v4.n1 ? (v4.n1) l1VarY4 : null;
        if (n1Var != null && rd.m.a(n1Var.S, event.b())) {
            int i10 = b.f26694b[event.a().ordinal()];
            if (i10 == 1 || i10 == 2) {
                m4.z zVar = this.binding;
                if (zVar != null && (swipeRefreshLayout = zVar.f21710d) != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                w5();
            }
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        G3(true);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_contact_list, container, false);
        this.binding = m4.z.a(viewInflate);
        rd.m.b(viewInflate);
        return viewInflate;
    }

    @Override // c6.i
    /* JADX INFO: renamed from: z5 */
    public boolean V0(final x3.a item, int action) {
        rd.m.e(item, "item");
        v4.l1 l1VarY4 = Y4();
        final v4.n1 n1Var = l1VarY4 instanceof v4.n1 ? (v4.n1) l1VarY4 : null;
        if (n1Var == null) {
            return true;
        }
        switch (action) {
            case R.id.ban /* 2131296447 */:
            case R.id.clr_ban /* 2131296563 */:
            case R.id.set_ban /* 2131297368 */:
                if (item.T().e()) {
                    F5(n1Var, item.T(), false);
                } else {
                    new c.a(x3()).k(O1(R.string.wantToBanWhoSpeaking, item.U())).t(R.string.yes, new DialogInterface.OnClickListener() { // from class: s4.i3
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            r3.A5(this.f26521a, n1Var, item, dialogInterface, i10);
                        }
                    }).C();
                }
                return true;
            case R.id.cancel_admin_right /* 2131296505 */:
                E5(n1Var, item.T(), false);
                return true;
            case R.id.delete /* 2131296623 */:
                u5(n1Var, item.T());
                return true;
            case R.id.lock /* 2131296939 */:
                new c.a(x3()).z("锁定用户 \"" + item.U() + '\"').k("锁定用户会清除用户的已登录会话并禁止他再次登录。").m(android.R.string.cancel, null).u("锁定", new DialogInterface.OnClickListener() { // from class: s4.j3
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        r3.B5(this.f26534a, item, dialogInterface, i10);
                    }
                }).C();
                return true;
            case R.id.set_as_admin /* 2131297367 */:
                E5(n1Var, item.T(), true);
                return true;
            default:
                if (this.mListener == null) {
                    return false;
                }
                d5.g gVar = new d5.g();
                gVar.f10613o = item.T().c();
                c6.i iVar = this.mListener;
                rd.m.b(iVar);
                return iVar.V0(gVar, action);
        }
    }
}
