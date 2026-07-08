package com.dw.ht.fragments;

import a6.y;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.PopupMenu;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.o;
import androidx.fragment.app.p;
import androidx.fragment.app.w;
import c6.k;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.TintTextView;
import com.dw.ht.Cfg;
import com.dw.ht.entitys.IIChannel;
import com.dw.ht.fragments.BDListFragment;
import com.dw.widget.ActionButton;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import k5.a0;
import kotlin.Metadata;
import m4.l;
import m4.m0;
import m4.u1;
import m4.v1;
import n4.b;
import n4.m;
import n5.o0;
import org.greenrobot.eventbus.ThreadMode;
import rd.m;
import s4.e6;
import s4.s1;
import u4.d0;
import u4.r;
import v3.q;
import v3.v;
import v4.i0;
import v4.l1;
import v4.n0;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 £\u00012\u00020\u00012\u00020\u0002:\n¤\u0001¥\u0001¦\u0001§\u0001¨\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\tJ!\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020!H\u0007¢\u0006\u0004\b\u001f\u0010\"J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020#H\u0007¢\u0006\u0004\b\u001f\u0010$J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020%H\u0007¢\u0006\u0004\b\u001f\u0010&J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020'H\u0007¢\u0006\u0004\b\u001f\u0010(J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020)H\u0007¢\u0006\u0004\b\u001f\u0010*J\u0019\u0010+\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b+\u0010\u001aJ+\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0007H\u0016¢\u0006\u0004\b3\u0010\u0004J!\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u0002002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b5\u00106J;\u0010>\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010<H\u0014¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0007H\u0016¢\u0006\u0004\b@\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020AH\u0007¢\u0006\u0004\b\u001f\u0010BJ\u001d\u0010F\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\n2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00072\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0007H\u0016¢\u0006\u0004\bL\u0010\u0004J\u0017\u0010O\u001a\u00020\u00072\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u001f\u0010T\u001a\u00020\u00072\u0006\u0010R\u001a\u00020Q2\u0006\u0010-\u001a\u00020SH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\u00052\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u00072\u0006\u0010Z\u001a\u000200H\u0016¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\u0007¢\u0006\u0004\b]\u0010\u0004J\u001f\u0010`\u001a\u00020\u00072\u0006\u0010_\u001a\u00020^2\b\b\u0002\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b`\u0010aR\u001c\u0010f\u001a\n c*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010q\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010t\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010w\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010y\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010vR\"\u0010~\u001a\u000e\u0012\b\u0012\u00060{R\u00020\u0000\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010sR\u0019\u0010\u0083\u0001\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u0089\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010vR\u0018\u0010\u008d\u0001\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010vR\u0019\u0010\u0090\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R \u0010\u009c\u0001\u001a\t\u0018\u00010\u0099\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001a\u0010 \u0001\u001a\u0005\u0018\u00010\u009d\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0013\u0010¢\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010\u0011¨\u0006©\u0001"}, d2 = {"Lcom/dw/ht/fragments/BDListFragment;", "Lv3/v;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "", "autoStartScan", "Ldd/d0;", "O4", "(Z)V", "", "position", "showSettings", "D4", "(IZ)V", "N4", "S4", "()Z", "show", "J4", "viewId", "showDevSettings", "H4", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "O2", "P2", "Ln4/m$a;", "event", "onMessageEvent", "(Ln4/m$a;)V", "Lu4/d0$a;", "(Lu4/d0$a;)V", "Ln4/b$a;", "(Ln4/b$a;)V", "Lv4/i0$b;", "(Lv4/i0$b;)V", "Lv4/u$e;", "(Lv4/u$e;)V", "Lv4/l1$g;", "(Lv4/l1$g;)V", "l2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/fragment/app/o;", "sender", "what", "arg1", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "M2", "Lv4/u$c;", "(Lv4/u$c;)V", "fragmentId", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "L4", "(ILandroidx/drawerlayout/widget/DrawerLayout;)V", "Landroid/content/Context;", "activity", "o2", "(Landroid/content/Context;)V", "z2", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "F2", "(Landroid/view/MenuItem;)Z", "v", "onClick", "(Landroid/view/View;)V", "y4", "", "devId", "F4", "(JZ)V", "Ljava/text/Collator;", "kotlin.jvm.PlatformType", "z0", "Ljava/text/Collator;", "collator", "Lcom/dw/ht/fragments/BDListFragment$a;", "A0", "Lcom/dw/ht/fragments/BDListFragment$a;", "mCallbacks", "Landroidx/appcompat/app/b;", "B0", "Landroidx/appcompat/app/b;", "mDrawerToggle", "C0", "Landroidx/drawerlayout/widget/DrawerLayout;", "mDrawerLayout", "D0", "Landroid/view/View;", "mFragmentContainerView", "E0", "Z", "mFromSavedInstanceState", "F0", "mUserLearnedDrawer", "Landroid/widget/ArrayAdapter;", "Lcom/dw/ht/fragments/BDListFragment$d;", "G0", "Landroid/widget/ArrayAdapter;", "mArrayAdapter", "H0", "mRootView", "I0", "J", "mSelectedDevId", "Landroid/graphics/drawable/Drawable;", "J0", "Landroid/graphics/drawable/Drawable;", "mDownDrawable", "K0", "mUpDrawable", "L0", "mShowDevSettings", "M0", "mAutoStartDevBind", "N0", "I", "mSelectedToolId", "Lm4/l;", "O0", "Lm4/l;", "binding", "Lm4/v1;", "P0", "Lm4/v1;", "toolsBinding", "Lcom/dw/ht/fragments/BDListFragment$e;", "Q0", "Lcom/dw/ht/fragments/BDListFragment$e;", "tools", "Landroidx/appcompat/app/a;", "z4", "()Landroidx/appcompat/app/a;", "actionBar", "A4", "isDrawerOpen", "R0", "e", "d", "b", "a", "c", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BDListFragment extends v implements View.OnClickListener {
    private static final String S0 = "navigation_drawer_learned";

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private a mCallbacks;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private androidx.appcompat.app.b mDrawerToggle;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private DrawerLayout mDrawerLayout;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private View mFragmentContainerView;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private boolean mFromSavedInstanceState;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private boolean mUserLearnedDrawer;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private ArrayAdapter mArrayAdapter;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private View mRootView;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private long mSelectedDevId;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private Drawable mDownDrawable;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private Drawable mUpDrawable;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private boolean mShowDevSettings;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private boolean mAutoStartDevBind;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private int mSelectedToolId;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private l binding;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private v1 toolsBinding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private e tools;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    private final Collator collator = Collator.getInstance(Locale.getDefault());

    public interface a {
        boolean a(int i10);
    }

    final class b extends ArrayAdapter {

        /* JADX INFO: renamed from: a */
        private final ColorStateList f6113a;

        /* JADX INFO: renamed from: b */
        private final ColorStateList f6114b;

        /* JADX INFO: renamed from: c */
        private final LayoutInflater f6115c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ BDListFragment f6116d;

        final class a implements PopupMenu.OnMenuItemClickListener {

            /* JADX INFO: renamed from: a */
            private final m0 f6117a;

            /* JADX INFO: renamed from: b */
            private d f6118b;

            /* JADX INFO: renamed from: c */
            private int f6119c;

            /* JADX INFO: renamed from: d */
            private boolean f6120d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ b f6121e;

            public a(b bVar, m0 m0Var) {
                m.e(m0Var, "view");
                this.f6121e = bVar;
                this.f6117a = m0Var;
                m0Var.b().setBackgroundResource(R.drawable.item_background);
                m0Var.f21335b.setOnClickListener(new View.OnClickListener() { // from class: com.dw.ht.fragments.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BDListFragment.b.a.f(this.f6247a, view);
                    }
                });
                m0Var.f21339f.setVisibility(0);
                m0Var.f21339f.setOnClickListener(new View.OnClickListener() { // from class: com.dw.ht.fragments.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BDListFragment.b.a.g(this.f6248a, view);
                    }
                });
                m0Var.f21338e.setOnClickListener(new View.OnClickListener() { // from class: com.dw.ht.fragments.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BDListFragment.b.a.h(this.f6249a, view);
                    }
                });
                m0Var.b().setOnClickListener(new View.OnClickListener() { // from class: com.dw.ht.fragments.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BDListFragment.b.a.i(this.f6250a, view);
                    }
                });
                m0Var.f21335b.setVisibility(0);
            }

            public static final void f(a aVar, View view) {
                u uVarW = u.w();
                m.d(uVarW, "getInstance(...)");
                d dVar = aVar.f6118b;
                m.b(dVar);
                l1 l1VarY = uVarW.y(dVar.d());
                if (l1VarY == null) {
                    return;
                }
                boolean z10 = aVar.f6120d;
                l1VarY.i1(!z10);
                if (z10) {
                    return;
                }
                l1VarY.L(true);
            }

            public static final void g(a aVar, View view) {
                m.b(view);
                aVar.k(view);
            }

            public static final void h(a aVar, View view) {
                m.b(view);
                aVar.m(view);
            }

            public static final void i(a aVar, View view) {
                m.b(view);
                aVar.l(view);
            }

            private final void k(View view) {
                d dVar = this.f6118b;
                if (dVar == null) {
                    return;
                }
                n4.a aVarB = dVar.b();
                if (aVarB != null) {
                    if (aVarB instanceof n4.c) {
                        i0 i0VarJ = ((n4.c) aVarB).j();
                        if (i0VarJ.n() || i0VarJ.l() == n0.c.Connecting) {
                            i0VarJ.h(true);
                            return;
                        } else {
                            i0VarJ.B();
                            return;
                        }
                    }
                    return;
                }
                u uVarW = u.w();
                m.d(uVarW, "getInstance(...)");
                l1 l1VarY = uVarW.y(dVar.d());
                if (l1VarY == null) {
                    return;
                }
                if (l1VarY.n() || l1VarY.i()) {
                    l1VarY.h(true);
                } else {
                    l1VarY.v(true);
                }
            }

            private final void l(View view) {
                d dVar = this.f6118b;
                if (dVar == null) {
                    return;
                }
                n4.a aVarB = dVar.b();
                if (aVarB == null) {
                    this.f6121e.f6116d.D4(this.f6119c, true);
                    return;
                }
                if (aVarB instanceof n4.c) {
                    n4.c cVar = (n4.c) aVarB;
                    if (cVar.h()) {
                        DeviceFragment.j5(view.getContext(), "", a0.class, aVarB.f22426a);
                        return;
                    }
                    i0 i0VarJ = cVar.j();
                    if (i0VarJ.n() || i0VarJ.l() == n0.c.Connecting) {
                        i0VarJ.h(true);
                    } else {
                        i0VarJ.B();
                    }
                }
            }

            private final void m(View view) {
                MenuItem menuItemFindItem;
                d dVar = this.f6118b;
                if (dVar == null) {
                    return;
                }
                k kVar = new k(view.getContext(), view);
                if (dVar.a() == null && dVar.b() == null) {
                    kVar.b().inflate(R.menu.iicontrol_channel_settings, kVar.a());
                    kVar.e(this);
                    IIChannel iIChannelE = dVar.e();
                    m.b(iIChannelE);
                    if (iIChannelE.l() == com.dw.ht.user.b.f6853a.i()) {
                        kVar.a().findItem(R.id.quit).setVisible(false);
                    } else {
                        kVar.a().findItem(R.id.edit).setVisible(false);
                    }
                } else {
                    kVar.b().inflate(R.menu.bt_device_settings, kVar.a());
                    if (dVar.a() == null && (menuItemFindItem = kVar.a().findItem(R.id.rename)) != null) {
                        menuItemFindItem.setVisible(false);
                    }
                }
                kVar.e(this);
                kVar.f();
            }

            public static final void n(d dVar, BDListFragment bDListFragment) {
                n4.a aVarB = dVar.b();
                if (aVarB != null) {
                    n4.b.c().e(aVarB);
                    return;
                }
                u uVarW = u.w();
                m.d(uVarW, "getInstance(...)");
                uVarW.c(uVarW.l(dVar.d()));
                if (dVar.a() != null) {
                    BluetoothDevice bluetoothDeviceA = dVar.a();
                    m.b(bluetoothDeviceA);
                    Cfg.m0(bluetoothDeviceA.getAddress());
                    bDListFragment.O4(false);
                    m3.a.e(dVar.a());
                    if (dVar.d() == bDListFragment.mSelectedDevId) {
                        BDListFragment.E4(bDListFragment, 0, false, 2, null);
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void j(int r5, com.dw.ht.fragments.BDListFragment.d r6) {
                /*
                    Method dump skipped, instruction units count: 271
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.fragments.BDListFragment.b.a.j(int, com.dw.ht.fragments.BDListFragment$d):void");
            }

            public final void o(boolean z10) {
                if (z10 == this.f6120d) {
                    return;
                }
                this.f6120d = z10;
                if (z10) {
                    this.f6117a.f21335b.setImageResource(R.drawable.ic_volume_up_24dp);
                } else {
                    this.f6117a.f21335b.setImageResource(R.drawable.ic_volume_off_24dp);
                }
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                m.e(menuItem, "item");
                final d dVar = this.f6118b;
                if (dVar == null) {
                    return true;
                }
                switch (menuItem.getItemId()) {
                    case R.id.del /* 2131296620 */:
                        View view = this.f6121e.f6116d.mRootView;
                        if (view != null) {
                            final BDListFragment bDListFragment = this.f6121e.f6116d;
                            view.post(new Runnable() { // from class: com.dw.ht.fragments.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BDListFragment.b.a.n(dVar, bDListFragment);
                                }
                            });
                        }
                        return true;
                    case R.id.edit /* 2131296696 */:
                        Bundle bundle = new Bundle();
                        IIChannel iIChannelE = dVar.e();
                        m.b(iIChannelE);
                        bundle.putLong("channel_id", iIChannelE.getChannelId());
                        FragmentShowActivity.i2(this.f6121e.getContext(), null, u4.k.class, bundle);
                        return true;
                    case R.id.quit /* 2131297235 */:
                        d0 d0Var = d0.f28046a;
                        IIChannel iIChannelE2 = dVar.e();
                        m.b(iIChannelE2);
                        d0Var.m(iIChannelE2.getChannelId());
                        return true;
                    case R.id.rename /* 2131297255 */:
                        q qVarO4 = q.o4(this.f6121e.getContext(), this.f6121e.f6116d.N1(R.string.rename), null, dVar.g(), null);
                        w wVarJ1 = this.f6121e.f6116d.j1();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("rename_device:");
                        BluetoothDevice bluetoothDeviceA = dVar.a();
                        m.b(bluetoothDeviceA);
                        sb2.append(bluetoothDeviceA.getAddress());
                        qVarO4.g4(wVarJ1, sb2.toString());
                        return true;
                    case R.id.share /* 2131297371 */:
                        IIChannel iIChannelE3 = dVar.e();
                        m.b(iIChannelE3);
                        IIChannel iIChannelK = d0.k(iIChannelE3.getChannelId());
                        if (iIChannelK != null) {
                            o5.f.f(this.f6121e.getContext(), iIChannelK);
                        }
                        return true;
                    default:
                        return true;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BDListFragment bDListFragment, Context context) {
            super(context, 0);
            m.e(context, "context");
            this.f6116d = bDListFragment;
            this.f6115c = LayoutInflater.from(context);
            int iA = y.a(context, R.attr.list_button_tint, -16777216);
            int iA2 = y.a(context, R.attr.colorPrimary, -13421773);
            ColorStateList colorStateListA = u3.a.a(iA, iA);
            m.d(colorStateListA, "valueOf(...)");
            this.f6113a = colorStateListA;
            ColorStateList colorStateListA2 = u3.a.a(iA2, iA2);
            m.d(colorStateListA2, "valueOf(...)");
            this.f6114b = colorStateListA2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            m0 m0Var;
            m.e(viewGroup, "parent");
            if (view == null) {
                m0 m0VarC = m0.c(this.f6115c, viewGroup, false);
                m0Var = m0VarC;
                view = m0VarC.b();
            } else {
                m0Var = null;
            }
            Object tag = view.getTag();
            a aVar = tag instanceof a ? (a) tag : null;
            if (aVar == null) {
                m.b(m0Var);
                aVar = new a(this, m0Var);
                view.setTag(aVar);
            }
            Object item = getItem(i10);
            m.b(item);
            aVar.j(i10, (d) item);
            return view;
        }
    }

    private final class e {

        /* JADX INFO: renamed from: a */
        private final TintTextView[] f6127a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ BDListFragment f6128b;

        public e(BDListFragment bDListFragment, v1 v1Var) {
            m.e(v1Var, "b");
            this.f6128b = bDListFragment;
            TintTextView[] tintTextViewArr = {v1Var.f21643g, v1Var.f21640d, v1Var.f21645i, v1Var.f21646j, v1Var.f21644h, v1Var.f21642f, v1Var.f21641e, v1Var.f21638b, v1Var.f21639c};
            this.f6127a = tintTextViewArr;
            for (TintTextView tintTextView : tintTextViewArr) {
                tintTextView.setOnClickListener(bDListFragment);
            }
            if (Cfg.f5484e) {
                v1Var.f21639c.setVisibility(8);
            }
            if (Cfg.f5492i) {
                ViewParent parent = v1Var.f21640d.getParent();
                m.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(v1Var.f21640d);
            }
            if (com.dw.ht.satellite.b.f6691a.J()) {
                return;
            }
            ViewParent parent2 = v1Var.f21646j.getParent();
            m.c(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent2).removeView(v1Var.f21646j);
        }

        public final TintTextView[] a() {
            return this.f6127a;
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6129a;

        static {
            int[] iArr = new int[u.c.values().length];
            try {
                iArr[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6129a = iArr;
        }
    }

    public static final class g extends androidx.appcompat.app.b {
        g(p pVar, DrawerLayout drawerLayout) {
            super(pVar, drawerLayout, null, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        }

        @Override // androidx.appcompat.app.b, androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
            m.e(view, "drawerView");
            super.a(view);
            if (BDListFragment.this.a2()) {
                if (!BDListFragment.this.mUserLearnedDrawer) {
                    BDListFragment.this.mUserLearnedDrawer = true;
                    PreferenceManager.getDefaultSharedPreferences(BDListFragment.this.e1()).edit().putBoolean(BDListFragment.S0, true).apply();
                }
                p pVarE1 = BDListFragment.this.e1();
                if (pVarE1 != null) {
                    pVarE1.invalidateOptionsMenu();
                }
                p pVarE12 = BDListFragment.this.e1();
                m.b(pVarE12);
                Object systemService = pVarE12.getSystemService("input_method");
                m.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                DrawerLayout drawerLayout = BDListFragment.this.mDrawerLayout;
                m.b(drawerLayout);
                ((InputMethodManager) systemService).hideSoftInputFromWindow(drawerLayout.getWindowToken(), 2);
            }
        }

        @Override // androidx.appcompat.app.b, androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view) {
            p pVarE1;
            m.e(view, "drawerView");
            super.b(view);
            if (BDListFragment.this.a2() && (pVarE1 = BDListFragment.this.e1()) != null) {
                pVarE1.invalidateOptionsMenu();
            }
        }
    }

    public static final boolean B4(BDListFragment bDListFragment, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.add_dev) {
            FragmentShowActivity.h2(bDListFragment.x3(), null, DeviceScanFragment.class);
            return true;
        }
        if (itemId == R.id.add_ptt) {
            FragmentShowActivity.h2(bDListFragment.x3(), null, DeviceManagerFragment.class);
            return true;
        }
        if (itemId != R.id.buy) {
            return true;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://go.benshikj.com/buy-ht"));
        v3.j.f(bDListFragment, intent);
        return true;
    }

    public static final boolean C4(BDListFragment bDListFragment, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.create) {
            FragmentShowActivity.h2(bDListFragment.x3(), null, u4.k.class);
            return true;
        }
        if (itemId != R.id.join) {
            return true;
        }
        FragmentShowActivity.h2(bDListFragment.x3(), null, r.class);
        return true;
    }

    public final void D4(int position, boolean showSettings) {
        ListView listView;
        boolean z10 = false;
        d dVar = null;
        I4(this, 0, false, 2, null);
        ArrayAdapter arrayAdapter = this.mArrayAdapter;
        if (arrayAdapter != null && position >= 0) {
            m.b(arrayAdapter);
            if (arrayAdapter.getCount() > position) {
                ArrayAdapter arrayAdapter2 = this.mArrayAdapter;
                m.b(arrayAdapter2);
                dVar = (d) arrayAdapter2.getItem(position);
                ArrayAdapter arrayAdapter3 = this.mArrayAdapter;
                m.b(arrayAdapter3);
                arrayAdapter3.notifyDataSetChanged();
                m.b(dVar);
                this.mSelectedDevId = dVar.d();
                l lVar = this.binding;
                if (lVar != null && (listView = lVar.f21305d) != null) {
                    listView.setItemChecked(position, true);
                }
            }
        }
        mi.c.e().m(new p4.a(this.mSelectedDevId));
        l lVar2 = this.binding;
        if (lVar2 == null) {
            return;
        }
        if (dVar != null) {
            lVar2.f21304c.f21601c.setText(dVar.g());
        } else {
            lVar2.f21304c.f21601c.setText("");
        }
        if (showSettings || this.mShowDevSettings) {
            long j10 = this.mSelectedDevId;
            if (j10 != 0 && !l1.r0(j10)) {
                z10 = true;
            }
            J4(z10);
        }
    }

    static /* synthetic */ void E4(BDListFragment bDListFragment, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        bDListFragment.D4(i10, z10);
    }

    public static /* synthetic */ void G4(BDListFragment bDListFragment, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        bDListFragment.F4(j10, z10);
    }

    private final void H4(int viewId, boolean showDevSettings) {
        this.mSelectedDevId = 0L;
        this.mSelectedToolId = viewId;
        l lVar = this.binding;
        if (lVar == null) {
            return;
        }
        e eVar = this.tools;
        if (eVar != null) {
            m.b(eVar);
            for (TintTextView tintTextView : eVar.a()) {
                m.b(tintTextView);
                tintTextView.setSelected(tintTextView.getId() == viewId);
            }
        }
        if (viewId == R.id.audio) {
            lVar.f21304c.f21601c.setText(R.string.audio_connection);
            if (showDevSettings || this.mShowDevSettings) {
                J4(true);
            }
        }
        lVar.f21305d.setItemChecked(-1, true);
    }

    static /* synthetic */ void I4(BDListFragment bDListFragment, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        bDListFragment.H4(i10, z10);
    }

    private final void J4(boolean show) {
        w wVarJ1 = j1();
        m.d(wVarJ1, "getChildFragmentManager(...)");
        o oVarI0 = wVarJ1.i0(R.id.control);
        if (show && !l1.m0(this.mSelectedDevId) && this.mSelectedToolId != R.id.audio) {
            show = false;
        }
        if (show != this.mShowDevSettings || show) {
            this.mShowDevSettings = show;
            final l lVar = this.binding;
            if (lVar == null) {
                return;
            }
            Drawable drawable = null;
            if (!show) {
                lVar.f21305d.setVisibility(0);
                lVar.f21303b.setVisibility(8);
                ActionButton actionButton = lVar.f21304c.f21602d;
                Drawable drawable2 = this.mUpDrawable;
                if (drawable2 == null) {
                    m.o("mUpDrawable");
                } else {
                    drawable = drawable2;
                }
                actionButton.setImageDrawable(drawable);
                return;
            }
            ActionButton actionButton2 = lVar.f21304c.f21602d;
            Drawable drawable3 = this.mDownDrawable;
            if (drawable3 == null) {
                m.o("mDownDrawable");
            } else {
                drawable = drawable3;
            }
            actionButton2.setImageDrawable(drawable);
            long j10 = this.mSelectedDevId;
            if (j10 != 0 && !l1.r0(j10)) {
                if (!(oVarI0 instanceof s1)) {
                    oVarI0 = new s1();
                    wVarJ1.o().p(R.id.control, oVarI0).i();
                    lVar.f21303b.setVisibility(4);
                }
                ((s1) oVarI0).e5(this.mSelectedDevId);
            } else if (this.mSelectedToolId == R.id.audio && !(oVarI0 instanceof s4.v)) {
                wVarJ1.o().p(R.id.control, new s4.v()).i();
                lVar.f21303b.setVisibility(4);
            }
            lVar.f21303b.post(new Runnable() { // from class: s4.w
                @Override // java.lang.Runnable
                public final void run() {
                    BDListFragment.K4(this.f26816a, lVar);
                }
            });
        }
    }

    public static final void K4(BDListFragment bDListFragment, l lVar) {
        if (bDListFragment.mShowDevSettings) {
            lVar.f21305d.setVisibility(8);
            lVar.f21303b.setVisibility(0);
        }
    }

    public static final void M4(BDListFragment bDListFragment) {
        androidx.appcompat.app.b bVar = bDListFragment.mDrawerToggle;
        m.b(bVar);
        bVar.k();
    }

    private final void N4() {
    }

    public final void O4(boolean autoStartScan) {
        ArrayAdapter arrayAdapter;
        l lVar = this.binding;
        if (lVar == null || (arrayAdapter = this.mArrayAdapter) == null) {
            return;
        }
        arrayAdapter.clear();
        Set<BluetoothDevice> hashSet = new HashSet<>();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            if (Cfg.G) {
                Set setP = Cfg.p(false);
                m.d(setP, "getBondedDev(...)");
                Iterator it = setP.iterator();
                while (it.hasNext()) {
                    BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice((String) it.next());
                    m.d(remoteDevice, "getRemoteDevice(...)");
                    hashSet.add(remoteDevice);
                }
            } else {
                hashSet = defaultAdapter.getBondedDevices();
                m.d(hashSet, "getBondedDevices(...)");
            }
        }
        if (hashSet.isEmpty()) {
            if (this.mSelectedToolId == R.id.audio) {
                lVar.f21304c.f21601c.setText(R.string.audio_connection);
            } else {
                w wVarJ1 = j1();
                m.d(wVarJ1, "getChildFragmentManager(...)");
                if (wVarJ1.i0(R.id.control) instanceof s4.v) {
                    lVar.f21304c.f21601c.setText(R.string.audio_connection);
                } else {
                    lVar.f21304c.f21601c.setText((CharSequence) null);
                }
            }
            J4(false);
            if (autoStartScan && this.mAutoStartDevBind) {
                this.mAutoStartDevBind = false;
                SharedPreferences sharedPreferencesK = Cfg.K();
                m.d(sharedPreferencesK, "getPref(...)");
                SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
                editorEdit.putBoolean("auto_start_dev_bind", false);
                editorEdit.apply();
                FragmentShowActivity.h2(x3(), null, DeviceScanFragment.class);
            }
        } else {
            ArrayList arrayList = new ArrayList(hashSet.size());
            Iterator<BluetoothDevice> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(new d(this, it2.next()));
            }
            final qd.p pVar = new qd.p() { // from class: com.dw.ht.fragments.a
                @Override // qd.p
                public final Object s(Object obj, Object obj2) {
                    return Integer.valueOf(BDListFragment.Q4(this.f6244a, (BDListFragment.d) obj, (BDListFragment.d) obj2));
                }
            };
            for (d dVar : ed.q.B0(arrayList, new Comparator() { // from class: s4.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return BDListFragment.R4(pVar, obj, obj2);
                }
            })) {
                arrayAdapter.add(dVar);
                if (dVar.d() == this.mSelectedDevId) {
                    lVar.f21304c.f21601c.setText(dVar.g());
                }
            }
        }
        if (n4.m.d()) {
            arrayAdapter.add(new d(281474976710910L));
        }
        Iterator it3 = d0.f28046a.l().iterator();
        while (it3.hasNext()) {
            arrayAdapter.add(new d(this, (IIChannel) it3.next()));
        }
        ArrayList<n4.a> arrayListB = n4.b.c().b();
        m.d(arrayListB, "getDevices(...)");
        for (n4.a aVar : arrayListB) {
            if (aVar instanceof n4.c) {
                arrayAdapter.add(new d(this, aVar));
            }
        }
        S4();
    }

    static /* synthetic */ void P4(BDListFragment bDListFragment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        bDListFragment.O4(z10);
    }

    public static final int Q4(BDListFragment bDListFragment, d dVar, d dVar2) {
        return bDListFragment.collator.compare(dVar.g(), dVar2.g());
    }

    public static final int R4(qd.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.s(obj, obj2)).intValue();
    }

    private final boolean S4() {
        l lVar = this.binding;
        if (lVar == null) {
            return true;
        }
        if (this.mSelectedDevId == 0) {
            lVar.f21305d.clearChoices();
            return true;
        }
        ArrayAdapter arrayAdapter = this.mArrayAdapter;
        if (arrayAdapter != null) {
            int count = arrayAdapter.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                d dVar = (d) arrayAdapter.getItem(i10);
                if (dVar != null && dVar.d() == this.mSelectedDevId) {
                    lVar.f21304c.f21601c.setText(dVar.g());
                    lVar.f21305d.setItemChecked(i10, true);
                    return true;
                }
            }
        }
        return false;
    }

    private final androidx.appcompat.app.a z4() {
        p pVarE1 = e1();
        m.c(pVarE1, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        return ((androidx.appcompat.app.d) pVarE1).Y0();
    }

    public final boolean A4() {
        DrawerLayout drawerLayout = this.mDrawerLayout;
        if (drawerLayout != null) {
            View view = this.mFragmentContainerView;
            m.b(view);
            if (drawerLayout.D(view)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        m.e(item, "item");
        androidx.appcompat.app.b bVar = this.mDrawerToggle;
        m.b(bVar);
        if (bVar.g(item)) {
            return true;
        }
        return super.F2(item);
    }

    public final void F4(long devId, boolean showDevSettings) {
        TintTextView[] tintTextViewArrA;
        this.mSelectedToolId = 0;
        this.mSelectedDevId = devId;
        if (a2()) {
            if (devId == 281474976710657L) {
                H4(R.id.audio, showDevSettings);
                return;
            }
            if (showDevSettings || this.mShowDevSettings) {
                J4(true);
            }
            if (!S4() && l1.l0(devId)) {
                P4(this, false, 1, null);
            }
            e eVar = this.tools;
            if (eVar == null || (tintTextViewArrA = eVar.a()) == null) {
                return;
            }
            for (TintTextView tintTextView : tintTextViewArrA) {
                tintTextView.setSelected(false);
            }
        }
    }

    public final void L4(int fragmentId, DrawerLayout drawerLayout) {
        m.e(drawerLayout, "drawerLayout");
        this.mFragmentContainerView = v3().findViewById(fragmentId);
        this.mDrawerLayout = drawerLayout;
        m.b(drawerLayout);
        drawerLayout.U(2131230913, 8388611);
        androidx.appcompat.app.a aVarZ4 = z4();
        m.b(aVarZ4);
        aVarZ4.o(true);
        aVarZ4.t(true);
        this.mDrawerToggle = new g(e1(), this.mDrawerLayout);
        if (!this.mUserLearnedDrawer && !this.mFromSavedInstanceState && !Cfg.O().getSimpleUI()) {
            DrawerLayout drawerLayout2 = this.mDrawerLayout;
            m.b(drawerLayout2);
            View view = this.mFragmentContainerView;
            m.b(view);
            drawerLayout2.M(view);
        }
        DrawerLayout drawerLayout3 = this.mDrawerLayout;
        m.b(drawerLayout3);
        drawerLayout3.post(new Runnable() { // from class: s4.a0
            @Override // java.lang.Runnable
            public final void run() {
                BDListFragment.M4(this.f26356a);
            }
        });
        DrawerLayout drawerLayout4 = this.mDrawerLayout;
        m.b(drawerLayout4);
        androidx.appcompat.app.b bVar = this.mDrawerToggle;
        m.b(bVar);
        drawerLayout4.a(bVar);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void M2() {
        u1 u1Var;
        ImageView imageView;
        super.M2();
        com.dw.ht.user.b bVar = com.dw.ht.user.b.f6853a;
        l lVar = this.binding;
        if (lVar == null || (u1Var = lVar.f21304c) == null || (imageView = u1Var.f21600b) == null) {
            return;
        }
        Context contextX3 = x3();
        m.d(contextX3, "requireContext(...)");
        imageView.setImageDrawable(bVar.h(contextX3));
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        super.O2();
        P4(this, false, 1, null);
        mi.c.e().q(this);
    }

    @Override // androidx.fragment.app.o
    public void P2() {
        super.P2();
        mi.c.e().t(this);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        l lVar = this.binding;
        if (lVar == null) {
            return;
        }
        this.mShowDevSettings = false;
        long j10 = this.mSelectedDevId;
        J4((j10 == 0 || l1.r0(j10)) ? false : true);
        Context contextX3 = x3();
        m.d(contextX3, "requireContext(...)");
        b bVar = new b(this, contextX3);
        this.mArrayAdapter = bVar;
        lVar.f21305d.setAdapter((ListAdapter) bVar);
        ListView listView = lVar.f21305d;
        v1 v1Var = this.toolsBinding;
        m.b(v1Var);
        listView.addFooterView(v1Var.b());
        P4(this, false, 1, null);
        lVar.f21304c.f21602d.setOnClickListener(this);
        lVar.f21304c.f21601c.setOnClickListener(this);
        lVar.f21304c.f21600b.setOnClickListener(this);
        v1 v1Var2 = this.toolsBinding;
        m.b(v1Var2);
        this.tools = new e(this, v1Var2);
    }

    @Override // v3.v
    protected boolean f4(o sender, int what, int arg1, int arg2, Object obj) {
        String strP1;
        BluetoothDevice remoteDevice;
        l lVar;
        u1 u1Var;
        TextView textView;
        if (sender != null && (strP1 = sender.P1()) != null) {
            if (rg.q.J(strP1, "rename_device:", false, 2, null)) {
                if (R.id.what_dialog_onclick != what && arg1 != -1) {
                    return true;
                }
                String strSubstring = strP1.substring(14, strP1.length());
                m.d(strSubstring, "substring(...)");
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    remoteDevice = defaultAdapter.getRemoteDevice(strSubstring);
                    m.b(remoteDevice);
                    m3.a.f(remoteDevice, obj instanceof String ? (String) obj : null);
                } else {
                    remoteDevice = null;
                }
                String str = obj instanceof String ? (String) obj : null;
                Cfg.v0(strSubstring, str);
                ArrayAdapter arrayAdapter = this.mArrayAdapter;
                if (arrayAdapter != null) {
                    arrayAdapter.notifyDataSetChanged();
                }
                v4.o oVarK = u.w().k(strSubstring);
                if (oVarK != null) {
                    oVarK.A0();
                }
                if (l1.W(strSubstring) == this.mSelectedDevId && (lVar = this.binding) != null && (u1Var = lVar.f21304c) != null && (textView = u1Var.f21601c) != null) {
                    if (remoteDevice != null) {
                        textView.setText(Cfg.w(remoteDevice));
                    } else {
                        textView.setText(str);
                    }
                }
                return true;
            }
        }
        return super.f4(sender, what, arg1, arg2, obj);
    }

    @Override // androidx.fragment.app.o
    public void l2(Bundle savedInstanceState) {
        super.l2(savedInstanceState);
        G3(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.o
    public void o2(Context activity) {
        m.e(activity, "activity");
        super.o2(activity);
        try {
            this.mCallbacks = activity instanceof a ? (a) activity : null;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Activity must implement NavigationDrawerCallbacks.");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        DrawerLayout drawerLayout;
        m.e(v10, "v");
        switch (v10.getId()) {
            case R.id.account_icon /* 2131296323 */:
                FragmentShowActivity.h2(x3(), null, o0.class);
                return;
            case R.id.add_dev /* 2131296370 */:
                k kVar = new k(v10.getContext(), v10);
                kVar.b().inflate(R.menu.add_device, kVar.a());
                kVar.e(new PopupMenu.OnMenuItemClickListener() { // from class: s4.y
                    @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return BDListFragment.B4(this.f26853a, menuItem);
                    }
                });
                kVar.f();
                return;
            case R.id.add_iich /* 2131296371 */:
                if (com.dw.ht.user.b.f6853a.i() == 0) {
                    Toast.makeText(k1(), N1(R.string.pleaseLoginFirst), 1).show();
                    com.dw.ht.o.f6637b.a().j().l(x3());
                    return;
                } else {
                    k kVar2 = new k(v10.getContext(), v10);
                    kVar2.b().inflate(R.menu.join_iich, kVar2.a());
                    kVar2.e(new PopupMenu.OnMenuItemClickListener() { // from class: s4.z
                        @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return BDListFragment.C4(this.f26865a, menuItem);
                        }
                    });
                    kVar2.f();
                    return;
                }
            case R.id.aprs /* 2131296413 */:
                com.dw.ht.o.f6637b.a().j().b(v10.getContext());
                break;
            case R.id.dev_name /* 2131296638 */:
            case R.id.more_dev /* 2131297016 */:
                boolean z10 = this.mShowDevSettings;
                O4(false);
                J4(!z10);
                return;
            case R.id.dtmf /* 2131296684 */:
                com.dw.ht.o.f6637b.a().j().d(v10.getContext());
                break;
            case R.id.mdc_monitor /* 2131296988 */:
                com.dw.ht.o.f6637b.a().j().g(v10.getContext());
                break;
            case R.id.morse_code /* 2131297018 */:
                com.dw.ht.o.f6637b.a().j().i(v10.getContext());
                break;
            case R.id.picture /* 2131297178 */:
                com.dw.ht.o.f6637b.a().j().j(v10.getContext());
                break;
            case R.id.satelliteManager /* 2131297299 */:
                FragmentShowActivity.h2(v10.getContext(), null, e6.class);
                break;
        }
        if (v10.getId() != R.id.audio && (drawerLayout = this.mDrawerLayout) != null) {
            View view = this.mFragmentContainerView;
            m.b(view);
            drawerLayout.f(view);
        }
        a aVar = this.mCallbacks;
        if (aVar == null || !aVar.a(v10.getId())) {
            return;
        }
        H4(v10.getId(), true);
    }

    @Override // androidx.fragment.app.o, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        m.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        androidx.appcompat.app.b bVar = this.mDrawerToggle;
        m.b(bVar);
        bVar.f(newConfig);
    }

    @mi.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(m.a event) {
        rd.m.e(event, "event");
        P4(this, false, 1, null);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        this.mAutoStartDevBind = false;
        this.mUserLearnedDrawer = PreferenceManager.getDefaultSharedPreferences(e1()).getBoolean(S0, false);
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        Drawable drawableD = b0.b.d(contextX3, R.drawable.ic_arrow_drop_down_24dp);
        rd.m.b(drawableD);
        this.mDownDrawable = drawableD;
        Drawable drawableD2 = b0.b.d(contextX3, R.drawable.ic_arrow_drop_up_24dp);
        rd.m.b(drawableD2);
        this.mUpDrawable = drawableD2;
        Drawable drawable = this.mDownDrawable;
        Drawable drawable2 = null;
        if (drawable == null) {
            rd.m.o("mDownDrawable");
            drawable = null;
        }
        Drawable drawable3 = this.mDownDrawable;
        if (drawable3 == null) {
            rd.m.o("mDownDrawable");
            drawable3 = null;
        }
        int intrinsicWidth = drawable3.getIntrinsicWidth();
        Drawable drawable4 = this.mDownDrawable;
        if (drawable4 == null) {
            rd.m.o("mDownDrawable");
            drawable4 = null;
        }
        drawable.setBounds(0, 0, intrinsicWidth, drawable4.getIntrinsicHeight());
        Drawable drawable5 = this.mUpDrawable;
        if (drawable5 == null) {
            rd.m.o("mUpDrawable");
            drawable5 = null;
        }
        Drawable drawable6 = this.mUpDrawable;
        if (drawable6 == null) {
            rd.m.o("mUpDrawable");
            drawable6 = null;
        }
        int intrinsicWidth2 = drawable6.getIntrinsicWidth();
        Drawable drawable7 = this.mUpDrawable;
        if (drawable7 == null) {
            rd.m.o("mUpDrawable");
        } else {
            drawable2 = drawable7;
        }
        drawable5.setBounds(0, 0, intrinsicWidth2, drawable2.getIntrinsicHeight());
        if (savedInstanceState != null) {
            this.mFromSavedInstanceState = true;
        }
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        if (this.mDrawerLayout != null && A4()) {
            N4();
        }
        super.u2(menu, inflater);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        l lVarC = l.c(inflater, container, false);
        this.binding = lVarC;
        rd.m.b(lVarC);
        this.toolsBinding = v1.c(inflater, lVarC.f21305d, false);
        l lVar = this.binding;
        rd.m.b(lVar);
        lVar.b().setClickable(true);
        l lVar2 = this.binding;
        rd.m.b(lVar2);
        this.mRootView = lVar2.b();
        l lVar3 = this.binding;
        rd.m.b(lVar3);
        LinearLayoutCompat linearLayoutCompatB = lVar3.b();
        rd.m.d(linearLayoutCompatB, "getRoot(...)");
        return linearLayoutCompatB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
        this.toolsBinding = null;
        this.tools = null;
    }

    public final void y4() {
        DrawerLayout drawerLayout;
        View view = this.mFragmentContainerView;
        if (view == null || (drawerLayout = this.mDrawerLayout) == null) {
            return;
        }
        drawerLayout.f(view);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void z2() {
        super.z2();
        this.mCallbacks = null;
    }

    @mi.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(d0.a event) {
        rd.m.e(event, "event");
        P4(this, false, 1, null);
    }

    final class d {

        /* JADX INFO: renamed from: a */
        private BluetoothDevice f6122a;

        /* JADX INFO: renamed from: b */
        private IIChannel f6123b;

        /* JADX INFO: renamed from: c */
        private final long f6124c;

        /* JADX INFO: renamed from: d */
        private n4.a f6125d;

        public d(BDListFragment bDListFragment, IIChannel iIChannel) {
            rd.m.e(iIChannel, "iic");
            BDListFragment.this = bDListFragment;
            this.f6123b = iIChannel;
            this.f6124c = iIChannel.getChannelId() + 28147497671065500L;
        }

        public final BluetoothDevice a() {
            return this.f6122a;
        }

        public final n4.a b() {
            return this.f6125d;
        }

        public final boolean c() {
            IIChannel iIChannel = this.f6123b;
            if (iIChannel == null) {
                return false;
            }
            rd.m.b(iIChannel);
            return iIChannel.getHaveNewMessage();
        }

        public final long d() {
            return this.f6124c;
        }

        public final IIChannel e() {
            return this.f6123b;
        }

        public final String f() {
            n4.a aVar = this.f6125d;
            if (aVar == null) {
                return "";
            }
            BDListFragment bDListFragment = BDListFragment.this;
            if (!(aVar instanceof n4.c) || ((n4.c) aVar).j().l() != n0.c.Connecting) {
                return "";
            }
            String string = bDListFragment.x3().getString(R.string.connecting);
            rd.m.d(string, "getString(...)");
            return string;
        }

        public final String g() {
            n4.a aVar = this.f6125d;
            if (aVar != null) {
                String strD = aVar.d();
                rd.m.d(strD, "getName(...)");
                return strD;
            }
            BluetoothDevice bluetoothDevice = this.f6122a;
            if (bluetoothDevice == null) {
                IIChannel iIChannel = this.f6123b;
                return iIChannel != null ? iIChannel.k() : "USB";
            }
            rd.m.b(bluetoothDevice);
            String strW = Cfg.w(bluetoothDevice);
            rd.m.d(strW, "getDevName(...)");
            return strW;
        }

        public d(BDListFragment bDListFragment, BluetoothDevice bluetoothDevice) {
            rd.m.e(bluetoothDevice, "bd");
            BDListFragment.this = bDListFragment;
            this.f6122a = bluetoothDevice;
            this.f6124c = l1.W(bluetoothDevice.getAddress());
        }

        public d(long j10) {
            this.f6124c = j10;
        }

        public d(BDListFragment bDListFragment, n4.a aVar) {
            rd.m.e(aVar, "device");
            BDListFragment.this = bDListFragment;
            this.f6125d = aVar;
            this.f6124c = aVar.f22426a;
            this.f6122a = aVar.c();
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(b.a event) {
        rd.m.e(event, "event");
        if (event == b.a.OnDeviceListChanged) {
            P4(this, false, 1, null);
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(i0.b event) {
        ArrayAdapter arrayAdapter;
        rd.m.e(event, "event");
        if (event != i0.b.f29899a || (arrayAdapter = this.mArrayAdapter) == null) {
            return;
        }
        arrayAdapter.notifyDataSetChanged();
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.e event) {
        rd.m.e(event, "event");
        ArrayAdapter arrayAdapter = this.mArrayAdapter;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(l1.g event) {
        rd.m.e(event, "event");
        ArrayAdapter arrayAdapter = this.mArrayAdapter;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.c event) {
        rd.m.e(event, "event");
        if (f.f6129a[event.ordinal()] == 1) {
            l1 l1VarR = u.w().r();
            G4(this, l1VarR != null ? l1VarR.q() : 0L, false, 2, null);
        }
    }
}
