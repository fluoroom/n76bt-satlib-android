package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class j extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f3213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f3214e;

    class a extends g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.a0
        protected void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            j jVar = j.this;
            int[] iArrC = jVar.c(jVar.f3221a.getLayoutManager(), view);
            int i10 = iArrC[0];
            int i11 = iArrC[1];
            int iW = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iW > 0) {
                aVar.d(i10, i11, iW, this.f3202j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        protected int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int k(View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    private View l(RecyclerView.q qVar, i iVar) {
        int iO = qVar.O();
        View view = null;
        if (iO == 0) {
            return null;
        }
        int iM = iVar.m() + (iVar.n() / 2);
        int i10 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (int i11 = 0; i11 < iO; i11++) {
            View viewN = qVar.N(i11);
            int iAbs = Math.abs((iVar.g(viewN) + (iVar.e(viewN) / 2)) - iM);
            if (iAbs < i10) {
                view = viewN;
                i10 = iAbs;
            }
        }
        return view;
    }

    private i m(RecyclerView.q qVar) {
        i iVar = this.f3214e;
        if (iVar == null || iVar.f3210a != qVar) {
            this.f3214e = i.a(qVar);
        }
        return this.f3214e;
    }

    private i n(RecyclerView.q qVar) {
        if (qVar.q()) {
            return o(qVar);
        }
        if (qVar.p()) {
            return m(qVar);
        }
        return null;
    }

    private i o(RecyclerView.q qVar) {
        i iVar = this.f3213d;
        if (iVar == null || iVar.f3210a != qVar) {
            this.f3213d = i.c(qVar);
        }
        return this.f3213d;
    }

    private boolean p(RecyclerView.q qVar, int i10, int i11) {
        return qVar.p() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(RecyclerView.q qVar) {
        PointF pointFC;
        int iE = qVar.e();
        if (!(qVar instanceof RecyclerView.a0.b) || (pointFC = ((RecyclerView.a0.b) qVar).c(iE - 1)) == null) {
            return false;
        }
        return pointFC.x < 0.0f || pointFC.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(RecyclerView.q qVar, View view) {
        int[] iArr = new int[2];
        if (qVar.p()) {
            iArr[0] = k(view, m(qVar));
        } else {
            iArr[0] = 0;
        }
        if (qVar.q()) {
            iArr[1] = k(view, o(qVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    protected RecyclerView.a0 d(RecyclerView.q qVar) {
        if (qVar instanceof RecyclerView.a0.b) {
            return new a(this.f3221a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View f(RecyclerView.q qVar) {
        if (qVar.q()) {
            return l(qVar, o(qVar));
        }
        if (qVar.p()) {
            return l(qVar, m(qVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public int g(RecyclerView.q qVar, int i10, int i11) {
        i iVarN;
        int iE = qVar.e();
        if (iE == 0 || (iVarN = n(qVar)) == null) {
            return -1;
        }
        int iO = qVar.O();
        View view = null;
        View view2 = null;
        int i12 = RtlSpacingHelper.UNDEFINED;
        int i13 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (int i14 = 0; i14 < iO; i14++) {
            View viewN = qVar.N(i14);
            if (viewN != null) {
                int iK = k(viewN, iVarN);
                if (iK <= 0 && iK > i12) {
                    view2 = viewN;
                    i12 = iK;
                }
                if (iK >= 0 && iK < i13) {
                    view = viewN;
                    i13 = iK;
                }
            }
        }
        boolean zP = p(qVar, i10, i11);
        if (zP && view != null) {
            return qVar.l0(view);
        }
        if (!zP && view2 != null) {
            return qVar.l0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iL0 = qVar.l0(view) + (q(qVar) == zP ? -1 : 1);
        if (iL0 < 0 || iL0 >= iE) {
            return -1;
        }
        return iL0;
    }
}
