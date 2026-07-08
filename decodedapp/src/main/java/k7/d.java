package k7;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import k7.c;
import l7.i;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Set f19467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final c.b f19468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c.a f19469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f19470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f19471e;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f19472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f19473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0255c f19475d;

        a(Context context, String str, String str2, c.InterfaceC0255c interfaceC0255c) {
            this.f19472a = context;
            this.f19473b = str;
            this.f19474c = str2;
            this.f19475d = interfaceC0255c;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                d.this.g(this.f19472a, this.f19473b, this.f19474c);
                this.f19475d.a();
            } catch (UnsatisfiedLinkError e10) {
                this.f19475d.b(e10);
            } catch (k7.b e11) {
                this.f19475d.b(e11);
            }
        }
    }

    class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19477a;

        b(String str) {
            this.f19477a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f19477a);
        }
    }

    protected d() {
        this(new e(), new k7.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context, String str, String str2) throws Throwable {
        d dVar;
        Context context2;
        i iVar;
        if (this.f19467a.contains(str) && !this.f19470d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f19468b.b(str);
            this.f19467a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e10) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileD = d(context, str, str2);
            if (!fileD.exists() || this.f19470d) {
                if (this.f19470d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                dVar = this;
                context2 = context;
                this.f19469c.a(context2, this.f19468b.d(), this.f19468b.a(str), fileD, dVar);
            } else {
                dVar = this;
                context2 = context;
            }
            try {
                if (dVar.f19471e) {
                    try {
                        iVar = new i(fileD);
                    } catch (Throwable th2) {
                        th = th2;
                        iVar = null;
                    }
                    try {
                        List listE = iVar.e();
                        iVar.close();
                        Iterator it = listE.iterator();
                        while (it.hasNext()) {
                            e(context2, dVar.f19468b.c((String) it.next()));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Throwable th4 = th;
                        if (iVar == null) {
                            throw th4;
                        }
                        iVar.close();
                        throw th4;
                    }
                }
            } catch (IOException unused) {
            }
            dVar.f19468b.e(fileD.getAbsolutePath());
            dVar.f19467a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    protected void b(Context context, String str, String str2) {
        File fileC = c(context);
        File fileD = d(context, str, str2);
        File[] fileArrListFiles = fileC.listFiles(new b(this.f19468b.a(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f19470d || !file.getAbsolutePath().equals(fileD.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    protected File c(Context context) {
        return context.getDir("lib", 0);
    }

    protected File d(Context context, String str, String str2) {
        String strA = this.f19468b.a(str);
        if (f.a(str2)) {
            return new File(c(context), strA);
        }
        return new File(c(context), strA + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, c.InterfaceC0255c interfaceC0255c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (f.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        i("Beginning load of %s...", str);
        if (interfaceC0255c == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, interfaceC0255c)).start();
        }
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }

    protected d(c.b bVar, c.a aVar) {
        this.f19467a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f19468b = bVar;
        this.f19469c = aVar;
    }

    public void h(String str) {
    }
}
