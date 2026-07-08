package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import v.d;
import v.e;
import v.k;
import v.l;
import w.b;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static h H;
    int A;
    int B;
    private SparseArray C;
    c D;
    private int E;
    private int F;
    private ArrayList G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SparseArray f1413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f1414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected v.f f1415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f1419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f1420h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1421r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f1422s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected androidx.constraintlayout.widget.c f1423t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1424u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private HashMap f1425v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f1426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f1427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f1428y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f1429z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1430a;

        static {
            int[] iArr = new int[e.b.values().length];
            f1430a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1430a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1430a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1430a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements b.InterfaceC0410b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f1481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1486f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1487g;

        c(ConstraintLayout constraintLayout) {
            this.f1481a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @Override // w.b.InterfaceC0410b
        public final void a() {
            int childCount = this.f1481a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f1481a.getChildAt(i10);
            }
            int size = this.f1481a.f1414b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f1481a.f1414b.get(i11)).l(this.f1481a);
                }
            }
        }

        @Override // w.b.InterfaceC0410b
        public final void b(v.e eVar, b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i10;
            if (eVar == null) {
                return;
            }
            if (eVar.V() == 8 && !eVar.j0()) {
                aVar.f30890e = 0;
                aVar.f30891f = 0;
                aVar.f30892g = 0;
                return;
            }
            if (eVar.K() == null) {
                return;
            }
            ConstraintLayout.b(ConstraintLayout.this);
            e.b bVar = aVar.f30886a;
            e.b bVar2 = aVar.f30887b;
            int i11 = aVar.f30888c;
            int i12 = aVar.f30889d;
            int i13 = this.f1482b + this.f1483c;
            int i14 = this.f1484d;
            View view = (View) eVar.s();
            int[] iArr = a.f1430a;
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, WXVideoFileObject.FILE_SIZE_LIMIT);
            } else if (i15 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1486f, i14, -2);
            } else if (i15 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1486f, i14 + eVar.B(), -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1486f, i14, -2);
                boolean z10 = eVar.f29380w == 1;
                int i16 = aVar.f30895j;
                if (i16 == b.a.f30884l || i16 == b.a.f30885m) {
                    boolean z11 = view.getMeasuredHeight() == eVar.x();
                    if (aVar.f30895j == b.a.f30885m || !z10 || ((z10 && z11) || eVar.n0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.W(), WXVideoFileObject.FILE_SIZE_LIMIT);
                    }
                }
            }
            int i17 = iArr[bVar2.ordinal()];
            if (i17 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, WXVideoFileObject.FILE_SIZE_LIMIT);
            } else if (i17 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1487g, i13, -2);
            } else if (i17 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1487g, i13 + eVar.U(), -1);
            } else if (i17 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1487g, i13, -2);
                boolean z12 = eVar.f29382x == 1;
                int i18 = aVar.f30895j;
                if (i18 == b.a.f30884l || i18 == b.a.f30885m) {
                    boolean z13 = view.getMeasuredWidth() == eVar.W();
                    if (aVar.f30895j == b.a.f30885m || !z12 || ((z12 && z13) || eVar.o0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.x(), WXVideoFileObject.FILE_SIZE_LIMIT);
                    }
                }
            }
            v.f fVar = (v.f) eVar.K();
            if (fVar != null && k.b(ConstraintLayout.this.f1421r, 256) && view.getMeasuredWidth() == eVar.W() && view.getMeasuredWidth() < fVar.W() && view.getMeasuredHeight() == eVar.x() && view.getMeasuredHeight() < fVar.x() && view.getBaseline() == eVar.p() && !eVar.m0() && d(eVar.C(), iMakeMeasureSpec, eVar.W()) && d(eVar.D(), iMakeMeasureSpec2, eVar.x())) {
                aVar.f30890e = eVar.W();
                aVar.f30891f = eVar.x();
                aVar.f30892g = eVar.p();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z14 = bVar == bVar3;
            boolean z15 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z16 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z17 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z18 = z14 && eVar.f29343d0 > 0.0f;
            boolean z19 = z15 && eVar.f29343d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i19 = aVar.f30895j;
            if (i19 != b.a.f30884l && i19 != b.a.f30885m && z14 && eVar.f29380w == 0 && z15 && eVar.f29382x == 0) {
                i10 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof i) && (eVar instanceof l)) {
                    ((i) view).p((l) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.W0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = eVar.f29386z;
                iMax = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = eVar.A;
                if (i21 > 0) {
                    iMax = Math.min(i21, iMax);
                }
                int i22 = eVar.C;
                iMax2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                boolean z20 = z17;
                int i23 = eVar.D;
                if (i23 > 0) {
                    iMax2 = Math.min(i23, iMax2);
                }
                boolean z21 = z16;
                if (!k.b(ConstraintLayout.this.f1421r, 1)) {
                    if (z18 && z21) {
                        iMax = (int) ((iMax2 * eVar.f29343d0) + 0.5f);
                    } else if (z19 && z20) {
                        iMax2 = (int) ((iMax / eVar.f29343d0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, WXVideoFileObject.FILE_SIZE_LIMIT);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, WXVideoFileObject.FILE_SIZE_LIMIT);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    eVar.W0(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z22 = baseline != i10;
            aVar.f30894i = (iMax == aVar.f30888c && iMax2 == aVar.f30889d) ? false : true;
            if (bVar5.f1444g0) {
                z22 = true;
            }
            if (z22 && baseline != -1 && eVar.p() != baseline) {
                aVar.f30894i = true;
            }
            aVar.f30890e = iMax;
            aVar.f30891f = iMax2;
            aVar.f30893h = z22;
            aVar.f30892g = baseline;
            ConstraintLayout.b(ConstraintLayout.this);
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f1482b = i12;
            this.f1483c = i13;
            this.f1484d = i14;
            this.f1485e = i15;
            this.f1486f = i10;
            this.f1487g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1413a = new SparseArray();
        this.f1414b = new ArrayList(4);
        this.f1415c = new v.f();
        this.f1416d = 0;
        this.f1417e = 0;
        this.f1418f = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f1419g = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f1420h = true;
        this.f1421r = 257;
        this.f1422s = null;
        this.f1423t = null;
        this.f1424u = -1;
        this.f1425v = new HashMap();
        this.f1426w = -1;
        this.f1427x = -1;
        this.f1428y = -1;
        this.f1429z = -1;
        this.A = 0;
        this.B = 0;
        this.C = new SparseArray();
        this.D = new c(this);
        this.E = 0;
        this.F = 0;
        m(attributeSet, 0, 0);
    }

    static /* synthetic */ s.e b(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static h getSharedValues() {
        if (H == null) {
            H = new h();
        }
        return H;
    }

    private v.e j(int i10) {
        if (i10 == 0) {
            return this.f1415c;
        }
        View viewFindViewById = (View) this.f1413a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f1415c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f1474v0;
    }

    private void m(AttributeSet attributeSet, int i10, int i11) {
        this.f1415c.C0(this);
        this.f1415c.X1(this.D);
        this.f1413a.put(getId(), this);
        this.f1422s = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.V0, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == g.f1683f1) {
                    this.f1416d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1416d);
                } else if (index == g.f1691g1) {
                    this.f1417e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1417e);
                } else if (index == g.f1667d1) {
                    this.f1418f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1418f);
                } else if (index == g.f1675e1) {
                    this.f1419g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1419g);
                } else if (index == g.O2) {
                    this.f1421r = typedArrayObtainStyledAttributes.getInt(index, this.f1421r);
                } else if (index == g.J1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            p(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1423t = null;
                        }
                    }
                } else if (index == g.f1747n1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f1422s = dVar;
                        dVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1422s = null;
                    }
                    this.f1424u = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1415c.Y1(this.f1421r);
    }

    private void o() {
        this.f1420h = true;
        this.f1426w = -1;
        this.f1427x = -1;
        this.f1428y = -1;
        this.f1429z = -1;
        this.A = 0;
        this.B = 0;
    }

    private void s() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            v.e eVarL = l(getChildAt(i10));
            if (eVarL != null) {
                eVarL.t0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    t(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    j(childAt.getId()).D0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1424u != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
            }
        }
        d dVar = this.f1422s;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f1415c.v1();
        int size = this.f1414b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.constraintlayout.widget.b) this.f1414b.get(i13)).n(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14);
        }
        this.C.clear();
        this.C.put(0, this.f1415c);
        this.C.put(getId(), this.f1415c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            this.C.put(childAt2.getId(), l(childAt2));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt3 = getChildAt(i16);
            v.e eVarL2 = l(childAt3);
            if (eVarL2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f1415c.b(eVarL2);
                e(zIsInEditMode, childAt3, eVarL2, bVar, this.C);
            }
        }
    }

    private void v(v.e eVar, b bVar, SparseArray sparseArray, int i10, d.a aVar) {
        View view = (View) this.f1413a.get(i10);
        v.e eVar2 = (v.e) sparseArray.get(i10);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f1444g0 = true;
        d.a aVar2 = d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f1444g0 = true;
            bVar2.f1474v0.L0(true);
        }
        eVar.o(aVar2).b(eVar2.o(aVar), bVar.D, bVar.C, true);
        eVar.L0(true);
        eVar.o(d.a.TOP).q();
        eVar.o(d.a.BOTTOM).q();
    }

    private boolean w() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            s();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1414b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.constraintlayout.widget.b) this.f1414b.get(i10)).m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void e(boolean r15, android.view.View r16, v.e r17, androidx.constraintlayout.widget.ConstraintLayout.b r18, android.util.SparseArray r19) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.e(boolean, android.view.View, v.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    protected boolean f(int i10, int i11) {
        if (this.G == null) {
            return false;
        }
        View.MeasureSpec.getSize(i10);
        View.MeasureSpec.getSize(i11);
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            Iterator it2 = this.f1415c.s1().iterator();
            if (it2.hasNext()) {
                View view = (View) ((v.e) it2.next()).s();
                view.getId();
                throw null;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void forceLayout() {
        o();
        super.forceLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public int getMaxHeight() {
        return this.f1419g;
    }

    public int getMaxWidth() {
        return this.f1418f;
    }

    public int getMinHeight() {
        return this.f1417e;
    }

    public int getMinWidth() {
        return this.f1416d;
    }

    public int getOptimizationLevel() {
        return this.f1415c.L1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1415c.f29364o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f1415c.f29364o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f1415c.f29364o = "parent";
            }
        }
        if (this.f1415c.t() == null) {
            v.f fVar = this.f1415c;
            fVar.D0(fVar.f29364o);
            Log.v("ConstraintLayout", " setDebugName " + this.f1415c.t());
        }
        for (v.e eVar : this.f1415c.s1()) {
            View view = (View) eVar.s();
            if (view != null) {
                if (eVar.f29364o == null && (id2 = view.getId()) != -1) {
                    eVar.f29364o = getContext().getResources().getResourceEntryName(id2);
                }
                if (eVar.t() == null) {
                    eVar.D0(eVar.f29364o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar.t());
                }
            }
        }
        this.f1415c.O(sb2);
        return sb2.toString();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object i(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f1425v;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f1425v.get(str);
    }

    public View k(int i10) {
        return (View) this.f1413a.get(i10);
    }

    public final v.e l(View view) {
        if (view == this) {
            return this.f1415c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1474v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1474v0;
        }
        return null;
    }

    protected boolean n() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            v.e eVar = bVar.f1474v0;
            if ((childAt.getVisibility() != 8 || bVar.f1446h0 || bVar.f1448i0 || bVar.f1452k0 || zIsInEditMode) && !bVar.f1450j0) {
                int iX = eVar.X();
                int iY = eVar.Y();
                childAt.layout(iX, iY, eVar.W() + iX, eVar.x() + iY);
            }
        }
        int size = this.f1414b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.constraintlayout.widget.b) this.f1414b.get(i15)).k(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean zF = this.f1420h | f(i10, i11);
        this.f1420h = zF;
        if (!zF) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (getChildAt(i12).isLayoutRequested()) {
                    this.f1420h = true;
                    break;
                }
                i12++;
            }
        }
        this.E = i10;
        this.F = i11;
        this.f1415c.a2(n());
        if (this.f1420h) {
            this.f1420h = false;
            if (w()) {
                this.f1415c.c2();
            }
        }
        this.f1415c.J1(null);
        r(this.f1415c, this.f1421r, i10, i11);
        q(i10, i11, this.f1415c.W(), this.f1415c.x(), this.f1415c.S1(), this.f1415c.Q1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        v.e eVarL = l(view);
        if ((view instanceof Guideline) && !(eVarL instanceof v.h)) {
            b bVar = (b) view.getLayoutParams();
            v.h hVar = new v.h();
            bVar.f1474v0 = hVar;
            bVar.f1446h0 = true;
            hVar.B1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.o();
            ((b) view.getLayoutParams()).f1448i0 = true;
            if (!this.f1414b.contains(bVar2)) {
                this.f1414b.add(bVar2);
            }
        }
        this.f1413a.put(view.getId(), view);
        this.f1420h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1413a.remove(view.getId());
        this.f1415c.u1(l(view));
        this.f1414b.remove(view);
        this.f1420h = true;
    }

    protected void p(int i10) {
        this.f1423t = new androidx.constraintlayout.widget.c(getContext(), this, i10);
    }

    protected void q(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.D;
        int i14 = cVar.f1485e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f1484d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f1418f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f1419g, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f1426w = iMin;
        this.f1427x = iMin2;
    }

    protected void r(v.f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.D.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (n()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            u(fVar, mode, i15, mode2, i16);
            fVar.T1(i10, mode, i15, mode2, i16, this.f1426w, this.f1427x, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i152 = size - paddingWidth;
        int i162 = size2 - i14;
        u(fVar, mode, i152, mode2, i162);
        fVar.T1(i10, mode, i152, mode2, i162, this.f1426w, this.f1427x, i13, iMax);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        o();
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.f1422s = dVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f1413a.remove(getId());
        super.setId(i10);
        this.f1413a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f1419g) {
            return;
        }
        this.f1419g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f1418f) {
            return;
        }
        this.f1418f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f1417e) {
            return;
        }
        this.f1417e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f1416d) {
            return;
        }
        this.f1416d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(e eVar) {
        androidx.constraintlayout.widget.c cVar = this.f1423t;
        if (cVar != null) {
            cVar.c(eVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f1421r = i10;
        this.f1415c.Y1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1425v == null) {
                this.f1425v = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f1425v.put(strSubstring, (Integer) obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 v.e$b) = (r2v3 v.e$b), (r2v0 v.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void u(v.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.D
            int r1 = r0.f1485e
            int r0 = r0.f1484d
            v.e$b r2 = v.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r6) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L38
        L1a:
            int r9 = r7.f1418f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            v.e$b r9 = v.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f1416d
            int r10 = java.lang.Math.max(r5, r10)
            goto L38
        L2e:
            v.e$b r9 = v.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f1416d
            int r10 = java.lang.Math.max(r5, r10)
        L38:
            if (r11 == r6) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = 0
            goto L5d
        L40:
            int r11 = r7.f1419g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            v.e$b r2 = v.e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f1417e
            int r12 = java.lang.Math.max(r5, r11)
            goto L5d
        L53:
            v.e$b r2 = v.e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f1417e
            int r12 = java.lang.Math.max(r5, r11)
        L5d:
            int r11 = r8.W()
            if (r10 != r11) goto L69
            int r11 = r8.x()
            if (r12 == r11) goto L6c
        L69:
            r8.P1()
        L6c:
            r8.n1(r5)
            r8.o1(r5)
            int r11 = r7.f1418f
            int r11 = r11 - r0
            r8.Y0(r11)
            int r11 = r7.f1419g
            int r11 = r11 - r1
            r8.X0(r11)
            r8.b1(r5)
            r8.a1(r5)
            r8.Q0(r9)
            r8.l1(r10)
            r8.h1(r2)
            r8.M0(r12)
            int r9 = r7.f1416d
            int r9 = r9 - r0
            r8.b1(r9)
            int r9 = r7.f1417e
            int r9 = r9 - r1
            r8.a1(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.u(v.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1413a = new SparseArray();
        this.f1414b = new ArrayList(4);
        this.f1415c = new v.f();
        this.f1416d = 0;
        this.f1417e = 0;
        this.f1418f = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f1419g = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f1420h = true;
        this.f1421r = 257;
        this.f1422s = null;
        this.f1423t = null;
        this.f1424u = -1;
        this.f1425v = new HashMap();
        this.f1426w = -1;
        this.f1427x = -1;
        this.f1428y = -1;
        this.f1429z = -1;
        this.A = 0;
        this.B = 0;
        this.C = new SparseArray();
        this.D = new c(this);
        this.E = 0;
        this.F = 0;
        m(attributeSet, i10, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1431a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f1432a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1433b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f1434b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1435c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public String f1436c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1437d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f1438d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1439e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        boolean f1440e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1441f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        boolean f1442f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1443g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        boolean f1444g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1445h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        boolean f1446h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1447i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        boolean f1448i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1449j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        boolean f1450j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f1451k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        boolean f1452k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1453l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f1454l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f1455m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        int f1456m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f1457n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        int f1458n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f1459o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        int f1460o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f1461p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        int f1462p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1463q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        int f1464q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f1465r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        float f1466r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1467s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        int f1468s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f1469t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        int f1470t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f1471u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        float f1472u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f1473v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        v.e f1474v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1475w;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public boolean f1476w0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f1477x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f1478y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f1479z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1480a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1480a = sparseIntArray;
                sparseIntArray.append(g.f1844z2, 64);
                sparseIntArray.append(g.f1660c2, 65);
                sparseIntArray.append(g.f1732l2, 8);
                sparseIntArray.append(g.f1740m2, 9);
                sparseIntArray.append(g.f1756o2, 10);
                sparseIntArray.append(g.f1764p2, 11);
                sparseIntArray.append(g.f1812v2, 12);
                sparseIntArray.append(g.f1804u2, 13);
                sparseIntArray.append(g.S1, 14);
                sparseIntArray.append(g.R1, 15);
                sparseIntArray.append(g.N1, 16);
                sparseIntArray.append(g.P1, 52);
                sparseIntArray.append(g.O1, 53);
                sparseIntArray.append(g.T1, 2);
                sparseIntArray.append(g.V1, 3);
                sparseIntArray.append(g.U1, 4);
                sparseIntArray.append(g.E2, 49);
                sparseIntArray.append(g.F2, 50);
                sparseIntArray.append(g.Z1, 5);
                sparseIntArray.append(g.f1642a2, 6);
                sparseIntArray.append(g.f1651b2, 7);
                sparseIntArray.append(g.I1, 67);
                sparseIntArray.append(g.W0, 1);
                sparseIntArray.append(g.f1772q2, 17);
                sparseIntArray.append(g.f1780r2, 18);
                sparseIntArray.append(g.Y1, 19);
                sparseIntArray.append(g.X1, 20);
                sparseIntArray.append(g.J2, 21);
                sparseIntArray.append(g.M2, 22);
                sparseIntArray.append(g.K2, 23);
                sparseIntArray.append(g.H2, 24);
                sparseIntArray.append(g.L2, 25);
                sparseIntArray.append(g.I2, 26);
                sparseIntArray.append(g.G2, 55);
                sparseIntArray.append(g.N2, 54);
                sparseIntArray.append(g.f1700h2, 29);
                sparseIntArray.append(g.f1820w2, 30);
                sparseIntArray.append(g.W1, 44);
                sparseIntArray.append(g.f1716j2, 45);
                sparseIntArray.append(g.f1836y2, 46);
                sparseIntArray.append(g.f1708i2, 47);
                sparseIntArray.append(g.f1828x2, 48);
                sparseIntArray.append(g.L1, 27);
                sparseIntArray.append(g.K1, 28);
                sparseIntArray.append(g.A2, 31);
                sparseIntArray.append(g.f1668d2, 32);
                sparseIntArray.append(g.C2, 33);
                sparseIntArray.append(g.B2, 34);
                sparseIntArray.append(g.D2, 35);
                sparseIntArray.append(g.f1684f2, 36);
                sparseIntArray.append(g.f1676e2, 37);
                sparseIntArray.append(g.f1692g2, 38);
                sparseIntArray.append(g.f1724k2, 39);
                sparseIntArray.append(g.f1796t2, 40);
                sparseIntArray.append(g.f1748n2, 41);
                sparseIntArray.append(g.Q1, 42);
                sparseIntArray.append(g.M1, 43);
                sparseIntArray.append(g.f1788s2, 51);
                sparseIntArray.append(g.P2, 66);
            }
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1431a = -1;
            this.f1433b = -1;
            this.f1435c = -1.0f;
            this.f1437d = true;
            this.f1439e = -1;
            this.f1441f = -1;
            this.f1443g = -1;
            this.f1445h = -1;
            this.f1447i = -1;
            this.f1449j = -1;
            this.f1451k = -1;
            this.f1453l = -1;
            this.f1455m = -1;
            this.f1457n = -1;
            this.f1459o = -1;
            this.f1461p = -1;
            this.f1463q = 0;
            this.f1465r = 0.0f;
            this.f1467s = -1;
            this.f1469t = -1;
            this.f1471u = -1;
            this.f1473v = -1;
            this.f1475w = RtlSpacingHelper.UNDEFINED;
            this.f1477x = RtlSpacingHelper.UNDEFINED;
            this.f1478y = RtlSpacingHelper.UNDEFINED;
            this.f1479z = RtlSpacingHelper.UNDEFINED;
            this.A = RtlSpacingHelper.UNDEFINED;
            this.B = RtlSpacingHelper.UNDEFINED;
            this.C = RtlSpacingHelper.UNDEFINED;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1432a0 = false;
            this.f1434b0 = false;
            this.f1436c0 = null;
            this.f1438d0 = 0;
            this.f1440e0 = true;
            this.f1442f0 = true;
            this.f1444g0 = false;
            this.f1446h0 = false;
            this.f1448i0 = false;
            this.f1450j0 = false;
            this.f1452k0 = false;
            this.f1454l0 = -1;
            this.f1456m0 = -1;
            this.f1458n0 = -1;
            this.f1460o0 = -1;
            this.f1462p0 = RtlSpacingHelper.UNDEFINED;
            this.f1464q0 = RtlSpacingHelper.UNDEFINED;
            this.f1466r0 = 0.5f;
            this.f1474v0 = new v.e();
            this.f1476w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f1431a = bVar.f1431a;
                this.f1433b = bVar.f1433b;
                this.f1435c = bVar.f1435c;
                this.f1437d = bVar.f1437d;
                this.f1439e = bVar.f1439e;
                this.f1441f = bVar.f1441f;
                this.f1443g = bVar.f1443g;
                this.f1445h = bVar.f1445h;
                this.f1447i = bVar.f1447i;
                this.f1449j = bVar.f1449j;
                this.f1451k = bVar.f1451k;
                this.f1453l = bVar.f1453l;
                this.f1455m = bVar.f1455m;
                this.f1457n = bVar.f1457n;
                this.f1459o = bVar.f1459o;
                this.f1461p = bVar.f1461p;
                this.f1463q = bVar.f1463q;
                this.f1465r = bVar.f1465r;
                this.f1467s = bVar.f1467s;
                this.f1469t = bVar.f1469t;
                this.f1471u = bVar.f1471u;
                this.f1473v = bVar.f1473v;
                this.f1475w = bVar.f1475w;
                this.f1477x = bVar.f1477x;
                this.f1478y = bVar.f1478y;
                this.f1479z = bVar.f1479z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.O = bVar.O;
                this.f1432a0 = bVar.f1432a0;
                this.f1434b0 = bVar.f1434b0;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.T = bVar.T;
                this.S = bVar.S;
                this.U = bVar.U;
                this.V = bVar.V;
                this.W = bVar.W;
                this.X = bVar.X;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.f1440e0 = bVar.f1440e0;
                this.f1442f0 = bVar.f1442f0;
                this.f1444g0 = bVar.f1444g0;
                this.f1446h0 = bVar.f1446h0;
                this.f1454l0 = bVar.f1454l0;
                this.f1456m0 = bVar.f1456m0;
                this.f1458n0 = bVar.f1458n0;
                this.f1460o0 = bVar.f1460o0;
                this.f1462p0 = bVar.f1462p0;
                this.f1464q0 = bVar.f1464q0;
                this.f1466r0 = bVar.f1466r0;
                this.f1436c0 = bVar.f1436c0;
                this.f1438d0 = bVar.f1438d0;
                this.f1474v0 = bVar.f1474v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public void a() {
            this.f1446h0 = false;
            this.f1440e0 = true;
            this.f1442f0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f1432a0) {
                this.f1440e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f1434b0) {
                this.f1442f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f1440e0 = false;
                if (i10 == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1432a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f1442f0 = false;
                if (i11 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1434b0 = true;
                }
            }
            if (this.f1435c == -1.0f && this.f1431a == -1 && this.f1433b == -1) {
                return;
            }
            this.f1446h0 = true;
            this.f1440e0 = true;
            this.f1442f0 = true;
            if (!(this.f1474v0 instanceof v.h)) {
                this.f1474v0 = new v.h();
            }
            ((v.h) this.f1474v0).B1(this.Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1431a = -1;
            this.f1433b = -1;
            this.f1435c = -1.0f;
            this.f1437d = true;
            this.f1439e = -1;
            this.f1441f = -1;
            this.f1443g = -1;
            this.f1445h = -1;
            this.f1447i = -1;
            this.f1449j = -1;
            this.f1451k = -1;
            this.f1453l = -1;
            this.f1455m = -1;
            this.f1457n = -1;
            this.f1459o = -1;
            this.f1461p = -1;
            this.f1463q = 0;
            this.f1465r = 0.0f;
            this.f1467s = -1;
            this.f1469t = -1;
            this.f1471u = -1;
            this.f1473v = -1;
            this.f1475w = RtlSpacingHelper.UNDEFINED;
            this.f1477x = RtlSpacingHelper.UNDEFINED;
            this.f1478y = RtlSpacingHelper.UNDEFINED;
            this.f1479z = RtlSpacingHelper.UNDEFINED;
            this.A = RtlSpacingHelper.UNDEFINED;
            this.B = RtlSpacingHelper.UNDEFINED;
            this.C = RtlSpacingHelper.UNDEFINED;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1432a0 = false;
            this.f1434b0 = false;
            this.f1436c0 = null;
            this.f1438d0 = 0;
            this.f1440e0 = true;
            this.f1442f0 = true;
            this.f1444g0 = false;
            this.f1446h0 = false;
            this.f1448i0 = false;
            this.f1450j0 = false;
            this.f1452k0 = false;
            this.f1454l0 = -1;
            this.f1456m0 = -1;
            this.f1458n0 = -1;
            this.f1460o0 = -1;
            this.f1462p0 = RtlSpacingHelper.UNDEFINED;
            this.f1464q0 = RtlSpacingHelper.UNDEFINED;
            this.f1466r0 = 0.5f;
            this.f1474v0 = new v.e();
            this.f1476w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f1480a.get(index);
                switch (i11) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f1461p);
                        this.f1461p = resourceId;
                        if (resourceId == -1) {
                            this.f1461p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f1463q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1463q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f1465r) % 360.0f;
                        this.f1465r = f10;
                        if (f10 < 0.0f) {
                            this.f1465r = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f1431a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1431a);
                        break;
                    case 6:
                        this.f1433b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1433b);
                        break;
                    case 7:
                        this.f1435c = typedArrayObtainStyledAttributes.getFloat(index, this.f1435c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1439e);
                        this.f1439e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1439e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1441f);
                        this.f1441f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1441f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1443g);
                        this.f1443g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1443g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1445h);
                        this.f1445h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1445h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1447i);
                        this.f1447i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1447i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1449j);
                        this.f1449j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1449j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1451k);
                        this.f1451k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1451k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1453l);
                        this.f1453l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1453l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1455m);
                        this.f1455m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1455m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1467s);
                        this.f1467s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1467s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1469t);
                        this.f1469t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1469t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1471u);
                        this.f1471u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1471u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1473v);
                        this.f1473v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1473v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f1475w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1475w);
                        break;
                    case 22:
                        this.f1477x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1477x);
                        break;
                    case 23:
                        this.f1478y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1478y);
                        break;
                    case 24:
                        this.f1479z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1479z);
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.f1432a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1432a0);
                        break;
                    case 28:
                        this.f1434b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1434b0);
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Q = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                d.p(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.f1436c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1457n);
                                this.f1457n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1457n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1459o);
                                this.f1459o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1459o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        d.n(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        d.n(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.f1438d0 = typedArrayObtainStyledAttributes.getInt(index, this.f1438d0);
                                        break;
                                    case 67:
                                        this.f1437d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1437d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f1431a = -1;
            this.f1433b = -1;
            this.f1435c = -1.0f;
            this.f1437d = true;
            this.f1439e = -1;
            this.f1441f = -1;
            this.f1443g = -1;
            this.f1445h = -1;
            this.f1447i = -1;
            this.f1449j = -1;
            this.f1451k = -1;
            this.f1453l = -1;
            this.f1455m = -1;
            this.f1457n = -1;
            this.f1459o = -1;
            this.f1461p = -1;
            this.f1463q = 0;
            this.f1465r = 0.0f;
            this.f1467s = -1;
            this.f1469t = -1;
            this.f1471u = -1;
            this.f1473v = -1;
            this.f1475w = RtlSpacingHelper.UNDEFINED;
            this.f1477x = RtlSpacingHelper.UNDEFINED;
            this.f1478y = RtlSpacingHelper.UNDEFINED;
            this.f1479z = RtlSpacingHelper.UNDEFINED;
            this.A = RtlSpacingHelper.UNDEFINED;
            this.B = RtlSpacingHelper.UNDEFINED;
            this.C = RtlSpacingHelper.UNDEFINED;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.f1432a0 = false;
            this.f1434b0 = false;
            this.f1436c0 = null;
            this.f1438d0 = 0;
            this.f1440e0 = true;
            this.f1442f0 = true;
            this.f1444g0 = false;
            this.f1446h0 = false;
            this.f1448i0 = false;
            this.f1450j0 = false;
            this.f1452k0 = false;
            this.f1454l0 = -1;
            this.f1456m0 = -1;
            this.f1458n0 = -1;
            this.f1460o0 = -1;
            this.f1462p0 = RtlSpacingHelper.UNDEFINED;
            this.f1464q0 = RtlSpacingHelper.UNDEFINED;
            this.f1466r0 = 0.5f;
            this.f1474v0 = new v.e();
            this.f1476w0 = false;
        }
    }
}
