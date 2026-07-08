package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
class v extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f7826d;

    public static class a extends RecyclerView.f0 {
        final TextView D;

        a(TextView textView) {
            super(textView);
            this.D = textView;
        }
    }

    v(i iVar) {
        this.f7826d = iVar;
    }

    int D(int i10) {
        return i10 - this.f7826d.d4().m().f7804c;
    }

    int E(int i10) {
        return this.f7826d.d4().m().f7804c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        int iE = E(i10);
        aVar.D.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iE)));
        TextView textView = aVar.D;
        textView.setContentDescription(e.e(textView.getContext(), iE));
        c cVarE4 = this.f7826d.e4();
        if (u.i().get(1) == iE) {
            b bVar = cVarE4.f7744f;
        } else {
            b bVar2 = cVarE4.f7742d;
        }
        this.f7826d.g4();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(u8.h.f28694w, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.f7826d.d4().n();
    }
}
