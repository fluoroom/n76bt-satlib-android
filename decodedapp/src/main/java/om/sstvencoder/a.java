package om.sstvencoder;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import om.sstvencoder.ColorPalette.ColorPaletteView;

/* JADX INFO: loaded from: classes3.dex */
public class a extends n implements ColorPaletteView.a {
    private List E0 = new ArrayList();
    private int F0 = xh.e.f32186f;
    private int G0 = -1;

    /* JADX INFO: renamed from: om.sstvencoder.a$a, reason: collision with other inner class name */
    public interface InterfaceC0325a {
        void r(n nVar);

        void u(n nVar, int i10);
    }

    @Override // om.sstvencoder.ColorPalette.ColorPaletteView.a
    public void D(View view) {
        Iterator it = this.E0.iterator();
        while (it.hasNext()) {
            ((InterfaceC0325a) it.next()).r(this);
        }
        V3();
    }

    @Override // om.sstvencoder.ColorPalette.ColorPaletteView.a
    public void O0(View view, int i10) {
        Iterator it = this.E0.iterator();
        while (it.hasNext()) {
            ((InterfaceC0325a) it.next()).u(this, i10);
        }
        V3();
    }

    @Override // androidx.fragment.app.n
    public Dialog Z3(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(e1());
        View viewInflate = e1().getLayoutInflater().inflate(xh.b.f32178c, (ViewGroup) null);
        ColorPaletteView colorPaletteView = (ColorPaletteView) viewInflate.findViewById(xh.a.A);
        colorPaletteView.setColor(this.G0);
        colorPaletteView.a(this);
        builder.setTitle(this.F0);
        builder.setView(viewInflate);
        return builder.create();
    }

    public void h4(InterfaceC0325a interfaceC0325a) {
        this.E0.add(interfaceC0325a);
    }

    public void i4(int i10) {
        this.G0 = i10;
    }

    public void j4(int i10) {
        this.F0 = i10;
    }

    @Override // om.sstvencoder.ColorPalette.ColorPaletteView.a
    public void u(View view, int i10) {
    }
}
