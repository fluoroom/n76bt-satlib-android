package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.i;
import v.e;
import v.g;
import v.l;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private g f1409u;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.i, androidx.constraintlayout.widget.b
    protected void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f1409u = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.g.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.g.W0) {
                    this.f1409u.E2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.X0) {
                    this.f1409u.J1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f1699h1) {
                    this.f1409u.O1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f1707i1) {
                    this.f1409u.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.Y0) {
                    this.f1409u.M1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.Z0) {
                    this.f1409u.P1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f1641a1) {
                    this.f1409u.N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f1650b1) {
                    this.f1409u.K1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.H1) {
                    this.f1409u.J2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f1827x1) {
                    this.f1409u.y2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.G1) {
                    this.f1409u.I2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f1779r1) {
                    this.f1409u.s2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f1843z1) {
                    this.f1409u.A2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f1795t1) {
                    this.f1409u.u2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.B1) {
                    this.f1409u.C2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.f1811v1) {
                    this.f1409u.w2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.f1771q1) {
                    this.f1409u.r2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.f1835y1) {
                    this.f1409u.z2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.f1787s1) {
                    this.f1409u.t2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.A1) {
                    this.f1409u.B2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.E1) {
                    this.f1409u.G2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.g.f1803u1) {
                    this.f1409u.v2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == androidx.constraintlayout.widget.g.D1) {
                    this.f1409u.F2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == androidx.constraintlayout.widget.g.f1819w1) {
                    this.f1409u.x2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.F1) {
                    this.f1409u.H2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.g.C1) {
                    this.f1409u.D2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1510d = this.f1409u;
        o();
    }

    @Override // androidx.constraintlayout.widget.b
    public void j(e eVar, boolean z10) {
        this.f1409u.u1(z10);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    protected void onMeasure(int i10, int i11) {
        p(this.f1409u, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.i
    public void p(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.D1(mode, size, mode2, size2);
            setMeasuredDimension(lVar.y1(), lVar.x1());
        }
    }

    public void setFirstHorizontalBias(float f10) {
        this.f1409u.r2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f1409u.s2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f1409u.t2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f1409u.u2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f1409u.v2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f1409u.w2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f1409u.x2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f1409u.y2(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f1409u.z2(f10);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f1409u.A2(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f1409u.B2(f10);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f1409u.C2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f1409u.D2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f1409u.E2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f1409u.J1(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f1409u.K1(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f1409u.M1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f1409u.N1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f1409u.P1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f1409u.F2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f1409u.G2(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f1409u.H2(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f1409u.I2(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f1409u.J2(i10);
        requestLayout();
    }
}
