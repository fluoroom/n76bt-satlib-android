package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1410s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1411t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private v.a f1412u;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void p(v.e eVar, int i10, boolean z10) {
        this.f1411t = i10;
        if (z10) {
            int i11 = this.f1410s;
            if (i11 == 5) {
                this.f1411t = 1;
            } else if (i11 == 6) {
                this.f1411t = 0;
            }
        } else {
            int i12 = this.f1410s;
            if (i12 == 5) {
                this.f1411t = 0;
            } else if (i12 == 6) {
                this.f1411t = 1;
            }
        }
        if (eVar instanceof v.a) {
            ((v.a) eVar).B1(this.f1411t);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f1412u.v1();
    }

    public int getMargin() {
        return this.f1412u.x1();
    }

    public int getType() {
        return this.f1410s;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f1412u = new v.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.f1731l1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == g.f1723k1) {
                    this.f1412u.A1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == g.f1739m1) {
                    this.f1412u.C1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1510d = this.f1412u;
        o();
    }

    @Override // androidx.constraintlayout.widget.b
    public void j(v.e eVar, boolean z10) {
        p(eVar, this.f1410s, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1412u.A1(z10);
    }

    public void setDpMargin(int i10) {
        this.f1412u.C1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f1412u.C1(i10);
    }

    public void setType(int i10) {
        this.f1410s = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
