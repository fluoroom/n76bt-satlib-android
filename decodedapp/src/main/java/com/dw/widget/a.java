package com.dw.widget;

import a6.y;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SectionIndexer;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k3.g;
import k3.j;
import k3.k;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final List f7003o = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PopupWindow f7004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c6.a f7005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f7006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f7007d = c.CENTER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7008e = 17;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f7009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ListAdapter f7010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private GridViewEx f7011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbsListView f7012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f7013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f7015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d f7016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7017n;

    /* JADX INFO: renamed from: com.dw.widget.a$a, reason: collision with other inner class name */
    class RunnableC0107a implements Runnable {
        RunnableC0107a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f7005b.notifyDataSetChanged();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f7005b.notifyDataSetChanged();
        }
    }

    public enum c {
        TOP,
        CENTER,
        BOTTOM
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f7005b.c(a.f7003o);
        }
    }

    class e extends c6.a implements View.OnClickListener {
        public e() {
            super(a.this.f7012i.getContext(), g.f19211e, k3.f.M, d4.c.f10567g);
        }

        @Override // c6.a, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view == null) {
                if (a.this.f7006c != null) {
                    ((TextView) view2.findViewById(k3.f.M)).setTextColor(a.this.f7006c.intValue());
                }
                if (a.this.f7017n != 0) {
                    view2.setBackgroundResource(a.this.f7017n);
                }
            }
            view2.setTag(Integer.valueOf(i10));
            view2.setOnClickListener(this);
            return view2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            Object item = getItem(iIntValue);
            if (item instanceof f) {
                iIntValue = ((f) item).f7027b;
            }
            ListAdapter listAdapter = a.this.f7010g;
            if (listAdapter instanceof SectionIndexer) {
                a.this.f7012i.setSelection(((SectionIndexer) listAdapter).getPositionForSection(iIntValue));
            }
            a.this.h();
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f7026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7027b;

        public f(String str, int i10) {
            this.f7026a = str;
            this.f7027b = i10;
        }

        public String toString() {
            return this.f7026a;
        }
    }

    public a(AbsListView absListView) {
        this.f7012i = absListView;
        Context context = absListView.getContext();
        this.f7013j = context;
        o(y.a(context, k3.b.f19155c, -1157627904));
    }

    private View g() {
        View viewInflate = ((LayoutInflater) this.f7013j.getSystemService("layout_inflater")).inflate(g.f19210d, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(k3.f.f19194n);
        if (this.f7009f != null) {
            viewInflate.findViewById(k3.f.f19189i).setBackgroundDrawable(this.f7009f);
        }
        Integer num = this.f7006c;
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
        GridViewEx gridViewEx = (GridViewEx) viewInflate.findViewById(k3.f.f19200t);
        this.f7011h = gridViewEx;
        this.f7015l = textView;
        gridViewEx.setColumnWidth(this.f7013j.getResources().getDimensionPixelSize(k3.d.f19168b));
        this.f7005b = new e();
        r();
        gridViewEx.setAdapter((ListAdapter) this.f7005b);
        gridViewEx.setEmptyView(textView);
        return viewInflate;
    }

    private void i() {
        if (this.f7004a != null) {
            return;
        }
        View viewG = g();
        PopupWindow popupWindow = new PopupWindow(this.f7013j);
        popupWindow.setTouchable(true);
        popupWindow.setInputMethodMode(2);
        popupWindow.setContentView(viewG);
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-2);
        popupWindow.setBackgroundDrawable(new ColorDrawable(16777216));
        this.f7004a = popupWindow;
    }

    private void l() {
        this.f7011h.setMaxHeight(-1);
        s();
        this.f7004a.setAnimationStyle(k.f19244b);
        this.f7004a.setWidth(-1);
        this.f7004a.setHeight(-2);
        this.f7004a.setFocusable(true);
        if (this.f7004a.isShowing()) {
            this.f7004a.update(0, 0, -1, -1);
        } else {
            this.f7004a.showAtLocation(this.f7012i, this.f7008e, 0, 0);
        }
        this.f7012i.postDelayed(new b(), 50L);
    }

    private void m() {
        int height = this.f7012i.getHeight();
        if (height == 0) {
            return;
        }
        int iD = a6.k.d(this.f7013j);
        int[] iArr = new int[2];
        this.f7012i.getLocationOnScreen(iArr);
        this.f7011h.setMaxHeight(height / 2);
        s();
        this.f7004a.setAnimationStyle(k.f19245c);
        this.f7004a.setWidth(this.f7012i.getWidth());
        this.f7004a.setFocusable(false);
        if (this.f7004a.isShowing()) {
            this.f7004a.update(iArr[0], (iD - iArr[1]) - height, -1, -1);
        } else {
            this.f7004a.showAtLocation(this.f7012i, 83, iArr[0], (iD - iArr[1]) - height);
        }
        this.f7012i.postDelayed(new RunnableC0107a(), 50L);
    }

    private void s() {
        if (this.f7014k) {
            this.f7015l.setText("…");
        } else {
            this.f7015l.setText(j.f19233a);
        }
    }

    public void h() {
        this.f7014k = false;
        PopupWindow popupWindow = this.f7004a;
        if (popupWindow == null) {
            return;
        }
        popupWindow.dismiss();
    }

    protected void j() {
        if (this.f7014k) {
            q();
        }
    }

    public void k(int i10) {
        if (this.f7014k && i10 == 0) {
            q();
        }
    }

    public void n(ListAdapter listAdapter) {
        if (listAdapter == this.f7010g) {
            return;
        }
        this.f7010g = listAdapter;
        r();
    }

    public void o(int i10) {
        float fB = a6.k.b(this.f7013j, 3.0f);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i10, i10});
        gradientDrawable.setCornerRadius(fB);
        this.f7009f = gradientDrawable;
        this.f7017n = y.g(this.f7013j, k3.b.f19164l, 0);
    }

    public void p() {
        if (this.f7012i.getWindowVisibility() != 0) {
            return;
        }
        i();
        l();
    }

    public void q() {
        this.f7014k = true;
        if (this.f7012i.getWindowVisibility() != 0) {
            return;
        }
        i();
        m();
    }

    public void r() {
        if (this.f7005b == null) {
            return;
        }
        ListAdapter listAdapter = this.f7010g;
        Object[] sections = listAdapter instanceof SectionIndexer ? ((SectionIndexer) listAdapter).getSections() : null;
        if (sections == null) {
            sections = d4.c.f10567g;
        }
        s();
        ArrayList arrayList = new ArrayList(sections.length);
        HashSet hashSet = new HashSet(sections.length);
        for (int i10 = 0; i10 < sections.length; i10++) {
            String string = sections[i10].toString();
            if (hashSet.add(string)) {
                arrayList.add(new f(string, i10));
            }
        }
        if (!this.f7014k) {
            this.f7005b.c(arrayList);
            return;
        }
        d dVar = this.f7016m;
        if (dVar != null) {
            this.f7012i.removeCallbacks(dVar);
        }
        if (sections.length != 0) {
            this.f7005b.c(arrayList);
            return;
        }
        d dVar2 = new d();
        this.f7016m = dVar2;
        this.f7012i.postDelayed(dVar2, 500L);
    }
}
