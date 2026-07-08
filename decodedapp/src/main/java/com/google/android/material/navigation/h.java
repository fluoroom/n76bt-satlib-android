package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.view.menu.o;
import androidx.transition.u;
import androidx.transition.x;
import java.util.HashSet;
import n0.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends ViewGroup implements o {

    /* JADX INFO: renamed from: i0 */
    private static final int[] f8094i0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: j0 */
    private static final int[] f8095j0 = {-16842910};
    private boolean A;
    private Drawable B;
    private ColorStateList C;
    private int D;
    private final SparseArray E;
    private int F;
    private int G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private m9.l R;
    private boolean S;
    private ColorStateList T;
    private i U;
    private f V;
    private boolean W;

    /* JADX INFO: renamed from: a */
    private final x f8096a;

    /* JADX INFO: renamed from: a0 */
    private boolean f8097a0;

    /* JADX INFO: renamed from: b */
    private final View.OnClickListener f8098b;

    /* JADX INFO: renamed from: b0 */
    private int f8099b0;

    /* JADX INFO: renamed from: c */
    private l0.d f8100c;

    /* JADX INFO: renamed from: c0 */
    private int f8101c0;

    /* JADX INFO: renamed from: d */
    private final SparseArray f8102d;

    /* JADX INFO: renamed from: d0 */
    private boolean f8103d0;

    /* JADX INFO: renamed from: e */
    private int f8104e;

    /* JADX INFO: renamed from: e0 */
    private MenuItem f8105e0;

    /* JADX INFO: renamed from: f */
    private int f8106f;

    /* JADX INFO: renamed from: f0 */
    private int f8107f0;

    /* JADX INFO: renamed from: g */
    private g[] f8108g;

    /* JADX INFO: renamed from: g0 */
    private boolean f8109g0;

    /* JADX INFO: renamed from: h */
    private int f8110h;

    /* JADX INFO: renamed from: h0 */
    private final Rect f8111h0;

    /* JADX INFO: renamed from: r */
    private int f8112r;

    /* JADX INFO: renamed from: s */
    private ColorStateList f8113s;

    /* JADX INFO: renamed from: t */
    private int f8114t;

    /* JADX INFO: renamed from: u */
    private ColorStateList f8115u;

    /* JADX INFO: renamed from: v */
    private final ColorStateList f8116v;

    /* JADX INFO: renamed from: w */
    private int f8117w;

    /* JADX INFO: renamed from: x */
    private int f8118x;

    /* JADX INFO: renamed from: y */
    private int f8119y;

    /* JADX INFO: renamed from: z */
    private int f8120z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            androidx.appcompat.view.menu.j itemData = ((d) view).getItemData();
            boolean zE = h.this.V.e(itemData, h.this.U, 0);
            if (itemData == null || !itemData.isCheckable()) {
                return;
            }
            if (!zE || itemData.isChecked()) {
                h.this.setCheckedItem(itemData);
            }
        }
    }

    public h(Context context) {
        super(context);
        this.f8102d = new SparseArray();
        this.f8110h = -1;
        this.f8112r = -1;
        this.E = new SparseArray();
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.Q = 49;
        this.S = false;
        this.f8099b0 = 1;
        this.f8101c0 = 0;
        this.f8105e0 = null;
        this.f8107f0 = 7;
        this.f8109g0 = false;
        this.f8111h0 = new Rect();
        this.f8116v = d(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f8096a = null;
        } else {
            androidx.transition.a aVar = new androidx.transition.a();
            this.f8096a = aVar;
            aVar.F0(0);
            aVar.x(TextView.class, true);
            aVar.m0(h9.d.f(getContext(), u8.b.A, getResources().getInteger(u8.g.f28670b)));
            aVar.o0(h9.d.g(getContext(), u8.b.I, v8.a.f30493b));
            aVar.w0(new com.google.android.material.internal.k());
        }
        this.f8098b = new a();
        setImportantForAccessibility(1);
    }

    private Drawable e() {
        if (this.R == null || this.T == null) {
            return null;
        }
        m9.h hVar = new m9.h(this.R);
        hVar.c0(this.T);
        return hVar;
    }

    private d f(int i10, androidx.appcompat.view.menu.j jVar, boolean z10, boolean z11) {
        this.U.c(true);
        jVar.setCheckable(true);
        this.U.c(false);
        d newItem = getNewItem();
        newItem.setShifting(z10);
        newItem.setLabelMaxLines(this.f8099b0);
        newItem.setIconTintList(this.f8113s);
        newItem.setIconSize(this.f8114t);
        newItem.setTextColor(this.f8116v);
        newItem.setTextAppearanceInactive(this.f8117w);
        newItem.setTextAppearanceActive(this.f8118x);
        newItem.setHorizontalTextAppearanceInactive(this.f8119y);
        newItem.setHorizontalTextAppearanceActive(this.f8120z);
        newItem.setTextAppearanceActiveBoldEnabled(this.A);
        newItem.setTextColor(this.f8115u);
        int i11 = this.F;
        if (i11 != -1) {
            newItem.setItemPaddingTop(i11);
        }
        int i12 = this.G;
        if (i12 != -1) {
            newItem.setItemPaddingBottom(i12);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.W);
        newItem.setLabelFontScalingEnabled(this.f8097a0);
        int i13 = this.H;
        if (i13 != -1) {
            newItem.setActiveIndicatorLabelPadding(i13);
        }
        int i14 = this.I;
        if (i14 != -1) {
            newItem.setIconLabelHorizontalSpacing(i14);
        }
        newItem.setActiveIndicatorWidth(this.K);
        newItem.setActiveIndicatorHeight(this.L);
        newItem.setActiveIndicatorExpandedWidth(this.M);
        newItem.setActiveIndicatorExpandedHeight(this.N);
        newItem.setActiveIndicatorMarginHorizontal(this.O);
        newItem.setItemGravity(this.Q);
        newItem.setActiveIndicatorExpandedPadding(this.f8111h0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.P);
        newItem.setActiveIndicatorDrawable(e());
        newItem.setActiveIndicatorResizeable(this.S);
        newItem.setActiveIndicatorEnabled(this.J);
        Drawable drawable = this.B;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.D);
        }
        newItem.setItemRippleColor(this.C);
        newItem.setLabelVisibilityMode(this.f8104e);
        newItem.setItemIconGravity(this.f8106f);
        newItem.setOnlyShowWhenExpanded(z11);
        newItem.setExpanded(this.f8103d0);
        newItem.initialize(jVar, 0);
        newItem.setItemPosition(i10);
        int itemId = jVar.getItemId();
        newItem.setOnTouchListener((View.OnTouchListener) this.f8102d.get(itemId));
        newItem.setOnClickListener(this.f8098b);
        int i15 = this.f8110h;
        if (i15 != 0 && itemId == i15) {
            this.f8112r = i10;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f8107f0, this.V.d());
    }

    private d getNewItem() {
        l0.d dVar = this.f8100c;
        d dVar2 = dVar != null ? (d) dVar.b() : null;
        return dVar2 == null ? g(getContext()) : dVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0068, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean h() {
        /*
            r5 = this;
            com.google.android.material.navigation.g[] r0 = r5.f8108g
            r1 = 0
            if (r0 == 0) goto L6d
            com.google.android.material.navigation.f r0 = r5.V
            if (r0 == 0) goto L6d
            int r0 = r0.g()
            com.google.android.material.navigation.g[] r2 = r5.f8108g
            int r2 = r2.length
            if (r0 == r2) goto L13
            goto L6d
        L13:
            r0 = 0
        L14:
            com.google.android.material.navigation.g[] r2 = r5.f8108g
            int r2 = r2.length
            r3 = 1
            if (r0 >= r2) goto L6c
            com.google.android.material.navigation.f r2 = r5.V
            android.view.MenuItem r2 = r2.b(r0)
            boolean r2 = r2 instanceof com.google.android.material.navigation.a
            if (r2 == 0) goto L2d
            com.google.android.material.navigation.g[] r2 = r5.f8108g
            r2 = r2[r0]
            boolean r2 = r2 instanceof com.google.android.material.navigation.b
            if (r2 != 0) goto L2d
            return r1
        L2d:
            com.google.android.material.navigation.f r2 = r5.V
            android.view.MenuItem r2 = r2.b(r0)
            boolean r2 = r2.hasSubMenu()
            if (r2 == 0) goto L43
            com.google.android.material.navigation.g[] r2 = r5.f8108g
            r2 = r2[r0]
            boolean r2 = r2 instanceof com.google.android.material.navigation.k
            if (r2 != 0) goto L43
            r2 = 1
            goto L44
        L43:
            r2 = 0
        L44:
            com.google.android.material.navigation.f r4 = r5.V
            android.view.MenuItem r4 = r4.b(r0)
            boolean r4 = r4.hasSubMenu()
            if (r4 != 0) goto L59
            com.google.android.material.navigation.g[] r4 = r5.f8108g
            r4 = r4[r0]
            boolean r4 = r4 instanceof com.google.android.material.navigation.d
            if (r4 != 0) goto L59
            goto L5a
        L59:
            r3 = 0
        L5a:
            com.google.android.material.navigation.f r4 = r5.V
            android.view.MenuItem r4 = r4.b(r0)
            boolean r4 = r4 instanceof com.google.android.material.navigation.a
            if (r4 != 0) goto L69
            if (r2 != 0) goto L68
            if (r3 == 0) goto L69
        L68:
            return r1
        L69:
            int r0 = r0 + 1
            goto L14
        L6c:
            return r3
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.h.h():boolean");
    }

    private boolean j(int i10) {
        return i10 != -1;
    }

    private void k() {
        g[] gVarArr = this.f8108g;
        if (gVarArr == null || this.f8100c == null) {
            return;
        }
        for (g gVar : gVarArr) {
            if (gVar instanceof d) {
                d dVar = (d) gVar;
                this.f8100c.a(dVar);
                dVar.e();
            }
        }
    }

    private void l() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.V.g(); i10++) {
            hashSet.add(Integer.valueOf(this.V.b(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            int iKeyAt = this.E.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.E.delete(iKeyAt);
            }
        }
    }

    private void setBadgeIfNeeded(d dVar) {
        w8.a aVar;
        int id2 = dVar.getId();
        if (j(id2) && (aVar = (w8.a) this.E.get(id2)) != null) {
            dVar.setBadge(aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c() {
        View viewF;
        removeAllViews();
        k();
        this.U.c(true);
        this.V.f();
        this.U.c(false);
        int iA = this.V.a();
        if (iA == 0) {
            this.f8110h = 0;
            this.f8112r = 0;
            this.f8108g = null;
            this.f8100c = null;
            return;
        }
        if (this.f8100c == null || this.f8101c0 != iA) {
            this.f8101c0 = iA;
            this.f8100c = new l0.f(iA);
        }
        l();
        int iG = this.V.g();
        this.f8108g = new g[iG];
        boolean zI = i(this.f8104e, getCurrentVisibleContentItemCount());
        int size = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.V.b(i11);
            boolean z10 = menuItemB instanceof com.google.android.material.navigation.a;
            if (z10) {
                b bVar = new b(getContext());
                bVar.setOnlyShowWhenExpanded(true);
                bVar.setDividersEnabled(this.f8109g0);
                viewF = bVar;
            } else if (menuItemB.hasSubMenu()) {
                if (size > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                k kVar = new k(getContext());
                int i12 = this.f8120z;
                if (i12 == 0) {
                    i12 = this.f8118x;
                }
                kVar.setTextAppearance(i12);
                kVar.setTextColor(this.f8115u);
                kVar.setOnlyShowWhenExpanded(true);
                kVar.initialize((androidx.appcompat.view.menu.j) menuItemB, 0);
                size = menuItemB.getSubMenu().size();
                viewF = kVar;
            } else if (size > 0) {
                size--;
                viewF = f(i11, (androidx.appcompat.view.menu.j) menuItemB, zI, true);
            } else {
                androidx.appcompat.view.menu.j jVar = (androidx.appcompat.view.menu.j) menuItemB;
                boolean z11 = i10 >= this.f8107f0;
                i10++;
                viewF = f(i11, jVar, zI, z11);
            }
            if (!z10 && menuItemB.isCheckable() && this.f8112r == -1) {
                this.f8112r = i11;
            }
            this.f8108g[i11] = viewF;
            addView(viewF);
        }
        int iMin = Math.min(iG - 1, this.f8112r);
        this.f8112r = iMin;
        setCheckedItem(this.f8108g[iMin].getItemData());
    }

    public ColorStateList d(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = i.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(h.a.M, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = f8095j0;
        return new ColorStateList(new int[][]{iArr, f8094i0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    protected abstract d g(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.H;
    }

    SparseArray<w8.a> getBadgeDrawables() {
        return this.E;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.f8103d0 ? this.V.c() : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f8120z;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f8119y;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.I;
    }

    public ColorStateList getIconTintList() {
        return this.f8113s;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.T;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.J;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.N;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.P;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.M;
    }

    public int getItemActiveIndicatorHeight() {
        return this.L;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.O;
    }

    public m9.l getItemActiveIndicatorShapeAppearance() {
        return this.R;
    }

    public int getItemActiveIndicatorWidth() {
        return this.K;
    }

    public Drawable getItemBackground() {
        g[] gVarArr = this.f8108g;
        if (gVarArr != null && gVarArr.length > 0) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    return ((d) gVar).getBackground();
                }
            }
        }
        return this.B;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.D;
    }

    public int getItemGravity() {
        return this.Q;
    }

    public int getItemIconGravity() {
        return this.f8106f;
    }

    public int getItemIconSize() {
        return this.f8114t;
    }

    public int getItemPaddingBottom() {
        return this.G;
    }

    public int getItemPaddingTop() {
        return this.F;
    }

    public ColorStateList getItemRippleColor() {
        return this.C;
    }

    public int getItemTextAppearanceActive() {
        return this.f8118x;
    }

    public int getItemTextAppearanceInactive() {
        return this.f8117w;
    }

    public ColorStateList getItemTextColor() {
        return this.f8115u;
    }

    public int getLabelMaxLines() {
        return this.f8099b0;
    }

    public int getLabelVisibilityMode() {
        return this.f8104e;
    }

    protected f getMenu() {
        return this.V;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f8097a0;
    }

    public int getSelectedItemId() {
        return this.f8110h;
    }

    protected int getSelectedItemPosition() {
        return this.f8112r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    protected boolean i(int i10, int i11) {
        return i10 == -1 ? i11 > 3 : i10 == 0;
    }

    @Override // androidx.appcompat.view.menu.o
    public void initialize(androidx.appcompat.view.menu.h hVar) {
        this.V = new f(hVar);
    }

    void m(SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            if (this.E.indexOfKey(iKeyAt) < 0) {
                this.E.append(iKeyAt, (w8.a) sparseArray.get(iKeyAt));
            }
        }
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    d dVar = (d) gVar;
                    w8.a aVar = (w8.a) this.E.get(dVar.getId());
                    if (aVar != null) {
                        dVar.setBadge(aVar);
                    }
                }
            }
        }
    }

    public void n(int i10, int i11, int i12, int i13) {
        Rect rect = this.f8111h0;
        rect.left = i10;
        rect.top = i11;
        rect.right = i12;
        rect.bottom = i13;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorExpandedPadding(this.f8111h0);
                }
            }
        }
    }

    void o(int i10) {
        int iG = this.V.g();
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.V.b(i11);
            if (i10 == menuItemB.getItemId()) {
                this.f8110h = i10;
                this.f8112r = i11;
                setCheckedItem(menuItemB);
                return;
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        n0.x.Y0(accessibilityNodeInfo).v0(x.f.a(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    public void p() {
        androidx.transition.x xVar;
        if (this.V == null || this.f8108g == null) {
            return;
        }
        this.U.c(true);
        this.V.f();
        this.U.c(false);
        if (!h()) {
            c();
            return;
        }
        int i10 = this.f8110h;
        int iG = this.V.g();
        for (int i11 = 0; i11 < iG; i11++) {
            MenuItem menuItemB = this.V.b(i11);
            if (menuItemB.isChecked()) {
                setCheckedItem(menuItemB);
                this.f8110h = menuItemB.getItemId();
                this.f8112r = i11;
            }
        }
        if (i10 != this.f8110h && (xVar = this.f8096a) != null) {
            u.a(this, xVar);
        }
        boolean zI = i(this.f8104e, getCurrentVisibleContentItemCount());
        for (int i12 = 0; i12 < iG; i12++) {
            this.U.c(true);
            this.f8108g[i12].setExpanded(this.f8103d0);
            g gVar = this.f8108g[i12];
            if (gVar instanceof d) {
                d dVar = (d) gVar;
                dVar.setLabelVisibilityMode(this.f8104e);
                dVar.setItemIconGravity(this.f8106f);
                dVar.setItemGravity(this.Q);
                dVar.setShifting(zI);
            }
            if (this.V.b(i12) instanceof androidx.appcompat.view.menu.j) {
                this.f8108g[i12].initialize((androidx.appcompat.view.menu.j) this.V.b(i12), 0);
            }
            this.U.c(false);
        }
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.H = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorLabelPadding(i10);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.f8105e0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f8105e0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f8105e0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f8105e0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i10) {
        this.f8107f0 = i10;
    }

    public void setExpanded(boolean z10) {
        this.f8103d0 = z10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                gVar.setExpanded(z10);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i10) {
        this.f8120z = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setHorizontalTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) {
        this.f8119y = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setHorizontalTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.I = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setIconLabelHorizontalSpacing(i10);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f8113s = colorStateList;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.T = colorStateList;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorDrawable(e());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.J = z10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorEnabled(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.N = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorExpandedHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.P = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorExpandedMarginHorizontal(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.M = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorExpandedWidth(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.L = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.O = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorMarginHorizontal(i10);
                }
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z10) {
        this.S = z10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorResizeable(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(m9.l lVar) {
        this.R = lVar;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorDrawable(e());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.K = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setActiveIndicatorWidth(i10);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.B = drawable;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.D = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setItemBackground(i10);
                }
            }
        }
    }

    public void setItemGravity(int i10) {
        this.Q = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setItemGravity(i10);
                }
            }
        }
    }

    public void setItemIconGravity(int i10) {
        this.f8106f = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setItemIconGravity(i10);
                }
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f8114t = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setIconSize(i10);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.G = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setItemPaddingBottom(this.G);
                }
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.F = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setItemPaddingTop(i10);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.C = colorStateList;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f8118x = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.A = z10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setTextAppearanceActiveBoldEnabled(z10);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f8117w = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f8115u = colorStateList;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f8097a0 = z10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setLabelFontScalingEnabled(z10);
                }
            }
        }
    }

    public void setLabelMaxLines(int i10) {
        this.f8099b0 = i10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setLabelMaxLines(i10);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f8104e = i10;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z10) {
        this.W = z10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof d) {
                    ((d) gVar).setMeasureBottomPaddingFromLabelBaseline(z10);
                }
            }
        }
    }

    public void setPresenter(i iVar) {
        this.U = iVar;
    }

    public void setSubmenuDividersEnabled(boolean z10) {
        if (this.f8109g0 == z10) {
            return;
        }
        this.f8109g0 = z10;
        g[] gVarArr = this.f8108g;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                if (gVar instanceof b) {
                    ((b) gVar).setDividersEnabled(z10);
                }
            }
        }
    }
}
