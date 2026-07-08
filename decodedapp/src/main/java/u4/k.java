package u4;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.IHTGrpc;
import com.benshikj.ht.rpc.Im;
import com.benshikj.ii.II;
import com.benshikj.ii.Observer;
import com.dw.ht.channels.ChannelEditorFragment;
import com.dw.ht.user.a;
import e1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l4.l;
import m4.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u0003J!\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001d2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0014¢\u0006\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00103\u001a\u00020.8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R0\u0010;\u001a\b\u0012\u0004\u0012\u000205042\f\u00106\u001a\b\u0012\u0004\u0012\u000205048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010A\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010=0=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR*\u0010V\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010)\"\u0004\bU\u0010\tR(\u0010[\u001a\u0004\u0018\u00010B2\b\u00106\u001a\u0004\u0018\u00010B8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z¨\u0006\\"}, d2 = {"Lu4/k;", "Lu4/w;", "<init>", "()V", "Ldd/d0;", "k5", "", "needConfirm", "S4", "(Z)V", "g5", "l5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "F2", "(Landroid/view/MenuItem;)Z", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/fragment/app/o;", "childFragment", "p2", "(Landroidx/fragment/app/o;)V", "c4", "()Z", "Lm4/p0;", "I0", "Lm4/p0;", "binding", "Lu4/o;", "J0", "Ldd/j;", "X4", "()Lu4/o;", "model", "", "Lu4/l0;", "value", "K0", "Ljava/util/List;", "j5", "(Ljava/util/List;)V", "serverLocations", "Lf/c;", "", "kotlin.jvm.PlatformType", "L0", "Lf/c;", "getChannel", "Lg5/a;", "M0", "Lg5/a;", "_channel", "Lcom/dw/ht/channels/ChannelEditorFragment;", "N0", "Lcom/dw/ht/channels/ChannelEditorFragment;", "rfChannelEditor", "", "O0", "[I", "bitRates", "", "P0", "J", "channelId", "Q0", "Z", "getHaveRfConfig", "i5", "haveRfConfig", "V4", "()Lg5/a;", "h5", "(Lg5/a;)V", "channel", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends w {

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private p0 binding;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private final dd.j model;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private List serverLocations;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private final f.c getChannel;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private g5.a _channel;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private ChannelEditorFragment rfChannelEditor;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private int[] bitRates;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private long channelId;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private boolean haveRfConfig;

    public static final class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            k.T4(k.this, false, 1, null);
        }
    }

    static final class c implements androidx.lifecycle.c0, rd.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ qd.l f28087a;

        c(qd.l lVar) {
            rd.m.e(lVar, "function");
            this.f28087a = lVar;
        }

        @Override // rd.i
        public final dd.d a() {
            return this.f28087a;
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void b(Object obj) {
            this.f28087a.l(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.c0) && (obj instanceof rd.i)) {
                return rd.m.a(a(), ((rd.i) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final class d implements Observer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f28089b;

        static final class a extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f28090e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k f28091f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, hd.e eVar) {
                super(2, eVar);
                this.f28091f = kVar;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new a(this.f28091f, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f28090e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                androidx.fragment.app.p pVarE1 = this.f28091f.e1();
                if (pVarE1 != null) {
                    pVarE1.finish();
                }
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((a) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        static final class b extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f28092e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Throwable f28093f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k f28094g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ p0 f28095h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Throwable th2, k kVar, p0 p0Var, hd.e eVar) {
                super(2, eVar);
                this.f28093f = th2;
                this.f28094g = kVar;
                this.f28095h = p0Var;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new b(this.f28093f, this.f28094g, this.f28095h, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                String localizedMessage;
                id.b.e();
                if (this.f28092e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                Throwable th2 = this.f28093f;
                if (th2 != null && (localizedMessage = th2.getLocalizedMessage()) != null) {
                    k kVar = this.f28094g;
                    p0 p0Var = this.f28095h;
                    if (rg.q.N(localizedMessage, "duplicate entry", true) || rg.q.N(localizedMessage, "UNIQUE", true)) {
                        Toast.makeText(kVar.x3(), R.string.remind_nameAlreadyOccupied, 1).show();
                        jd.b.a(p0Var.f21430f.requestFocus());
                    } else {
                        Toast.makeText(kVar.x3(), localizedMessage, 1).show();
                    }
                }
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((b) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        d(p0 p0Var) {
            this.f28089b = p0Var;
        }

        @Override // com.benshikj.ii.Observer
        public void onCompleted() {
            tg.g.b(androidx.lifecycle.u.a(k.this), tg.p0.c(), null, new a(k.this, null), 2, null);
        }

        @Override // com.benshikj.ii.Observer
        public void onError(Throwable th2) {
            com.benshikj.ii.m.b(this, th2);
            tg.g.b(androidx.lifecycle.u.a(k.this), tg.p0.c(), null, new b(th2, k.this, this.f28089b, null), 2, null);
        }
    }

    public static final class e extends rd.o implements qd.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.o f28096b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.fragment.app.o oVar) {
            super(0);
            this.f28096b = oVar;
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.o a() {
            return this.f28096b;
        }
    }

    public static final class f extends rd.o implements qd.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ qd.a f28097b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(qd.a aVar) {
            super(0);
            this.f28097b = aVar;
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y0 a() {
            return (y0) this.f28097b.a();
        }
    }

    public static final class g extends rd.o implements qd.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ dd.j f28098b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(dd.j jVar) {
            super(0);
            this.f28098b = jVar;
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x0 a() {
            return y0.p.c(this.f28098b).U();
        }
    }

    public static final class h extends rd.o implements qd.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ qd.a f28099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ dd.j f28100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(qd.a aVar, dd.j jVar) {
            super(0);
            this.f28099b = aVar;
            this.f28100c = jVar;
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e1.a a() {
            e1.a aVar;
            qd.a aVar2 = this.f28099b;
            if (aVar2 != null && (aVar = (e1.a) aVar2.a()) != null) {
                return aVar;
            }
            y0 y0VarC = y0.p.c(this.f28100c);
            androidx.lifecycle.k kVar = y0VarC instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) y0VarC : null;
            return kVar != null ? kVar.B() : a.b.f11336c;
        }
    }

    public static final class i extends rd.o implements qd.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.o f28101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ dd.j f28102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(androidx.fragment.app.o oVar, dd.j jVar) {
            super(0);
            this.f28101b = oVar;
            this.f28102c = jVar;
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0.c a() {
            v0.c cVarA;
            y0 y0VarC = y0.p.c(this.f28102c);
            androidx.lifecycle.k kVar = y0VarC instanceof androidx.lifecycle.k ? (androidx.lifecycle.k) y0VarC : null;
            return (kVar == null || (cVarA = kVar.A()) == null) ? this.f28101b.A() : cVarA;
        }
    }

    public k() {
        dd.j jVarA = dd.k.a(dd.n.f10911c, new f(new e(this)));
        this.model = y0.p.b(this, rd.c0.b(o.class), new g(jVarA), new h(null, jVarA), new i(this, jVarA));
        this.serverLocations = new ArrayList(0);
        f.c cVarR3 = r3(new l.b(), new f.b() { // from class: u4.b
            @Override // f.b
            public final void a(Object obj) {
                k.W4(this.f28041a, (l.c) obj);
            }
        });
        rd.m.d(cVarR3, "registerForActivityResult(...)");
        this.getChannel = cVarR3;
    }

    private final void S4(boolean needConfirm) {
        String string;
        final Context contextK1 = k1();
        if (!needConfirm || contextK1 == null) {
            com.dw.ht.user.a aVarF4 = F4();
            if (aVarF4 != null) {
                aVarF4.d(new a.b() { // from class: u4.a
                    @Override // com.dw.ht.user.a.b
                    public final void a(String str) {
                        k.U4(this.f28038a, contextK1, str);
                    }
                });
                return;
            }
            return;
        }
        c.a aVar = new c.a(x3());
        g5.a aVarV4 = V4();
        if (aVarV4 == null || (string = aVarV4.f13535g) == null) {
            string = contextK1.getString(R.string.networkChannel);
            rd.m.d(string, "getString(...)");
        }
        aVar.k(contextK1.getString(R.string.prompt_del, string)).t(R.string.delete, new a()).m(android.R.string.cancel, null).C();
    }

    static /* synthetic */ void T4(k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        kVar.S4(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(k kVar, Context context, String str) {
        II.RPC rpc;
        IHTGrpc.IHTStub iHTStub;
        II iiG4 = kVar.G4();
        if (iiG4 == null || (rpc = iiG4.RPC) == null || (iHTStub = rpc.getIHTStub()) == null) {
            return;
        }
        iHTStub.deleteChannel(Im.DeleteChannelRequest.newBuilder().setChannelID(kVar.channelId).build(), kVar.new b(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W4(k kVar, l.c cVar) {
        d5.a aVarG;
        if (cVar == null || (aVarG = d5.a.G(cVar.f20399b)) == null) {
            return;
        }
        aVarG.i(0L);
        g5.a aVar = kVar._channel;
        if (aVar != null) {
            aVar.c(aVarG);
        }
        kVar.i5(true);
        kVar.l5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(k kVar, DialogInterface dialogInterface, int i10) {
        rd.m.e(dialogInterface, "<unused var>");
        kVar.g5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z4(k kVar, DialogInterface dialogInterface, int i10) {
        rd.m.e(dialogInterface, "<unused var>");
        androidx.fragment.app.p pVarE1 = kVar.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 a5(k kVar, List list) {
        rd.m.b(list);
        kVar.j5(list);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 b5(k kVar, Im.ChannelFields channelFields) {
        g5.a aVar = new g5.a();
        aVar.f(channelFields);
        kVar.h5(aVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 c5(k kVar, Exception exc) {
        Context contextK1 = kVar.k1();
        if (contextK1 == null) {
            return dd.d0.f10897a;
        }
        Toast.makeText(contextK1, exc.getLocalizedMessage(), 1).show();
        androidx.fragment.app.p pVarE1 = kVar.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d5(k kVar, View view) {
        kVar.i5(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e5(k kVar, View view) {
        kVar.i5(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f5(k kVar, View view) {
        kVar.getChannel.a(0);
    }

    private final void g5() {
        p0 p0Var;
        II.ChannelManager channelManager;
        g5.a aVarV4 = V4();
        if (aVarV4 == null || (p0Var = this.binding) == null) {
            return;
        }
        String str = aVarV4.f13535g;
        rd.m.d(str, "name");
        if (str.length() == 0) {
            p0Var.f21430f.requestFocus();
            return;
        }
        II iiG4 = G4();
        if (iiG4 == null || (channelManager = iiG4.channelManager) == null) {
            return;
        }
        channelManager.saveChannel(Im.SaveChannelRequest.newBuilder().setChannel(aVarV4.g()).build(), new d(p0Var));
    }

    private final void j5(List list) {
        LinearLayout linearLayout;
        Spinner spinner;
        this.serverLocations = list;
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        ArrayAdapter arrayAdapter = new ArrayAdapter(contextX3, android.R.layout.simple_spinner_item, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p0 p0Var = this.binding;
        if (p0Var != null && (spinner = p0Var.f21434j) != null) {
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        }
        p0 p0Var2 = this.binding;
        if (p0Var2 != null && (linearLayout = p0Var2.f21435k) != null) {
            linearLayout.setVisibility(!list.isEmpty() ? 0 : 8);
        }
        k5();
    }

    private final void k5() {
        p0 p0Var = this.binding;
        if (p0Var == null) {
            return;
        }
        g5.a aVar = this._channel;
        String str = aVar != null ? aVar.f13540l : null;
        if (str == null) {
            p0Var.f21434j.setSelection(0);
            return;
        }
        Iterator it = this.serverLocations.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (rd.m.a(((l0) it.next()).a().getId(), str)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            p0Var.f21434j.setSelection(i10);
        } else {
            p0Var.f21434j.setSelection(0);
        }
    }

    private final void l5() {
        g5.a aVar;
        p0 p0Var = this.binding;
        if (p0Var == null || (aVar = this._channel) == null) {
            return;
        }
        p0Var.f21430f.setText(aVar.f13535g);
        EditText editText = p0Var.f21431g;
        int i10 = aVar.f13536h;
        editText.setText(i10 == 0 ? "" : String.valueOf(i10));
        int[] iArr = this.bitRates;
        rd.m.b(iArr);
        int iK = ed.j.K(iArr, aVar.f13537i);
        if (iK >= 0) {
            p0Var.f21427c.setSelection(iK);
        }
        int i11 = aVar.f13538j;
        if (i11 < 0 || i11 >= 3) {
            i11 = -1;
        }
        p0Var.f21436l.setSelection(i11);
        ChannelEditorFragment channelEditorFragment = this.rfChannelEditor;
        if (channelEditorFragment == null) {
            rd.m.o("rfChannelEditor");
            channelEditorFragment = null;
        }
        channelEditorFragment.a5(aVar.b());
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        rd.m.e(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.delete) {
            S4(true);
            return true;
        }
        if (itemId != R.id.save) {
            return super.F2(item);
        }
        g5();
        return true;
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        p0 p0Var = this.binding;
        if (p0Var == null) {
            return;
        }
        p0Var.f21426b.setOnClickListener(new View.OnClickListener() { // from class: u4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k.d5(this.f28060a, view2);
            }
        });
        p0Var.f21428d.setOnClickListener(new View.OnClickListener() { // from class: u4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k.e5(this.f28063a, view2);
            }
        });
        p0Var.f21429e.setOnClickListener(new View.OnClickListener() { // from class: u4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k.f5(this.f28067a, view2);
            }
        });
        l5();
    }

    public final g5.a V4() {
        Im.ServerLocation serverLocationA;
        String id2;
        g5.a aVar = this._channel;
        p0 p0Var = this.binding;
        if (p0Var == null) {
            return aVar;
        }
        if (aVar == null) {
            aVar = new g5.a();
        }
        aVar.f13535g = rg.q.W0(p0Var.f21430f.getText().toString()).toString();
        String string = rg.q.W0(p0Var.f21431g.getText().toString()).toString();
        if (string.length() == 0) {
            aVar.f13536h = 0;
        } else {
            aVar.f13536h = Integer.parseInt(string);
        }
        int selectedItemPosition = p0Var.f21436l.getSelectedItemPosition();
        aVar.f13538j = selectedItemPosition >= 0 ? selectedItemPosition : 0;
        int[] iArr = this.bitRates;
        if (iArr != null) {
            rd.m.b(iArr);
            aVar.f13537i = iArr[p0Var.f21427c.getSelectedItemPosition()];
        }
        this._channel = aVar;
        if (this.haveRfConfig) {
            ChannelEditorFragment channelEditorFragment = this.rfChannelEditor;
            if (channelEditorFragment == null) {
                rd.m.o("rfChannelEditor");
                channelEditorFragment = null;
            }
            d5.a aVarH5 = channelEditorFragment.h5(true);
            if (aVarH5 == null) {
                return null;
            }
            aVar.c(aVarH5);
        } else {
            aVar.c(null);
        }
        Object selectedItem = p0Var.f21434j.getSelectedItem();
        l0 l0Var = selectedItem instanceof l0 ? (l0) selectedItem : null;
        if (l0Var != null && (serverLocationA = l0Var.a()) != null && (id2 = serverLocationA.getId()) != null) {
            aVar.f13540l = id2;
        }
        return aVar;
    }

    public final o X4() {
        return (o) this.model.getValue();
    }

    @Override // v3.f0, v3.v
    protected boolean c4() {
        p0 p0Var = this.binding;
        if (p0Var == null) {
            return false;
        }
        Editable text = p0Var.f21430f.getText();
        rd.m.d(text, "getText(...)");
        if (text.length() == 0) {
            return false;
        }
        new c.a(x3()).k(N1(R.string.saveChangesQ)).p(N1(android.R.string.cancel), null).t(R.string.save, new DialogInterface.OnClickListener() { // from class: u4.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                k.Y4(this.f28043a, dialogInterface, i10);
            }
        }).n(N1(R.string.discard), new DialogInterface.OnClickListener() { // from class: u4.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                k.Z4(this.f28045a, dialogInterface, i10);
            }
        }).C();
        return true;
    }

    public final void h5(g5.a aVar) {
        this._channel = aVar;
        if (aVar == null) {
            return;
        }
        i5(aVar.b() != null);
        l5();
        k5();
    }

    public final void i5(boolean z10) {
        if (this.haveRfConfig == z10) {
            return;
        }
        this.haveRfConfig = z10;
        p0 p0Var = this.binding;
        if (p0Var == null) {
            return;
        }
        if (z10) {
            p0Var.f21426b.setVisibility(8);
            p0Var.f21428d.setVisibility(0);
            p0Var.f21433i.setVisibility(0);
        } else {
            p0Var.f21426b.setVisibility(0);
            p0Var.f21428d.setVisibility(8);
            p0Var.f21433i.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.o
    public void p2(androidx.fragment.app.o childFragment) {
        rd.m.e(childFragment, "childFragment");
        super.p2(childFragment);
        if (childFragment instanceof ChannelEditorFragment) {
            ChannelEditorFragment channelEditorFragment = (ChannelEditorFragment) childFragment;
            channelEditorFragment.b5(true);
            this.rfChannelEditor = channelEditorFragment;
        }
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        G3(true);
        this.bitRates = x3().getResources().getIntArray(R.array.iiBitRatesValue);
        Bundle bundleI1 = i1();
        if (bundleI1 != null) {
            this.channelId = bundleI1.getLong("channel_id");
        }
        X4().u(this.channelId);
        X4().p().h(this, new c(new qd.l() { // from class: u4.h
            @Override // qd.l
            public final Object l(Object obj) {
                return k.a5(this.f28070a, (List) obj);
            }
        }));
        X4().l().h(this, new c(new qd.l() { // from class: u4.i
            @Override // qd.l
            public final Object l(Object obj) {
                return k.b5(this.f28073a, (Im.ChannelFields) obj);
            }
        }));
        X4().o().h(this, new c(new qd.l() { // from class: u4.j
            @Override // qd.l
            public final Object l(Object obj) {
                return k.c5(this.f28075a, (Exception) obj);
            }
        }));
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.o_iichannel_editor, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.delete);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(this.channelId != 0);
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        z4(this.channelId == 0 ? N1(R.string.newChannel) : N1(R.string.editChannel));
        p0 p0VarC = p0.c(inflater, container, false);
        this.binding = p0VarC;
        rd.m.b(p0VarC);
        ScrollView scrollViewB = p0VarC.b();
        rd.m.d(scrollViewB, "getRoot(...)");
        return scrollViewB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    public static final class b implements io.grpc.stub.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f28081b;

        static final class a extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f28082e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k f28083f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, hd.e eVar) {
                super(2, eVar);
                this.f28083f = kVar;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new a(this.f28083f, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f28082e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                androidx.fragment.app.p pVarE1 = this.f28083f.e1();
                if (pVarE1 != null) {
                    pVarE1.finish();
                }
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((a) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        /* JADX INFO: renamed from: u4.k$b$b, reason: collision with other inner class name */
        static final class C0392b extends jd.m implements qd.p {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f28084e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Context f28085f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Throwable f28086g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0392b(Context context, Throwable th2, hd.e eVar) {
                super(2, eVar);
                this.f28085f = context;
                this.f28086g = th2;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new C0392b(this.f28085f, this.f28086g, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f28084e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dd.s.b(obj);
                Context context = this.f28085f;
                if (context == null) {
                    return dd.d0.f10897a;
                }
                Toast.makeText(context, this.f28086g.getLocalizedMessage(), 1).show();
                return dd.d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((C0392b) g(d0Var, eVar)).o(dd.d0.f10897a);
            }
        }

        b(Context context) {
            this.f28081b = context;
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
            d0.f28046a.o(k.this.channelId);
            tg.g.b(androidx.lifecycle.u.a(k.this), tg.p0.c(), null, new a(k.this, null), 2, null);
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            if (th2 == null) {
                return;
            }
            tg.g.b(androidx.lifecycle.u.a(k.this), tg.p0.c(), null, new C0392b(this.f28081b, th2, null), 2, null);
        }

        @Override // io.grpc.stub.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Im.DeleteChannelResult deleteChannelResult) {
        }
    }
}
