package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;
import m0.o0;

/* JADX INFO: loaded from: classes3.dex */
class o extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f7815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i.m f7816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7817f;

    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f7818a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f7818a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f7818a.getAdapter().p(i10)) {
                o.this.f7816e.a(this.f7818a.getAdapter().getItem(i10).longValue());
            }
        }
    }

    public static class b extends RecyclerView.f0 {
        final TextView D;
        final MaterialCalendarGridView E;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(u8.f.f28663u);
            this.D = textView;
            o0.o0(textView, true);
            this.E = (MaterialCalendarGridView) linearLayout.findViewById(u8.f.f28659q);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    o(Context context, d dVar, com.google.android.material.datepicker.a aVar, g gVar, i.m mVar) {
        m mVarM = aVar.m();
        m mVarI = aVar.i();
        m mVarL = aVar.l();
        if (mVarM.compareTo(mVarL) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (mVarL.compareTo(mVarI) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f7817f = (n.f7809e * i.h4(context)) + (k.r4(context) ? i.h4(context) : 0);
        this.f7815d = aVar;
        this.f7816e = mVar;
        B(true);
    }

    m E(int i10) {
        return this.f7815d.m().n(i10);
    }

    CharSequence F(int i10) {
        return E(i10).l();
    }

    int G(m mVar) {
        return this.f7815d.m().q(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void s(b bVar, int i10) {
        m mVarN = this.f7815d.m().n(i10);
        bVar.D.setText(mVarN.l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.E.findViewById(u8.f.f28659q);
        if (materialCalendarGridView.getAdapter() == null || !mVarN.equals(materialCalendarGridView.getAdapter().f7811a)) {
            n nVar = new n(mVarN, null, this.f7815d, null);
            materialCalendarGridView.setNumColumns(mVarN.f7805d);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public b u(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(u8.h.f28692u, viewGroup, false);
        if (!k.r4(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.r(-1, this.f7817f));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.f7815d.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i10) {
        return this.f7815d.m().n(i10).m();
    }
}
