package com.dw.ht.ii;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Um;
import com.benshikj.ht.rpc.UserGrpc;
import com.benshikj.ii.II;
import dd.d0;
import dd.s;
import hd.e;
import id.b;
import java.util.ArrayList;
import java.util.List;
import jd.m;
import kotlin.Metadata;
import qb.x1;
import qd.p;
import tg.g;
import tg.p0;
import u4.j0;
import u4.w;
import v3.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\"\u0010\bR\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/dw/ht/ii/IIUserFragment;", "Lu4/w;", "<init>", "()V", "", "queryText", "Ldd/d0;", "I4", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "", "F2", "(Landroid/view/MenuItem;)Z", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lv3/e0;", "getSearchable", "()Lv3/e0;", "newText", "D4", "Lu4/j0;", "I0", "Lu4/j0;", "adapter", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IIUserFragment extends w {

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private j0 adapter;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f6322f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Um.GetUserInfosRequest.Builder f6323g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ IIUserFragment f6324h;

        /* JADX INFO: renamed from: com.dw.ht.ii.IIUserFragment$a$a, reason: collision with other inner class name */
        static final class C0090a extends m implements p {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f6325e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ IIUserFragment f6326f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Um.GetUserInfosResult f6327g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0090a(IIUserFragment iIUserFragment, Um.GetUserInfosResult getUserInfosResult, e eVar) {
                super(2, eVar);
                this.f6326f = iIUserFragment;
                this.f6327g = getUserInfosResult;
            }

            @Override // jd.a
            public final e g(Object obj, e eVar) {
                return new C0090a(this.f6326f, this.f6327g, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                b.e();
                if (this.f6325e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                j0 j0Var = this.f6326f.adapter;
                if (j0Var != null) {
                    List<Um.UserInfo> usersList = this.f6327g.getUsersList();
                    rd.m.d(usersList, "getUsersList(...)");
                    j0Var.F(usersList);
                }
                return d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object s(tg.d0 d0Var, e eVar) {
                return ((C0090a) g(d0Var, eVar)).o(d0.f10897a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Um.GetUserInfosRequest.Builder builder, IIUserFragment iIUserFragment, e eVar) {
            super(2, eVar);
            this.f6323g = builder;
            this.f6324h = iIUserFragment;
        }

        @Override // jd.a
        public final e g(Object obj, e eVar) {
            a aVar = new a(this.f6323g, this.f6324h, eVar);
            aVar.f6322f = obj;
            return aVar;
        }

        @Override // jd.a
        public final Object o(Object obj) {
            II.RPC rpc;
            UserGrpc.UserBlockingStub userBlockingStub;
            Um.GetUserInfosResult userInfos;
            tg.d0 d0Var = (tg.d0) this.f6322f;
            b.e();
            if (this.f6321e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            try {
                II iiA = com.dw.ht.ii.a.a();
                if (iiA != null && (rpc = iiA.RPC) != null && (userBlockingStub = rpc.getUserBlockingStub()) != null && (userInfos = userBlockingStub.getUserInfos(this.f6323g.build())) != null) {
                    g.b(d0Var, p0.c(), null, new C0090a(this.f6324h, userInfos, null), 2, null);
                }
            } catch (x1 e10) {
                e10.printStackTrace();
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object s(tg.d0 d0Var, e eVar) {
            return ((a) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    private final void I4(String queryText) {
        Um.GetUserInfosRequest.Builder offset = Um.GetUserInfosRequest.newBuilder().setLimit(100).setOffset(0);
        if (queryText != null) {
            offset.setQueryText(queryText);
        }
        g.b(u.a(this), p0.b(), null, new a(offset, this, null), 2, null);
    }

    @Override // v3.f0
    protected void D4(String newText) {
        rd.m.e(newText, "newText");
        if (newText.length() != 0) {
            I4(newText);
            return;
        }
        j0 j0Var = this.adapter;
        if (j0Var != null) {
            j0Var.F(new ArrayList());
        }
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        rd.m.e(item, "item");
        if (item.getItemId() != R.id.search) {
            return super.F2(item);
        }
        Q();
        return true;
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        G3(true);
        this.adapter = new j0(new ArrayList());
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.o_iiuser_list, menu);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_ii_user_list, container, false);
        if (viewInflate instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) viewInflate;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.adapter);
            recyclerView.l(new c6.m(recyclerView.getContext(), 0));
        }
        return viewInflate;
    }

    @Override // v3.f0, v3.e0
    public e0 getSearchable() {
        return this;
    }
}
