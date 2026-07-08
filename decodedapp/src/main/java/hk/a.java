package hk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import fk.h;
import ik.b;
import ik.c;
import ik.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lk.a;

/* JADX INFO: loaded from: classes3.dex */
public class a extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f15636d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f15637e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f15638f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private jk.a f15639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f15640h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f15641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f15642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f15643t;

    /* JADX INFO: renamed from: hk.a$a, reason: collision with other inner class name */
    class C0218a implements a.InterfaceC0278a {
        C0218a() {
        }

        @Override // lk.a.InterfaceC0278a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(File file) {
            return file.isDirectory();
        }
    }

    private View G(ViewGroup viewGroup, int i10) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
    }

    private void M(List list) {
        lk.a.c(list, new C0218a());
    }

    public void D() {
        this.f15638f.clear();
        k();
    }

    public File E(int i10) {
        return this.f15643t ? (File) this.f15636d.get(i10 - 1) : (File) this.f15636d.get(i10);
    }

    public List F() {
        return this.f15638f;
    }

    public void H() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f15636d) {
            if (!this.f15638f.contains(file.getName())) {
                arrayList.add(file.getName());
            }
        }
        this.f15638f = new ArrayList(arrayList);
        k();
    }

    public boolean I() {
        return this.f15641r;
    }

    public boolean J(int i10) {
        return this.f15638f.contains(E(i10).getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void s(ik.a aVar, int i10) {
        if (h(i10) == 5 || h(i10) == 4) {
            ((d) aVar).R(this.f15639g);
        } else {
            aVar.O(E(i10), this.f15640h, J(i10), this.f15639g);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public ik.a u(ViewGroup viewGroup, int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 5 ? new b(G(viewGroup, h.f13326c)) : new d(G(viewGroup, h.f13327d)) : new d(G(viewGroup, h.f13327d)) : new b(G(viewGroup, h.f13327d)) : new c(G(viewGroup, h.f13326c)) : new c(G(viewGroup, h.f13327d));
    }

    public void N() {
        this.f15638f.clear();
        Iterator it = this.f15636d.iterator();
        while (it.hasNext()) {
            this.f15638f.add(((File) it.next()).getName());
        }
        k();
    }

    public void O(boolean z10) {
        this.f15642s = z10;
    }

    public void P(boolean z10) {
        this.f15641r = z10;
        k();
    }

    public void Q(int i10, boolean z10) {
        String name = E(i10).getName();
        if (z10) {
            this.f15638f.add(name);
        } else {
            this.f15638f.remove(name);
        }
        l(i10);
    }

    public void R(List list, fk.b bVar) {
        this.f15638f.clear();
        this.f15636d.clear();
        this.f15636d.addAll(list);
        V(bVar);
    }

    public void S(boolean z10) {
        this.f15640h = z10;
        if (!z10) {
            this.f15638f.clear();
        }
        if (this.f15642s) {
            if (z10) {
                this.f15637e = new ArrayList(this.f15636d);
                M(this.f15636d);
            } else {
                this.f15636d = new ArrayList(this.f15637e);
            }
        }
        k();
    }

    public void T(jk.a aVar) {
        this.f15639g = aVar;
    }

    public void U(boolean z10) {
        this.f15643t = z10;
    }

    public void V(fk.b bVar) {
        Collections.sort(this.f15636d, mk.b.a(bVar));
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.f15643t ? this.f15636d.size() + 1 : this.f15636d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h(int i10) {
        return (this.f15643t && i10 == 0) ? this.f15641r ? 4 : 5 : this.f15641r ? E(i10).isDirectory() ? 3 : 1 : E(i10).isDirectory() ? 2 : 0;
    }
}
