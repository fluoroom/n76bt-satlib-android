package o6;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends ConcurrentHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f23241b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23242a;

    private g() {
        super(180, 0.8f, 4);
        this.f23242a = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f23242a) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } finally {
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
