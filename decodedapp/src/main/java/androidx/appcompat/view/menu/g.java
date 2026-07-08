package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class g extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    h f1229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1230b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f1232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f1233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1234f;

    public g(h hVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1232d = z10;
        this.f1233e = layoutInflater;
        this.f1229a = hVar;
        this.f1234f = i10;
        a();
    }

    void a() {
        j jVarX = this.f1229a.x();
        if (jVarX != null) {
            ArrayList arrayListB = this.f1229a.B();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((j) arrayListB.get(i10)) == jVarX) {
                    this.f1230b = i10;
                    return;
                }
            }
        }
        this.f1230b = -1;
    }

    public h b() {
        return this.f1229a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j getItem(int i10) {
        ArrayList arrayListB = this.f1232d ? this.f1229a.B() : this.f1229a.G();
        int i11 = this.f1230b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (j) arrayListB.get(i10);
    }

    public void d(boolean z10) {
        this.f1231c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1230b < 0 ? (this.f1232d ? this.f1229a.B() : this.f1229a.G()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1233e.inflate(this.f1234f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1229a.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        o.a aVar = (o.a) view;
        if (this.f1231c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.initialize(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
