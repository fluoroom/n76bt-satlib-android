package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.internal.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import m0.o0;
import m9.p;
import n0.x;
import u8.k;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends d {
    private static final int A = k.f28746v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final LinkedHashSet f7554u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f7555v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f7556w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f7557x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f7558y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Set f7559z;

    class a extends m0.a {
        a() {
        }

        @Override // m0.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.w0(x.g.a(0, 1, MaterialButtonToggleGroup.this.u(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public interface b {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u8.b.f28561q);
    }

    private String getChildrenA11yClassName() {
        return (this.f7556w ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private boolean j(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void r(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f7559z);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f7556w && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f7557x || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        y(hashSet);
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    private void t(int i10, boolean z10) {
        Iterator it = this.f7554u.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return -1;
    }

    private void x(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f7555v = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f7555v = false;
        }
    }

    private void y(Set set) {
        Set set2 = this.f7559z;
        this.f7559z = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = f(i10).getId();
            x(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                t(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void z() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).setA11yClassName(childrenA11yClassName);
        }
    }

    @Override // com.google.android.material.button.d, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        r(materialButton.getId(), materialButton.isChecked());
        o0.n0(materialButton, new a());
    }

    public int getCheckedButtonId() {
        if (!this.f7556w || this.f7559z.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f7559z.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = f(i10).getId();
            if (this.f7559z.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f7558y;
        if (i10 != -1) {
            y(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x.Y0(accessibilityNodeInfo).v0(x.f.a(1, getVisibleButtonCount(), false, v() ? 1 : 2));
    }

    public void q(b bVar) {
        this.f7554u.add(bVar);
    }

    public void s() {
        y(new HashSet());
    }

    public void setSelectionRequired(boolean z10) {
        this.f7557x = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f7556w != z10) {
            this.f7556w = z10;
            s();
        }
        z();
    }

    public boolean v() {
        return this.f7556w;
    }

    void w(MaterialButton materialButton, boolean z10) {
        if (this.f7555v) {
            return;
        }
        r(materialButton.getId(), z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i10) {
        int i11 = A;
        super(q9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7554u = new LinkedHashSet();
        this.f7555v = false;
        this.f7559z = new HashSet();
        TypedArray typedArrayI = m.i(getContext(), attributeSet, l.U2, i10, i11, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(l.Y2, false));
        this.f7558y = typedArrayI.getResourceId(l.W2, -1);
        this.f7557x = typedArrayI.getBoolean(l.X2, false);
        if (this.f7570f == null) {
            this.f7570f = p.c(new m9.a(0.0f));
        }
        setEnabled(typedArrayI.getBoolean(l.V2, true));
        typedArrayI.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
