package u7;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f28508a = DesugarCollections.synchronizedMap(new androidx.collection.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28509b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f28510c;

    s1() {
    }

    final h c(String str, Class cls) {
        return (h) cls.cast(this.f28508a.get(str));
    }

    final void d(String str, h hVar) {
        if (this.f28508a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f28508a.put(str, hVar);
        if (this.f28509b > 0) {
            new i8.f(Looper.getMainLooper()).post(new r1(this, hVar, str));
        }
    }

    final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f28508a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    final void f(int i10, int i11, Intent intent) {
        Iterator it = this.f28508a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).e(i10, i11, intent);
        }
    }

    final void g(Bundle bundle) {
        this.f28509b = 1;
        this.f28510c = bundle;
        for (Map.Entry entry : this.f28508a.entrySet()) {
            ((h) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void h() {
        this.f28509b = 5;
        Iterator it = this.f28508a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).g();
        }
    }

    final void i() {
        this.f28509b = 3;
        Iterator it = this.f28508a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).h();
        }
    }

    final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f28508a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((h) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void k() {
        this.f28509b = 2;
        Iterator it = this.f28508a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).j();
        }
    }

    final void l() {
        this.f28509b = 4;
        Iterator it = this.f28508a.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).k();
        }
    }
}
