package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: a */
    protected int[] f1507a;

    /* JADX INFO: renamed from: b */
    protected int f1508b;

    /* JADX INFO: renamed from: c */
    protected Context f1509c;

    /* JADX INFO: renamed from: d */
    protected v.i f1510d;

    /* JADX INFO: renamed from: e */
    protected boolean f1511e;

    /* JADX INFO: renamed from: f */
    protected String f1512f;

    /* JADX INFO: renamed from: g */
    protected String f1513g;

    /* JADX INFO: renamed from: h */
    private View[] f1514h;

    /* JADX INFO: renamed from: r */
    protected HashMap f1515r;

    public b(Context context) {
        super(context);
        this.f1507a = new int[32];
        this.f1511e = false;
        this.f1514h = null;
        this.f1515r = new HashMap();
        this.f1509c = context;
        i(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f1509c == null) {
            return;
        }
        String strTrim = str.trim();
        int iH = h(strTrim);
        if (iH != 0) {
            this.f1515r.put(Integer.valueOf(iH), strTrim);
            b(iH);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f1508b + 1;
        int[] iArr = this.f1507a;
        if (i11 > iArr.length) {
            this.f1507a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1507a;
        int i12 = this.f1508b;
        iArr2[i12] = i10;
        this.f1508b = i12 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f1509c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f1436c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f1509c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iG = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objI = constraintLayout.i(0, str);
            if (objI instanceof Integer) {
                iG = ((Integer) objI).intValue();
            }
        }
        if (iG == 0 && constraintLayout != null) {
            iG = g(constraintLayout, str);
        }
        if (iG == 0) {
            try {
                iG = f.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iG == 0 ? this.f1509c.getResources().getIdentifier(str, Name.MARK, this.f1509c.getPackageName()) : iG;
    }

    protected void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f1508b; i10++) {
            View viewK = constraintLayout.k(this.f1507a[i10]);
            if (viewK != null) {
                viewK.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewK.setTranslationZ(viewK.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void f(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1507a, this.f1508b);
    }

    protected void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.f1755o1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1512f = string;
                    setIds(string);
                } else if (index == g.f1763p1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f1513g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
    }

    public void n(ConstraintLayout constraintLayout) {
        String str;
        int iG;
        if (isInEditMode()) {
            setIds(this.f1512f);
        }
        v.i iVar = this.f1510d;
        if (iVar == null) {
            return;
        }
        iVar.a();
        for (int i10 = 0; i10 < this.f1508b; i10++) {
            int i11 = this.f1507a[i10];
            View viewK = constraintLayout.k(i11);
            if (viewK == null && (iG = g(constraintLayout, (str = (String) this.f1515r.get(Integer.valueOf(i11))))) != 0) {
                this.f1507a[i10] = iG;
                this.f1515r.put(Integer.valueOf(iG), str);
                viewK = constraintLayout.k(iG);
            }
            if (viewK != null) {
                this.f1510d.b(constraintLayout.l(viewK));
            }
        }
        this.f1510d.c(constraintLayout.f1415c);
    }

    public void o() {
        if (this.f1510d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f1474v0 = (v.e) this.f1510d;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1512f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1513g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f1511e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f1512f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1508b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f1513g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f1508b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1512f = null;
        this.f1508b = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f1512f == null) {
            b(i10);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1507a = new int[32];
        this.f1511e = false;
        this.f1514h = null;
        this.f1515r = new HashMap();
        this.f1509c = context;
        i(attributeSet);
    }

    public void j(v.e eVar, boolean z10) {
    }
}
