package q4;

import android.bluetooth.BluetoothDevice;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Dm;
import com.dw.ht.factory.DeviceIDWriterFragment;
import com.dw.ht.fragments.DeviceFragment;
import dd.d0;
import e5.a;
import java.util.List;
import kotlin.Metadata;
import m4.j0;
import org.greenrobot.eventbus.ThreadMode;
import tg.p0;
import tg.z0;
import v3.m0;
import v4.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u0004J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020(H\u0007¢\u0006\u0004\b&\u0010)J\u001f\u0010.\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J)\u00104\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J)\u00106\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b6\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lq4/o;", "Lv3/m0;", "Le5/a$e;", "<init>", "()V", "Ldd/d0;", "E4", "Landroid/bluetooth/BluetoothDevice;", "hf", "G4", "(Landroid/bluetooth/BluetoothDevice;)V", "H4", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "", "F2", "(Landroid/view/MenuItem;)Z", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "M2", "H2", "Ly1/j;", "event", "onMessageEvent", "(Ly1/j;)V", "Lp4/c;", "(Lp4/c;)V", "Le5/a;", "register", "Le5/a$g;", "stat", "I", "(Le5/a;Le5/a$g;)V", "Le5/a$d;", "error", "", "message", "T", "(Le5/a;Le5/a$d;Ljava/lang/CharSequence;)V", "x", "Lm4/j0;", "F0", "Lm4/j0;", "binding", "Lv4/i0;", "G0", "Lv4/i0;", "D4", "()Lv4/i0;", "setLink", "(Lv4/i0;)V", "link", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends m0 implements a.e {

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private j0 binding;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private i0 link;

    static final class a extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24312e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e5.a f24314g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a.d f24315h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ CharSequence f24316r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e5.a aVar, a.d dVar, CharSequence charSequence, hd.e eVar) {
            super(2, eVar);
            this.f24314g = aVar;
            this.f24315h = dVar;
            this.f24316r = charSequence;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return o.this.new a(this.f24314g, this.f24315h, this.f24316r, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f24312e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            j0 j0Var = o.this.binding;
            if (j0Var != null) {
                e5.a aVar = this.f24314g;
                a.d dVar = this.f24315h;
                CharSequence charSequence = this.f24316r;
                j0Var.f21250f.setText("认证错误\n步骤：" + aVar.f() + "\n错误：" + dVar + '\n' + ((Object) charSequence) + "\n点击重试");
                j0Var.f21248d.setVisibility(0);
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((a) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    static final class b extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24317e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e5.a f24319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ CharSequence f24320h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e5.a aVar, CharSequence charSequence, hd.e eVar) {
            super(2, eVar);
            this.f24319g = aVar;
            this.f24320h = charSequence;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return o.this.new b(this.f24319g, this.f24320h, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f24317e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            j0 j0Var = o.this.binding;
            if (j0Var != null) {
                e5.a aVar = this.f24319g;
                CharSequence charSequence = this.f24320h;
                j0Var.f21250f.setText("认证错误\n步骤：" + aVar.f() + '\n' + ((Object) charSequence) + "\n点击重试");
                j0Var.f21248d.setVisibility(0);
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((b) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    static final class c extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24321e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a.g f24323g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a.g gVar, hd.e eVar) {
            super(2, eVar);
            this.f24323g = gVar;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return o.this.new c(this.f24323g, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f24321e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            j0 j0Var = o.this.binding;
            if (j0Var == null) {
                return d0.f10897a;
            }
            i0 link = o.this.getLink();
            if (link == null) {
                return d0.f10897a;
            }
            int I = link.I();
            TextView textView = j0Var.f21247c;
            Dm.DeviceID deviceIDK = link.K();
            textView.setText(deviceIDK != null ? deviceIDK.toString() : null);
            if (I == 1) {
                o.this.E4();
            } else if (I != 2) {
                j0Var.f21250f.setText("当前认证步骤：" + this.f24323g);
            } else {
                j0Var.f21250f.setText("已经包含相同ID在服务器,当前设备需要重新配置ID");
            }
            if (this.f24323g == a.g.SUCCESS) {
                o.this.E4();
            }
            return d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((c) g(d0Var, eVar)).o(d0.f10897a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E4() {
        j0 j0Var = this.binding;
        if (j0Var == null) {
            return;
        }
        j0Var.f21250f.setText("请按PTT测试");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F4(o oVar, View view) {
        i0 i0Var = oVar.link;
        if (i0Var != null) {
            i0Var.y();
        }
    }

    private final void G4(BluetoothDevice hf2) {
        j0 j0Var = this.binding;
        if (j0Var == null) {
            return;
        }
        View viewT1 = T1();
        if (viewT1 != null) {
            viewT1.setBackground(new ColorDrawable(-65536));
        }
        j0Var.f21249e.setText("PTT 按下");
    }

    private final void H4() {
        j0 j0Var = this.binding;
        if (j0Var == null) {
            return;
        }
        j0Var.f21249e.setText("PTT 释放");
        View viewT1 = T1();
        if (viewT1 != null) {
            viewT1.setBackground(new ColorDrawable(-16711936));
        }
    }

    /* JADX INFO: renamed from: D4, reason: from getter */
    public final i0 getLink() {
        return this.link;
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        rd.m.e(item, "item");
        if (item.getItemId() != R.id.save_all) {
            return super.F2(item);
        }
        mi.c.e().m(m.f24307a);
        mi.c.e().m(m.f24308b);
        return true;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void H2() {
        mi.c cVarZ;
        super.H2();
        mi.c.e().t(this);
        i0 i0Var = this.link;
        if (i0Var != null) {
            i0Var.c0(null);
        }
        i0 i0Var2 = this.link;
        if (i0Var2 == null || (cVarZ = i0Var2.z()) == null) {
            return;
        }
        cVarZ.t(this);
    }

    @Override // e5.a.e
    public void I(e5.a register, a.g stat) {
        rd.m.e(register, "register");
        rd.m.e(stat, "stat");
        tg.g.b(z0.f27881a, p0.c(), null, new c(stat, null), 2, null);
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        j0 j0Var;
        super.M2();
        mi.c.e().q(this);
        i0 i0Var = this.link;
        if (i0Var == null || (j0Var = this.binding) == null) {
            return;
        }
        List<androidx.fragment.app.o> listV0 = j1().v0();
        rd.m.d(listV0, "getFragments(...)");
        for (androidx.fragment.app.o oVar : listV0) {
            if (oVar instanceof DeviceFragment) {
                ((DeviceFragment) oVar).g5(i0Var);
            }
        }
        i0Var.v(true);
        i0Var.c0(this);
        i0Var.z().q(this);
        TextView textView = j0Var.f21247c;
        Dm.DeviceID deviceIDK = i0Var.K();
        textView.setText(deviceIDK != null ? deviceIDK.toString() : null);
        ((DeviceIDWriterFragment) j0Var.f21248d.getFragment()).g5(i0Var);
        j0Var.f21248d.setVisibility(8);
        if (i0Var.I() != 1) {
            j0Var.f21250f.setText("等待认证完成");
            if (i0Var.L() == a.g.IDLE) {
                i0Var.y();
            }
        } else {
            E4();
        }
        j0Var.f21250f.setOnClickListener(new View.OnClickListener() { // from class: q4.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.F4(this.f24311a, view);
            }
        });
    }

    @Override // e5.a.e
    public void T(e5.a register, a.d error, CharSequence message) {
        rd.m.e(register, "register");
        rd.m.e(error, "error");
        tg.g.b(z0.f27881a, p0.c(), null, new a(register, error, message, null), 2, null);
    }

    @mi.m(threadMode = ThreadMode.POSTING)
    public final void onMessageEvent(y1.j event) {
        rd.m.e(event, "event");
        if (event.a() == 16) {
            int iB = event.b();
            if (iB == 16) {
                G4(null);
            } else {
                if (iB != 17) {
                    return;
                }
                H4();
            }
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        G3(true);
        Bundle bundleI1 = i1();
        if (bundleI1 != null) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) bundleI1.getParcelable("dev");
            if (bluetoothDevice != null) {
                this.link = i0.a.g(i0.F, bluetoothDevice, null, 2, null);
                return;
            }
            androidx.fragment.app.p pVarE1 = e1();
            if (pVarE1 != null) {
                pVarE1.finish();
            }
        }
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.factory_hm_settings, menu);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        z4("手咪测试");
        j0 j0VarC = j0.c(inflater, container, false);
        this.binding = j0VarC;
        rd.m.b(j0VarC);
        ConstraintLayout constraintLayoutB = j0VarC.b();
        rd.m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // e5.a.e
    public void x(e5.a register, a.d error, CharSequence message) {
        rd.m.e(register, "register");
        rd.m.e(error, "error");
        tg.g.b(z0.f27881a, p0.c(), null, new b(register, message, null), 2, null);
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    @mi.m(threadMode = ThreadMode.POSTING)
    public final void onMessageEvent(p4.c event) {
        rd.m.e(event, "event");
        int i10 = event.f23908b;
        if (i10 == 1) {
            G4(event.f23909c);
        } else {
            if (i10 != 2) {
                return;
            }
            H4();
        }
    }
}
