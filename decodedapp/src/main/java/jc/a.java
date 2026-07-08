package jc;

import android.os.Handler;
import android.os.Looper;
import hc.j;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f18628a = ic.a.d(new CallableC0239a());

    /* JADX INFO: renamed from: jc.a$a, reason: collision with other inner class name */
    static class CallableC0239a implements Callable {
        CallableC0239a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j call() {
            return b.f18629a;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j f18629a = new jc.b(new Handler(Looper.getMainLooper()), false);
    }

    public static j a() {
        return ic.a.e(f18628a);
    }
}
