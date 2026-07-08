package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RecyclerView.q f3210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f3212c;

    class a extends i {
        a(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f3210a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f3210a.X(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f3210a.W(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f3210a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f3210a.s0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f3210a.s0() - this.f3210a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f3210a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f3210a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f3210a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f3210a.i0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f3210a.s0() - this.f3210a.i0()) - this.f3210a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f3210a.r0(view, true, this.f3212c);
            return this.f3212c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f3210a.r0(view, true, this.f3212c);
            return this.f3212c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f3210a.H0(i10);
        }
    }

    class b extends i {
        b(RecyclerView.q qVar) {
            super(qVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f3210a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f3210a.W(view) + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
            return this.f3210a.X(view) + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f3210a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.r) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f3210a.b0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f3210a.b0() - this.f3210a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f3210a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f3210a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f3210a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f3210a.k0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f3210a.b0() - this.f3210a.k0()) - this.f3210a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f3210a.r0(view, true, this.f3212c);
            return this.f3212c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f3210a.r0(view, true, this.f3212c);
            return this.f3212c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i10) {
            this.f3210a.I0(i10);
        }
    }

    /* synthetic */ i(RecyclerView.q qVar, a aVar) {
        this(qVar);
    }

    public static i a(RecyclerView.q qVar) {
        return new a(qVar);
    }

    public static i b(RecyclerView.q qVar, int i10) {
        if (i10 == 0) {
            return a(qVar);
        }
        if (i10 == 1) {
            return c(qVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.q qVar) {
        return new b(qVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f3211b) {
            return 0;
        }
        return n() - this.f3211b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i10);

    public void s() {
        this.f3211b = n();
    }

    private i(RecyclerView.q qVar) {
        this.f3211b = RtlSpacingHelper.UNDEFINED;
        this.f3212c = new Rect();
        this.f3210a = qVar;
    }
}
