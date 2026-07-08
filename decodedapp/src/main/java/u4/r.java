package u4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.IHTGrpc;
import com.benshikj.ht.rpc.Im;
import com.benshikj.ii.GRPC;
import com.benshikj.ii.II;
import com.dw.android.app.FragmentShowActivity;
import com.dw.grpc.Error;
import com.dw.ht.user.a;
import java.util.List;
import kotlin.Metadata;
import m4.q0;
import qb.x1;
import tg.p0;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 J2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001KB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0005J!\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\u0005J;\u00100\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010.H\u0014¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\b2\u0006\u00103\u001a\u0002022\u0006\u0010\u0019\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020%2\u0006\u0010#\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u0006H\u0014¢\u0006\u0004\b>\u0010\nR\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lu4/r;", "Lu4/w;", "Lc6/i;", "Lcom/benshikj/ht/rpc/Im$IIChannel;", "<init>", "()V", "", "queryText", "Ldd/d0;", "O4", "(Ljava/lang/String;)V", "", "cid", "R4", "(J)V", "chId", "", "passcode", "M4", "(JI)V", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "item", "action", "", "Q4", "(Lcom/benshikj/ht/rpc/Im$IIChannel;I)Z", "M2", "Landroidx/fragment/app/o;", "sender", "what", "arg1", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "F2", "(Landroid/view/MenuItem;)Z", "Lv3/e0;", "getSearchable", "()Lv3/e0;", "newText", "D4", "Lm4/q0;", "I0", "Lm4/q0;", "binding", "J0", "Z", "joinByLink", "Lu4/s;", "K0", "Lu4/s;", "adapter", "L0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends w implements c6.i {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private q0 binding;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private boolean joinByLink;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private s adapter;

    /* JADX INFO: renamed from: u4.r$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        public final void a(Context context, long j10, int i10) {
            rd.m.e(context, "context");
            Bundle bundle = new Bundle();
            bundle.putLong("cid", j10);
            bundle.putInt("passcode", i10);
            FragmentShowActivity.i2(context, "", r.class, bundle);
        }

        private Companion() {
        }
    }

    static final class b extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e */
        int f28121e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f28122f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ IHTGrpc.IHTBlockingStub f28123g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ long f28124h;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ int f28125r;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ r f28126s;

        static final class a extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e */
            int f28127e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ r f28128f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, hd.e eVar) {
                super(2, eVar);
                this.f28128f = rVar;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new a(this.f28128f, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f28127e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                if (this.f28128f.k1() != null) {
                    Toast.makeText(this.f28128f.k1(), this.f28128f.N1(R.string.success), 1).show();
                }
                d0.n();
                androidx.fragment.app.p pVarE1 = this.f28128f.e1();
                if (pVarE1 != null) {
                    pVarE1.finish();
                }
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((a) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        /* JADX INFO: renamed from: u4.r$b$b */
        static final class C0393b extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e */
            int f28129e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ r f28130f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ long f28131g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0393b(r rVar, long j10, hd.e eVar) {
                super(2, eVar);
                this.f28130f = rVar;
                this.f28131g = j10;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new C0393b(this.f28130f, this.f28131g, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f28129e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                if (!this.f28130f.joinByLink) {
                    Toast.makeText(this.f28130f.k1(), this.f28130f.N1(R.string.wrongPassword), 1).show();
                }
                this.f28130f.joinByLink = false;
                this.f28130f.R4(this.f28131g);
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((C0393b) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(IHTGrpc.IHTBlockingStub iHTBlockingStub, long j10, int i10, r rVar, hd.e eVar) {
            super(2, eVar);
            this.f28123g = iHTBlockingStub;
            this.f28124h = j10;
            this.f28125r = i10;
            this.f28126s = rVar;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            b bVar = new b(this.f28123g, this.f28124h, this.f28125r, this.f28126s, eVar);
            bVar.f28122f = obj;
            return bVar;
        }

        @Override // jd.a
        public final Object o(Object obj) {
            tg.d0 d0Var = (tg.d0) this.f28122f;
            id.b.e();
            if (this.f28121e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            try {
                this.f28123g.joinChannel(Im.JoinChannelRequest.newBuilder().setChannelID(this.f28124h).setPasscode(this.f28125r).build());
                tg.g.b(d0Var, p0.c(), null, new a(this.f28126s, null), 2, null);
            } catch (x1 e10) {
                Error.Info exception = GRPC.parseException(e10);
                if ((exception != null ? exception.getCode() : null) == Error.Code.InvalidArgument) {
                    tg.g.b(d0Var, p0.c(), null, new C0393b(this.f28126s, this.f28124h, null), 2, null);
                }
            }
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((b) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    static final class c extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e */
        int f28132e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f28133f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ IHTGrpc.IHTBlockingStub f28134g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Im.GetChannelsRequest.Builder f28135h;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ r f28136r;

        static final class a extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e */
            int f28137e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ r f28138f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ Im.GetChannelsResult f28139g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar, Im.GetChannelsResult getChannelsResult, hd.e eVar) {
                super(2, eVar);
                this.f28138f = rVar;
                this.f28139g = getChannelsResult;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new a(this.f28138f, this.f28139g, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f28137e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                s sVar = this.f28138f.adapter;
                if (sVar != null) {
                    List<Im.IIChannel> channelsList = this.f28139g.getChannelsList();
                    rd.m.d(channelsList, "getChannelsList(...)");
                    sVar.G(channelsList);
                }
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((a) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(IHTGrpc.IHTBlockingStub iHTBlockingStub, Im.GetChannelsRequest.Builder builder, r rVar, hd.e eVar) {
            super(2, eVar);
            this.f28134g = iHTBlockingStub;
            this.f28135h = builder;
            this.f28136r = rVar;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            c cVar = new c(this.f28134g, this.f28135h, this.f28136r, eVar);
            cVar.f28133f = obj;
            return cVar;
        }

        @Override // jd.a
        public final Object o(Object obj) {
            tg.d0 d0Var = (tg.d0) this.f28133f;
            id.b.e();
            if (this.f28132e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            try {
                tg.g.b(d0Var, p0.c(), null, new a(this.f28136r, this.f28134g.getChannels(this.f28135h.build()), null), 2, null);
            } catch (x1 e10) {
                e10.printStackTrace();
            }
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((c) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    private final void M4(final long chId, final int passcode) {
        II.RPC rpc;
        final IHTGrpc.IHTBlockingStub iHTBlockingStub;
        com.dw.ht.user.a aVarF4;
        II iiA = com.dw.ht.ii.a.a();
        if (iiA == null || (rpc = iiA.RPC) == null || (iHTBlockingStub = rpc.getIHTBlockingStub()) == null || (aVarF4 = F4()) == null) {
            return;
        }
        aVarF4.f(new a.b() { // from class: u4.q
            @Override // com.dw.ht.user.a.b
            public final void a(String str) {
                r.N4(this.f28117a, iHTBlockingStub, chId, passcode, str);
            }
        });
    }

    public static final void N4(r rVar, IHTGrpc.IHTBlockingStub iHTBlockingStub, long j10, int i10, String str) {
        if (str == null) {
            return;
        }
        tg.g.b(androidx.lifecycle.u.a(rVar), p0.b(), null, new b(iHTBlockingStub, j10, i10, rVar, null), 2, null);
    }

    private final void O4(String queryText) {
        II.RPC rpc;
        IHTGrpc.IHTBlockingStub iHTBlockingStub;
        Im.GetChannelsRequest.Builder offset = Im.GetChannelsRequest.newBuilder().setLimit(100).setOffset(0);
        if (queryText != null) {
            offset.setQueryText(queryText);
        }
        II iiA = com.dw.ht.ii.a.a();
        if (iiA == null || (rpc = iiA.RPC) == null || (iHTBlockingStub = rpc.getIHTBlockingStub()) == null) {
            return;
        }
        tg.g.b(androidx.lifecycle.u.a(this), p0.b(), null, new c(iHTBlockingStub, offset, this, null), 2, null);
    }

    static /* synthetic */ void P4(r rVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        rVar.O4(str);
    }

    public final void R4(long cid) {
        Context contextK1 = k1();
        if (contextK1 == null) {
            return;
        }
        q.b bVar = new q.b(contextK1, contextK1.getString(R.string.passcode), "", "", "", 1);
        bVar.f29596u = 2;
        v3.q.q4(bVar).g4(j1(), "join.ii.ch.passcode:" + cid);
    }

    @Override // v3.f0
    protected void D4(String newText) {
        rd.m.e(newText, "newText");
        O4(newText);
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        rd.m.e(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.add) {
            FragmentShowActivity.h2(x3(), null, k.class);
            return true;
        }
        if (itemId != R.id.search) {
            return super.F2(item);
        }
        Q();
        return true;
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        Bundle bundleI1 = i1();
        if (bundleI1 == null) {
            return;
        }
        long j10 = bundleI1.getLong("cid");
        int i10 = bundleI1.getInt("passcode");
        if (j10 > 0) {
            this.joinByLink = true;
            M4(j10, i10);
            bundleI1.remove("cid");
        }
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        RecyclerView recyclerView;
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        q0 q0Var = this.binding;
        if (q0Var != null && (recyclerView = q0Var.f21451b) != null) {
            recyclerView.setAdapter(this.adapter);
        }
        P4(this, null, 1, null);
    }

    @Override // c6.i
    /* JADX INFO: renamed from: Q4 */
    public boolean V0(Im.IIChannel item, int action) {
        rd.m.e(item, "item");
        if (action == R.id.join) {
            if (item.getHasPasscode()) {
                R4(item.getId());
                return true;
            }
            M4(item.getId(), 0);
        }
        return true;
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o sender, int what, int arg1, int arg2, Object obj) {
        String strP1;
        if (what != R.id.what_dialog_onclick || sender == null || (strP1 = sender.P1()) == null || !rg.q.J(strP1, "join.ii.ch.passcode:", false, 2, null)) {
            return super.f4(sender, what, arg1, arg2, obj);
        }
        if (arg1 != -1) {
            return true;
        }
        rd.m.c(obj, "null cannot be cast to non-null type kotlin.String");
        try {
            int i10 = Integer.parseInt((String) obj);
            String strSubstring = strP1.substring(20);
            rd.m.d(strSubstring, "substring(...)");
            M4(Long.parseLong(strSubstring), i10);
            return true;
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
            return true;
        }
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        y4(R.string.channel);
        G3(true);
        this.adapter = new s(this);
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.o_iichannel_list, menu);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_iichannel_list, container, false);
        if (viewInflate instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) viewInflate;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.l(new c6.m(recyclerView.getContext(), 0));
        }
        this.binding = q0.a(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    @Override // v3.f0, v3.e0
    public v3.e0 getSearchable() {
        return this;
    }
}
