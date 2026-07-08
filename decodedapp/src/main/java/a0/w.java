package a0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f132a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f133b;

    public interface a {
        Intent m();
    }

    private w(Context context) {
        this.f133b = context;
    }

    public static w e(Context context) {
        return new w(context);
    }

    public w b(Intent intent) {
        this.f132a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w c(Activity activity) {
        Intent intentM = activity instanceof a ? ((a) activity).m() : null;
        if (intentM == null) {
            intentM = i.a(activity);
        }
        if (intentM != null) {
            ComponentName component = intentM.getComponent();
            if (component == null) {
                component = intentM.resolveActivity(this.f133b.getPackageManager());
            }
            d(component);
            b(intentM);
        }
        return this;
    }

    public w d(ComponentName componentName) {
        int size = this.f132a.size();
        try {
            Intent intentB = i.b(this.f133b, componentName);
            while (intentB != null) {
                this.f132a.add(size, intentB);
                intentB = i.b(this.f133b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void f() {
        g(null);
    }

    public void g(Bundle bundle) {
        if (this.f132a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f132a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (b0.b.l(this.f133b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f133b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f132a.iterator();
    }
}
