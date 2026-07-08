package kk;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;

/* JADX INFO: loaded from: classes3.dex */
public class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c.a f20301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f20302b;

    public interface a {
        void k(fk.b bVar);
    }

    public b(Context context) {
        c.a aVar = new c.a(context);
        this.f20301a = aVar;
        aVar.i(context.getResources().getStringArray(fk.c.f13301b), this);
    }

    public void a(a aVar) {
        this.f20302b = aVar;
    }

    public void b() {
        this.f20301a.C();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        fk.b bVar = fk.b.NAME_ASC;
        if (i10 == 1) {
            bVar = fk.b.NAME_DESC;
        } else if (i10 == 2) {
            bVar = fk.b.SIZE_ASC;
        } else if (i10 == 3) {
            bVar = fk.b.SIZE_DESC;
        } else if (i10 == 4) {
            bVar = fk.b.DATE_ASC;
        } else if (i10 == 5) {
            bVar = fk.b.DATE_DESC;
        }
        this.f20302b.k(bVar);
    }
}
