package k5;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.dw.ht.fragments.DeviceFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import k5.e0;
import kotlin.Metadata;
import m4.x0;
import m4.y0;
import w4.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0003345B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0003J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0003R\u001a\u0010\u001c\u001a\u00060\u0019R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010'\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00066"}, d2 = {"Lk5/e0;", "Lcom/dw/ht/fragments/DeviceFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "Lv4/n0;", "iLink", "Lg3/d;", "packet", "M", "(Lv4/n0;Lg3/d;)V", "q5", "t5", "Lk5/e0$b;", "P0", "Lk5/e0$b;", "adapter", "Lm4/x0;", "Q0", "Lm4/x0;", "binding", "", "value", "R0", "[I", "r5", "([I)V", "actions", "", "", "S0", "[Ljava/lang/String;", "actionNames", "T0", "Landroid/view/LayoutInflater;", "getInflater", "()Landroid/view/LayoutInflater;", "s5", "(Landroid/view/LayoutInflater;)V", "c", "b", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 extends DeviceFragment {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private b adapter;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private x0 binding;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private int[] actions;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private String[] actionNames;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    public LayoutInflater inflater;

    public static final class a extends RecyclerView.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C0253a f19399e = new C0253a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int[] f19400f = {R.attr.listDivider};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f19401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Drawable f19402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f19403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f19404d;

        /* JADX INFO: renamed from: k5.e0$a$a, reason: collision with other inner class name */
        public static final class C0253a {
            public /* synthetic */ C0253a(rd.h hVar) {
                this();
            }

            private C0253a() {
            }
        }

        public a(Context context, int i10) {
            rd.m.e(context, "context");
            this.f19404d = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f19400f);
            rd.m.d(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            this.f19402b = drawable;
            if (drawable == null) {
                Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
            }
            typedArrayObtainStyledAttributes.recycle();
            l(i10);
        }

        private final void j(Canvas canvas, RecyclerView recyclerView) {
            int height;
            int paddingTop;
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingTop = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                paddingTop = 0;
            }
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                RecyclerView.q layoutManager = recyclerView.getLayoutManager();
                rd.m.b(layoutManager);
                layoutManager.U(childAt, this.f19404d);
                int iB = this.f19404d.right + td.a.b(childAt.getTranslationX());
                Drawable drawable = this.f19402b;
                rd.m.b(drawable);
                int intrinsicWidth = iB - drawable.getIntrinsicWidth();
                Drawable drawable2 = this.f19402b;
                rd.m.b(drawable2);
                drawable2.setBounds(intrinsicWidth, paddingTop, iB, height);
                Drawable drawable3 = this.f19402b;
                rd.m.b(drawable3);
                drawable3.draw(canvas);
            }
            canvas.restore();
        }

        private final void k(Canvas canvas, RecyclerView recyclerView) {
            int paddingLeft;
            int width;
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft() + this.f19401a;
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                paddingLeft = this.f19401a;
                width = recyclerView.getWidth();
            }
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                recyclerView.q0(childAt, this.f19404d);
                int iB = this.f19404d.bottom + td.a.b(childAt.getTranslationY());
                Drawable drawable = this.f19402b;
                rd.m.b(drawable);
                int intrinsicHeight = iB - drawable.getIntrinsicHeight();
                Drawable drawable2 = this.f19402b;
                rd.m.b(drawable2);
                drawable2.setBounds(paddingLeft, intrinsicHeight, width, iB);
                Drawable drawable3 = this.f19402b;
                rd.m.b(drawable3);
                drawable3.draw(canvas);
            }
            canvas.restore();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            rd.m.e(rect, "outRect");
            rd.m.e(view, "view");
            rd.m.e(recyclerView, "parent");
            rd.m.e(b0Var, "state");
            Drawable drawable = this.f19402b;
            if (drawable == null) {
                rect.set(0, 0, 0, 0);
            } else if (this.f19403c == 1) {
                rd.m.b(drawable);
                rect.set(0, 0, 0, drawable.getIntrinsicHeight());
            } else {
                rd.m.b(drawable);
                rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            rd.m.e(canvas, "c");
            rd.m.e(recyclerView, "parent");
            rd.m.e(b0Var, "state");
            if (recyclerView.getLayoutManager() == null || this.f19402b == null) {
                return;
            }
            if (this.f19403c == 1) {
                k(canvas, recyclerView);
            } else {
                j(canvas, recyclerView);
            }
        }

        public final void l(int i10) {
            if (i10 != 0 && i10 != 1) {
                throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
            }
            this.f19403c = i10;
        }

        public final void m(int i10) {
            this.f19401a = i10;
        }
    }

    public final class b extends RecyclerView.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private w4.c[] f19405d = new w4.c[0];

        public b() {
        }

        public final w4.c[] D() {
            return this.f19405d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void s(c cVar, int i10) {
            rd.m.e(cVar, "holder");
            w4.c cVar2 = this.f19405d[i10];
            boolean z10 = true;
            if (i10 > 0 && cVar2.d() == this.f19405d[i10 - 1].d()) {
                z10 = false;
            }
            cVar.P(cVar2, z10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public c u(ViewGroup viewGroup, int i10) {
            rd.m.e(viewGroup, "parent");
            y0 y0VarC = y0.c(e0.this.v1(), viewGroup, false);
            rd.m.d(y0VarC, "inflate(...)");
            return new c(e0.this, y0VarC);
        }

        public final void G(w4.c[] cVarArr) {
            rd.m.e(cVarArr, "value");
            this.f19405d = cVarArr;
            k();
            H();
        }

        public final void H() {
            HashSet hashSet = new HashSet();
            for (w4.c cVar : this.f19405d) {
                if (cVar.e() == c.b.f31131h && !rd.m.a(cVar.c(), c.a.f31098b.a())) {
                    hashSet.add(Integer.valueOf(cVar.d()));
                }
            }
            w4.c[] cVarArr = this.f19405d;
            int length = cVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                w4.c cVar2 = cVarArr[i10];
                int i12 = i11 + 1;
                boolean z10 = hashSet.contains(Integer.valueOf(cVar2.d())) && cVar2.e() != c.b.f31131h;
                if (z10 != cVar2.f()) {
                    cVar2.h(z10);
                    l(i11);
                }
                i10++;
                i11 = i12;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int f() {
            return this.f19405d.length;
        }
    }

    public final class c extends RecyclerView.f0 implements View.OnClickListener {
        private final y0 D;
        private w4.c E;
        private boolean F;
        final /* synthetic */ e0 G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e0 e0Var, y0 y0Var) {
            super(y0Var.b());
            rd.m.e(y0Var, "binding");
            this.G = e0Var;
            this.D = y0Var;
            this.F = true;
            y0Var.b().setOnClickListener(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Q(int[] iArr, w4.c cVar, e0 e0Var, c cVar2, DialogInterface dialogInterface, int i10) {
            dialogInterface.cancel();
            c.a.C0412a c0412a = c.a.f31098b;
            c.a aVarC = c0412a.c(iArr[i10]);
            cVar.g(aVarC);
            b bVar = null;
            if (cVar.f() && !rd.m.a(aVarC, c0412a.a())) {
                b bVar2 = e0Var.adapter;
                if (bVar2 == null) {
                    rd.m.o("adapter");
                    bVar2 = null;
                }
                w4.c[] cVarArrD = bVar2.D();
                int length = cVarArrD.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    w4.c cVar3 = cVarArrD[i11];
                    int i13 = i12 + 1;
                    if (cVar3.d() == cVar.d() && cVar3.e() == c.b.f31131h) {
                        cVar3.g(c.a.f31098b.a());
                        b bVar3 = e0Var.adapter;
                        if (bVar3 == null) {
                            rd.m.o("adapter");
                            bVar3 = null;
                        }
                        bVar3.l(i12);
                    }
                    i11++;
                    i12 = i13;
                }
            }
            b bVar4 = e0Var.adapter;
            if (bVar4 == null) {
                rd.m.o("adapter");
            } else {
                bVar = bVar4;
            }
            bVar.H();
            cVar2.P(cVar, cVar2.F);
            e0Var.q5();
        }

        private final void R(boolean z10) {
            if (z10 == this.F) {
                return;
            }
            this.F = z10;
            this.D.f21706f.setVisibility(z10 ? 0 : 4);
        }

        public final void P(w4.c cVar, boolean z10) {
            rd.m.e(cVar, "pb");
            this.E = cVar;
            R(z10);
            TextView textView = this.D.f21706f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(cVar.d() + 1);
            textView.setText(sb2.toString());
            TextView textView2 = this.D.f21704d;
            c.C0413c c0413c = w4.c.f31091e;
            textView2.setText(c0413c.d(cVar.e()));
            this.D.f21702b.setText(c0413c.b(cVar.c()));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v4.a0 a0VarD;
            int iK;
            rd.m.e(view, "v");
            if (this.G.X4() instanceof v4.i0) {
                iK = 10000;
            } else {
                v4.n0 n0VarX4 = this.G.X4();
                if (n0VarX4 == null || (a0VarD = n0VarX4.d()) == null) {
                    return;
                } else {
                    iK = a0VarD.k();
                }
            }
            final w4.c cVar = this.E;
            if (cVar == null) {
                return;
            }
            final int[] intArray = this.G.actions;
            if (intArray == null) {
                intArray = view.getContext().getResources().getIntArray(iK >= 113 ? com.benshikj.ht.R.array.pf_actions_v_113 : iK >= 106 ? com.benshikj.ht.R.array.pf_actions_v_106 : iK >= 103 ? com.benshikj.ht.R.array.pf_actions_v_103 : iK >= 80 ? com.benshikj.ht.R.array.pf_actions_v_80 : iK >= 77 ? com.benshikj.ht.R.array.pf_actions_v_77 : iK >= 69 ? com.benshikj.ht.R.array.pf_actions_v_69 : iK <= 52 ? com.benshikj.ht.R.array.pf_actions_v_52 : com.benshikj.ht.R.array.pf_actions_v);
                rd.m.d(intArray, "getIntArray(...)");
            }
            String[] stringArray = this.G.actionNames;
            if (stringArray == null) {
                stringArray = view.getContext().getResources().getStringArray(iK >= 113 ? com.benshikj.ht.R.array.pf_actions_113 : iK >= 106 ? com.benshikj.ht.R.array.pf_actions_106 : iK >= 103 ? com.benshikj.ht.R.array.pf_actions_103 : iK >= 80 ? com.benshikj.ht.R.array.pf_actions_80 : iK >= 77 ? com.benshikj.ht.R.array.pf_actions_77 : iK >= 69 ? com.benshikj.ht.R.array.pf_actions_69 : iK <= 52 ? com.benshikj.ht.R.array.pf_actions_52 : com.benshikj.ht.R.array.pf_actions);
                rd.m.d(stringArray, "getStringArray(...)");
            }
            int iK2 = ed.j.K(intArray, cVar.c().c());
            c.a aVarY = new c.a(view.getContext()).y(com.benshikj.ht.R.string.action);
            String[] strArr = stringArray;
            if (iK2 < 0) {
                iK2 = 0;
            }
            final e0 e0Var = this.G;
            aVarY.x(strArr, iK2, new DialogInterface.OnClickListener() { // from class: k5.f0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    e0.c.Q(intArray, cVar, e0Var, this, dialogInterface, i10);
                }
            }).C();
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19407a;

        static {
            int[] iArr = new int[v4.v.values().length];
            try {
                iArr[v4.v.GET_PF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v4.v.GET_PF_ACTIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19407a = iArr;
        }
    }

    private final void r5(int[] iArr) {
        this.actions = iArr;
        if (iArr == null) {
            this.actionNames = null;
            return;
        }
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = w4.c.f31091e.b(c.a.f31098b.c(iArr[i10]));
        }
        this.actionNames = strArr;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(v4.n0 iLink, g3.d packet) {
        rd.m.e(iLink, "iLink");
        rd.m.e(packet, "packet");
        super.M(iLink, packet);
        if (packet.m() == 2 && DeviceFragment.a5(packet)) {
            int i10 = d.f19407a[v4.v.d(packet.e()).ordinal()];
            if (i10 == 1) {
                b bVar = this.adapter;
                if (bVar == null) {
                    rd.m.o("adapter");
                    bVar = null;
                }
                w4.c[] cVarArrJ = iLink.j();
                if (cVarArrJ == null) {
                    cVarArrJ = new w4.c[0];
                }
                bVar.G(cVarArrJ);
                return;
            }
            if (i10 != 2) {
                return;
            }
            byte[] bArr = (byte[]) packet.i().clone();
            bArr[0] = 0;
            int length = bArr.length;
            int[] iArr = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = bArr[i11];
            }
            r5(iArr);
        }
    }

    public final void q5() {
        b bVar = this.adapter;
        if (bVar == null) {
            rd.m.o("adapter");
            bVar = null;
        }
        w4.c[] cVarArrD = bVar.D();
        if (cVarArrD.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (w4.c cVar : cVarArrD) {
            arrayList.add(Byte.valueOf((byte) cVar.c().c()));
        }
        v4.n0 n0VarX4 = X4();
        if (n0VarX4 != null) {
            v4.v vVar = v4.v.SET_PF;
            byte[] bArrE0 = ed.q.E0(arrayList);
            n0VarX4.a(vVar, Arrays.copyOf(bArrE0, bArrE0.length));
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        y4(com.benshikj.ht.R.string.programmable_button);
    }

    public final void s5(LayoutInflater layoutInflater) {
        rd.m.e(layoutInflater, "<set-?>");
        this.inflater = layoutInflater;
    }

    public final void t5() {
        x0 x0Var = this.binding;
        if (x0Var != null) {
            b bVar = this.adapter;
            if (bVar == null) {
                rd.m.o("adapter");
                bVar = null;
            }
            if (bVar.D().length == 0) {
                x0Var.f21689b.setVisibility(8);
            } else if (X4() instanceof v4.i0) {
                x0Var.f21689b.setVisibility(0);
            } else {
                x0Var.f21689b.setVisibility(8);
            }
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        s5(inflater);
        x0 x0VarC = x0.c(inflater, container, false);
        rd.m.d(x0VarC, "inflate(...)");
        this.binding = x0VarC;
        this.adapter = new b();
        v4.n0 n0VarX4 = X4();
        b bVar = null;
        w4.c[] cVarArrJ = n0VarX4 != null ? n0VarX4.j() : null;
        if (cVarArrJ == null) {
            v4.n0 n0VarX42 = X4();
            if (n0VarX42 != null) {
                n0VarX42.a(v4.v.GET_PF, new byte[0]);
            }
        } else {
            b bVar2 = this.adapter;
            if (bVar2 == null) {
                rd.m.o("adapter");
                bVar2 = null;
            }
            bVar2.G(cVarArrJ);
        }
        v4.n0 n0VarX43 = X4();
        if (n0VarX43 != null) {
            n0VarX43.a(v4.v.GET_PF_ACTIONS, new byte[0]);
        }
        RecyclerView recyclerView = x0VarC.f21690c;
        b bVar3 = this.adapter;
        if (bVar3 == null) {
            rd.m.o("adapter");
        } else {
            bVar = bVar3;
        }
        recyclerView.setAdapter(bVar);
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        a aVar = new a(contextX3, 1);
        aVar.m(a6.k.b(x3(), 48.0f));
        x0VarC.f21690c.l(aVar);
        t5();
        ConstraintLayout constraintLayoutB = x0VarC.b();
        rd.m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
