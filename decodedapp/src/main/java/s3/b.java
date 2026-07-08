package s3;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import d4.f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26316a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static b6.c f26318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final f f26319d = new f();

    public static class a extends MatrixCursor {
        public a(String[] strArr, int i10) {
            super(strArr, i10);
        }

        void a() {
            super.onChange(true);
        }
    }

    /* JADX INFO: renamed from: s3.b$b, reason: collision with other inner class name */
    public static class C0362b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String[] f26320e = {"Level", "Time", "Tag", "Text"};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final SimpleDateFormat f26321f = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f26322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f26323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f26324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f26325d = System.currentTimeMillis();

        public C0362b(int i10, String str, String str2) {
            this.f26322a = i10;
            this.f26323b = str;
            this.f26324c = str2;
        }

        private String b() {
            return f26321f.format(new Date(this.f26325d));
        }

        public String a() {
            switch (this.f26322a) {
                case 2:
                    return "V";
                case 3:
                    return "D";
                case 4:
                    return "I";
                case 5:
                    return "W";
                case 6:
                    return "E";
                case 7:
                    return "A";
                default:
                    return "*";
            }
        }

        public Object[] c() {
            return new Object[]{a(), b(), this.f26323b, this.f26324c};
        }
    }

    public static void a() {
        f26318c.e();
        j();
    }

    public static int b(String str, String str2) {
        if (f26316a > 3) {
            return 0;
        }
        return k(3, str, str2);
    }

    public static int c(String str, String str2, Throwable th2) {
        if (f26316a > 3) {
            return 0;
        }
        return k(3, str, str2 + '\n' + g(th2));
    }

    public static int d(String str, String str2) {
        if (f26316a > 6) {
            return 0;
        }
        return k(6, str, str2);
    }

    public static int e(String str, String str2, Throwable th2) {
        if (f26316a > 6) {
            return 0;
        }
        return k(6, str, str2 + '\n' + g(th2));
    }

    public static Cursor f() {
        b6.c cVar = f26318c;
        if (cVar == null) {
            return null;
        }
        int iC = cVar.c();
        C0362b[] c0362bArr = new C0362b[iC];
        b6.c cVar2 = f26318c;
        cVar2.l(c0362bArr, 0, cVar2.c());
        f26318c.f(iC);
        a aVar = new a(C0362b.f26320e, iC);
        for (int i10 = 0; i10 < iC; i10++) {
            aVar.addRow(c0362bArr[i10].c());
        }
        f fVar = f26319d;
        synchronized (fVar) {
            fVar.add(aVar);
        }
        return aVar;
    }

    public static String g(Throwable th2) {
        return Log.getStackTraceString(th2);
    }

    public static int h(String str, String str2) {
        if (f26316a > 4) {
            return 0;
        }
        return k(4, str, str2);
    }

    private static boolean i() {
        return f26316a <= 7;
    }

    private static void j() {
        f<a> fVar = f26319d;
        synchronized (fVar) {
            try {
                if (fVar.size() == 0) {
                    return;
                }
                fVar.b();
                for (a aVar : fVar) {
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int k(int i10, String str, String str2) {
        if (i10 < f26316a) {
            return 0;
        }
        b6.c cVar = f26318c;
        if (cVar != null) {
            if (cVar.b() == 0) {
                cVar.a(1);
            }
            cVar.n(new C0362b(i10, str, str2));
            j();
        }
        if (str2 == null) {
            str2 = "";
        }
        return Log.println(i10, str, str2);
    }

    public static void l(int i10) {
        if (f26317b == i10) {
            return;
        }
        f26317b = i10;
        if (i10 == 0) {
            f26318c = null;
        } else if (i()) {
            f26318c = new b6.c(new C0362b[i10]);
        }
    }

    public static void m(int i10) {
        int i11;
        if (f26316a == i10) {
            return;
        }
        f26316a = i10;
        if (!i()) {
            f26318c = null;
        } else {
            if (f26318c != null || (i11 = f26317b) <= 0) {
                return;
            }
            f26318c = new b6.c(new C0362b[i11]);
        }
    }

    public static int n(String str, String str2) {
        if (f26316a > 5) {
            return 0;
        }
        return k(5, str, str2);
    }
}
