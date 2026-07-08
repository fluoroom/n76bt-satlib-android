package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.n;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: loaded from: classes.dex */
class i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f1261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.c f1262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    f f1263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n.a f1264d;

    public i(h hVar) {
        this.f1261a = hVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f1262b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        h hVar = this.f1261a;
        c.a aVar = new c.a(hVar.w());
        f fVar = new f(aVar.b(), h.g.f14877l);
        this.f1263c = fVar;
        fVar.setCallback(this);
        this.f1261a.b(this.f1263c);
        aVar.c(this.f1263c.a(), this);
        View viewA = hVar.A();
        if (viewA != null) {
            aVar.e(viewA);
        } else {
            aVar.g(hVar.y()).z(hVar.z());
        }
        aVar.s(this);
        androidx.appcompat.app.c cVarA = aVar.a();
        this.f1262b = cVarA;
        cVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1262b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f1262b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f1261a.O((j) this.f1263c.a().getItem(i10), 0);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void onCloseMenu(h hVar, boolean z10) {
        if (z10 || hVar == this.f1261a) {
            a();
        }
        n.a aVar = this.f1264d;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, z10);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1263c.onCloseMenu(this.f1261a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1262b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1262b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1261a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1261a.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean onOpenSubMenu(h hVar) {
        n.a aVar = this.f1264d;
        if (aVar != null) {
            return aVar.onOpenSubMenu(hVar);
        }
        return false;
    }
}
