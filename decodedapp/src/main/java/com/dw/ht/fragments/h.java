package com.dw.ht.fragments;

import android.bluetooth.BluetoothDevice;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.ht.fragments.DeviceScanFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class h extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f6258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DeviceScanFragment.e f6259e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        BluetoothDevice f6260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6261b;

        public a(BluetoothDevice bluetoothDevice, int i10) {
            this.f6260a = bluetoothDevice;
            this.f6261b = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f6260a.equals(((a) obj).f6260a);
        }
    }

    public class b extends RecyclerView.f0 implements View.OnClickListener {
        public final View D;
        public final TextView E;
        public final TextView F;
        public final TextView G;
        public a H;

        public b(View view) {
            super(view);
            this.D = view;
            this.E = (TextView) view.findViewById(R.id.name);
            this.G = (TextView) view.findViewById(R.id.address);
            this.F = (TextView) view.findViewById(R.id.content);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (h.this.f6259e != null) {
                h.this.f6259e.a(this.H);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f0
        public String toString() {
            return super.toString() + " '" + ((Object) this.F.getText()) + "'";
        }
    }

    public h(ArrayList arrayList, DeviceScanFragment.e eVar) {
        if (arrayList == null) {
            this.f6258d = d4.d.b();
        } else {
            this.f6258d = arrayList;
        }
        this.f6259e = eVar;
    }

    public void E(a aVar) {
        if (this.f6258d.contains(aVar)) {
            return;
        }
        this.f6258d.add(aVar);
        m(this.f6258d.size() - 1);
    }

    public void F() {
        this.f6258d.clear();
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void s(b bVar, int i10) {
        a aVar = (a) this.f6258d.get(i10);
        bVar.H = aVar;
        bVar.E.setText(m3.a.b(aVar.f6260a));
        bVar.G.setText(aVar.f6260a.getAddress());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b u(ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_device, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.f6258d.size();
    }
}
