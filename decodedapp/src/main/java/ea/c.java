package ea;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.CameraPosition;
import ga.h;
import ha.c;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o8.c;
import q8.i;

/* JADX INFO: loaded from: classes3.dex */
public class c implements c.b, c.h, c.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ha.c f11713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.a f11714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f11715c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ga.a f11717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o8.c f11718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CameraPosition f11719g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e f11722j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private b f11723k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ReadWriteLock f11721i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private fa.f f11716d = new fa.g(new fa.e(new fa.c()));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f11720h = new a();

    private class a extends AsyncTask {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set doInBackground(Float... fArr) {
            fa.b bVarG = c.this.g();
            bVarG.lock();
            try {
                return bVarG.b(fArr[0].floatValue());
            } finally {
                bVarG.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Set set) {
            c.this.f11717e.g(set);
        }

        private a() {
        }
    }

    public interface b {
        boolean a(ea.a aVar);
    }

    /* JADX INFO: renamed from: ea.c$c, reason: collision with other inner class name */
    public interface InterfaceC0157c {
    }

    public interface d {
    }

    public interface e {
        boolean a(ea.b bVar);
    }

    public interface f {
    }

    public interface g {
    }

    public c(Context context, o8.c cVar, ha.c cVar2) {
        this.f11718f = cVar;
        this.f11713a = cVar2;
        this.f11715c = cVar2.o();
        this.f11714b = cVar2.o();
        this.f11717e = new h(context, cVar, this);
        this.f11717e.d();
    }

    @Override // o8.c.b
    public void a() {
        ga.a aVar = this.f11717e;
        if (aVar instanceof c.b) {
            ((c.b) aVar).a();
        }
        this.f11716d.a(this.f11718f.g());
        if (this.f11716d.f()) {
            f();
            return;
        }
        CameraPosition cameraPosition = this.f11719g;
        if (cameraPosition == null || cameraPosition.f7313b != this.f11718f.g().f7313b) {
            this.f11719g = this.f11718f.g();
            f();
        }
    }

    public boolean c(Collection collection) {
        fa.b bVarG = g();
        bVarG.lock();
        try {
            return bVarG.c(collection);
        } finally {
            bVarG.unlock();
        }
    }

    @Override // o8.c.h
    public boolean d(i iVar) {
        return k().d(iVar);
    }

    public void e() {
        fa.b bVarG = g();
        bVarG.lock();
        try {
            bVarG.d();
        } finally {
            bVarG.unlock();
        }
    }

    public void f() {
        this.f11721i.writeLock().lock();
        try {
            this.f11720h.cancel(true);
            a aVar = new a();
            this.f11720h = aVar;
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.f11718f.g().f7313b));
        } finally {
            this.f11721i.writeLock().unlock();
        }
    }

    public fa.b g() {
        return this.f11716d;
    }

    @Override // o8.c.f
    public void h(i iVar) {
        k().h(iVar);
    }

    public c.a i() {
        return this.f11715c;
    }

    public c.a j() {
        return this.f11714b;
    }

    public ha.c k() {
        return this.f11713a;
    }

    public ga.a l() {
        return this.f11717e;
    }

    public void m(b bVar) {
        this.f11723k = bVar;
        this.f11717e.c(bVar);
    }

    public void n(e eVar) {
        this.f11722j = eVar;
        this.f11717e.b(eVar);
    }

    public void o(ga.a aVar) {
        this.f11717e.c(null);
        this.f11717e.b(null);
        this.f11715c.b();
        this.f11714b.b();
        this.f11717e.i();
        this.f11717e = aVar;
        aVar.d();
        this.f11717e.c(this.f11723k);
        this.f11717e.f(null);
        this.f11717e.a(null);
        this.f11717e.b(this.f11722j);
        this.f11717e.e(null);
        this.f11717e.h(null);
        f();
    }
}
