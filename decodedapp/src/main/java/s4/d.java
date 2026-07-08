package s4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.GridRecyclerView;
import com.dw.ht.Cfg;

/* JADX INFO: loaded from: classes.dex */
public class d extends v3.m0 {
    private GridRecyclerView F0;

    public static class a extends g.a {
        @Override // g.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, String str) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("NOT_SAVE", true);
            return FragmentShowActivity.e2(context, null, d.class, bundle);
        }

        @Override // g.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String c(int i10, Intent intent) {
            if (intent == null || i10 != -1) {
                return null;
            }
            String stringExtra = intent.getStringExtra("SYMBOL");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    private class b extends c6.b {
        private final o5.a A;

        public b(Context context) {
            super(context, 0);
            this.A = o5.a.b();
            for (char c10 : "!#$%&'()*+,-./0123456789:;<=>?@ABCEFGHIKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxz|~".toCharArray()) {
                D(new String(new char[]{'/', c10}));
            }
            for (char c11 : "!#$&'()*+,-./0:;<>?@ABCDEFGHIJKLNOPQRSTUVWX[^_`abcdefghijkmnoprstuvwyz{|~".toCharArray()) {
                D(new String(new char[]{'\\', c11}));
            }
            char[] charArray = "abcdefghijABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
            for (char c12 : "#&0AW^_acnsuvz".toCharArray()) {
                for (char c13 : charArray) {
                    D(new String(new char[]{c13, c12}));
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public void s(c cVar, int i10) {
            String str = (String) J(i10);
            cVar.F = str;
            cVar.D.setImageBitmap(this.A.c(str));
            cVar.E.setText(cVar.F);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public c u(ViewGroup viewGroup, int i10) {
            return d.this.new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_aprs_icons_item, viewGroup, false));
        }
    }

    private class c extends RecyclerView.f0 implements View.OnClickListener {
        private final ImageView D;
        private final TextView E;
        public String F;

        public c(View view) {
            super(view);
            this.D = (ImageView) view.findViewById(R.id.icon);
            this.E = (TextView) view.findViewById(R.id.label);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Bundle bundleI1 = d.this.i1();
            if (bundleI1 == null || !bundleI1.getBoolean("NOT_SAVE")) {
                Cfg.p0(this.F);
            }
            androidx.fragment.app.p pVarE1 = d.this.e1();
            if (pVarE1 == null) {
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("SYMBOL", this.F);
            pVarE1.setResult(-1, intent);
            pVarE1.finish();
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z4(N1(R.string.choiceIcon));
        View viewInflate = layoutInflater.inflate(R.layout.fragment_aprs_icons, viewGroup, false);
        GridRecyclerView gridRecyclerView = (GridRecyclerView) viewInflate.findViewById(R.id.list);
        this.F0 = gridRecyclerView;
        gridRecyclerView.setColumnWidth(H1().getDimensionPixelSize(R.dimen.recommended_touch_area_size));
        this.F0.setAdapter(new b(k1()));
        return viewInflate;
    }
}
