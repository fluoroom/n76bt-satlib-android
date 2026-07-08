package com.dw.ht.channels;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f5643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f5644e;

    public interface a {
        void g0(b bVar, int i10);
    }

    public class b extends RecyclerView.f0 implements View.OnClickListener {
        private final TextView D;
        private final TextView E;
        public d5.a F;

        public b(View view) {
            super(view);
            view.setOnClickListener(this);
            view.findViewById(R.id.link).setOnClickListener(this);
            view.findViewById(R.id.clean).setOnClickListener(this);
            this.D = (TextView) view.findViewById(R.id.title);
            this.E = (TextView) view.findViewById(R.id.ch_number);
        }

        public void O(int i10, d5.a aVar) {
            this.F = aVar;
            this.D.setText(aVar == null ? "" : aVar.y());
            this.E.setText(String.valueOf(i10 + 1));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f5643d != null) {
                c.this.f5643d.g0(this, view.getId());
            }
        }
    }

    public c(a aVar) {
        this.f5643d = aVar;
    }

    public d5.a E(int i10) {
        return (d5.a) this.f5644e.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void s(b bVar, int i10) {
        bVar.O(i10, E(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b u(ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_region_editor_list_item, viewGroup, false));
    }

    public void H(ArrayList arrayList) {
        this.f5644e = arrayList;
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        ArrayList arrayList = this.f5644e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
