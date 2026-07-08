package kk;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import fk.j;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c.a f20303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f20304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedHashMap f20305c;

    public interface a {
        void n(String str);
    }

    public c(Context context) {
        c.a aVar = new c.a(context);
        this.f20303a = aVar;
        aVar.y(j.f13339j);
        LinkedHashMap linkedHashMapF = lk.b.f(context);
        this.f20305c = linkedHashMapF;
        aVar.i((CharSequence[]) linkedHashMapF.values().toArray(new String[0]), this);
    }

    public void a(a aVar) {
        this.f20304b = aVar;
    }

    public void b() {
        this.f20303a.C();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f20304b.n((String) this.f20305c.keySet().toArray()[i10]);
    }
}
