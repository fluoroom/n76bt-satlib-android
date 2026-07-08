package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f2044o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f2045p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile e f2046q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f2048b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f2051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final h f2052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f2053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f2054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f2055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f2056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f2057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f2058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f2059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0030e f2060n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f2047a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f2049c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f2050d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.h f2061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile m f2062c;

        /* JADX INFO: renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        class C0029a extends i {
            C0029a() {
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th2) {
                a.this.f2064a.n(th2);
            }

            @Override // androidx.emoji2.text.e.i
            public void b(m mVar) {
                a.this.d(mVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        void a() {
            try {
                this.f2064a.f2052f.a(new C0029a());
            } catch (Throwable th2) {
                this.f2064a.n(th2);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f2061b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.e.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2062c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2064a.f2054h);
        }

        void d(m mVar) {
            if (mVar == null) {
                this.f2064a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2062c = mVar;
            m mVar2 = this.f2062c;
            j jVar = this.f2064a.f2053g;
            InterfaceC0030e interfaceC0030e = this.f2064a.f2060n;
            e eVar = this.f2064a;
            this.f2061b = new androidx.emoji2.text.h(mVar2, jVar, interfaceC0030e, eVar.f2055i, eVar.f2056j, androidx.emoji2.text.g.a());
            this.f2064a.o();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f2064a;

        b(e eVar) {
            this.f2064a = eVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h f2065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j f2066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f2067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f2068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f2069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Set f2070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f2071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f2072h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f2073i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        InterfaceC0030e f2074j = new androidx.emoji2.text.d();

        protected c(h hVar) {
            l0.g.h(hVar, "metadataLoader cannot be null.");
            this.f2065a = hVar;
        }

        protected final h a() {
            return this.f2065a;
        }

        public c b(int i10) {
            this.f2073i = i10;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.e.j
        public androidx.emoji2.text.i a(o oVar) {
            return new p(oVar);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public interface InterfaceC0030e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    public static abstract class f {
        public void onFailed(Throwable th2) {
        }

        public void onInitialized() {
        }
    }

    private static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f2075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f2076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f2077c;

        g(f fVar, int i10) {
            this(Arrays.asList((f) l0.g.h(fVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2075a.size();
            int i10 = 0;
            if (this.f2077c != 1) {
                while (i10 < size) {
                    ((f) this.f2075a.get(i10)).onFailed(this.f2076b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((f) this.f2075a.get(i10)).onInitialized();
                    i10++;
                }
            }
        }

        g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection collection, int i10, Throwable th2) {
            l0.g.h(collection, "initCallbacks cannot be null");
            this.f2075a = new ArrayList(collection);
            this.f2077c = i10;
            this.f2076b = th2;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th2);

        public abstract void b(m mVar);
    }

    public interface j {
        androidx.emoji2.text.i a(o oVar);
    }

    private e(c cVar) {
        this.f2054h = cVar.f2067c;
        this.f2055i = cVar.f2068d;
        this.f2056j = cVar.f2069e;
        this.f2057k = cVar.f2071g;
        this.f2058l = cVar.f2072h;
        this.f2052f = cVar.f2065a;
        this.f2059m = cVar.f2073i;
        this.f2060n = cVar.f2074j;
        androidx.collection.b bVar = new androidx.collection.b();
        this.f2048b = bVar;
        j jVar = cVar.f2066b;
        this.f2053g = jVar == null ? new d() : jVar;
        Set set = cVar.f2070f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2070f);
        }
        this.f2051e = new a(this);
        m();
    }

    public static e c() {
        e eVar;
        synchronized (f2044o) {
            eVar = f2046q;
            l0.g.i(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.h.b(inputConnection, editable, i10, i11, z10);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.c(editable, i10, keyEvent);
    }

    public static e h(c cVar) {
        e eVar;
        e eVar2 = f2046q;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (f2044o) {
            try {
                eVar = f2046q;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f2046q = eVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public static boolean i() {
        return f2046q != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.f2047a.writeLock().lock();
        try {
            if (this.f2059m == 0) {
                this.f2049c = 0;
            }
            this.f2047a.writeLock().unlock();
            if (e() == 0) {
                this.f2051e.a();
            }
        } catch (Throwable th2) {
            this.f2047a.writeLock().unlock();
            throw th2;
        }
    }

    public int d() {
        return this.f2058l;
    }

    public int e() {
        this.f2047a.readLock().lock();
        try {
            return this.f2049c;
        } finally {
            this.f2047a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f2057k;
    }

    public void l() {
        l0.g.i(this.f2059m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f2047a.writeLock().lock();
        try {
            if (this.f2049c == 0) {
                return;
            }
            this.f2049c = 0;
            this.f2047a.writeLock().unlock();
            this.f2051e.a();
        } finally {
            this.f2047a.writeLock().unlock();
        }
    }

    void n(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f2047a.writeLock().lock();
        try {
            this.f2049c = 2;
            arrayList.addAll(this.f2048b);
            this.f2048b.clear();
            this.f2047a.writeLock().unlock();
            this.f2050d.post(new g(arrayList, this.f2049c, th2));
        } catch (Throwable th3) {
            this.f2047a.writeLock().unlock();
            throw th3;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f2047a.writeLock().lock();
        try {
            this.f2049c = 1;
            arrayList.addAll(this.f2048b);
            this.f2048b.clear();
            this.f2047a.writeLock().unlock();
            this.f2050d.post(new g(arrayList, this.f2049c));
        } catch (Throwable th2) {
            this.f2047a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        l0.g.i(k(), "Not initialized yet");
        l0.g.e(i10, "start cannot be negative");
        l0.g.e(i11, "end cannot be negative");
        l0.g.e(i12, "maxEmojiCount cannot be negative");
        l0.g.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        l0.g.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        l0.g.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        return this.f2051e.b(charSequence, i10, i11, i12, i13 != 1 ? i13 != 2 ? this.f2054h : false : true);
    }

    public void t(f fVar) {
        l0.g.h(fVar, "initCallback cannot be null");
        this.f2047a.writeLock().lock();
        try {
            if (this.f2049c == 1 || this.f2049c == 2) {
                this.f2050d.post(new g(fVar, this.f2049c));
            } else {
                this.f2048b.add(fVar);
            }
            this.f2047a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f2047a.writeLock().unlock();
            throw th2;
        }
    }

    public void u(f fVar) {
        l0.g.h(fVar, "initCallback cannot be null");
        this.f2047a.writeLock().lock();
        try {
            this.f2048b.remove(fVar);
        } finally {
            this.f2047a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f2051e.c(editorInfo);
    }
}
