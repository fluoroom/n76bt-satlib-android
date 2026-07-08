package u4;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.PopupMenu;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Um;
import com.benshikj.ht.rpc.UserGrpc;
import com.benshikj.ii.II;
import com.dw.ht.activitys.ContactDetailsActivity;
import java.util.List;
import m4.n0;
import u4.j0;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f28076d;

    public j0(List list) {
        rd.m.e(list, "values");
        this.f28076d = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        rd.m.e(aVar, "holder");
        Um.UserInfo userInfo = (Um.UserInfo) this.f28076d.get(i10);
        aVar.Y(userInfo);
        aVar.T().setText(userInfo.getUsername() + '(' + userInfo.getUid() + ')');
        aVar.S().setText(userInfo.getNickname());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        rd.m.e(viewGroup, "parent");
        n0 n0VarB = n0.b(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        rd.m.d(n0VarB, "inflate(...)");
        return new a(this, n0VarB);
    }

    public final void F(List list) {
        rd.m.e(list, "value");
        this.f28076d = list;
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.f28076d.size();
    }

    public final class a extends RecyclerView.f0 implements View.OnClickListener {
        private final TextView D;
        private final TextView E;
        private final View F;
        private Um.UserInfo G;
        final /* synthetic */ j0 H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, n0 n0Var) {
            super(n0Var.f21373c);
            rd.m.e(n0Var, "binding");
            this.H = j0Var;
            TextView textView = n0Var.f21375e;
            rd.m.d(textView, "username");
            this.D = textView;
            TextView textView2 = n0Var.f21372b;
            rd.m.d(textView2, "nickname");
            this.E = textView2;
            ConstraintLayout constraintLayout = n0Var.f21373c;
            rd.m.d(constraintLayout, "root");
            this.F = constraintLayout;
            n0Var.f21374d.setOnClickListener(this);
            constraintLayout.setOnClickListener(this);
        }

        private final void R(Um.UserInfo userInfo) {
            II.RPC rpc;
            UserGrpc.UserStub userStub;
            II iiA = com.dw.ht.ii.a.a();
            if (iiA == null || (rpc = iiA.RPC) == null || (userStub = rpc.getUserStub()) == null) {
                return;
            }
            userStub.doActionForUsers(Um.DoActionForUsersRequest.newBuilder().addUserIDs(userInfo.getUid()).addActions(Um.ActionForUser.Delete).build(), new C0391a());
            dd.d0 d0Var = dd.d0.f10897a;
        }

        private final void U(Um.UserInfo userInfo) {
            II.RPC rpc;
            UserGrpc.UserStub userStub;
            II iiA = com.dw.ht.ii.a.a();
            if (iiA == null || (rpc = iiA.RPC) == null || (userStub = rpc.getUserStub()) == null) {
                return;
            }
            userStub.doActionForUsers(Um.DoActionForUsersRequest.newBuilder().addUserIDs(userInfo.getUid()).addActions(Um.ActionForUser.Logout).addActions(Um.ActionForUser.Lock).build(), new b());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean V(View view, final Um.UserInfo userInfo, final a aVar, MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.delete) {
                new c.a(view.getContext()).z("删除用户 \"" + userInfo.getNickname() + '\"').k("注意此操作无法恢复。").m(android.R.string.cancel, null).t(R.string.delete, new DialogInterface.OnClickListener() { // from class: u4.g0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        j0.a.W(this.f28068a, userInfo, dialogInterface, i10);
                    }
                }).C();
                return true;
            }
            if (itemId != R.id.lock) {
                return false;
            }
            new c.a(view.getContext()).z("锁定用户 \"" + userInfo.getNickname() + '\"').k("锁定用户会清除用户的已登录会话并禁止他再次登录。").m(android.R.string.cancel, null).u("锁定", new DialogInterface.OnClickListener() { // from class: u4.h0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    j0.a.X(this.f28071a, userInfo, dialogInterface, i10);
                }
            }).C();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void W(a aVar, Um.UserInfo userInfo, DialogInterface dialogInterface, int i10) {
            aVar.R(userInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void X(a aVar, Um.UserInfo userInfo, DialogInterface dialogInterface, int i10) {
            aVar.U(userInfo);
        }

        public final TextView S() {
            return this.E;
        }

        public final TextView T() {
            return this.D;
        }

        public final void Y(Um.UserInfo userInfo) {
            this.G = userInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(final View view) {
            rd.m.e(view, "v");
            final Um.UserInfo userInfo = this.G;
            if (userInfo == null) {
                return;
            }
            int id2 = view.getId();
            if (id2 == R.id.root) {
                Intent intent = new Intent(view.getContext(), (Class<?>) ContactDetailsActivity.class);
                intent.putExtra("com.dw.ht.intent.extras.UID", userInfo.getUid());
                v3.j.e(view.getContext(), intent);
            } else {
                if (id2 != R.id.settings) {
                    return;
                }
                PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
                popupMenu.getMenuInflater().inflate(R.menu.iiuser, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: u4.f0
                    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return j0.a.V(view, userInfo, this, menuItem);
                    }
                });
                popupMenu.show();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f0
        public String toString() {
            return super.toString() + " '" + ((Object) this.E.getText()) + '\'';
        }

        /* JADX INFO: renamed from: u4.j0$a$a, reason: collision with other inner class name */
        public static final class C0391a implements io.grpc.stub.j {
            C0391a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(a aVar) {
                Toast.makeText(aVar.T().getContext(), "用户已删除", 0).show();
            }

            @Override // io.grpc.stub.j
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onNext(Um.DoActionForUsersResult doActionForUsersResult) {
                System.out.print(doActionForUsersResult);
                TextView textViewT = a.this.T();
                final a aVar = a.this;
                textViewT.post(new Runnable() { // from class: u4.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j0.a.C0391a.c(aVar);
                    }
                });
            }

            @Override // io.grpc.stub.j
            public void onError(Throwable th2) {
                if (th2 != null) {
                    th2.printStackTrace();
                }
            }

            @Override // io.grpc.stub.j
            public void onCompleted() {
            }
        }

        public static final class b implements io.grpc.stub.j {
            b() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(a aVar) {
                Toast.makeText(aVar.T().getContext(), "用户已锁定", 0).show();
            }

            @Override // io.grpc.stub.j
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onNext(Um.DoActionForUsersResult doActionForUsersResult) {
                System.out.print(doActionForUsersResult);
                TextView textViewT = a.this.T();
                final a aVar = a.this;
                textViewT.post(new Runnable() { // from class: u4.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        j0.a.b.c(aVar);
                    }
                });
            }

            @Override // io.grpc.stub.j
            public void onError(Throwable th2) {
                if (th2 != null) {
                    th2.printStackTrace();
                }
            }

            @Override // io.grpc.stub.j
            public void onCompleted() {
            }
        }
    }
}
