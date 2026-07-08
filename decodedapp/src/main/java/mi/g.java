package mi;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public interface g {

    public static class a {
        public static g a() {
            return ni.a.a() ? ni.a.b().f22963a : new b();
        }
    }

    public static class b implements g {
        @Override // mi.g
        public void a(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // mi.g
        public void b(Level level, String str, Throwable th2) {
            System.out.println("[" + level + "] " + str);
            th2.printStackTrace(System.out);
        }
    }

    void a(Level level, String str);

    void b(Level level, String str, Throwable th2);
}
