package j0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import j0.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final androidx.collection.h f18349a = new androidx.collection.h(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f18350b = k.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f18351c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final androidx.collection.i f18352d = new androidx.collection.i();

    class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f18354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f18355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18356d;

        a(String str, Context context, f fVar, int i10) {
            this.f18353a = str;
            this.f18354b = context;
            this.f18355c = fVar;
            this.f18356d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return i.c(this.f18353a, this.f18354b, h.a(new Object[]{this.f18355c}), this.f18356d);
        }
    }

    class b implements l0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0.a f18357a;

        b(j0.a aVar) {
            this.f18357a = aVar;
        }

        @Override // l0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f18357a.b(eVar);
        }
    }

    class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f18359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f18360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18361d;

        c(String str, Context context, List list, int i10) {
            this.f18358a = str;
            this.f18359b = context;
            this.f18360c = list;
            this.f18361d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return i.c(this.f18358a, this.f18359b, this.f18360c, this.f18361d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements l0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18362a;

        d(String str) {
            this.f18362a = str;
        }

        @Override // l0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (i.f18351c) {
                try {
                    androidx.collection.i iVar = i.f18352d;
                    ArrayList arrayList = (ArrayList) iVar.get(this.f18362a);
                    if (arrayList == null) {
                        return;
                    }
                    iVar.remove(this.f18362a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((l0.a) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static String a(List list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(((f) list.get(i11)).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    private static int b(j.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        j.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i10 = 0;
            for (j.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, List list, int i10) {
        p1.a.a("getFontSync");
        try {
            androidx.collection.h hVar = f18349a;
            Typeface typeface = (Typeface) hVar.get(str);
            if (typeface != null) {
                return new e(typeface);
            }
            j.a aVarE = j0.e.e(context, list, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? d0.j.b(context, null, aVarE.c(), i10) : d0.j.c(context, null, aVarE.d(), i10);
            if (typefaceB == null) {
                return new e(-3);
            }
            hVar.put(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        } finally {
            p1.a.b();
        }
    }

    static Typeface d(Context context, List list, int i10, Executor executor, j0.a aVar) {
        String strA = a(list, i10);
        Typeface typeface = (Typeface) f18349a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f18351c) {
            try {
                androidx.collection.i iVar = f18352d;
                ArrayList arrayList = (ArrayList) iVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                iVar.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = f18350b;
                }
                k.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static Typeface e(Context context, f fVar, j0.a aVar, int i10, int i11) {
        String strA = a(h.a(new Object[]{fVar}), i10);
        Typeface typeface = (Typeface) f18349a.get(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, h.a(new Object[]{fVar}), i10);
            aVar.b(eVarC);
            return eVarC.f18363a;
        }
        try {
            e eVar = (e) k.d(f18350b, new a(strA, context, fVar, i10), i11);
            aVar.b(eVar);
            return eVar.f18363a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f18363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f18364b;

        e(int i10) {
            this.f18363a = null;
            this.f18364b = i10;
        }

        boolean a() {
            return this.f18364b == 0;
        }

        e(Typeface typeface) {
            this.f18363a = typeface;
            this.f18364b = 0;
        }
    }
}
