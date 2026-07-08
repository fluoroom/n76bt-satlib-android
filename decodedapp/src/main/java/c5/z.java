package c5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import c5.m0;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import kotlin.Metadata;
import m4.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lc5/z;", "Lv3/c;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Ldd/d0;", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "v", "onClick", "(Landroid/view/View;)V", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends v3.c implements View.OnClickListener {
    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        w0 w0VarA = w0.a(view);
        rd.m.d(w0VarA, "bind(...)");
        w0VarA.f21653c.setOnClickListener(this);
        w0VarA.f21654d.setOnClickListener(this);
        w0VarA.f21656f.setOnClickListener(this);
        w0VarA.f21655e.setOnClickListener(this);
        w0VarA.f21657g.setOnClickListener(this);
        w0VarA.f21653c.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        Intent intentA;
        rd.m.e(v10, "v");
        if (Cfg.f5507q == null) {
            Toast.makeText(v10.getContext(), "使用离线地图需要先插入外部储存卡", 1).show();
            return;
        }
        switch (v10.getId()) {
            case R.id.satellite /* 2131297298 */:
                m0.Companion companion = m0.INSTANCE;
                Context contextX3 = x3();
                rd.m.d(contextX3, "requireContext(...)");
                intentA = companion.a(contextX3, z4.j.f32939c);
                break;
            case R.id.satellite_tianditu /* 2131297303 */:
                m0.Companion companion2 = m0.INSTANCE;
                Context contextX32 = x3();
                rd.m.d(contextX32, "requireContext(...)");
                intentA = companion2.a(contextX32, z4.j.f32941e);
                break;
            case R.id.terrain /* 2131297504 */:
                m0.Companion companion3 = m0.INSTANCE;
                Context contextX33 = x3();
                rd.m.d(contextX33, "requireContext(...)");
                intentA = companion3.a(contextX33, z4.j.f32940d);
                break;
            case R.id.terrain_OpenTopoMap /* 2131297505 */:
                m0.Companion companion4 = m0.INSTANCE;
                Context contextX34 = x3();
                rd.m.d(contextX34, "requireContext(...)");
                intentA = companion4.a(contextX34, z4.j.f32942f);
                break;
            default:
                intentA = null;
                break;
        }
        if (intentA != null) {
            O3(intentA);
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        z4(N1(R.string.offline_maps));
        return inflater.inflate(R.layout.fragment_offline_maps, container, false);
    }
}
