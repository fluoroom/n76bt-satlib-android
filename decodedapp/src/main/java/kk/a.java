package kk;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.c;
import fk.g;
import fk.h;
import fk.j;

/* JADX INFO: loaded from: classes3.dex */
public class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0270a f20299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c.a f20300b;

    /* JADX INFO: renamed from: kk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0270a {
        void p(String str);
    }

    public a(Context context) {
        c.a aVar = new c.a(context);
        this.f20300b = aVar;
        aVar.y(j.f13338i);
        this.f20300b.B(LayoutInflater.from(context).inflate(h.f13325b, (ViewGroup) null));
        this.f20300b.t(R.string.ok, this);
        this.f20300b.m(R.string.cancel, null);
    }

    public void a(InterfaceC0270a interfaceC0270a) {
        this.f20299a = interfaceC0270a;
    }

    public void b() {
        this.f20300b.C();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        TextView textView = (TextView) ((androidx.appcompat.app.c) dialogInterface).findViewById(g.f13316h);
        InterfaceC0270a interfaceC0270a = this.f20299a;
        if (interfaceC0270a == null || textView == null) {
            return;
        }
        interfaceC0270a.p(textView.getText().toString());
    }
}
