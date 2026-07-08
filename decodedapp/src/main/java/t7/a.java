package t7;

import android.content.Context;
import android.os.Looper;
import java.util.Set;
import t7.g;
import v7.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0384a f27569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f27570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27571c;

    /* JADX INFO: renamed from: t7.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0384a extends e {
        public f a(Context context, Looper looper, v7.e eVar, Object obj, g.a aVar, g.b bVar) {
            return b(context, looper, eVar, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, v7.e eVar, Object obj, u7.d dVar, u7.m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final C0385a f27572o = new C0385a(null);

        /* JADX INFO: renamed from: t7.a$d$a, reason: collision with other inner class name */
        public static final class C0385a implements d {
            /* synthetic */ C0385a(m mVar) {
            }
        }
    }

    public static abstract class e {
    }

    public interface f extends b {
        void a();

        boolean b();

        Set d();

        void e(c.e eVar);

        void f(String str);

        void g(c.InterfaceC0406c interfaceC0406c);

        boolean h();

        String i();

        boolean j();

        int k();

        void l(v7.k kVar, Set set);

        s7.c[] m();

        String n();

        boolean o();
    }

    public static final class g extends c {
    }

    public a(String str, AbstractC0384a abstractC0384a, g gVar) {
        v7.q.j(abstractC0384a, "Cannot construct an Api with a null ClientBuilder");
        v7.q.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.f27571c = str;
        this.f27569a = abstractC0384a;
        this.f27570b = gVar;
    }

    public final AbstractC0384a a() {
        return this.f27569a;
    }

    public final c b() {
        return this.f27570b;
    }

    public final String c() {
        return this.f27571c;
    }
}
