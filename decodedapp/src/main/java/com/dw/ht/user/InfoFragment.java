package com.dw.ht.user;

import a6.q;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import androidx.appcompat.app.c;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.o;
import androidx.lifecycle.u;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Um;
import com.benshikj.ht.rpc.UserGrpc;
import com.dw.android.widget.ListItemView;
import com.dw.ht.Cfg;
import com.dw.ht.user.InfoFragment;
import com.dw.ht.user.a;
import com.dw.ht.user.b;
import com.google.protobuf.l;
import dd.d0;
import dd.s;
import jd.m;
import kotlin.Metadata;
import m4.i;
import m4.t1;
import n5.n0;
import org.greenrobot.eventbus.ThreadMode;
import qb.u1;
import qb.x1;
import qd.p;
import rd.b0;
import tg.g;
import tg.p0;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\tJ\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0003J+\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u0003J!\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b,\u0010-J;\u00107\u001a\u0002062\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\b\u00105\u001a\u0004\u0018\u000104H\u0014¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0004H\u0016¢\u0006\u0004\b9\u0010\u0003J\u001b\u0010<\u001a\u00020\u00042\n\u0010\f\u001a\u00060:j\u0002`;H\u0014¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0004H\u0014¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u0004H\u0016¢\u0006\u0004\b?\u0010\u0003J\u000f\u0010@\u001a\u00020\u0004H\u0016¢\u0006\u0004\b@\u0010\u0003J\u0017\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020AH\u0007¢\u0006\u0004\bC\u0010DJ\u0017\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020EH\u0007¢\u0006\u0004\bC\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006V"}, d2 = {"Lcom/dw/ht/user/InfoFragment;", "Ln5/n0;", "<init>", "()V", "Ldd/d0;", "o5", "", "photo", "B5", "([B)V", "i5", "", "e", "n5", "(Ljava/lang/Throwable;)V", "Lcom/benshikj/ht/rpc/Um$UserProfile;", "r", "l5", "(Lcom/benshikj/ht/rpc/Um$UserProfile;)V", "k5", "m5", "g5", "E5", "", "nickname", "C5", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/graphics/Bitmap;", "K4", "(Landroid/graphics/Bitmap;)V", "A5", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/fragment/app/o;", "sender", "", "what", "arg1", "arg2", "", "obj", "", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "M2", "Ljava/lang/Exception;", "Lkotlin/Exception;", "I4", "(Ljava/lang/Exception;)V", "H4", "O2", "P2", "Lcom/dw/ht/user/a$a;", "event", "onMessageEvent", "(Lcom/dw/ht/user/a$a;)V", "Lcom/dw/ht/user/b$a;", "(Lcom/dw/ht/user/b$a;)V", "Lm4/t1;", "I0", "Lm4/t1;", "binding", "Lcom/dw/ht/user/b;", "J0", "Lcom/dw/ht/user/b;", "mUserInfo", "Lcom/dw/ht/user/a;", "K0", "Lcom/dw/ht/user/a;", "mAuthStateManager", "L0", "Z", "mIsAuthorized", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InfoFragment extends n0 {

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private t1 binding;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private com.dw.ht.user.b mUserInfo;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private com.dw.ht.user.a mAuthStateManager;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private boolean mIsAuthorized;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6772a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f6773b;

        static {
            int[] iArr = new int[a.EnumC0104a.values().length];
            try {
                iArr[a.EnumC0104a.Login.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6772a = iArr;
            int[] iArr2 = new int[b.a.values().length];
            try {
                iArr2[b.a.f6870c.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f6773b = iArr2;
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: e */
        int f6774e;

        b(hd.e eVar) {
            super(2, eVar);
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return InfoFragment.this.new b(eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f6774e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            try {
                UserGrpc.UserBlockingStub userBlockingStubH = f5.d.f12792a.h();
                Um.DeleteUserRequest.Builder builderNewBuilder = Um.DeleteUserRequest.newBuilder();
                com.dw.ht.user.b bVar = InfoFragment.this.mUserInfo;
                if (bVar == null) {
                    rd.m.o("mUserInfo");
                    bVar = null;
                }
                userBlockingStubH.deleteUsers(builderNewBuilder.addUserIDs(bVar.i()).build());
                InfoFragment.this.m5();
            } catch (Throwable th2) {
                InfoFragment.this.n5(th2);
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((b) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: e */
        int f6776e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Object f6777f;

        static final class a extends m implements p {

            /* JADX INFO: renamed from: e */
            int f6779e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ Um.LoadProfileResult f6780f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ InfoFragment f6781g;

            /* JADX INFO: renamed from: com.dw.ht.user.InfoFragment$c$a$a */
            public static final /* synthetic */ class C0099a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f6782a;

                static {
                    int[] iArr = new int[Um.LoadProfileResult.Status.values().length];
                    try {
                        iArr[Um.LoadProfileResult.Status.ok.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f6782a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Um.LoadProfileResult loadProfileResult, InfoFragment infoFragment, hd.e eVar) {
                super(2, eVar);
                this.f6780f = loadProfileResult;
                this.f6781g = infoFragment;
            }

            @Override // jd.a
            public final hd.e g(Object obj, hd.e eVar) {
                return new a(this.f6780f, this.f6781g, eVar);
            }

            @Override // jd.a
            public final Object o(Object obj) {
                id.b.e();
                if (this.f6779e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                Um.LoadProfileResult.Status status = this.f6780f.getStatus();
                if ((status == null ? -1 : C0099a.f6782a[status.ordinal()]) == 1) {
                    this.f6781g.l5(this.f6780f.getData());
                }
                return d0.f10897a;
            }

            @Override // qd.p
            /* JADX INFO: renamed from: t */
            public final Object s(tg.d0 d0Var, hd.e eVar) {
                return ((a) g(d0Var, eVar)).o(d0.f10897a);
            }
        }

        c(hd.e eVar) {
            super(2, eVar);
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            c cVar = InfoFragment.this.new c(eVar);
            cVar.f6777f = obj;
            return cVar;
        }

        @Override // jd.a
        public final Object o(Object obj) {
            tg.d0 d0Var = (tg.d0) this.f6777f;
            id.b.e();
            if (this.f6776e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            try {
                g.b(d0Var, p0.c(), null, new a(f5.d.f12792a.h().loadProfile(Um.LoadProfileRequest.newBuilder().setLoadPhoto(true).build()), InfoFragment.this, null), 2, null);
            } catch (Throwable th2) {
                InfoFragment.this.n5(th2);
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((c) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: e */
        int f6783e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Throwable f6784f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ InfoFragment f6785g;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f6786a;

            static {
                int[] iArr = new int[u1.b.values().length];
                try {
                    iArr[u1.b.UNAUTHENTICATED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f6786a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Throwable th2, InfoFragment infoFragment, hd.e eVar) {
            super(2, eVar);
            this.f6784f = th2;
            this.f6785g = infoFragment;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return new d(this.f6784f, this.f6785g, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            u1 u1VarA;
            id.b.e();
            if (this.f6783e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Throwable th2 = this.f6784f;
            u1.b bVarO = null;
            x1 x1Var = th2 instanceof x1 ? (x1) th2 : null;
            if (x1Var != null && (u1VarA = x1Var.a()) != null) {
                bVarO = u1VarA.o();
            }
            if ((bVarO == null ? -1 : a.f6786a[bVarO.ordinal()]) == 1) {
                this.f6785g.m5();
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((d) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: e */
        int f6787e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Um.UserProfile.Builder f6788f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ InfoFragment f6789g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Um.UserProfile.Builder builder, InfoFragment infoFragment, hd.e eVar) {
            super(2, eVar);
            this.f6788f = builder;
            this.f6789g = infoFragment;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return new e(this.f6788f, this.f6789g, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f6787e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            try {
                f5.d.f12792a.h().updateProfile(Um.UpdateProfileRequest.newBuilder().setUpdate(Um.UpdateProfileRequest.Update.newBuilder().setPhoto(true)).setData(this.f6788f).build());
            } catch (Throwable th2) {
                this.f6789g.n5(th2);
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((e) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: e */
        int f6790e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f6791f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ InfoFragment f6792g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, InfoFragment infoFragment, hd.e eVar) {
            super(2, eVar);
            this.f6791f = str;
            this.f6792g = infoFragment;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return new f(this.f6791f, this.f6792g, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f6790e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            try {
                f5.d.f12792a.h().updateProfile(Um.UpdateProfileRequest.newBuilder().setUpdate(Um.UpdateProfileRequest.Update.newBuilder().setNickname(true)).setData(Um.UserProfile.newBuilder().setNickname(this.f6791f)).build());
            } catch (Throwable th2) {
                this.f6792g.n5(th2);
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((f) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    public InfoFragment() {
        M4(180);
    }

    private final void B5(byte[] photo) {
        Um.UserProfile.Builder builderNewBuilder = Um.UserProfile.newBuilder();
        if (photo != null) {
            builderNewBuilder.setPhoto(l.g(photo));
        }
        g.b(u.a(this), p0.b(), null, new e(builderNewBuilder, this, null), 2, null);
    }

    private final void C5(String nickname) {
        t1 t1Var = this.binding;
        if (t1Var == null) {
            return;
        }
        int length = nickname.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = rd.m.f(nickname.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        final String string = nickname.subSequence(i10, length + 1).toString();
        t1Var.f21572g.setDetail(string);
        com.dw.ht.user.b bVar = this.mUserInfo;
        com.dw.ht.user.a aVar = null;
        if (bVar == null) {
            rd.m.o("mUserInfo");
            bVar = null;
        }
        if (q.d(bVar.f(), string)) {
            return;
        }
        com.dw.ht.user.b bVar2 = this.mUserInfo;
        if (bVar2 == null) {
            rd.m.o("mUserInfo");
            bVar2 = null;
        }
        bVar2.q(string);
        ListItemView listItemView = t1Var.f21572g;
        com.dw.ht.user.b bVar3 = this.mUserInfo;
        if (bVar3 == null) {
            rd.m.o("mUserInfo");
            bVar3 = null;
        }
        listItemView.setDetail(bVar3.d());
        if (this.mIsAuthorized) {
            com.dw.ht.user.a aVar2 = this.mAuthStateManager;
            if (aVar2 == null) {
                rd.m.o("mAuthStateManager");
            } else {
                aVar = aVar2;
            }
            aVar.d(new a.b() { // from class: n5.t
                @Override // com.dw.ht.user.a.b
                public final void a(String str) {
                    InfoFragment.D5(this.f22536a, string, str);
                }
            });
        }
    }

    public static final void D5(InfoFragment infoFragment, String str, String str2) {
        if (str2 != null) {
            g.b(u.a(infoFragment), p0.b(), null, new f(str, infoFragment, null), 2, null);
        }
    }

    private final void E5() {
        t1 t1Var = this.binding;
        if (t1Var == null) {
            return;
        }
        ListItemView listItemView = t1Var.f21568c;
        rd.m.d(listItemView, "email");
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            listItemView.post(new Runnable() { // from class: n5.m
                @Override // java.lang.Runnable
                public final void run() {
                    InfoFragment.F5(this.f22527a);
                }
            });
            return;
        }
        com.dw.ht.user.b bVar = this.mUserInfo;
        com.dw.ht.user.a aVar = null;
        if (bVar == null) {
            rd.m.o("mUserInfo");
            bVar = null;
        }
        String strE = bVar.e();
        if (strE == null || !rg.q.w(strE, "@openid.benshikj.com", false, 2, null)) {
            ListItemView listItemView2 = t1Var.f21568c;
            com.dw.ht.user.b bVar2 = this.mUserInfo;
            if (bVar2 == null) {
                rd.m.o("mUserInfo");
                bVar2 = null;
            }
            listItemView2.setDetail(bVar2.e());
        } else {
            t1Var.f21568c.setDetail(null);
        }
        ListItemView listItemView3 = t1Var.f21574i;
        com.dw.ht.user.b bVar3 = this.mUserInfo;
        if (bVar3 == null) {
            rd.m.o("mUserInfo");
            bVar3 = null;
        }
        listItemView3.setDetail(bVar3.j());
        ListItemView listItemView4 = t1Var.f21572g;
        com.dw.ht.user.b bVar4 = this.mUserInfo;
        if (bVar4 == null) {
            rd.m.o("mUserInfo");
            bVar4 = null;
        }
        listItemView4.setDetail(bVar4.d());
        ImageView imageView = t1Var.f21573h;
        com.dw.ht.user.b bVar5 = this.mUserInfo;
        if (bVar5 == null) {
            rd.m.o("mUserInfo");
            bVar5 = null;
        }
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        imageView.setImageDrawable(bVar5.h(contextX3));
        if (Cfg.f5482d) {
            t1Var.f21570e.setVisibility(8);
            t1Var.f21571f.setVisibility(8);
        } else {
            com.dw.ht.user.a aVar2 = this.mAuthStateManager;
            if (aVar2 == null) {
                rd.m.o("mAuthStateManager");
                aVar2 = null;
            }
            if (aVar2.h().n()) {
                t1Var.f21570e.setVisibility(8);
                t1Var.f21571f.setVisibility(0);
            } else {
                t1Var.f21570e.setVisibility(0);
                t1Var.f21571f.setVisibility(8);
            }
        }
        Button button = t1Var.f21567b;
        com.dw.ht.user.a aVar3 = this.mAuthStateManager;
        if (aVar3 == null) {
            rd.m.o("mAuthStateManager");
        } else {
            aVar = aVar3;
        }
        button.setVisibility(aVar.h().n() ? 0 : 8);
    }

    public static final void F5(InfoFragment infoFragment) {
        infoFragment.E5();
    }

    private final void g5() {
        if (this.mIsAuthorized) {
            com.dw.ht.user.a aVar = this.mAuthStateManager;
            if (aVar == null) {
                rd.m.o("mAuthStateManager");
                aVar = null;
            }
            aVar.d(new a.b() { // from class: n5.q
                @Override // com.dw.ht.user.a.b
                public final void a(String str) {
                    InfoFragment.h5(this.f22533a, str);
                }
            });
        }
    }

    public static final void h5(InfoFragment infoFragment, String str) {
        if (str != null) {
            g.b(u.a(infoFragment), p0.b(), null, infoFragment.new b(null), 2, null);
        }
    }

    private final void i5() {
        com.dw.ht.user.a aVar = this.mAuthStateManager;
        com.dw.ht.user.a aVar2 = null;
        if (aVar == null) {
            rd.m.o("mAuthStateManager");
            aVar = null;
        }
        if (aVar.h().n()) {
            com.dw.ht.user.a aVar3 = this.mAuthStateManager;
            if (aVar3 == null) {
                rd.m.o("mAuthStateManager");
            } else {
                aVar2 = aVar3;
            }
            aVar2.d(new a.b() { // from class: n5.s
                @Override // com.dw.ht.user.a.b
                public final void a(String str) {
                    InfoFragment.j5(this.f22535a, str);
                }
            });
        }
    }

    public static final void j5(InfoFragment infoFragment, String str) {
        if (str == null) {
            return;
        }
        g.b(u.a(infoFragment), p0.b(), null, infoFragment.new c(null), 2, null);
    }

    private final void k5(byte[] r10) {
        if (r10 == null) {
            return;
        }
        try {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(r10, 0, r10.length);
            com.dw.ht.user.b bVar = this.mUserInfo;
            if (bVar == null) {
                rd.m.o("mUserInfo");
                bVar = null;
            }
            bVar.r(bitmapDecodeByteArray);
            E5();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void l5(Um.UserProfile r10) {
        if (r10 == null) {
            return;
        }
        com.dw.ht.user.b bVar = this.mUserInfo;
        if (bVar == null) {
            rd.m.o("mUserInfo");
            bVar = null;
        }
        bVar.s(r10);
        E5();
        l photo = r10.getPhoto();
        k5(photo != null ? photo.C() : null);
    }

    public final void m5() {
        com.dw.ht.user.a aVar = this.mAuthStateManager;
        com.dw.ht.user.b bVar = null;
        if (aVar == null) {
            rd.m.o("mAuthStateManager");
            aVar = null;
        }
        aVar.l(new net.openid.appauth.c());
        com.dw.ht.user.b bVar2 = this.mUserInfo;
        if (bVar2 == null) {
            rd.m.o("mUserInfo");
        } else {
            bVar = bVar2;
        }
        bVar.a();
        this.mIsAuthorized = false;
        E5();
    }

    public final void n5(Throwable e10) {
        g.b(u.a(this), p0.c(), null, new d(e10, this, null), 2, null);
        e10.printStackTrace();
    }

    private final void o5() {
        t1 t1Var = this.binding;
        if (t1Var == null) {
            return;
        }
        PopupMenu popupMenu = new PopupMenu(k1(), t1Var.f21573h);
        popupMenu.inflate(R.menu.photo_editor);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: n5.z
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return InfoFragment.p5(this.f22544a, menuItem);
            }
        });
        popupMenu.show();
    }

    public static final boolean p5(final InfoFragment infoFragment, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.pick_photo) {
            infoFragment.C4();
            return true;
        }
        if (itemId != R.id.remove_photo) {
            if (itemId != R.id.take_photo) {
                return false;
            }
            infoFragment.D4();
            return true;
        }
        com.dw.ht.user.b bVar = infoFragment.mUserInfo;
        com.dw.ht.user.a aVar = null;
        if (bVar == null) {
            rd.m.o("mUserInfo");
            bVar = null;
        }
        bVar.r(null);
        infoFragment.E5();
        com.dw.ht.user.a aVar2 = infoFragment.mAuthStateManager;
        if (aVar2 == null) {
            rd.m.o("mAuthStateManager");
        } else {
            aVar = aVar2;
        }
        aVar.d(new a.b() { // from class: n5.r
            @Override // com.dw.ht.user.a.b
            public final void a(String str) {
                InfoFragment.q5(this.f22534a, str);
            }
        });
        return true;
    }

    public static final void q5(InfoFragment infoFragment, String str) {
        if (str != null) {
            infoFragment.B5(null);
        }
    }

    public static final void r5(InfoFragment infoFragment, byte[] bArr, String str) {
        if (str != null) {
            infoFragment.B5(bArr);
        }
    }

    public static final void s5(InfoFragment infoFragment, View view) {
        infoFragment.o5();
    }

    public static final void t5(InfoFragment infoFragment, View view) {
        infoFragment.A5();
    }

    public static final void u5(InfoFragment infoFragment, View view) {
        infoFragment.m5();
    }

    public static final void v5(t1 t1Var, InfoFragment infoFragment, View view) {
        Context context = view.getContext();
        CharSequence title = t1Var.f21572g.getTitle();
        CharSequence detail = t1Var.f21572g.getDetail();
        q.b bVar = new q.b(context, title, null, detail != null ? detail.toString() : null, null, 0);
        bVar.f29597v = new r3.a(v4.q.f30039z.d() * 2);
        v3.q.q4(bVar).g4(infoFragment.j1(), "edit_nickname");
    }

    public static final void w5(final InfoFragment infoFragment, View view) {
        c.a aVar = new c.a(infoFragment.x3());
        final i iVarC = i.c(LayoutInflater.from(aVar.b()));
        rd.m.d(iVarC, "inflate(...)");
        final b0 b0Var = new b0();
        iVarC.f21204b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: n5.a0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                InfoFragment.x5(b0Var, compoundButton, z10);
            }
        });
        androidx.appcompat.app.c cVarA = aVar.B(iVarC.b()).y(R.string.deleteAccount).m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: n5.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                InfoFragment.y5(dialogInterface, i10);
            }
        }).t(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: n5.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                InfoFragment.z5(iVarC, infoFragment, dialogInterface, i10);
            }
        }).a();
        b0Var.f25935a = cVarA;
        cVarA.show();
        Button buttonL = ((androidx.appcompat.app.c) b0Var.f25935a).l(-1);
        if (buttonL != null) {
            buttonL.setEnabled(false);
        }
    }

    public static final void x5(b0 b0Var, CompoundButton compoundButton, boolean z10) {
        Button buttonL;
        rd.m.e(compoundButton, "<unused var>");
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) b0Var.f25935a;
        if (cVar == null || (buttonL = cVar.l(-1)) == null) {
            return;
        }
        buttonL.setEnabled(z10);
    }

    public static final void y5(DialogInterface dialogInterface, int i10) {
    }

    public static final void z5(i iVar, InfoFragment infoFragment, DialogInterface dialogInterface, int i10) {
        if (iVar.f21204b.isChecked()) {
            infoFragment.g5();
        }
    }

    public final void A5() {
        O3(new Intent(k1(), (Class<?>) LoginActivity.class));
    }

    @Override // n5.n0
    protected void H4() {
    }

    @Override // n5.n0
    protected void I4(Exception e10) {
        rd.m.e(e10, "e");
    }

    @Override // n5.n0
    protected void K4(Bitmap photo) {
        if (photo == null) {
            return;
        }
        final byte[] bArrA4 = n0.A4(photo);
        com.dw.ht.user.a aVar = this.mAuthStateManager;
        com.dw.ht.user.b bVar = null;
        if (aVar == null) {
            rd.m.o("mAuthStateManager");
            aVar = null;
        }
        aVar.d(new a.b() { // from class: n5.p
            @Override // com.dw.ht.user.a.b
            public final void a(String str) {
                InfoFragment.r5(this.f22531a, bArrA4, str);
            }
        });
        com.dw.ht.user.b bVar2 = this.mUserInfo;
        if (bVar2 == null) {
            rd.m.o("mUserInfo");
        } else {
            bVar = bVar2;
        }
        bVar.r(photo);
        E5();
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        com.dw.ht.user.b bVar = null;
        if (!this.mIsAuthorized) {
            com.dw.ht.user.a aVar = this.mAuthStateManager;
            if (aVar == null) {
                rd.m.o("mAuthStateManager");
                aVar = null;
            }
            if (aVar.h().n()) {
                i5();
            }
        }
        com.dw.ht.user.a aVar2 = this.mAuthStateManager;
        if (aVar2 == null) {
            rd.m.o("mAuthStateManager");
            aVar2 = null;
        }
        boolean zN = aVar2.h().n();
        this.mIsAuthorized = zN;
        if (zN) {
            return;
        }
        com.dw.ht.user.b bVar2 = this.mUserInfo;
        if (bVar2 == null) {
            rd.m.o("mUserInfo");
            bVar2 = null;
        }
        if (bVar2.i() > 0) {
            com.dw.ht.user.b bVar3 = this.mUserInfo;
            if (bVar3 == null) {
                rd.m.o("mUserInfo");
            } else {
                bVar = bVar3;
            }
            bVar.a();
            E5();
        }
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        super.O2();
        mi.c.e().q(this);
    }

    @Override // androidx.fragment.app.o
    public void P2() {
        super.P2();
        mi.c.e().t(this);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        final t1 t1Var = this.binding;
        rd.m.b(t1Var);
        t1Var.f21573h.setOnClickListener(new View.OnClickListener() { // from class: n5.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InfoFragment.s5(this.f22538a, view2);
            }
        });
        t1Var.f21570e.setOnClickListener(new View.OnClickListener() { // from class: n5.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InfoFragment.t5(this.f22539a, view2);
            }
        });
        t1Var.f21571f.setOnClickListener(new View.OnClickListener() { // from class: n5.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InfoFragment.u5(this.f22540a, view2);
            }
        });
        t1Var.f21572g.setOnClickListener(new View.OnClickListener() { // from class: n5.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InfoFragment.v5(t1Var, this, view2);
            }
        });
        t1Var.f21567b.setOnClickListener(new View.OnClickListener() { // from class: n5.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InfoFragment.w5(this.f22543a, view2);
            }
        });
        E5();
        super.Q2(view, savedInstanceState);
    }

    @Override // v3.v
    protected boolean f4(o sender, int what, int arg1, int arg2, Object obj) {
        String strP1;
        if (sender == null || (strP1 = sender.P1()) == null || strP1.hashCode() != -406415613 || !strP1.equals("edit_nickname")) {
            return super.f4(sender, what, arg1, arg2, obj);
        }
        if (what != R.id.what_dialog_onclick || arg1 != -1) {
            return true;
        }
        C5(String.valueOf(obj));
        return true;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(a.EnumC0104a event) {
        rd.m.e(event, "event");
        if (a.f6772a[event.ordinal()] == 1) {
            i5();
        }
    }

    @Override // n5.n0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        this.mUserInfo = com.dw.ht.user.b.f6853a;
        com.dw.ht.user.a aVarI = com.dw.ht.user.a.i(x3());
        rd.m.d(aVarI, "getInstance(...)");
        this.mAuthStateManager = aVarI;
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        t1 t1VarC = t1.c(inflater, container, false);
        rd.m.d(t1VarC, "inflate(...)");
        this.binding = t1VarC;
        CardView cardViewB = t1VarC.b();
        rd.m.d(cardViewB, "getRoot(...)");
        return cardViewB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(b.a event) {
        rd.m.e(event, "event");
        if (a.f6773b[event.ordinal()] == 1) {
            E5();
        }
    }
}
