package com.dw.ht.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import k5.d0;
import kotlin.Metadata;
import m4.a1;
import mi.c;
import mi.m;
import n4.l;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/dw/ht/settings/PTTActionFragment;", "Landroidx/fragment/app/o;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Ln4/l$h;", "event", "Ldd/d0;", "onMessageEvent", "(Ln4/l$h;)V", "M2", "H2", "Lk5/d0;", "o0", "Lk5/d0;", "getAdapter", "()Lk5/d0;", "adapter", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PTTActionFragment extends o {

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private final d0 adapter = new d0();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6765a;

        static {
            int[] iArr = new int[l.h.values().length];
            try {
                iArr[l.h.f22486a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6765a = iArr;
        }
    }

    @Override // androidx.fragment.app.o
    public void H2() {
        super.H2();
        c.e().t(this);
        l.f22470a.c();
    }

    @Override // androidx.fragment.app.o
    public void M2() {
        super.M2();
        this.adapter.F();
        c.e().q(this);
    }

    @m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(l.h event) {
        rd.m.e(event, "event");
        if (a.f6765a[event.ordinal()] != 1) {
            throw new dd.o();
        }
        this.adapter.F();
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        a1 a1VarC = a1.c(inflater);
        rd.m.d(a1VarC, "inflate(...)");
        a1VarC.f20971b.setLayoutManager(new LinearLayoutManager(k1()));
        a1VarC.f20971b.setAdapter(this.adapter);
        a1VarC.f20971b.l(new c6.m(k1(), 0));
        ConstraintLayout constraintLayoutB = a1VarC.b();
        rd.m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }
}
