package com.dw.android.widget;

import a6.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.PopupMenu;
import c6.q;
import com.dw.android.widget.ScrollHeaderLayout;
import com.dw.widget.GridViewEx;
import java.util.HashSet;
import k3.g;
import u3.l;
import u3.v;

/* JADX INFO: loaded from: classes.dex */
public class a implements ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PopupWindow f5388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListAdapter f5389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GridViewEx f5390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f5391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f5392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f5393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScrollHeaderLayout f5394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View.OnClickListener f5395h = new ViewOnClickListenerC0082a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ScrollHeaderLayout.d f5396r = new b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5397s = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f5398t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f5399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private PopupMenu.OnMenuItemClickListener f5400v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f5401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f5402x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f5403y;

    /* JADX INFO: renamed from: com.dw.android.widget.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0082a implements View.OnClickListener {
        ViewOnClickListenerC0082a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.c();
        }
    }

    class b implements ScrollHeaderLayout.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f5405a;

        b() {
        }

        @Override // com.dw.android.widget.ScrollHeaderLayout.d
        public void a(ScrollHeaderLayout scrollHeaderLayout, int i10) {
        }

        @Override // com.dw.android.widget.ScrollHeaderLayout.d
        public boolean b(ScrollHeaderLayout scrollHeaderLayout, float f10, float f11) {
            return false;
        }

        @Override // com.dw.android.widget.ScrollHeaderLayout.d
        public void c(ScrollHeaderLayout scrollHeaderLayout) {
            int scrollY = scrollHeaderLayout.getScrollY();
            if (this.f5405a) {
                if (a.this.f5397s > scrollY) {
                    a.this.c();
                }
            } else if (scrollY >= a.this.f5397s) {
                this.f5405a = true;
            }
        }
    }

    static class c extends l {
        private HashSet A;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private LayoutInflater f5407w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f5408x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ColorStateList f5409y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private ColorStateList f5410z;

        public c(Context context, Menu menu, int[] iArr) {
            super(context, menu);
            this.f5407w = LayoutInflater.from(context);
            this.f5408x = k.b(context, 24.0f);
            this.f5409y = ColorStateList.valueOf(-1442840576);
            this.f5410z = ColorStateList.valueOf(-1442674479);
            if (iArr != null) {
                this.A = new HashSet();
                for (int i10 : iArr) {
                    this.A.add(Integer.valueOf(i10));
                }
            }
        }

        @Override // c6.a, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            TintTextView tintTextView = view != null ? (TintTextView) view : (TintTextView) this.f5407w.inflate(g.f19209c, viewGroup, false);
            MenuItem menuItem = (MenuItem) getItem(i10);
            tintTextView.setText(menuItem.getTitle());
            Drawable icon = menuItem.getIcon();
            if (icon != null) {
                int i11 = this.f5408x;
                icon.setBounds(0, 0, i11, i11);
            } else {
                icon = new ColorDrawable(0);
                int i12 = this.f5408x;
                icon.setBounds(0, 0, i12, i12);
            }
            tintTextView.setCompoundDrawables(null, icon, null, null);
            float f10 = menuItem.isEnabled() ? 1.0f : 0.3f;
            if (!q.f(tintTextView, f10)) {
                icon.setAlpha((int) (f10 * 255.0f));
            }
            HashSet hashSet = this.A;
            if (hashSet != null && hashSet.contains(Integer.valueOf(menuItem.getItemId()))) {
                tintTextView.setTintList(null);
                return tintTextView;
            }
            if (menuItem.getGroupId() == k3.f.f19199s) {
                tintTextView.setTintList(this.f5410z);
                return tintTextView;
            }
            tintTextView.setTintList(this.f5409y);
            return tintTextView;
        }
    }

    public a(View view) {
        this.f5391d = view;
        this.f5392e = view.getContext();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f5401w = iArr[1] + view.getHeight();
    }

    private View b() {
        View viewInflate = LayoutInflater.from(this.f5392e).inflate(g.f19208b, (ViewGroup) null);
        this.f5394g = (ScrollHeaderLayout) viewInflate.findViewById(k3.f.A);
        this.f5398t = (TextView) viewInflate.findViewById(k3.f.P);
        viewInflate.findViewById(k3.f.f19201u).setOnClickListener(this.f5395h);
        viewInflate.findViewById(k3.f.f19196p).setOnClickListener(this.f5395h);
        this.f5394g.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f5394g.setOnScrollListener(this.f5396r);
        this.f5393f = viewInflate.findViewById(k3.f.I);
        GridViewEx gridViewEx = (GridViewEx) viewInflate.findViewById(k3.f.f19200t);
        this.f5390c = gridViewEx;
        gridViewEx.setOnItemClickListener(this);
        l();
        this.f5390c.setAdapter(this.f5389b);
        return viewInflate;
    }

    private void d() {
        if (this.f5388a != null) {
            return;
        }
        View viewB = b();
        PopupWindow popupWindow = new PopupWindow(this.f5392e);
        popupWindow.setTouchable(true);
        popupWindow.setInputMethodMode(2);
        popupWindow.setContentView(viewB);
        popupWindow.setBackgroundDrawable(new ColorDrawable(16777216));
        this.f5388a = popupWindow;
        this.f5390c.setMaxHeight(-1);
        popupWindow.setAnimationStyle(k3.k.f19243a);
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-2);
        popupWindow.setFocusable(true);
    }

    private void e(MenuItem menuItem) {
        if (menuItem.isEnabled()) {
            PopupMenu.OnMenuItemClickListener onMenuItemClickListener = this.f5400v;
            if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem)) {
                c();
                return;
            }
            SubMenu subMenu = menuItem.getSubMenu();
            if (subMenu != null) {
                j(menuItem.getTitle());
                g(subMenu);
            } else if (menuItem.getIntent() != null) {
                c();
                this.f5392e.startActivity(menuItem.getIntent());
            }
        }
    }

    private void l() {
        if (this.f5398t == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f5399u)) {
            this.f5398t.setVisibility(8);
            return;
        }
        this.f5398t.setVisibility(0);
        this.f5398t.setText(this.f5399u);
        this.f5398t.setTextColor(-16777216);
    }

    public void c() {
        PopupWindow popupWindow = this.f5388a;
        if (popupWindow == null) {
            return;
        }
        try {
            popupWindow.dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void f(ListAdapter listAdapter) {
        if (listAdapter == this.f5389b) {
            return;
        }
        this.f5389b = listAdapter;
        GridViewEx gridViewEx = this.f5390c;
        if (gridViewEx != null) {
            gridViewEx.setAdapter(listAdapter);
        }
    }

    public void g(Menu menu) {
        h(menu, null);
    }

    public void h(Menu menu, int[] iArr) {
        f(new c(this.f5392e, menu, iArr));
    }

    public void i(PopupMenu.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5400v = onMenuItemClickListener;
    }

    public void j(CharSequence charSequence) {
        if (a6.q.d(charSequence, this.f5399u)) {
            return;
        }
        this.f5399u = charSequence;
        l();
    }

    public void k() {
        if (this.f5391d.getWindowVisibility() != 0) {
            return;
        }
        d();
        if (this.f5388a.isShowing()) {
            this.f5388a.update(0, 0, -1, -1);
        } else {
            this.f5388a.showAtLocation(this.f5391d, 17, 0, 0);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i10 = this.f5392e.getResources().getDisplayMetrics().heightPixels;
        int height = (this.f5393f.getHeight() + v.j(this.f5393f, this.f5394g).y) - this.f5394g.getHeight();
        int i11 = i10 - this.f5401w;
        this.f5397s = height - (this.f5393f.getHeight() / 2);
        int iMax = Math.max(height, i11);
        if (iMax == this.f5402x) {
            return;
        }
        this.f5402x = iMax;
        if (this.f5403y) {
            this.f5394g.o(0, iMax);
        } else {
            this.f5394g.scrollTo(0, iMax);
        }
        this.f5403y = true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        Object item = this.f5389b.getItem(i10);
        if (item instanceof MenuItem) {
            e((MenuItem) item);
        }
    }
}
