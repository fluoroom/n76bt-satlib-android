package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.j;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.loader.app.a;
import g1.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* JADX INFO: renamed from: c */
    static boolean f2730c = false;

    /* JADX INFO: renamed from: a */
    private final t f2731a;

    /* JADX INFO: renamed from: b */
    private final c f2732b;

    public static class a extends b0 implements c.b {

        /* JADX INFO: renamed from: l */
        private final int f2733l;

        /* JADX INFO: renamed from: m */
        private final Bundle f2734m;

        /* JADX INFO: renamed from: n */
        private final g1.c f2735n;

        /* JADX INFO: renamed from: o */
        private t f2736o;

        /* JADX INFO: renamed from: p */
        private C0038b f2737p;

        /* JADX INFO: renamed from: q */
        private g1.c f2738q;

        a(int i10, Bundle bundle, g1.c cVar, g1.c cVar2) {
            this.f2733l = i10;
            this.f2734m = bundle;
            this.f2735n = cVar;
            this.f2738q = cVar2;
            cVar.u(i10, this);
        }

        @Override // g1.c.b
        public void a(g1.c cVar, Object obj) {
            if (b.f2730c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(obj);
                return;
            }
            if (b.f2730c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(obj);
        }

        @Override // androidx.lifecycle.z
        protected void j() {
            if (b.f2730c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f2735n.x();
        }

        @Override // androidx.lifecycle.z
        protected void k() {
            if (b.f2730c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f2735n.y();
        }

        @Override // androidx.lifecycle.z
        public void m(c0 c0Var) {
            super.m(c0Var);
            this.f2736o = null;
            this.f2737p = null;
        }

        @Override // androidx.lifecycle.b0, androidx.lifecycle.z
        public void n(Object obj) {
            super.n(obj);
            g1.c cVar = this.f2738q;
            if (cVar != null) {
                cVar.v();
                this.f2738q = null;
            }
        }

        g1.c o(boolean z10) {
            if (b.f2730c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f2735n.b();
            this.f2735n.a();
            C0038b c0038b = this.f2737p;
            if (c0038b != null) {
                m(c0038b);
                if (z10) {
                    c0038b.d();
                }
            }
            this.f2735n.A(this);
            if ((c0038b == null || c0038b.c()) && !z10) {
                return this.f2735n;
            }
            this.f2735n.v();
            return this.f2738q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2733l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2734m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f2735n);
            this.f2735n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f2737p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f2737p);
                this.f2737p.a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        g1.c q() {
            return this.f2735n;
        }

        void r() {
            t tVar = this.f2736o;
            C0038b c0038b = this.f2737p;
            if (tVar == null || c0038b == null) {
                return;
            }
            super.m(c0038b);
            h(tVar, c0038b);
        }

        g1.c s(t tVar, a.InterfaceC0037a interfaceC0037a) {
            C0038b c0038b = new C0038b(this.f2735n, interfaceC0037a);
            h(tVar, c0038b);
            c0 c0Var = this.f2737p;
            if (c0Var != null) {
                m(c0Var);
            }
            this.f2736o = tVar;
            this.f2737p = c0038b;
            return this.f2735n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f2733l);
            sb2.append(" : ");
            Class<?> cls = this.f2735n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.b$b */
    static class C0038b implements c0 {

        /* JADX INFO: renamed from: a */
        private final g1.c f2739a;

        /* JADX INFO: renamed from: b */
        private final a.InterfaceC0037a f2740b;

        /* JADX INFO: renamed from: c */
        private boolean f2741c = false;

        C0038b(g1.c cVar, a.InterfaceC0037a interfaceC0037a) {
            this.f2739a = cVar;
            this.f2740b = interfaceC0037a;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f2741c);
        }

        @Override // androidx.lifecycle.c0
        public void b(Object obj) {
            if (b.f2730c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f2739a + ": " + this.f2739a.d(obj));
            }
            this.f2741c = true;
            this.f2740b.K(this.f2739a, obj);
        }

        boolean c() {
            return this.f2741c;
        }

        void d() {
            if (this.f2741c) {
                if (b.f2730c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f2739a);
                }
                this.f2740b.t0(this.f2739a);
            }
        }

        public String toString() {
            return this.f2740b.toString();
        }
    }

    static class c extends s0 {

        /* JADX INFO: renamed from: d */
        private static final v0.c f2742d = new a();

        /* JADX INFO: renamed from: b */
        private j f2743b = new j();

        /* JADX INFO: renamed from: c */
        private boolean f2744c = false;

        static class a implements v0.c {
            a() {
            }

            @Override // androidx.lifecycle.v0.c
            public s0 a(Class cls) {
                return new c();
            }

            @Override // androidx.lifecycle.v0.c
            public /* synthetic */ s0 b(yd.c cVar, e1.a aVar) {
                return w0.c(this, cVar, aVar);
            }

            @Override // androidx.lifecycle.v0.c
            public /* synthetic */ s0 c(Class cls, e1.a aVar) {
                return w0.b(this, cls, aVar);
            }
        }

        c() {
        }

        static c g(x0 x0Var) {
            return (c) new v0(x0Var, f2742d).a(c.class);
        }

        @Override // androidx.lifecycle.s0
        protected void d() {
            super.d();
            int iK = this.f2743b.k();
            for (int i10 = 0; i10 < iK; i10++) {
                ((a) this.f2743b.m(i10)).o(true);
            }
            this.f2743b.b();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2743b.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f2743b.k(); i10++) {
                    a aVar = (a) this.f2743b.m(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2743b.i(i10));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            this.f2744c = false;
        }

        a h(int i10) {
            return (a) this.f2743b.f(i10);
        }

        boolean i() {
            return this.f2744c;
        }

        void j() {
            int iK = this.f2743b.k();
            for (int i10 = 0; i10 < iK; i10++) {
                ((a) this.f2743b.m(i10)).r();
            }
        }

        void k(int i10, a aVar) {
            this.f2743b.j(i10, aVar);
        }

        void l() {
            this.f2744c = true;
        }
    }

    b(t tVar, x0 x0Var) {
        this.f2731a = tVar;
        this.f2732b = c.g(x0Var);
    }

    private g1.c e(int i10, Bundle bundle, a.InterfaceC0037a interfaceC0037a, g1.c cVar) {
        try {
            this.f2732b.l();
            g1.c cVarS = interfaceC0037a.S(i10, bundle);
            if (cVarS == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (cVarS.getClass().isMemberClass() && !Modifier.isStatic(cVarS.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + cVarS);
            }
            a aVar = new a(i10, bundle, cVarS, cVar);
            if (f2730c) {
                Log.v("LoaderManager", "  Created new loader " + aVar);
            }
            this.f2732b.k(i10, aVar);
            this.f2732b.f();
            return aVar.s(this.f2731a, interfaceC0037a);
        } catch (Throwable th2) {
            this.f2732b.f();
            throw th2;
        }
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2732b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public g1.c c(int i10, Bundle bundle, a.InterfaceC0037a interfaceC0037a) {
        if (this.f2732b.i()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarH = this.f2732b.h(i10);
        if (f2730c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (aVarH == null) {
            return e(i10, bundle, interfaceC0037a, null);
        }
        if (f2730c) {
            Log.v("LoaderManager", "  Re-using existing loader " + aVarH);
        }
        return aVarH.s(this.f2731a, interfaceC0037a);
    }

    @Override // androidx.loader.app.a
    public void d() {
        this.f2732b.j();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f2731a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
