package p;

import a.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23840a;

    class a extends p.a {
        a(a.a aVar, ComponentName componentName, Context context) {
            super(aVar, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, p.a aVar);

    void b(Context context) {
        this.f23840a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f23840a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(a.AbstractBinderC0000a.j(iBinder), componentName, this.f23840a));
    }
}
