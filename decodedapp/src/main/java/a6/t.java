package a6;

import java.security.InvalidParameterException;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f342b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f341a = {" ns", " us ", " ms "};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f343c = new a();

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Stack initialValue() {
            return new Stack();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f345b;

        public b(String str) {
            this.f344a = str;
        }
    }

    public static void a(StringBuilder sb2, long j10) {
        int length = sb2.length();
        int i10 = 0;
        while (j10 > 0) {
            String[] strArr = f341a;
            if (i10 >= strArr.length) {
                break;
            }
            sb2.insert(length, strArr[i10]);
            sb2.insert(length, j10 % 1000);
            j10 /= 1000;
            i10++;
        }
        if (j10 > 0) {
            sb2.insert(length, " s ");
            sb2.insert(length, j10);
        }
    }

    public static void b(String str, String str2) {
        c(str, str2, null);
    }

    public static void c(String str, String str2, String str3) {
        if (f342b) {
            long jNanoTime = System.nanoTime();
            b bVar = (b) ((Stack) f343c.get()).pop();
            if (bVar == null) {
                return;
            }
            if (!q.d(str, bVar.f344a)) {
                throw new InvalidParameterException(str + " not equal " + bVar.f344a + "; 没有正确的调用end结束或在调用start后才启用");
            }
            StringBuilder sb2 = new StringBuilder();
            a(sb2, jNanoTime - bVar.f345b);
            if (str3 != null) {
                sb2.append(str3);
            }
            if (str2 == null) {
                str2 = "RunSpeedTracker";
            }
            s3.b.b(str2, bVar.f344a + ": " + ((Object) sb2));
        }
    }

    public static void d(String str) {
        if (f342b) {
            b bVar = new b(str);
            ((Stack) f343c.get()).add(bVar);
            bVar.f345b = System.nanoTime();
        }
    }
}
